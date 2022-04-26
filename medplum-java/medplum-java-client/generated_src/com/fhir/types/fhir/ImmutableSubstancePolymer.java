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
 * Immutable implementation of {@link SubstancePolymer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstancePolymer.builder()}.
 */
@Generated(from = "SubstancePolymer", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstancePolymer implements SubstancePolymer {
  private final @Nullable Code language;
  private final @Nullable Meta meta;
  private final @Nullable List<String> modification;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> extension;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept geometry;
  private final @Nullable List<SubstancePolymer_Repeat> repeat;
  private final @Nullable Id id;
  private final @Nullable CodeableConcept _class;
  private final @Nullable List<CodeableConcept> copolymerConnectivity;
  private final String resourceType;
  private final @Nullable List<SubstancePolymer_MonomerSet> monomerSet;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableSubstancePolymer(
      @Nullable Code language,
      @Nullable Meta meta,
      @Nullable List<String> modification,
      @Nullable List<ResourceList> contained,
      @Nullable Narrative text,
      @Nullable List<Extension> extension,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept geometry,
      @Nullable List<SubstancePolymer_Repeat> repeat,
      @Nullable Id id,
      @Nullable CodeableConcept _class,
      @Nullable List<CodeableConcept> copolymerConnectivity,
      String resourceType,
      @Nullable List<SubstancePolymer_MonomerSet> monomerSet,
      @Nullable List<Extension> modifierExtension) {
    this.language = language;
    this.meta = meta;
    this.modification = modification;
    this.contained = contained;
    this.text = text;
    this.extension = extension;
    this.implicitRules = implicitRules;
    this.geometry = geometry;
    this.repeat = repeat;
    this.id = id;
    this._class = _class;
    this.copolymerConnectivity = copolymerConnectivity;
    this.resourceType = resourceType;
    this.monomerSet = monomerSet;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code modification} attribute
   */
  @JsonProperty("modification")
  @Override
  public Optional<List<String>> modification() {
    return Optional.ofNullable(modification);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code geometry} attribute
   */
  @JsonProperty("geometry")
  @Override
  public Optional<CodeableConcept> geometry() {
    return Optional.ofNullable(geometry);
  }

  /**
   * @return The value of the {@code repeat} attribute
   */
  @JsonProperty("repeat")
  @Override
  public Optional<List<SubstancePolymer_Repeat>> repeat() {
    return Optional.ofNullable(repeat);
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
   * @return The value of the {@code _class} attribute
   */
  @JsonProperty("class")
  @Override
  public Optional<CodeableConcept> _class() {
    return Optional.ofNullable(_class);
  }

  /**
   * @return The value of the {@code copolymerConnectivity} attribute
   */
  @JsonProperty("copolymerConnectivity")
  @Override
  public Optional<List<CodeableConcept>> copolymerConnectivity() {
    return Optional.ofNullable(copolymerConnectivity);
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
   * @return The value of the {@code monomerSet} attribute
   */
  @JsonProperty("monomerSet")
  @Override
  public Optional<List<SubstancePolymer_MonomerSet>> monomerSet() {
    return Optional.ofNullable(monomerSet);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstancePolymer(
        newValue,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstancePolymer(
        value,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        newValue,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        value,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#modification() modification} attribute.
   * @param value The value for modification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withModification(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "modification");
    if (this.modification == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        newValue,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#modification() modification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withModification(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.modification == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        value,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        newValue,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        value,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        newValue,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        value,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        newValue,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        value,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        newValue,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        value,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#geometry() geometry} attribute.
   * @param value The value for geometry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withGeometry(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "geometry");
    if (this.geometry == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        newValue,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#geometry() geometry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for geometry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withGeometry(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.geometry == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        value,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#repeat() repeat} attribute.
   * @param value The value for repeat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withRepeat(List<SubstancePolymer_Repeat> value) {
    @Nullable List<SubstancePolymer_Repeat> newValue = Objects.requireNonNull(value, "repeat");
    if (this.repeat == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        newValue,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#repeat() repeat} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repeat
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withRepeat(Optional<? extends List<SubstancePolymer_Repeat>> optional) {
    @Nullable List<SubstancePolymer_Repeat> value = optional.orElse(null);
    if (this.repeat == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        value,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        newValue,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        value,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#_class() _class} attribute.
   * @param value The value for _class
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer with_class(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "_class");
    if (this._class == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        newValue,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#_class() _class} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _class
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer with_class(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this._class == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        value,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} attribute.
   * @param value The value for copolymerConnectivity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withCopolymerConnectivity(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "copolymerConnectivity");
    if (this.copolymerConnectivity == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        newValue,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copolymerConnectivity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withCopolymerConnectivity(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.copolymerConnectivity == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        value,
        this.resourceType,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstancePolymer#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstancePolymer withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        newValue,
        this.monomerSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#monomerSet() monomerSet} attribute.
   * @param value The value for monomerSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withMonomerSet(List<SubstancePolymer_MonomerSet> value) {
    @Nullable List<SubstancePolymer_MonomerSet> newValue = Objects.requireNonNull(value, "monomerSet");
    if (this.monomerSet == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#monomerSet() monomerSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for monomerSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withMonomerSet(Optional<? extends List<SubstancePolymer_MonomerSet>> optional) {
    @Nullable List<SubstancePolymer_MonomerSet> value = optional.orElse(null);
    if (this.monomerSet == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstancePolymer(
        this.language,
        this.meta,
        this.modification,
        this.contained,
        this.text,
        this.extension,
        this.implicitRules,
        this.geometry,
        this.repeat,
        this.id,
        this._class,
        this.copolymerConnectivity,
        this.resourceType,
        this.monomerSet,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstancePolymer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstancePolymer
        && equalTo((ImmutableSubstancePolymer) another);
  }

  private boolean equalTo(ImmutableSubstancePolymer another) {
    return Objects.equals(language, another.language)
        && Objects.equals(meta, another.meta)
        && Objects.equals(modification, another.modification)
        && Objects.equals(contained, another.contained)
        && Objects.equals(text, another.text)
        && Objects.equals(extension, another.extension)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(geometry, another.geometry)
        && Objects.equals(repeat, another.repeat)
        && Objects.equals(id, another.id)
        && Objects.equals(_class, another._class)
        && Objects.equals(copolymerConnectivity, another.copolymerConnectivity)
        && resourceType.equals(another.resourceType)
        && Objects.equals(monomerSet, another.monomerSet)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code meta}, {@code modification}, {@code contained}, {@code text}, {@code extension}, {@code implicitRules}, {@code geometry}, {@code repeat}, {@code id}, {@code _class}, {@code copolymerConnectivity}, {@code resourceType}, {@code monomerSet}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(modification);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(geometry);
    h += (h << 5) + Objects.hashCode(repeat);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(_class);
    h += (h << 5) + Objects.hashCode(copolymerConnectivity);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(monomerSet);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstancePolymer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstancePolymer{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (meta != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modification != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modification=").append(modification);
    }
    if (contained != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (text != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (implicitRules != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (geometry != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("geometry=").append(geometry);
    }
    if (repeat != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("repeat=").append(repeat);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (_class != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("_class=").append(_class);
    }
    if (copolymerConnectivity != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("copolymerConnectivity=").append(copolymerConnectivity);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (monomerSet != null) {
      builder.append(", ");
      builder.append("monomerSet=").append(monomerSet);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstancePolymer", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstancePolymer {
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<String>> modification = Optional.empty();
    boolean modificationIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> geometry = Optional.empty();
    boolean geometryIsSet;
    @Nullable Optional<List<SubstancePolymer_Repeat>> repeat = Optional.empty();
    boolean repeatIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> _class = Optional.empty();
    boolean _classIsSet;
    @Nullable Optional<List<CodeableConcept>> copolymerConnectivity = Optional.empty();
    boolean copolymerConnectivityIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<SubstancePolymer_MonomerSet>> monomerSet = Optional.empty();
    boolean monomerSetIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("modification")
    public void setModification(Optional<List<String>> modification) {
      this.modification = modification;
      this.modificationIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("geometry")
    public void setGeometry(Optional<CodeableConcept> geometry) {
      this.geometry = geometry;
      this.geometryIsSet = true;
    }
    @JsonProperty("repeat")
    public void setRepeat(Optional<List<SubstancePolymer_Repeat>> repeat) {
      this.repeat = repeat;
      this.repeatIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("class")
    public void set_class(Optional<CodeableConcept> _class) {
      this._class = _class;
      this._classIsSet = true;
    }
    @JsonProperty("copolymerConnectivity")
    public void setCopolymerConnectivity(Optional<List<CodeableConcept>> copolymerConnectivity) {
      this.copolymerConnectivity = copolymerConnectivity;
      this.copolymerConnectivityIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("monomerSet")
    public void setMonomerSet(Optional<List<SubstancePolymer_MonomerSet>> monomerSet) {
      this.monomerSet = monomerSet;
      this.monomerSetIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> modification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> geometry() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstancePolymer_Repeat>> repeat() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> _class() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> copolymerConnectivity() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstancePolymer_MonomerSet>> monomerSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstancePolymer fromJson(Json json) {
    ImmutableSubstancePolymer.Builder builder = ((ImmutableSubstancePolymer.Builder) ImmutableSubstancePolymer.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modificationIsSet) {
      builder.modification(json.modification);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.geometryIsSet) {
      builder.geometry(json.geometry);
    }
    if (json.repeatIsSet) {
      builder.repeat(json.repeat);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json._classIsSet) {
      builder._class(json._class);
    }
    if (json.copolymerConnectivityIsSet) {
      builder.copolymerConnectivity(json.copolymerConnectivity);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.monomerSetIsSet) {
      builder.monomerSet(json.monomerSet);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .language(instance.language())
        .meta(instance.meta())
        .modification(instance.modification())
        .contained(instance.contained())
        .text(instance.text())
        .extension(instance.extension())
        .implicitRules(instance.implicitRules())
        .geometry(instance.geometry())
        .repeat(instance.repeat())
        .id(instance.id())
        ._class(instance._class())
        .copolymerConnectivity(instance.copolymerConnectivity())
        .resourceType(instance.resourceType())
        .monomerSet(instance.monomerSet())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstancePolymer SubstancePolymer}.
   * <pre>
   * ImmutableSubstancePolymer.builder()
   *    .language(com.fhir.types.fhir.Code) // optional {@link SubstancePolymer#language() language}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link SubstancePolymer#meta() meta}
   *    .modification(List&amp;lt;String&amp;gt;) // optional {@link SubstancePolymer#modification() modification}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link SubstancePolymer#contained() contained}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link SubstancePolymer#text() text}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer#extension() extension}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link SubstancePolymer#implicitRules() implicitRules}
   *    .geometry(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstancePolymer#geometry() geometry}
   *    .repeat(List&amp;lt;com.fhir.types.fhir.SubstancePolymer_Repeat&amp;gt;) // optional {@link SubstancePolymer#repeat() repeat}
   *    .id(com.fhir.types.fhir.Id) // optional {@link SubstancePolymer#id() id}
   *    ._class(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstancePolymer#_class() _class}
   *    .copolymerConnectivity(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity}
   *    .resourceType(String) // required {@link SubstancePolymer#resourceType() resourceType}
   *    .monomerSet(List&amp;lt;com.fhir.types.fhir.SubstancePolymer_MonomerSet&amp;gt;) // optional {@link SubstancePolymer#monomerSet() monomerSet}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer#modifierExtension() modifierExtension}
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
  @Generated(from = "SubstancePolymer", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_MODIFICATION = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_GEOMETRY = 0x80L;
    private static final long OPT_BIT_REPEAT = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT__CLASS = 0x400L;
    private static final long OPT_BIT_COPOLYMER_CONNECTIVITY = 0x800L;
    private static final long OPT_BIT_MONOMER_SET = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Code language;
    private @Nullable Meta meta;
    private @Nullable List<String> modification;
    private @Nullable List<ResourceList> contained;
    private @Nullable Narrative text;
    private @Nullable List<Extension> extension;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept geometry;
    private @Nullable List<SubstancePolymer_Repeat> repeat;
    private @Nullable Id id;
    private @Nullable CodeableConcept _class;
    private @Nullable List<CodeableConcept> copolymerConnectivity;
    private @Nullable String resourceType;
    private @Nullable List<SubstancePolymer_MonomerSet> monomerSet;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#language() language} to language.
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
     * Initializes the optional value {@link SubstancePolymer#language() language} to language.
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
     * Initializes the optional value {@link SubstancePolymer#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstancePolymer#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstancePolymer#modification() modification} to modification.
     * @param modification The value for modification
     * @return {@code this} builder for chained invocation
     */
    public final Builder modification(List<String> modification) {
      checkNotIsSet(modificationIsSet(), "modification");
      this.modification = Objects.requireNonNull(modification, "modification");
      optBits |= OPT_BIT_MODIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#modification() modification} to modification.
     * @param modification The value for modification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modification")
    public final Builder modification(Optional<? extends List<String>> modification) {
      checkNotIsSet(modificationIsSet(), "modification");
      this.modification = modification.orElse(null);
      optBits |= OPT_BIT_MODIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstancePolymer#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstancePolymer#text() text} to text.
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
     * Initializes the optional value {@link SubstancePolymer#text() text} to text.
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
     * Initializes the optional value {@link SubstancePolymer#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstancePolymer#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstancePolymer#geometry() geometry} to geometry.
     * @param geometry The value for geometry
     * @return {@code this} builder for chained invocation
     */
    public final Builder geometry(CodeableConcept geometry) {
      checkNotIsSet(geometryIsSet(), "geometry");
      this.geometry = Objects.requireNonNull(geometry, "geometry");
      optBits |= OPT_BIT_GEOMETRY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#geometry() geometry} to geometry.
     * @param geometry The value for geometry
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("geometry")
    public final Builder geometry(Optional<? extends CodeableConcept> geometry) {
      checkNotIsSet(geometryIsSet(), "geometry");
      this.geometry = geometry.orElse(null);
      optBits |= OPT_BIT_GEOMETRY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for chained invocation
     */
    public final Builder repeat(List<SubstancePolymer_Repeat> repeat) {
      checkNotIsSet(repeatIsSet(), "repeat");
      this.repeat = Objects.requireNonNull(repeat, "repeat");
      optBits |= OPT_BIT_REPEAT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("repeat")
    public final Builder repeat(Optional<? extends List<SubstancePolymer_Repeat>> repeat) {
      checkNotIsSet(repeatIsSet(), "repeat");
      this.repeat = repeat.orElse(null);
      optBits |= OPT_BIT_REPEAT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    public final Builder _class(CodeableConcept _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = Objects.requireNonNull(_class, "_class");
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("class")
    public final Builder _class(Optional<? extends CodeableConcept> _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = _class.orElse(null);
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} to copolymerConnectivity.
     * @param copolymerConnectivity The value for copolymerConnectivity
     * @return {@code this} builder for chained invocation
     */
    public final Builder copolymerConnectivity(List<CodeableConcept> copolymerConnectivity) {
      checkNotIsSet(copolymerConnectivityIsSet(), "copolymerConnectivity");
      this.copolymerConnectivity = Objects.requireNonNull(copolymerConnectivity, "copolymerConnectivity");
      optBits |= OPT_BIT_COPOLYMER_CONNECTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} to copolymerConnectivity.
     * @param copolymerConnectivity The value for copolymerConnectivity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("copolymerConnectivity")
    public final Builder copolymerConnectivity(Optional<? extends List<CodeableConcept>> copolymerConnectivity) {
      checkNotIsSet(copolymerConnectivityIsSet(), "copolymerConnectivity");
      this.copolymerConnectivity = copolymerConnectivity.orElse(null);
      optBits |= OPT_BIT_COPOLYMER_CONNECTIVITY;
      return this;
    }

    /**
     * Initializes the value for the {@link SubstancePolymer#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SubstancePolymer#monomerSet() monomerSet} to monomerSet.
     * @param monomerSet The value for monomerSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder monomerSet(List<SubstancePolymer_MonomerSet> monomerSet) {
      checkNotIsSet(monomerSetIsSet(), "monomerSet");
      this.monomerSet = Objects.requireNonNull(monomerSet, "monomerSet");
      optBits |= OPT_BIT_MONOMER_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#monomerSet() monomerSet} to monomerSet.
     * @param monomerSet The value for monomerSet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("monomerSet")
    public final Builder monomerSet(Optional<? extends List<SubstancePolymer_MonomerSet>> monomerSet) {
      checkNotIsSet(monomerSetIsSet(), "monomerSet");
      this.monomerSet = monomerSet.orElse(null);
      optBits |= OPT_BIT_MONOMER_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link SubstancePolymer SubstancePolymer}.
     * @return An immutable instance of SubstancePolymer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstancePolymer build() {
      checkRequiredAttributes();
      return new ImmutableSubstancePolymer(
          language,
          meta,
          modification,
          contained,
          text,
          extension,
          implicitRules,
          geometry,
          repeat,
          id,
          _class,
          copolymerConnectivity,
          resourceType,
          monomerSet,
          modifierExtension);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modificationIsSet() {
      return (optBits & OPT_BIT_MODIFICATION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean geometryIsSet() {
      return (optBits & OPT_BIT_GEOMETRY) != 0;
    }

    private boolean repeatIsSet() {
      return (optBits & OPT_BIT_REPEAT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean _classIsSet() {
      return (optBits & OPT_BIT__CLASS) != 0;
    }

    private boolean copolymerConnectivityIsSet() {
      return (optBits & OPT_BIT_COPOLYMER_CONNECTIVITY) != 0;
    }

    private boolean monomerSetIsSet() {
      return (optBits & OPT_BIT_MONOMER_SET) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstancePolymer is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstancePolymer, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SubstancePolymer", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstancePolymer#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SubstancePolymer", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstancePolymer#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SubstancePolymer#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link SubstancePolymer#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SubstancePolymer#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SubstancePolymer#modification() modification} to modification.
     * @param modification The value for modification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modification(List<String> modification);

    /**
     * Initializes the optional value {@link SubstancePolymer#modification() modification} to modification.
     * @param modification The value for modification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modification(Optional<? extends List<String>> modification);

    /**
     * Initializes the optional value {@link SubstancePolymer#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstancePolymer#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstancePolymer#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SubstancePolymer#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SubstancePolymer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SubstancePolymer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SubstancePolymer#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SubstancePolymer#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstancePolymer#geometry() geometry} to geometry.
     * @param geometry The value for geometry
     * @return {@code this} builder for chained invocation
     */
    BuildFinal geometry(CodeableConcept geometry);

    /**
     * Initializes the optional value {@link SubstancePolymer#geometry() geometry} to geometry.
     * @param geometry The value for geometry
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal geometry(Optional<? extends CodeableConcept> geometry);

    /**
     * Initializes the optional value {@link SubstancePolymer#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for chained invocation
     */
    BuildFinal repeat(List<SubstancePolymer_Repeat> repeat);

    /**
     * Initializes the optional value {@link SubstancePolymer#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal repeat(Optional<? extends List<SubstancePolymer_Repeat>> repeat);

    /**
     * Initializes the optional value {@link SubstancePolymer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SubstancePolymer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link SubstancePolymer#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    BuildFinal _class(CodeableConcept _class);

    /**
     * Initializes the optional value {@link SubstancePolymer#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _class(Optional<? extends CodeableConcept> _class);

    /**
     * Initializes the optional value {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} to copolymerConnectivity.
     * @param copolymerConnectivity The value for copolymerConnectivity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copolymerConnectivity(List<CodeableConcept> copolymerConnectivity);

    /**
     * Initializes the optional value {@link SubstancePolymer#copolymerConnectivity() copolymerConnectivity} to copolymerConnectivity.
     * @param copolymerConnectivity The value for copolymerConnectivity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copolymerConnectivity(Optional<? extends List<CodeableConcept>> copolymerConnectivity);

    /**
     * Initializes the optional value {@link SubstancePolymer#monomerSet() monomerSet} to monomerSet.
     * @param monomerSet The value for monomerSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal monomerSet(List<SubstancePolymer_MonomerSet> monomerSet);

    /**
     * Initializes the optional value {@link SubstancePolymer#monomerSet() monomerSet} to monomerSet.
     * @param monomerSet The value for monomerSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal monomerSet(Optional<? extends List<SubstancePolymer_MonomerSet>> monomerSet);

    /**
     * Initializes the optional value {@link SubstancePolymer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstancePolymer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link SubstancePolymer SubstancePolymer}.
     * @return An immutable instance of SubstancePolymer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstancePolymer build();
  }
}
