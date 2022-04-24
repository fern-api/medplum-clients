//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ImagingStudy_Series}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImagingStudy_Series.builder()}.
 */
@org.immutables.value.Generated(from = "ImagingStudy_Series", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImagingStudy_Series implements com.fhir.ImagingStudy_Series {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.unsignedInt number;
  private final @javax.annotation.Nullable com.fhir.id uid;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimen;
  private final @javax.annotation.Nullable com.fhir.Coding laterality;
  private final @javax.annotation.Nullable com.fhir.unsignedInt numberOfInstances;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
  private final @javax.annotation.Nullable com.fhir.Coding bodySite;
  private final @javax.annotation.Nullable com.fhir.dateTime started;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Instance> instance;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Performer> performer;
  private final com.fhir.Coding modality;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableImagingStudy_Series(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.unsignedInt number,
      @javax.annotation.Nullable com.fhir.id uid,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimen,
      @javax.annotation.Nullable com.fhir.Coding laterality,
      @javax.annotation.Nullable com.fhir.unsignedInt numberOfInstances,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint,
      @javax.annotation.Nullable com.fhir.Coding bodySite,
      @javax.annotation.Nullable com.fhir.dateTime started,
      @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Instance> instance,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Performer> performer,
      com.fhir.Coding modality,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.number = number;
    this.uid = uid;
    this.specimen = specimen;
    this.laterality = laterality;
    this.numberOfInstances = numberOfInstances;
    this.endpoint = endpoint;
    this.bodySite = bodySite;
    this.started = started;
    this.instance = instance;
    this.description = description;
    this.performer = performer;
    this.modality = modality;
    this.extension = extension;
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
   * @return The value of the {@code number} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("number")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> number() {
    return java.util.Optional.ofNullable(number);
  }

  /**
   * @return The value of the {@code uid} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("uid")
  @Override
  public java.util.Optional<com.fhir.id> uid() {
    return java.util.Optional.ofNullable(uid);
  }

  /**
   * @return The value of the {@code specimen} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specimen")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> specimen() {
    return java.util.Optional.ofNullable(specimen);
  }

  /**
   * @return The value of the {@code laterality} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("laterality")
  @Override
  public java.util.Optional<com.fhir.Coding> laterality() {
    return java.util.Optional.ofNullable(laterality);
  }

  /**
   * @return The value of the {@code numberOfInstances} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("numberOfInstances")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> numberOfInstances() {
    return java.util.Optional.ofNullable(numberOfInstances);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() {
    return java.util.Optional.ofNullable(endpoint);
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
  @Override
  public java.util.Optional<com.fhir.Coding> bodySite() {
    return java.util.Optional.ofNullable(bodySite);
  }

  /**
   * @return The value of the {@code started} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("started")
  @Override
  public java.util.Optional<com.fhir.dateTime> started() {
    return java.util.Optional.ofNullable(started);
  }

  /**
   * @return The value of the {@code instance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ImagingStudy_Instance>> instance() {
    return java.util.Optional.ofNullable(instance);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ImagingStudy_Performer>> performer() {
    return java.util.Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code modality} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modality")
  @Override
  public com.fhir.Coding modality() {
    return modality;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableImagingStudy_Series(
        newValue,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableImagingStudy_Series(
        value,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        newValue,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        value,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#number() number} attribute.
   * @param value The value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withNumber(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "number");
    if (this.number == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        newValue,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#number() number} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for number
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withNumber(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.number == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        value,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#uid() uid} attribute.
   * @param value The value for uid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withUid(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "uid");
    if (this.uid == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        newValue,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#uid() uid} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uid
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withUid(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.uid == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        value,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withSpecimen(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        newValue,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withSpecimen(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        value,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#laterality() laterality} attribute.
   * @param value The value for laterality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withLaterality(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "laterality");
    if (this.laterality == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        newValue,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#laterality() laterality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for laterality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withLaterality(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.laterality == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        value,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} attribute.
   * @param value The value for numberOfInstances
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withNumberOfInstances(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "numberOfInstances");
    if (this.numberOfInstances == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        newValue,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfInstances
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withNumberOfInstances(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.numberOfInstances == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        value,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withEndpoint(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        newValue,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withEndpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        value,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withBodySite(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        newValue,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withBodySite(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        value,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#started() started} attribute.
   * @param value The value for started
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withStarted(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "started");
    if (this.started == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        newValue,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#started() started} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for started
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withStarted(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.started == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        value,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#instance() instance} attribute.
   * @param value The value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withInstance(java.util.List<com.fhir.ImagingStudy_Instance> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Instance> newValue = java.util.Objects.requireNonNull(value, "instance");
    if (this.instance == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        newValue,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#instance() instance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withInstance(java.util.Optional<? extends java.util.List<com.fhir.ImagingStudy_Instance>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Instance> value = optional.orElse(null);
    if (this.instance == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        value,
        this.description,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        newValue,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        value,
        this.performer,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withPerformer(java.util.List<com.fhir.ImagingStudy_Performer> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Performer> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        newValue,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withPerformer(java.util.Optional<? extends java.util.List<com.fhir.ImagingStudy_Performer>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        value,
        this.modality,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImagingStudy_Series#modality() modality} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for modality
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImagingStudy_Series withModality(com.fhir.Coding value) {
    if (this.modality == value) return this;
    com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "modality");
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Series#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Series withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Series#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Series withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImagingStudy_Series(
        this.id,
        this.modifierExtension,
        this.number,
        this.uid,
        this.specimen,
        this.laterality,
        this.numberOfInstances,
        this.endpoint,
        this.bodySite,
        this.started,
        this.instance,
        this.description,
        this.performer,
        this.modality,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImagingStudy_Series} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImagingStudy_Series
        && equalTo((ImmutableImagingStudy_Series) another);
  }

  private boolean equalTo(ImmutableImagingStudy_Series another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(number, another.number)
        && java.util.Objects.equals(uid, another.uid)
        && java.util.Objects.equals(specimen, another.specimen)
        && java.util.Objects.equals(laterality, another.laterality)
        && java.util.Objects.equals(numberOfInstances, another.numberOfInstances)
        && java.util.Objects.equals(endpoint, another.endpoint)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(started, another.started)
        && java.util.Objects.equals(instance, another.instance)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(performer, another.performer)
        && modality.equals(another.modality)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code number}, {@code uid}, {@code specimen}, {@code laterality}, {@code numberOfInstances}, {@code endpoint}, {@code bodySite}, {@code started}, {@code instance}, {@code description}, {@code performer}, {@code modality}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(number);
    h += (h << 5) + java.util.Objects.hashCode(uid);
    h += (h << 5) + java.util.Objects.hashCode(specimen);
    h += (h << 5) + java.util.Objects.hashCode(laterality);
    h += (h << 5) + java.util.Objects.hashCode(numberOfInstances);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(started);
    h += (h << 5) + java.util.Objects.hashCode(instance);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + modality.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ImagingStudy_Series} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ImagingStudy_Series{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (number != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("number=").append(number);
    }
    if (uid != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("uid=").append(uid);
    }
    if (specimen != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (laterality != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("laterality=").append(laterality);
    }
    if (numberOfInstances != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("numberOfInstances=").append(numberOfInstances);
    }
    if (endpoint != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (bodySite != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (started != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("started=").append(started);
    }
    if (instance != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("instance=").append(instance);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (performer != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("modality=").append(modality);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ImagingStudy_Series", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ImagingStudy_Series {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> number = java.util.Optional.empty();
    boolean numberIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> uid = java.util.Optional.empty();
    boolean uidIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> specimen = java.util.Optional.empty();
    boolean specimenIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> laterality = java.util.Optional.empty();
    boolean lateralityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> numberOfInstances = java.util.Optional.empty();
    boolean numberOfInstancesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> started = java.util.Optional.empty();
    boolean startedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ImagingStudy_Instance>> instance = java.util.Optional.empty();
    boolean instanceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ImagingStudy_Performer>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable com.fhir.Coding modality;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
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
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    public void setNumber(java.util.Optional<com.fhir.unsignedInt> number) {
      this.number = number;
      this.numberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    public void setUid(java.util.Optional<com.fhir.id> uid) {
      this.uid = uid;
      this.uidIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public void setSpecimen(java.util.Optional<java.util.List<com.fhir.Reference>> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("laterality")
    public void setLaterality(java.util.Optional<com.fhir.Coding> laterality) {
      this.laterality = laterality;
      this.lateralityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfInstances")
    public void setNumberOfInstances(java.util.Optional<com.fhir.unsignedInt> numberOfInstances) {
      this.numberOfInstances = numberOfInstances;
      this.numberOfInstancesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<java.util.List<com.fhir.Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<com.fhir.Coding> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("started")
    public void setStarted(java.util.Optional<com.fhir.dateTime> started) {
      this.started = started;
      this.startedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instance")
    public void setInstance(java.util.Optional<java.util.List<com.fhir.ImagingStudy_Instance>> instance) {
      this.instance = instance;
      this.instanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.ImagingStudy_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modality")
    public void setModality(com.fhir.Coding modality) {
      this.modality = modality;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> number() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> uid() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> laterality() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> numberOfInstances() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> started() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ImagingStudy_Instance>> instance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ImagingStudy_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Coding modality() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableImagingStudy_Series fromJson(Json json) {
    ImmutableImagingStudy_Series.Builder builder = ((ImmutableImagingStudy_Series.Builder) ImmutableImagingStudy_Series.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.numberIsSet) {
      builder.number(json.number);
    }
    if (json.uidIsSet) {
      builder.uid(json.uid);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.lateralityIsSet) {
      builder.laterality(json.laterality);
    }
    if (json.numberOfInstancesIsSet) {
      builder.numberOfInstances(json.numberOfInstances);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.startedIsSet) {
      builder.started(json.started);
    }
    if (json.instanceIsSet) {
      builder.instance(json.instance);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.modality != null) {
      builder.modality(json.modality);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .number(instance.number())
        .uid(instance.uid())
        .specimen(instance.specimen())
        .laterality(instance.laterality())
        .numberOfInstances(instance.numberOfInstances())
        .endpoint(instance.endpoint())
        .bodySite(instance.bodySite())
        .started(instance.started())
        .instance(instance.instance())
        .description(instance.description())
        .performer(instance.performer())
        .modality(instance.modality())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ImagingStudy_Series ImagingStudy_Series}.
   * <pre>
   * ImmutableImagingStudy_Series.builder()
   *    .id(String) // optional {@link ImagingStudy_Series#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Series#modifierExtension() modifierExtension}
   *    .number(com.fhir.unsignedInt) // optional {@link ImagingStudy_Series#number() number}
   *    .uid(com.fhir.id) // optional {@link ImagingStudy_Series#uid() uid}
   *    .specimen(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ImagingStudy_Series#specimen() specimen}
   *    .laterality(com.fhir.Coding) // optional {@link ImagingStudy_Series#laterality() laterality}
   *    .numberOfInstances(com.fhir.unsignedInt) // optional {@link ImagingStudy_Series#numberOfInstances() numberOfInstances}
   *    .endpoint(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ImagingStudy_Series#endpoint() endpoint}
   *    .bodySite(com.fhir.Coding) // optional {@link ImagingStudy_Series#bodySite() bodySite}
   *    .started(com.fhir.dateTime) // optional {@link ImagingStudy_Series#started() started}
   *    .instance(List&amp;lt;com.fhir.ImagingStudy_Instance&amp;gt;) // optional {@link ImagingStudy_Series#instance() instance}
   *    .description(String) // optional {@link ImagingStudy_Series#description() description}
   *    .performer(List&amp;lt;com.fhir.ImagingStudy_Performer&amp;gt;) // optional {@link ImagingStudy_Series#performer() performer}
   *    .modality(com.fhir.Coding) // required {@link ImagingStudy_Series#modality() modality}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Series#extension() extension}
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
  @org.immutables.value.Generated(from = "ImagingStudy_Series", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ModalityBuildStage, BuildFinal {
    private static final long INIT_BIT_MODALITY = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_NUMBER = 0x4L;
    private static final long OPT_BIT_UID = 0x8L;
    private static final long OPT_BIT_SPECIMEN = 0x10L;
    private static final long OPT_BIT_LATERALITY = 0x20L;
    private static final long OPT_BIT_NUMBER_OF_INSTANCES = 0x40L;
    private static final long OPT_BIT_ENDPOINT = 0x80L;
    private static final long OPT_BIT_BODY_SITE = 0x100L;
    private static final long OPT_BIT_STARTED = 0x200L;
    private static final long OPT_BIT_INSTANCE = 0x400L;
    private static final long OPT_BIT_DESCRIPTION = 0x800L;
    private static final long OPT_BIT_PERFORMER = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.unsignedInt number;
    private @javax.annotation.Nullable com.fhir.id uid;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimen;
    private @javax.annotation.Nullable com.fhir.Coding laterality;
    private @javax.annotation.Nullable com.fhir.unsignedInt numberOfInstances;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
    private @javax.annotation.Nullable com.fhir.Coding bodySite;
    private @javax.annotation.Nullable com.fhir.dateTime started;
    private @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Instance> instance;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Performer> performer;
    private @javax.annotation.Nullable com.fhir.Coding modality;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy_Series#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy_Series#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Series#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Series#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    public final Builder number(com.fhir.unsignedInt number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = java.util.Objects.requireNonNull(number, "number");
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    public final Builder number(java.util.Optional<? extends com.fhir.unsignedInt> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = number.orElse(null);
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for chained invocation
     */
    public final Builder uid(com.fhir.id uid) {
      checkNotIsSet(uidIsSet(), "uid");
      this.uid = java.util.Objects.requireNonNull(uid, "uid");
      optBits |= OPT_BIT_UID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    public final Builder uid(java.util.Optional<? extends com.fhir.id> uid) {
      checkNotIsSet(uidIsSet(), "uid");
      this.uid = uid.orElse(null);
      optBits |= OPT_BIT_UID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(java.util.List<com.fhir.Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = java.util.Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public final Builder specimen(java.util.Optional<? extends java.util.List<com.fhir.Reference>> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#laterality() laterality} to laterality.
     * @param laterality The value for laterality
     * @return {@code this} builder for chained invocation
     */
    public final Builder laterality(com.fhir.Coding laterality) {
      checkNotIsSet(lateralityIsSet(), "laterality");
      this.laterality = java.util.Objects.requireNonNull(laterality, "laterality");
      optBits |= OPT_BIT_LATERALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#laterality() laterality} to laterality.
     * @param laterality The value for laterality
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("laterality")
    public final Builder laterality(java.util.Optional<? extends com.fhir.Coding> laterality) {
      checkNotIsSet(lateralityIsSet(), "laterality");
      this.laterality = laterality.orElse(null);
      optBits |= OPT_BIT_LATERALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfInstances(com.fhir.unsignedInt numberOfInstances) {
      checkNotIsSet(numberOfInstancesIsSet(), "numberOfInstances");
      this.numberOfInstances = java.util.Objects.requireNonNull(numberOfInstances, "numberOfInstances");
      optBits |= OPT_BIT_NUMBER_OF_INSTANCES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfInstances")
    public final Builder numberOfInstances(java.util.Optional<? extends com.fhir.unsignedInt> numberOfInstances) {
      checkNotIsSet(numberOfInstancesIsSet(), "numberOfInstances");
      this.numberOfInstances = numberOfInstances.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_INSTANCES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(java.util.List<com.fhir.Reference> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public final Builder endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(com.fhir.Coding bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = java.util.Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public final Builder bodySite(java.util.Optional<? extends com.fhir.Coding> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for chained invocation
     */
    public final Builder started(com.fhir.dateTime started) {
      checkNotIsSet(startedIsSet(), "started");
      this.started = java.util.Objects.requireNonNull(started, "started");
      optBits |= OPT_BIT_STARTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("started")
    public final Builder started(java.util.Optional<? extends com.fhir.dateTime> started) {
      checkNotIsSet(startedIsSet(), "started");
      this.started = started.orElse(null);
      optBits |= OPT_BIT_STARTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    public final Builder instance(java.util.List<com.fhir.ImagingStudy_Instance> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = java.util.Objects.requireNonNull(instance, "instance");
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instance")
    public final Builder instance(java.util.Optional<? extends java.util.List<com.fhir.ImagingStudy_Instance>> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance.orElse(null);
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.ImagingStudy_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.ImagingStudy_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the value for the {@link ImagingStudy_Series#modality() modality} attribute.
     * @param modality The value for modality 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modality")
    public final Builder modality(com.fhir.Coding modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = java.util.Objects.requireNonNull(modality, "modality");
      initBits &= ~INIT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Series#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy_Series#extension() extension} to extension.
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
     * Builds a new {@link ImagingStudy_Series ImagingStudy_Series}.
     * @return An immutable instance of ImagingStudy_Series
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ImagingStudy_Series build() {
      checkRequiredAttributes();
      return new ImmutableImagingStudy_Series(
          id,
          modifierExtension,
          number,
          uid,
          specimen,
          laterality,
          numberOfInstances,
          endpoint,
          bodySite,
          started,
          instance,
          description,
          performer,
          modality,
          extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean numberIsSet() {
      return (optBits & OPT_BIT_NUMBER) != 0;
    }

    private boolean uidIsSet() {
      return (optBits & OPT_BIT_UID) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean lateralityIsSet() {
      return (optBits & OPT_BIT_LATERALITY) != 0;
    }

    private boolean numberOfInstancesIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_INSTANCES) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean startedIsSet() {
      return (optBits & OPT_BIT_STARTED) != 0;
    }

    private boolean instanceIsSet() {
      return (optBits & OPT_BIT_INSTANCE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modalityIsSet() {
      return (initBits & INIT_BIT_MODALITY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ImagingStudy_Series is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!modalityIsSet()) attributes.add("modality");
      return "Cannot build ImagingStudy_Series, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ImagingStudy_Series", generator = "Immutables")
  public interface ModalityBuildStage {
    /**
     * Initializes the value for the {@link ImagingStudy_Series#modality() modality} attribute.
     * @param modality The value for modality 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modality(com.fhir.Coding modality);
  }

  @org.immutables.value.Generated(from = "ImagingStudy_Series", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImagingStudy_Series#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    BuildFinal number(com.fhir.unsignedInt number);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal number(java.util.Optional<? extends com.fhir.unsignedInt> number);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for chained invocation
     */
    BuildFinal uid(com.fhir.id uid);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal uid(java.util.Optional<? extends com.fhir.id> uid);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(java.util.List<com.fhir.Reference> specimen);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(java.util.Optional<? extends java.util.List<com.fhir.Reference>> specimen);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#laterality() laterality} to laterality.
     * @param laterality The value for laterality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal laterality(com.fhir.Coding laterality);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#laterality() laterality} to laterality.
     * @param laterality The value for laterality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal laterality(java.util.Optional<? extends com.fhir.Coding> laterality);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for chained invocation
     */
    BuildFinal numberOfInstances(com.fhir.unsignedInt numberOfInstances);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal numberOfInstances(java.util.Optional<? extends com.fhir.unsignedInt> numberOfInstances);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(java.util.List<com.fhir.Reference> endpoint);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(com.fhir.Coding bodySite);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends com.fhir.Coding> bodySite);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for chained invocation
     */
    BuildFinal started(com.fhir.dateTime started);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal started(java.util.Optional<? extends com.fhir.dateTime> started);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instance(java.util.List<com.fhir.ImagingStudy_Instance> instance);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(java.util.Optional<? extends java.util.List<com.fhir.ImagingStudy_Instance>> instance);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.ImagingStudy_Performer> performer);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.ImagingStudy_Performer>> performer);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ImagingStudy_Series#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Builds a new {@link ImagingStudy_Series ImagingStudy_Series}.
     * @return An immutable instance of ImagingStudy_Series
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImagingStudy_Series build();
  }
}
