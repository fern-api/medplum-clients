//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SubstanceNucleicAcid}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceNucleicAcid.builder()}.
 */
@org.immutables.value.Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceNucleicAcid implements com.fhir.SubstanceNucleicAcid {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept oligoNucleotideType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept sequenceType;
  private final @javax.annotation.Nullable java.lang.Integer numberOfSubunits;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceNucleicAcid_Subunit> subunit;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String areaOfHybridisation;
  private final @javax.annotation.Nullable com.fhir.Meta meta;

  private ImmutableSubstanceNucleicAcid(
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept oligoNucleotideType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.CodeableConcept sequenceType,
      @javax.annotation.Nullable java.lang.Integer numberOfSubunits,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceNucleicAcid_Subunit> subunit,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String areaOfHybridisation,
      @javax.annotation.Nullable com.fhir.Meta meta) {
    this.contained = contained;
    this.language = language;
    this.oligoNucleotideType = oligoNucleotideType;
    this.extension = extension;
    this.text = text;
    this.sequenceType = sequenceType;
    this.numberOfSubunits = numberOfSubunits;
    this.implicitRules = implicitRules;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
    this.subunit = subunit;
    this.id = id;
    this.areaOfHybridisation = areaOfHybridisation;
    this.meta = meta;
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code oligoNucleotideType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("oligoNucleotideType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> oligoNucleotideType() {
    return java.util.Optional.ofNullable(oligoNucleotideType);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code sequenceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequenceType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> sequenceType() {
    return java.util.Optional.ofNullable(sequenceType);
  }

  /**
   * @return The value of the {@code numberOfSubunits} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("numberOfSubunits")
  @Override
  public java.util.Optional<java.lang.Integer> numberOfSubunits() {
    return java.util.Optional.ofNullable(numberOfSubunits);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code subunit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subunit")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceNucleicAcid_Subunit>> subunit() {
    return java.util.Optional.ofNullable(subunit);
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
   * @return The value of the {@code areaOfHybridisation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("areaOfHybridisation")
  @Override
  public java.util.Optional<java.lang.String> areaOfHybridisation() {
    return java.util.Optional.ofNullable(areaOfHybridisation);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        newValue,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        value,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        newValue,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        value,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} attribute.
   * @param value The value for oligoNucleotideType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withOligoNucleotideType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "oligoNucleotideType");
    if (this.oligoNucleotideType == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        newValue,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for oligoNucleotideType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withOligoNucleotideType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.oligoNucleotideType == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        value,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        newValue,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        value,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        newValue,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        value,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#sequenceType() sequenceType} attribute.
   * @param value The value for sequenceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withSequenceType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "sequenceType");
    if (this.sequenceType == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        newValue,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#sequenceType() sequenceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequenceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withSequenceType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.sequenceType == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        value,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits} attribute.
   * @param value The value for numberOfSubunits
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withNumberOfSubunits(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.numberOfSubunits, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        newValue,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfSubunits
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withNumberOfSubunits(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.numberOfSubunits, value)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        value,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        newValue,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        value,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstanceNucleicAcid#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        newValue,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        value,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#subunit() subunit} attribute.
   * @param value The value for subunit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withSubunit(java.util.List<com.fhir.SubstanceNucleicAcid_Subunit> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceNucleicAcid_Subunit> newValue = java.util.Objects.requireNonNull(value, "subunit");
    if (this.subunit == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        newValue,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#subunit() subunit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subunit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withSubunit(java.util.Optional<? extends java.util.List<com.fhir.SubstanceNucleicAcid_Subunit>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceNucleicAcid_Subunit> value = optional.orElse(null);
    if (this.subunit == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        value,
        this.id,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        newValue,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        value,
        this.areaOfHybridisation,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} attribute.
   * @param value The value for areaOfHybridisation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withAreaOfHybridisation(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "areaOfHybridisation");
    if (java.util.Objects.equals(this.areaOfHybridisation, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        newValue,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for areaOfHybridisation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withAreaOfHybridisation(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.areaOfHybridisation, value)) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        value,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstanceNucleicAcid(
        this.contained,
        this.language,
        this.oligoNucleotideType,
        this.extension,
        this.text,
        this.sequenceType,
        this.numberOfSubunits,
        this.implicitRules,
        this.resourceType,
        this.modifierExtension,
        this.subunit,
        this.id,
        this.areaOfHybridisation,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceNucleicAcid} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceNucleicAcid
        && equalTo((ImmutableSubstanceNucleicAcid) another);
  }

  private boolean equalTo(ImmutableSubstanceNucleicAcid another) {
    return java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(oligoNucleotideType, another.oligoNucleotideType)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(sequenceType, another.sequenceType)
        && java.util.Objects.equals(numberOfSubunits, another.numberOfSubunits)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(subunit, another.subunit)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(areaOfHybridisation, another.areaOfHybridisation)
        && java.util.Objects.equals(meta, another.meta);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code language}, {@code oligoNucleotideType}, {@code extension}, {@code text}, {@code sequenceType}, {@code numberOfSubunits}, {@code implicitRules}, {@code resourceType}, {@code modifierExtension}, {@code subunit}, {@code id}, {@code areaOfHybridisation}, {@code meta}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(oligoNucleotideType);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(sequenceType);
    h += (h << 5) + java.util.Objects.hashCode(numberOfSubunits);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(subunit);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(areaOfHybridisation);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceNucleicAcid} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SubstanceNucleicAcid{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (language != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (oligoNucleotideType != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("oligoNucleotideType=").append(oligoNucleotideType);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (sequenceType != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("sequenceType=").append(sequenceType);
    }
    if (numberOfSubunits != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("numberOfSubunits=").append(numberOfSubunits);
    }
    if (implicitRules != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (subunit != null) {
      builder.append(", ");
      builder.append("subunit=").append(subunit);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (areaOfHybridisation != null) {
      builder.append(", ");
      builder.append("areaOfHybridisation=").append(areaOfHybridisation);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SubstanceNucleicAcid {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> oligoNucleotideType = java.util.Optional.empty();
    boolean oligoNucleotideTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> sequenceType = java.util.Optional.empty();
    boolean sequenceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> numberOfSubunits = java.util.Optional.empty();
    boolean numberOfSubunitsIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceNucleicAcid_Subunit>> subunit = java.util.Optional.empty();
    boolean subunitIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> areaOfHybridisation = java.util.Optional.empty();
    boolean areaOfHybridisationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("oligoNucleotideType")
    public void setOligoNucleotideType(java.util.Optional<com.fhir.CodeableConcept> oligoNucleotideType) {
      this.oligoNucleotideType = oligoNucleotideType;
      this.oligoNucleotideTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sequenceType")
    public void setSequenceType(java.util.Optional<com.fhir.CodeableConcept> sequenceType) {
      this.sequenceType = sequenceType;
      this.sequenceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfSubunits")
    public void setNumberOfSubunits(java.util.Optional<java.lang.Integer> numberOfSubunits) {
      this.numberOfSubunits = numberOfSubunits;
      this.numberOfSubunitsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subunit")
    public void setSubunit(java.util.Optional<java.util.List<com.fhir.SubstanceNucleicAcid_Subunit>> subunit) {
      this.subunit = subunit;
      this.subunitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("areaOfHybridisation")
    public void setAreaOfHybridisation(java.util.Optional<java.lang.String> areaOfHybridisation) {
      this.areaOfHybridisation = areaOfHybridisation;
      this.areaOfHybridisationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> oligoNucleotideType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> sequenceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> numberOfSubunits() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceNucleicAcid_Subunit>> subunit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> areaOfHybridisation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceNucleicAcid fromJson(Json json) {
    ImmutableSubstanceNucleicAcid.Builder builder = ((ImmutableSubstanceNucleicAcid.Builder) ImmutableSubstanceNucleicAcid.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.oligoNucleotideTypeIsSet) {
      builder.oligoNucleotideType(json.oligoNucleotideType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.sequenceTypeIsSet) {
      builder.sequenceType(json.sequenceType);
    }
    if (json.numberOfSubunitsIsSet) {
      builder.numberOfSubunits(json.numberOfSubunits);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.subunitIsSet) {
      builder.subunit(json.subunit);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.areaOfHybridisationIsSet) {
      builder.areaOfHybridisation(json.areaOfHybridisation);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
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
        .contained(instance.contained())
        .language(instance.language())
        .oligoNucleotideType(instance.oligoNucleotideType())
        .extension(instance.extension())
        .text(instance.text())
        .sequenceType(instance.sequenceType())
        .numberOfSubunits(instance.numberOfSubunits())
        .implicitRules(instance.implicitRules())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .subunit(instance.subunit())
        .id(instance.id())
        .areaOfHybridisation(instance.areaOfHybridisation())
        .meta(instance.meta())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceNucleicAcid SubstanceNucleicAcid}.
   * <pre>
   * ImmutableSubstanceNucleicAcid.builder()
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link SubstanceNucleicAcid#contained() contained}
   *    .language(com.fhir.code) // optional {@link SubstanceNucleicAcid#language() language}
   *    .oligoNucleotideType(com.fhir.CodeableConcept) // optional {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid#extension() extension}
   *    .text(com.fhir.Narrative) // optional {@link SubstanceNucleicAcid#text() text}
   *    .sequenceType(com.fhir.CodeableConcept) // optional {@link SubstanceNucleicAcid#sequenceType() sequenceType}
   *    .numberOfSubunits(Integer) // optional {@link SubstanceNucleicAcid#numberOfSubunits() numberOfSubunits}
   *    .implicitRules(com.fhir.uri) // optional {@link SubstanceNucleicAcid#implicitRules() implicitRules}
   *    .resourceType(String) // required {@link SubstanceNucleicAcid#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid#modifierExtension() modifierExtension}
   *    .subunit(List&amp;lt;com.fhir.SubstanceNucleicAcid_Subunit&amp;gt;) // optional {@link SubstanceNucleicAcid#subunit() subunit}
   *    .id(com.fhir.id) // optional {@link SubstanceNucleicAcid#id() id}
   *    .areaOfHybridisation(String) // optional {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation}
   *    .meta(com.fhir.Meta) // optional {@link SubstanceNucleicAcid#meta() meta}
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
  @org.immutables.value.Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_OLIGO_NUCLEOTIDE_TYPE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_SEQUENCE_TYPE = 0x20L;
    private static final long OPT_BIT_NUMBER_OF_SUBUNITS = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_SUBUNIT = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_AREA_OF_HYBRIDISATION = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept oligoNucleotideType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.CodeableConcept sequenceType;
    private @javax.annotation.Nullable java.lang.Integer numberOfSubunits;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceNucleicAcid_Subunit> subunit;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String areaOfHybridisation;
    private @javax.annotation.Nullable com.fhir.Meta meta;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#language() language} to language.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#language() language} to language.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} to oligoNucleotideType.
     * @param oligoNucleotideType The value for oligoNucleotideType
     * @return {@code this} builder for chained invocation
     */
    public final Builder oligoNucleotideType(com.fhir.CodeableConcept oligoNucleotideType) {
      checkNotIsSet(oligoNucleotideTypeIsSet(), "oligoNucleotideType");
      this.oligoNucleotideType = java.util.Objects.requireNonNull(oligoNucleotideType, "oligoNucleotideType");
      optBits |= OPT_BIT_OLIGO_NUCLEOTIDE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} to oligoNucleotideType.
     * @param oligoNucleotideType The value for oligoNucleotideType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oligoNucleotideType")
    public final Builder oligoNucleotideType(java.util.Optional<? extends com.fhir.CodeableConcept> oligoNucleotideType) {
      checkNotIsSet(oligoNucleotideTypeIsSet(), "oligoNucleotideType");
      this.oligoNucleotideType = oligoNucleotideType.orElse(null);
      optBits |= OPT_BIT_OLIGO_NUCLEOTIDE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#text() text} to text.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#text() text} to text.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequenceType(com.fhir.CodeableConcept sequenceType) {
      checkNotIsSet(sequenceTypeIsSet(), "sequenceType");
      this.sequenceType = java.util.Objects.requireNonNull(sequenceType, "sequenceType");
      optBits |= OPT_BIT_SEQUENCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequenceType")
    public final Builder sequenceType(java.util.Optional<? extends com.fhir.CodeableConcept> sequenceType) {
      checkNotIsSet(sequenceTypeIsSet(), "sequenceType");
      this.sequenceType = sequenceType.orElse(null);
      optBits |= OPT_BIT_SEQUENCE_TYPE;
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
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfSubunits")
    public final Builder numberOfSubunits(java.util.Optional<java.lang.Integer> numberOfSubunits) {
      checkNotIsSet(numberOfSubunitsIsSet(), "numberOfSubunits");
      this.numberOfSubunits = numberOfSubunits.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_SUBUNITS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link SubstanceNucleicAcid#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for chained invocation
     */
    public final Builder subunit(java.util.List<com.fhir.SubstanceNucleicAcid_Subunit> subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = java.util.Objects.requireNonNull(subunit, "subunit");
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subunit")
    public final Builder subunit(java.util.Optional<? extends java.util.List<com.fhir.SubstanceNucleicAcid_Subunit>> subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = subunit.orElse(null);
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#id() id} to id.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#id() id} to id.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} to areaOfHybridisation.
     * @param areaOfHybridisation The value for areaOfHybridisation
     * @return {@code this} builder for chained invocation
     */
    public final Builder areaOfHybridisation(java.lang.String areaOfHybridisation) {
      checkNotIsSet(areaOfHybridisationIsSet(), "areaOfHybridisation");
      this.areaOfHybridisation = java.util.Objects.requireNonNull(areaOfHybridisation, "areaOfHybridisation");
      optBits |= OPT_BIT_AREA_OF_HYBRIDISATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} to areaOfHybridisation.
     * @param areaOfHybridisation The value for areaOfHybridisation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areaOfHybridisation")
    public final Builder areaOfHybridisation(java.util.Optional<java.lang.String> areaOfHybridisation) {
      checkNotIsSet(areaOfHybridisationIsSet(), "areaOfHybridisation");
      this.areaOfHybridisation = areaOfHybridisation.orElse(null);
      optBits |= OPT_BIT_AREA_OF_HYBRIDISATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstanceNucleicAcid#meta() meta} to meta.
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
     * Builds a new {@link SubstanceNucleicAcid SubstanceNucleicAcid}.
     * @return An immutable instance of SubstanceNucleicAcid
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SubstanceNucleicAcid build() {
      checkRequiredAttributes();
      return new ImmutableSubstanceNucleicAcid(
          contained,
          language,
          oligoNucleotideType,
          extension,
          text,
          sequenceType,
          numberOfSubunits,
          implicitRules,
          resourceType,
          modifierExtension,
          subunit,
          id,
          areaOfHybridisation,
          meta);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean oligoNucleotideTypeIsSet() {
      return (optBits & OPT_BIT_OLIGO_NUCLEOTIDE_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean sequenceTypeIsSet() {
      return (optBits & OPT_BIT_SEQUENCE_TYPE) != 0;
    }

    private boolean numberOfSubunitsIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_SUBUNITS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean subunitIsSet() {
      return (optBits & OPT_BIT_SUBUNIT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean areaOfHybridisationIsSet() {
      return (optBits & OPT_BIT_AREA_OF_HYBRIDISATION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SubstanceNucleicAcid is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstanceNucleicAcid, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstanceNucleicAcid#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "SubstanceNucleicAcid", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} to oligoNucleotideType.
     * @param oligoNucleotideType The value for oligoNucleotideType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal oligoNucleotideType(com.fhir.CodeableConcept oligoNucleotideType);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#oligoNucleotideType() oligoNucleotideType} to oligoNucleotideType.
     * @param oligoNucleotideType The value for oligoNucleotideType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal oligoNucleotideType(java.util.Optional<? extends com.fhir.CodeableConcept> oligoNucleotideType);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequenceType(com.fhir.CodeableConcept sequenceType);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#sequenceType() sequenceType} to sequenceType.
     * @param sequenceType The value for sequenceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequenceType(java.util.Optional<? extends com.fhir.CodeableConcept> sequenceType);

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
    BuildFinal numberOfSubunits(java.util.Optional<java.lang.Integer> numberOfSubunits);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subunit(java.util.List<com.fhir.SubstanceNucleicAcid_Subunit> subunit);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subunit(java.util.Optional<? extends java.util.List<com.fhir.SubstanceNucleicAcid_Subunit>> subunit);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} to areaOfHybridisation.
     * @param areaOfHybridisation The value for areaOfHybridisation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal areaOfHybridisation(java.lang.String areaOfHybridisation);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#areaOfHybridisation() areaOfHybridisation} to areaOfHybridisation.
     * @param areaOfHybridisation The value for areaOfHybridisation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal areaOfHybridisation(java.util.Optional<java.lang.String> areaOfHybridisation);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Builds a new {@link SubstanceNucleicAcid SubstanceNucleicAcid}.
     * @return An immutable instance of SubstanceNucleicAcid
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstanceNucleicAcid build();
  }
}
