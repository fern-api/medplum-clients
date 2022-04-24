//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DeviceMetric}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceMetric.builder()}.
 */
@org.immutables.value.Generated(from = "DeviceMetric", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceMetric implements com.fhir.DeviceMetric {
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Timing measurementPeriod;
  private final @javax.annotation.Nullable com.fhir.DevicemetricColor color;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept unit;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.DevicemetricOperationalstatus operationalStatus;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DeviceMetric_Calibration> calibration;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference source;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.DevicemetricCategory category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Reference parent;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

  private ImmutableDeviceMetric(
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Timing measurementPeriod,
      @javax.annotation.Nullable com.fhir.DevicemetricColor color,
      @javax.annotation.Nullable com.fhir.CodeableConcept unit,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.DevicemetricOperationalstatus operationalStatus,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.code language,
      com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.DeviceMetric_Calibration> calibration,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference source,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.DevicemetricCategory category,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Reference parent,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier) {
    this.text = text;
    this.measurementPeriod = measurementPeriod;
    this.color = color;
    this.unit = unit;
    this.id = id;
    this.operationalStatus = operationalStatus;
    this.resourceType = resourceType;
    this.language = language;
    this.type = type;
    this.calibration = calibration;
    this.contained = contained;
    this.extension = extension;
    this.source = source;
    this.meta = meta;
    this.category = category;
    this.modifierExtension = modifierExtension;
    this.parent = parent;
    this.implicitRules = implicitRules;
    this.identifier = identifier;
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
   * @return The value of the {@code measurementPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("measurementPeriod")
  @Override
  public java.util.Optional<com.fhir.Timing> measurementPeriod() {
    return java.util.Optional.ofNullable(measurementPeriod);
  }

  /**
   * @return The value of the {@code color} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("color")
  @Override
  public java.util.Optional<com.fhir.DevicemetricColor> color() {
    return java.util.Optional.ofNullable(color);
  }

  /**
   * @return The value of the {@code unit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unit")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> unit() {
    return java.util.Optional.ofNullable(unit);
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
   * @return The value of the {@code operationalStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("operationalStatus")
  @Override
  public java.util.Optional<com.fhir.DevicemetricOperationalstatus> operationalStatus() {
    return java.util.Optional.ofNullable(operationalStatus);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public com.fhir.CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code calibration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("calibration")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DeviceMetric_Calibration>> calibration() {
    return java.util.Optional.ofNullable(calibration);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<com.fhir.DevicemetricCategory> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code parent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parent")
  @Override
  public java.util.Optional<com.fhir.Reference> parent() {
    return java.util.Optional.ofNullable(parent);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDeviceMetric(
        newValue,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDeviceMetric(
        value,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#measurementPeriod() measurementPeriod} attribute.
   * @param value The value for measurementPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withMeasurementPeriod(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "measurementPeriod");
    if (this.measurementPeriod == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        newValue,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#measurementPeriod() measurementPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for measurementPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withMeasurementPeriod(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.measurementPeriod == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        value,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#color() color} attribute.
   * @param value The value for color
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withColor(com.fhir.DevicemetricColor value) {
    @javax.annotation.Nullable com.fhir.DevicemetricColor newValue = java.util.Objects.requireNonNull(value, "color");
    if (this.color == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        newValue,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#color() color} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for color
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withColor(java.util.Optional<? extends com.fhir.DevicemetricColor> optional) {
    @javax.annotation.Nullable com.fhir.DevicemetricColor value = optional.orElse(null);
    if (this.color == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        value,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withUnit(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "unit");
    if (this.unit == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        newValue,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#unit() unit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withUnit(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.unit == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        value,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        newValue,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        value,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#operationalStatus() operationalStatus} attribute.
   * @param value The value for operationalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withOperationalStatus(com.fhir.DevicemetricOperationalstatus value) {
    @javax.annotation.Nullable com.fhir.DevicemetricOperationalstatus newValue = java.util.Objects.requireNonNull(value, "operationalStatus");
    if (this.operationalStatus == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        newValue,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#operationalStatus() operationalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operationalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withOperationalStatus(java.util.Optional<? extends com.fhir.DevicemetricOperationalstatus> optional) {
    @javax.annotation.Nullable com.fhir.DevicemetricOperationalstatus value = optional.orElse(null);
    if (this.operationalStatus == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        value,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceMetric#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceMetric withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        newValue,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        newValue,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        value,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceMetric#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceMetric withType(com.fhir.CodeableConcept value) {
    if (this.type == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        newValue,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#calibration() calibration} attribute.
   * @param value The value for calibration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withCalibration(java.util.List<com.fhir.DeviceMetric_Calibration> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceMetric_Calibration> newValue = java.util.Objects.requireNonNull(value, "calibration");
    if (this.calibration == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        newValue,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#calibration() calibration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for calibration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withCalibration(java.util.Optional<? extends java.util.List<com.fhir.DeviceMetric_Calibration>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceMetric_Calibration> value = optional.orElse(null);
    if (this.calibration == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        value,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        newValue,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        value,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        newValue,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        value,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withSource(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        newValue,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withSource(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        value,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        newValue,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        value,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withCategory(com.fhir.DevicemetricCategory value) {
    @javax.annotation.Nullable com.fhir.DevicemetricCategory newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        newValue,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withCategory(java.util.Optional<? extends com.fhir.DevicemetricCategory> optional) {
    @javax.annotation.Nullable com.fhir.DevicemetricCategory value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        value,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        newValue,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        value,
        this.parent,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withParent(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        newValue,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withParent(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        value,
        this.implicitRules,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDeviceMetric(
        this.text,
        this.measurementPeriod,
        this.color,
        this.unit,
        this.id,
        this.operationalStatus,
        this.resourceType,
        this.language,
        this.type,
        this.calibration,
        this.contained,
        this.extension,
        this.source,
        this.meta,
        this.category,
        this.modifierExtension,
        this.parent,
        this.implicitRules,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceMetric} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceMetric
        && equalTo((ImmutableDeviceMetric) another);
  }

  private boolean equalTo(ImmutableDeviceMetric another) {
    return java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(measurementPeriod, another.measurementPeriod)
        && java.util.Objects.equals(color, another.color)
        && java.util.Objects.equals(unit, another.unit)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(operationalStatus, another.operationalStatus)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(language, another.language)
        && type.equals(another.type)
        && java.util.Objects.equals(calibration, another.calibration)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(parent, another.parent)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code measurementPeriod}, {@code color}, {@code unit}, {@code id}, {@code operationalStatus}, {@code resourceType}, {@code language}, {@code type}, {@code calibration}, {@code contained}, {@code extension}, {@code source}, {@code meta}, {@code category}, {@code modifierExtension}, {@code parent}, {@code implicitRules}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(measurementPeriod);
    h += (h << 5) + java.util.Objects.hashCode(color);
    h += (h << 5) + java.util.Objects.hashCode(unit);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(operationalStatus);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(calibration);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(parent);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceMetric} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DeviceMetric{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (measurementPeriod != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("measurementPeriod=").append(measurementPeriod);
    }
    if (color != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("color=").append(color);
    }
    if (unit != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("unit=").append(unit);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (operationalStatus != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("operationalStatus=").append(operationalStatus);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (calibration != null) {
      builder.append(", ");
      builder.append("calibration=").append(calibration);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (parent != null) {
      builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DeviceMetric", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DeviceMetric {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> measurementPeriod = java.util.Optional.empty();
    boolean measurementPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DevicemetricColor> color = java.util.Optional.empty();
    boolean colorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> unit = java.util.Optional.empty();
    boolean unitIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DevicemetricOperationalstatus> operationalStatus = java.util.Optional.empty();
    boolean operationalStatusIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept type;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DeviceMetric_Calibration>> calibration = java.util.Optional.empty();
    boolean calibrationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DevicemetricCategory> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> parent = java.util.Optional.empty();
    boolean parentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("measurementPeriod")
    public void setMeasurementPeriod(java.util.Optional<com.fhir.Timing> measurementPeriod) {
      this.measurementPeriod = measurementPeriod;
      this.measurementPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("color")
    public void setColor(java.util.Optional<com.fhir.DevicemetricColor> color) {
      this.color = color;
      this.colorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    public void setUnit(java.util.Optional<com.fhir.CodeableConcept> unit) {
      this.unit = unit;
      this.unitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("operationalStatus")
    public void setOperationalStatus(java.util.Optional<com.fhir.DevicemetricOperationalstatus> operationalStatus) {
      this.operationalStatus = operationalStatus;
      this.operationalStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(com.fhir.CodeableConcept type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("calibration")
    public void setCalibration(java.util.Optional<java.util.List<com.fhir.DeviceMetric_Calibration>> calibration) {
      this.calibration = calibration;
      this.calibrationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<com.fhir.Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<com.fhir.DevicemetricCategory> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public void setParent(java.util.Optional<com.fhir.Reference> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> measurementPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DevicemetricColor> color() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> unit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DevicemetricOperationalstatus> operationalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DeviceMetric_Calibration>> calibration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DevicemetricCategory> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> parent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceMetric fromJson(Json json) {
    ImmutableDeviceMetric.Builder builder = ((ImmutableDeviceMetric.Builder) ImmutableDeviceMetric.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.measurementPeriodIsSet) {
      builder.measurementPeriod(json.measurementPeriod);
    }
    if (json.colorIsSet) {
      builder.color(json.color);
    }
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.operationalStatusIsSet) {
      builder.operationalStatus(json.operationalStatus);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.calibrationIsSet) {
      builder.calibration(json.calibration);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableDeviceMetric) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceMetric} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceMetric instance
   */
  public static DeviceMetric copyOf(DeviceMetric instance) {
    if (instance instanceof ImmutableDeviceMetric) {
      return (ImmutableDeviceMetric) instance;
    }
    return ((ImmutableDeviceMetric.Builder) ImmutableDeviceMetric.builder())
        .text(instance.text())
        .measurementPeriod(instance.measurementPeriod())
        .color(instance.color())
        .unit(instance.unit())
        .id(instance.id())
        .operationalStatus(instance.operationalStatus())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .type(instance.type())
        .calibration(instance.calibration())
        .contained(instance.contained())
        .extension(instance.extension())
        .source(instance.source())
        .meta(instance.meta())
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .parent(instance.parent())
        .implicitRules(instance.implicitRules())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceMetric DeviceMetric}.
   * <pre>
   * ImmutableDeviceMetric.builder()
   *    .text(com.fhir.Narrative) // optional {@link DeviceMetric#text() text}
   *    .measurementPeriod(com.fhir.Timing) // optional {@link DeviceMetric#measurementPeriod() measurementPeriod}
   *    .color(com.fhir.DevicemetricColor) // optional {@link DeviceMetric#color() color}
   *    .unit(com.fhir.CodeableConcept) // optional {@link DeviceMetric#unit() unit}
   *    .id(com.fhir.id) // optional {@link DeviceMetric#id() id}
   *    .operationalStatus(com.fhir.DevicemetricOperationalstatus) // optional {@link DeviceMetric#operationalStatus() operationalStatus}
   *    .resourceType(String) // required {@link DeviceMetric#resourceType() resourceType}
   *    .language(com.fhir.code) // optional {@link DeviceMetric#language() language}
   *    .type(com.fhir.CodeableConcept) // required {@link DeviceMetric#type() type}
   *    .calibration(List&amp;lt;com.fhir.DeviceMetric_Calibration&amp;gt;) // optional {@link DeviceMetric#calibration() calibration}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link DeviceMetric#contained() contained}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceMetric#extension() extension}
   *    .source(com.fhir.Reference) // optional {@link DeviceMetric#source() source}
   *    .meta(com.fhir.Meta) // optional {@link DeviceMetric#meta() meta}
   *    .category(com.fhir.DevicemetricCategory) // optional {@link DeviceMetric#category() category}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceMetric#modifierExtension() modifierExtension}
   *    .parent(com.fhir.Reference) // optional {@link DeviceMetric#parent() parent}
   *    .implicitRules(com.fhir.uri) // optional {@link DeviceMetric#implicitRules() implicitRules}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link DeviceMetric#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new DeviceMetric builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDeviceMetric.Builder();
  }

  /**
   * Builds instances of type {@link DeviceMetric DeviceMetric}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "DeviceMetric", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_MEASUREMENT_PERIOD = 0x2L;
    private static final long OPT_BIT_COLOR = 0x4L;
    private static final long OPT_BIT_UNIT = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_OPERATIONAL_STATUS = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private static final long OPT_BIT_CALIBRATION = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_SOURCE = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_CATEGORY = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_PARENT = 0x4000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Timing measurementPeriod;
    private @javax.annotation.Nullable com.fhir.DevicemetricColor color;
    private @javax.annotation.Nullable com.fhir.CodeableConcept unit;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.DevicemetricOperationalstatus operationalStatus;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.DeviceMetric_Calibration> calibration;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference source;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.DevicemetricCategory category;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference parent;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceMetric#text() text} to text.
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
     * Initializes the optional value {@link DeviceMetric#text() text} to text.
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
     * Initializes the optional value {@link DeviceMetric#measurementPeriod() measurementPeriod} to measurementPeriod.
     * @param measurementPeriod The value for measurementPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder measurementPeriod(com.fhir.Timing measurementPeriod) {
      checkNotIsSet(measurementPeriodIsSet(), "measurementPeriod");
      this.measurementPeriod = java.util.Objects.requireNonNull(measurementPeriod, "measurementPeriod");
      optBits |= OPT_BIT_MEASUREMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#measurementPeriod() measurementPeriod} to measurementPeriod.
     * @param measurementPeriod The value for measurementPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("measurementPeriod")
    public final Builder measurementPeriod(java.util.Optional<? extends com.fhir.Timing> measurementPeriod) {
      checkNotIsSet(measurementPeriodIsSet(), "measurementPeriod");
      this.measurementPeriod = measurementPeriod.orElse(null);
      optBits |= OPT_BIT_MEASUREMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for chained invocation
     */
    public final Builder color(com.fhir.DevicemetricColor color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = java.util.Objects.requireNonNull(color, "color");
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("color")
    public final Builder color(java.util.Optional<? extends com.fhir.DevicemetricColor> color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = color.orElse(null);
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    public final Builder unit(com.fhir.CodeableConcept unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = java.util.Objects.requireNonNull(unit, "unit");
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    public final Builder unit(java.util.Optional<? extends com.fhir.CodeableConcept> unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = unit.orElse(null);
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#id() id} to id.
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
     * Initializes the optional value {@link DeviceMetric#id() id} to id.
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
     * Initializes the optional value {@link DeviceMetric#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder operationalStatus(com.fhir.DevicemetricOperationalstatus operationalStatus) {
      checkNotIsSet(operationalStatusIsSet(), "operationalStatus");
      this.operationalStatus = java.util.Objects.requireNonNull(operationalStatus, "operationalStatus");
      optBits |= OPT_BIT_OPERATIONAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationalStatus")
    public final Builder operationalStatus(java.util.Optional<? extends com.fhir.DevicemetricOperationalstatus> operationalStatus) {
      checkNotIsSet(operationalStatusIsSet(), "operationalStatus");
      this.operationalStatus = operationalStatus.orElse(null);
      optBits |= OPT_BIT_OPERATIONAL_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link DeviceMetric#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DeviceMetric#language() language} to language.
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
     * Initializes the optional value {@link DeviceMetric#language() language} to language.
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
     * Initializes the value for the {@link DeviceMetric#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#calibration() calibration} to calibration.
     * @param calibration The value for calibration
     * @return {@code this} builder for chained invocation
     */
    public final Builder calibration(java.util.List<com.fhir.DeviceMetric_Calibration> calibration) {
      checkNotIsSet(calibrationIsSet(), "calibration");
      this.calibration = java.util.Objects.requireNonNull(calibration, "calibration");
      optBits |= OPT_BIT_CALIBRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#calibration() calibration} to calibration.
     * @param calibration The value for calibration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("calibration")
    public final Builder calibration(java.util.Optional<? extends java.util.List<com.fhir.DeviceMetric_Calibration>> calibration) {
      checkNotIsSet(calibrationIsSet(), "calibration");
      this.calibration = calibration.orElse(null);
      optBits |= OPT_BIT_CALIBRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceMetric#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceMetric#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceMetric#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceMetric#source() source} to source.
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
     * Initializes the optional value {@link DeviceMetric#source() source} to source.
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
     * Initializes the optional value {@link DeviceMetric#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceMetric#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceMetric#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(com.fhir.DevicemetricCategory category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends com.fhir.DevicemetricCategory> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceMetric#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceMetric#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(com.fhir.Reference parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = java.util.Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public final Builder parent(java.util.Optional<? extends com.fhir.Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceMetric#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceMetric#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceMetric#identifier() identifier} to identifier.
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
     * Builds a new {@link DeviceMetric DeviceMetric}.
     * @return An immutable instance of DeviceMetric
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DeviceMetric build() {
      checkRequiredAttributes();
      return new ImmutableDeviceMetric(
          text,
          measurementPeriod,
          color,
          unit,
          id,
          operationalStatus,
          resourceType,
          language,
          type,
          calibration,
          contained,
          extension,
          source,
          meta,
          category,
          modifierExtension,
          parent,
          implicitRules,
          identifier);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean measurementPeriodIsSet() {
      return (optBits & OPT_BIT_MEASUREMENT_PERIOD) != 0;
    }

    private boolean colorIsSet() {
      return (optBits & OPT_BIT_COLOR) != 0;
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean operationalStatusIsSet() {
      return (optBits & OPT_BIT_OPERATIONAL_STATUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean calibrationIsSet() {
      return (optBits & OPT_BIT_CALIBRATION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DeviceMetric is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build DeviceMetric, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "DeviceMetric", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceMetric#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "DeviceMetric", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceMetric#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);
  }

  @org.immutables.value.Generated(from = "DeviceMetric", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceMetric#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link DeviceMetric#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link DeviceMetric#measurementPeriod() measurementPeriod} to measurementPeriod.
     * @param measurementPeriod The value for measurementPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal measurementPeriod(com.fhir.Timing measurementPeriod);

    /**
     * Initializes the optional value {@link DeviceMetric#measurementPeriod() measurementPeriod} to measurementPeriod.
     * @param measurementPeriod The value for measurementPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal measurementPeriod(java.util.Optional<? extends com.fhir.Timing> measurementPeriod);

    /**
     * Initializes the optional value {@link DeviceMetric#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for chained invocation
     */
    BuildFinal color(com.fhir.DevicemetricColor color);

    /**
     * Initializes the optional value {@link DeviceMetric#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal color(java.util.Optional<? extends com.fhir.DevicemetricColor> color);

    /**
     * Initializes the optional value {@link DeviceMetric#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unit(com.fhir.CodeableConcept unit);

    /**
     * Initializes the optional value {@link DeviceMetric#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unit(java.util.Optional<? extends com.fhir.CodeableConcept> unit);

    /**
     * Initializes the optional value {@link DeviceMetric#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link DeviceMetric#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link DeviceMetric#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal operationalStatus(com.fhir.DevicemetricOperationalstatus operationalStatus);

    /**
     * Initializes the optional value {@link DeviceMetric#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal operationalStatus(java.util.Optional<? extends com.fhir.DevicemetricOperationalstatus> operationalStatus);

    /**
     * Initializes the optional value {@link DeviceMetric#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link DeviceMetric#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link DeviceMetric#calibration() calibration} to calibration.
     * @param calibration The value for calibration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal calibration(java.util.List<com.fhir.DeviceMetric_Calibration> calibration);

    /**
     * Initializes the optional value {@link DeviceMetric#calibration() calibration} to calibration.
     * @param calibration The value for calibration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal calibration(java.util.Optional<? extends java.util.List<com.fhir.DeviceMetric_Calibration>> calibration);

    /**
     * Initializes the optional value {@link DeviceMetric#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link DeviceMetric#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link DeviceMetric#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link DeviceMetric#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link DeviceMetric#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(com.fhir.Reference source);

    /**
     * Initializes the optional value {@link DeviceMetric#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(java.util.Optional<? extends com.fhir.Reference> source);

    /**
     * Initializes the optional value {@link DeviceMetric#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link DeviceMetric#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link DeviceMetric#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(com.fhir.DevicemetricCategory category);

    /**
     * Initializes the optional value {@link DeviceMetric#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends com.fhir.DevicemetricCategory> category);

    /**
     * Initializes the optional value {@link DeviceMetric#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceMetric#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceMetric#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(com.fhir.Reference parent);

    /**
     * Initializes the optional value {@link DeviceMetric#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(java.util.Optional<? extends com.fhir.Reference> parent);

    /**
     * Initializes the optional value {@link DeviceMetric#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link DeviceMetric#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link DeviceMetric#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link DeviceMetric#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Builds a new {@link DeviceMetric DeviceMetric}.
     * @return An immutable instance of DeviceMetric
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceMetric build();
  }
}
