//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DeviceUseStatement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceUseStatement.builder()}.
 */
@org.immutables.value.Generated(from = "DeviceUseStatement", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceUseStatement implements com.fhir.DeviceUseStatement {
  private final @javax.annotation.Nullable java.lang.String timingDateTime;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Reference source;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.dateTime recordedOn;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final com.fhir.Reference device;
  private final @javax.annotation.Nullable com.fhir.DeviceusestatementStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> derivedFrom;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Timing timingTiming;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
  private final @javax.annotation.Nullable com.fhir.Period timingPeriod;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Meta meta;

  private ImmutableDeviceUseStatement(
      @javax.annotation.Nullable java.lang.String timingDateTime,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Reference source,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.dateTime recordedOn,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.Narrative text,
      com.fhir.Reference device,
      @javax.annotation.Nullable com.fhir.DeviceusestatementStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> derivedFrom,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Timing timingTiming,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.CodeableConcept bodySite,
      @javax.annotation.Nullable com.fhir.Period timingPeriod,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Meta meta) {
    this.timingDateTime = timingDateTime;
    this.resourceType = resourceType;
    this.source = source;
    this.basedOn = basedOn;
    this.contained = contained;
    this.recordedOn = recordedOn;
    this.implicitRules = implicitRules;
    this.reasonCode = reasonCode;
    this.reasonReference = reasonReference;
    this.text = text;
    this.device = device;
    this.status = status;
    this.derivedFrom = derivedFrom;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
    this.subject = subject;
    this.language = language;
    this.timingTiming = timingTiming;
    this.note = note;
    this.bodySite = bodySite;
    this.timingPeriod = timingPeriod;
    this.id = id;
    this.extension = extension;
    this.meta = meta;
  }

  /**
   * @return The value of the {@code timingDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
  @Override
  public java.util.Optional<java.lang.String> timingDateTime() {
    return java.util.Optional.ofNullable(timingDateTime);
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
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.Optional<com.fhir.Reference> source() {
    return java.util.Optional.ofNullable(source);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code recordedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recordedOn")
  @Override
  public java.util.Optional<com.fhir.dateTime> recordedOn() {
    return java.util.Optional.ofNullable(recordedOn);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code device} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("device")
  @Override
  public com.fhir.Reference device() {
    return device;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.DeviceusestatementStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code derivedFrom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom() {
    return java.util.Optional.ofNullable(derivedFrom);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public com.fhir.Reference subject() {
    return subject;
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
   * @return The value of the {@code timingTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> timingTiming() {
    return java.util.Optional.ofNullable(timingTiming);
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
   * @return The value of the {@code bodySite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> bodySite() {
    return java.util.Optional.ofNullable(bodySite);
  }

  /**
   * @return The value of the {@code timingPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> timingPeriod() {
    return java.util.Optional.ofNullable(timingPeriod);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#timingDateTime() timingDateTime} attribute.
   * @param value The value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withTimingDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "timingDateTime");
    if (java.util.Objects.equals(this.timingDateTime, newValue)) return this;
    return new ImmutableDeviceUseStatement(
        newValue,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#timingDateTime() timingDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withTimingDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.timingDateTime, value)) return this;
    return new ImmutableDeviceUseStatement(
        value,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceUseStatement#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceUseStatement withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        newValue,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withSource(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        newValue,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withSource(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        value,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        newValue,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        value,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        newValue,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        value,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#recordedOn() recordedOn} attribute.
   * @param value The value for recordedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withRecordedOn(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "recordedOn");
    if (this.recordedOn == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        newValue,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#recordedOn() recordedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recordedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withRecordedOn(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.recordedOn == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        value,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        newValue,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        value,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        newValue,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        value,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        newValue,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        value,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        newValue,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        value,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceUseStatement#device() device} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for device
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceUseStatement withDevice(com.fhir.Reference value) {
    if (this.device == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "device");
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        newValue,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withStatus(com.fhir.DeviceusestatementStatus value) {
    @javax.annotation.Nullable com.fhir.DeviceusestatementStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        newValue,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withStatus(java.util.Optional<? extends com.fhir.DeviceusestatementStatus> optional) {
    @javax.annotation.Nullable com.fhir.DeviceusestatementStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        value,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withDerivedFrom(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        newValue,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withDerivedFrom(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        value,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        newValue,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        value,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        newValue,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        value,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceUseStatement#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceUseStatement withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        newValue,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        newValue,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        value,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#timingTiming() timingTiming} attribute.
   * @param value The value for timingTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withTimingTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "timingTiming");
    if (this.timingTiming == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        newValue,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#timingTiming() timingTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withTimingTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.timingTiming == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        value,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        newValue,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        value,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withBodySite(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        newValue,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withBodySite(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        value,
        this.timingPeriod,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withTimingPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        newValue,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withTimingPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        value,
        this.id,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        newValue,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        value,
        this.extension,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        newValue,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        value,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceUseStatement#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceUseStatement withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceUseStatement#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceUseStatement withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDeviceUseStatement(
        this.timingDateTime,
        this.resourceType,
        this.source,
        this.basedOn,
        this.contained,
        this.recordedOn,
        this.implicitRules,
        this.reasonCode,
        this.reasonReference,
        this.text,
        this.device,
        this.status,
        this.derivedFrom,
        this.modifierExtension,
        this.identifier,
        this.subject,
        this.language,
        this.timingTiming,
        this.note,
        this.bodySite,
        this.timingPeriod,
        this.id,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceUseStatement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceUseStatement
        && equalTo((ImmutableDeviceUseStatement) another);
  }

  private boolean equalTo(ImmutableDeviceUseStatement another) {
    return java.util.Objects.equals(timingDateTime, another.timingDateTime)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(recordedOn, another.recordedOn)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(text, another.text)
        && device.equals(another.device)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(derivedFrom, another.derivedFrom)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(identifier, another.identifier)
        && subject.equals(another.subject)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(timingTiming, another.timingTiming)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(timingPeriod, another.timingPeriod)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(meta, another.meta);
  }

  /**
   * Computes a hash code from attributes: {@code timingDateTime}, {@code resourceType}, {@code source}, {@code basedOn}, {@code contained}, {@code recordedOn}, {@code implicitRules}, {@code reasonCode}, {@code reasonReference}, {@code text}, {@code device}, {@code status}, {@code derivedFrom}, {@code modifierExtension}, {@code identifier}, {@code subject}, {@code language}, {@code timingTiming}, {@code note}, {@code bodySite}, {@code timingPeriod}, {@code id}, {@code extension}, {@code meta}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(timingDateTime);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(recordedOn);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + device.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(derivedFrom);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(timingTiming);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(timingPeriod);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceUseStatement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DeviceUseStatement{");
    if (timingDateTime != null) {
      builder.append("timingDateTime=").append(timingDateTime);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (recordedOn != null) {
      builder.append(", ");
      builder.append("recordedOn=").append(recordedOn);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("device=").append(device);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (derivedFrom != null) {
      builder.append(", ");
      builder.append("derivedFrom=").append(derivedFrom);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (timingTiming != null) {
      builder.append(", ");
      builder.append("timingTiming=").append(timingTiming);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (timingPeriod != null) {
      builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DeviceUseStatement", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DeviceUseStatement {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> timingDateTime = java.util.Optional.empty();
    boolean timingDateTimeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> recordedOn = java.util.Optional.empty();
    boolean recordedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable com.fhir.Reference device;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DeviceusestatementStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom = java.util.Optional.empty();
    boolean derivedFromIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> timingTiming = java.util.Optional.empty();
    boolean timingTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> timingPeriod = java.util.Optional.empty();
    boolean timingPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
    public void setTimingDateTime(java.util.Optional<java.lang.String> timingDateTime) {
      this.timingDateTime = timingDateTime;
      this.timingDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<com.fhir.Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recordedOn")
    public void setRecordedOn(java.util.Optional<com.fhir.dateTime> recordedOn) {
      this.recordedOn = recordedOn;
      this.recordedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public void setDevice(com.fhir.Reference device) {
      this.device = device;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.DeviceusestatementStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public void setDerivedFrom(java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
    public void setTimingTiming(java.util.Optional<com.fhir.Timing> timingTiming) {
      this.timingTiming = timingTiming;
      this.timingTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<com.fhir.CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
    public void setTimingPeriod(java.util.Optional<com.fhir.Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> timingDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> recordedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference device() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DeviceusestatementStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> timingTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceUseStatement fromJson(Json json) {
    ImmutableDeviceUseStatement.Builder builder = ((ImmutableDeviceUseStatement.Builder) ImmutableDeviceUseStatement.builder());
    if (json.timingDateTimeIsSet) {
      builder.timingDateTime(json.timingDateTime);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.recordedOnIsSet) {
      builder.recordedOn(json.recordedOn);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.device != null) {
      builder.device(json.device);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.timingTimingIsSet) {
      builder.timingTiming(json.timingTiming);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
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
        .timingDateTime(instance.timingDateTime())
        .resourceType(instance.resourceType())
        .source(instance.source())
        .basedOn(instance.basedOn())
        .contained(instance.contained())
        .recordedOn(instance.recordedOn())
        .implicitRules(instance.implicitRules())
        .reasonCode(instance.reasonCode())
        .reasonReference(instance.reasonReference())
        .text(instance.text())
        .device(instance.device())
        .status(instance.status())
        .derivedFrom(instance.derivedFrom())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .subject(instance.subject())
        .language(instance.language())
        .timingTiming(instance.timingTiming())
        .note(instance.note())
        .bodySite(instance.bodySite())
        .timingPeriod(instance.timingPeriod())
        .id(instance.id())
        .extension(instance.extension())
        .meta(instance.meta())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceUseStatement DeviceUseStatement}.
   * <pre>
   * ImmutableDeviceUseStatement.builder()
   *    .timingDateTime(String) // optional {@link DeviceUseStatement#timingDateTime() timingDateTime}
   *    .resourceType(String) // required {@link DeviceUseStatement#resourceType() resourceType}
   *    .source(com.fhir.Reference) // optional {@link DeviceUseStatement#source() source}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DeviceUseStatement#basedOn() basedOn}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link DeviceUseStatement#contained() contained}
   *    .recordedOn(com.fhir.dateTime) // optional {@link DeviceUseStatement#recordedOn() recordedOn}
   *    .implicitRules(com.fhir.uri) // optional {@link DeviceUseStatement#implicitRules() implicitRules}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DeviceUseStatement#reasonCode() reasonCode}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DeviceUseStatement#reasonReference() reasonReference}
   *    .text(com.fhir.Narrative) // optional {@link DeviceUseStatement#text() text}
   *    .device(com.fhir.Reference) // required {@link DeviceUseStatement#device() device}
   *    .status(com.fhir.DeviceusestatementStatus) // optional {@link DeviceUseStatement#status() status}
   *    .derivedFrom(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DeviceUseStatement#derivedFrom() derivedFrom}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceUseStatement#modifierExtension() modifierExtension}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link DeviceUseStatement#identifier() identifier}
   *    .subject(com.fhir.Reference) // required {@link DeviceUseStatement#subject() subject}
   *    .language(com.fhir.code) // optional {@link DeviceUseStatement#language() language}
   *    .timingTiming(com.fhir.Timing) // optional {@link DeviceUseStatement#timingTiming() timingTiming}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link DeviceUseStatement#note() note}
   *    .bodySite(com.fhir.CodeableConcept) // optional {@link DeviceUseStatement#bodySite() bodySite}
   *    .timingPeriod(com.fhir.Period) // optional {@link DeviceUseStatement#timingPeriod() timingPeriod}
   *    .id(com.fhir.id) // optional {@link DeviceUseStatement#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceUseStatement#extension() extension}
   *    .meta(com.fhir.Meta) // optional {@link DeviceUseStatement#meta() meta}
   *    .build();
   * </pre>
   * @return A new DeviceUseStatement builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDeviceUseStatement.Builder();
  }

  /**
   * Builds instances of type {@link DeviceUseStatement DeviceUseStatement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "DeviceUseStatement", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, DeviceBuildStage, SubjectBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_DEVICE = 0x2L;
    private static final long INIT_BIT_SUBJECT = 0x4L;
    private static final long OPT_BIT_TIMING_DATE_TIME = 0x1L;
    private static final long OPT_BIT_SOURCE = 0x2L;
    private static final long OPT_BIT_BASED_ON = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_RECORDED_ON = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_REASON_CODE = 0x40L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_DERIVED_FROM = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private static final long OPT_BIT_TIMING_TIMING = 0x4000L;
    private static final long OPT_BIT_NOTE = 0x8000L;
    private static final long OPT_BIT_BODY_SITE = 0x10000L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_META = 0x100000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String timingDateTime;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference source;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.dateTime recordedOn;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference device;
    private @javax.annotation.Nullable com.fhir.DeviceusestatementStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> derivedFrom;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Timing timingTiming;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.CodeableConcept bodySite;
    private @javax.annotation.Nullable com.fhir.Period timingPeriod;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Meta meta;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDateTime(java.lang.String timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = java.util.Objects.requireNonNull(timingDateTime, "timingDateTime");
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
    public final Builder timingDateTime(java.util.Optional<java.lang.String> timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = timingDateTime.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link DeviceUseStatement#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DeviceUseStatement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(com.fhir.Reference source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(java.util.Optional<? extends com.fhir.Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DeviceUseStatement#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DeviceUseStatement#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceUseStatement#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceUseStatement#recordedOn() recordedOn} to recordedOn.
     * @param recordedOn The value for recordedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder recordedOn(com.fhir.dateTime recordedOn) {
      checkNotIsSet(recordedOnIsSet(), "recordedOn");
      this.recordedOn = java.util.Objects.requireNonNull(recordedOn, "recordedOn");
      optBits |= OPT_BIT_RECORDED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#recordedOn() recordedOn} to recordedOn.
     * @param recordedOn The value for recordedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recordedOn")
    public final Builder recordedOn(java.util.Optional<? extends com.fhir.dateTime> recordedOn) {
      checkNotIsSet(recordedOnIsSet(), "recordedOn");
      this.recordedOn = recordedOn.orElse(null);
      optBits |= OPT_BIT_RECORDED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceUseStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceUseStatement#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link DeviceUseStatement#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link DeviceUseStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(java.util.List<com.fhir.Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = java.util.Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public final Builder reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#text() text} to text.
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
     * Initializes the optional value {@link DeviceUseStatement#text() text} to text.
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
     * Initializes the value for the {@link DeviceUseStatement#device() device} attribute.
     * @param device The value for device 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public final Builder device(com.fhir.Reference device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = java.util.Objects.requireNonNull(device, "device");
      initBits &= ~INIT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.DeviceusestatementStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.DeviceusestatementStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFrom(java.util.List<com.fhir.Reference> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = java.util.Objects.requireNonNull(derivedFrom, "derivedFrom");
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public final Builder derivedFrom(java.util.Optional<? extends java.util.List<com.fhir.Reference>> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = derivedFrom.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceUseStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceUseStatement#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceUseStatement#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link DeviceUseStatement#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#language() language} to language.
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
     * Initializes the optional value {@link DeviceUseStatement#language() language} to language.
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
     * Initializes the optional value {@link DeviceUseStatement#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingTiming(com.fhir.Timing timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = java.util.Objects.requireNonNull(timingTiming, "timingTiming");
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
    public final Builder timingTiming(java.util.Optional<? extends com.fhir.Timing> timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = timingTiming.orElse(null);
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#note() note} to note.
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
     * Initializes the optional value {@link DeviceUseStatement#note() note} to note.
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
     * Initializes the optional value {@link DeviceUseStatement#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link DeviceUseStatement#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link DeviceUseStatement#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingPeriod(com.fhir.Period timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = java.util.Objects.requireNonNull(timingPeriod, "timingPeriod");
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
    public final Builder timingPeriod(java.util.Optional<? extends com.fhir.Period> timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = timingPeriod.orElse(null);
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceUseStatement#id() id} to id.
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
     * Initializes the optional value {@link DeviceUseStatement#id() id} to id.
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
     * Initializes the optional value {@link DeviceUseStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceUseStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceUseStatement#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceUseStatement#meta() meta} to meta.
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
     * Builds a new {@link DeviceUseStatement DeviceUseStatement}.
     * @return An immutable instance of DeviceUseStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DeviceUseStatement build() {
      checkRequiredAttributes();
      return new ImmutableDeviceUseStatement(
          timingDateTime,
          resourceType,
          source,
          basedOn,
          contained,
          recordedOn,
          implicitRules,
          reasonCode,
          reasonReference,
          text,
          device,
          status,
          derivedFrom,
          modifierExtension,
          identifier,
          subject,
          language,
          timingTiming,
          note,
          bodySite,
          timingPeriod,
          id,
          extension,
          meta);
    }

    private boolean timingDateTimeIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE_TIME) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean recordedOnIsSet() {
      return (optBits & OPT_BIT_RECORDED_ON) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean timingTimingIsSet() {
      return (optBits & OPT_BIT_TIMING_TIMING) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean deviceIsSet() {
      return (initBits & INIT_BIT_DEVICE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DeviceUseStatement is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!deviceIsSet()) attributes.add("device");
      if (!subjectIsSet()) attributes.add("subject");
      return "Cannot build DeviceUseStatement, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "DeviceUseStatement", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceUseStatement#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    DeviceBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "DeviceUseStatement", generator = "Immutables")
  public interface DeviceBuildStage {
    /**
     * Initializes the value for the {@link DeviceUseStatement#device() device} attribute.
     * @param device The value for device 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage device(com.fhir.Reference device);
  }

  @org.immutables.value.Generated(from = "DeviceUseStatement", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link DeviceUseStatement#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "DeviceUseStatement", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingDateTime(java.lang.String timingDateTime);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingDateTime(java.util.Optional<java.lang.String> timingDateTime);

    /**
     * Initializes the optional value {@link DeviceUseStatement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(com.fhir.Reference source);

    /**
     * Initializes the optional value {@link DeviceUseStatement#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(java.util.Optional<? extends com.fhir.Reference> source);

    /**
     * Initializes the optional value {@link DeviceUseStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link DeviceUseStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link DeviceUseStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link DeviceUseStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link DeviceUseStatement#recordedOn() recordedOn} to recordedOn.
     * @param recordedOn The value for recordedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recordedOn(com.fhir.dateTime recordedOn);

    /**
     * Initializes the optional value {@link DeviceUseStatement#recordedOn() recordedOn} to recordedOn.
     * @param recordedOn The value for recordedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recordedOn(java.util.Optional<? extends com.fhir.dateTime> recordedOn);

    /**
     * Initializes the optional value {@link DeviceUseStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link DeviceUseStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link DeviceUseStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link DeviceUseStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link DeviceUseStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link DeviceUseStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.DeviceusestatementStatus status);

    /**
     * Initializes the optional value {@link DeviceUseStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.DeviceusestatementStatus> status);

    /**
     * Initializes the optional value {@link DeviceUseStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(java.util.List<com.fhir.Reference> derivedFrom);

    /**
     * Initializes the optional value {@link DeviceUseStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(java.util.Optional<? extends java.util.List<com.fhir.Reference>> derivedFrom);

    /**
     * Initializes the optional value {@link DeviceUseStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceUseStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceUseStatement#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link DeviceUseStatement#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link DeviceUseStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link DeviceUseStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingTiming(com.fhir.Timing timingTiming);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingTiming(java.util.Optional<? extends com.fhir.Timing> timingTiming);

    /**
     * Initializes the optional value {@link DeviceUseStatement#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link DeviceUseStatement#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link DeviceUseStatement#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(com.fhir.CodeableConcept bodySite);

    /**
     * Initializes the optional value {@link DeviceUseStatement#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends com.fhir.CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingPeriod(com.fhir.Period timingPeriod);

    /**
     * Initializes the optional value {@link DeviceUseStatement#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingPeriod(java.util.Optional<? extends com.fhir.Period> timingPeriod);

    /**
     * Initializes the optional value {@link DeviceUseStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link DeviceUseStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link DeviceUseStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link DeviceUseStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link DeviceUseStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link DeviceUseStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Builds a new {@link DeviceUseStatement DeviceUseStatement}.
     * @return An immutable instance of DeviceUseStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceUseStatement build();
  }
}
