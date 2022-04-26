package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ProdCharacteristic}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProdCharacteristic.builder()}.
 */
@Generated(from = "ProdCharacteristic", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProdCharacteristic implements ProdCharacteristic {
  private final @Nullable Quantity depth;
  private final @Nullable CodeableConcept scoring;
  private final @Nullable Quantity externalDiameter;
  private final @Nullable String shape;
  private final @Nullable List<Extension> extension;
  private final @Nullable Quantity weight;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Quantity height;
  private final @Nullable Quantity nominalVolume;
  private final @Nullable List<String> imprint;
  private final @Nullable Quantity width;
  private final @Nullable List<String> color;
  private final @Nullable List<Attachment> image;

  private ImmutableProdCharacteristic(
      @Nullable Quantity depth,
      @Nullable CodeableConcept scoring,
      @Nullable Quantity externalDiameter,
      @Nullable String shape,
      @Nullable List<Extension> extension,
      @Nullable Quantity weight,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Quantity height,
      @Nullable Quantity nominalVolume,
      @Nullable List<String> imprint,
      @Nullable Quantity width,
      @Nullable List<String> color,
      @Nullable List<Attachment> image) {
    this.depth = depth;
    this.scoring = scoring;
    this.externalDiameter = externalDiameter;
    this.shape = shape;
    this.extension = extension;
    this.weight = weight;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.height = height;
    this.nominalVolume = nominalVolume;
    this.imprint = imprint;
    this.width = width;
    this.color = color;
    this.image = image;
  }

  /**
   * @return The value of the {@code depth} attribute
   */
  @JsonProperty("depth")
  @Override
  public Optional<Quantity> depth() {
    return Optional.ofNullable(depth);
  }

  /**
   * @return The value of the {@code scoring} attribute
   */
  @JsonProperty("scoring")
  @Override
  public Optional<CodeableConcept> scoring() {
    return Optional.ofNullable(scoring);
  }

  /**
   * @return The value of the {@code externalDiameter} attribute
   */
  @JsonProperty("externalDiameter")
  @Override
  public Optional<Quantity> externalDiameter() {
    return Optional.ofNullable(externalDiameter);
  }

  /**
   * @return The value of the {@code shape} attribute
   */
  @JsonProperty("shape")
  @Override
  public Optional<String> shape() {
    return Optional.ofNullable(shape);
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
   * @return The value of the {@code weight} attribute
   */
  @JsonProperty("weight")
  @Override
  public Optional<Quantity> weight() {
    return Optional.ofNullable(weight);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code height} attribute
   */
  @JsonProperty("height")
  @Override
  public Optional<Quantity> height() {
    return Optional.ofNullable(height);
  }

  /**
   * @return The value of the {@code nominalVolume} attribute
   */
  @JsonProperty("nominalVolume")
  @Override
  public Optional<Quantity> nominalVolume() {
    return Optional.ofNullable(nominalVolume);
  }

  /**
   * @return The value of the {@code imprint} attribute
   */
  @JsonProperty("imprint")
  @Override
  public Optional<List<String>> imprint() {
    return Optional.ofNullable(imprint);
  }

  /**
   * @return The value of the {@code width} attribute
   */
  @JsonProperty("width")
  @Override
  public Optional<Quantity> width() {
    return Optional.ofNullable(width);
  }

  /**
   * @return The value of the {@code color} attribute
   */
  @JsonProperty("color")
  @Override
  public Optional<List<String>> color() {
    return Optional.ofNullable(color);
  }

  /**
   * @return The value of the {@code image} attribute
   */
  @JsonProperty("image")
  @Override
  public Optional<List<Attachment>> image() {
    return Optional.ofNullable(image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#depth() depth} attribute.
   * @param value The value for depth
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withDepth(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "depth");
    if (this.depth == newValue) return this;
    return new ImmutableProdCharacteristic(
        newValue,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#depth() depth} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for depth
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withDepth(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.depth == value) return this;
    return new ImmutableProdCharacteristic(
        value,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#scoring() scoring} attribute.
   * @param value The value for scoring
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withScoring(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "scoring");
    if (this.scoring == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        newValue,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#scoring() scoring} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scoring
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withScoring(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.scoring == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        value,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#externalDiameter() externalDiameter} attribute.
   * @param value The value for externalDiameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withExternalDiameter(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "externalDiameter");
    if (this.externalDiameter == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        newValue,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#externalDiameter() externalDiameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for externalDiameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withExternalDiameter(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.externalDiameter == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        value,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#shape() shape} attribute.
   * @param value The value for shape
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withShape(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "shape");
    if (Objects.equals(this.shape, newValue)) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        newValue,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#shape() shape} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shape
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withShape(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.shape, value)) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        value,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        newValue,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        value,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#weight() weight} attribute.
   * @param value The value for weight
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withWeight(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "weight");
    if (this.weight == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#weight() weight} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for weight
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withWeight(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.weight == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        value,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        newValue,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        value,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        newValue,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        value,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#height() height} attribute.
   * @param value The value for height
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withHeight(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "height");
    if (this.height == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        newValue,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#height() height} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for height
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withHeight(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.height == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        value,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#nominalVolume() nominalVolume} attribute.
   * @param value The value for nominalVolume
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withNominalVolume(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "nominalVolume");
    if (this.nominalVolume == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        newValue,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#nominalVolume() nominalVolume} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nominalVolume
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withNominalVolume(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.nominalVolume == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        value,
        this.imprint,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#imprint() imprint} attribute.
   * @param value The value for imprint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withImprint(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "imprint");
    if (this.imprint == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        newValue,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#imprint() imprint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for imprint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withImprint(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.imprint == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        value,
        this.width,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#width() width} attribute.
   * @param value The value for width
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withWidth(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "width");
    if (this.width == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        newValue,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#width() width} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for width
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withWidth(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.width == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        value,
        this.color,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#color() color} attribute.
   * @param value The value for color
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withColor(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "color");
    if (this.color == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        newValue,
        this.image);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#color() color} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for color
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withColor(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.color == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        value,
        this.image);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProdCharacteristic#image() image} attribute.
   * @param value The value for image
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProdCharacteristic withImage(List<Attachment> value) {
    @Nullable List<Attachment> newValue = Objects.requireNonNull(value, "image");
    if (this.image == newValue) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProdCharacteristic#image() image} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for image
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProdCharacteristic withImage(Optional<? extends List<Attachment>> optional) {
    @Nullable List<Attachment> value = optional.orElse(null);
    if (this.image == value) return this;
    return new ImmutableProdCharacteristic(
        this.depth,
        this.scoring,
        this.externalDiameter,
        this.shape,
        this.extension,
        this.weight,
        this.id,
        this.modifierExtension,
        this.height,
        this.nominalVolume,
        this.imprint,
        this.width,
        this.color,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProdCharacteristic} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProdCharacteristic
        && equalTo((ImmutableProdCharacteristic) another);
  }

  private boolean equalTo(ImmutableProdCharacteristic another) {
    return Objects.equals(depth, another.depth)
        && Objects.equals(scoring, another.scoring)
        && Objects.equals(externalDiameter, another.externalDiameter)
        && Objects.equals(shape, another.shape)
        && Objects.equals(extension, another.extension)
        && Objects.equals(weight, another.weight)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(height, another.height)
        && Objects.equals(nominalVolume, another.nominalVolume)
        && Objects.equals(imprint, another.imprint)
        && Objects.equals(width, another.width)
        && Objects.equals(color, another.color)
        && Objects.equals(image, another.image);
  }

  /**
   * Computes a hash code from attributes: {@code depth}, {@code scoring}, {@code externalDiameter}, {@code shape}, {@code extension}, {@code weight}, {@code id}, {@code modifierExtension}, {@code height}, {@code nominalVolume}, {@code imprint}, {@code width}, {@code color}, {@code image}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(depth);
    h += (h << 5) + Objects.hashCode(scoring);
    h += (h << 5) + Objects.hashCode(externalDiameter);
    h += (h << 5) + Objects.hashCode(shape);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(weight);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(height);
    h += (h << 5) + Objects.hashCode(nominalVolume);
    h += (h << 5) + Objects.hashCode(imprint);
    h += (h << 5) + Objects.hashCode(width);
    h += (h << 5) + Objects.hashCode(color);
    h += (h << 5) + Objects.hashCode(image);
    return h;
  }

  /**
   * Prints the immutable value {@code ProdCharacteristic} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ProdCharacteristic{");
    if (depth != null) {
      builder.append("depth=").append(depth);
    }
    if (scoring != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("scoring=").append(scoring);
    }
    if (externalDiameter != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("externalDiameter=").append(externalDiameter);
    }
    if (shape != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("shape=").append(shape);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (weight != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("weight=").append(weight);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (height != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("height=").append(height);
    }
    if (nominalVolume != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("nominalVolume=").append(nominalVolume);
    }
    if (imprint != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("imprint=").append(imprint);
    }
    if (width != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("width=").append(width);
    }
    if (color != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("color=").append(color);
    }
    if (image != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("image=").append(image);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ProdCharacteristic", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ProdCharacteristic {
    @Nullable Optional<Quantity> depth = Optional.empty();
    boolean depthIsSet;
    @Nullable Optional<CodeableConcept> scoring = Optional.empty();
    boolean scoringIsSet;
    @Nullable Optional<Quantity> externalDiameter = Optional.empty();
    boolean externalDiameterIsSet;
    @Nullable Optional<String> shape = Optional.empty();
    boolean shapeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Quantity> weight = Optional.empty();
    boolean weightIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Quantity> height = Optional.empty();
    boolean heightIsSet;
    @Nullable Optional<Quantity> nominalVolume = Optional.empty();
    boolean nominalVolumeIsSet;
    @Nullable Optional<List<String>> imprint = Optional.empty();
    boolean imprintIsSet;
    @Nullable Optional<Quantity> width = Optional.empty();
    boolean widthIsSet;
    @Nullable Optional<List<String>> color = Optional.empty();
    boolean colorIsSet;
    @Nullable Optional<List<Attachment>> image = Optional.empty();
    boolean imageIsSet;
    @JsonProperty("depth")
    public void setDepth(Optional<Quantity> depth) {
      this.depth = depth;
      this.depthIsSet = true;
    }
    @JsonProperty("scoring")
    public void setScoring(Optional<CodeableConcept> scoring) {
      this.scoring = scoring;
      this.scoringIsSet = true;
    }
    @JsonProperty("externalDiameter")
    public void setExternalDiameter(Optional<Quantity> externalDiameter) {
      this.externalDiameter = externalDiameter;
      this.externalDiameterIsSet = true;
    }
    @JsonProperty("shape")
    public void setShape(Optional<String> shape) {
      this.shape = shape;
      this.shapeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("weight")
    public void setWeight(Optional<Quantity> weight) {
      this.weight = weight;
      this.weightIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("height")
    public void setHeight(Optional<Quantity> height) {
      this.height = height;
      this.heightIsSet = true;
    }
    @JsonProperty("nominalVolume")
    public void setNominalVolume(Optional<Quantity> nominalVolume) {
      this.nominalVolume = nominalVolume;
      this.nominalVolumeIsSet = true;
    }
    @JsonProperty("imprint")
    public void setImprint(Optional<List<String>> imprint) {
      this.imprint = imprint;
      this.imprintIsSet = true;
    }
    @JsonProperty("width")
    public void setWidth(Optional<Quantity> width) {
      this.width = width;
      this.widthIsSet = true;
    }
    @JsonProperty("color")
    public void setColor(Optional<List<String>> color) {
      this.color = color;
      this.colorIsSet = true;
    }
    @JsonProperty("image")
    public void setImage(Optional<List<Attachment>> image) {
      this.image = image;
      this.imageIsSet = true;
    }
    @Override
    public Optional<Quantity> depth() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> scoring() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> externalDiameter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> shape() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> weight() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> height() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> nominalVolume() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> imprint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> width() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> color() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Attachment>> image() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableProdCharacteristic fromJson(Json json) {
    ImmutableProdCharacteristic.Builder builder = ImmutableProdCharacteristic.builder();
    if (json.depthIsSet) {
      builder.depth(json.depth);
    }
    if (json.scoringIsSet) {
      builder.scoring(json.scoring);
    }
    if (json.externalDiameterIsSet) {
      builder.externalDiameter(json.externalDiameter);
    }
    if (json.shapeIsSet) {
      builder.shape(json.shape);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.weightIsSet) {
      builder.weight(json.weight);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.heightIsSet) {
      builder.height(json.height);
    }
    if (json.nominalVolumeIsSet) {
      builder.nominalVolume(json.nominalVolume);
    }
    if (json.imprintIsSet) {
      builder.imprint(json.imprint);
    }
    if (json.widthIsSet) {
      builder.width(json.width);
    }
    if (json.colorIsSet) {
      builder.color(json.color);
    }
    if (json.imageIsSet) {
      builder.image(json.image);
    }
    return (ImmutableProdCharacteristic) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ProdCharacteristic} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ProdCharacteristic instance
   */
  public static ProdCharacteristic copyOf(ProdCharacteristic instance) {
    if (instance instanceof ImmutableProdCharacteristic) {
      return (ImmutableProdCharacteristic) instance;
    }
    return ImmutableProdCharacteristic.builder()
        .depth(instance.depth())
        .scoring(instance.scoring())
        .externalDiameter(instance.externalDiameter())
        .shape(instance.shape())
        .extension(instance.extension())
        .weight(instance.weight())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .height(instance.height())
        .nominalVolume(instance.nominalVolume())
        .imprint(instance.imprint())
        .width(instance.width())
        .color(instance.color())
        .image(instance.image())
        .build();
  }

  /**
   * Creates a builder for {@link ProdCharacteristic ProdCharacteristic}.
   * <pre>
   * ImmutableProdCharacteristic.builder()
   *    .depth(com.medplum.types.fhir.Quantity) // optional {@link ProdCharacteristic#depth() depth}
   *    .scoring(com.medplum.types.fhir.CodeableConcept) // optional {@link ProdCharacteristic#scoring() scoring}
   *    .externalDiameter(com.medplum.types.fhir.Quantity) // optional {@link ProdCharacteristic#externalDiameter() externalDiameter}
   *    .shape(String) // optional {@link ProdCharacteristic#shape() shape}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ProdCharacteristic#extension() extension}
   *    .weight(com.medplum.types.fhir.Quantity) // optional {@link ProdCharacteristic#weight() weight}
   *    .id(String) // optional {@link ProdCharacteristic#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ProdCharacteristic#modifierExtension() modifierExtension}
   *    .height(com.medplum.types.fhir.Quantity) // optional {@link ProdCharacteristic#height() height}
   *    .nominalVolume(com.medplum.types.fhir.Quantity) // optional {@link ProdCharacteristic#nominalVolume() nominalVolume}
   *    .imprint(List&amp;lt;String&amp;gt;) // optional {@link ProdCharacteristic#imprint() imprint}
   *    .width(com.medplum.types.fhir.Quantity) // optional {@link ProdCharacteristic#width() width}
   *    .color(List&amp;lt;String&amp;gt;) // optional {@link ProdCharacteristic#color() color}
   *    .image(List&amp;lt;com.medplum.types.fhir.Attachment&amp;gt;) // optional {@link ProdCharacteristic#image() image}
   *    .build();
   * </pre>
   * @return A new ProdCharacteristic builder
   */
  public static ImmutableProdCharacteristic.Builder builder() {
    return new ImmutableProdCharacteristic.Builder();
  }

  /**
   * Builds instances of type {@link ProdCharacteristic ProdCharacteristic}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ProdCharacteristic", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DEPTH = 0x1L;
    private static final long OPT_BIT_SCORING = 0x2L;
    private static final long OPT_BIT_EXTERNAL_DIAMETER = 0x4L;
    private static final long OPT_BIT_SHAPE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_WEIGHT = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_HEIGHT = 0x100L;
    private static final long OPT_BIT_NOMINAL_VOLUME = 0x200L;
    private static final long OPT_BIT_IMPRINT = 0x400L;
    private static final long OPT_BIT_WIDTH = 0x800L;
    private static final long OPT_BIT_COLOR = 0x1000L;
    private static final long OPT_BIT_IMAGE = 0x2000L;
    private long optBits;

    private @Nullable Quantity depth;
    private @Nullable CodeableConcept scoring;
    private @Nullable Quantity externalDiameter;
    private @Nullable String shape;
    private @Nullable List<Extension> extension;
    private @Nullable Quantity weight;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity height;
    private @Nullable Quantity nominalVolume;
    private @Nullable List<String> imprint;
    private @Nullable Quantity width;
    private @Nullable List<String> color;
    private @Nullable List<Attachment> image;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#depth() depth} to depth.
     * @param depth The value for depth
     * @return {@code this} builder for chained invocation
     */
    public final Builder depth(Quantity depth) {
      checkNotIsSet(depthIsSet(), "depth");
      this.depth = Objects.requireNonNull(depth, "depth");
      optBits |= OPT_BIT_DEPTH;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#depth() depth} to depth.
     * @param depth The value for depth
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("depth")
    public final Builder depth(Optional<? extends Quantity> depth) {
      checkNotIsSet(depthIsSet(), "depth");
      this.depth = depth.orElse(null);
      optBits |= OPT_BIT_DEPTH;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#scoring() scoring} to scoring.
     * @param scoring The value for scoring
     * @return {@code this} builder for chained invocation
     */
    public final Builder scoring(CodeableConcept scoring) {
      checkNotIsSet(scoringIsSet(), "scoring");
      this.scoring = Objects.requireNonNull(scoring, "scoring");
      optBits |= OPT_BIT_SCORING;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#scoring() scoring} to scoring.
     * @param scoring The value for scoring
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scoring")
    public final Builder scoring(Optional<? extends CodeableConcept> scoring) {
      checkNotIsSet(scoringIsSet(), "scoring");
      this.scoring = scoring.orElse(null);
      optBits |= OPT_BIT_SCORING;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#externalDiameter() externalDiameter} to externalDiameter.
     * @param externalDiameter The value for externalDiameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder externalDiameter(Quantity externalDiameter) {
      checkNotIsSet(externalDiameterIsSet(), "externalDiameter");
      this.externalDiameter = Objects.requireNonNull(externalDiameter, "externalDiameter");
      optBits |= OPT_BIT_EXTERNAL_DIAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#externalDiameter() externalDiameter} to externalDiameter.
     * @param externalDiameter The value for externalDiameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("externalDiameter")
    public final Builder externalDiameter(Optional<? extends Quantity> externalDiameter) {
      checkNotIsSet(externalDiameterIsSet(), "externalDiameter");
      this.externalDiameter = externalDiameter.orElse(null);
      optBits |= OPT_BIT_EXTERNAL_DIAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#shape() shape} to shape.
     * @param shape The value for shape
     * @return {@code this} builder for chained invocation
     */
    public final Builder shape(String shape) {
      checkNotIsSet(shapeIsSet(), "shape");
      this.shape = Objects.requireNonNull(shape, "shape");
      optBits |= OPT_BIT_SHAPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#shape() shape} to shape.
     * @param shape The value for shape
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("shape")
    public final Builder shape(Optional<String> shape) {
      checkNotIsSet(shapeIsSet(), "shape");
      this.shape = shape.orElse(null);
      optBits |= OPT_BIT_SHAPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#extension() extension} to extension.
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
     * Initializes the optional value {@link ProdCharacteristic#extension() extension} to extension.
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
     * Initializes the optional value {@link ProdCharacteristic#weight() weight} to weight.
     * @param weight The value for weight
     * @return {@code this} builder for chained invocation
     */
    public final Builder weight(Quantity weight) {
      checkNotIsSet(weightIsSet(), "weight");
      this.weight = Objects.requireNonNull(weight, "weight");
      optBits |= OPT_BIT_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#weight() weight} to weight.
     * @param weight The value for weight
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("weight")
    public final Builder weight(Optional<? extends Quantity> weight) {
      checkNotIsSet(weightIsSet(), "weight");
      this.weight = weight.orElse(null);
      optBits |= OPT_BIT_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#id() id} to id.
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
     * Initializes the optional value {@link ProdCharacteristic#id() id} to id.
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
     * Initializes the optional value {@link ProdCharacteristic#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ProdCharacteristic#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ProdCharacteristic#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for chained invocation
     */
    public final Builder height(Quantity height) {
      checkNotIsSet(heightIsSet(), "height");
      this.height = Objects.requireNonNull(height, "height");
      optBits |= OPT_BIT_HEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#height() height} to height.
     * @param height The value for height
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("height")
    public final Builder height(Optional<? extends Quantity> height) {
      checkNotIsSet(heightIsSet(), "height");
      this.height = height.orElse(null);
      optBits |= OPT_BIT_HEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#nominalVolume() nominalVolume} to nominalVolume.
     * @param nominalVolume The value for nominalVolume
     * @return {@code this} builder for chained invocation
     */
    public final Builder nominalVolume(Quantity nominalVolume) {
      checkNotIsSet(nominalVolumeIsSet(), "nominalVolume");
      this.nominalVolume = Objects.requireNonNull(nominalVolume, "nominalVolume");
      optBits |= OPT_BIT_NOMINAL_VOLUME;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#nominalVolume() nominalVolume} to nominalVolume.
     * @param nominalVolume The value for nominalVolume
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nominalVolume")
    public final Builder nominalVolume(Optional<? extends Quantity> nominalVolume) {
      checkNotIsSet(nominalVolumeIsSet(), "nominalVolume");
      this.nominalVolume = nominalVolume.orElse(null);
      optBits |= OPT_BIT_NOMINAL_VOLUME;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#imprint() imprint} to imprint.
     * @param imprint The value for imprint
     * @return {@code this} builder for chained invocation
     */
    public final Builder imprint(List<String> imprint) {
      checkNotIsSet(imprintIsSet(), "imprint");
      this.imprint = Objects.requireNonNull(imprint, "imprint");
      optBits |= OPT_BIT_IMPRINT;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#imprint() imprint} to imprint.
     * @param imprint The value for imprint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("imprint")
    public final Builder imprint(Optional<? extends List<String>> imprint) {
      checkNotIsSet(imprintIsSet(), "imprint");
      this.imprint = imprint.orElse(null);
      optBits |= OPT_BIT_IMPRINT;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for chained invocation
     */
    public final Builder width(Quantity width) {
      checkNotIsSet(widthIsSet(), "width");
      this.width = Objects.requireNonNull(width, "width");
      optBits |= OPT_BIT_WIDTH;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#width() width} to width.
     * @param width The value for width
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("width")
    public final Builder width(Optional<? extends Quantity> width) {
      checkNotIsSet(widthIsSet(), "width");
      this.width = width.orElse(null);
      optBits |= OPT_BIT_WIDTH;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for chained invocation
     */
    public final Builder color(List<String> color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = Objects.requireNonNull(color, "color");
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#color() color} to color.
     * @param color The value for color
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("color")
    public final Builder color(Optional<? extends List<String>> color) {
      checkNotIsSet(colorIsSet(), "color");
      this.color = color.orElse(null);
      optBits |= OPT_BIT_COLOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for chained invocation
     */
    public final Builder image(List<Attachment> image) {
      checkNotIsSet(imageIsSet(), "image");
      this.image = Objects.requireNonNull(image, "image");
      optBits |= OPT_BIT_IMAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ProdCharacteristic#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("image")
    public final Builder image(Optional<? extends List<Attachment>> image) {
      checkNotIsSet(imageIsSet(), "image");
      this.image = image.orElse(null);
      optBits |= OPT_BIT_IMAGE;
      return this;
    }

    /**
     * Builds a new {@link ProdCharacteristic ProdCharacteristic}.
     * @return An immutable instance of ProdCharacteristic
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ProdCharacteristic build() {
      return new ImmutableProdCharacteristic(
          depth,
          scoring,
          externalDiameter,
          shape,
          extension,
          weight,
          id,
          modifierExtension,
          height,
          nominalVolume,
          imprint,
          width,
          color,
          image);
    }

    private boolean depthIsSet() {
      return (optBits & OPT_BIT_DEPTH) != 0;
    }

    private boolean scoringIsSet() {
      return (optBits & OPT_BIT_SCORING) != 0;
    }

    private boolean externalDiameterIsSet() {
      return (optBits & OPT_BIT_EXTERNAL_DIAMETER) != 0;
    }

    private boolean shapeIsSet() {
      return (optBits & OPT_BIT_SHAPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean weightIsSet() {
      return (optBits & OPT_BIT_WEIGHT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean heightIsSet() {
      return (optBits & OPT_BIT_HEIGHT) != 0;
    }

    private boolean nominalVolumeIsSet() {
      return (optBits & OPT_BIT_NOMINAL_VOLUME) != 0;
    }

    private boolean imprintIsSet() {
      return (optBits & OPT_BIT_IMPRINT) != 0;
    }

    private boolean widthIsSet() {
      return (optBits & OPT_BIT_WIDTH) != 0;
    }

    private boolean colorIsSet() {
      return (optBits & OPT_BIT_COLOR) != 0;
    }

    private boolean imageIsSet() {
      return (optBits & OPT_BIT_IMAGE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ProdCharacteristic is strict, attribute is already set: ".concat(name));
    }
  }
}
