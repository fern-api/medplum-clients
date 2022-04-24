//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProduct_SpecialDesignation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProduct_SpecialDesignation.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProduct_SpecialDesignation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProduct_SpecialDesignation
    implements com.fhir.MedicinalProduct_SpecialDesignation {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept status;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept indicationCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept species;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept intendedUse;
  private final @javax.annotation.Nullable com.fhir.Reference indicationReference;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableMedicinalProduct_SpecialDesignation(
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.CodeableConcept status,
      @javax.annotation.Nullable com.fhir.CodeableConcept indicationCodeableConcept,
      @javax.annotation.Nullable com.fhir.CodeableConcept species,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept intendedUse,
      @javax.annotation.Nullable com.fhir.Reference indicationReference,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.type = type;
    this.status = status;
    this.indicationCodeableConcept = indicationCodeableConcept;
    this.species = species;
    this.identifier = identifier;
    this.modifierExtension = modifierExtension;
    this.intendedUse = intendedUse;
    this.indicationReference = indicationReference;
    this.date = date;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code indicationCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("indicationCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> indicationCodeableConcept() {
    return java.util.Optional.ofNullable(indicationCodeableConcept);
  }

  /**
   * @return The value of the {@code species} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("species")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> species() {
    return java.util.Optional.ofNullable(species);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code intendedUse} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intendedUse")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> intendedUse() {
    return java.util.Optional.ofNullable(intendedUse);
  }

  /**
   * @return The value of the {@code indicationReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("indicationReference")
  @Override
  public java.util.Optional<com.fhir.Reference> indicationReference() {
    return java.util.Optional.ofNullable(indicationReference);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        newValue,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        value,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        newValue,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        value,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept} attribute.
   * @param value The value for indicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withIndicationCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "indicationCodeableConcept");
    if (this.indicationCodeableConcept == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        newValue,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for indicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withIndicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.indicationCodeableConcept == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        value,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#species() species} attribute.
   * @param value The value for species
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withSpecies(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "species");
    if (this.species == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        newValue,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#species() species} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for species
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withSpecies(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.species == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        value,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        newValue,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        value,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        newValue,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        value,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse} attribute.
   * @param value The value for intendedUse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withIntendedUse(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "intendedUse");
    if (this.intendedUse == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        newValue,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intendedUse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withIntendedUse(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.intendedUse == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        value,
        this.indicationReference,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference} attribute.
   * @param value The value for indicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withIndicationReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "indicationReference");
    if (this.indicationReference == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        newValue,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for indicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withIndicationReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.indicationReference == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        value,
        this.date,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        newValue,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        value,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.status,
        this.indicationCodeableConcept,
        this.species,
        this.identifier,
        this.modifierExtension,
        this.intendedUse,
        this.indicationReference,
        this.date,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProduct_SpecialDesignation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProduct_SpecialDesignation
        && equalTo((ImmutableMedicinalProduct_SpecialDesignation) another);
  }

  private boolean equalTo(ImmutableMedicinalProduct_SpecialDesignation another) {
    return java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(indicationCodeableConcept, another.indicationCodeableConcept)
        && java.util.Objects.equals(species, another.species)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(intendedUse, another.intendedUse)
        && java.util.Objects.equals(indicationReference, another.indicationReference)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code status}, {@code indicationCodeableConcept}, {@code species}, {@code identifier}, {@code modifierExtension}, {@code intendedUse}, {@code indicationReference}, {@code date}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(indicationCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(species);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(intendedUse);
    h += (h << 5) + java.util.Objects.hashCode(indicationReference);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProduct_SpecialDesignation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProduct_SpecialDesignation{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (status != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (indicationCodeableConcept != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("indicationCodeableConcept=").append(indicationCodeableConcept);
    }
    if (species != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("species=").append(species);
    }
    if (identifier != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (modifierExtension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (intendedUse != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("intendedUse=").append(intendedUse);
    }
    if (indicationReference != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("indicationReference=").append(indicationReference);
    }
    if (date != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (id != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProduct_SpecialDesignation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProduct_SpecialDesignation {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> indicationCodeableConcept = java.util.Optional.empty();
    boolean indicationCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> species = java.util.Optional.empty();
    boolean speciesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> intendedUse = java.util.Optional.empty();
    boolean intendedUseIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> indicationReference = java.util.Optional.empty();
    boolean indicationReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("indicationCodeableConcept")
    public void setIndicationCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> indicationCodeableConcept) {
      this.indicationCodeableConcept = indicationCodeableConcept;
      this.indicationCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("species")
    public void setSpecies(java.util.Optional<com.fhir.CodeableConcept> species) {
      this.species = species;
      this.speciesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intendedUse")
    public void setIntendedUse(java.util.Optional<com.fhir.CodeableConcept> intendedUse) {
      this.intendedUse = intendedUse;
      this.intendedUseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("indicationReference")
    public void setIndicationReference(java.util.Optional<com.fhir.Reference> indicationReference) {
      this.indicationReference = indicationReference;
      this.indicationReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> indicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> species() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> intendedUse() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> indicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProduct_SpecialDesignation fromJson(Json json) {
    ImmutableMedicinalProduct_SpecialDesignation.Builder builder = ImmutableMedicinalProduct_SpecialDesignation.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.indicationCodeableConceptIsSet) {
      builder.indicationCodeableConcept(json.indicationCodeableConcept);
    }
    if (json.speciesIsSet) {
      builder.species(json.species);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.intendedUseIsSet) {
      builder.intendedUse(json.intendedUse);
    }
    if (json.indicationReferenceIsSet) {
      builder.indicationReference(json.indicationReference);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableMedicinalProduct_SpecialDesignation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProduct_SpecialDesignation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProduct_SpecialDesignation instance
   */
  public static MedicinalProduct_SpecialDesignation copyOf(MedicinalProduct_SpecialDesignation instance) {
    if (instance instanceof ImmutableMedicinalProduct_SpecialDesignation) {
      return (ImmutableMedicinalProduct_SpecialDesignation) instance;
    }
    return ImmutableMedicinalProduct_SpecialDesignation.builder()
        .type(instance.type())
        .status(instance.status())
        .indicationCodeableConcept(instance.indicationCodeableConcept())
        .species(instance.species())
        .identifier(instance.identifier())
        .modifierExtension(instance.modifierExtension())
        .intendedUse(instance.intendedUse())
        .indicationReference(instance.indicationReference())
        .date(instance.date())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProduct_SpecialDesignation MedicinalProduct_SpecialDesignation}.
   * <pre>
   * ImmutableMedicinalProduct_SpecialDesignation.builder()
   *    .type(com.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#type() type}
   *    .status(com.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#status() status}
   *    .indicationCodeableConcept(com.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept}
   *    .species(com.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#species() species}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicinalProduct_SpecialDesignation#identifier() identifier}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension}
   *    .intendedUse(com.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse}
   *    .indicationReference(com.fhir.Reference) // optional {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference}
   *    .date(com.fhir.dateTime) // optional {@link MedicinalProduct_SpecialDesignation#date() date}
   *    .id(String) // optional {@link MedicinalProduct_SpecialDesignation#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_SpecialDesignation#extension() extension}
   *    .build();
   * </pre>
   * @return A new MedicinalProduct_SpecialDesignation builder
   */
  public static ImmutableMedicinalProduct_SpecialDesignation.Builder builder() {
    return new ImmutableMedicinalProduct_SpecialDesignation.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProduct_SpecialDesignation MedicinalProduct_SpecialDesignation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProduct_SpecialDesignation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_STATUS = 0x2L;
    private static final long OPT_BIT_INDICATION_CODEABLE_CONCEPT = 0x4L;
    private static final long OPT_BIT_SPECIES = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_INTENDED_USE = 0x40L;
    private static final long OPT_BIT_INDICATION_REFERENCE = 0x80L;
    private static final long OPT_BIT_DATE = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.CodeableConcept status;
    private @javax.annotation.Nullable com.fhir.CodeableConcept indicationCodeableConcept;
    private @javax.annotation.Nullable com.fhir.CodeableConcept species;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept intendedUse;
    private @javax.annotation.Nullable com.fhir.Reference indicationReference;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.CodeableConcept> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept} to indicationCodeableConcept.
     * @param indicationCodeableConcept The value for indicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder indicationCodeableConcept(com.fhir.CodeableConcept indicationCodeableConcept) {
      checkNotIsSet(indicationCodeableConceptIsSet(), "indicationCodeableConcept");
      this.indicationCodeableConcept = java.util.Objects.requireNonNull(indicationCodeableConcept, "indicationCodeableConcept");
      optBits |= OPT_BIT_INDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept} to indicationCodeableConcept.
     * @param indicationCodeableConcept The value for indicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indicationCodeableConcept")
    public final Builder indicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> indicationCodeableConcept) {
      checkNotIsSet(indicationCodeableConceptIsSet(), "indicationCodeableConcept");
      this.indicationCodeableConcept = indicationCodeableConcept.orElse(null);
      optBits |= OPT_BIT_INDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#species() species} to species.
     * @param species The value for species
     * @return {@code this} builder for chained invocation
     */
    public final Builder species(com.fhir.CodeableConcept species) {
      checkNotIsSet(speciesIsSet(), "species");
      this.species = java.util.Objects.requireNonNull(species, "species");
      optBits |= OPT_BIT_SPECIES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#species() species} to species.
     * @param species The value for species
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("species")
    public final Builder species(java.util.Optional<? extends com.fhir.CodeableConcept> species) {
      checkNotIsSet(speciesIsSet(), "species");
      this.species = species.orElse(null);
      optBits |= OPT_BIT_SPECIES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse} to intendedUse.
     * @param intendedUse The value for intendedUse
     * @return {@code this} builder for chained invocation
     */
    public final Builder intendedUse(com.fhir.CodeableConcept intendedUse) {
      checkNotIsSet(intendedUseIsSet(), "intendedUse");
      this.intendedUse = java.util.Objects.requireNonNull(intendedUse, "intendedUse");
      optBits |= OPT_BIT_INTENDED_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse} to intendedUse.
     * @param intendedUse The value for intendedUse
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intendedUse")
    public final Builder intendedUse(java.util.Optional<? extends com.fhir.CodeableConcept> intendedUse) {
      checkNotIsSet(intendedUseIsSet(), "intendedUse");
      this.intendedUse = intendedUse.orElse(null);
      optBits |= OPT_BIT_INTENDED_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference} to indicationReference.
     * @param indicationReference The value for indicationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder indicationReference(com.fhir.Reference indicationReference) {
      checkNotIsSet(indicationReferenceIsSet(), "indicationReference");
      this.indicationReference = java.util.Objects.requireNonNull(indicationReference, "indicationReference");
      optBits |= OPT_BIT_INDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference} to indicationReference.
     * @param indicationReference The value for indicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("indicationReference")
    public final Builder indicationReference(java.util.Optional<? extends com.fhir.Reference> indicationReference) {
      checkNotIsSet(indicationReferenceIsSet(), "indicationReference");
      this.indicationReference = indicationReference.orElse(null);
      optBits |= OPT_BIT_INDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#extension() extension} to extension.
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
     * Builds a new {@link MedicinalProduct_SpecialDesignation MedicinalProduct_SpecialDesignation}.
     * @return An immutable instance of MedicinalProduct_SpecialDesignation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProduct_SpecialDesignation build() {
      return new ImmutableMedicinalProduct_SpecialDesignation(
          type,
          status,
          indicationCodeableConcept,
          species,
          identifier,
          modifierExtension,
          intendedUse,
          indicationReference,
          date,
          id,
          extension);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean indicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_INDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean speciesIsSet() {
      return (optBits & OPT_BIT_SPECIES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean intendedUseIsSet() {
      return (optBits & OPT_BIT_INTENDED_USE) != 0;
    }

    private boolean indicationReferenceIsSet() {
      return (optBits & OPT_BIT_INDICATION_REFERENCE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProduct_SpecialDesignation is strict, attribute is already set: ".concat(name));
    }
  }
}
