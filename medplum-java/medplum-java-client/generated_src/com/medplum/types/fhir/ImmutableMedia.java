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
 * Immutable implementation of {@link Media}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedia.builder()}.
 */
@Generated(from = "Media", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedia implements Media {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final @Nullable Period createdPeriod;
  private final @Nullable Decimal duration;
  private final @Nullable Reference subject;
  private final @Nullable CodeableConcept modality;
  private final @Nullable PositiveInt height;
  private final Attachment content;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept bodySite;
  private final @Nullable Narrative text;
  private final @Nullable Instant issued;
  private final @Nullable Reference operator;
  private final @Nullable PositiveInt frames;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept type;
  private final @Nullable Meta meta;
  private final @Nullable String createdDateTime;
  private final @Nullable Reference device;
  private final @Nullable PositiveInt width;
  private final @Nullable Code status;
  private final @Nullable Code language;
  private final @Nullable List<Reference> partOf;
  private final @Nullable Reference encounter;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable String deviceName;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable CodeableConcept view;
  private final String resourceType;

  private ImmutableMedia(
      @Nullable List<Extension> extension,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      @Nullable Period createdPeriod,
      @Nullable Decimal duration,
      @Nullable Reference subject,
      @Nullable CodeableConcept modality,
      @Nullable PositiveInt height,
      Attachment content,
      @Nullable List<Annotation> note,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept bodySite,
      @Nullable Narrative text,
      @Nullable Instant issued,
      @Nullable Reference operator,
      @Nullable PositiveInt frames,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept type,
      @Nullable Meta meta,
      @Nullable String createdDateTime,
      @Nullable Reference device,
      @Nullable PositiveInt width,
      @Nullable Code status,
      @Nullable Code language,
      @Nullable List<Reference> partOf,
      @Nullable Reference encounter,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable String deviceName,
      @Nullable List<Reference> basedOn,
      @Nullable CodeableConcept view,
      String resourceType) {
    this.extension = extension;
    this.identifier = identifier;
    this.id = id;
    this.createdPeriod = createdPeriod;
    this.duration = duration;
    this.subject = subject;
    this.modality = modality;
    this.height = height;
    this.content = content;
    this.note = note;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.bodySite = bodySite;
    this.text = text;
    this.issued = issued;
    this.operator = operator;
    this.frames = frames;
    this.implicitRules = implicitRules;
    this.type = type;
    this.meta = meta;
    this.createdDateTime = createdDateTime;
    this.device = device;
    this.width = width;
    this.status = status;
    this.language = language;
    this.partOf = partOf;
    this.encounter = encounter;
    this.reasonCode = reasonCode;
    this.deviceName = deviceName;
    this.basedOn = basedOn;
    this.view = view;
    this.resourceType = resourceType;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code createdPeriod} attribute
   */
  @JsonProperty("createdPeriod")
  @Override
  public Optional<Period> createdPeriod() {
    return Optional.ofNullable(createdPeriod);
  }

  /**
   * @return The value of the {@code duration} attribute
   */
  @JsonProperty("duration")
  @Override
  public Optional<Decimal> duration() {
    return Optional.ofNullable(duration);
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
   * @return The value of the {@code modality} attribute
   */
  @JsonProperty("modality")
  @Override
  public Optional<CodeableConcept> modality() {
    return Optional.ofNullable(modality);
  }

  /**
   * @return The value of the {@code height} attribute
   */
  @JsonProperty("height")
  @Override
  public Optional<PositiveInt> height() {
    return Optional.ofNullable(height);
  }

  /**
   * @return The value of the {@code content} attribute
   */
  @JsonProperty("content")
  @Override
  public Attachment content() {
    return content;
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<CodeableConcept> bodySite() {
    return Optional.ofNullable(bodySite);
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
   * @return The value of the {@code issued} attribute
   */
  @JsonProperty("issued")
  @Override
  public Optional<Instant> issued() {
    return Optional.ofNullable(issued);
  }

  /**
   * @return The value of the {@code operator} attribute
   */
  @JsonProperty("operator")
  @Override
  public Optional<Reference> operator() {
    return Optional.ofNullable(operator);
  }

  /**
   * @return The value of the {@code frames} attribute
   */
  @JsonProperty("frames")
  @Override
  public Optional<PositiveInt> frames() {
    return Optional.ofNullable(frames);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code createdDateTime} attribute
   */
  @JsonProperty("createdDateTime")
  @Override
  public Optional<String> createdDateTime() {
    return Optional.ofNullable(createdDateTime);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @JsonProperty("device")
  @Override
  public Optional<Reference> device() {
    return Optional.ofNullable(device);
  }

  /**
   * @return The value of the {@code width} attribute
   */
  @JsonProperty("width")
  @Override
  public Optional<PositiveInt> width() {
    return Optional.ofNullable(width);
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
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<List<Reference>> partOf() {
    return Optional.ofNullable(partOf);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code deviceName} attribute
   */
  @JsonProperty("deviceName")
  @Override
  public Optional<String> deviceName() {
    return Optional.ofNullable(deviceName);
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
   * @return The value of the {@code view} attribute
   */
  @JsonProperty("view")
  @Override
  public Optional<CodeableConcept> view() {
    return Optional.ofNullable(view);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedia(
        newValue,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedia(
        value,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        newValue,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedia(
        this.extension,
        value,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        newValue,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        value,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#createdPeriod() createdPeriod} attribute.
   * @param value The value for createdPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withCreatedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "createdPeriod");
    if (this.createdPeriod == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        newValue,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#createdPeriod() createdPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for createdPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withCreatedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.createdPeriod == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        value,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withDuration(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        newValue,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withDuration(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        value,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        newValue,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        value,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#modality() modality} attribute.
   * @param value The value for modality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withModality(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "modality");
    if (this.modality == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        newValue,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#modality() modality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withModality(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.modality == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        value,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#height() height} attribute.
   * @param value The value for height
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withHeight(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "height");
    if (this.height == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        newValue,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#height() height} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for height
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withHeight(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.height == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        value,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Media#content() content} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for content
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedia withContent(Attachment value) {
    if (this.content == value) return this;
    Attachment newValue = Objects.requireNonNull(value, "content");
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        newValue,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        newValue,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        value,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        newValue,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        value,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        newValue,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        value,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withBodySite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        newValue,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withBodySite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        value,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        newValue,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        value,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withIssued(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        newValue,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withIssued(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        value,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#operator() operator} attribute.
   * @param value The value for operator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withOperator(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "operator");
    if (this.operator == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        newValue,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#operator() operator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withOperator(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.operator == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        value,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#frames() frames} attribute.
   * @param value The value for frames
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withFrames(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "frames");
    if (this.frames == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        newValue,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#frames() frames} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frames
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withFrames(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.frames == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        value,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        newValue,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        value,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        newValue,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        value,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        newValue,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        value,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#createdDateTime() createdDateTime} attribute.
   * @param value The value for createdDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withCreatedDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "createdDateTime");
    if (Objects.equals(this.createdDateTime, newValue)) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        newValue,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#createdDateTime() createdDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for createdDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withCreatedDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.createdDateTime, value)) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        value,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withDevice(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        newValue,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withDevice(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        value,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#width() width} attribute.
   * @param value The value for width
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withWidth(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "width");
    if (this.width == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        newValue,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#width() width} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for width
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withWidth(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.width == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        value,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        newValue,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        value,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        newValue,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        value,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        newValue,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        value,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        newValue,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        value,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        newValue,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        value,
        this.deviceName,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#deviceName() deviceName} attribute.
   * @param value The value for deviceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withDeviceName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "deviceName");
    if (Objects.equals(this.deviceName, newValue)) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        newValue,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#deviceName() deviceName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withDeviceName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.deviceName, value)) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        value,
        this.basedOn,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        newValue,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        value,
        this.view,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#view() view} attribute.
   * @param value The value for view
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withView(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "view");
    if (this.view == newValue) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#view() view} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for view
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withView(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.view == value) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Media#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedia withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedia(
        this.extension,
        this.identifier,
        this.id,
        this.createdPeriod,
        this.duration,
        this.subject,
        this.modality,
        this.height,
        this.content,
        this.note,
        this.contained,
        this.modifierExtension,
        this.bodySite,
        this.text,
        this.issued,
        this.operator,
        this.frames,
        this.implicitRules,
        this.type,
        this.meta,
        this.createdDateTime,
        this.device,
        this.width,
        this.status,
        this.language,
        this.partOf,
        this.encounter,
        this.reasonCode,
        this.deviceName,
        this.basedOn,
        this.view,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedia} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedia
        && equalTo((ImmutableMedia) another);
  }

  private boolean equalTo(ImmutableMedia another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && Objects.equals(createdPeriod, another.createdPeriod)
        && Objects.equals(duration, another.duration)
        && Objects.equals(subject, another.subject)
        && Objects.equals(modality, another.modality)
        && Objects.equals(height, another.height)
        && content.equals(another.content)
        && Objects.equals(note, another.note)
        && Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(text, another.text)
        && Objects.equals(issued, another.issued)
        && Objects.equals(operator, another.operator)
        && Objects.equals(frames, another.frames)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(type, another.type)
        && Objects.equals(meta, another.meta)
        && Objects.equals(createdDateTime, another.createdDateTime)
        && Objects.equals(device, another.device)
        && Objects.equals(width, another.width)
        && Objects.equals(status, another.status)
        && Objects.equals(language, another.language)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(deviceName, another.deviceName)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(view, another.view)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code identifier}, {@code id}, {@code createdPeriod}, {@code duration}, {@code subject}, {@code modality}, {@code height}, {@code content}, {@code note}, {@code contained}, {@code modifierExtension}, {@code bodySite}, {@code text}, {@code issued}, {@code operator}, {@code frames}, {@code implicitRules}, {@code type}, {@code meta}, {@code createdDateTime}, {@code device}, {@code width}, {@code status}, {@code language}, {@code partOf}, {@code encounter}, {@code reasonCode}, {@code deviceName}, {@code basedOn}, {@code view}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(createdPeriod);
    h += (h << 5) + Objects.hashCode(duration);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(modality);
    h += (h << 5) + Objects.hashCode(height);
    h += (h << 5) + content.hashCode();
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(issued);
    h += (h << 5) + Objects.hashCode(operator);
    h += (h << 5) + Objects.hashCode(frames);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(createdDateTime);
    h += (h << 5) + Objects.hashCode(device);
    h += (h << 5) + Objects.hashCode(width);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(deviceName);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(view);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Media} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Media{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (createdPeriod != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("createdPeriod=").append(createdPeriod);
    }
    if (duration != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("duration=").append(duration);
    }
    if (subject != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (modality != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("modality=").append(modality);
    }
    if (height != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("height=").append(height);
    }
    if (builder.length() > 6) builder.append(", ");
    builder.append("content=").append(content);
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (issued != null) {
      builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (operator != null) {
      builder.append(", ");
      builder.append("operator=").append(operator);
    }
    if (frames != null) {
      builder.append(", ");
      builder.append("frames=").append(frames);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (createdDateTime != null) {
      builder.append(", ");
      builder.append("createdDateTime=").append(createdDateTime);
    }
    if (device != null) {
      builder.append(", ");
      builder.append("device=").append(device);
    }
    if (width != null) {
      builder.append(", ");
      builder.append("width=").append(width);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (deviceName != null) {
      builder.append(", ");
      builder.append("deviceName=").append(deviceName);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (view != null) {
      builder.append(", ");
      builder.append("view=").append(view);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Media", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Media {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Period> createdPeriod = Optional.empty();
    boolean createdPeriodIsSet;
    @Nullable Optional<Decimal> duration = Optional.empty();
    boolean durationIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<CodeableConcept> modality = Optional.empty();
    boolean modalityIsSet;
    @Nullable Optional<PositiveInt> height = Optional.empty();
    boolean heightIsSet;
    @Nullable Attachment content;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Instant> issued = Optional.empty();
    boolean issuedIsSet;
    @Nullable Optional<Reference> operator = Optional.empty();
    boolean operatorIsSet;
    @Nullable Optional<PositiveInt> frames = Optional.empty();
    boolean framesIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> createdDateTime = Optional.empty();
    boolean createdDateTimeIsSet;
    @Nullable Optional<Reference> device = Optional.empty();
    boolean deviceIsSet;
    @Nullable Optional<PositiveInt> width = Optional.empty();
    boolean widthIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<String> deviceName = Optional.empty();
    boolean deviceNameIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<CodeableConcept> view = Optional.empty();
    boolean viewIsSet;
    @Nullable String resourceType;
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
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("createdPeriod")
    public void setCreatedPeriod(Optional<Period> createdPeriod) {
      this.createdPeriod = createdPeriod;
      this.createdPeriodIsSet = true;
    }
    @JsonProperty("duration")
    public void setDuration(Optional<Decimal> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("modality")
    public void setModality(Optional<CodeableConcept> modality) {
      this.modality = modality;
      this.modalityIsSet = true;
    }
    @JsonProperty("height")
    public void setHeight(Optional<PositiveInt> height) {
      this.height = height;
      this.heightIsSet = true;
    }
    @JsonProperty("content")
    public void setContent(Attachment content) {
      this.content = content;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("issued")
    public void setIssued(Optional<Instant> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @JsonProperty("operator")
    public void setOperator(Optional<Reference> operator) {
      this.operator = operator;
      this.operatorIsSet = true;
    }
    @JsonProperty("frames")
    public void setFrames(Optional<PositiveInt> frames) {
      this.frames = frames;
      this.framesIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("createdDateTime")
    public void setCreatedDateTime(Optional<String> createdDateTime) {
      this.createdDateTime = createdDateTime;
      this.createdDateTimeIsSet = true;
    }
    @JsonProperty("device")
    public void setDevice(Optional<Reference> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @JsonProperty("width")
    public void setWidth(Optional<PositiveInt> width) {
      this.width = width;
      this.widthIsSet = true;
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
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("deviceName")
    public void setDeviceName(Optional<String> deviceName) {
      this.deviceName = deviceName;
      this.deviceNameIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("view")
    public void setView(Optional<CodeableConcept> view) {
      this.view = view;
      this.viewIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> createdPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> duration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> modality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> height() { throw new UnsupportedOperationException(); }
    @Override
    public Attachment content() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> issued() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> operator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> frames() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> createdDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> device() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> width() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> deviceName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> view() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedia fromJson(Json json) {
    ImmutableMedia.Builder builder = ((ImmutableMedia.Builder) ImmutableMedia.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.createdPeriodIsSet) {
      builder.createdPeriod(json.createdPeriod);
    }
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.modalityIsSet) {
      builder.modality(json.modality);
    }
    if (json.heightIsSet) {
      builder.height(json.height);
    }
    if (json.content != null) {
      builder.content(json.content);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.operatorIsSet) {
      builder.operator(json.operator);
    }
    if (json.framesIsSet) {
      builder.frames(json.frames);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.createdDateTimeIsSet) {
      builder.createdDateTime(json.createdDateTime);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.widthIsSet) {
      builder.width(json.width);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.deviceNameIsSet) {
      builder.deviceName(json.deviceName);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.viewIsSet) {
      builder.view(json.view);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableMedia) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Media} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Media instance
   */
  public static Media copyOf(Media instance) {
    if (instance instanceof ImmutableMedia) {
      return (ImmutableMedia) instance;
    }
    return ((ImmutableMedia.Builder) ImmutableMedia.builder())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .id(instance.id())
        .createdPeriod(instance.createdPeriod())
        .duration(instance.duration())
        .subject(instance.subject())
        .modality(instance.modality())
        .height(instance.height())
        .content(instance.content())
        .note(instance.note())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .bodySite(instance.bodySite())
        .text(instance.text())
        .issued(instance.issued())
        .operator(instance.operator())
        .frames(instance.frames())
        .implicitRules(instance.implicitRules())
        .type(instance.type())
        .meta(instance.meta())
        .createdDateTime(instance.createdDateTime())
        .device(instance.device())
        .width(instance.width())
        .status(instance.status())
        .language(instance.language())
        .partOf(instance.partOf())
        .encounter(instance.encounter())
        .reasonCode(instance.reasonCode())
        .deviceName(instance.deviceName())
        .basedOn(instance.basedOn())
        .view(instance.view())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link Media Media}.
   * <pre>
   * ImmutableMedia.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Media#extension() extension}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Media#identifier() identifier}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Media#id() id}
   *    .createdPeriod(com.medplum.types.fhir.Period) // optional {@link Media#createdPeriod() createdPeriod}
   *    .duration(com.medplum.types.fhir.Decimal) // optional {@link Media#duration() duration}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link Media#subject() subject}
   *    .modality(com.medplum.types.fhir.CodeableConcept) // optional {@link Media#modality() modality}
   *    .height(com.medplum.types.fhir.PositiveInt) // optional {@link Media#height() height}
   *    .content(com.medplum.types.fhir.Attachment) // required {@link Media#content() content}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link Media#note() note}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Media#contained() contained}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Media#modifierExtension() modifierExtension}
   *    .bodySite(com.medplum.types.fhir.CodeableConcept) // optional {@link Media#bodySite() bodySite}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Media#text() text}
   *    .issued(com.medplum.types.fhir.Instant) // optional {@link Media#issued() issued}
   *    .operator(com.medplum.types.fhir.Reference) // optional {@link Media#operator() operator}
   *    .frames(com.medplum.types.fhir.PositiveInt) // optional {@link Media#frames() frames}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Media#implicitRules() implicitRules}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link Media#type() type}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Media#meta() meta}
   *    .createdDateTime(String) // optional {@link Media#createdDateTime() createdDateTime}
   *    .device(com.medplum.types.fhir.Reference) // optional {@link Media#device() device}
   *    .width(com.medplum.types.fhir.PositiveInt) // optional {@link Media#width() width}
   *    .status(com.medplum.types.fhir.Code) // optional {@link Media#status() status}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Media#language() language}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Media#partOf() partOf}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link Media#encounter() encounter}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Media#reasonCode() reasonCode}
   *    .deviceName(String) // optional {@link Media#deviceName() deviceName}
   *    .basedOn(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Media#basedOn() basedOn}
   *    .view(com.medplum.types.fhir.CodeableConcept) // optional {@link Media#view() view}
   *    .resourceType(String) // required {@link Media#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new Media builder
   */
  public static ContentBuildStage builder() {
    return new ImmutableMedia.Builder();
  }

  /**
   * Builds instances of type {@link Media Media}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Media", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ContentBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_CONTENT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_CREATED_PERIOD = 0x8L;
    private static final long OPT_BIT_DURATION = 0x10L;
    private static final long OPT_BIT_SUBJECT = 0x20L;
    private static final long OPT_BIT_MODALITY = 0x40L;
    private static final long OPT_BIT_HEIGHT = 0x80L;
    private static final long OPT_BIT_NOTE = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_BODY_SITE = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_ISSUED = 0x2000L;
    private static final long OPT_BIT_OPERATOR = 0x4000L;
    private static final long OPT_BIT_FRAMES = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private static final long OPT_BIT_TYPE = 0x20000L;
    private static final long OPT_BIT_META = 0x40000L;
    private static final long OPT_BIT_CREATED_DATE_TIME = 0x80000L;
    private static final long OPT_BIT_DEVICE = 0x100000L;
    private static final long OPT_BIT_WIDTH = 0x200000L;
    private static final long OPT_BIT_STATUS = 0x400000L;
    private static final long OPT_BIT_LANGUAGE = 0x800000L;
    private static final long OPT_BIT_PART_OF = 0x1000000L;
    private static final long OPT_BIT_ENCOUNTER = 0x2000000L;
    private static final long OPT_BIT_REASON_CODE = 0x4000000L;
    private static final long OPT_BIT_DEVICE_NAME = 0x8000000L;
    private static final long OPT_BIT_BASED_ON = 0x10000000L;
    private static final long OPT_BIT_VIEW = 0x20000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private @Nullable Period createdPeriod;
    private @Nullable Decimal duration;
    private @Nullable Reference subject;
    private @Nullable CodeableConcept modality;
    private @Nullable PositiveInt height;
    private @Nullable Attachment content;
    private @Nullable List<Annotation> note;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept bodySite;
    private @Nullable Narrative text;
    private @Nullable Instant issued;
    private @Nullable Reference operator;
    private @Nullable PositiveInt frames;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept type;
    private @Nullable Meta meta;
    private @Nullable String createdDateTime;
    private @Nullable Reference device;
    private @Nullable PositiveInt width;
    private @Nullable Code status;
    private @Nullable Code language;
    private @Nullable List<Reference> partOf;
    private @Nullable Reference encounter;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable String deviceName;
    private @Nullable List<Reference> basedOn;
    private @Nullable CodeableConcept view;
    private @Nullable String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Media#extension() extension} to extension.
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
     * Initializes the optional value {@link Media#extension() extension} to extension.
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
     * Initializes the optional value {@link Media#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Media#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Media#id() id} to id.
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
     * Initializes the optional value {@link Media#id() id} to id.
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
     * Initializes the optional value {@link Media#createdPeriod() createdPeriod} to createdPeriod.
     * @param createdPeriod The value for createdPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder createdPeriod(Period createdPeriod) {
      checkNotIsSet(createdPeriodIsSet(), "createdPeriod");
      this.createdPeriod = Objects.requireNonNull(createdPeriod, "createdPeriod");
      optBits |= OPT_BIT_CREATED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#createdPeriod() createdPeriod} to createdPeriod.
     * @param createdPeriod The value for createdPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdPeriod")
    public final Builder createdPeriod(Optional<? extends Period> createdPeriod) {
      checkNotIsSet(createdPeriodIsSet(), "createdPeriod");
      this.createdPeriod = createdPeriod.orElse(null);
      optBits |= OPT_BIT_CREATED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(Decimal duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("duration")
    public final Builder duration(Optional<? extends Decimal> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#subject() subject} to subject.
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
     * Initializes the optional value {@link Media#subject() subject} to subject.
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
     * Initializes the optional value {@link Media#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for chained invocation
     */
    public final Builder modality(CodeableConcept modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = Objects.requireNonNull(modality, "modality");
      optBits |= OPT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modality")
    public final Builder modality(Optional<? extends CodeableConcept> modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = modality.orElse(null);
      optBits |= OPT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for chained invocation
     */
    public final Builder height(PositiveInt height) {
      checkNotIsSet(heightIsSet(), "height");
      this.height = Objects.requireNonNull(height, "height");
      optBits |= OPT_BIT_HEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("height")
    public final Builder height(Optional<? extends PositiveInt> height) {
      checkNotIsSet(heightIsSet(), "height");
      this.height = height.orElse(null);
      optBits |= OPT_BIT_HEIGHT;
      return this;
    }

    /**
     * Initializes the value for the {@link Media#content() content} attribute.
     * @param content The value for content 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("content")
    public final Builder content(Attachment content) {
      checkNotIsSet(contentIsSet(), "content");
      this.content = Objects.requireNonNull(content, "content");
      initBits &= ~INIT_BIT_CONTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#note() note} to note.
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
     * Initializes the optional value {@link Media#note() note} to note.
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
     * Initializes the optional value {@link Media#contained() contained} to contained.
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
     * Initializes the optional value {@link Media#contained() contained} to contained.
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
     * Initializes the optional value {@link Media#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Media#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Media#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link Media#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link Media#text() text} to text.
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
     * Initializes the optional value {@link Media#text() text} to text.
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
     * Initializes the optional value {@link Media#issued() issued} to issued.
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
     * Initializes the optional value {@link Media#issued() issued} to issued.
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
     * Initializes the optional value {@link Media#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for chained invocation
     */
    public final Builder operator(Reference operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = Objects.requireNonNull(operator, "operator");
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operator")
    public final Builder operator(Optional<? extends Reference> operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = operator.orElse(null);
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#frames() frames} to frames.
     * @param frames The value for frames
     * @return {@code this} builder for chained invocation
     */
    public final Builder frames(PositiveInt frames) {
      checkNotIsSet(framesIsSet(), "frames");
      this.frames = Objects.requireNonNull(frames, "frames");
      optBits |= OPT_BIT_FRAMES;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#frames() frames} to frames.
     * @param frames The value for frames
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("frames")
    public final Builder frames(Optional<? extends PositiveInt> frames) {
      checkNotIsSet(framesIsSet(), "frames");
      this.frames = frames.orElse(null);
      optBits |= OPT_BIT_FRAMES;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Media#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Media#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#meta() meta} to meta.
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
     * Initializes the optional value {@link Media#meta() meta} to meta.
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
     * Initializes the optional value {@link Media#createdDateTime() createdDateTime} to createdDateTime.
     * @param createdDateTime The value for createdDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder createdDateTime(String createdDateTime) {
      checkNotIsSet(createdDateTimeIsSet(), "createdDateTime");
      this.createdDateTime = Objects.requireNonNull(createdDateTime, "createdDateTime");
      optBits |= OPT_BIT_CREATED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#createdDateTime() createdDateTime} to createdDateTime.
     * @param createdDateTime The value for createdDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("createdDateTime")
    public final Builder createdDateTime(Optional<String> createdDateTime) {
      checkNotIsSet(createdDateTimeIsSet(), "createdDateTime");
      this.createdDateTime = createdDateTime.orElse(null);
      optBits |= OPT_BIT_CREATED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(Reference device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("device")
    public final Builder device(Optional<? extends Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for chained invocation
     */
    public final Builder width(PositiveInt width) {
      checkNotIsSet(widthIsSet(), "width");
      this.width = Objects.requireNonNull(width, "width");
      optBits |= OPT_BIT_WIDTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("width")
    public final Builder width(Optional<? extends PositiveInt> width) {
      checkNotIsSet(widthIsSet(), "width");
      this.width = width.orElse(null);
      optBits |= OPT_BIT_WIDTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#status() status} to status.
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
     * Initializes the optional value {@link Media#status() status} to status.
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
     * Initializes the optional value {@link Media#language() language} to language.
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
     * Initializes the optional value {@link Media#language() language} to language.
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
     * Initializes the optional value {@link Media#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Media#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Media#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Media#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Media#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Media#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Media#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceName(String deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = Objects.requireNonNull(deviceName, "deviceName");
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deviceName")
    public final Builder deviceName(Optional<String> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = deviceName.orElse(null);
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Media#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Media#view() view} to view.
     * @param view The value for view
     * @return {@code this} builder for chained invocation
     */
    public final Builder view(CodeableConcept view) {
      checkNotIsSet(viewIsSet(), "view");
      this.view = Objects.requireNonNull(view, "view");
      optBits |= OPT_BIT_VIEW;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#view() view} to view.
     * @param view The value for view
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("view")
    public final Builder view(Optional<? extends CodeableConcept> view) {
      checkNotIsSet(viewIsSet(), "view");
      this.view = view.orElse(null);
      optBits |= OPT_BIT_VIEW;
      return this;
    }

    /**
     * Initializes the value for the {@link Media#resourceType() resourceType} attribute.
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
     * Builds a new {@link Media Media}.
     * @return An immutable instance of Media
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Media build() {
      checkRequiredAttributes();
      return new ImmutableMedia(
          extension,
          identifier,
          id,
          createdPeriod,
          duration,
          subject,
          modality,
          height,
          content,
          note,
          contained,
          modifierExtension,
          bodySite,
          text,
          issued,
          operator,
          frames,
          implicitRules,
          type,
          meta,
          createdDateTime,
          device,
          width,
          status,
          language,
          partOf,
          encounter,
          reasonCode,
          deviceName,
          basedOn,
          view,
          resourceType);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean createdPeriodIsSet() {
      return (optBits & OPT_BIT_CREATED_PERIOD) != 0;
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean modalityIsSet() {
      return (optBits & OPT_BIT_MODALITY) != 0;
    }

    private boolean heightIsSet() {
      return (optBits & OPT_BIT_HEIGHT) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean operatorIsSet() {
      return (optBits & OPT_BIT_OPERATOR) != 0;
    }

    private boolean framesIsSet() {
      return (optBits & OPT_BIT_FRAMES) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean createdDateTimeIsSet() {
      return (optBits & OPT_BIT_CREATED_DATE_TIME) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean widthIsSet() {
      return (optBits & OPT_BIT_WIDTH) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean deviceNameIsSet() {
      return (optBits & OPT_BIT_DEVICE_NAME) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean viewIsSet() {
      return (optBits & OPT_BIT_VIEW) != 0;
    }

    private boolean contentIsSet() {
      return (initBits & INIT_BIT_CONTENT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Media is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!contentIsSet()) attributes.add("content");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Media, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Media", generator = "Immutables")
  public interface ContentBuildStage {
    /**
     * Initializes the value for the {@link Media#content() content} attribute.
     * @param content The value for content 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage content(Attachment content);
  }

  @Generated(from = "Media", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Media#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Media", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Media#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Media#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Media#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Media#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Media#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Media#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Media#createdPeriod() createdPeriod} to createdPeriod.
     * @param createdPeriod The value for createdPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal createdPeriod(Period createdPeriod);

    /**
     * Initializes the optional value {@link Media#createdPeriod() createdPeriod} to createdPeriod.
     * @param createdPeriod The value for createdPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal createdPeriod(Optional<? extends Period> createdPeriod);

    /**
     * Initializes the optional value {@link Media#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal duration(Decimal duration);

    /**
     * Initializes the optional value {@link Media#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal duration(Optional<? extends Decimal> duration);

    /**
     * Initializes the optional value {@link Media#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link Media#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link Media#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modality(CodeableConcept modality);

    /**
     * Initializes the optional value {@link Media#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modality(Optional<? extends CodeableConcept> modality);

    /**
     * Initializes the optional value {@link Media#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for chained invocation
     */
    BuildFinal height(PositiveInt height);

    /**
     * Initializes the optional value {@link Media#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal height(Optional<? extends PositiveInt> height);

    /**
     * Initializes the optional value {@link Media#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Media#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Media#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Media#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Media#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Media#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Media#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link Media#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link Media#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Media#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Media#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(Instant issued);

    /**
     * Initializes the optional value {@link Media#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(Optional<? extends Instant> issued);

    /**
     * Initializes the optional value {@link Media#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal operator(Reference operator);

    /**
     * Initializes the optional value {@link Media#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal operator(Optional<? extends Reference> operator);

    /**
     * Initializes the optional value {@link Media#frames() frames} to frames.
     * @param frames The value for frames
     * @return {@code this} builder for chained invocation
     */
    BuildFinal frames(PositiveInt frames);

    /**
     * Initializes the optional value {@link Media#frames() frames} to frames.
     * @param frames The value for frames
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal frames(Optional<? extends PositiveInt> frames);

    /**
     * Initializes the optional value {@link Media#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Media#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Media#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link Media#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link Media#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Media#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Media#createdDateTime() createdDateTime} to createdDateTime.
     * @param createdDateTime The value for createdDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal createdDateTime(String createdDateTime);

    /**
     * Initializes the optional value {@link Media#createdDateTime() createdDateTime} to createdDateTime.
     * @param createdDateTime The value for createdDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal createdDateTime(Optional<String> createdDateTime);

    /**
     * Initializes the optional value {@link Media#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(Reference device);

    /**
     * Initializes the optional value {@link Media#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(Optional<? extends Reference> device);

    /**
     * Initializes the optional value {@link Media#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for chained invocation
     */
    BuildFinal width(PositiveInt width);

    /**
     * Initializes the optional value {@link Media#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal width(Optional<? extends PositiveInt> width);

    /**
     * Initializes the optional value {@link Media#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link Media#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link Media#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Media#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Media#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link Media#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link Media#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link Media#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link Media#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Media#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Media#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deviceName(String deviceName);

    /**
     * Initializes the optional value {@link Media#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deviceName(Optional<String> deviceName);

    /**
     * Initializes the optional value {@link Media#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link Media#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link Media#view() view} to view.
     * @param view The value for view
     * @return {@code this} builder for chained invocation
     */
    BuildFinal view(CodeableConcept view);

    /**
     * Initializes the optional value {@link Media#view() view} to view.
     * @param view The value for view
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal view(Optional<? extends CodeableConcept> view);

    /**
     * Builds a new {@link Media Media}.
     * @return An immutable instance of Media
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Media build();
  }
}