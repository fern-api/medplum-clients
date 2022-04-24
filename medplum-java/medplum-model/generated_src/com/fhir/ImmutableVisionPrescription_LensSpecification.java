//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link VisionPrescription_LensSpecification}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVisionPrescription_LensSpecification.builder()}.
 */
@org.immutables.value.Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVisionPrescription_LensSpecification
    implements com.fhir.VisionPrescription_LensSpecification {
  private final @javax.annotation.Nullable com.fhir.decimal diameter;
  private final @javax.annotation.Nullable com.fhir.decimal add;
  private final @javax.annotation.Nullable java.lang.String color;
  private final @javax.annotation.Nullable java.lang.Integer axis;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.decimal sphere;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.Quantity duration;
  private final @javax.annotation.Nullable com.fhir.decimal power;
  private final @javax.annotation.Nullable java.lang.String brand;
  private final com.fhir.CodeableConcept product;
  private final @javax.annotation.Nullable com.fhir.Visionprescription_lensspecificationEye eye;
  private final @javax.annotation.Nullable com.fhir.decimal backCurve;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.VisionPrescription_Prism> prism;
  private final @javax.annotation.Nullable com.fhir.decimal cylinder;

  private ImmutableVisionPrescription_LensSpecification(
      @javax.annotation.Nullable com.fhir.decimal diameter,
      @javax.annotation.Nullable com.fhir.decimal add,
      @javax.annotation.Nullable java.lang.String color,
      @javax.annotation.Nullable java.lang.Integer axis,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.decimal sphere,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.Quantity duration,
      @javax.annotation.Nullable com.fhir.decimal power,
      @javax.annotation.Nullable java.lang.String brand,
      com.fhir.CodeableConcept product,
      @javax.annotation.Nullable com.fhir.Visionprescription_lensspecificationEye eye,
      @javax.annotation.Nullable com.fhir.decimal backCurve,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.VisionPrescription_Prism> prism,
      @javax.annotation.Nullable com.fhir.decimal cylinder) {
    this.diameter = diameter;
    this.add = add;
    this.color = color;
    this.axis = axis;
    this.extension = extension;
    this.sphere = sphere;
    this.note = note;
    this.duration = duration;
    this.power = power;
    this.brand = brand;
    this.product = product;
    this.eye = eye;
    this.backCurve = backCurve;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.prism = prism;
    this.cylinder = cylinder;
  }

  /**
   * @return The value of the {@code diameter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diameter")
  @Override
  public java.util.Optional<com.fhir.decimal> diameter() {
    return java.util.Optional.ofNullable(diameter);
  }

  /**
   * @return The value of the {@code add} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("add")
  @Override
  public java.util.Optional<com.fhir.decimal> add() {
    return java.util.Optional.ofNullable(add);
  }

  /**
   * @return The value of the {@code color} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("color")
  @Override
  public java.util.Optional<java.lang.String> color() {
    return java.util.Optional.ofNullable(color);
  }

  /**
   * @return The value of the {@code axis} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("axis")
  @Override
  public java.util.Optional<java.lang.Integer> axis() {
    return java.util.Optional.ofNullable(axis);
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
   * @return The value of the {@code sphere} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sphere")
  @Override
  public java.util.Optional<com.fhir.decimal> sphere() {
    return java.util.Optional.ofNullable(sphere);
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
   * @return The value of the {@code duration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("duration")
  @Override
  public java.util.Optional<com.fhir.Quantity> duration() {
    return java.util.Optional.ofNullable(duration);
  }

  /**
   * @return The value of the {@code power} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("power")
  @Override
  public java.util.Optional<com.fhir.decimal> power() {
    return java.util.Optional.ofNullable(power);
  }

  /**
   * @return The value of the {@code brand} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("brand")
  @Override
  public java.util.Optional<java.lang.String> brand() {
    return java.util.Optional.ofNullable(brand);
  }

  /**
   * @return The value of the {@code product} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("product")
  @Override
  public com.fhir.CodeableConcept product() {
    return product;
  }

  /**
   * @return The value of the {@code eye} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("eye")
  @Override
  public java.util.Optional<com.fhir.Visionprescription_lensspecificationEye> eye() {
    return java.util.Optional.ofNullable(eye);
  }

  /**
   * @return The value of the {@code backCurve} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("backCurve")
  @Override
  public java.util.Optional<com.fhir.decimal> backCurve() {
    return java.util.Optional.ofNullable(backCurve);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code prism} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("prism")
  @Override
  public java.util.Optional<java.util.List<com.fhir.VisionPrescription_Prism>> prism() {
    return java.util.Optional.ofNullable(prism);
  }

  /**
   * @return The value of the {@code cylinder} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cylinder")
  @Override
  public java.util.Optional<com.fhir.decimal> cylinder() {
    return java.util.Optional.ofNullable(cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#diameter() diameter} attribute.
   * @param value The value for diameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withDiameter(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "diameter");
    if (this.diameter == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        newValue,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#diameter() diameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withDiameter(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.diameter == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        value,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#add() add} attribute.
   * @param value The value for add
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withAdd(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "add");
    if (this.add == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        newValue,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#add() add} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for add
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withAdd(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.add == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        value,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#color() color} attribute.
   * @param value The value for color
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withColor(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "color");
    if (java.util.Objects.equals(this.color, newValue)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        newValue,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#color() color} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for color
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withColor(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.color, value)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        value,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#axis() axis} attribute.
   * @param value The value for axis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withAxis(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.axis, newValue)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        newValue,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#axis() axis} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for axis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withAxis(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.axis, value)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        value,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        newValue,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        value,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#sphere() sphere} attribute.
   * @param value The value for sphere
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withSphere(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "sphere");
    if (this.sphere == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        newValue,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#sphere() sphere} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sphere
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withSphere(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.sphere == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        value,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        newValue,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        value,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withDuration(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        newValue,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withDuration(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        value,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#power() power} attribute.
   * @param value The value for power
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withPower(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "power");
    if (this.power == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        newValue,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#power() power} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for power
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withPower(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.power == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        value,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#brand() brand} attribute.
   * @param value The value for brand
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withBrand(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "brand");
    if (java.util.Objects.equals(this.brand, newValue)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        newValue,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#brand() brand} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for brand
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withBrand(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.brand, value)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        value,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VisionPrescription_LensSpecification#product() product} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for product
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withProduct(com.fhir.CodeableConcept value) {
    if (this.product == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "product");
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        newValue,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#eye() eye} attribute.
   * @param value The value for eye
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withEye(com.fhir.Visionprescription_lensspecificationEye value) {
    @javax.annotation.Nullable com.fhir.Visionprescription_lensspecificationEye newValue = java.util.Objects.requireNonNull(value, "eye");
    if (this.eye == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        newValue,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#eye() eye} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eye
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withEye(java.util.Optional<? extends com.fhir.Visionprescription_lensspecificationEye> optional) {
    @javax.annotation.Nullable com.fhir.Visionprescription_lensspecificationEye value = optional.orElse(null);
    if (this.eye == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        value,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#backCurve() backCurve} attribute.
   * @param value The value for backCurve
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withBackCurve(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "backCurve");
    if (this.backCurve == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        newValue,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#backCurve() backCurve} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for backCurve
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withBackCurve(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.backCurve == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        value,
        this.id,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        newValue,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        value,
        this.modifierExtension,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        newValue,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        value,
        this.prism,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#prism() prism} attribute.
   * @param value The value for prism
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withPrism(java.util.List<com.fhir.VisionPrescription_Prism> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.VisionPrescription_Prism> newValue = java.util.Objects.requireNonNull(value, "prism");
    if (this.prism == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        newValue,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#prism() prism} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prism
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withPrism(java.util.Optional<? extends java.util.List<com.fhir.VisionPrescription_Prism>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.VisionPrescription_Prism> value = optional.orElse(null);
    if (this.prism == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        value,
        this.cylinder);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#cylinder() cylinder} attribute.
   * @param value The value for cylinder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withCylinder(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "cylinder");
    if (this.cylinder == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#cylinder() cylinder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cylinder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withCylinder(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.cylinder == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.diameter,
        this.add,
        this.color,
        this.axis,
        this.extension,
        this.sphere,
        this.note,
        this.duration,
        this.power,
        this.brand,
        this.product,
        this.eye,
        this.backCurve,
        this.id,
        this.modifierExtension,
        this.prism,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVisionPrescription_LensSpecification} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVisionPrescription_LensSpecification
        && equalTo((ImmutableVisionPrescription_LensSpecification) another);
  }

  private boolean equalTo(ImmutableVisionPrescription_LensSpecification another) {
    return java.util.Objects.equals(diameter, another.diameter)
        && java.util.Objects.equals(add, another.add)
        && java.util.Objects.equals(color, another.color)
        && java.util.Objects.equals(axis, another.axis)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(sphere, another.sphere)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(duration, another.duration)
        && java.util.Objects.equals(power, another.power)
        && java.util.Objects.equals(brand, another.brand)
        && product.equals(another.product)
        && java.util.Objects.equals(eye, another.eye)
        && java.util.Objects.equals(backCurve, another.backCurve)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(prism, another.prism)
        && java.util.Objects.equals(cylinder, another.cylinder);
  }

  /**
   * Computes a hash code from attributes: {@code diameter}, {@code add}, {@code color}, {@code axis}, {@code extension}, {@code sphere}, {@code note}, {@code duration}, {@code power}, {@code brand}, {@code product}, {@code eye}, {@code backCurve}, {@code id}, {@code modifierExtension}, {@code prism}, {@code cylinder}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(diameter);
    h += (h << 5) + java.util.Objects.hashCode(add);
    h += (h << 5) + java.util.Objects.hashCode(color);
    h += (h << 5) + java.util.Objects.hashCode(axis);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(sphere);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(duration);
    h += (h << 5) + java.util.Objects.hashCode(power);
    h += (h << 5) + java.util.Objects.hashCode(brand);
    h += (h << 5) + product.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(eye);
    h += (h << 5) + java.util.Objects.hashCode(backCurve);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(prism);
    h += (h << 5) + java.util.Objects.hashCode(cylinder);
    return h;
  }

  /**
   * Prints the immutable value {@code VisionPrescription_LensSpecification} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("VisionPrescription_LensSpecification{");
    if (diameter != null) {
      builder.append("diameter=").append(diameter);
    }
    if (add != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("add=").append(add);
    }
    if (color != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("color=").append(color);
    }
    if (axis != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("axis=").append(axis);
    }
    if (extension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (sphere != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("sphere=").append(sphere);
    }
    if (note != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (duration != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("duration=").append(duration);
    }
    if (power != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("power=").append(power);
    }
    if (brand != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("brand=").append(brand);
    }
    if (builder.length() > 37) builder.append(", ");
    builder.append("product=").append(product);
    if (eye != null) {
      builder.append(", ");
      builder.append("eye=").append(eye);
    }
    if (backCurve != null) {
      builder.append(", ");
      builder.append("backCurve=").append(backCurve);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (prism != null) {
      builder.append(", ");
      builder.append("prism=").append(prism);
    }
    if (cylinder != null) {
      builder.append(", ");
      builder.append("cylinder=").append(cylinder);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.VisionPrescription_LensSpecification {
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> diameter = java.util.Optional.empty();
    boolean diameterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> add = java.util.Optional.empty();
    boolean addIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> color = java.util.Optional.empty();
    boolean colorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> axis = java.util.Optional.empty();
    boolean axisIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> sphere = java.util.Optional.empty();
    boolean sphereIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> duration = java.util.Optional.empty();
    boolean durationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> power = java.util.Optional.empty();
    boolean powerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> brand = java.util.Optional.empty();
    boolean brandIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept product;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Visionprescription_lensspecificationEye> eye = java.util.Optional.empty();
    boolean eyeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> backCurve = java.util.Optional.empty();
    boolean backCurveIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.VisionPrescription_Prism>> prism = java.util.Optional.empty();
    boolean prismIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> cylinder = java.util.Optional.empty();
    boolean cylinderIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("diameter")
    public void setDiameter(java.util.Optional<com.fhir.decimal> diameter) {
      this.diameter = diameter;
      this.diameterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("add")
    public void setAdd(java.util.Optional<com.fhir.decimal> add) {
      this.add = add;
      this.addIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("color")
    public void setColor(java.util.Optional<java.lang.String> color) {
      this.color = color;
      this.colorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("axis")
    public void setAxis(java.util.Optional<java.lang.Integer> axis) {
      this.axis = axis;
      this.axisIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sphere")
    public void setSphere(java.util.Optional<com.fhir.decimal> sphere) {
      this.sphere = sphere;
      this.sphereIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public void setDuration(java.util.Optional<com.fhir.Quantity> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("power")
    public void setPower(java.util.Optional<com.fhir.decimal> power) {
      this.power = power;
      this.powerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("brand")
    public void setBrand(java.util.Optional<java.lang.String> brand) {
      this.brand = brand;
      this.brandIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    public void setProduct(com.fhir.CodeableConcept product) {
      this.product = product;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("eye")
    public void setEye(java.util.Optional<com.fhir.Visionprescription_lensspecificationEye> eye) {
      this.eye = eye;
      this.eyeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("backCurve")
    public void setBackCurve(java.util.Optional<com.fhir.decimal> backCurve) {
      this.backCurve = backCurve;
      this.backCurveIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prism")
    public void setPrism(java.util.Optional<java.util.List<com.fhir.VisionPrescription_Prism>> prism) {
      this.prism = prism;
      this.prismIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("cylinder")
    public void setCylinder(java.util.Optional<com.fhir.decimal> cylinder) {
      this.cylinder = cylinder;
      this.cylinderIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.decimal> diameter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> add() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> color() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> axis() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> sphere() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> duration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> power() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> brand() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept product() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Visionprescription_lensspecificationEye> eye() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> backCurve() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.VisionPrescription_Prism>> prism() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> cylinder() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableVisionPrescription_LensSpecification fromJson(Json json) {
    ImmutableVisionPrescription_LensSpecification.Builder builder = ((ImmutableVisionPrescription_LensSpecification.Builder) ImmutableVisionPrescription_LensSpecification.builder());
    if (json.diameterIsSet) {
      builder.diameter(json.diameter);
    }
    if (json.addIsSet) {
      builder.add(json.add);
    }
    if (json.colorIsSet) {
      builder.color(json.color);
    }
    if (json.axisIsSet) {
      builder.axis(json.axis);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.sphereIsSet) {
      builder.sphere(json.sphere);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.powerIsSet) {
      builder.power(json.power);
    }
    if (json.brandIsSet) {
      builder.brand(json.brand);
    }
    if (json.product != null) {
      builder.product(json.product);
    }
    if (json.eyeIsSet) {
      builder.eye(json.eye);
    }
    if (json.backCurveIsSet) {
      builder.backCurve(json.backCurve);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.prismIsSet) {
      builder.prism(json.prism);
    }
    if (json.cylinderIsSet) {
      builder.cylinder(json.cylinder);
    }
    return (ImmutableVisionPrescription_LensSpecification) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link VisionPrescription_LensSpecification} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable VisionPrescription_LensSpecification instance
   */
  public static VisionPrescription_LensSpecification copyOf(VisionPrescription_LensSpecification instance) {
    if (instance instanceof ImmutableVisionPrescription_LensSpecification) {
      return (ImmutableVisionPrescription_LensSpecification) instance;
    }
    return ((ImmutableVisionPrescription_LensSpecification.Builder) ImmutableVisionPrescription_LensSpecification.builder())
        .diameter(instance.diameter())
        .add(instance.add())
        .color(instance.color())
        .axis(instance.axis())
        .extension(instance.extension())
        .sphere(instance.sphere())
        .note(instance.note())
        .duration(instance.duration())
        .power(instance.power())
        .brand(instance.brand())
        .product(instance.product())
        .eye(instance.eye())
        .backCurve(instance.backCurve())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .prism(instance.prism())
        .cylinder(instance.cylinder())
        .build();
  }

  /**
   * Creates a builder for {@link VisionPrescription_LensSpecification VisionPrescription_LensSpecification}.
   * <pre>
   * ImmutableVisionPrescription_LensSpecification.builder()
   *    .diameter(com.fhir.decimal) // optional {@link VisionPrescription_LensSpecification#diameter() diameter}
   *    .add(com.fhir.decimal) // optional {@link VisionPrescription_LensSpecification#add() add}
   *    .color(String) // optional {@link VisionPrescription_LensSpecification#color() color}
   *    .axis(Integer) // optional {@link VisionPrescription_LensSpecification#axis() axis}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VisionPrescription_LensSpecification#extension() extension}
   *    .sphere(com.fhir.decimal) // optional {@link VisionPrescription_LensSpecification#sphere() sphere}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link VisionPrescription_LensSpecification#note() note}
   *    .duration(com.fhir.Quantity) // optional {@link VisionPrescription_LensSpecification#duration() duration}
   *    .power(com.fhir.decimal) // optional {@link VisionPrescription_LensSpecification#power() power}
   *    .brand(String) // optional {@link VisionPrescription_LensSpecification#brand() brand}
   *    .product(com.fhir.CodeableConcept) // required {@link VisionPrescription_LensSpecification#product() product}
   *    .eye(com.fhir.Visionprescription_lensspecificationEye) // optional {@link VisionPrescription_LensSpecification#eye() eye}
   *    .backCurve(com.fhir.decimal) // optional {@link VisionPrescription_LensSpecification#backCurve() backCurve}
   *    .id(String) // optional {@link VisionPrescription_LensSpecification#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension}
   *    .prism(List&amp;lt;com.fhir.VisionPrescription_Prism&amp;gt;) // optional {@link VisionPrescription_LensSpecification#prism() prism}
   *    .cylinder(com.fhir.decimal) // optional {@link VisionPrescription_LensSpecification#cylinder() cylinder}
   *    .build();
   * </pre>
   * @return A new VisionPrescription_LensSpecification builder
   */
  public static ProductBuildStage builder() {
    return new ImmutableVisionPrescription_LensSpecification.Builder();
  }

  /**
   * Builds instances of type {@link VisionPrescription_LensSpecification VisionPrescription_LensSpecification}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ProductBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT = 0x1L;
    private static final long OPT_BIT_DIAMETER = 0x1L;
    private static final long OPT_BIT_ADD = 0x2L;
    private static final long OPT_BIT_COLOR = 0x4L;
    private static final long OPT_BIT_AXIS = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_SPHERE = 0x20L;
    private static final long OPT_BIT_NOTE = 0x40L;
    private static final long OPT_BIT_DURATION = 0x80L;
    private static final long OPT_BIT_POWER = 0x100L;
    private static final long OPT_BIT_BRAND = 0x200L;
    private static final long OPT_BIT_EYE = 0x400L;
    private static final long OPT_BIT_BACK_CURVE = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_PRISM = 0x4000L;
    private static final long OPT_BIT_CYLINDER = 0x8000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.decimal diameter;
    private @javax.annotation.Nullable com.fhir.decimal add;
    private @javax.annotation.Nullable java.lang.String color;
    private @javax.annotation.Nullable java.lang.Integer axis;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.decimal sphere;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.Quantity duration;
    private @javax.annotation.Nullable com.fhir.decimal power;
    private @javax.annotation.Nullable java.lang.String brand;
    private @javax.annotation.Nullable com.fhir.CodeableConcept product;
    private @javax.annotation.Nullable com.fhir.Visionprescription_lensspecificationEye eye;
    private @javax.annotation.Nullable com.fhir.decimal backCurve;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.VisionPrescription_Prism> prism;
    private @javax.annotation.Nullable com.fhir.decimal cylinder;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#diameter() diameter} to diameter.
     * @param diameter The value for diameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder diameter(com.fhir.decimal diameter) {
      checkNotIsSet(diameterIsSet(), "diameter");
      this.diameter = java.util.Objects.requireNonNull(diameter, "diameter");
      optBits |= OPT_BIT_DIAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#diameter() diameter} to diameter.
     * @param diameter The value for diameter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diameter")
    public final Builder diameter(java.util.Optional<? extends com.fhir.decimal> diameter) {
      checkNotIsSet(diameterIsSet(), "diameter");
      this.diameter = diameter.orElse(null);
      optBits |= OPT_BIT_DIAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#add() add} to add.
     * @param add The value for add
     * @return {@code this} builder for chained invocation
     */
    public final Builder add(com.fhir.decimal add) {
      checkNotIsSet(addIsSet(), "add");
      this.add = java.util.Objects.requireNonNull(add, "add");
      optBits |= OPT_BIT_ADD;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#add() add} to add.
     * @param add The value for add
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("add")
    public final Builder add(java.util.Optional<? extends com.fhir.decimal> add) {
      checkNotIsSet(addIsSet(), "add");
      this.add = add.orElse(null);
      optBits |= OPT_BIT_ADD;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for chained invocation
     */
    public final Builder color(java.lang.String color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = java.util.Objects.requireNonNull(color, "color");
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("color")
    public final Builder color(java.util.Optional<java.lang.String> color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = color.orElse(null);
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#axis() axis} to axis.
     * @param axis The value for axis
     * @return {@code this} builder for chained invocation
     */
    public final Builder axis(int axis) {
      checkNotIsSet(axisIsSet(), "axis");
      this.axis = axis;
      optBits |= OPT_BIT_AXIS;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#axis() axis} to axis.
     * @param axis The value for axis
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("axis")
    public final Builder axis(java.util.Optional<java.lang.Integer> axis) {
      checkNotIsSet(axisIsSet(), "axis");
      this.axis = axis.orElse(null);
      optBits |= OPT_BIT_AXIS;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#sphere() sphere} to sphere.
     * @param sphere The value for sphere
     * @return {@code this} builder for chained invocation
     */
    public final Builder sphere(com.fhir.decimal sphere) {
      checkNotIsSet(sphereIsSet(), "sphere");
      this.sphere = java.util.Objects.requireNonNull(sphere, "sphere");
      optBits |= OPT_BIT_SPHERE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#sphere() sphere} to sphere.
     * @param sphere The value for sphere
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sphere")
    public final Builder sphere(java.util.Optional<? extends com.fhir.decimal> sphere) {
      checkNotIsSet(sphereIsSet(), "sphere");
      this.sphere = sphere.orElse(null);
      optBits |= OPT_BIT_SPHERE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#note() note} to note.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#note() note} to note.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(com.fhir.Quantity duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = java.util.Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public final Builder duration(java.util.Optional<? extends com.fhir.Quantity> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#power() power} to power.
     * @param power The value for power
     * @return {@code this} builder for chained invocation
     */
    public final Builder power(com.fhir.decimal power) {
      checkNotIsSet(powerIsSet(), "power");
      this.power = java.util.Objects.requireNonNull(power, "power");
      optBits |= OPT_BIT_POWER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#power() power} to power.
     * @param power The value for power
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("power")
    public final Builder power(java.util.Optional<? extends com.fhir.decimal> power) {
      checkNotIsSet(powerIsSet(), "power");
      this.power = power.orElse(null);
      optBits |= OPT_BIT_POWER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#brand() brand} to brand.
     * @param brand The value for brand
     * @return {@code this} builder for chained invocation
     */
    public final Builder brand(java.lang.String brand) {
      checkNotIsSet(brandIsSet(), "brand");
      this.brand = java.util.Objects.requireNonNull(brand, "brand");
      optBits |= OPT_BIT_BRAND;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#brand() brand} to brand.
     * @param brand The value for brand
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("brand")
    public final Builder brand(java.util.Optional<java.lang.String> brand) {
      checkNotIsSet(brandIsSet(), "brand");
      this.brand = brand.orElse(null);
      optBits |= OPT_BIT_BRAND;
      return this;
    }

    /**
     * Initializes the value for the {@link VisionPrescription_LensSpecification#product() product} attribute.
     * @param product The value for product 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    public final Builder product(com.fhir.CodeableConcept product) {
      checkNotIsSet(productIsSet(), "product");
      this.product = java.util.Objects.requireNonNull(product, "product");
      initBits &= ~INIT_BIT_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#eye() eye} to eye.
     * @param eye The value for eye
     * @return {@code this} builder for chained invocation
     */
    public final Builder eye(com.fhir.Visionprescription_lensspecificationEye eye) {
      checkNotIsSet(eyeIsSet(), "eye");
      this.eye = java.util.Objects.requireNonNull(eye, "eye");
      optBits |= OPT_BIT_EYE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#eye() eye} to eye.
     * @param eye The value for eye
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eye")
    public final Builder eye(java.util.Optional<? extends com.fhir.Visionprescription_lensspecificationEye> eye) {
      checkNotIsSet(eyeIsSet(), "eye");
      this.eye = eye.orElse(null);
      optBits |= OPT_BIT_EYE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#backCurve() backCurve} to backCurve.
     * @param backCurve The value for backCurve
     * @return {@code this} builder for chained invocation
     */
    public final Builder backCurve(com.fhir.decimal backCurve) {
      checkNotIsSet(backCurveIsSet(), "backCurve");
      this.backCurve = java.util.Objects.requireNonNull(backCurve, "backCurve");
      optBits |= OPT_BIT_BACK_CURVE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#backCurve() backCurve} to backCurve.
     * @param backCurve The value for backCurve
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backCurve")
    public final Builder backCurve(java.util.Optional<? extends com.fhir.decimal> backCurve) {
      checkNotIsSet(backCurveIsSet(), "backCurve");
      this.backCurve = backCurve.orElse(null);
      optBits |= OPT_BIT_BACK_CURVE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#prism() prism} to prism.
     * @param prism The value for prism
     * @return {@code this} builder for chained invocation
     */
    public final Builder prism(java.util.List<com.fhir.VisionPrescription_Prism> prism) {
      checkNotIsSet(prismIsSet(), "prism");
      this.prism = java.util.Objects.requireNonNull(prism, "prism");
      optBits |= OPT_BIT_PRISM;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#prism() prism} to prism.
     * @param prism The value for prism
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prism")
    public final Builder prism(java.util.Optional<? extends java.util.List<com.fhir.VisionPrescription_Prism>> prism) {
      checkNotIsSet(prismIsSet(), "prism");
      this.prism = prism.orElse(null);
      optBits |= OPT_BIT_PRISM;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#cylinder() cylinder} to cylinder.
     * @param cylinder The value for cylinder
     * @return {@code this} builder for chained invocation
     */
    public final Builder cylinder(com.fhir.decimal cylinder) {
      checkNotIsSet(cylinderIsSet(), "cylinder");
      this.cylinder = java.util.Objects.requireNonNull(cylinder, "cylinder");
      optBits |= OPT_BIT_CYLINDER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#cylinder() cylinder} to cylinder.
     * @param cylinder The value for cylinder
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cylinder")
    public final Builder cylinder(java.util.Optional<? extends com.fhir.decimal> cylinder) {
      checkNotIsSet(cylinderIsSet(), "cylinder");
      this.cylinder = cylinder.orElse(null);
      optBits |= OPT_BIT_CYLINDER;
      return this;
    }

    /**
     * Builds a new {@link VisionPrescription_LensSpecification VisionPrescription_LensSpecification}.
     * @return An immutable instance of VisionPrescription_LensSpecification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.VisionPrescription_LensSpecification build() {
      checkRequiredAttributes();
      return new ImmutableVisionPrescription_LensSpecification(
          diameter,
          add,
          color,
          axis,
          extension,
          sphere,
          note,
          duration,
          power,
          brand,
          product,
          eye,
          backCurve,
          id,
          modifierExtension,
          prism,
          cylinder);
    }

    private boolean diameterIsSet() {
      return (optBits & OPT_BIT_DIAMETER) != 0;
    }

    private boolean addIsSet() {
      return (optBits & OPT_BIT_ADD) != 0;
    }

    private boolean colorIsSet() {
      return (optBits & OPT_BIT_COLOR) != 0;
    }

    private boolean axisIsSet() {
      return (optBits & OPT_BIT_AXIS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sphereIsSet() {
      return (optBits & OPT_BIT_SPHERE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean powerIsSet() {
      return (optBits & OPT_BIT_POWER) != 0;
    }

    private boolean brandIsSet() {
      return (optBits & OPT_BIT_BRAND) != 0;
    }

    private boolean eyeIsSet() {
      return (optBits & OPT_BIT_EYE) != 0;
    }

    private boolean backCurveIsSet() {
      return (optBits & OPT_BIT_BACK_CURVE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean prismIsSet() {
      return (optBits & OPT_BIT_PRISM) != 0;
    }

    private boolean cylinderIsSet() {
      return (optBits & OPT_BIT_CYLINDER) != 0;
    }

    private boolean productIsSet() {
      return (initBits & INIT_BIT_PRODUCT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of VisionPrescription_LensSpecification is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!productIsSet()) attributes.add("product");
      return "Cannot build VisionPrescription_LensSpecification, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
  public interface ProductBuildStage {
    /**
     * Initializes the value for the {@link VisionPrescription_LensSpecification#product() product} attribute.
     * @param product The value for product 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal product(com.fhir.CodeableConcept product);
  }

  @org.immutables.value.Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#diameter() diameter} to diameter.
     * @param diameter The value for diameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diameter(com.fhir.decimal diameter);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#diameter() diameter} to diameter.
     * @param diameter The value for diameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diameter(java.util.Optional<? extends com.fhir.decimal> diameter);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#add() add} to add.
     * @param add The value for add
     * @return {@code this} builder for chained invocation
     */
    BuildFinal add(com.fhir.decimal add);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#add() add} to add.
     * @param add The value for add
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal add(java.util.Optional<? extends com.fhir.decimal> add);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for chained invocation
     */
    BuildFinal color(java.lang.String color);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal color(java.util.Optional<java.lang.String> color);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#axis() axis} to axis.
     * @param axis The value for axis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal axis(int axis);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#axis() axis} to axis.
     * @param axis The value for axis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal axis(java.util.Optional<java.lang.Integer> axis);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#sphere() sphere} to sphere.
     * @param sphere The value for sphere
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sphere(com.fhir.decimal sphere);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#sphere() sphere} to sphere.
     * @param sphere The value for sphere
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sphere(java.util.Optional<? extends com.fhir.decimal> sphere);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal duration(com.fhir.Quantity duration);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal duration(java.util.Optional<? extends com.fhir.Quantity> duration);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#power() power} to power.
     * @param power The value for power
     * @return {@code this} builder for chained invocation
     */
    BuildFinal power(com.fhir.decimal power);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#power() power} to power.
     * @param power The value for power
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal power(java.util.Optional<? extends com.fhir.decimal> power);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#brand() brand} to brand.
     * @param brand The value for brand
     * @return {@code this} builder for chained invocation
     */
    BuildFinal brand(java.lang.String brand);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#brand() brand} to brand.
     * @param brand The value for brand
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal brand(java.util.Optional<java.lang.String> brand);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#eye() eye} to eye.
     * @param eye The value for eye
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eye(com.fhir.Visionprescription_lensspecificationEye eye);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#eye() eye} to eye.
     * @param eye The value for eye
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eye(java.util.Optional<? extends com.fhir.Visionprescription_lensspecificationEye> eye);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#backCurve() backCurve} to backCurve.
     * @param backCurve The value for backCurve
     * @return {@code this} builder for chained invocation
     */
    BuildFinal backCurve(com.fhir.decimal backCurve);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#backCurve() backCurve} to backCurve.
     * @param backCurve The value for backCurve
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal backCurve(java.util.Optional<? extends com.fhir.decimal> backCurve);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#prism() prism} to prism.
     * @param prism The value for prism
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prism(java.util.List<com.fhir.VisionPrescription_Prism> prism);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#prism() prism} to prism.
     * @param prism The value for prism
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prism(java.util.Optional<? extends java.util.List<com.fhir.VisionPrescription_Prism>> prism);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#cylinder() cylinder} to cylinder.
     * @param cylinder The value for cylinder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal cylinder(com.fhir.decimal cylinder);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#cylinder() cylinder} to cylinder.
     * @param cylinder The value for cylinder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal cylinder(java.util.Optional<? extends com.fhir.decimal> cylinder);

    /**
     * Builds a new {@link VisionPrescription_LensSpecification VisionPrescription_LensSpecification}.
     * @return An immutable instance of VisionPrescription_LensSpecification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    VisionPrescription_LensSpecification build();
  }
}
