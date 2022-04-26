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
 * Immutable implementation of {@link Encounter_Hospitalization}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEncounter_Hospitalization.builder()}.
 */
@Generated(from = "Encounter_Hospitalization", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEncounter_Hospitalization
    implements Encounter_Hospitalization {
  private final @Nullable List<CodeableConcept> specialArrangement;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept dischargeDisposition;
  private final @Nullable List<CodeableConcept> specialCourtesy;
  private final @Nullable Reference origin;
  private final @Nullable Reference destination;
  private final @Nullable List<Extension> extension;
  private final @Nullable Identifier preAdmissionIdentifier;
  private final @Nullable List<CodeableConcept> dietPreference;
  private final @Nullable String id;
  private final @Nullable CodeableConcept reAdmission;
  private final @Nullable CodeableConcept admitSource;

  private ImmutableEncounter_Hospitalization(
      @Nullable List<CodeableConcept> specialArrangement,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept dischargeDisposition,
      @Nullable List<CodeableConcept> specialCourtesy,
      @Nullable Reference origin,
      @Nullable Reference destination,
      @Nullable List<Extension> extension,
      @Nullable Identifier preAdmissionIdentifier,
      @Nullable List<CodeableConcept> dietPreference,
      @Nullable String id,
      @Nullable CodeableConcept reAdmission,
      @Nullable CodeableConcept admitSource) {
    this.specialArrangement = specialArrangement;
    this.modifierExtension = modifierExtension;
    this.dischargeDisposition = dischargeDisposition;
    this.specialCourtesy = specialCourtesy;
    this.origin = origin;
    this.destination = destination;
    this.extension = extension;
    this.preAdmissionIdentifier = preAdmissionIdentifier;
    this.dietPreference = dietPreference;
    this.id = id;
    this.reAdmission = reAdmission;
    this.admitSource = admitSource;
  }

  /**
   * @return The value of the {@code specialArrangement} attribute
   */
  @JsonProperty("specialArrangement")
  @Override
  public Optional<List<CodeableConcept>> specialArrangement() {
    return Optional.ofNullable(specialArrangement);
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
   * @return The value of the {@code dischargeDisposition} attribute
   */
  @JsonProperty("dischargeDisposition")
  @Override
  public Optional<CodeableConcept> dischargeDisposition() {
    return Optional.ofNullable(dischargeDisposition);
  }

  /**
   * @return The value of the {@code specialCourtesy} attribute
   */
  @JsonProperty("specialCourtesy")
  @Override
  public Optional<List<CodeableConcept>> specialCourtesy() {
    return Optional.ofNullable(specialCourtesy);
  }

  /**
   * @return The value of the {@code origin} attribute
   */
  @JsonProperty("origin")
  @Override
  public Optional<Reference> origin() {
    return Optional.ofNullable(origin);
  }

  /**
   * @return The value of the {@code destination} attribute
   */
  @JsonProperty("destination")
  @Override
  public Optional<Reference> destination() {
    return Optional.ofNullable(destination);
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
   * @return The value of the {@code preAdmissionIdentifier} attribute
   */
  @JsonProperty("preAdmissionIdentifier")
  @Override
  public Optional<Identifier> preAdmissionIdentifier() {
    return Optional.ofNullable(preAdmissionIdentifier);
  }

  /**
   * @return The value of the {@code dietPreference} attribute
   */
  @JsonProperty("dietPreference")
  @Override
  public Optional<List<CodeableConcept>> dietPreference() {
    return Optional.ofNullable(dietPreference);
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
   * @return The value of the {@code reAdmission} attribute
   */
  @JsonProperty("reAdmission")
  @Override
  public Optional<CodeableConcept> reAdmission() {
    return Optional.ofNullable(reAdmission);
  }

  /**
   * @return The value of the {@code admitSource} attribute
   */
  @JsonProperty("admitSource")
  @Override
  public Optional<CodeableConcept> admitSource() {
    return Optional.ofNullable(admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#specialArrangement() specialArrangement} attribute.
   * @param value The value for specialArrangement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withSpecialArrangement(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "specialArrangement");
    if (this.specialArrangement == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        newValue,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#specialArrangement() specialArrangement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialArrangement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withSpecialArrangement(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.specialArrangement == value) return this;
    return new ImmutableEncounter_Hospitalization(
        value,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        newValue,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        value,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#dischargeDisposition() dischargeDisposition} attribute.
   * @param value The value for dischargeDisposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withDischargeDisposition(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "dischargeDisposition");
    if (this.dischargeDisposition == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        newValue,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#dischargeDisposition() dischargeDisposition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dischargeDisposition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withDischargeDisposition(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.dischargeDisposition == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        value,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#specialCourtesy() specialCourtesy} attribute.
   * @param value The value for specialCourtesy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withSpecialCourtesy(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "specialCourtesy");
    if (this.specialCourtesy == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        newValue,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#specialCourtesy() specialCourtesy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialCourtesy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withSpecialCourtesy(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.specialCourtesy == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        value,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#origin() origin} attribute.
   * @param value The value for origin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withOrigin(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "origin");
    if (this.origin == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        newValue,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#origin() origin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for origin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withOrigin(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.origin == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        value,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withDestination(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "destination");
    if (this.destination == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        newValue,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#destination() destination} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withDestination(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.destination == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        value,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        newValue,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        value,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#preAdmissionIdentifier() preAdmissionIdentifier} attribute.
   * @param value The value for preAdmissionIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withPreAdmissionIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "preAdmissionIdentifier");
    if (this.preAdmissionIdentifier == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        newValue,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#preAdmissionIdentifier() preAdmissionIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAdmissionIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withPreAdmissionIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.preAdmissionIdentifier == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        value,
        this.dietPreference,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#dietPreference() dietPreference} attribute.
   * @param value The value for dietPreference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withDietPreference(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "dietPreference");
    if (this.dietPreference == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        newValue,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#dietPreference() dietPreference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dietPreference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withDietPreference(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.dietPreference == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        value,
        this.id,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        newValue,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        value,
        this.reAdmission,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#reAdmission() reAdmission} attribute.
   * @param value The value for reAdmission
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withReAdmission(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "reAdmission");
    if (this.reAdmission == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        newValue,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#reAdmission() reAdmission} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reAdmission
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withReAdmission(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.reAdmission == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        value,
        this.admitSource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Hospitalization#admitSource() admitSource} attribute.
   * @param value The value for admitSource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Hospitalization withAdmitSource(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "admitSource");
    if (this.admitSource == newValue) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Hospitalization#admitSource() admitSource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for admitSource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Hospitalization withAdmitSource(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.admitSource == value) return this;
    return new ImmutableEncounter_Hospitalization(
        this.specialArrangement,
        this.modifierExtension,
        this.dischargeDisposition,
        this.specialCourtesy,
        this.origin,
        this.destination,
        this.extension,
        this.preAdmissionIdentifier,
        this.dietPreference,
        this.id,
        this.reAdmission,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEncounter_Hospitalization} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEncounter_Hospitalization
        && equalTo((ImmutableEncounter_Hospitalization) another);
  }

  private boolean equalTo(ImmutableEncounter_Hospitalization another) {
    return Objects.equals(specialArrangement, another.specialArrangement)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(dischargeDisposition, another.dischargeDisposition)
        && Objects.equals(specialCourtesy, another.specialCourtesy)
        && Objects.equals(origin, another.origin)
        && Objects.equals(destination, another.destination)
        && Objects.equals(extension, another.extension)
        && Objects.equals(preAdmissionIdentifier, another.preAdmissionIdentifier)
        && Objects.equals(dietPreference, another.dietPreference)
        && Objects.equals(id, another.id)
        && Objects.equals(reAdmission, another.reAdmission)
        && Objects.equals(admitSource, another.admitSource);
  }

  /**
   * Computes a hash code from attributes: {@code specialArrangement}, {@code modifierExtension}, {@code dischargeDisposition}, {@code specialCourtesy}, {@code origin}, {@code destination}, {@code extension}, {@code preAdmissionIdentifier}, {@code dietPreference}, {@code id}, {@code reAdmission}, {@code admitSource}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(specialArrangement);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(dischargeDisposition);
    h += (h << 5) + Objects.hashCode(specialCourtesy);
    h += (h << 5) + Objects.hashCode(origin);
    h += (h << 5) + Objects.hashCode(destination);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(preAdmissionIdentifier);
    h += (h << 5) + Objects.hashCode(dietPreference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(reAdmission);
    h += (h << 5) + Objects.hashCode(admitSource);
    return h;
  }

  /**
   * Prints the immutable value {@code Encounter_Hospitalization} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Encounter_Hospitalization{");
    if (specialArrangement != null) {
      builder.append("specialArrangement=").append(specialArrangement);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (dischargeDisposition != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("dischargeDisposition=").append(dischargeDisposition);
    }
    if (specialCourtesy != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("specialCourtesy=").append(specialCourtesy);
    }
    if (origin != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("origin=").append(origin);
    }
    if (destination != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (preAdmissionIdentifier != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("preAdmissionIdentifier=").append(preAdmissionIdentifier);
    }
    if (dietPreference != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("dietPreference=").append(dietPreference);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (reAdmission != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("reAdmission=").append(reAdmission);
    }
    if (admitSource != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("admitSource=").append(admitSource);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Encounter_Hospitalization", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Encounter_Hospitalization {
    @Nullable Optional<List<CodeableConcept>> specialArrangement = Optional.empty();
    boolean specialArrangementIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> dischargeDisposition = Optional.empty();
    boolean dischargeDispositionIsSet;
    @Nullable Optional<List<CodeableConcept>> specialCourtesy = Optional.empty();
    boolean specialCourtesyIsSet;
    @Nullable Optional<Reference> origin = Optional.empty();
    boolean originIsSet;
    @Nullable Optional<Reference> destination = Optional.empty();
    boolean destinationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Identifier> preAdmissionIdentifier = Optional.empty();
    boolean preAdmissionIdentifierIsSet;
    @Nullable Optional<List<CodeableConcept>> dietPreference = Optional.empty();
    boolean dietPreferenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> reAdmission = Optional.empty();
    boolean reAdmissionIsSet;
    @Nullable Optional<CodeableConcept> admitSource = Optional.empty();
    boolean admitSourceIsSet;
    @JsonProperty("specialArrangement")
    public void setSpecialArrangement(Optional<List<CodeableConcept>> specialArrangement) {
      this.specialArrangement = specialArrangement;
      this.specialArrangementIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("dischargeDisposition")
    public void setDischargeDisposition(Optional<CodeableConcept> dischargeDisposition) {
      this.dischargeDisposition = dischargeDisposition;
      this.dischargeDispositionIsSet = true;
    }
    @JsonProperty("specialCourtesy")
    public void setSpecialCourtesy(Optional<List<CodeableConcept>> specialCourtesy) {
      this.specialCourtesy = specialCourtesy;
      this.specialCourtesyIsSet = true;
    }
    @JsonProperty("origin")
    public void setOrigin(Optional<Reference> origin) {
      this.origin = origin;
      this.originIsSet = true;
    }
    @JsonProperty("destination")
    public void setDestination(Optional<Reference> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("preAdmissionIdentifier")
    public void setPreAdmissionIdentifier(Optional<Identifier> preAdmissionIdentifier) {
      this.preAdmissionIdentifier = preAdmissionIdentifier;
      this.preAdmissionIdentifierIsSet = true;
    }
    @JsonProperty("dietPreference")
    public void setDietPreference(Optional<List<CodeableConcept>> dietPreference) {
      this.dietPreference = dietPreference;
      this.dietPreferenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("reAdmission")
    public void setReAdmission(Optional<CodeableConcept> reAdmission) {
      this.reAdmission = reAdmission;
      this.reAdmissionIsSet = true;
    }
    @JsonProperty("admitSource")
    public void setAdmitSource(Optional<CodeableConcept> admitSource) {
      this.admitSource = admitSource;
      this.admitSourceIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> specialArrangement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> dischargeDisposition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> specialCourtesy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> origin() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> destination() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> preAdmissionIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> dietPreference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> reAdmission() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> admitSource() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEncounter_Hospitalization fromJson(Json json) {
    ImmutableEncounter_Hospitalization.Builder builder = ImmutableEncounter_Hospitalization.builder();
    if (json.specialArrangementIsSet) {
      builder.specialArrangement(json.specialArrangement);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.dischargeDispositionIsSet) {
      builder.dischargeDisposition(json.dischargeDisposition);
    }
    if (json.specialCourtesyIsSet) {
      builder.specialCourtesy(json.specialCourtesy);
    }
    if (json.originIsSet) {
      builder.origin(json.origin);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.preAdmissionIdentifierIsSet) {
      builder.preAdmissionIdentifier(json.preAdmissionIdentifier);
    }
    if (json.dietPreferenceIsSet) {
      builder.dietPreference(json.dietPreference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.reAdmissionIsSet) {
      builder.reAdmission(json.reAdmission);
    }
    if (json.admitSourceIsSet) {
      builder.admitSource(json.admitSource);
    }
    return (ImmutableEncounter_Hospitalization) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Encounter_Hospitalization} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Encounter_Hospitalization instance
   */
  public static Encounter_Hospitalization copyOf(Encounter_Hospitalization instance) {
    if (instance instanceof ImmutableEncounter_Hospitalization) {
      return (ImmutableEncounter_Hospitalization) instance;
    }
    return ImmutableEncounter_Hospitalization.builder()
        .specialArrangement(instance.specialArrangement())
        .modifierExtension(instance.modifierExtension())
        .dischargeDisposition(instance.dischargeDisposition())
        .specialCourtesy(instance.specialCourtesy())
        .origin(instance.origin())
        .destination(instance.destination())
        .extension(instance.extension())
        .preAdmissionIdentifier(instance.preAdmissionIdentifier())
        .dietPreference(instance.dietPreference())
        .id(instance.id())
        .reAdmission(instance.reAdmission())
        .admitSource(instance.admitSource())
        .build();
  }

  /**
   * Creates a builder for {@link Encounter_Hospitalization Encounter_Hospitalization}.
   * <pre>
   * ImmutableEncounter_Hospitalization.builder()
   *    .specialArrangement(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Encounter_Hospitalization#specialArrangement() specialArrangement}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Encounter_Hospitalization#modifierExtension() modifierExtension}
   *    .dischargeDisposition(com.medplum.types.fhir.CodeableConcept) // optional {@link Encounter_Hospitalization#dischargeDisposition() dischargeDisposition}
   *    .specialCourtesy(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Encounter_Hospitalization#specialCourtesy() specialCourtesy}
   *    .origin(com.medplum.types.fhir.Reference) // optional {@link Encounter_Hospitalization#origin() origin}
   *    .destination(com.medplum.types.fhir.Reference) // optional {@link Encounter_Hospitalization#destination() destination}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Encounter_Hospitalization#extension() extension}
   *    .preAdmissionIdentifier(com.medplum.types.fhir.Identifier) // optional {@link Encounter_Hospitalization#preAdmissionIdentifier() preAdmissionIdentifier}
   *    .dietPreference(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Encounter_Hospitalization#dietPreference() dietPreference}
   *    .id(String) // optional {@link Encounter_Hospitalization#id() id}
   *    .reAdmission(com.medplum.types.fhir.CodeableConcept) // optional {@link Encounter_Hospitalization#reAdmission() reAdmission}
   *    .admitSource(com.medplum.types.fhir.CodeableConcept) // optional {@link Encounter_Hospitalization#admitSource() admitSource}
   *    .build();
   * </pre>
   * @return A new Encounter_Hospitalization builder
   */
  public static ImmutableEncounter_Hospitalization.Builder builder() {
    return new ImmutableEncounter_Hospitalization.Builder();
  }

  /**
   * Builds instances of type {@link Encounter_Hospitalization Encounter_Hospitalization}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Encounter_Hospitalization", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SPECIAL_ARRANGEMENT = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_DISCHARGE_DISPOSITION = 0x4L;
    private static final long OPT_BIT_SPECIAL_COURTESY = 0x8L;
    private static final long OPT_BIT_ORIGIN = 0x10L;
    private static final long OPT_BIT_DESTINATION = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_PRE_ADMISSION_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_DIET_PREFERENCE = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_RE_ADMISSION = 0x400L;
    private static final long OPT_BIT_ADMIT_SOURCE = 0x800L;
    private long optBits;

    private @Nullable List<CodeableConcept> specialArrangement;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept dischargeDisposition;
    private @Nullable List<CodeableConcept> specialCourtesy;
    private @Nullable Reference origin;
    private @Nullable Reference destination;
    private @Nullable List<Extension> extension;
    private @Nullable Identifier preAdmissionIdentifier;
    private @Nullable List<CodeableConcept> dietPreference;
    private @Nullable String id;
    private @Nullable CodeableConcept reAdmission;
    private @Nullable CodeableConcept admitSource;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#specialArrangement() specialArrangement} to specialArrangement.
     * @param specialArrangement The value for specialArrangement
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialArrangement(List<CodeableConcept> specialArrangement) {
      checkNotIsSet(specialArrangementIsSet(), "specialArrangement");
      this.specialArrangement = Objects.requireNonNull(specialArrangement, "specialArrangement");
      optBits |= OPT_BIT_SPECIAL_ARRANGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#specialArrangement() specialArrangement} to specialArrangement.
     * @param specialArrangement The value for specialArrangement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialArrangement")
    public final Builder specialArrangement(Optional<? extends List<CodeableConcept>> specialArrangement) {
      checkNotIsSet(specialArrangementIsSet(), "specialArrangement");
      this.specialArrangement = specialArrangement.orElse(null);
      optBits |= OPT_BIT_SPECIAL_ARRANGEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_Hospitalization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_Hospitalization#dischargeDisposition() dischargeDisposition} to dischargeDisposition.
     * @param dischargeDisposition The value for dischargeDisposition
     * @return {@code this} builder for chained invocation
     */
    public final Builder dischargeDisposition(CodeableConcept dischargeDisposition) {
      checkNotIsSet(dischargeDispositionIsSet(), "dischargeDisposition");
      this.dischargeDisposition = Objects.requireNonNull(dischargeDisposition, "dischargeDisposition");
      optBits |= OPT_BIT_DISCHARGE_DISPOSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#dischargeDisposition() dischargeDisposition} to dischargeDisposition.
     * @param dischargeDisposition The value for dischargeDisposition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dischargeDisposition")
    public final Builder dischargeDisposition(Optional<? extends CodeableConcept> dischargeDisposition) {
      checkNotIsSet(dischargeDispositionIsSet(), "dischargeDisposition");
      this.dischargeDisposition = dischargeDisposition.orElse(null);
      optBits |= OPT_BIT_DISCHARGE_DISPOSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#specialCourtesy() specialCourtesy} to specialCourtesy.
     * @param specialCourtesy The value for specialCourtesy
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialCourtesy(List<CodeableConcept> specialCourtesy) {
      checkNotIsSet(specialCourtesyIsSet(), "specialCourtesy");
      this.specialCourtesy = Objects.requireNonNull(specialCourtesy, "specialCourtesy");
      optBits |= OPT_BIT_SPECIAL_COURTESY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#specialCourtesy() specialCourtesy} to specialCourtesy.
     * @param specialCourtesy The value for specialCourtesy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialCourtesy")
    public final Builder specialCourtesy(Optional<? extends List<CodeableConcept>> specialCourtesy) {
      checkNotIsSet(specialCourtesyIsSet(), "specialCourtesy");
      this.specialCourtesy = specialCourtesy.orElse(null);
      optBits |= OPT_BIT_SPECIAL_COURTESY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    public final Builder origin(Reference origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = Objects.requireNonNull(origin, "origin");
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("origin")
    public final Builder origin(Optional<? extends Reference> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = origin.orElse(null);
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(Reference destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = Objects.requireNonNull(destination, "destination");
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("destination")
    public final Builder destination(Optional<? extends Reference> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter_Hospitalization#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter_Hospitalization#preAdmissionIdentifier() preAdmissionIdentifier} to preAdmissionIdentifier.
     * @param preAdmissionIdentifier The value for preAdmissionIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAdmissionIdentifier(Identifier preAdmissionIdentifier) {
      checkNotIsSet(preAdmissionIdentifierIsSet(), "preAdmissionIdentifier");
      this.preAdmissionIdentifier = Objects.requireNonNull(preAdmissionIdentifier, "preAdmissionIdentifier");
      optBits |= OPT_BIT_PRE_ADMISSION_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#preAdmissionIdentifier() preAdmissionIdentifier} to preAdmissionIdentifier.
     * @param preAdmissionIdentifier The value for preAdmissionIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preAdmissionIdentifier")
    public final Builder preAdmissionIdentifier(Optional<? extends Identifier> preAdmissionIdentifier) {
      checkNotIsSet(preAdmissionIdentifierIsSet(), "preAdmissionIdentifier");
      this.preAdmissionIdentifier = preAdmissionIdentifier.orElse(null);
      optBits |= OPT_BIT_PRE_ADMISSION_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#dietPreference() dietPreference} to dietPreference.
     * @param dietPreference The value for dietPreference
     * @return {@code this} builder for chained invocation
     */
    public final Builder dietPreference(List<CodeableConcept> dietPreference) {
      checkNotIsSet(dietPreferenceIsSet(), "dietPreference");
      this.dietPreference = Objects.requireNonNull(dietPreference, "dietPreference");
      optBits |= OPT_BIT_DIET_PREFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#dietPreference() dietPreference} to dietPreference.
     * @param dietPreference The value for dietPreference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dietPreference")
    public final Builder dietPreference(Optional<? extends List<CodeableConcept>> dietPreference) {
      checkNotIsSet(dietPreferenceIsSet(), "dietPreference");
      this.dietPreference = dietPreference.orElse(null);
      optBits |= OPT_BIT_DIET_PREFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#id() id} to id.
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
     * Initializes the optional value {@link Encounter_Hospitalization#id() id} to id.
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
     * Initializes the optional value {@link Encounter_Hospitalization#reAdmission() reAdmission} to reAdmission.
     * @param reAdmission The value for reAdmission
     * @return {@code this} builder for chained invocation
     */
    public final Builder reAdmission(CodeableConcept reAdmission) {
      checkNotIsSet(reAdmissionIsSet(), "reAdmission");
      this.reAdmission = Objects.requireNonNull(reAdmission, "reAdmission");
      optBits |= OPT_BIT_RE_ADMISSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#reAdmission() reAdmission} to reAdmission.
     * @param reAdmission The value for reAdmission
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reAdmission")
    public final Builder reAdmission(Optional<? extends CodeableConcept> reAdmission) {
      checkNotIsSet(reAdmissionIsSet(), "reAdmission");
      this.reAdmission = reAdmission.orElse(null);
      optBits |= OPT_BIT_RE_ADMISSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#admitSource() admitSource} to admitSource.
     * @param admitSource The value for admitSource
     * @return {@code this} builder for chained invocation
     */
    public final Builder admitSource(CodeableConcept admitSource) {
      checkNotIsSet(admitSourceIsSet(), "admitSource");
      this.admitSource = Objects.requireNonNull(admitSource, "admitSource");
      optBits |= OPT_BIT_ADMIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Hospitalization#admitSource() admitSource} to admitSource.
     * @param admitSource The value for admitSource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("admitSource")
    public final Builder admitSource(Optional<? extends CodeableConcept> admitSource) {
      checkNotIsSet(admitSourceIsSet(), "admitSource");
      this.admitSource = admitSource.orElse(null);
      optBits |= OPT_BIT_ADMIT_SOURCE;
      return this;
    }

    /**
     * Builds a new {@link Encounter_Hospitalization Encounter_Hospitalization}.
     * @return An immutable instance of Encounter_Hospitalization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Encounter_Hospitalization build() {
      return new ImmutableEncounter_Hospitalization(
          specialArrangement,
          modifierExtension,
          dischargeDisposition,
          specialCourtesy,
          origin,
          destination,
          extension,
          preAdmissionIdentifier,
          dietPreference,
          id,
          reAdmission,
          admitSource);
    }

    private boolean specialArrangementIsSet() {
      return (optBits & OPT_BIT_SPECIAL_ARRANGEMENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean dischargeDispositionIsSet() {
      return (optBits & OPT_BIT_DISCHARGE_DISPOSITION) != 0;
    }

    private boolean specialCourtesyIsSet() {
      return (optBits & OPT_BIT_SPECIAL_COURTESY) != 0;
    }

    private boolean originIsSet() {
      return (optBits & OPT_BIT_ORIGIN) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean preAdmissionIdentifierIsSet() {
      return (optBits & OPT_BIT_PRE_ADMISSION_IDENTIFIER) != 0;
    }

    private boolean dietPreferenceIsSet() {
      return (optBits & OPT_BIT_DIET_PREFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean reAdmissionIsSet() {
      return (optBits & OPT_BIT_RE_ADMISSION) != 0;
    }

    private boolean admitSourceIsSet() {
      return (optBits & OPT_BIT_ADMIT_SOURCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Encounter_Hospitalization is strict, attribute is already set: ".concat(name));
    }
  }
}
