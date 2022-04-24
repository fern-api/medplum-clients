//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Media}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedia.builder()}.
 */
@org.immutables.value.Generated(from = "Media", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedia implements com.fhir.Media {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.lang.String deviceName;
  private final @javax.annotation.Nullable com.fhir.instant issued;
  private final @javax.annotation.Nullable com.fhir.Period createdPeriod;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.lang.String createdDateTime;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final com.fhir.Attachment content;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.positiveInt frames;
  private final @javax.annotation.Nullable com.fhir.Reference device;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept modality;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable com.fhir.positiveInt width;
  private final @javax.annotation.Nullable com.fhir.decimal duration;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept view;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.positiveInt height;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.Reference operator;

  private ImmutableMedia(
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.lang.String deviceName,
      @javax.annotation.Nullable com.fhir.instant issued,
      @javax.annotation.Nullable com.fhir.Period createdPeriod,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.lang.String createdDateTime,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Reference subject,
      com.fhir.Attachment content,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable com.fhir.CodeableConcept bodySite,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.positiveInt frames,
      @javax.annotation.Nullable com.fhir.Reference device,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CodeableConcept modality,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable com.fhir.positiveInt width,
      @javax.annotation.Nullable com.fhir.decimal duration,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.CodeableConcept view,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.positiveInt height,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.Reference operator) {
    this.contained = contained;
    this.deviceName = deviceName;
    this.issued = issued;
    this.createdPeriod = createdPeriod;
    this.id = id;
    this.note = note;
    this.createdDateTime = createdDateTime;
    this.resourceType = resourceType;
    this.subject = subject;
    this.content = content;
    this.language = language;
    this.basedOn = basedOn;
    this.encounter = encounter;
    this.extension = extension;
    this.partOf = partOf;
    this.bodySite = bodySite;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.frames = frames;
    this.device = device;
    this.identifier = identifier;
    this.meta = meta;
    this.modality = modality;
    this.reasonCode = reasonCode;
    this.width = width;
    this.duration = duration;
    this.text = text;
    this.view = view;
    this.implicitRules = implicitRules;
    this.height = height;
    this.type = type;
    this.operator = operator;
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
   * @return The value of the {@code deviceName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
  @Override
  public java.util.Optional<java.lang.String> deviceName() {
    return java.util.Optional.ofNullable(deviceName);
  }

  /**
   * @return The value of the {@code issued} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("issued")
  @Override
  public java.util.Optional<com.fhir.instant> issued() {
    return java.util.Optional.ofNullable(issued);
  }

  /**
   * @return The value of the {@code createdPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("createdPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> createdPeriod() {
    return java.util.Optional.ofNullable(createdPeriod);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code createdDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("createdDateTime")
  @Override
  public java.util.Optional<java.lang.String> createdDateTime() {
    return java.util.Optional.ofNullable(createdDateTime);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<com.fhir.Reference> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code content} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  @Override
  public com.fhir.Attachment content() {
    return content;
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
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> bodySite() {
    return java.util.Optional.ofNullable(bodySite);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code frames} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("frames")
  @Override
  public java.util.Optional<com.fhir.positiveInt> frames() {
    return java.util.Optional.ofNullable(frames);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("device")
  @Override
  public java.util.Optional<com.fhir.Reference> device() {
    return java.util.Optional.ofNullable(device);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code modality} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modality")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> modality() {
    return java.util.Optional.ofNullable(modality);
  }

  /**
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code width} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("width")
  @Override
  public java.util.Optional<com.fhir.positiveInt> width() {
    return java.util.Optional.ofNullable(width);
  }

  /**
   * @return The value of the {@code duration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("duration")
  @Override
  public java.util.Optional<com.fhir.decimal> duration() {
    return java.util.Optional.ofNullable(duration);
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
   * @return The value of the {@code view} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("view")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> view() {
    return java.util.Optional.ofNullable(view);
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
   * @return The value of the {@code height} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("height")
  @Override
  public java.util.Optional<com.fhir.positiveInt> height() {
    return java.util.Optional.ofNullable(height);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code operator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("operator")
  @Override
  public java.util.Optional<com.fhir.Reference> operator() {
    return java.util.Optional.ofNullable(operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedia(
        newValue,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedia(
        value,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#deviceName() deviceName} attribute.
   * @param value The value for deviceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withDeviceName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "deviceName");
    if (java.util.Objects.equals(this.deviceName, newValue)) return this;
    return new ImmutableMedia(
        this.contained,
        newValue,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#deviceName() deviceName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withDeviceName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.deviceName, value)) return this;
    return new ImmutableMedia(
        this.contained,
        value,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withIssued(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        newValue,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withIssued(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        value,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#createdPeriod() createdPeriod} attribute.
   * @param value The value for createdPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withCreatedPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "createdPeriod");
    if (this.createdPeriod == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        newValue,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#createdPeriod() createdPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for createdPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withCreatedPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.createdPeriod == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        value,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        newValue,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        value,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        newValue,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        value,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#createdDateTime() createdDateTime} attribute.
   * @param value The value for createdDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withCreatedDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "createdDateTime");
    if (java.util.Objects.equals(this.createdDateTime, newValue)) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        newValue,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#createdDateTime() createdDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for createdDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withCreatedDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.createdDateTime, value)) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        value,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Media#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedia withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        newValue,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        newValue,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        value,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Media#content() content} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for content
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedia withContent(com.fhir.Attachment value) {
    if (this.content == value) return this;
    com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "content");
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        newValue,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        newValue,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        value,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        newValue,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        value,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        newValue,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        value,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        newValue,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        value,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        newValue,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        value,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withBodySite(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        newValue,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withBodySite(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        value,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        newValue,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        value,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        newValue,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        value,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#frames() frames} attribute.
   * @param value The value for frames
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withFrames(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "frames");
    if (this.frames == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        newValue,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#frames() frames} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frames
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withFrames(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.frames == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        value,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withDevice(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        newValue,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withDevice(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        value,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        newValue,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        value,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        newValue,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        value,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#modality() modality} attribute.
   * @param value The value for modality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withModality(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "modality");
    if (this.modality == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        newValue,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#modality() modality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withModality(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.modality == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        value,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        newValue,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        value,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#width() width} attribute.
   * @param value The value for width
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withWidth(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "width");
    if (this.width == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        newValue,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#width() width} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for width
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withWidth(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.width == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        value,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withDuration(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        newValue,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withDuration(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        value,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        newValue,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        value,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#view() view} attribute.
   * @param value The value for view
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withView(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "view");
    if (this.view == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        newValue,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#view() view} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for view
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withView(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.view == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        value,
        this.implicitRules,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        newValue,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        value,
        this.height,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#height() height} attribute.
   * @param value The value for height
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withHeight(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "height");
    if (this.height == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        newValue,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#height() height} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for height
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withHeight(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.height == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        value,
        this.type,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        newValue,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        value,
        this.operator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Media#operator() operator} attribute.
   * @param value The value for operator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedia withOperator(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "operator");
    if (this.operator == newValue) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Media#operator() operator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedia withOperator(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.operator == value) return this;
    return new ImmutableMedia(
        this.contained,
        this.deviceName,
        this.issued,
        this.createdPeriod,
        this.id,
        this.note,
        this.createdDateTime,
        this.resourceType,
        this.subject,
        this.content,
        this.language,
        this.basedOn,
        this.encounter,
        this.extension,
        this.partOf,
        this.bodySite,
        this.modifierExtension,
        this.status,
        this.frames,
        this.device,
        this.identifier,
        this.meta,
        this.modality,
        this.reasonCode,
        this.width,
        this.duration,
        this.text,
        this.view,
        this.implicitRules,
        this.height,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedia} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedia
        && equalTo((ImmutableMedia) another);
  }

  private boolean equalTo(ImmutableMedia another) {
    return java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(deviceName, another.deviceName)
        && java.util.Objects.equals(issued, another.issued)
        && java.util.Objects.equals(createdPeriod, another.createdPeriod)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(createdDateTime, another.createdDateTime)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(subject, another.subject)
        && content.equals(another.content)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(frames, another.frames)
        && java.util.Objects.equals(device, another.device)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(modality, another.modality)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(width, another.width)
        && java.util.Objects.equals(duration, another.duration)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(view, another.view)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(height, another.height)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(operator, another.operator);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code deviceName}, {@code issued}, {@code createdPeriod}, {@code id}, {@code note}, {@code createdDateTime}, {@code resourceType}, {@code subject}, {@code content}, {@code language}, {@code basedOn}, {@code encounter}, {@code extension}, {@code partOf}, {@code bodySite}, {@code modifierExtension}, {@code status}, {@code frames}, {@code device}, {@code identifier}, {@code meta}, {@code modality}, {@code reasonCode}, {@code width}, {@code duration}, {@code text}, {@code view}, {@code implicitRules}, {@code height}, {@code type}, {@code operator}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(deviceName);
    h += (h << 5) + java.util.Objects.hashCode(issued);
    h += (h << 5) + java.util.Objects.hashCode(createdPeriod);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(createdDateTime);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + content.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(frames);
    h += (h << 5) + java.util.Objects.hashCode(device);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(modality);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(width);
    h += (h << 5) + java.util.Objects.hashCode(duration);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(view);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(height);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(operator);
    return h;
  }

  /**
   * Prints the immutable value {@code Media} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Media{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (deviceName != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("deviceName=").append(deviceName);
    }
    if (issued != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (createdPeriod != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("createdPeriod=").append(createdPeriod);
    }
    if (id != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (note != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (createdDateTime != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("createdDateTime=").append(createdDateTime);
    }
    if (builder.length() > 6) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    builder.append(", ");
    builder.append("content=").append(content);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (frames != null) {
      builder.append(", ");
      builder.append("frames=").append(frames);
    }
    if (device != null) {
      builder.append(", ");
      builder.append("device=").append(device);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modality != null) {
      builder.append(", ");
      builder.append("modality=").append(modality);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (width != null) {
      builder.append(", ");
      builder.append("width=").append(width);
    }
    if (duration != null) {
      builder.append(", ");
      builder.append("duration=").append(duration);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (view != null) {
      builder.append(", ");
      builder.append("view=").append(view);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (height != null) {
      builder.append(", ");
      builder.append("height=").append(height);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (operator != null) {
      builder.append(", ");
      builder.append("operator=").append(operator);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Media", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Media {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> deviceName = java.util.Optional.empty();
    boolean deviceNameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> issued = java.util.Optional.empty();
    boolean issuedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> createdPeriod = java.util.Optional.empty();
    boolean createdPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> createdDateTime = java.util.Optional.empty();
    boolean createdDateTimeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable com.fhir.Attachment content;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> frames = java.util.Optional.empty();
    boolean framesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> device = java.util.Optional.empty();
    boolean deviceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> modality = java.util.Optional.empty();
    boolean modalityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> width = java.util.Optional.empty();
    boolean widthIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> duration = java.util.Optional.empty();
    boolean durationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> view = java.util.Optional.empty();
    boolean viewIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> height = java.util.Optional.empty();
    boolean heightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> operator = java.util.Optional.empty();
    boolean operatorIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
    public void setDeviceName(java.util.Optional<java.lang.String> deviceName) {
      this.deviceName = deviceName;
      this.deviceNameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public void setIssued(java.util.Optional<com.fhir.instant> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("createdPeriod")
    public void setCreatedPeriod(java.util.Optional<com.fhir.Period> createdPeriod) {
      this.createdPeriod = createdPeriod;
      this.createdPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("createdDateTime")
    public void setCreatedDateTime(java.util.Optional<java.lang.String> createdDateTime) {
      this.createdDateTime = createdDateTime;
      this.createdDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    public void setContent(com.fhir.Attachment content) {
      this.content = content;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<com.fhir.CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("frames")
    public void setFrames(java.util.Optional<com.fhir.positiveInt> frames) {
      this.frames = frames;
      this.framesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public void setDevice(java.util.Optional<com.fhir.Reference> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modality")
    public void setModality(java.util.Optional<com.fhir.CodeableConcept> modality) {
      this.modality = modality;
      this.modalityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("width")
    public void setWidth(java.util.Optional<com.fhir.positiveInt> width) {
      this.width = width;
      this.widthIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public void setDuration(java.util.Optional<com.fhir.decimal> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("view")
    public void setView(java.util.Optional<com.fhir.CodeableConcept> view) {
      this.view = view;
      this.viewIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("height")
    public void setHeight(java.util.Optional<com.fhir.positiveInt> height) {
      this.height = height;
      this.heightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    public void setOperator(java.util.Optional<com.fhir.Reference> operator) {
      this.operator = operator;
      this.operatorIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> deviceName() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> issued() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> createdPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> createdDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Attachment content() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> frames() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> device() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> modality() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> width() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> duration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> view() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> height() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> operator() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedia fromJson(Json json) {
    ImmutableMedia.Builder builder = ((ImmutableMedia.Builder) ImmutableMedia.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.deviceNameIsSet) {
      builder.deviceName(json.deviceName);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.createdPeriodIsSet) {
      builder.createdPeriod(json.createdPeriod);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.createdDateTimeIsSet) {
      builder.createdDateTime(json.createdDateTime);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.content != null) {
      builder.content(json.content);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.framesIsSet) {
      builder.frames(json.frames);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modalityIsSet) {
      builder.modality(json.modality);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.widthIsSet) {
      builder.width(json.width);
    }
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.viewIsSet) {
      builder.view(json.view);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.heightIsSet) {
      builder.height(json.height);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.operatorIsSet) {
      builder.operator(json.operator);
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
        .contained(instance.contained())
        .deviceName(instance.deviceName())
        .issued(instance.issued())
        .createdPeriod(instance.createdPeriod())
        .id(instance.id())
        .note(instance.note())
        .createdDateTime(instance.createdDateTime())
        .resourceType(instance.resourceType())
        .subject(instance.subject())
        .content(instance.content())
        .language(instance.language())
        .basedOn(instance.basedOn())
        .encounter(instance.encounter())
        .extension(instance.extension())
        .partOf(instance.partOf())
        .bodySite(instance.bodySite())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .frames(instance.frames())
        .device(instance.device())
        .identifier(instance.identifier())
        .meta(instance.meta())
        .modality(instance.modality())
        .reasonCode(instance.reasonCode())
        .width(instance.width())
        .duration(instance.duration())
        .text(instance.text())
        .view(instance.view())
        .implicitRules(instance.implicitRules())
        .height(instance.height())
        .type(instance.type())
        .operator(instance.operator())
        .build();
  }

  /**
   * Creates a builder for {@link Media Media}.
   * <pre>
   * ImmutableMedia.builder()
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Media#contained() contained}
   *    .deviceName(String) // optional {@link Media#deviceName() deviceName}
   *    .issued(com.fhir.instant) // optional {@link Media#issued() issued}
   *    .createdPeriod(com.fhir.Period) // optional {@link Media#createdPeriod() createdPeriod}
   *    .id(com.fhir.id) // optional {@link Media#id() id}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Media#note() note}
   *    .createdDateTime(String) // optional {@link Media#createdDateTime() createdDateTime}
   *    .resourceType(String) // required {@link Media#resourceType() resourceType}
   *    .subject(com.fhir.Reference) // optional {@link Media#subject() subject}
   *    .content(com.fhir.Attachment) // required {@link Media#content() content}
   *    .language(com.fhir.code) // optional {@link Media#language() language}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Media#basedOn() basedOn}
   *    .encounter(com.fhir.Reference) // optional {@link Media#encounter() encounter}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Media#extension() extension}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Media#partOf() partOf}
   *    .bodySite(com.fhir.CodeableConcept) // optional {@link Media#bodySite() bodySite}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Media#modifierExtension() modifierExtension}
   *    .status(com.fhir.code) // optional {@link Media#status() status}
   *    .frames(com.fhir.positiveInt) // optional {@link Media#frames() frames}
   *    .device(com.fhir.Reference) // optional {@link Media#device() device}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Media#identifier() identifier}
   *    .meta(com.fhir.Meta) // optional {@link Media#meta() meta}
   *    .modality(com.fhir.CodeableConcept) // optional {@link Media#modality() modality}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Media#reasonCode() reasonCode}
   *    .width(com.fhir.positiveInt) // optional {@link Media#width() width}
   *    .duration(com.fhir.decimal) // optional {@link Media#duration() duration}
   *    .text(com.fhir.Narrative) // optional {@link Media#text() text}
   *    .view(com.fhir.CodeableConcept) // optional {@link Media#view() view}
   *    .implicitRules(com.fhir.uri) // optional {@link Media#implicitRules() implicitRules}
   *    .height(com.fhir.positiveInt) // optional {@link Media#height() height}
   *    .type(com.fhir.CodeableConcept) // optional {@link Media#type() type}
   *    .operator(com.fhir.Reference) // optional {@link Media#operator() operator}
   *    .build();
   * </pre>
   * @return A new Media builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedia.Builder();
  }

  /**
   * Builds instances of type {@link Media Media}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Media", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ContentBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_CONTENT = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_DEVICE_NAME = 0x2L;
    private static final long OPT_BIT_ISSUED = 0x4L;
    private static final long OPT_BIT_CREATED_PERIOD = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_NOTE = 0x20L;
    private static final long OPT_BIT_CREATED_DATE_TIME = 0x40L;
    private static final long OPT_BIT_SUBJECT = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_BASED_ON = 0x200L;
    private static final long OPT_BIT_ENCOUNTER = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_PART_OF = 0x1000L;
    private static final long OPT_BIT_BODY_SITE = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_STATUS = 0x8000L;
    private static final long OPT_BIT_FRAMES = 0x10000L;
    private static final long OPT_BIT_DEVICE = 0x20000L;
    private static final long OPT_BIT_IDENTIFIER = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_MODALITY = 0x100000L;
    private static final long OPT_BIT_REASON_CODE = 0x200000L;
    private static final long OPT_BIT_WIDTH = 0x400000L;
    private static final long OPT_BIT_DURATION = 0x800000L;
    private static final long OPT_BIT_TEXT = 0x1000000L;
    private static final long OPT_BIT_VIEW = 0x2000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000000L;
    private static final long OPT_BIT_HEIGHT = 0x8000000L;
    private static final long OPT_BIT_TYPE = 0x10000000L;
    private static final long OPT_BIT_OPERATOR = 0x20000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String deviceName;
    private @javax.annotation.Nullable com.fhir.instant issued;
    private @javax.annotation.Nullable com.fhir.Period createdPeriod;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.lang.String createdDateTime;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.Attachment content;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.positiveInt frames;
    private @javax.annotation.Nullable com.fhir.Reference device;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CodeableConcept modality;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable com.fhir.positiveInt width;
    private @javax.annotation.Nullable com.fhir.decimal duration;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.CodeableConcept view;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.positiveInt height;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.Reference operator;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Media#contained() contained} to contained.
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
     * Initializes the optional value {@link Media#contained() contained} to contained.
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
     * Initializes the optional value {@link Media#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceName(java.lang.String deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = java.util.Objects.requireNonNull(deviceName, "deviceName");
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deviceName")
    public final Builder deviceName(java.util.Optional<java.lang.String> deviceName) {
      checkNotIsSet(deviceNameIsSet(), "deviceName");
      this.deviceName = deviceName.orElse(null);
      optBits |= OPT_BIT_DEVICE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    public final Builder issued(com.fhir.instant issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = java.util.Objects.requireNonNull(issued, "issued");
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public final Builder issued(java.util.Optional<? extends com.fhir.instant> issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = issued.orElse(null);
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#createdPeriod() createdPeriod} to createdPeriod.
     * @param createdPeriod The value for createdPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder createdPeriod(com.fhir.Period createdPeriod) {
      checkNotIsSet(createdPeriodIsSet(), "createdPeriod");
      this.createdPeriod = java.util.Objects.requireNonNull(createdPeriod, "createdPeriod");
      optBits |= OPT_BIT_CREATED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#createdPeriod() createdPeriod} to createdPeriod.
     * @param createdPeriod The value for createdPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createdPeriod")
    public final Builder createdPeriod(java.util.Optional<? extends com.fhir.Period> createdPeriod) {
      checkNotIsSet(createdPeriodIsSet(), "createdPeriod");
      this.createdPeriod = createdPeriod.orElse(null);
      optBits |= OPT_BIT_CREATED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#id() id} to id.
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
     * Initializes the optional value {@link Media#id() id} to id.
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
     * Initializes the optional value {@link Media#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#createdDateTime() createdDateTime} to createdDateTime.
     * @param createdDateTime The value for createdDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder createdDateTime(java.lang.String createdDateTime) {
      checkNotIsSet(createdDateTimeIsSet(), "createdDateTime");
      this.createdDateTime = java.util.Objects.requireNonNull(createdDateTime, "createdDateTime");
      optBits |= OPT_BIT_CREATED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#createdDateTime() createdDateTime} to createdDateTime.
     * @param createdDateTime The value for createdDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createdDateTime")
    public final Builder createdDateTime(java.util.Optional<java.lang.String> createdDateTime) {
      checkNotIsSet(createdDateTimeIsSet(), "createdDateTime");
      this.createdDateTime = createdDateTime.orElse(null);
      optBits |= OPT_BIT_CREATED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link Media#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Media#subject() subject} to subject.
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
     * Initializes the optional value {@link Media#subject() subject} to subject.
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
     * Initializes the value for the {@link Media#content() content} attribute.
     * @param content The value for content 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    public final Builder content(com.fhir.Attachment content) {
      checkNotIsSet(contentIsSet(), "content");
      this.content = java.util.Objects.requireNonNull(content, "content");
      initBits &= ~INIT_BIT_CONTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#language() language} to language.
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
     * Initializes the optional value {@link Media#language() language} to language.
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
     * Initializes the optional value {@link Media#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(java.util.List<com.fhir.Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = java.util.Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public final Builder basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(com.fhir.Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = java.util.Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public final Builder encounter(java.util.Optional<? extends com.fhir.Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#extension() extension} to extension.
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
     * Initializes the optional value {@link Media#extension() extension} to extension.
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
     * Initializes the optional value {@link Media#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(java.util.List<com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(com.fhir.CodeableConcept bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = java.util.Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public final Builder bodySite(java.util.Optional<? extends com.fhir.CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Media#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Media#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#frames() frames} to frames.
     * @param frames The value for frames
     * @return {@code this} builder for chained invocation
     */
    public final Builder frames(com.fhir.positiveInt frames) {
      checkNotIsSet(framesIsSet(), "frames");
      this.frames = java.util.Objects.requireNonNull(frames, "frames");
      optBits |= OPT_BIT_FRAMES;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#frames() frames} to frames.
     * @param frames The value for frames
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("frames")
    public final Builder frames(java.util.Optional<? extends com.fhir.positiveInt> frames) {
      checkNotIsSet(framesIsSet(), "frames");
      this.frames = frames.orElse(null);
      optBits |= OPT_BIT_FRAMES;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(com.fhir.Reference device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = java.util.Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public final Builder device(java.util.Optional<? extends com.fhir.Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Media#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Media#meta() meta} to meta.
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
     * Initializes the optional value {@link Media#meta() meta} to meta.
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
     * Initializes the optional value {@link Media#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for chained invocation
     */
    public final Builder modality(com.fhir.CodeableConcept modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = java.util.Objects.requireNonNull(modality, "modality");
      optBits |= OPT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modality")
    public final Builder modality(java.util.Optional<? extends com.fhir.CodeableConcept> modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = modality.orElse(null);
      optBits |= OPT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = java.util.Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public final Builder reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for chained invocation
     */
    public final Builder width(com.fhir.positiveInt width) {
      checkNotIsSet(widthIsSet(), "width");
      this.width = java.util.Objects.requireNonNull(width, "width");
      optBits |= OPT_BIT_WIDTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("width")
    public final Builder width(java.util.Optional<? extends com.fhir.positiveInt> width) {
      checkNotIsSet(widthIsSet(), "width");
      this.width = width.orElse(null);
      optBits |= OPT_BIT_WIDTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(com.fhir.decimal duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = java.util.Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public final Builder duration(java.util.Optional<? extends com.fhir.decimal> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#text() text} to text.
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
     * Initializes the optional value {@link Media#text() text} to text.
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
     * Initializes the optional value {@link Media#view() view} to view.
     * @param view The value for view
     * @return {@code this} builder for chained invocation
     */
    public final Builder view(com.fhir.CodeableConcept view) {
      checkNotIsSet(viewIsSet(), "view");
      this.view = java.util.Objects.requireNonNull(view, "view");
      optBits |= OPT_BIT_VIEW;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#view() view} to view.
     * @param view The value for view
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("view")
    public final Builder view(java.util.Optional<? extends com.fhir.CodeableConcept> view) {
      checkNotIsSet(viewIsSet(), "view");
      this.view = view.orElse(null);
      optBits |= OPT_BIT_VIEW;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Media#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Media#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for chained invocation
     */
    public final Builder height(com.fhir.positiveInt height) {
      checkNotIsSet(heightIsSet(), "height");
      this.height = java.util.Objects.requireNonNull(height, "height");
      optBits |= OPT_BIT_HEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("height")
    public final Builder height(java.util.Optional<? extends com.fhir.positiveInt> height) {
      checkNotIsSet(heightIsSet(), "height");
      this.height = height.orElse(null);
      optBits |= OPT_BIT_HEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for chained invocation
     */
    public final Builder operator(com.fhir.Reference operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = java.util.Objects.requireNonNull(operator, "operator");
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Media#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    public final Builder operator(java.util.Optional<? extends com.fhir.Reference> operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = operator.orElse(null);
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Builds a new {@link Media Media}.
     * @return An immutable instance of Media
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Media build() {
      checkRequiredAttributes();
      return new ImmutableMedia(
          contained,
          deviceName,
          issued,
          createdPeriod,
          id,
          note,
          createdDateTime,
          resourceType,
          subject,
          content,
          language,
          basedOn,
          encounter,
          extension,
          partOf,
          bodySite,
          modifierExtension,
          status,
          frames,
          device,
          identifier,
          meta,
          modality,
          reasonCode,
          width,
          duration,
          text,
          view,
          implicitRules,
          height,
          type,
          operator);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean deviceNameIsSet() {
      return (optBits & OPT_BIT_DEVICE_NAME) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean createdPeriodIsSet() {
      return (optBits & OPT_BIT_CREATED_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean createdDateTimeIsSet() {
      return (optBits & OPT_BIT_CREATED_DATE_TIME) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean framesIsSet() {
      return (optBits & OPT_BIT_FRAMES) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modalityIsSet() {
      return (optBits & OPT_BIT_MODALITY) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean widthIsSet() {
      return (optBits & OPT_BIT_WIDTH) != 0;
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean viewIsSet() {
      return (optBits & OPT_BIT_VIEW) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean heightIsSet() {
      return (optBits & OPT_BIT_HEIGHT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean operatorIsSet() {
      return (optBits & OPT_BIT_OPERATOR) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean contentIsSet() {
      return (initBits & INIT_BIT_CONTENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Media is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!contentIsSet()) attributes.add("content");
      return "Cannot build Media, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Media", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Media#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ContentBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Media", generator = "Immutables")
  public interface ContentBuildStage {
    /**
     * Initializes the value for the {@link Media#content() content} attribute.
     * @param content The value for content 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal content(com.fhir.Attachment content);
  }

  @org.immutables.value.Generated(from = "Media", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Media#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Media#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Media#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deviceName(java.lang.String deviceName);

    /**
     * Initializes the optional value {@link Media#deviceName() deviceName} to deviceName.
     * @param deviceName The value for deviceName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deviceName(java.util.Optional<java.lang.String> deviceName);

    /**
     * Initializes the optional value {@link Media#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(com.fhir.instant issued);

    /**
     * Initializes the optional value {@link Media#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(java.util.Optional<? extends com.fhir.instant> issued);

    /**
     * Initializes the optional value {@link Media#createdPeriod() createdPeriod} to createdPeriod.
     * @param createdPeriod The value for createdPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal createdPeriod(com.fhir.Period createdPeriod);

    /**
     * Initializes the optional value {@link Media#createdPeriod() createdPeriod} to createdPeriod.
     * @param createdPeriod The value for createdPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal createdPeriod(java.util.Optional<? extends com.fhir.Period> createdPeriod);

    /**
     * Initializes the optional value {@link Media#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Media#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Media#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Media#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Media#createdDateTime() createdDateTime} to createdDateTime.
     * @param createdDateTime The value for createdDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal createdDateTime(java.lang.String createdDateTime);

    /**
     * Initializes the optional value {@link Media#createdDateTime() createdDateTime} to createdDateTime.
     * @param createdDateTime The value for createdDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal createdDateTime(java.util.Optional<java.lang.String> createdDateTime);

    /**
     * Initializes the optional value {@link Media#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link Media#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link Media#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Media#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Media#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link Media#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link Media#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link Media#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link Media#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Media#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Media#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link Media#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link Media#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(com.fhir.CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link Media#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends com.fhir.CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link Media#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Media#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Media#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link Media#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link Media#frames() frames} to frames.
     * @param frames The value for frames
     * @return {@code this} builder for chained invocation
     */
    BuildFinal frames(com.fhir.positiveInt frames);

    /**
     * Initializes the optional value {@link Media#frames() frames} to frames.
     * @param frames The value for frames
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal frames(java.util.Optional<? extends com.fhir.positiveInt> frames);

    /**
     * Initializes the optional value {@link Media#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(com.fhir.Reference device);

    /**
     * Initializes the optional value {@link Media#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(java.util.Optional<? extends com.fhir.Reference> device);

    /**
     * Initializes the optional value {@link Media#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Media#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Media#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Media#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Media#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modality(com.fhir.CodeableConcept modality);

    /**
     * Initializes the optional value {@link Media#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modality(java.util.Optional<? extends com.fhir.CodeableConcept> modality);

    /**
     * Initializes the optional value {@link Media#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Media#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Media#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for chained invocation
     */
    BuildFinal width(com.fhir.positiveInt width);

    /**
     * Initializes the optional value {@link Media#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal width(java.util.Optional<? extends com.fhir.positiveInt> width);

    /**
     * Initializes the optional value {@link Media#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal duration(com.fhir.decimal duration);

    /**
     * Initializes the optional value {@link Media#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal duration(java.util.Optional<? extends com.fhir.decimal> duration);

    /**
     * Initializes the optional value {@link Media#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Media#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Media#view() view} to view.
     * @param view The value for view
     * @return {@code this} builder for chained invocation
     */
    BuildFinal view(com.fhir.CodeableConcept view);

    /**
     * Initializes the optional value {@link Media#view() view} to view.
     * @param view The value for view
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal view(java.util.Optional<? extends com.fhir.CodeableConcept> view);

    /**
     * Initializes the optional value {@link Media#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Media#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Media#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for chained invocation
     */
    BuildFinal height(com.fhir.positiveInt height);

    /**
     * Initializes the optional value {@link Media#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal height(java.util.Optional<? extends com.fhir.positiveInt> height);

    /**
     * Initializes the optional value {@link Media#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link Media#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Media#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal operator(com.fhir.Reference operator);

    /**
     * Initializes the optional value {@link Media#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal operator(java.util.Optional<? extends com.fhir.Reference> operator);

    /**
     * Builds a new {@link Media Media}.
     * @return An immutable instance of Media
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Media build();
  }
}
