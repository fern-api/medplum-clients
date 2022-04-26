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
 * Immutable implementation of {@link SubstanceNucleicAcid}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceNucleicAcid.builder()}.
 */
@Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceNucleicAcid implements SubstanceNucleicAcid {
  private final @Nullable Meta meta;
  private final @Nullable Integer numberOfSubunits;
  private final @Nullable String areaOfHybridisation;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable CodeableConcept sequenceType;
  private final @Nullable Narrative text;
  private final String resourceType;
  private final @Nullable CodeableConcept oligoNucleotideType;
  private final @Nullable List<SubstanceNucleicAcid_Subunit> subunit;
  private final @Nullable Code language;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableSubstanceNucleicAcid(
      @Nullable Meta meta,
      @Nullable Integer numberOfSubunits,
      @Nullable String areaOfHybridisation,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> extension,
      @Nullable List<ResourceList> contained,
      @Nullable CodeableConcept sequenceType,
      @Nullable Narrative text,
      String resourceType,
      @Nullable CodeableConcept oligoNucleotideType,
      @Nullable List<SubstanceNucleicAcid_Subunit> subunit,
      @Nullable Code language,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension) {
    this.meta = meta;
    this.numberOfSubunits = numberOfSubunits;
    this.areaOfHybridisation = areaOfHybridisation;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.contained = contained;
    this.sequenceType = sequenceType;
    this.text = text;
    this.resourceType = resourceType;
    this.oligoNucleotideType = oligoNucleotideType;
    this.subunit = subunit;
    this.language = language;
    this.id = id;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code numberOfSubunits} attribute
   */
  @JsonProperty("numberOfSubunits")
  @Override
  public Optional<Integer> numberOfSubunits() {
    return Optional.ofNullable(numberOfSubunits);
  }

  /**
   * @return The value of the {@code areaOfHybridisation} attribute
   */
  @JsonProperty("areaOfHybridisation")
  @Override
  public Optional<String> areaOfHybridisation() {
    return Optional.ofNullable(areaOfHybridisation);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code sequenceType} attribute
   */
  @JsonProperty("sequenceType")
  @Override
  public Optional<CodeableConcept> sequenceType() {
    return Optional.ofNullable(sequenceType);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code oligoNucleotideType} attribute
   */
  @JsonProperty("oligoNucleotideType")
  @Override
  public Optional<CodeableConcept> oligoNucleotideType() {
    return Optional.ofNullable(oligoNucleotideType);
  }

  /**
   * @return The value of the {@code subunit} attribute
   */
  @JsonProperty("subunit")
  @Override
  public Optional<List<SubstanceNucleicAcid_Subunit>> subunit() {
    return Optional.ofNullable(subunit);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        newValue,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        value,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits} attribute.
   * @param value The value for numberOfSubunits
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withNumberOfSubunits(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.numberOfSubunits, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        newValue,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfSubunits
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withNumberOfSubunits(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.numberOfSubunits, value)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        value,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} attribute.
   * @param value The value for areaOfHybridisation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withAreaOfHybridisation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "areaOfHybridisation");
    if (Objects.equals(this.areaOfHybridisation, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        newValue,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for areaOfHybridisation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withAreaOfHybridisation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.areaOfHybridisation, value)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        value,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        newValue,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        value,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        newValue,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        value,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        newValue,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        value,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#sequenceType() sequenceType} attribute.
   * @param value The value for sequenceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withSequenceType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "sequenceType");
    if (this.sequenceType == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        newValue,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#sequenceType() sequenceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequenceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withSequenceType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.sequenceType == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        value,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        newValue,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        value,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstanceNucleicAcid#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        newValue,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} attribute.
   * @param value The value for oligoNucleotideType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withOligoNucleotideType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "oligoNucleotideType");
    if (this.oligoNucleotideType == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        newValue,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for oligoNucleotideType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withOligoNucleotideType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.oligoNucleotideType == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        value,
        this.subunit,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#subunit() subunit} attribute.
   * @param value The value for subunit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withSubunit(List<SubstanceNucleicAcid_Subunit> value) {
    @Nullable List<SubstanceNucleicAcid_Subunit> newValue = Objects.requireNonNull(value, "subunit");
    if (this.subunit == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        newValue,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#subunit() subunit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subunit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withSubunit(Optional<? extends List<SubstanceNucleicAcid_Subunit>> optional) {
    @Nullable List<SubstanceNucleicAcid_Subunit> value = optional.orElse(null);
    if (this.subunit == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        value,
        this.language,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        newValue,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        value,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.meta,
        this.numberOfSubunits,
        this.areaOfHybridisation,
        this.implicitRules,
        this.extension,
        this.contained,
        this.sequenceType,
        this.text,
        this.resourceType,
        this.oligoNucleotideType,
        this.subunit,
        this.language,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceNucleicAcid} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceNucleicAcid
        && equalTo((ImmutableSubstanceNucleicAcid) another);
  }

  private boolean equalTo(ImmutableSubstanceNucleicAcid another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(numberOfSubunits, another.numberOfSubunits)
        && Objects.equals(areaOfHybridisation, another.areaOfHybridisation)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(extension, another.extension)
        && Objects.equals(contained, another.contained)
        && Objects.equals(sequenceType, another.sequenceType)
        && Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && Objects.equals(oligoNucleotideType, another.oligoNucleotideType)
        && Objects.equals(subunit, another.subunit)
        && Objects.equals(language, another.language)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code numberOfSubunits}, {@code areaOfHybridisation}, {@code implicitRules}, {@code extension}, {@code contained}, {@code sequenceType}, {@code text}, {@code resourceType}, {@code oligoNucleotideType}, {@code subunit}, {@code language}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(numberOfSubunits);
    h += (h << 5) + Objects.hashCode(areaOfHybridisation);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(sequenceType);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(oligoNucleotideType);
    h += (h << 5) + Objects.hashCode(subunit);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceNucleicAcid} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceNucleicAcid{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (numberOfSubunits != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("numberOfSubunits=").append(numberOfSubunits);
    }
    if (areaOfHybridisation != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("areaOfHybridisation=").append(areaOfHybridisation);
    }
    if (implicitRules != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contained != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (sequenceType != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("sequenceType=").append(sequenceType);
    }
    if (text != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (oligoNucleotideType != null) {
      builder.append(", ");
      builder.append("oligoNucleotideType=").append(oligoNucleotideType);
    }
    if (subunit != null) {
      builder.append(", ");
      builder.append("subunit=").append(subunit);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
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
  @Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceNucleicAcid {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Integer> numberOfSubunits = Optional.empty();
    boolean numberOfSubunitsIsSet;
    @Nullable Optional<String> areaOfHybridisation = Optional.empty();
    boolean areaOfHybridisationIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<CodeableConcept> sequenceType = Optional.empty();
    boolean sequenceTypeIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable String resourceType;
    @Nullable Optional<CodeableConcept> oligoNucleotideType = Optional.empty();
    boolean oligoNucleotideTypeIsSet;
    @Nullable Optional<List<SubstanceNucleicAcid_Subunit>> subunit = Optional.empty();
    boolean subunitIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("numberOfSubunits")
    public void setNumberOfSubunits(Optional<Integer> numberOfSubunits) {
      this.numberOfSubunits = numberOfSubunits;
      this.numberOfSubunitsIsSet = true;
    }
    @JsonProperty("areaOfHybridisation")
    public void setAreaOfHybridisation(Optional<String> areaOfHybridisation) {
      this.areaOfHybridisation = areaOfHybridisation;
      this.areaOfHybridisationIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("sequenceType")
    public void setSequenceType(Optional<CodeableConcept> sequenceType) {
      this.sequenceType = sequenceType;
      this.sequenceTypeIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("oligoNucleotideType")
    public void setOligoNucleotideType(Optional<CodeableConcept> oligoNucleotideType) {
      this.oligoNucleotideType = oligoNucleotideType;
      this.oligoNucleotideTypeIsSet = true;
    }
    @JsonProperty("subunit")
    public void setSubunit(Optional<List<SubstanceNucleicAcid_Subunit>> subunit) {
      this.subunit = subunit;
      this.subunitIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> numberOfSubunits() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> areaOfHybridisation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> sequenceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> oligoNucleotideType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceNucleicAcid_Subunit>> subunit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableSubstanceNucleicAcid fromJson(Json json) {
    ImmutableSubstanceNucleicAcid.Builder builder = ((ImmutableSubstanceNucleicAcid.Builder) ImmutableSubstanceNucleicAcid.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.numberOfSubunitsIsSet) {
      builder.numberOfSubunits(json.numberOfSubunits);
    }
    if (json.areaOfHybridisationIsSet) {
      builder.areaOfHybridisation(json.areaOfHybridisation);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.sequenceTypeIsSet) {
      builder.sequenceType(json.sequenceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.oligoNucleotideTypeIsSet) {
      builder.oligoNucleotideType(json.oligoNucleotideType);
    }
    if (json.subunitIsSet) {
      builder.subunit(json.subunit);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableSubstanceNucleicAcid) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceNucleicAcid} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceNucleicAcid instance
   */
  public static SubstanceNucleicAcid copyOf(SubstanceNucleicAcid instance) {
    if (instance instanceof ImmutableSubstanceNucleicAcid) {
      return (ImmutableSubstanceNucleicAcid) instance;
    }
    return ((ImmutableSubstanceNucleicAcid.Builder) ImmutableSubstanceNucleicAcid.builder())
        .meta(instance.meta())
        .numberOfSubunits(instance.numberOfSubunits())
        .areaOfHybridisation(instance.areaOfHybridisation())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .contained(instance.contained())
        .sequenceType(instance.sequenceType())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .oligoNucleotideType(instance.oligoNucleotideType())
        .subunit(instance.subunit())
        .language(instance.language())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceNucleicAcid SubstanceNucleicAcid}.
   * <pre>
   * ImmutableSubstanceNucleicAcid.builder()
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link SubstanceNucleicAcid#meta() meta}
   *    .numberOfSubunits(Integer) // optional {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits}
   *    .areaOfHybridisation(String) // optional {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link SubstanceNucleicAcid#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid#extension() extension}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link SubstanceNucleicAcid#contained() contained}
   *    .sequenceType(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceNucleicAcid#sequenceType() sequenceType}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link SubstanceNucleicAcid#text() text}
   *    .resourceType(String) // required {@link SubstanceNucleicAcid#resourceType() resourceType}
   *    .oligoNucleotideType(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType}
   *    .subunit(List&amp;lt;com.medplum.types.fhir.SubstanceNucleicAcid_Subunit&amp;gt;) // optional {@link SubstanceNucleicAcid#subunit() subunit}
   *    .language(com.medplum.types.fhir.Code) // optional {@link SubstanceNucleicAcid#language() language}
   *    .id(com.medplum.types.fhir.Id) // optional {@link SubstanceNucleicAcid#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new SubstanceNucleicAcid builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSubstanceNucleicAcid.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceNucleicAcid SubstanceNucleicAcid}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_NUMBER_OF_SUBUNITS = 0x2L;
    private static final long OPT_BIT_AREA_OF_HYBRIDISATION = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_SEQUENCE_TYPE = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private static final long OPT_BIT_OLIGO_NUCLEOTIDE_TYPE = 0x100L;
    private static final long OPT_BIT_SUBUNIT = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable Integer numberOfSubunits;
    private @Nullable String areaOfHybridisation;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> extension;
    private @Nullable List<ResourceList> contained;
    private @Nullable CodeableConcept sequenceType;
    private @Nullable Narrative text;
    private @Nullable String resourceType;
    private @Nullable CodeableConcept oligoNucleotideType;
    private @Nullable List<SubstanceNucleicAcid_Subunit> subunit;
    private @Nullable Code language;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits} to numberOfSubunits.
     * @param numberOfSubunits The value for numberOfSubunits
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfSubunits(int numberOfSubunits) {
      checkNotIsSet(numberOfSubunitsIsSet(), "numberOfSubunits");
      this.numberOfSubunits = numberOfSubunits;
      optBits |= OPT_BIT_NUMBER_OF_SUBUNITS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits} to numberOfSubunits.
     * @param numberOfSubunits The value for numberOfSubunits
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numberOfSubunits")
    public final Builder numberOfSubunits(Optional<Integer> numberOfSubunits) {
      checkNotIsSet(numberOfSubunitsIsSet(), "numberOfSubunits");
      this.numberOfSubunits = numberOfSubunits.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_SUBUNITS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} to areaOfHybridisation.
     * @param areaOfHybridisation The value for areaOfHybridisation
     * @return {@code this} builder for chained invocation
     */
    public final Builder areaOfHybridisation(String areaOfHybridisation) {
      checkNotIsSet(areaOfHybridisationIsSet(), "areaOfHybridisation");
      this.areaOfHybridisation = Objects.requireNonNull(areaOfHybridisation, "areaOfHybridisation");
      optBits |= OPT_BIT_AREA_OF_HYBRIDISATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} to areaOfHybridisation.
     * @param areaOfHybridisation The value for areaOfHybridisation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("areaOfHybridisation")
    public final Builder areaOfHybridisation(Optional<String> areaOfHybridisation) {
      checkNotIsSet(areaOfHybridisationIsSet(), "areaOfHybridisation");
      this.areaOfHybridisation = areaOfHybridisation.orElse(null);
      optBits |= OPT_BIT_AREA_OF_HYBRIDISATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequenceType(CodeableConcept sequenceType) {
      checkNotIsSet(sequenceTypeIsSet(), "sequenceType");
      this.sequenceType = Objects.requireNonNull(sequenceType, "sequenceType");
      optBits |= OPT_BIT_SEQUENCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequenceType")
    public final Builder sequenceType(Optional<? extends CodeableConcept> sequenceType) {
      checkNotIsSet(sequenceTypeIsSet(), "sequenceType");
      this.sequenceType = sequenceType.orElse(null);
      optBits |= OPT_BIT_SEQUENCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#text() text} to text.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#text() text} to text.
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
     * Initializes the value for the {@link SubstanceNucleicAcid#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} to oligoNucleotideType.
     * @param oligoNucleotideType The value for oligoNucleotideType
     * @return {@code this} builder for chained invocation
     */
    public final Builder oligoNucleotideType(CodeableConcept oligoNucleotideType) {
      checkNotIsSet(oligoNucleotideTypeIsSet(), "oligoNucleotideType");
      this.oligoNucleotideType = Objects.requireNonNull(oligoNucleotideType, "oligoNucleotideType");
      optBits |= OPT_BIT_OLIGO_NUCLEOTIDE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} to oligoNucleotideType.
     * @param oligoNucleotideType The value for oligoNucleotideType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("oligoNucleotideType")
    public final Builder oligoNucleotideType(Optional<? extends CodeableConcept> oligoNucleotideType) {
      checkNotIsSet(oligoNucleotideTypeIsSet(), "oligoNucleotideType");
      this.oligoNucleotideType = oligoNucleotideType.orElse(null);
      optBits |= OPT_BIT_OLIGO_NUCLEOTIDE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for chained invocation
     */
    public final Builder subunit(List<SubstanceNucleicAcid_Subunit> subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = Objects.requireNonNull(subunit, "subunit");
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subunit")
    public final Builder subunit(Optional<? extends List<SubstanceNucleicAcid_Subunit>> subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = subunit.orElse(null);
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#language() language} to language.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#language() language} to language.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#id() id} to id.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#id() id} to id.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link SubstanceNucleicAcid SubstanceNucleicAcid}.
     * @return An immutable instance of SubstanceNucleicAcid
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceNucleicAcid build() {
      checkRequiredAttributes();
      return new ImmutableSubstanceNucleicAcid(
          meta,
          numberOfSubunits,
          areaOfHybridisation,
          implicitRules,
          extension,
          contained,
          sequenceType,
          text,
          resourceType,
          oligoNucleotideType,
          subunit,
          language,
          id,
          modifierExtension);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean numberOfSubunitsIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_SUBUNITS) != 0;
    }

    private boolean areaOfHybridisationIsSet() {
      return (optBits & OPT_BIT_AREA_OF_HYBRIDISATION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean sequenceTypeIsSet() {
      return (optBits & OPT_BIT_SEQUENCE_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean oligoNucleotideTypeIsSet() {
      return (optBits & OPT_BIT_OLIGO_NUCLEOTIDE_TYPE) != 0;
    }

    private boolean subunitIsSet() {
      return (optBits & OPT_BIT_SUBUNIT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceNucleicAcid is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstanceNucleicAcid, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstanceNucleicAcid#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits} to numberOfSubunits.
     * @param numberOfSubunits The value for numberOfSubunits
     * @return {@code this} builder for chained invocation
     */
    BuildFinal numberOfSubunits(int numberOfSubunits);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits} to numberOfSubunits.
     * @param numberOfSubunits The value for numberOfSubunits
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal numberOfSubunits(Optional<Integer> numberOfSubunits);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} to areaOfHybridisation.
     * @param areaOfHybridisation The value for areaOfHybridisation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal areaOfHybridisation(String areaOfHybridisation);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} to areaOfHybridisation.
     * @param areaOfHybridisation The value for areaOfHybridisation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal areaOfHybridisation(Optional<String> areaOfHybridisation);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequenceType(CodeableConcept sequenceType);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequenceType(Optional<? extends CodeableConcept> sequenceType);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} to oligoNucleotideType.
     * @param oligoNucleotideType The value for oligoNucleotideType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal oligoNucleotideType(CodeableConcept oligoNucleotideType);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} to oligoNucleotideType.
     * @param oligoNucleotideType The value for oligoNucleotideType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal oligoNucleotideType(Optional<? extends CodeableConcept> oligoNucleotideType);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subunit(List<SubstanceNucleicAcid_Subunit> subunit);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subunit(Optional<? extends List<SubstanceNucleicAcid_Subunit>> subunit);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link SubstanceNucleicAcid SubstanceNucleicAcid}.
     * @return An immutable instance of SubstanceNucleicAcid
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstanceNucleicAcid build();
  }
}
