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
 * Immutable implementation of {@link VisionPrescription_LensSpecification}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVisionPrescription_LensSpecification.builder()}.
 */
@Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVisionPrescription_LensSpecification
    implements VisionPrescription_LensSpecification {
  private final @Nullable Decimal add;
  private final @Nullable Decimal power;
  private final @Nullable String id;
  private final @Nullable Quantity duration;
  private final @Nullable Integer axis;
  private final @Nullable List<Extension> modifierExtension;
  private final CodeableConcept product;
  private final @Nullable Visionprescription_lensspecificationEye eye;
  private final @Nullable Decimal cylinder;
  private final @Nullable List<VisionPrescription_Prism> prism;
  private final @Nullable Decimal sphere;
  private final @Nullable List<Extension> extension;
  private final @Nullable Decimal backCurve;
  private final @Nullable String color;
  private final @Nullable Decimal diameter;
  private final @Nullable List<Annotation> note;
  private final @Nullable String brand;

  private ImmutableVisionPrescription_LensSpecification(
      @Nullable Decimal add,
      @Nullable Decimal power,
      @Nullable String id,
      @Nullable Quantity duration,
      @Nullable Integer axis,
      @Nullable List<Extension> modifierExtension,
      CodeableConcept product,
      @Nullable Visionprescription_lensspecificationEye eye,
      @Nullable Decimal cylinder,
      @Nullable List<VisionPrescription_Prism> prism,
      @Nullable Decimal sphere,
      @Nullable List<Extension> extension,
      @Nullable Decimal backCurve,
      @Nullable String color,
      @Nullable Decimal diameter,
      @Nullable List<Annotation> note,
      @Nullable String brand) {
    this.add = add;
    this.power = power;
    this.id = id;
    this.duration = duration;
    this.axis = axis;
    this.modifierExtension = modifierExtension;
    this.product = product;
    this.eye = eye;
    this.cylinder = cylinder;
    this.prism = prism;
    this.sphere = sphere;
    this.extension = extension;
    this.backCurve = backCurve;
    this.color = color;
    this.diameter = diameter;
    this.note = note;
    this.brand = brand;
  }

  /**
   * @return The value of the {@code add} attribute
   */
  @JsonProperty("add")
  @Override
  public Optional<Decimal> add() {
    return Optional.ofNullable(add);
  }

  /**
   * @return The value of the {@code power} attribute
   */
  @JsonProperty("power")
  @Override
  public Optional<Decimal> power() {
    return Optional.ofNullable(power);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code duration} attribute
   */
  @JsonProperty("duration")
  @Override
  public Optional<Quantity> duration() {
    return Optional.ofNullable(duration);
  }

  /**
   * @return The value of the {@code axis} attribute
   */
  @JsonProperty("axis")
  @Override
  public Optional<Integer> axis() {
    return Optional.ofNullable(axis);
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
   * @return The value of the {@code product} attribute
   */
  @JsonProperty("product")
  @Override
  public CodeableConcept product() {
    return product;
  }

  /**
   * @return The value of the {@code eye} attribute
   */
  @JsonProperty("eye")
  @Override
  public Optional<Visionprescription_lensspecificationEye> eye() {
    return Optional.ofNullable(eye);
  }

  /**
   * @return The value of the {@code cylinder} attribute
   */
  @JsonProperty("cylinder")
  @Override
  public Optional<Decimal> cylinder() {
    return Optional.ofNullable(cylinder);
  }

  /**
   * @return The value of the {@code prism} attribute
   */
  @JsonProperty("prism")
  @Override
  public Optional<List<VisionPrescription_Prism>> prism() {
    return Optional.ofNullable(prism);
  }

  /**
   * @return The value of the {@code sphere} attribute
   */
  @JsonProperty("sphere")
  @Override
  public Optional<Decimal> sphere() {
    return Optional.ofNullable(sphere);
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
   * @return The value of the {@code backCurve} attribute
   */
  @JsonProperty("backCurve")
  @Override
  public Optional<Decimal> backCurve() {
    return Optional.ofNullable(backCurve);
  }

  /**
   * @return The value of the {@code color} attribute
   */
  @JsonProperty("color")
  @Override
  public Optional<String> color() {
    return Optional.ofNullable(color);
  }

  /**
   * @return The value of the {@code diameter} attribute
   */
  @JsonProperty("diameter")
  @Override
  public Optional<Decimal> diameter() {
    return Optional.ofNullable(diameter);
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
   * @return The value of the {@code brand} attribute
   */
  @JsonProperty("brand")
  @Override
  public Optional<String> brand() {
    return Optional.ofNullable(brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#add() add} attribute.
   * @param value The value for add
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withAdd(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "add");
    if (this.add == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        newValue,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#add() add} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for add
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withAdd(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.add == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        value,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#power() power} attribute.
   * @param value The value for power
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withPower(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "power");
    if (this.power == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        newValue,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#power() power} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for power
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withPower(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.power == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        value,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        newValue,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        value,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withDuration(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        newValue,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withDuration(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        value,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#axis() axis} attribute.
   * @param value The value for axis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withAxis(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.axis, newValue)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        newValue,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#axis() axis} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for axis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withAxis(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.axis, value)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        value,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        newValue,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        value,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VisionPrescription_LensSpecification#product() product} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for product
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withProduct(CodeableConcept value) {
    if (this.product == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "product");
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        newValue,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#eye() eye} attribute.
   * @param value The value for eye
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withEye(Visionprescription_lensspecificationEye value) {
    @Nullable Visionprescription_lensspecificationEye newValue = Objects.requireNonNull(value, "eye");
    if (this.eye == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        newValue,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#eye() eye} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eye
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withEye(Optional<? extends Visionprescription_lensspecificationEye> optional) {
    @Nullable Visionprescription_lensspecificationEye value = optional.orElse(null);
    if (this.eye == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        value,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#cylinder() cylinder} attribute.
   * @param value The value for cylinder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withCylinder(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "cylinder");
    if (this.cylinder == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        newValue,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#cylinder() cylinder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cylinder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withCylinder(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.cylinder == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        value,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#prism() prism} attribute.
   * @param value The value for prism
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withPrism(List<VisionPrescription_Prism> value) {
    @Nullable List<VisionPrescription_Prism> newValue = Objects.requireNonNull(value, "prism");
    if (this.prism == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        newValue,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#prism() prism} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prism
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withPrism(Optional<? extends List<VisionPrescription_Prism>> optional) {
    @Nullable List<VisionPrescription_Prism> value = optional.orElse(null);
    if (this.prism == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        value,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#sphere() sphere} attribute.
   * @param value The value for sphere
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withSphere(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "sphere");
    if (this.sphere == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        newValue,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#sphere() sphere} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sphere
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withSphere(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.sphere == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        value,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        newValue,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        value,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#backCurve() backCurve} attribute.
   * @param value The value for backCurve
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withBackCurve(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "backCurve");
    if (this.backCurve == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        newValue,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#backCurve() backCurve} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for backCurve
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withBackCurve(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.backCurve == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        value,
        this.color,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#color() color} attribute.
   * @param value The value for color
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withColor(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "color");
    if (Objects.equals(this.color, newValue)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        newValue,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#color() color} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for color
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withColor(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.color, value)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        value,
        this.diameter,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#diameter() diameter} attribute.
   * @param value The value for diameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withDiameter(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "diameter");
    if (this.diameter == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        newValue,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#diameter() diameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withDiameter(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.diameter == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        value,
        this.note,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        newValue,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_LensSpecification withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        value,
        this.brand);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_LensSpecification#brand() brand} attribute.
   * @param value The value for brand
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withBrand(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "brand");
    if (Objects.equals(this.brand, newValue)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_LensSpecification#brand() brand} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for brand
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_LensSpecification withBrand(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.brand, value)) return this;
    return new ImmutableVisionPrescription_LensSpecification(
        this.add,
        this.power,
        this.id,
        this.duration,
        this.axis,
        this.modifierExtension,
        this.product,
        this.eye,
        this.cylinder,
        this.prism,
        this.sphere,
        this.extension,
        this.backCurve,
        this.color,
        this.diameter,
        this.note,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVisionPrescription_LensSpecification} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVisionPrescription_LensSpecification
        && equalTo((ImmutableVisionPrescription_LensSpecification) another);
  }

  private boolean equalTo(ImmutableVisionPrescription_LensSpecification another) {
    return Objects.equals(add, another.add)
        && Objects.equals(power, another.power)
        && Objects.equals(id, another.id)
        && Objects.equals(duration, another.duration)
        && Objects.equals(axis, another.axis)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && product.equals(another.product)
        && Objects.equals(eye, another.eye)
        && Objects.equals(cylinder, another.cylinder)
        && Objects.equals(prism, another.prism)
        && Objects.equals(sphere, another.sphere)
        && Objects.equals(extension, another.extension)
        && Objects.equals(backCurve, another.backCurve)
        && Objects.equals(color, another.color)
        && Objects.equals(diameter, another.diameter)
        && Objects.equals(note, another.note)
        && Objects.equals(brand, another.brand);
  }

  /**
   * Computes a hash code from attributes: {@code add}, {@code power}, {@code id}, {@code duration}, {@code axis}, {@code modifierExtension}, {@code product}, {@code eye}, {@code cylinder}, {@code prism}, {@code sphere}, {@code extension}, {@code backCurve}, {@code color}, {@code diameter}, {@code note}, {@code brand}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(add);
    h += (h << 5) + Objects.hashCode(power);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(duration);
    h += (h << 5) + Objects.hashCode(axis);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + product.hashCode();
    h += (h << 5) + Objects.hashCode(eye);
    h += (h << 5) + Objects.hashCode(cylinder);
    h += (h << 5) + Objects.hashCode(prism);
    h += (h << 5) + Objects.hashCode(sphere);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(backCurve);
    h += (h << 5) + Objects.hashCode(color);
    h += (h << 5) + Objects.hashCode(diameter);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(brand);
    return h;
  }

  /**
   * Prints the immutable value {@code VisionPrescription_LensSpecification} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("VisionPrescription_LensSpecification{");
    if (add != null) {
      builder.append("add=").append(add);
    }
    if (power != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("power=").append(power);
    }
    if (id != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (duration != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("duration=").append(duration);
    }
    if (axis != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("axis=").append(axis);
    }
    if (modifierExtension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 37) builder.append(", ");
    builder.append("product=").append(product);
    if (eye != null) {
      builder.append(", ");
      builder.append("eye=").append(eye);
    }
    if (cylinder != null) {
      builder.append(", ");
      builder.append("cylinder=").append(cylinder);
    }
    if (prism != null) {
      builder.append(", ");
      builder.append("prism=").append(prism);
    }
    if (sphere != null) {
      builder.append(", ");
      builder.append("sphere=").append(sphere);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (backCurve != null) {
      builder.append(", ");
      builder.append("backCurve=").append(backCurve);
    }
    if (color != null) {
      builder.append(", ");
      builder.append("color=").append(color);
    }
    if (diameter != null) {
      builder.append(", ");
      builder.append("diameter=").append(diameter);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (brand != null) {
      builder.append(", ");
      builder.append("brand=").append(brand);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements VisionPrescription_LensSpecification {
    @Nullable Optional<Decimal> add = Optional.empty();
    boolean addIsSet;
    @Nullable Optional<Decimal> power = Optional.empty();
    boolean powerIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Quantity> duration = Optional.empty();
    boolean durationIsSet;
    @Nullable Optional<Integer> axis = Optional.empty();
    boolean axisIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable CodeableConcept product;
    @Nullable Optional<Visionprescription_lensspecificationEye> eye = Optional.empty();
    boolean eyeIsSet;
    @Nullable Optional<Decimal> cylinder = Optional.empty();
    boolean cylinderIsSet;
    @Nullable Optional<List<VisionPrescription_Prism>> prism = Optional.empty();
    boolean prismIsSet;
    @Nullable Optional<Decimal> sphere = Optional.empty();
    boolean sphereIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Decimal> backCurve = Optional.empty();
    boolean backCurveIsSet;
    @Nullable Optional<String> color = Optional.empty();
    boolean colorIsSet;
    @Nullable Optional<Decimal> diameter = Optional.empty();
    boolean diameterIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<String> brand = Optional.empty();
    boolean brandIsSet;
    @JsonProperty("add")
    public void setAdd(Optional<Decimal> add) {
      this.add = add;
      this.addIsSet = true;
    }
    @JsonProperty("power")
    public void setPower(Optional<Decimal> power) {
      this.power = power;
      this.powerIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("duration")
    public void setDuration(Optional<Quantity> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @JsonProperty("axis")
    public void setAxis(Optional<Integer> axis) {
      this.axis = axis;
      this.axisIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("product")
    public void setProduct(CodeableConcept product) {
      this.product = product;
    }
    @JsonProperty("eye")
    public void setEye(Optional<Visionprescription_lensspecificationEye> eye) {
      this.eye = eye;
      this.eyeIsSet = true;
    }
    @JsonProperty("cylinder")
    public void setCylinder(Optional<Decimal> cylinder) {
      this.cylinder = cylinder;
      this.cylinderIsSet = true;
    }
    @JsonProperty("prism")
    public void setPrism(Optional<List<VisionPrescription_Prism>> prism) {
      this.prism = prism;
      this.prismIsSet = true;
    }
    @JsonProperty("sphere")
    public void setSphere(Optional<Decimal> sphere) {
      this.sphere = sphere;
      this.sphereIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("backCurve")
    public void setBackCurve(Optional<Decimal> backCurve) {
      this.backCurve = backCurve;
      this.backCurveIsSet = true;
    }
    @JsonProperty("color")
    public void setColor(Optional<String> color) {
      this.color = color;
      this.colorIsSet = true;
    }
    @JsonProperty("diameter")
    public void setDiameter(Optional<Decimal> diameter) {
      this.diameter = diameter;
      this.diameterIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("brand")
    public void setBrand(Optional<String> brand) {
      this.brand = brand;
      this.brandIsSet = true;
    }
    @Override
    public Optional<Decimal> add() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> power() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> duration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> axis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept product() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Visionprescription_lensspecificationEye> eye() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> cylinder() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<VisionPrescription_Prism>> prism() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> sphere() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> backCurve() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> color() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> diameter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> brand() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableVisionPrescription_LensSpecification fromJson(Json json) {
    ImmutableVisionPrescription_LensSpecification.Builder builder = ((ImmutableVisionPrescription_LensSpecification.Builder) ImmutableVisionPrescription_LensSpecification.builder());
    if (json.addIsSet) {
      builder.add(json.add);
    }
    if (json.powerIsSet) {
      builder.power(json.power);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.axisIsSet) {
      builder.axis(json.axis);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.product != null) {
      builder.product(json.product);
    }
    if (json.eyeIsSet) {
      builder.eye(json.eye);
    }
    if (json.cylinderIsSet) {
      builder.cylinder(json.cylinder);
    }
    if (json.prismIsSet) {
      builder.prism(json.prism);
    }
    if (json.sphereIsSet) {
      builder.sphere(json.sphere);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.backCurveIsSet) {
      builder.backCurve(json.backCurve);
    }
    if (json.colorIsSet) {
      builder.color(json.color);
    }
    if (json.diameterIsSet) {
      builder.diameter(json.diameter);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.brandIsSet) {
      builder.brand(json.brand);
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
        .add(instance.add())
        .power(instance.power())
        .id(instance.id())
        .duration(instance.duration())
        .axis(instance.axis())
        .modifierExtension(instance.modifierExtension())
        .product(instance.product())
        .eye(instance.eye())
        .cylinder(instance.cylinder())
        .prism(instance.prism())
        .sphere(instance.sphere())
        .extension(instance.extension())
        .backCurve(instance.backCurve())
        .color(instance.color())
        .diameter(instance.diameter())
        .note(instance.note())
        .brand(instance.brand())
        .build();
  }

  /**
   * Creates a builder for {@link VisionPrescription_LensSpecification VisionPrescription_LensSpecification}.
   * <pre>
   * ImmutableVisionPrescription_LensSpecification.builder()
   *    .add(com.medplum.types.fhir.Decimal) // optional {@link VisionPrescription_LensSpecification#add() add}
   *    .power(com.medplum.types.fhir.Decimal) // optional {@link VisionPrescription_LensSpecification#power() power}
   *    .id(String) // optional {@link VisionPrescription_LensSpecification#id() id}
   *    .duration(com.medplum.types.fhir.Quantity) // optional {@link VisionPrescription_LensSpecification#duration() duration}
   *    .axis(Integer) // optional {@link VisionPrescription_LensSpecification#axis() axis}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension}
   *    .product(com.medplum.types.fhir.CodeableConcept) // required {@link VisionPrescription_LensSpecification#product() product}
   *    .eye(com.medplum.types.fhir.Visionprescription_lensspecificationEye) // optional {@link VisionPrescription_LensSpecification#eye() eye}
   *    .cylinder(com.medplum.types.fhir.Decimal) // optional {@link VisionPrescription_LensSpecification#cylinder() cylinder}
   *    .prism(List&amp;lt;com.medplum.types.fhir.VisionPrescription_Prism&amp;gt;) // optional {@link VisionPrescription_LensSpecification#prism() prism}
   *    .sphere(com.medplum.types.fhir.Decimal) // optional {@link VisionPrescription_LensSpecification#sphere() sphere}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VisionPrescription_LensSpecification#extension() extension}
   *    .backCurve(com.medplum.types.fhir.Decimal) // optional {@link VisionPrescription_LensSpecification#backCurve() backCurve}
   *    .color(String) // optional {@link VisionPrescription_LensSpecification#color() color}
   *    .diameter(com.medplum.types.fhir.Decimal) // optional {@link VisionPrescription_LensSpecification#diameter() diameter}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link VisionPrescription_LensSpecification#note() note}
   *    .brand(String) // optional {@link VisionPrescription_LensSpecification#brand() brand}
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
  @Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProductBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT = 0x1L;
    private static final long OPT_BIT_ADD = 0x1L;
    private static final long OPT_BIT_POWER = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_DURATION = 0x8L;
    private static final long OPT_BIT_AXIS = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_EYE = 0x40L;
    private static final long OPT_BIT_CYLINDER = 0x80L;
    private static final long OPT_BIT_PRISM = 0x100L;
    private static final long OPT_BIT_SPHERE = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_BACK_CURVE = 0x800L;
    private static final long OPT_BIT_COLOR = 0x1000L;
    private static final long OPT_BIT_DIAMETER = 0x2000L;
    private static final long OPT_BIT_NOTE = 0x4000L;
    private static final long OPT_BIT_BRAND = 0x8000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Decimal add;
    private @Nullable Decimal power;
    private @Nullable String id;
    private @Nullable Quantity duration;
    private @Nullable Integer axis;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept product;
    private @Nullable Visionprescription_lensspecificationEye eye;
    private @Nullable Decimal cylinder;
    private @Nullable List<VisionPrescription_Prism> prism;
    private @Nullable Decimal sphere;
    private @Nullable List<Extension> extension;
    private @Nullable Decimal backCurve;
    private @Nullable String color;
    private @Nullable Decimal diameter;
    private @Nullable List<Annotation> note;
    private @Nullable String brand;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#add() add} to add.
     * @param add The value for add
     * @return {@code this} builder for chained invocation
     */
    public final Builder add(Decimal add) {
      checkNotIsSet(addIsSet(), "add");
      this.add = Objects.requireNonNull(add, "add");
      optBits |= OPT_BIT_ADD;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#add() add} to add.
     * @param add The value for add
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("add")
    public final Builder add(Optional<? extends Decimal> add) {
      checkNotIsSet(addIsSet(), "add");
      this.add = add.orElse(null);
      optBits |= OPT_BIT_ADD;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#power() power} to power.
     * @param power The value for power
     * @return {@code this} builder for chained invocation
     */
    public final Builder power(Decimal power) {
      checkNotIsSet(powerIsSet(), "power");
      this.power = Objects.requireNonNull(power, "power");
      optBits |= OPT_BIT_POWER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#power() power} to power.
     * @param power The value for power
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("power")
    public final Builder power(Optional<? extends Decimal> power) {
      checkNotIsSet(powerIsSet(), "power");
      this.power = power.orElse(null);
      optBits |= OPT_BIT_POWER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(Quantity duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("duration")
    public final Builder duration(Optional<? extends Quantity> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
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
    @JsonProperty("axis")
    public final Builder axis(Optional<Integer> axis) {
      checkNotIsSet(axisIsSet(), "axis");
      this.axis = axis.orElse(null);
      optBits |= OPT_BIT_AXIS;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link VisionPrescription_LensSpecification#product() product} attribute.
     * @param product The value for product 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("product")
    public final Builder product(CodeableConcept product) {
      checkNotIsSet(productIsSet(), "product");
      this.product = Objects.requireNonNull(product, "product");
      initBits &= ~INIT_BIT_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#eye() eye} to eye.
     * @param eye The value for eye
     * @return {@code this} builder for chained invocation
     */
    public final Builder eye(Visionprescription_lensspecificationEye eye) {
      checkNotIsSet(eyeIsSet(), "eye");
      this.eye = Objects.requireNonNull(eye, "eye");
      optBits |= OPT_BIT_EYE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#eye() eye} to eye.
     * @param eye The value for eye
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("eye")
    public final Builder eye(Optional<? extends Visionprescription_lensspecificationEye> eye) {
      checkNotIsSet(eyeIsSet(), "eye");
      this.eye = eye.orElse(null);
      optBits |= OPT_BIT_EYE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#cylinder() cylinder} to cylinder.
     * @param cylinder The value for cylinder
     * @return {@code this} builder for chained invocation
     */
    public final Builder cylinder(Decimal cylinder) {
      checkNotIsSet(cylinderIsSet(), "cylinder");
      this.cylinder = Objects.requireNonNull(cylinder, "cylinder");
      optBits |= OPT_BIT_CYLINDER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#cylinder() cylinder} to cylinder.
     * @param cylinder The value for cylinder
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cylinder")
    public final Builder cylinder(Optional<? extends Decimal> cylinder) {
      checkNotIsSet(cylinderIsSet(), "cylinder");
      this.cylinder = cylinder.orElse(null);
      optBits |= OPT_BIT_CYLINDER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#prism() prism} to prism.
     * @param prism The value for prism
     * @return {@code this} builder for chained invocation
     */
    public final Builder prism(List<VisionPrescription_Prism> prism) {
      checkNotIsSet(prismIsSet(), "prism");
      this.prism = Objects.requireNonNull(prism, "prism");
      optBits |= OPT_BIT_PRISM;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#prism() prism} to prism.
     * @param prism The value for prism
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("prism")
    public final Builder prism(Optional<? extends List<VisionPrescription_Prism>> prism) {
      checkNotIsSet(prismIsSet(), "prism");
      this.prism = prism.orElse(null);
      optBits |= OPT_BIT_PRISM;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#sphere() sphere} to sphere.
     * @param sphere The value for sphere
     * @return {@code this} builder for chained invocation
     */
    public final Builder sphere(Decimal sphere) {
      checkNotIsSet(sphereIsSet(), "sphere");
      this.sphere = Objects.requireNonNull(sphere, "sphere");
      optBits |= OPT_BIT_SPHERE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#sphere() sphere} to sphere.
     * @param sphere The value for sphere
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sphere")
    public final Builder sphere(Optional<? extends Decimal> sphere) {
      checkNotIsSet(sphereIsSet(), "sphere");
      this.sphere = sphere.orElse(null);
      optBits |= OPT_BIT_SPHERE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#backCurve() backCurve} to backCurve.
     * @param backCurve The value for backCurve
     * @return {@code this} builder for chained invocation
     */
    public final Builder backCurve(Decimal backCurve) {
      checkNotIsSet(backCurveIsSet(), "backCurve");
      this.backCurve = Objects.requireNonNull(backCurve, "backCurve");
      optBits |= OPT_BIT_BACK_CURVE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#backCurve() backCurve} to backCurve.
     * @param backCurve The value for backCurve
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("backCurve")
    public final Builder backCurve(Optional<? extends Decimal> backCurve) {
      checkNotIsSet(backCurveIsSet(), "backCurve");
      this.backCurve = backCurve.orElse(null);
      optBits |= OPT_BIT_BACK_CURVE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for chained invocation
     */
    public final Builder color(String color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = Objects.requireNonNull(color, "color");
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("color")
    public final Builder color(Optional<String> color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = color.orElse(null);
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#diameter() diameter} to diameter.
     * @param diameter The value for diameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder diameter(Decimal diameter) {
      checkNotIsSet(diameterIsSet(), "diameter");
      this.diameter = Objects.requireNonNull(diameter, "diameter");
      optBits |= OPT_BIT_DIAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#diameter() diameter} to diameter.
     * @param diameter The value for diameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diameter")
    public final Builder diameter(Optional<? extends Decimal> diameter) {
      checkNotIsSet(diameterIsSet(), "diameter");
      this.diameter = diameter.orElse(null);
      optBits |= OPT_BIT_DIAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#note() note} to note.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#note() note} to note.
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
     * Initializes the optional value {@link VisionPrescription_LensSpecification#brand() brand} to brand.
     * @param brand The value for brand
     * @return {@code this} builder for chained invocation
     */
    public final Builder brand(String brand) {
      checkNotIsSet(brandIsSet(), "brand");
      this.brand = Objects.requireNonNull(brand, "brand");
      optBits |= OPT_BIT_BRAND;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#brand() brand} to brand.
     * @param brand The value for brand
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("brand")
    public final Builder brand(Optional<String> brand) {
      checkNotIsSet(brandIsSet(), "brand");
      this.brand = brand.orElse(null);
      optBits |= OPT_BIT_BRAND;
      return this;
    }

    /**
     * Builds a new {@link VisionPrescription_LensSpecification VisionPrescription_LensSpecification}.
     * @return An immutable instance of VisionPrescription_LensSpecification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public VisionPrescription_LensSpecification build() {
      checkRequiredAttributes();
      return new ImmutableVisionPrescription_LensSpecification(
          add,
          power,
          id,
          duration,
          axis,
          modifierExtension,
          product,
          eye,
          cylinder,
          prism,
          sphere,
          extension,
          backCurve,
          color,
          diameter,
          note,
          brand);
    }

    private boolean addIsSet() {
      return (optBits & OPT_BIT_ADD) != 0;
    }

    private boolean powerIsSet() {
      return (optBits & OPT_BIT_POWER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean axisIsSet() {
      return (optBits & OPT_BIT_AXIS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean eyeIsSet() {
      return (optBits & OPT_BIT_EYE) != 0;
    }

    private boolean cylinderIsSet() {
      return (optBits & OPT_BIT_CYLINDER) != 0;
    }

    private boolean prismIsSet() {
      return (optBits & OPT_BIT_PRISM) != 0;
    }

    private boolean sphereIsSet() {
      return (optBits & OPT_BIT_SPHERE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean backCurveIsSet() {
      return (optBits & OPT_BIT_BACK_CURVE) != 0;
    }

    private boolean colorIsSet() {
      return (optBits & OPT_BIT_COLOR) != 0;
    }

    private boolean diameterIsSet() {
      return (optBits & OPT_BIT_DIAMETER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean brandIsSet() {
      return (optBits & OPT_BIT_BRAND) != 0;
    }

    private boolean productIsSet() {
      return (initBits & INIT_BIT_PRODUCT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of VisionPrescription_LensSpecification is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!productIsSet()) attributes.add("product");
      return "Cannot build VisionPrescription_LensSpecification, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
  public interface ProductBuildStage {
    /**
     * Initializes the value for the {@link VisionPrescription_LensSpecification#product() product} attribute.
     * @param product The value for product 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal product(CodeableConcept product);
  }

  @Generated(from = "VisionPrescription_LensSpecification", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#add() add} to add.
     * @param add The value for add
     * @return {@code this} builder for chained invocation
     */
    BuildFinal add(Decimal add);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#add() add} to add.
     * @param add The value for add
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal add(Optional<? extends Decimal> add);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#power() power} to power.
     * @param power The value for power
     * @return {@code this} builder for chained invocation
     */
    BuildFinal power(Decimal power);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#power() power} to power.
     * @param power The value for power
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal power(Optional<? extends Decimal> power);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal duration(Quantity duration);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal duration(Optional<? extends Quantity> duration);

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
    BuildFinal axis(Optional<Integer> axis);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#eye() eye} to eye.
     * @param eye The value for eye
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eye(Visionprescription_lensspecificationEye eye);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#eye() eye} to eye.
     * @param eye The value for eye
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eye(Optional<? extends Visionprescription_lensspecificationEye> eye);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#cylinder() cylinder} to cylinder.
     * @param cylinder The value for cylinder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal cylinder(Decimal cylinder);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#cylinder() cylinder} to cylinder.
     * @param cylinder The value for cylinder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal cylinder(Optional<? extends Decimal> cylinder);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#prism() prism} to prism.
     * @param prism The value for prism
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prism(List<VisionPrescription_Prism> prism);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#prism() prism} to prism.
     * @param prism The value for prism
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prism(Optional<? extends List<VisionPrescription_Prism>> prism);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#sphere() sphere} to sphere.
     * @param sphere The value for sphere
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sphere(Decimal sphere);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#sphere() sphere} to sphere.
     * @param sphere The value for sphere
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sphere(Optional<? extends Decimal> sphere);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#backCurve() backCurve} to backCurve.
     * @param backCurve The value for backCurve
     * @return {@code this} builder for chained invocation
     */
    BuildFinal backCurve(Decimal backCurve);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#backCurve() backCurve} to backCurve.
     * @param backCurve The value for backCurve
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal backCurve(Optional<? extends Decimal> backCurve);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for chained invocation
     */
    BuildFinal color(String color);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal color(Optional<String> color);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#diameter() diameter} to diameter.
     * @param diameter The value for diameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diameter(Decimal diameter);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#diameter() diameter} to diameter.
     * @param diameter The value for diameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diameter(Optional<? extends Decimal> diameter);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#brand() brand} to brand.
     * @param brand The value for brand
     * @return {@code this} builder for chained invocation
     */
    BuildFinal brand(String brand);

    /**
     * Initializes the optional value {@link VisionPrescription_LensSpecification#brand() brand} to brand.
     * @param brand The value for brand
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal brand(Optional<String> brand);

    /**
     * Builds a new {@link VisionPrescription_LensSpecification VisionPrescription_LensSpecification}.
     * @return An immutable instance of VisionPrescription_LensSpecification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    VisionPrescription_LensSpecification build();
  }
}
