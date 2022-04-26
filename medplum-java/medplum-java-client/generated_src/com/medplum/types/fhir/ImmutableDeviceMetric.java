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
 * Immutable implementation of {@link DeviceMetric}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceMetric.builder()}.
 */
@Generated(from = "DeviceMetric", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceMetric implements DeviceMetric {
  private final @Nullable Uri implicitRules;
  private final @Nullable Timing measurementPeriod;
  private final @Nullable Code language;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference source;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable DevicemetricColor color;
  private final CodeableConcept type;
  private final @Nullable Meta meta;
  private final @Nullable CodeableConcept unit;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final @Nullable DevicemetricCategory category;
  private final @Nullable List<Extension> extension;
  private final @Nullable DevicemetricOperationalstatus operationalStatus;
  private final String resourceType;
  private final @Nullable List<DeviceMetric_Calibration> calibration;
  private final @Nullable Reference parent;
  private final @Nullable Narrative text;

  private ImmutableDeviceMetric(
      @Nullable Uri implicitRules,
      @Nullable Timing measurementPeriod,
      @Nullable Code language,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference source,
      @Nullable List<ResourceList> contained,
      @Nullable DevicemetricColor color,
      CodeableConcept type,
      @Nullable Meta meta,
      @Nullable CodeableConcept unit,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      @Nullable DevicemetricCategory category,
      @Nullable List<Extension> extension,
      @Nullable DevicemetricOperationalstatus operationalStatus,
      String resourceType,
      @Nullable List<DeviceMetric_Calibration> calibration,
      @Nullable Reference parent,
      @Nullable Narrative text) {
    this.implicitRules = implicitRules;
    this.measurementPeriod = measurementPeriod;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.source = source;
    this.contained = contained;
    this.color = color;
    this.type = type;
    this.meta = meta;
    this.unit = unit;
    this.identifier = identifier;
    this.id = id;
    this.category = category;
    this.extension = extension;
    this.operationalStatus = operationalStatus;
    this.resourceType = resourceType;
    this.calibration = calibration;
    this.parent = parent;
    this.text = text;
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
   * @return The value of the {@code measurementPeriod} attribute
   */
  @JsonProperty("measurementPeriod")
  @Override
  public Optional<Timing> measurementPeriod() {
    return Optional.ofNullable(measurementPeriod);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code color} attribute
   */
  @JsonProperty("color")
  @Override
  public Optional<DevicemetricColor> color() {
    return Optional.ofNullable(color);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code unit} attribute
   */
  @JsonProperty("unit")
  @Override
  public Optional<CodeableConcept> unit() {
    return Optional.ofNullable(unit);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<DevicemetricCategory> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code operationalStatus} attribute
   */
  @JsonProperty("operationalStatus")
  @Override
  public Optional<DevicemetricOperationalstatus> operationalStatus() {
    return Optional.ofNullable(operationalStatus);
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
   * @return The value of the {@code calibration} attribute
   */
  @JsonProperty("calibration")
  @Override
  public Optional<List<DeviceMetric_Calibration>> calibration() {
    return Optional.ofNullable(calibration);
  }

  /**
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public Optional<Reference> parent() {
    return Optional.ofNullable(parent);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDeviceMetric(
        newValue,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDeviceMetric(
        value,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#measurementPeriod() measurementPeriod} attribute.
   * @param value The value for measurementPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withMeasurementPeriod(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "measurementPeriod");
    if (this.measurementPeriod == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        newValue,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#measurementPeriod() measurementPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for measurementPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withMeasurementPeriod(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.measurementPeriod == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        value,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        newValue,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        value,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        newValue,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        value,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withSource(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        newValue,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withSource(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        value,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        newValue,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        value,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#color() color} attribute.
   * @param value The value for color
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withColor(DevicemetricColor value) {
    @Nullable DevicemetricColor newValue = Objects.requireNonNull(value, "color");
    if (this.color == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        newValue,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#color() color} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for color
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withColor(Optional<? extends DevicemetricColor> optional) {
    @Nullable DevicemetricColor value = optional.orElse(null);
    if (this.color == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        value,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceMetric#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceMetric withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        newValue,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        newValue,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        value,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withUnit(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "unit");
    if (this.unit == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        newValue,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#unit() unit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withUnit(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.unit == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        value,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        newValue,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        value,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        newValue,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        value,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withCategory(DevicemetricCategory value) {
    @Nullable DevicemetricCategory newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        newValue,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withCategory(Optional<? extends DevicemetricCategory> optional) {
    @Nullable DevicemetricCategory value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        value,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        newValue,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        value,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#operationalStatus() operationalStatus} attribute.
   * @param value The value for operationalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withOperationalStatus(DevicemetricOperationalstatus value) {
    @Nullable DevicemetricOperationalstatus newValue = Objects.requireNonNull(value, "operationalStatus");
    if (this.operationalStatus == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        newValue,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#operationalStatus() operationalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operationalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withOperationalStatus(Optional<? extends DevicemetricOperationalstatus> optional) {
    @Nullable DevicemetricOperationalstatus value = optional.orElse(null);
    if (this.operationalStatus == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        value,
        this.resourceType,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceMetric#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceMetric withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        newValue,
        this.calibration,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#calibration() calibration} attribute.
   * @param value The value for calibration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withCalibration(List<DeviceMetric_Calibration> value) {
    @Nullable List<DeviceMetric_Calibration> newValue = Objects.requireNonNull(value, "calibration");
    if (this.calibration == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        newValue,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#calibration() calibration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for calibration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withCalibration(Optional<? extends List<DeviceMetric_Calibration>> optional) {
    @Nullable List<DeviceMetric_Calibration> value = optional.orElse(null);
    if (this.calibration == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        value,
        this.parent,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withParent(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withParent(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceMetric#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceMetric withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceMetric#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceMetric withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDeviceMetric(
        this.implicitRules,
        this.measurementPeriod,
        this.language,
        this.modifierExtension,
        this.source,
        this.contained,
        this.color,
        this.type,
        this.meta,
        this.unit,
        this.identifier,
        this.id,
        this.category,
        this.extension,
        this.operationalStatus,
        this.resourceType,
        this.calibration,
        this.parent,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceMetric} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceMetric
        && equalTo((ImmutableDeviceMetric) another);
  }

  private boolean equalTo(ImmutableDeviceMetric another) {
    return Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(measurementPeriod, another.measurementPeriod)
        && Objects.equals(language, another.language)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(source, another.source)
        && Objects.equals(contained, another.contained)
        && Objects.equals(color, another.color)
        && type.equals(another.type)
        && Objects.equals(meta, another.meta)
        && Objects.equals(unit, another.unit)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && Objects.equals(category, another.category)
        && Objects.equals(extension, another.extension)
        && Objects.equals(operationalStatus, another.operationalStatus)
        && resourceType.equals(another.resourceType)
        && Objects.equals(calibration, another.calibration)
        && Objects.equals(parent, another.parent)
        && Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code measurementPeriod}, {@code language}, {@code modifierExtension}, {@code source}, {@code contained}, {@code color}, {@code type}, {@code meta}, {@code unit}, {@code identifier}, {@code id}, {@code category}, {@code extension}, {@code operationalStatus}, {@code resourceType}, {@code calibration}, {@code parent}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(measurementPeriod);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(color);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(unit);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(operationalStatus);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(calibration);
    h += (h << 5) + Objects.hashCode(parent);
    h += (h << 5) + Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceMetric} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceMetric{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (measurementPeriod != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("measurementPeriod=").append(measurementPeriod);
    }
    if (language != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (source != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (contained != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (color != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("color=").append(color);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("type=").append(type);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (unit != null) {
      builder.append(", ");
      builder.append("unit=").append(unit);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (operationalStatus != null) {
      builder.append(", ");
      builder.append("operationalStatus=").append(operationalStatus);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (calibration != null) {
      builder.append(", ");
      builder.append("calibration=").append(calibration);
    }
    if (parent != null) {
      builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceMetric", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceMetric {
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Timing> measurementPeriod = Optional.empty();
    boolean measurementPeriodIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<DevicemetricColor> color = Optional.empty();
    boolean colorIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<CodeableConcept> unit = Optional.empty();
    boolean unitIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<DevicemetricCategory> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<DevicemetricOperationalstatus> operationalStatus = Optional.empty();
    boolean operationalStatusIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<DeviceMetric_Calibration>> calibration = Optional.empty();
    boolean calibrationIsSet;
    @Nullable Optional<Reference> parent = Optional.empty();
    boolean parentIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("measurementPeriod")
    public void setMeasurementPeriod(Optional<Timing> measurementPeriod) {
      this.measurementPeriod = measurementPeriod;
      this.measurementPeriodIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("color")
    public void setColor(Optional<DevicemetricColor> color) {
      this.color = color;
      this.colorIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("unit")
    public void setUnit(Optional<CodeableConcept> unit) {
      this.unit = unit;
      this.unitIsSet = true;
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
    @JsonProperty("category")
    public void setCategory(Optional<DevicemetricCategory> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("operationalStatus")
    public void setOperationalStatus(Optional<DevicemetricOperationalstatus> operationalStatus) {
      this.operationalStatus = operationalStatus;
      this.operationalStatusIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("calibration")
    public void setCalibration(Optional<List<DeviceMetric_Calibration>> calibration) {
      this.calibration = calibration;
      this.calibrationIsSet = true;
    }
    @JsonProperty("parent")
    public void setParent(Optional<Reference> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> measurementPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DevicemetricColor> color() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> unit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DevicemetricCategory> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DevicemetricOperationalstatus> operationalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DeviceMetric_Calibration>> calibration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> parent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceMetric fromJson(Json json) {
    ImmutableDeviceMetric.Builder builder = ((ImmutableDeviceMetric.Builder) ImmutableDeviceMetric.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.measurementPeriodIsSet) {
      builder.measurementPeriod(json.measurementPeriod);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.colorIsSet) {
      builder.color(json.color);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.operationalStatusIsSet) {
      builder.operationalStatus(json.operationalStatus);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.calibrationIsSet) {
      builder.calibration(json.calibration);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.textIsSet) {
      builder.text(json.text);
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
        .implicitRules(instance.implicitRules())
        .measurementPeriod(instance.measurementPeriod())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .source(instance.source())
        .contained(instance.contained())
        .color(instance.color())
        .type(instance.type())
        .meta(instance.meta())
        .unit(instance.unit())
        .identifier(instance.identifier())
        .id(instance.id())
        .category(instance.category())
        .extension(instance.extension())
        .operationalStatus(instance.operationalStatus())
        .resourceType(instance.resourceType())
        .calibration(instance.calibration())
        .parent(instance.parent())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceMetric DeviceMetric}.
   * <pre>
   * ImmutableDeviceMetric.builder()
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link DeviceMetric#implicitRules() implicitRules}
   *    .measurementPeriod(com.medplum.types.fhir.Timing) // optional {@link DeviceMetric#measurementPeriod() measurementPeriod}
   *    .language(com.medplum.types.fhir.Code) // optional {@link DeviceMetric#language() language}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DeviceMetric#modifierExtension() modifierExtension}
   *    .source(com.medplum.types.fhir.Reference) // optional {@link DeviceMetric#source() source}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link DeviceMetric#contained() contained}
   *    .color(com.medplum.types.fhir.DevicemetricColor) // optional {@link DeviceMetric#color() color}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link DeviceMetric#type() type}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link DeviceMetric#meta() meta}
   *    .unit(com.medplum.types.fhir.CodeableConcept) // optional {@link DeviceMetric#unit() unit}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link DeviceMetric#identifier() identifier}
   *    .id(com.medplum.types.fhir.Id) // optional {@link DeviceMetric#id() id}
   *    .category(com.medplum.types.fhir.DevicemetricCategory) // optional {@link DeviceMetric#category() category}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DeviceMetric#extension() extension}
   *    .operationalStatus(com.medplum.types.fhir.DevicemetricOperationalstatus) // optional {@link DeviceMetric#operationalStatus() operationalStatus}
   *    .resourceType(String) // required {@link DeviceMetric#resourceType() resourceType}
   *    .calibration(List&amp;lt;com.medplum.types.fhir.DeviceMetric_Calibration&amp;gt;) // optional {@link DeviceMetric#calibration() calibration}
   *    .parent(com.medplum.types.fhir.Reference) // optional {@link DeviceMetric#parent() parent}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link DeviceMetric#text() text}
   *    .build();
   * </pre>
   * @return A new DeviceMetric builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableDeviceMetric.Builder();
  }

  /**
   * Builds instances of type {@link DeviceMetric DeviceMetric}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DeviceMetric", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_MEASUREMENT_PERIOD = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_SOURCE = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_COLOR = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_UNIT = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_CATEGORY = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_OPERATIONAL_STATUS = 0x2000L;
    private static final long OPT_BIT_CALIBRATION = 0x4000L;
    private static final long OPT_BIT_PARENT = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Uri implicitRules;
    private @Nullable Timing measurementPeriod;
    private @Nullable Code language;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference source;
    private @Nullable List<ResourceList> contained;
    private @Nullable DevicemetricColor color;
    private @Nullable CodeableConcept type;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept unit;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private @Nullable DevicemetricCategory category;
    private @Nullable List<Extension> extension;
    private @Nullable DevicemetricOperationalstatus operationalStatus;
    private @Nullable String resourceType;
    private @Nullable List<DeviceMetric_Calibration> calibration;
    private @Nullable Reference parent;
    private @Nullable Narrative text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceMetric#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceMetric#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceMetric#measurementPeriod() measurementPeriod} to measurementPeriod.
     * @param measurementPeriod The value for measurementPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder measurementPeriod(Timing measurementPeriod) {
      checkNotIsSet(measurementPeriodIsSet(), "measurementPeriod");
      this.measurementPeriod = Objects.requireNonNull(measurementPeriod, "measurementPeriod");
      optBits |= OPT_BIT_MEASUREMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#measurementPeriod() measurementPeriod} to measurementPeriod.
     * @param measurementPeriod The value for measurementPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measurementPeriod")
    public final Builder measurementPeriod(Optional<? extends Timing> measurementPeriod) {
      checkNotIsSet(measurementPeriodIsSet(), "measurementPeriod");
      this.measurementPeriod = measurementPeriod.orElse(null);
      optBits |= OPT_BIT_MEASUREMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#language() language} to language.
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
     * Initializes the optional value {@link DeviceMetric#language() language} to language.
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
     * Initializes the optional value {@link DeviceMetric#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceMetric#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceMetric#source() source} to source.
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
     * Initializes the optional value {@link DeviceMetric#source() source} to source.
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
     * Initializes the optional value {@link DeviceMetric#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceMetric#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceMetric#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for chained invocation
     */
    public final Builder color(DevicemetricColor color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = Objects.requireNonNull(color, "color");
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("color")
    public final Builder color(Optional<? extends DevicemetricColor> color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = color.orElse(null);
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the value for the {@link DeviceMetric#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceMetric#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceMetric#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    public final Builder unit(CodeableConcept unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = Objects.requireNonNull(unit, "unit");
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unit")
    public final Builder unit(Optional<? extends CodeableConcept> unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = unit.orElse(null);
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceMetric#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceMetric#id() id} to id.
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
     * Initializes the optional value {@link DeviceMetric#id() id} to id.
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
     * Initializes the optional value {@link DeviceMetric#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(DevicemetricCategory category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends DevicemetricCategory> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceMetric#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceMetric#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder operationalStatus(DevicemetricOperationalstatus operationalStatus) {
      checkNotIsSet(operationalStatusIsSet(), "operationalStatus");
      this.operationalStatus = Objects.requireNonNull(operationalStatus, "operationalStatus");
      optBits |= OPT_BIT_OPERATIONAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operationalStatus")
    public final Builder operationalStatus(Optional<? extends DevicemetricOperationalstatus> operationalStatus) {
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
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#calibration() calibration} to calibration.
     * @param calibration The value for calibration
     * @return {@code this} builder for chained invocation
     */
    public final Builder calibration(List<DeviceMetric_Calibration> calibration) {
      checkNotIsSet(calibrationIsSet(), "calibration");
      this.calibration = Objects.requireNonNull(calibration, "calibration");
      optBits |= OPT_BIT_CALIBRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#calibration() calibration} to calibration.
     * @param calibration The value for calibration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("calibration")
    public final Builder calibration(Optional<? extends List<DeviceMetric_Calibration>> calibration) {
      checkNotIsSet(calibrationIsSet(), "calibration");
      this.calibration = calibration.orElse(null);
      optBits |= OPT_BIT_CALIBRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(Reference parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parent")
    public final Builder parent(Optional<? extends Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceMetric#text() text} to text.
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
     * Initializes the optional value {@link DeviceMetric#text() text} to text.
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
     * Builds a new {@link DeviceMetric DeviceMetric}.
     * @return An immutable instance of DeviceMetric
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceMetric build() {
      checkRequiredAttributes();
      return new ImmutableDeviceMetric(
          implicitRules,
          measurementPeriod,
          language,
          modifierExtension,
          source,
          contained,
          color,
          type,
          meta,
          unit,
          identifier,
          id,
          category,
          extension,
          operationalStatus,
          resourceType,
          calibration,
          parent,
          text);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean measurementPeriodIsSet() {
      return (optBits & OPT_BIT_MEASUREMENT_PERIOD) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean colorIsSet() {
      return (optBits & OPT_BIT_COLOR) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean operationalStatusIsSet() {
      return (optBits & OPT_BIT_OPERATIONAL_STATUS) != 0;
    }

    private boolean calibrationIsSet() {
      return (optBits & OPT_BIT_CALIBRATION) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceMetric is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DeviceMetric, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DeviceMetric", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceMetric#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage type(CodeableConcept type);
  }

  @Generated(from = "DeviceMetric", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceMetric#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "DeviceMetric", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceMetric#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link DeviceMetric#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link DeviceMetric#measurementPeriod() measurementPeriod} to measurementPeriod.
     * @param measurementPeriod The value for measurementPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal measurementPeriod(Timing measurementPeriod);

    /**
     * Initializes the optional value {@link DeviceMetric#measurementPeriod() measurementPeriod} to measurementPeriod.
     * @param measurementPeriod The value for measurementPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal measurementPeriod(Optional<? extends Timing> measurementPeriod);

    /**
     * Initializes the optional value {@link DeviceMetric#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link DeviceMetric#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link DeviceMetric#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceMetric#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceMetric#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(Reference source);

    /**
     * Initializes the optional value {@link DeviceMetric#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(Optional<? extends Reference> source);

    /**
     * Initializes the optional value {@link DeviceMetric#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link DeviceMetric#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link DeviceMetric#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for chained invocation
     */
    BuildFinal color(DevicemetricColor color);

    /**
     * Initializes the optional value {@link DeviceMetric#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal color(Optional<? extends DevicemetricColor> color);

    /**
     * Initializes the optional value {@link DeviceMetric#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link DeviceMetric#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link DeviceMetric#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unit(CodeableConcept unit);

    /**
     * Initializes the optional value {@link DeviceMetric#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unit(Optional<? extends CodeableConcept> unit);

    /**
     * Initializes the optional value {@link DeviceMetric#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link DeviceMetric#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link DeviceMetric#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link DeviceMetric#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link DeviceMetric#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(DevicemetricCategory category);

    /**
     * Initializes the optional value {@link DeviceMetric#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends DevicemetricCategory> category);

    /**
     * Initializes the optional value {@link DeviceMetric#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DeviceMetric#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DeviceMetric#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal operationalStatus(DevicemetricOperationalstatus operationalStatus);

    /**
     * Initializes the optional value {@link DeviceMetric#operationalStatus() operationalStatus} to operationalStatus.
     * @param operationalStatus The value for operationalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal operationalStatus(Optional<? extends DevicemetricOperationalstatus> operationalStatus);

    /**
     * Initializes the optional value {@link DeviceMetric#calibration() calibration} to calibration.
     * @param calibration The value for calibration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal calibration(List<DeviceMetric_Calibration> calibration);

    /**
     * Initializes the optional value {@link DeviceMetric#calibration() calibration} to calibration.
     * @param calibration The value for calibration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal calibration(Optional<? extends List<DeviceMetric_Calibration>> calibration);

    /**
     * Initializes the optional value {@link DeviceMetric#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(Reference parent);

    /**
     * Initializes the optional value {@link DeviceMetric#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(Optional<? extends Reference> parent);

    /**
     * Initializes the optional value {@link DeviceMetric#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link DeviceMetric#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Builds a new {@link DeviceMetric DeviceMetric}.
     * @return An immutable instance of DeviceMetric
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceMetric build();
  }
}
