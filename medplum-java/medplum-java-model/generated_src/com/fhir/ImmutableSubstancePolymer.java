//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SubstancePolymer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstancePolymer.builder()}.
 */
@org.immutables.value.Generated(from = "SubstancePolymer", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstancePolymer implements com.fhir.SubstancePolymer {
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> modification;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_MonomerSet> monomerSet;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_Repeat> repeat;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept _class;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> copolymerConnectivity;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept geometry;

  private ImmutableSubstancePolymer(
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<java.lang.String> modification,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_MonomerSet> monomerSet,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_Repeat> repeat,
      @javax.annotation.Nullable com.fhir.CodeableConcept _class,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> copolymerConnectivity,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept geometry) {
    this.id = id;
    this.modification = modification;
    this.extension = extension;
    this.language = language;
    this.monomerSet = monomerSet;
    this.repeat = repeat;
    this._class = _class;
    this.contained = contained;
    this.copolymerConnectivity = copolymerConnectivity;
    this.meta = meta;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.geometry = geometry;
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
   * @return The value of the {@code modification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modification")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> modification() {
    return java.util.Optional.ofNullable(modification);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code monomerSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("monomerSet")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstancePolymer_MonomerSet>> monomerSet() {
    return java.util.Optional.ofNullable(monomerSet);
  }

  /**
   * @return The value of the {@code repeat} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("repeat")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstancePolymer_Repeat>> repeat() {
    return java.util.Optional.ofNullable(repeat);
  }

  /**
   * @return The value of the {@code _class} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("class")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> _class() {
    return java.util.Optional.ofNullable(_class);
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
   * @return The value of the {@code copolymerConnectivity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("copolymerConnectivity")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> copolymerConnectivity() {
    return java.util.Optional.ofNullable(copolymerConnectivity);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code geometry} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("geometry")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> geometry() {
    return java.util.Optional.ofNullable(geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstancePolymer(
        newValue,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstancePolymer(
        value,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#modification() modification} attribute.
   * @param value The value for modification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withModification(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "modification");
    if (this.modification == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        newValue,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#modification() modification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withModification(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.modification == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        value,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        newValue,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        value,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        newValue,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        value,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#monomerSet() monomerSet} attribute.
   * @param value The value for monomerSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withMonomerSet(java.util.List<com.fhir.SubstancePolymer_MonomerSet> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_MonomerSet> newValue = java.util.Objects.requireNonNull(value, "monomerSet");
    if (this.monomerSet == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        newValue,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#monomerSet() monomerSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for monomerSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withMonomerSet(java.util.Optional<? extends java.util.List<com.fhir.SubstancePolymer_MonomerSet>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_MonomerSet> value = optional.orElse(null);
    if (this.monomerSet == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        value,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#repeat() repeat} attribute.
   * @param value The value for repeat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withRepeat(java.util.List<com.fhir.SubstancePolymer_Repeat> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_Repeat> newValue = java.util.Objects.requireNonNull(value, "repeat");
    if (this.repeat == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        newValue,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#repeat() repeat} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repeat
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withRepeat(java.util.Optional<? extends java.util.List<com.fhir.SubstancePolymer_Repeat>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_Repeat> value = optional.orElse(null);
    if (this.repeat == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        value,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#_class() _class} attribute.
   * @param value The value for _class
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer with_class(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "_class");
    if (this._class == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        newValue,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#_class() _class} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _class
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer with_class(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this._class == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        value,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        newValue,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        value,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} attribute.
   * @param value The value for copolymerConnectivity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withCopolymerConnectivity(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "copolymerConnectivity");
    if (this.copolymerConnectivity == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        newValue,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copolymerConnectivity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withCopolymerConnectivity(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.copolymerConnectivity == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        value,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        value,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstancePolymer#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstancePolymer withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        newValue,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        newValue,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        value,
        this.text,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        value,
        this.modifierExtension,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        newValue,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        value,
        this.geometry);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#geometry() geometry} attribute.
   * @param value The value for geometry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withGeometry(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "geometry");
    if (this.geometry == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#geometry() geometry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for geometry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withGeometry(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.geometry == value) return this;
    return new ImmutableSubstancePolymer(
        this.id,
        this.modification,
        this.extension,
        this.language,
        this.monomerSet,
        this.repeat,
        this._class,
        this.contained,
        this.copolymerConnectivity,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.text,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstancePolymer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstancePolymer
        && equalTo((ImmutableSubstancePolymer) another);
  }

  private boolean equalTo(ImmutableSubstancePolymer another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modification, another.modification)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(monomerSet, another.monomerSet)
        && java.util.Objects.equals(repeat, another.repeat)
        && java.util.Objects.equals(_class, another._class)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(copolymerConnectivity, another.copolymerConnectivity)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(geometry, another.geometry);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modification}, {@code extension}, {@code language}, {@code monomerSet}, {@code repeat}, {@code _class}, {@code contained}, {@code copolymerConnectivity}, {@code meta}, {@code resourceType}, {@code implicitRules}, {@code text}, {@code modifierExtension}, {@code geometry}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modification);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(monomerSet);
    h += (h << 5) + java.util.Objects.hashCode(repeat);
    h += (h << 5) + java.util.Objects.hashCode(_class);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(copolymerConnectivity);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(geometry);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstancePolymer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SubstancePolymer{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modification != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modification=").append(modification);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (monomerSet != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("monomerSet=").append(monomerSet);
    }
    if (repeat != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("repeat=").append(repeat);
    }
    if (_class != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("_class=").append(_class);
    }
    if (contained != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (copolymerConnectivity != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("copolymerConnectivity=").append(copolymerConnectivity);
    }
    if (meta != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (geometry != null) {
      builder.append(", ");
      builder.append("geometry=").append(geometry);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SubstancePolymer", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SubstancePolymer {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> modification = java.util.Optional.empty();
    boolean modificationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstancePolymer_MonomerSet>> monomerSet = java.util.Optional.empty();
    boolean monomerSetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstancePolymer_Repeat>> repeat = java.util.Optional.empty();
    boolean repeatIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> _class = java.util.Optional.empty();
    boolean _classIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> copolymerConnectivity = java.util.Optional.empty();
    boolean copolymerConnectivityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> geometry = java.util.Optional.empty();
    boolean geometryIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modification")
    public void setModification(java.util.Optional<java.util.List<java.lang.String>> modification) {
      this.modification = modification;
      this.modificationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("monomerSet")
    public void setMonomerSet(java.util.Optional<java.util.List<com.fhir.SubstancePolymer_MonomerSet>> monomerSet) {
      this.monomerSet = monomerSet;
      this.monomerSetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("repeat")
    public void setRepeat(java.util.Optional<java.util.List<com.fhir.SubstancePolymer_Repeat>> repeat) {
      this.repeat = repeat;
      this.repeatIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    public void set_class(java.util.Optional<com.fhir.CodeableConcept> _class) {
      this._class = _class;
      this._classIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copolymerConnectivity")
    public void setCopolymerConnectivity(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> copolymerConnectivity) {
      this.copolymerConnectivity = copolymerConnectivity;
      this.copolymerConnectivityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("geometry")
    public void setGeometry(java.util.Optional<com.fhir.CodeableConcept> geometry) {
      this.geometry = geometry;
      this.geometryIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> modification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstancePolymer_MonomerSet>> monomerSet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstancePolymer_Repeat>> repeat() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> _class() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> copolymerConnectivity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> geometry() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSubstancePolymer fromJson(Json json) {
    ImmutableSubstancePolymer.Builder builder = ((ImmutableSubstancePolymer.Builder) ImmutableSubstancePolymer.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modificationIsSet) {
      builder.modification(json.modification);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.monomerSetIsSet) {
      builder.monomerSet(json.monomerSet);
    }
    if (json.repeatIsSet) {
      builder.repeat(json.repeat);
    }
    if (json._classIsSet) {
      builder._class(json._class);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.copolymerConnectivityIsSet) {
      builder.copolymerConnectivity(json.copolymerConnectivity);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.geometryIsSet) {
      builder.geometry(json.geometry);
    }
    return (ImmutableSubstancePolymer) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstancePolymer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstancePolymer instance
   */
  public static SubstancePolymer copyOf(SubstancePolymer instance) {
    if (instance instanceof ImmutableSubstancePolymer) {
      return (ImmutableSubstancePolymer) instance;
    }
    return ((ImmutableSubstancePolymer.Builder) ImmutableSubstancePolymer.builder())
        .id(instance.id())
        .modification(instance.modification())
        .extension(instance.extension())
        .language(instance.language())
        .monomerSet(instance.monomerSet())
        .repeat(instance.repeat())
        ._class(instance._class())
        .contained(instance.contained())
        .copolymerConnectivity(instance.copolymerConnectivity())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .geometry(instance.geometry())
        .build();
  }

  /**
   * Creates a builder for {@link SubstancePolymer SubstancePolymer}.
   * <pre>
   * ImmutableSubstancePolymer.builder()
   *    .id(com.fhir.id) // optional {@link SubstancePolymer#id() id}
   *    .modification(List&amp;lt;String&amp;gt;) // optional {@link SubstancePolymer#modification() modification}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer#extension() extension}
   *    .language(com.fhir.code) // optional {@link SubstancePolymer#language() language}
   *    .monomerSet(List&amp;lt;com.fhir.SubstancePolymer_MonomerSet&amp;gt;) // optional {@link SubstancePolymer#monomerSet() monomerSet}
   *    .repeat(List&amp;lt;com.fhir.SubstancePolymer_Repeat&amp;gt;) // optional {@link SubstancePolymer#repeat() repeat}
   *    ._class(com.fhir.CodeableConcept) // optional {@link SubstancePolymer#_class() _class}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link SubstancePolymer#contained() contained}
   *    .copolymerConnectivity(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity}
   *    .meta(com.fhir.Meta) // optional {@link SubstancePolymer#meta() meta}
   *    .resourceType(String) // required {@link SubstancePolymer#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link SubstancePolymer#implicitRules() implicitRules}
   *    .text(com.fhir.Narrative) // optional {@link SubstancePolymer#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer#modifierExtension() modifierExtension}
   *    .geometry(com.fhir.CodeableConcept) // optional {@link SubstancePolymer#geometry() geometry}
   *    .build();
   * </pre>
   * @return A new SubstancePolymer builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSubstancePolymer.Builder();
  }

  /**
   * Builds instances of type {@link SubstancePolymer SubstancePolymer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SubstancePolymer", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFICATION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_MONOMER_SET = 0x10L;
    private static final long OPT_BIT_REPEAT = 0x20L;
    private static final long OPT_BIT__CLASS = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_COPOLYMER_CONNECTIVITY = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_GEOMETRY = 0x2000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<java.lang.String> modification;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_MonomerSet> monomerSet;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstancePolymer_Repeat> repeat;
    private @javax.annotation.Nullable com.fhir.CodeableConcept _class;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> copolymerConnectivity;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept geometry;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer#modification() modification} to modification.
     * @param modification The value for modification
     * @return {@code this} builder for chained invocation
     */
    public final Builder modification(java.util.List<java.lang.String> modification) {
      checkNotIsSet(modificationIsSet(), "modification");
      this.modification = java.util.Objects.requireNonNull(modification, "modification");
      optBits |= OPT_BIT_MODIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#modification() modification} to modification.
     * @param modification The value for modification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modification")
    public final Builder modification(java.util.Optional<? extends java.util.List<java.lang.String>> modification) {
      checkNotIsSet(modificationIsSet(), "modification");
      this.modification = modification.orElse(null);
      optBits |= OPT_BIT_MODIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer#language() language} to language.
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
     * Initializes the optional value {@link SubstancePolymer#language() language} to language.
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
     * Initializes the optional value {@link SubstancePolymer#monomerSet() monomerSet} to monomerSet.
     * @param monomerSet The value for monomerSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder monomerSet(java.util.List<com.fhir.SubstancePolymer_MonomerSet> monomerSet) {
      checkNotIsSet(monomerSetIsSet(), "monomerSet");
      this.monomerSet = java.util.Objects.requireNonNull(monomerSet, "monomerSet");
      optBits |= OPT_BIT_MONOMER_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#monomerSet() monomerSet} to monomerSet.
     * @param monomerSet The value for monomerSet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monomerSet")
    public final Builder monomerSet(java.util.Optional<? extends java.util.List<com.fhir.SubstancePolymer_MonomerSet>> monomerSet) {
      checkNotIsSet(monomerSetIsSet(), "monomerSet");
      this.monomerSet = monomerSet.orElse(null);
      optBits |= OPT_BIT_MONOMER_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for chained invocation
     */
    public final Builder repeat(java.util.List<com.fhir.SubstancePolymer_Repeat> repeat) {
      checkNotIsSet(repeatIsSet(), "repeat");
      this.repeat = java.util.Objects.requireNonNull(repeat, "repeat");
      optBits |= OPT_BIT_REPEAT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repeat")
    public final Builder repeat(java.util.Optional<? extends java.util.List<com.fhir.SubstancePolymer_Repeat>> repeat) {
      checkNotIsSet(repeatIsSet(), "repeat");
      this.repeat = repeat.orElse(null);
      optBits |= OPT_BIT_REPEAT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    public final Builder _class(com.fhir.CodeableConcept _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = java.util.Objects.requireNonNull(_class, "_class");
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    public final Builder _class(java.util.Optional<? extends com.fhir.CodeableConcept> _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = _class.orElse(null);
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstancePolymer#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} to copolymerConnectivity.
     * @param copolymerConnectivity The value for copolymerConnectivity
     * @return {@code this} builder for chained invocation
     */
    public final Builder copolymerConnectivity(java.util.List<com.fhir.CodeableConcept> copolymerConnectivity) {
      checkNotIsSet(copolymerConnectivityIsSet(), "copolymerConnectivity");
      this.copolymerConnectivity = java.util.Objects.requireNonNull(copolymerConnectivity, "copolymerConnectivity");
      optBits |= OPT_BIT_COPOLYMER_CONNECTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} to copolymerConnectivity.
     * @param copolymerConnectivity The value for copolymerConnectivity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("copolymerConnectivity")
    public final Builder copolymerConnectivity(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> copolymerConnectivity) {
      checkNotIsSet(copolymerConnectivityIsSet(), "copolymerConnectivity");
      this.copolymerConnectivity = copolymerConnectivity.orElse(null);
      optBits |= OPT_BIT_COPOLYMER_CONNECTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstancePolymer#meta() meta} to meta.
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
     * Initializes the value for the {@link SubstancePolymer#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SubstancePolymer#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstancePolymer#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstancePolymer#text() text} to text.
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
     * Initializes the optional value {@link SubstancePolymer#text() text} to text.
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
     * Initializes the optional value {@link SubstancePolymer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer#geometry() geometry} to geometry.
     * @param geometry The value for geometry
     * @return {@code this} builder for chained invocation
     */
    public final Builder geometry(com.fhir.CodeableConcept geometry) {
      checkNotIsSet(geometryIsSet(), "geometry");
      this.geometry = java.util.Objects.requireNonNull(geometry, "geometry");
      optBits |= OPT_BIT_GEOMETRY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#geometry() geometry} to geometry.
     * @param geometry The value for geometry
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("geometry")
    public final Builder geometry(java.util.Optional<? extends com.fhir.CodeableConcept> geometry) {
      checkNotIsSet(geometryIsSet(), "geometry");
      this.geometry = geometry.orElse(null);
      optBits |= OPT_BIT_GEOMETRY;
      return this;
    }

    /**
     * Builds a new {@link SubstancePolymer SubstancePolymer}.
     * @return An immutable instance of SubstancePolymer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SubstancePolymer build() {
      checkRequiredAttributes();
      return new ImmutableSubstancePolymer(
          id,
          modification,
          extension,
          language,
          monomerSet,
          repeat,
          _class,
          contained,
          copolymerConnectivity,
          meta,
          resourceType,
          implicitRules,
          text,
          modifierExtension,
          geometry);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modificationIsSet() {
      return (optBits & OPT_BIT_MODIFICATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean monomerSetIsSet() {
      return (optBits & OPT_BIT_MONOMER_SET) != 0;
    }

    private boolean repeatIsSet() {
      return (optBits & OPT_BIT_REPEAT) != 0;
    }

    private boolean _classIsSet() {
      return (optBits & OPT_BIT__CLASS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean copolymerConnectivityIsSet() {
      return (optBits & OPT_BIT_COPOLYMER_CONNECTIVITY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean geometryIsSet() {
      return (optBits & OPT_BIT_GEOMETRY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SubstancePolymer is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstancePolymer, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SubstancePolymer", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstancePolymer#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "SubstancePolymer", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstancePolymer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link SubstancePolymer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link SubstancePolymer#modification() modification} to modification.
     * @param modification The value for modification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modification(java.util.List<java.lang.String> modification);

    /**
     * Initializes the optional value {@link SubstancePolymer#modification() modification} to modification.
     * @param modification The value for modification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modification(java.util.Optional<? extends java.util.List<java.lang.String>> modification);

    /**
     * Initializes the optional value {@link SubstancePolymer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SubstancePolymer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SubstancePolymer#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link SubstancePolymer#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link SubstancePolymer#monomerSet() monomerSet} to monomerSet.
     * @param monomerSet The value for monomerSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal monomerSet(java.util.List<com.fhir.SubstancePolymer_MonomerSet> monomerSet);

    /**
     * Initializes the optional value {@link SubstancePolymer#monomerSet() monomerSet} to monomerSet.
     * @param monomerSet The value for monomerSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal monomerSet(java.util.Optional<? extends java.util.List<com.fhir.SubstancePolymer_MonomerSet>> monomerSet);

    /**
     * Initializes the optional value {@link SubstancePolymer#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for chained invocation
     */
    BuildFinal repeat(java.util.List<com.fhir.SubstancePolymer_Repeat> repeat);

    /**
     * Initializes the optional value {@link SubstancePolymer#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal repeat(java.util.Optional<? extends java.util.List<com.fhir.SubstancePolymer_Repeat>> repeat);

    /**
     * Initializes the optional value {@link SubstancePolymer#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    BuildFinal _class(com.fhir.CodeableConcept _class);

    /**
     * Initializes the optional value {@link SubstancePolymer#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _class(java.util.Optional<? extends com.fhir.CodeableConcept> _class);

    /**
     * Initializes the optional value {@link SubstancePolymer#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstancePolymer#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} to copolymerConnectivity.
     * @param copolymerConnectivity The value for copolymerConnectivity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copolymerConnectivity(java.util.List<com.fhir.CodeableConcept> copolymerConnectivity);

    /**
     * Initializes the optional value {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} to copolymerConnectivity.
     * @param copolymerConnectivity The value for copolymerConnectivity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copolymerConnectivity(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> copolymerConnectivity);

    /**
     * Initializes the optional value {@link SubstancePolymer#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link SubstancePolymer#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link SubstancePolymer#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link SubstancePolymer#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstancePolymer#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link SubstancePolymer#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link SubstancePolymer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstancePolymer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SubstancePolymer#geometry() geometry} to geometry.
     * @param geometry The value for geometry
     * @return {@code this} builder for chained invocation
     */
    BuildFinal geometry(com.fhir.CodeableConcept geometry);

    /**
     * Initializes the optional value {@link SubstancePolymer#geometry() geometry} to geometry.
     * @param geometry The value for geometry
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal geometry(java.util.Optional<? extends com.fhir.CodeableConcept> geometry);

    /**
     * Builds a new {@link SubstancePolymer SubstancePolymer}.
     * @return An immutable instance of SubstancePolymer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstancePolymer build();
  }
}
