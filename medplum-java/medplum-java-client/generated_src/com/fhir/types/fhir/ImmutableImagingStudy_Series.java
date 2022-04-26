package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ImagingStudy_Series}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImagingStudy_Series.builder()}.
 */
@Generated(from = "ImagingStudy_Series", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImagingStudy_Series implements ImagingStudy_Series {
  private final @Nullable DateTime started;
  private final @Nullable List<Extension> extension;
  private final @Nullable Coding laterality;
  private final @Nullable List<ImagingStudy_Instance> instance;
  private final @Nullable String id;
  private final Coding modality;
  private final @Nullable Coding bodySite;
  private final @Nullable UnsignedInt numberOfInstances;
  private final @Nullable List<ImagingStudy_Performer> performer;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> endpoint;
  private final @Nullable Id uid;
  private final @Nullable UnsignedInt number;
  private final @Nullable List<Reference> specimen;
  private final @Nullable String description;

  private ImmutableImagingStudy_Series(
      @Nullable DateTime started,
      @Nullable List<Extension> extension,
      @Nullable Coding laterality,
      @Nullable List<ImagingStudy_Instance> instance,
      @Nullable String id,
      Coding modality,
      @Nullable Coding bodySite,
      @Nullable UnsignedInt numberOfInstances,
      @Nullable List<ImagingStudy_Performer> performer,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> endpoint,
      @Nullable Id uid,
      @Nullable UnsignedInt number,
      @Nullable List<Reference> specimen,
      @Nullable String description) {
    this.started = started;
    this.extension = extension;
    this.laterality = laterality;
    this.instance = instance;
    this.id = id;
    this.modality = modality;
    this.bodySite = bodySite;
    this.numberOfInstances = numberOfInstances;
    this.performer = performer;
    this.modifierExtension = modifierExtension;
    this.endpoint = endpoint;
    this.uid = uid;
    this.number = number;
    this.specimen = specimen;
    this.description = description;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code laterality} attribute
   */
  @JsonProperty("laterality")
  @Override
  public Optional<Coding> laterality() {
    return Optional.ofNullable(laterality);
  }

  /**
   * @return The value of the {@code instance} attribute
   */
  @JsonProperty("instance")
  @Override
  public Optional<List<ImagingStudy_Instance>> instance() {
    return Optional.ofNullable(instance);
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
   * @return The value of the {@code modality} attribute
   */
  @JsonProperty("modality")
  @Override
  public Coding modality() {
    return modality;
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<Coding> bodySite() {
    return Optional.ofNullable(bodySite);
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
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<List<ImagingStudy_Performer>> performer() {
    return Optional.ofNullable(performer);
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
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<List<Reference>> endpoint() {
    return Optional.ofNullable(endpoint);
  }

  /**
   * @return The value of the {@code uid} attribute
   */
  @JsonProperty("uid")
  @Override
  public Optional<Id> uid() {
    return Optional.ofNullable(uid);
  }

  /**
   * @return The value of the {@code number} attribute
   */
  @JsonProperty("number")
  @Override
  public Optional<UnsignedInt> number() {
    return Optional.ofNullable(number);
  }

  /**
   * @return The value of the {@code specimen} attribute
   */
  @JsonProperty("specimen")
  @Override
  public Optional<List<Reference>> specimen() {
    return Optional.ofNullable(specimen);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#started() started} attribute.
   * @param value The value for started
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withStarted(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "started");
    if (this.started == newValue) return this;
    return new ImmutableImagingStudy_Series(
        newValue,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#started() started} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for started
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withStarted(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.started == value) return this;
    return new ImmutableImagingStudy_Series(
        value,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        newValue,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        value,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#laterality() laterality} attribute.
   * @param value The value for laterality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withLaterality(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "laterality");
    if (this.laterality == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        newValue,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#laterality() laterality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for laterality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withLaterality(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.laterality == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        value,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#instance() instance} attribute.
   * @param value The value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withInstance(List<ImagingStudy_Instance> value) {
    @Nullable List<ImagingStudy_Instance> newValue = Objects.requireNonNull(value, "instance");
    if (this.instance == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        newValue,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#instance() instance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withInstance(Optional<? extends List<ImagingStudy_Instance>> optional) {
    @Nullable List<ImagingStudy_Instance> value = optional.orElse(null);
    if (this.instance == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        value,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        newValue,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        value,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImagingStudy_Series#modality() modality} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for modality
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImagingStudy_Series withModality(Coding value) {
    if (this.modality == value) return this;
    Coding newValue = Objects.requireNonNull(value, "modality");
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        newValue,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withBodySite(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        newValue,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withBodySite(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        value,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} attribute.
   * @param value The value for numberOfInstances
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withNumberOfInstances(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "numberOfInstances");
    if (this.numberOfInstances == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        newValue,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfInstances
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withNumberOfInstances(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.numberOfInstances == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        value,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withPerformer(List<ImagingStudy_Performer> value) {
    @Nullable List<ImagingStudy_Performer> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        newValue,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withPerformer(Optional<? extends List<ImagingStudy_Performer>> optional) {
    @Nullable List<ImagingStudy_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        value,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        newValue,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        value,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withEndpoint(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        newValue,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withEndpoint(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        value,
        this.uid,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#uid() uid} attribute.
   * @param value The value for uid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withUid(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "uid");
    if (this.uid == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        newValue,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#uid() uid} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uid
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withUid(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.uid == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        value,
        this.number,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#number() number} attribute.
   * @param value The value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withNumber(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "number");
    if (this.number == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        newValue,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#number() number} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for number
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withNumber(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.number == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        value,
        this.specimen,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withSpecimen(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withSpecimen(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableImagingStudy_Series(
        this.started,
        this.extension,
        this.laterality,
        this.instance,
        this.id,
        this.modality,
        this.bodySite,
        this.numberOfInstances,
        this.performer,
        this.modifierExtension,
        this.endpoint,
        this.uid,
        this.number,
        this.specimen,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImagingStudy_Series} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImagingStudy_Series
        && equalTo((ImmutableImagingStudy_Series) another);
  }

  private boolean equalTo(ImmutableImagingStudy_Series another) {
    return Objects.equals(started, another.started)
        && Objects.equals(extension, another.extension)
        && Objects.equals(laterality, another.laterality)
        && Objects.equals(instance, another.instance)
        && Objects.equals(id, another.id)
        && modality.equals(another.modality)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(numberOfInstances, another.numberOfInstances)
        && Objects.equals(performer, another.performer)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(uid, another.uid)
        && Objects.equals(number, another.number)
        && Objects.equals(specimen, another.specimen)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code started}, {@code extension}, {@code laterality}, {@code instance}, {@code id}, {@code modality}, {@code bodySite}, {@code numberOfInstances}, {@code performer}, {@code modifierExtension}, {@code endpoint}, {@code uid}, {@code number}, {@code specimen}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(started);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(laterality);
    h += (h << 5) + Objects.hashCode(instance);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + modality.hashCode();
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(numberOfInstances);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(uid);
    h += (h << 5) + Objects.hashCode(number);
    h += (h << 5) + Objects.hashCode(specimen);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code ImagingStudy_Series} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImagingStudy_Series{");
    if (started != null) {
      builder.append("started=").append(started);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (laterality != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("laterality=").append(laterality);
    }
    if (instance != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("instance=").append(instance);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("modality=").append(modality);
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (numberOfInstances != null) {
      builder.append(", ");
      builder.append("numberOfInstances=").append(numberOfInstances);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (endpoint != null) {
      builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (uid != null) {
      builder.append(", ");
      builder.append("uid=").append(uid);
    }
    if (number != null) {
      builder.append(", ");
      builder.append("number=").append(number);
    }
    if (specimen != null) {
      builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImagingStudy_Series", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImagingStudy_Series {
    @Nullable Optional<DateTime> started = Optional.empty();
    boolean startedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Coding> laterality = Optional.empty();
    boolean lateralityIsSet;
    @Nullable Optional<List<ImagingStudy_Instance>> instance = Optional.empty();
    boolean instanceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Coding modality;
    @Nullable Optional<Coding> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<UnsignedInt> numberOfInstances = Optional.empty();
    boolean numberOfInstancesIsSet;
    @Nullable Optional<List<ImagingStudy_Performer>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<Id> uid = Optional.empty();
    boolean uidIsSet;
    @Nullable Optional<UnsignedInt> number = Optional.empty();
    boolean numberIsSet;
    @Nullable Optional<List<Reference>> specimen = Optional.empty();
    boolean specimenIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("started")
    public void setStarted(Optional<DateTime> started) {
      this.started = started;
      this.startedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("laterality")
    public void setLaterality(Optional<Coding> laterality) {
      this.laterality = laterality;
      this.lateralityIsSet = true;
    }
    @JsonProperty("instance")
    public void setInstance(Optional<List<ImagingStudy_Instance>> instance) {
      this.instance = instance;
      this.instanceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modality")
    public void setModality(Coding modality) {
      this.modality = modality;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<Coding> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("numberOfInstances")
    public void setNumberOfInstances(Optional<UnsignedInt> numberOfInstances) {
      this.numberOfInstances = numberOfInstances;
      this.numberOfInstancesIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<ImagingStudy_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<List<Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @JsonProperty("uid")
    public void setUid(Optional<Id> uid) {
      this.uid = uid;
      this.uidIsSet = true;
    }
    @JsonProperty("number")
    public void setNumber(Optional<UnsignedInt> number) {
      this.number = number;
      this.numberIsSet = true;
    }
    @JsonProperty("specimen")
    public void setSpecimen(Optional<List<Reference>> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<DateTime> started() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> laterality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImagingStudy_Instance>> instance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Coding modality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> numberOfInstances() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImagingStudy_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> uid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> number() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImagingStudy_Series fromJson(Json json) {
    ImmutableImagingStudy_Series.Builder builder = ((ImmutableImagingStudy_Series.Builder) ImmutableImagingStudy_Series.builder());
    if (json.startedIsSet) {
      builder.started(json.started);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.lateralityIsSet) {
      builder.laterality(json.laterality);
    }
    if (json.instanceIsSet) {
      builder.instance(json.instance);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modality != null) {
      builder.modality(json.modality);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.numberOfInstancesIsSet) {
      builder.numberOfInstances(json.numberOfInstances);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.uidIsSet) {
      builder.uid(json.uid);
    }
    if (json.numberIsSet) {
      builder.number(json.number);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableImagingStudy_Series) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImagingStudy_Series} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImagingStudy_Series instance
   */
  public static ImagingStudy_Series copyOf(ImagingStudy_Series instance) {
    if (instance instanceof ImmutableImagingStudy_Series) {
      return (ImmutableImagingStudy_Series) instance;
    }
    return ((ImmutableImagingStudy_Series.Builder) ImmutableImagingStudy_Series.builder())
        .started(instance.started())
        .extension(instance.extension())
        .laterality(instance.laterality())
        .instance(instance.instance())
        .id(instance.id())
        .modality(instance.modality())
        .bodySite(instance.bodySite())
        .numberOfInstances(instance.numberOfInstances())
        .performer(instance.performer())
        .modifierExtension(instance.modifierExtension())
        .endpoint(instance.endpoint())
        .uid(instance.uid())
        .number(instance.number())
        .specimen(instance.specimen())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link ImagingStudy_Series ImagingStudy_Series}.
   * <pre>
   * ImmutableImagingStudy_Series.builder()
   *    .started(com.fhir.types.fhir.DateTime) // optional {@link ImagingStudy_Series#started() started}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Series#extension() extension}
   *    .laterality(com.fhir.types.fhir.Coding) // optional {@link ImagingStudy_Series#laterality() laterality}
   *    .instance(List&amp;lt;com.fhir.types.fhir.ImagingStudy_Instance&amp;gt;) // optional {@link ImagingStudy_Series#instance() instance}
   *    .id(String) // optional {@link ImagingStudy_Series#id() id}
   *    .modality(com.fhir.types.fhir.Coding) // required {@link ImagingStudy_Series#modality() modality}
   *    .bodySite(com.fhir.types.fhir.Coding) // optional {@link ImagingStudy_Series#bodySite() bodySite}
   *    .numberOfInstances(com.fhir.types.fhir.UnsignedInt) // optional {@link ImagingStudy_Series#numberOfInstances() numberOfInstances}
   *    .performer(List&amp;lt;com.fhir.types.fhir.ImagingStudy_Performer&amp;gt;) // optional {@link ImagingStudy_Series#performer() performer}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Series#modifierExtension() modifierExtension}
   *    .endpoint(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ImagingStudy_Series#endpoint() endpoint}
   *    .uid(com.fhir.types.fhir.Id) // optional {@link ImagingStudy_Series#uid() uid}
   *    .number(com.fhir.types.fhir.UnsignedInt) // optional {@link ImagingStudy_Series#number() number}
   *    .specimen(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ImagingStudy_Series#specimen() specimen}
   *    .description(String) // optional {@link ImagingStudy_Series#description() description}
   *    .build();
   * </pre>
   * @return A new ImagingStudy_Series builder
   */
  public static ModalityBuildStage builder() {
    return new ImmutableImagingStudy_Series.Builder();
  }

  /**
   * Builds instances of type {@link ImagingStudy_Series ImagingStudy_Series}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImagingStudy_Series", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ModalityBuildStage, BuildFinal {
    private static final long INIT_BIT_MODALITY = 0x1L;
    private static final long OPT_BIT_STARTED = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_LATERALITY = 0x4L;
    private static final long OPT_BIT_INSTANCE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_BODY_SITE = 0x20L;
    private static final long OPT_BIT_NUMBER_OF_INSTANCES = 0x40L;
    private static final long OPT_BIT_PERFORMER = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_ENDPOINT = 0x200L;
    private static final long OPT_BIT_UID = 0x400L;
    private static final long OPT_BIT_NUMBER = 0x800L;
    private static final long OPT_BIT_SPECIMEN = 0x1000L;
    private static final long OPT_BIT_DESCRIPTION = 0x2000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable DateTime started;
    private @Nullable List<Extension> extension;
    private @Nullable Coding laterality;
    private @Nullable List<ImagingStudy_Instance> instance;
    private @Nullable String id;
    private @Nullable Coding modality;
    private @Nullable Coding bodySite;
    private @Nullable UnsignedInt numberOfInstances;
    private @Nullable List<ImagingStudy_Performer> performer;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> endpoint;
    private @Nullable Id uid;
    private @Nullable UnsignedInt number;
    private @Nullable List<Reference> specimen;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#started() started} to started.
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
     * Initializes the optional value {@link ImagingStudy_Series#started() started} to started.
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
     * Initializes the optional value {@link ImagingStudy_Series#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy_Series#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy_Series#laterality() laterality} to laterality.
     * @param laterality The value for laterality
     * @return {@code this} builder for chained invocation
     */
    public final Builder laterality(Coding laterality) {
      checkNotIsSet(lateralityIsSet(), "laterality");
      this.laterality = Objects.requireNonNull(laterality, "laterality");
      optBits |= OPT_BIT_LATERALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#laterality() laterality} to laterality.
     * @param laterality The value for laterality
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("laterality")
    public final Builder laterality(Optional<? extends Coding> laterality) {
      checkNotIsSet(lateralityIsSet(), "laterality");
      this.laterality = laterality.orElse(null);
      optBits |= OPT_BIT_LATERALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    public final Builder instance(List<ImagingStudy_Instance> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = Objects.requireNonNull(instance, "instance");
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instance")
    public final Builder instance(Optional<? extends List<ImagingStudy_Instance>> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance.orElse(null);
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy_Series#id() id} to id.
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
     * Initializes the value for the {@link ImagingStudy_Series#modality() modality} attribute.
     * @param modality The value for modality 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modality")
    public final Builder modality(Coding modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = Objects.requireNonNull(modality, "modality");
      initBits &= ~INIT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(Coding bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bodySite")
    public final Builder bodySite(Optional<? extends Coding> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} to numberOfInstances.
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
     * Initializes the optional value {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} to numberOfInstances.
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
     * Initializes the optional value {@link ImagingStudy_Series#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(List<ImagingStudy_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends List<ImagingStudy_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Series#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Series#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link ImagingStudy_Series#endpoint() endpoint} to endpoint.
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
     * Initializes the optional value {@link ImagingStudy_Series#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for chained invocation
     */
    public final Builder uid(Id uid) {
      checkNotIsSet(uidIsSet(), "uid");
      this.uid = Objects.requireNonNull(uid, "uid");
      optBits |= OPT_BIT_UID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("uid")
    public final Builder uid(Optional<? extends Id> uid) {
      checkNotIsSet(uidIsSet(), "uid");
      this.uid = uid.orElse(null);
      optBits |= OPT_BIT_UID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    public final Builder number(UnsignedInt number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = Objects.requireNonNull(number, "number");
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("number")
    public final Builder number(Optional<? extends UnsignedInt> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = number.orElse(null);
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(List<Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specimen")
    public final Builder specimen(Optional<? extends List<Reference>> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#description() description} to description.
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
     * Initializes the optional value {@link ImagingStudy_Series#description() description} to description.
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
     * Builds a new {@link ImagingStudy_Series ImagingStudy_Series}.
     * @return An immutable instance of ImagingStudy_Series
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImagingStudy_Series build() {
      checkRequiredAttributes();
      return new ImmutableImagingStudy_Series(
          started,
          extension,
          laterality,
          instance,
          id,
          modality,
          bodySite,
          numberOfInstances,
          performer,
          modifierExtension,
          endpoint,
          uid,
          number,
          specimen,
          description);
    }

    private boolean startedIsSet() {
      return (optBits & OPT_BIT_STARTED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean lateralityIsSet() {
      return (optBits & OPT_BIT_LATERALITY) != 0;
    }

    private boolean instanceIsSet() {
      return (optBits & OPT_BIT_INSTANCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean numberOfInstancesIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_INSTANCES) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean uidIsSet() {
      return (optBits & OPT_BIT_UID) != 0;
    }

    private boolean numberIsSet() {
      return (optBits & OPT_BIT_NUMBER) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean modalityIsSet() {
      return (initBits & INIT_BIT_MODALITY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImagingStudy_Series is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!modalityIsSet()) attributes.add("modality");
      return "Cannot build ImagingStudy_Series, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImagingStudy_Series", generator = "Immutables")
  public interface ModalityBuildStage {
    /**
     * Initializes the value for the {@link ImagingStudy_Series#modality() modality} attribute.
     * @param modality The value for modality 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modality(Coding modality);
  }

  @Generated(from = "ImagingStudy_Series", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImagingStudy_Series#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for chained invocation
     */
    BuildFinal started(DateTime started);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal started(Optional<? extends DateTime> started);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#laterality() laterality} to laterality.
     * @param laterality The value for laterality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal laterality(Coding laterality);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#laterality() laterality} to laterality.
     * @param laterality The value for laterality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal laterality(Optional<? extends Coding> laterality);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instance(List<ImagingStudy_Instance> instance);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(Optional<? extends List<ImagingStudy_Instance>> instance);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(Coding bodySite);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends Coding> bodySite);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for chained invocation
     */
    BuildFinal numberOfInstances(UnsignedInt numberOfInstances);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal numberOfInstances(Optional<? extends UnsignedInt> numberOfInstances);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<ImagingStudy_Performer> performer);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<ImagingStudy_Performer>> performer);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(List<Reference> endpoint);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(Optional<? extends List<Reference>> endpoint);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for chained invocation
     */
    BuildFinal uid(Id uid);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal uid(Optional<? extends Id> uid);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    BuildFinal number(UnsignedInt number);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal number(Optional<? extends UnsignedInt> number);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(List<Reference> specimen);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(Optional<? extends List<Reference>> specimen);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Builds a new {@link ImagingStudy_Series ImagingStudy_Series}.
     * @return An immutable instance of ImagingStudy_Series
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImagingStudy_Series build();
  }
}
