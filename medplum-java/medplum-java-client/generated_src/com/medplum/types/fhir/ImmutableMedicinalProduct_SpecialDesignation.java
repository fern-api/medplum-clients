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
 * Immutable implementation of {@link MedicinalProduct_SpecialDesignation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProduct_SpecialDesignation.builder()}.
 */
@Generated(from = "MedicinalProduct_SpecialDesignation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProduct_SpecialDesignation
    implements MedicinalProduct_SpecialDesignation {
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference indicationReference;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable CodeableConcept indicationCodeableConcept;
  private final @Nullable CodeableConcept intendedUse;
  private final @Nullable CodeableConcept status;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable DateTime date;
  private final @Nullable CodeableConcept species;

  private ImmutableMedicinalProduct_SpecialDesignation(
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable Reference indicationReference,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable CodeableConcept indicationCodeableConcept,
      @Nullable CodeableConcept intendedUse,
      @Nullable CodeableConcept status,
      @Nullable List<Identifier> identifier,
      @Nullable DateTime date,
      @Nullable CodeableConcept species) {
    this.type = type;
    this.extension = extension;
    this.indicationReference = indicationReference;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.indicationCodeableConcept = indicationCodeableConcept;
    this.intendedUse = intendedUse;
    this.status = status;
    this.identifier = identifier;
    this.date = date;
    this.species = species;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code indicationReference} attribute
   */
  @JsonProperty("indicationReference")
  @Override
  public Optional<Reference> indicationReference() {
    return Optional.ofNullable(indicationReference);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code indicationCodeableConcept} attribute
   */
  @JsonProperty("indicationCodeableConcept")
  @Override
  public Optional<CodeableConcept> indicationCodeableConcept() {
    return Optional.ofNullable(indicationCodeableConcept);
  }

  /**
   * @return The value of the {@code intendedUse} attribute
   */
  @JsonProperty("intendedUse")
  @Override
  public Optional<CodeableConcept> intendedUse() {
    return Optional.ofNullable(intendedUse);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CodeableConcept> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code species} attribute
   */
  @JsonProperty("species")
  @Override
  public Optional<CodeableConcept> species() {
    return Optional.ofNullable(species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        newValue,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        value,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        newValue,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        value,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference} attribute.
   * @param value The value for indicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withIndicationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "indicationReference");
    if (this.indicationReference == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        newValue,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for indicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withIndicationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.indicationReference == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        value,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        newValue,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        value,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        newValue,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        value,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept} attribute.
   * @param value The value for indicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withIndicationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "indicationCodeableConcept");
    if (this.indicationCodeableConcept == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        newValue,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for indicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withIndicationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.indicationCodeableConcept == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        value,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse} attribute.
   * @param value The value for intendedUse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withIntendedUse(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "intendedUse");
    if (this.intendedUse == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        newValue,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intendedUse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withIntendedUse(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.intendedUse == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        value,
        this.status,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        newValue,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        value,
        this.identifier,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        newValue,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        value,
        this.date,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        newValue,
        this.species);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        value,
        this.species);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_SpecialDesignation#species() species} attribute.
   * @param value The value for species
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_SpecialDesignation withSpecies(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "species");
    if (this.species == newValue) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_SpecialDesignation#species() species} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for species
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_SpecialDesignation withSpecies(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.species == value) return this;
    return new ImmutableMedicinalProduct_SpecialDesignation(
        this.type,
        this.extension,
        this.indicationReference,
        this.modifierExtension,
        this.id,
        this.indicationCodeableConcept,
        this.intendedUse,
        this.status,
        this.identifier,
        this.date,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProduct_SpecialDesignation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProduct_SpecialDesignation
        && equalTo((ImmutableMedicinalProduct_SpecialDesignation) another);
  }

  private boolean equalTo(ImmutableMedicinalProduct_SpecialDesignation another) {
    return Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(indicationReference, another.indicationReference)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(indicationCodeableConcept, another.indicationCodeableConcept)
        && Objects.equals(intendedUse, another.intendedUse)
        && Objects.equals(status, another.status)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(date, another.date)
        && Objects.equals(species, another.species);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code extension}, {@code indicationReference}, {@code modifierExtension}, {@code id}, {@code indicationCodeableConcept}, {@code intendedUse}, {@code status}, {@code identifier}, {@code date}, {@code species}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(indicationReference);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(indicationCodeableConcept);
    h += (h << 5) + Objects.hashCode(intendedUse);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(species);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProduct_SpecialDesignation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProduct_SpecialDesignation{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (indicationReference != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("indicationReference=").append(indicationReference);
    }
    if (modifierExtension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (indicationCodeableConcept != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("indicationCodeableConcept=").append(indicationCodeableConcept);
    }
    if (intendedUse != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("intendedUse=").append(intendedUse);
    }
    if (status != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (identifier != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (date != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (species != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("species=").append(species);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProduct_SpecialDesignation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProduct_SpecialDesignation {
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> indicationReference = Optional.empty();
    boolean indicationReferenceIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> indicationCodeableConcept = Optional.empty();
    boolean indicationCodeableConceptIsSet;
    @Nullable Optional<CodeableConcept> intendedUse = Optional.empty();
    boolean intendedUseIsSet;
    @Nullable Optional<CodeableConcept> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<CodeableConcept> species = Optional.empty();
    boolean speciesIsSet;
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("indicationReference")
    public void setIndicationReference(Optional<Reference> indicationReference) {
      this.indicationReference = indicationReference;
      this.indicationReferenceIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("indicationCodeableConcept")
    public void setIndicationCodeableConcept(Optional<CodeableConcept> indicationCodeableConcept) {
      this.indicationCodeableConcept = indicationCodeableConcept;
      this.indicationCodeableConceptIsSet = true;
    }
    @JsonProperty("intendedUse")
    public void setIntendedUse(Optional<CodeableConcept> intendedUse) {
      this.intendedUse = intendedUse;
      this.intendedUseIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("species")
    public void setSpecies(Optional<CodeableConcept> species) {
      this.species = species;
      this.speciesIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> indicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> indicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> intendedUse() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> species() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProduct_SpecialDesignation fromJson(Json json) {
    ImmutableMedicinalProduct_SpecialDesignation.Builder builder = ImmutableMedicinalProduct_SpecialDesignation.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.indicationReferenceIsSet) {
      builder.indicationReference(json.indicationReference);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.indicationCodeableConceptIsSet) {
      builder.indicationCodeableConcept(json.indicationCodeableConcept);
    }
    if (json.intendedUseIsSet) {
      builder.intendedUse(json.intendedUse);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.speciesIsSet) {
      builder.species(json.species);
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
        .extension(instance.extension())
        .indicationReference(instance.indicationReference())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .indicationCodeableConcept(instance.indicationCodeableConcept())
        .intendedUse(instance.intendedUse())
        .status(instance.status())
        .identifier(instance.identifier())
        .date(instance.date())
        .species(instance.species())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProduct_SpecialDesignation MedicinalProduct_SpecialDesignation}.
   * <pre>
   * ImmutableMedicinalProduct_SpecialDesignation.builder()
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#type() type}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_SpecialDesignation#extension() extension}
   *    .indicationReference(com.medplum.types.fhir.Reference) // optional {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link MedicinalProduct_SpecialDesignation#id() id}
   *    .indicationCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept}
   *    .intendedUse(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse}
   *    .status(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#status() status}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link MedicinalProduct_SpecialDesignation#identifier() identifier}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link MedicinalProduct_SpecialDesignation#date() date}
   *    .species(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProduct_SpecialDesignation#species() species}
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
  @Generated(from = "MedicinalProduct_SpecialDesignation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_INDICATION_REFERENCE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_INDICATION_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_INTENDED_USE = 0x40L;
    private static final long OPT_BIT_STATUS = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_DATE = 0x200L;
    private static final long OPT_BIT_SPECIES = 0x400L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable Reference indicationReference;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable CodeableConcept indicationCodeableConcept;
    private @Nullable CodeableConcept intendedUse;
    private @Nullable CodeableConcept status;
    private @Nullable List<Identifier> identifier;
    private @Nullable DateTime date;
    private @Nullable CodeableConcept species;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference} to indicationReference.
     * @param indicationReference The value for indicationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder indicationReference(Reference indicationReference) {
      checkNotIsSet(indicationReferenceIsSet(), "indicationReference");
      this.indicationReference = Objects.requireNonNull(indicationReference, "indicationReference");
      optBits |= OPT_BIT_INDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#indicationReference() indicationReference} to indicationReference.
     * @param indicationReference The value for indicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("indicationReference")
    public final Builder indicationReference(Optional<? extends Reference> indicationReference) {
      checkNotIsSet(indicationReferenceIsSet(), "indicationReference");
      this.indicationReference = indicationReference.orElse(null);
      optBits |= OPT_BIT_INDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept} to indicationCodeableConcept.
     * @param indicationCodeableConcept The value for indicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder indicationCodeableConcept(CodeableConcept indicationCodeableConcept) {
      checkNotIsSet(indicationCodeableConceptIsSet(), "indicationCodeableConcept");
      this.indicationCodeableConcept = Objects.requireNonNull(indicationCodeableConcept, "indicationCodeableConcept");
      optBits |= OPT_BIT_INDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#indicationCodeableConcept() indicationCodeableConcept} to indicationCodeableConcept.
     * @param indicationCodeableConcept The value for indicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("indicationCodeableConcept")
    public final Builder indicationCodeableConcept(Optional<? extends CodeableConcept> indicationCodeableConcept) {
      checkNotIsSet(indicationCodeableConceptIsSet(), "indicationCodeableConcept");
      this.indicationCodeableConcept = indicationCodeableConcept.orElse(null);
      optBits |= OPT_BIT_INDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse} to intendedUse.
     * @param intendedUse The value for intendedUse
     * @return {@code this} builder for chained invocation
     */
    public final Builder intendedUse(CodeableConcept intendedUse) {
      checkNotIsSet(intendedUseIsSet(), "intendedUse");
      this.intendedUse = Objects.requireNonNull(intendedUse, "intendedUse");
      optBits |= OPT_BIT_INTENDED_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#intendedUse() intendedUse} to intendedUse.
     * @param intendedUse The value for intendedUse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intendedUse")
    public final Builder intendedUse(Optional<? extends CodeableConcept> intendedUse) {
      checkNotIsSet(intendedUseIsSet(), "intendedUse");
      this.intendedUse = intendedUse.orElse(null);
      optBits |= OPT_BIT_INTENDED_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CodeableConcept> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#species() species} to species.
     * @param species The value for species
     * @return {@code this} builder for chained invocation
     */
    public final Builder species(CodeableConcept species) {
      checkNotIsSet(speciesIsSet(), "species");
      this.species = Objects.requireNonNull(species, "species");
      optBits |= OPT_BIT_SPECIES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_SpecialDesignation#species() species} to species.
     * @param species The value for species
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("species")
    public final Builder species(Optional<? extends CodeableConcept> species) {
      checkNotIsSet(speciesIsSet(), "species");
      this.species = species.orElse(null);
      optBits |= OPT_BIT_SPECIES;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProduct_SpecialDesignation MedicinalProduct_SpecialDesignation}.
     * @return An immutable instance of MedicinalProduct_SpecialDesignation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProduct_SpecialDesignation build() {
      return new ImmutableMedicinalProduct_SpecialDesignation(
          type,
          extension,
          indicationReference,
          modifierExtension,
          id,
          indicationCodeableConcept,
          intendedUse,
          status,
          identifier,
          date,
          species);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean indicationReferenceIsSet() {
      return (optBits & OPT_BIT_INDICATION_REFERENCE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean indicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_INDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean intendedUseIsSet() {
      return (optBits & OPT_BIT_INTENDED_USE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean speciesIsSet() {
      return (optBits & OPT_BIT_SPECIES) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProduct_SpecialDesignation is strict, attribute is already set: ".concat(name));
    }
  }
}