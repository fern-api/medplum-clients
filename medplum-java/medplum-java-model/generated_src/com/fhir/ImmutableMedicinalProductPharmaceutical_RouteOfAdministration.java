package com.fhir;

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
 * Immutable implementation of {@link MedicinalProductPharmaceutical_RouteOfAdministration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.builder()}.
 */
@Generated(from = "MedicinalProductPharmaceutical_RouteOfAdministration", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductPharmaceutical_RouteOfAdministration
    implements MedicinalProductPharmaceutical_RouteOfAdministration {
  private final @Nullable Quantity maxSingleDose;
  private final CodeableConcept code;
  private final @Nullable Quantity maxDosePerDay;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Duration maxTreatmentPeriod;
  private final @Nullable Quantity firstDose;
  private final @Nullable Ratio maxDosePerTreatmentPeriod;
  private final @Nullable String id;
  private final @Nullable List<MedicinalProductPharmaceutical_TargetSpecies> targetSpecies;
  private final @Nullable List<Extension> extension;

  private ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
      @Nullable Quantity maxSingleDose,
      CodeableConcept code,
      @Nullable Quantity maxDosePerDay,
      @Nullable List<Extension> modifierExtension,
      @Nullable Duration maxTreatmentPeriod,
      @Nullable Quantity firstDose,
      @Nullable Ratio maxDosePerTreatmentPeriod,
      @Nullable String id,
      @Nullable List<MedicinalProductPharmaceutical_TargetSpecies> targetSpecies,
      @Nullable List<Extension> extension) {
    this.maxSingleDose = maxSingleDose;
    this.code = code;
    this.maxDosePerDay = maxDosePerDay;
    this.modifierExtension = modifierExtension;
    this.maxTreatmentPeriod = maxTreatmentPeriod;
    this.firstDose = firstDose;
    this.maxDosePerTreatmentPeriod = maxDosePerTreatmentPeriod;
    this.id = id;
    this.targetSpecies = targetSpecies;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code maxSingleDose} attribute
   */
  @JsonProperty("maxSingleDose")
  @Override
  public Optional<Quantity> maxSingleDose() {
    return Optional.ofNullable(maxSingleDose);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code maxDosePerDay} attribute
   */
  @JsonProperty("maxDosePerDay")
  @Override
  public Optional<Quantity> maxDosePerDay() {
    return Optional.ofNullable(maxDosePerDay);
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
   * @return The value of the {@code maxTreatmentPeriod} attribute
   */
  @JsonProperty("maxTreatmentPeriod")
  @Override
  public Optional<Duration> maxTreatmentPeriod() {
    return Optional.ofNullable(maxTreatmentPeriod);
  }

  /**
   * @return The value of the {@code firstDose} attribute
   */
  @JsonProperty("firstDose")
  @Override
  public Optional<Quantity> firstDose() {
    return Optional.ofNullable(firstDose);
  }

  /**
   * @return The value of the {@code maxDosePerTreatmentPeriod} attribute
   */
  @JsonProperty("maxDosePerTreatmentPeriod")
  @Override
  public Optional<Ratio> maxDosePerTreatmentPeriod() {
    return Optional.ofNullable(maxDosePerTreatmentPeriod);
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
   * @return The value of the {@code targetSpecies} attribute
   */
  @JsonProperty("targetSpecies")
  @Override
  public Optional<List<MedicinalProductPharmaceutical_TargetSpecies>> targetSpecies() {
    return Optional.ofNullable(targetSpecies);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxSingleDose() maxSingleDose} attribute.
   * @param value The value for maxSingleDose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withMaxSingleDose(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "maxSingleDose");
    if (this.maxSingleDose == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        newValue,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxSingleDose() maxSingleDose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxSingleDose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withMaxSingleDose(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.maxSingleDose == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        value,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        newValue,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerDay() maxDosePerDay} attribute.
   * @param value The value for maxDosePerDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withMaxDosePerDay(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "maxDosePerDay");
    if (this.maxDosePerDay == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        newValue,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerDay() maxDosePerDay} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxDosePerDay
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withMaxDosePerDay(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.maxDosePerDay == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        value,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        newValue,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        value,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxTreatmentPeriod() maxTreatmentPeriod} attribute.
   * @param value The value for maxTreatmentPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withMaxTreatmentPeriod(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "maxTreatmentPeriod");
    if (this.maxTreatmentPeriod == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        newValue,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxTreatmentPeriod() maxTreatmentPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxTreatmentPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withMaxTreatmentPeriod(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.maxTreatmentPeriod == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        value,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#firstDose() firstDose} attribute.
   * @param value The value for firstDose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withFirstDose(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "firstDose");
    if (this.firstDose == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        newValue,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#firstDose() firstDose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for firstDose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withFirstDose(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.firstDose == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        value,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerTreatmentPeriod() maxDosePerTreatmentPeriod} attribute.
   * @param value The value for maxDosePerTreatmentPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withMaxDosePerTreatmentPeriod(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "maxDosePerTreatmentPeriod");
    if (this.maxDosePerTreatmentPeriod == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        newValue,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerTreatmentPeriod() maxDosePerTreatmentPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxDosePerTreatmentPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withMaxDosePerTreatmentPeriod(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.maxDosePerTreatmentPeriod == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        value,
        this.id,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        newValue,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        value,
        this.targetSpecies,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#targetSpecies() targetSpecies} attribute.
   * @param value The value for targetSpecies
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withTargetSpecies(List<MedicinalProductPharmaceutical_TargetSpecies> value) {
    @Nullable List<MedicinalProductPharmaceutical_TargetSpecies> newValue = Objects.requireNonNull(value, "targetSpecies");
    if (this.targetSpecies == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#targetSpecies() targetSpecies} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetSpecies
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withTargetSpecies(Optional<? extends List<MedicinalProductPharmaceutical_TargetSpecies>> optional) {
    @Nullable List<MedicinalProductPharmaceutical_TargetSpecies> value = optional.orElse(null);
    if (this.targetSpecies == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductPharmaceutical_RouteOfAdministration withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
        this.maxSingleDose,
        this.code,
        this.maxDosePerDay,
        this.modifierExtension,
        this.maxTreatmentPeriod,
        this.firstDose,
        this.maxDosePerTreatmentPeriod,
        this.id,
        this.targetSpecies,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductPharmaceutical_RouteOfAdministration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductPharmaceutical_RouteOfAdministration
        && equalTo((ImmutableMedicinalProductPharmaceutical_RouteOfAdministration) another);
  }

  private boolean equalTo(ImmutableMedicinalProductPharmaceutical_RouteOfAdministration another) {
    return Objects.equals(maxSingleDose, another.maxSingleDose)
        && code.equals(another.code)
        && Objects.equals(maxDosePerDay, another.maxDosePerDay)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(maxTreatmentPeriod, another.maxTreatmentPeriod)
        && Objects.equals(firstDose, another.firstDose)
        && Objects.equals(maxDosePerTreatmentPeriod, another.maxDosePerTreatmentPeriod)
        && Objects.equals(id, another.id)
        && Objects.equals(targetSpecies, another.targetSpecies)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code maxSingleDose}, {@code code}, {@code maxDosePerDay}, {@code modifierExtension}, {@code maxTreatmentPeriod}, {@code firstDose}, {@code maxDosePerTreatmentPeriod}, {@code id}, {@code targetSpecies}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(maxSingleDose);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(maxDosePerDay);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(maxTreatmentPeriod);
    h += (h << 5) + Objects.hashCode(firstDose);
    h += (h << 5) + Objects.hashCode(maxDosePerTreatmentPeriod);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(targetSpecies);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductPharmaceutical_RouteOfAdministration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductPharmaceutical_RouteOfAdministration{");
    if (maxSingleDose != null) {
      builder.append("maxSingleDose=").append(maxSingleDose);
    }
    if (builder.length() > 53) builder.append(", ");
    builder.append("code=").append(code);
    if (maxDosePerDay != null) {
      builder.append(", ");
      builder.append("maxDosePerDay=").append(maxDosePerDay);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (maxTreatmentPeriod != null) {
      builder.append(", ");
      builder.append("maxTreatmentPeriod=").append(maxTreatmentPeriod);
    }
    if (firstDose != null) {
      builder.append(", ");
      builder.append("firstDose=").append(firstDose);
    }
    if (maxDosePerTreatmentPeriod != null) {
      builder.append(", ");
      builder.append("maxDosePerTreatmentPeriod=").append(maxDosePerTreatmentPeriod);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (targetSpecies != null) {
      builder.append(", ");
      builder.append("targetSpecies=").append(targetSpecies);
    }
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
  @Generated(from = "MedicinalProductPharmaceutical_RouteOfAdministration", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductPharmaceutical_RouteOfAdministration {
    @Nullable Optional<Quantity> maxSingleDose = Optional.empty();
    boolean maxSingleDoseIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<Quantity> maxDosePerDay = Optional.empty();
    boolean maxDosePerDayIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Duration> maxTreatmentPeriod = Optional.empty();
    boolean maxTreatmentPeriodIsSet;
    @Nullable Optional<Quantity> firstDose = Optional.empty();
    boolean firstDoseIsSet;
    @Nullable Optional<Ratio> maxDosePerTreatmentPeriod = Optional.empty();
    boolean maxDosePerTreatmentPeriodIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<MedicinalProductPharmaceutical_TargetSpecies>> targetSpecies = Optional.empty();
    boolean targetSpeciesIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("maxSingleDose")
    public void setMaxSingleDose(Optional<Quantity> maxSingleDose) {
      this.maxSingleDose = maxSingleDose;
      this.maxSingleDoseIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("maxDosePerDay")
    public void setMaxDosePerDay(Optional<Quantity> maxDosePerDay) {
      this.maxDosePerDay = maxDosePerDay;
      this.maxDosePerDayIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("maxTreatmentPeriod")
    public void setMaxTreatmentPeriod(Optional<Duration> maxTreatmentPeriod) {
      this.maxTreatmentPeriod = maxTreatmentPeriod;
      this.maxTreatmentPeriodIsSet = true;
    }
    @JsonProperty("firstDose")
    public void setFirstDose(Optional<Quantity> firstDose) {
      this.firstDose = firstDose;
      this.firstDoseIsSet = true;
    }
    @JsonProperty("maxDosePerTreatmentPeriod")
    public void setMaxDosePerTreatmentPeriod(Optional<Ratio> maxDosePerTreatmentPeriod) {
      this.maxDosePerTreatmentPeriod = maxDosePerTreatmentPeriod;
      this.maxDosePerTreatmentPeriodIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("targetSpecies")
    public void setTargetSpecies(Optional<List<MedicinalProductPharmaceutical_TargetSpecies>> targetSpecies) {
      this.targetSpecies = targetSpecies;
      this.targetSpeciesIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Quantity> maxSingleDose() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> maxDosePerDay() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> maxTreatmentPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> firstDose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> maxDosePerTreatmentPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductPharmaceutical_TargetSpecies>> targetSpecies() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductPharmaceutical_RouteOfAdministration fromJson(Json json) {
    ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.Builder builder = ((ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.Builder) ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.builder());
    if (json.maxSingleDoseIsSet) {
      builder.maxSingleDose(json.maxSingleDose);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.maxDosePerDayIsSet) {
      builder.maxDosePerDay(json.maxDosePerDay);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.maxTreatmentPeriodIsSet) {
      builder.maxTreatmentPeriod(json.maxTreatmentPeriod);
    }
    if (json.firstDoseIsSet) {
      builder.firstDose(json.firstDose);
    }
    if (json.maxDosePerTreatmentPeriodIsSet) {
      builder.maxDosePerTreatmentPeriod(json.maxDosePerTreatmentPeriod);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.targetSpeciesIsSet) {
      builder.targetSpecies(json.targetSpecies);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableMedicinalProductPharmaceutical_RouteOfAdministration) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductPharmaceutical_RouteOfAdministration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductPharmaceutical_RouteOfAdministration instance
   */
  public static MedicinalProductPharmaceutical_RouteOfAdministration copyOf(MedicinalProductPharmaceutical_RouteOfAdministration instance) {
    if (instance instanceof ImmutableMedicinalProductPharmaceutical_RouteOfAdministration) {
      return (ImmutableMedicinalProductPharmaceutical_RouteOfAdministration) instance;
    }
    return ((ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.Builder) ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.builder())
        .maxSingleDose(instance.maxSingleDose())
        .code(instance.code())
        .maxDosePerDay(instance.maxDosePerDay())
        .modifierExtension(instance.modifierExtension())
        .maxTreatmentPeriod(instance.maxTreatmentPeriod())
        .firstDose(instance.firstDose())
        .maxDosePerTreatmentPeriod(instance.maxDosePerTreatmentPeriod())
        .id(instance.id())
        .targetSpecies(instance.targetSpecies())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductPharmaceutical_RouteOfAdministration MedicinalProductPharmaceutical_RouteOfAdministration}.
   * <pre>
   * ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.builder()
   *    .maxSingleDose(com.fhir.Quantity) // optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxSingleDose() maxSingleDose}
   *    .code(com.fhir.CodeableConcept) // required {@link MedicinalProductPharmaceutical_RouteOfAdministration#code() code}
   *    .maxDosePerDay(com.fhir.Quantity) // optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerDay() maxDosePerDay}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#modifierExtension() modifierExtension}
   *    .maxTreatmentPeriod(com.fhir.Duration) // optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxTreatmentPeriod() maxTreatmentPeriod}
   *    .firstDose(com.fhir.Quantity) // optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#firstDose() firstDose}
   *    .maxDosePerTreatmentPeriod(com.fhir.Ratio) // optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerTreatmentPeriod() maxDosePerTreatmentPeriod}
   *    .id(String) // optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#id() id}
   *    .targetSpecies(List&amp;lt;com.fhir.MedicinalProductPharmaceutical_TargetSpecies&amp;gt;) // optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#targetSpecies() targetSpecies}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductPharmaceutical_RouteOfAdministration#extension() extension}
   *    .build();
   * </pre>
   * @return A new MedicinalProductPharmaceutical_RouteOfAdministration builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductPharmaceutical_RouteOfAdministration MedicinalProductPharmaceutical_RouteOfAdministration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductPharmaceutical_RouteOfAdministration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_MAX_SINGLE_DOSE = 0x1L;
    private static final long OPT_BIT_MAX_DOSE_PER_DAY = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_MAX_TREATMENT_PERIOD = 0x8L;
    private static final long OPT_BIT_FIRST_DOSE = 0x10L;
    private static final long OPT_BIT_MAX_DOSE_PER_TREATMENT_PERIOD = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_TARGET_SPECIES = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Quantity maxSingleDose;
    private @Nullable CodeableConcept code;
    private @Nullable Quantity maxDosePerDay;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Duration maxTreatmentPeriod;
    private @Nullable Quantity firstDose;
    private @Nullable Ratio maxDosePerTreatmentPeriod;
    private @Nullable String id;
    private @Nullable List<MedicinalProductPharmaceutical_TargetSpecies> targetSpecies;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxSingleDose() maxSingleDose} to maxSingleDose.
     * @param maxSingleDose The value for maxSingleDose
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxSingleDose(Quantity maxSingleDose) {
      checkNotIsSet(maxSingleDoseIsSet(), "maxSingleDose");
      this.maxSingleDose = Objects.requireNonNull(maxSingleDose, "maxSingleDose");
      optBits |= OPT_BIT_MAX_SINGLE_DOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxSingleDose() maxSingleDose} to maxSingleDose.
     * @param maxSingleDose The value for maxSingleDose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxSingleDose")
    public final Builder maxSingleDose(Optional<? extends Quantity> maxSingleDose) {
      checkNotIsSet(maxSingleDoseIsSet(), "maxSingleDose");
      this.maxSingleDose = maxSingleDose.orElse(null);
      optBits |= OPT_BIT_MAX_SINGLE_DOSE;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerDay() maxDosePerDay} to maxDosePerDay.
     * @param maxDosePerDay The value for maxDosePerDay
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxDosePerDay(Quantity maxDosePerDay) {
      checkNotIsSet(maxDosePerDayIsSet(), "maxDosePerDay");
      this.maxDosePerDay = Objects.requireNonNull(maxDosePerDay, "maxDosePerDay");
      optBits |= OPT_BIT_MAX_DOSE_PER_DAY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerDay() maxDosePerDay} to maxDosePerDay.
     * @param maxDosePerDay The value for maxDosePerDay
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxDosePerDay")
    public final Builder maxDosePerDay(Optional<? extends Quantity> maxDosePerDay) {
      checkNotIsSet(maxDosePerDayIsSet(), "maxDosePerDay");
      this.maxDosePerDay = maxDosePerDay.orElse(null);
      optBits |= OPT_BIT_MAX_DOSE_PER_DAY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxTreatmentPeriod() maxTreatmentPeriod} to maxTreatmentPeriod.
     * @param maxTreatmentPeriod The value for maxTreatmentPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxTreatmentPeriod(Duration maxTreatmentPeriod) {
      checkNotIsSet(maxTreatmentPeriodIsSet(), "maxTreatmentPeriod");
      this.maxTreatmentPeriod = Objects.requireNonNull(maxTreatmentPeriod, "maxTreatmentPeriod");
      optBits |= OPT_BIT_MAX_TREATMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxTreatmentPeriod() maxTreatmentPeriod} to maxTreatmentPeriod.
     * @param maxTreatmentPeriod The value for maxTreatmentPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxTreatmentPeriod")
    public final Builder maxTreatmentPeriod(Optional<? extends Duration> maxTreatmentPeriod) {
      checkNotIsSet(maxTreatmentPeriodIsSet(), "maxTreatmentPeriod");
      this.maxTreatmentPeriod = maxTreatmentPeriod.orElse(null);
      optBits |= OPT_BIT_MAX_TREATMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#firstDose() firstDose} to firstDose.
     * @param firstDose The value for firstDose
     * @return {@code this} builder for chained invocation
     */
    public final Builder firstDose(Quantity firstDose) {
      checkNotIsSet(firstDoseIsSet(), "firstDose");
      this.firstDose = Objects.requireNonNull(firstDose, "firstDose");
      optBits |= OPT_BIT_FIRST_DOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#firstDose() firstDose} to firstDose.
     * @param firstDose The value for firstDose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("firstDose")
    public final Builder firstDose(Optional<? extends Quantity> firstDose) {
      checkNotIsSet(firstDoseIsSet(), "firstDose");
      this.firstDose = firstDose.orElse(null);
      optBits |= OPT_BIT_FIRST_DOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerTreatmentPeriod() maxDosePerTreatmentPeriod} to maxDosePerTreatmentPeriod.
     * @param maxDosePerTreatmentPeriod The value for maxDosePerTreatmentPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxDosePerTreatmentPeriod(Ratio maxDosePerTreatmentPeriod) {
      checkNotIsSet(maxDosePerTreatmentPeriodIsSet(), "maxDosePerTreatmentPeriod");
      this.maxDosePerTreatmentPeriod = Objects.requireNonNull(maxDosePerTreatmentPeriod, "maxDosePerTreatmentPeriod");
      optBits |= OPT_BIT_MAX_DOSE_PER_TREATMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerTreatmentPeriod() maxDosePerTreatmentPeriod} to maxDosePerTreatmentPeriod.
     * @param maxDosePerTreatmentPeriod The value for maxDosePerTreatmentPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxDosePerTreatmentPeriod")
    public final Builder maxDosePerTreatmentPeriod(Optional<? extends Ratio> maxDosePerTreatmentPeriod) {
      checkNotIsSet(maxDosePerTreatmentPeriodIsSet(), "maxDosePerTreatmentPeriod");
      this.maxDosePerTreatmentPeriod = maxDosePerTreatmentPeriod.orElse(null);
      optBits |= OPT_BIT_MAX_DOSE_PER_TREATMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#targetSpecies() targetSpecies} to targetSpecies.
     * @param targetSpecies The value for targetSpecies
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetSpecies(List<MedicinalProductPharmaceutical_TargetSpecies> targetSpecies) {
      checkNotIsSet(targetSpeciesIsSet(), "targetSpecies");
      this.targetSpecies = Objects.requireNonNull(targetSpecies, "targetSpecies");
      optBits |= OPT_BIT_TARGET_SPECIES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#targetSpecies() targetSpecies} to targetSpecies.
     * @param targetSpecies The value for targetSpecies
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetSpecies")
    public final Builder targetSpecies(Optional<? extends List<MedicinalProductPharmaceutical_TargetSpecies>> targetSpecies) {
      checkNotIsSet(targetSpeciesIsSet(), "targetSpecies");
      this.targetSpecies = targetSpecies.orElse(null);
      optBits |= OPT_BIT_TARGET_SPECIES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#extension() extension} to extension.
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
     * Builds a new {@link MedicinalProductPharmaceutical_RouteOfAdministration MedicinalProductPharmaceutical_RouteOfAdministration}.
     * @return An immutable instance of MedicinalProductPharmaceutical_RouteOfAdministration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductPharmaceutical_RouteOfAdministration build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductPharmaceutical_RouteOfAdministration(
          maxSingleDose,
          code,
          maxDosePerDay,
          modifierExtension,
          maxTreatmentPeriod,
          firstDose,
          maxDosePerTreatmentPeriod,
          id,
          targetSpecies,
          extension);
    }

    private boolean maxSingleDoseIsSet() {
      return (optBits & OPT_BIT_MAX_SINGLE_DOSE) != 0;
    }

    private boolean maxDosePerDayIsSet() {
      return (optBits & OPT_BIT_MAX_DOSE_PER_DAY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean maxTreatmentPeriodIsSet() {
      return (optBits & OPT_BIT_MAX_TREATMENT_PERIOD) != 0;
    }

    private boolean firstDoseIsSet() {
      return (optBits & OPT_BIT_FIRST_DOSE) != 0;
    }

    private boolean maxDosePerTreatmentPeriodIsSet() {
      return (optBits & OPT_BIT_MAX_DOSE_PER_TREATMENT_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean targetSpeciesIsSet() {
      return (optBits & OPT_BIT_TARGET_SPECIES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductPharmaceutical_RouteOfAdministration is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build MedicinalProductPharmaceutical_RouteOfAdministration, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductPharmaceutical_RouteOfAdministration", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductPharmaceutical_RouteOfAdministration#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(CodeableConcept code);
  }

  @Generated(from = "MedicinalProductPharmaceutical_RouteOfAdministration", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxSingleDose() maxSingleDose} to maxSingleDose.
     * @param maxSingleDose The value for maxSingleDose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal maxSingleDose(Quantity maxSingleDose);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxSingleDose() maxSingleDose} to maxSingleDose.
     * @param maxSingleDose The value for maxSingleDose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal maxSingleDose(Optional<? extends Quantity> maxSingleDose);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerDay() maxDosePerDay} to maxDosePerDay.
     * @param maxDosePerDay The value for maxDosePerDay
     * @return {@code this} builder for chained invocation
     */
    BuildFinal maxDosePerDay(Quantity maxDosePerDay);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerDay() maxDosePerDay} to maxDosePerDay.
     * @param maxDosePerDay The value for maxDosePerDay
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal maxDosePerDay(Optional<? extends Quantity> maxDosePerDay);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxTreatmentPeriod() maxTreatmentPeriod} to maxTreatmentPeriod.
     * @param maxTreatmentPeriod The value for maxTreatmentPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal maxTreatmentPeriod(Duration maxTreatmentPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxTreatmentPeriod() maxTreatmentPeriod} to maxTreatmentPeriod.
     * @param maxTreatmentPeriod The value for maxTreatmentPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal maxTreatmentPeriod(Optional<? extends Duration> maxTreatmentPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#firstDose() firstDose} to firstDose.
     * @param firstDose The value for firstDose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal firstDose(Quantity firstDose);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#firstDose() firstDose} to firstDose.
     * @param firstDose The value for firstDose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal firstDose(Optional<? extends Quantity> firstDose);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerTreatmentPeriod() maxDosePerTreatmentPeriod} to maxDosePerTreatmentPeriod.
     * @param maxDosePerTreatmentPeriod The value for maxDosePerTreatmentPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal maxDosePerTreatmentPeriod(Ratio maxDosePerTreatmentPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#maxDosePerTreatmentPeriod() maxDosePerTreatmentPeriod} to maxDosePerTreatmentPeriod.
     * @param maxDosePerTreatmentPeriod The value for maxDosePerTreatmentPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal maxDosePerTreatmentPeriod(Optional<? extends Ratio> maxDosePerTreatmentPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#targetSpecies() targetSpecies} to targetSpecies.
     * @param targetSpecies The value for targetSpecies
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetSpecies(List<MedicinalProductPharmaceutical_TargetSpecies> targetSpecies);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#targetSpecies() targetSpecies} to targetSpecies.
     * @param targetSpecies The value for targetSpecies
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetSpecies(Optional<? extends List<MedicinalProductPharmaceutical_TargetSpecies>> targetSpecies);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductPharmaceutical_RouteOfAdministration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link MedicinalProductPharmaceutical_RouteOfAdministration MedicinalProductPharmaceutical_RouteOfAdministration}.
     * @return An immutable instance of MedicinalProductPharmaceutical_RouteOfAdministration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductPharmaceutical_RouteOfAdministration build();
  }
}
