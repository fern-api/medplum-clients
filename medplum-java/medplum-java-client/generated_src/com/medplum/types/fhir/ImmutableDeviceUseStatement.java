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
 * Immutable implementation of {@link DeviceUseStatement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceUseStatement.builder()}.
 */
@Generated(from = "DeviceUseStatement", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceUseStatement implements DeviceUseStatement {
  private final @Nullable List<Annotation> note;
  private final Reference subject;
  private final @Nullable Reference source;
  private final @Nullable CodeableConcept bodySite;
  private final @Nullable DateTime recordedOn;
  private final @Nullable DeviceusestatementStatus status;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Uri implicitRules;
  private final @Nullable Meta meta;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<Reference> derivedFrom;
  private final Reference device;
  private final @Nullable Timing timingTiming;
  private final @Nullable Narrative text;
  private final @Nullable Period timingPeriod;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable Id id;
  private final @Nullable String timingDateTime;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Code language;
  private final String resourceType;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> basedOn;

  private ImmutableDeviceUseStatement(
      @Nullable List<Annotation> note,
      Reference subject,
      @Nullable Reference source,
      @Nullable CodeableConcept bodySite,
      @Nullable DateTime recordedOn,
      @Nullable DeviceusestatementStatus status,
      @Nullable List<Extension> extension,
      @Nullable List<Identifier> identifier,
      @Nullable Uri implicitRules,
      @Nullable Meta meta,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<Reference> derivedFrom,
      Reference device,
      @Nullable Timing timingTiming,
      @Nullable Narrative text,
      @Nullable Period timingPeriod,
      @Nullable List<Reference> reasonReference,
      @Nullable Id id,
      @Nullable String timingDateTime,
      @Nullable List<ResourceList> contained,
      @Nullable Code language,
      String resourceType,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> basedOn) {
    this.note = note;
    this.subject = subject;
    this.source = source;
    this.bodySite = bodySite;
    this.recordedOn = recordedOn;
    this.status = status;
    this.extension = extension;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.reasonCode = reasonCode;
    this.derivedFrom = derivedFrom;
    this.device = device;
    this.timingTiming = timingTiming;
    this.text = text;
    this.timingPeriod = timingPeriod;
    this.reasonReference = reasonReference;
    this.id = id;
    this.timingDateTime = timingDateTime;
    this.contained = contained;
    this.language = language;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
    this.basedOn = basedOn;
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<Reference> source() {
    return Optional.ofNullable(source);
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
   * @return The value of the {@code recordedOn} attribute
   */
  @JsonProperty("recordedOn")
  @Override
  public Optional<DateTime> recordedOn() {
    return Optional.ofNullable(recordedOn);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<DeviceusestatementStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code derivedFrom} attribute
   */
  @JsonProperty("derivedFrom")
  @Override
  public Optional<List<Reference>> derivedFrom() {
    return Optional.ofNullable(derivedFrom);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @JsonProperty("device")
  @Override
  public Reference device() {
    return device;
  }

  /**
   * @return The value of the {@code timingTiming} attribute
   */
  @JsonProperty("timingTiming")
  @Override
  public Optional<Timing> timingTiming() {
    return Optional.ofNullable(timingTiming);
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
   * @return The value of the {@code timingPeriod} attribute
   */
  @JsonProperty("timingPeriod")
  @Override
  public Optional<Period> timingPeriod() {
    return Optional.ofNullable(timingPeriod);
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
   * @return The value of the {@code timingDateTime} attribute
   */
  @JsonProperty("timingDateTime")
  @Override
  public Optional<String> timingDateTime() {
    return Optional.ofNullable(timingDateTime);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableDeviceUseStatement(
        newValue,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableDeviceUseStatement(
        value,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceUseStatement#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceUseStatement withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableDeviceUseStatement(
        this.note,
        newValue,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withSource(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        newValue,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withSource(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        value,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withBodySite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        newValue,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withBodySite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        value,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#recordedOn() recordedOn} attribute.
   * @param value The value for recordedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withRecordedOn(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "recordedOn");
    if (this.recordedOn == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        newValue,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#recordedOn() recordedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recordedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withRecordedOn(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.recordedOn == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        value,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withStatus(DeviceusestatementStatus value) {
    @Nullable DeviceusestatementStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        newValue,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withStatus(Optional<? extends DeviceusestatementStatus> optional) {
    @Nullable DeviceusestatementStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        value,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        newValue,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        value,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        newValue,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        value,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        newValue,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        value,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        newValue,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        value,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        newValue,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        value,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withDerivedFrom(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        newValue,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withDerivedFrom(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        value,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceUseStatement#device() device} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for device
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceUseStatement withDevice(Reference value) {
    if (this.device == value) return this;
    Reference newValue = Objects.requireNonNull(value, "device");
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        newValue,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#timingTiming() timingTiming} attribute.
   * @param value The value for timingTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withTimingTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "timingTiming");
    if (this.timingTiming == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        newValue,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#timingTiming() timingTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withTimingTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.timingTiming == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        value,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        newValue,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        value,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withTimingPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        newValue,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withTimingPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        value,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        newValue,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        value,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        newValue,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        value,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#timingDateTime() timingDateTime} attribute.
   * @param value The value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withTimingDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timingDateTime");
    if (Objects.equals(this.timingDateTime, newValue)) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        newValue,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#timingDateTime() timingDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withTimingDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timingDateTime, value)) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        value,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        newValue,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        value,
        this.language,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        newValue,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        value,
        this.resourceType,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceUseStatement#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceUseStatement withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        newValue,
        this.modifierExtension,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        newValue,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        value,
        this.basedOn);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableDeviceUseStatement(
        this.note,
        this.subject,
        this.source,
        this.bodySite,
        this.recordedOn,
        this.status,
        this.extension,
        this.identifier,
        this.implicitRules,
        this.meta,
        this.reasonCode,
        this.derivedFrom,
        this.device,
        this.timingTiming,
        this.text,
        this.timingPeriod,
        this.reasonReference,
        this.id,
        this.timingDateTime,
        this.contained,
        this.language,
        this.resourceType,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceUseStatement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceUseStatement
        && equalTo((ImmutableDeviceUseStatement) another);
  }

  private boolean equalTo(ImmutableDeviceUseStatement another) {
    return Objects.equals(note, another.note)
        && subject.equals(another.subject)
        && Objects.equals(source, another.source)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(recordedOn, another.recordedOn)
        && Objects.equals(status, another.status)
        && Objects.equals(extension, another.extension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(meta, another.meta)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(derivedFrom, another.derivedFrom)
        && device.equals(another.device)
        && Objects.equals(timingTiming, another.timingTiming)
        && Objects.equals(text, another.text)
        && Objects.equals(timingPeriod, another.timingPeriod)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(id, another.id)
        && Objects.equals(timingDateTime, another.timingDateTime)
        && Objects.equals(contained, another.contained)
        && Objects.equals(language, another.language)
        && resourceType.equals(another.resourceType)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(basedOn, another.basedOn);
  }

  /**
   * Computes a hash code from attributes: {@code note}, {@code subject}, {@code source}, {@code bodySite}, {@code recordedOn}, {@code status}, {@code extension}, {@code identifier}, {@code implicitRules}, {@code meta}, {@code reasonCode}, {@code derivedFrom}, {@code device}, {@code timingTiming}, {@code text}, {@code timingPeriod}, {@code reasonReference}, {@code id}, {@code timingDateTime}, {@code contained}, {@code language}, {@code resourceType}, {@code modifierExtension}, {@code basedOn}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(recordedOn);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(derivedFrom);
    h += (h << 5) + device.hashCode();
    h += (h << 5) + Objects.hashCode(timingTiming);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(timingPeriod);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(timingDateTime);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(basedOn);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceUseStatement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceUseStatement{");
    if (note != null) {
      builder.append("note=").append(note);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("subject=").append(subject);
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (recordedOn != null) {
      builder.append(", ");
      builder.append("recordedOn=").append(recordedOn);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
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
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (derivedFrom != null) {
      builder.append(", ");
      builder.append("derivedFrom=").append(derivedFrom);
    }
    builder.append(", ");
    builder.append("device=").append(device);
    if (timingTiming != null) {
      builder.append(", ");
      builder.append("timingTiming=").append(timingTiming);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (timingPeriod != null) {
      builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (timingDateTime != null) {
      builder.append(", ");
      builder.append("timingDateTime=").append(timingDateTime);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceUseStatement", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceUseStatement {
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Reference subject;
    @Nullable Optional<Reference> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<CodeableConcept> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<DateTime> recordedOn = Optional.empty();
    boolean recordedOnIsSet;
    @Nullable Optional<DeviceusestatementStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<Reference>> derivedFrom = Optional.empty();
    boolean derivedFromIsSet;
    @Nullable Reference device;
    @Nullable Optional<Timing> timingTiming = Optional.empty();
    boolean timingTimingIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Period> timingPeriod = Optional.empty();
    boolean timingPeriodIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> timingDateTime = Optional.empty();
    boolean timingDateTimeIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("source")
    public void setSource(Optional<Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("recordedOn")
    public void setRecordedOn(Optional<DateTime> recordedOn) {
      this.recordedOn = recordedOn;
      this.recordedOnIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<DeviceusestatementStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("derivedFrom")
    public void setDerivedFrom(Optional<List<Reference>> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @JsonProperty("device")
    public void setDevice(Reference device) {
      this.device = device;
    }
    @JsonProperty("timingTiming")
    public void setTimingTiming(Optional<Timing> timingTiming) {
      this.timingTiming = timingTiming;
      this.timingTimingIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Optional<Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
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
    @JsonProperty("timingDateTime")
    public void setTimingDateTime(Optional<String> timingDateTime) {
      this.timingDateTime = timingDateTime;
      this.timingDateTimeIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
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
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> recordedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DeviceusestatementStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> derivedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public Reference device() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> timingTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timingDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceUseStatement fromJson(Json json) {
    ImmutableDeviceUseStatement.Builder builder = ((ImmutableDeviceUseStatement.Builder) ImmutableDeviceUseStatement.builder());
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.recordedOnIsSet) {
      builder.recordedOn(json.recordedOn);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
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
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.device != null) {
      builder.device(json.device);
    }
    if (json.timingTimingIsSet) {
      builder.timingTiming(json.timingTiming);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.timingDateTimeIsSet) {
      builder.timingDateTime(json.timingDateTime);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    return (ImmutableDeviceUseStatement) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceUseStatement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceUseStatement instance
   */
  public static DeviceUseStatement copyOf(DeviceUseStatement instance) {
    if (instance instanceof ImmutableDeviceUseStatement) {
      return (ImmutableDeviceUseStatement) instance;
    }
    return ((ImmutableDeviceUseStatement.Builder) ImmutableDeviceUseStatement.builder())
        .note(instance.note())
        .subject(instance.subject())
        .source(instance.source())
        .bodySite(instance.bodySite())
        .recordedOn(instance.recordedOn())
        .status(instance.status())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .reasonCode(instance.reasonCode())
        .derivedFrom(instance.derivedFrom())
        .device(instance.device())
        .timingTiming(instance.timingTiming())
        .text(instance.text())
        .timingPeriod(instance.timingPeriod())
        .reasonReference(instance.reasonReference())
        .id(instance.id())
        .timingDateTime(instance.timingDateTime())
        .contained(instance.contained())
        .language(instance.language())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .basedOn(instance.basedOn())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceUseStatement DeviceUseStatement}.
   * <pre>
   * ImmutableDeviceUseStatement.builder()
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link DeviceUseStatement#note() note}
   *    .subject(com.medplum.types.fhir.Reference) // required {@link DeviceUseStatement#subject() subject}
   *    .source(com.medplum.types.fhir.Reference) // optional {@link DeviceUseStatement#source() source}
   *    .bodySite(com.medplum.types.fhir.CodeableConcept) // optional {@link DeviceUseStatement#bodySite() bodySite}
   *    .recordedOn(com.medplum.types.fhir.DateTime) // optional {@link DeviceUseStatement#recordedOn() recordedOn}
   *    .status(com.medplum.types.fhir.DeviceusestatementStatus) // optional {@link DeviceUseStatement#status() status}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DeviceUseStatement#extension() extension}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link DeviceUseStatement#identifier() identifier}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link DeviceUseStatement#implicitRules() implicitRules}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link DeviceUseStatement#meta() meta}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link DeviceUseStatement#reasonCode() reasonCode}
   *    .derivedFrom(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DeviceUseStatement#derivedFrom() derivedFrom}
   *    .device(com.medplum.types.fhir.Reference) // required {@link DeviceUseStatement#device() device}
   *    .timingTiming(com.medplum.types.fhir.Timing) // optional {@link DeviceUseStatement#timingTiming() timingTiming}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link DeviceUseStatement#text() text}
   *    .timingPeriod(com.medplum.types.fhir.Period) // optional {@link DeviceUseStatement#timingPeriod() timingPeriod}
   *    .reasonReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DeviceUseStatement#reasonReference() reasonReference}
   *    .id(com.medplum.types.fhir.Id) // optional {@link DeviceUseStatement#id() id}
   *    .timingDateTime(String) // optional {@link DeviceUseStatement#timingDateTime() timingDateTime}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link DeviceUseStatement#contained() contained}
   *    .language(com.medplum.types.fhir.Code) // optional {@link DeviceUseStatement#language() language}
   *    .resourceType(String) // required {@link DeviceUseStatement#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DeviceUseStatement#modifierExtension() modifierExtension}
   *    .basedOn(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DeviceUseStatement#basedOn() basedOn}
   *    .build();
   * </pre>
   * @return A new DeviceUseStatement builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableDeviceUseStatement.Builder();
  }

  /**
   * Builds instances of type {@link DeviceUseStatement DeviceUseStatement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DeviceUseStatement", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, DeviceBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_DEVICE = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_NOTE = 0x1L;
    private static final long OPT_BIT_SOURCE = 0x2L;
    private static final long OPT_BIT_BODY_SITE = 0x4L;
    private static final long OPT_BIT_RECORDED_ON = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_REASON_CODE = 0x200L;
    private static final long OPT_BIT_DERIVED_FROM = 0x400L;
    private static final long OPT_BIT_TIMING_TIMING = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x2000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x4000L;
    private static final long OPT_BIT_ID = 0x8000L;
    private static final long OPT_BIT_TIMING_DATE_TIME = 0x10000L;
    private static final long OPT_BIT_CONTAINED = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000L;
    private static final long OPT_BIT_BASED_ON = 0x100000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable List<Annotation> note;
    private @Nullable Reference subject;
    private @Nullable Reference source;
    private @Nullable CodeableConcept bodySite;
    private @Nullable DateTime recordedOn;
    private @Nullable DeviceusestatementStatus status;
    private @Nullable List<Extension> extension;
    private @Nullable List<Identifier> identifier;
    private @Nullable Uri implicitRules;
    private @Nullable Meta meta;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<Reference> derivedFrom;
    private @Nullable Reference device;
    private @Nullable Timing timingTiming;
    private @Nullable Narrative text;
    private @Nullable Period timingPeriod;
    private @Nullable List<Reference> reasonReference;
    private @Nullable Id id;
    private @Nullable String timingDateTime;
    private @Nullable List<ResourceList> contained;
    private @Nullable Code language;
    private @Nullable String resourceType;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> basedOn;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#note() note} to note.
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
     * Initializes the optional value {@link DeviceUseStatement#note() note} to note.
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
     * Initializes the value for the {@link DeviceUseStatement#subject() subject} attribute.
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
     * Initializes the optional value {@link DeviceUseStatement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(Reference source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link DeviceUseStatement#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link DeviceUseStatement#recordedOn() recordedOn} to recordedOn.
     * @param recordedOn The value for recordedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder recordedOn(DateTime recordedOn) {
      checkNotIsSet(recordedOnIsSet(), "recordedOn");
      this.recordedOn = Objects.requireNonNull(recordedOn, "recordedOn");
      optBits |= OPT_BIT_RECORDED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#recordedOn() recordedOn} to recordedOn.
     * @param recordedOn The value for recordedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recordedOn")
    public final Builder recordedOn(Optional<? extends DateTime> recordedOn) {
      checkNotIsSet(recordedOnIsSet(), "recordedOn");
      this.recordedOn = recordedOn.orElse(null);
      optBits |= OPT_BIT_RECORDED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(DeviceusestatementStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends DeviceusestatementStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceUseStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceUseStatement#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceUseStatement#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceUseStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceUseStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceUseStatement#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceUseStatement#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceUseStatement#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link DeviceUseStatement#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link DeviceUseStatement#derivedFrom() derivedFrom} to derivedFrom.
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
     * Initializes the optional value {@link DeviceUseStatement#derivedFrom() derivedFrom} to derivedFrom.
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
     * Initializes the value for the {@link DeviceUseStatement#device() device} attribute.
     * @param device The value for device 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("device")
    public final Builder device(Reference device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = Objects.requireNonNull(device, "device");
      initBits &= ~INIT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingTiming(Timing timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = Objects.requireNonNull(timingTiming, "timingTiming");
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingTiming")
    public final Builder timingTiming(Optional<? extends Timing> timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = timingTiming.orElse(null);
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#text() text} to text.
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
     * Initializes the optional value {@link DeviceUseStatement#text() text} to text.
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
     * Initializes the optional value {@link DeviceUseStatement#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingPeriod(Period timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = Objects.requireNonNull(timingPeriod, "timingPeriod");
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingPeriod")
    public final Builder timingPeriod(Optional<? extends Period> timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = timingPeriod.orElse(null);
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link DeviceUseStatement#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link DeviceUseStatement#id() id} to id.
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
     * Initializes the optional value {@link DeviceUseStatement#id() id} to id.
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
     * Initializes the optional value {@link DeviceUseStatement#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDateTime(String timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = Objects.requireNonNull(timingDateTime, "timingDateTime");
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingDateTime")
    public final Builder timingDateTime(Optional<String> timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = timingDateTime.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceUseStatement#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceUseStatement#language() language} to language.
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
     * Initializes the optional value {@link DeviceUseStatement#language() language} to language.
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
     * Initializes the value for the {@link DeviceUseStatement#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DeviceUseStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceUseStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceUseStatement#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DeviceUseStatement#basedOn() basedOn} to basedOn.
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
     * Builds a new {@link DeviceUseStatement DeviceUseStatement}.
     * @return An immutable instance of DeviceUseStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceUseStatement build() {
      checkRequiredAttributes();
      return new ImmutableDeviceUseStatement(
          note,
          subject,
          source,
          bodySite,
          recordedOn,
          status,
          extension,
          identifier,
          implicitRules,
          meta,
          reasonCode,
          derivedFrom,
          device,
          timingTiming,
          text,
          timingPeriod,
          reasonReference,
          id,
          timingDateTime,
          contained,
          language,
          resourceType,
          modifierExtension,
          basedOn);
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean recordedOnIsSet() {
      return (optBits & OPT_BIT_RECORDED_ON) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
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

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
    }

    private boolean timingTimingIsSet() {
      return (optBits & OPT_BIT_TIMING_TIMING) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean timingDateTimeIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE_TIME) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean deviceIsSet() {
      return (initBits & INIT_BIT_DEVICE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceUseStatement is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!deviceIsSet()) attributes.add("device");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DeviceUseStatement, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DeviceUseStatement", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link DeviceUseStatement#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    DeviceBuildStage subject(Reference subject);
  }

  @Generated(from = "DeviceUseStatement", generator = "Immutables")
  public interface DeviceBuildStage {
    /**
     * Initializes the value for the {@link DeviceUseStatement#device() device} attribute.
     * @param device The value for device 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage device(Reference device);
  }

  @Generated(from = "DeviceUseStatement", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceUseStatement#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "DeviceUseStatement", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceUseStatement#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link DeviceUseStatement#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link DeviceUseStatement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(Reference source);

    /**
     * Initializes the optional value {@link DeviceUseStatement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(Optional<? extends Reference> source);

    /**
     * Initializes the optional value {@link DeviceUseStatement#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link DeviceUseStatement#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link DeviceUseStatement#recordedOn() recordedOn} to recordedOn.
     * @param recordedOn The value for recordedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recordedOn(DateTime recordedOn);

    /**
     * Initializes the optional value {@link DeviceUseStatement#recordedOn() recordedOn} to recordedOn.
     * @param recordedOn The value for recordedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recordedOn(Optional<? extends DateTime> recordedOn);

    /**
     * Initializes the optional value {@link DeviceUseStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(DeviceusestatementStatus status);

    /**
     * Initializes the optional value {@link DeviceUseStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends DeviceusestatementStatus> status);

    /**
     * Initializes the optional value {@link DeviceUseStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DeviceUseStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DeviceUseStatement#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link DeviceUseStatement#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link DeviceUseStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link DeviceUseStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link DeviceUseStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link DeviceUseStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link DeviceUseStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(List<Reference> derivedFrom);

    /**
     * Initializes the optional value {@link DeviceUseStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(Optional<? extends List<Reference>> derivedFrom);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingTiming(Timing timingTiming);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingTiming(Optional<? extends Timing> timingTiming);

    /**
     * Initializes the optional value {@link DeviceUseStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link DeviceUseStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingPeriod(Period timingPeriod);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingPeriod(Optional<? extends Period> timingPeriod);

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link DeviceUseStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link DeviceUseStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingDateTime(String timingDateTime);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingDateTime(Optional<String> timingDateTime);

    /**
     * Initializes the optional value {@link DeviceUseStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link DeviceUseStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link DeviceUseStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link DeviceUseStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link DeviceUseStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceUseStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceUseStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link DeviceUseStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Builds a new {@link DeviceUseStatement DeviceUseStatement}.
     * @return An immutable instance of DeviceUseStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceUseStatement build();
  }
}
