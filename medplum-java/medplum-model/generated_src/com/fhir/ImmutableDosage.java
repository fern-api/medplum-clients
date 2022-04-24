package com.fhir;

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
 * Immutable implementation of {@link Dosage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDosage.builder()}.
 */
@Generated(from = "Dosage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDosage implements Dosage {
  private final @Nullable Integer sequence;
  private final @Nullable List<Dosage_DoseAndRate> doseAndRate;
  private final @Nullable List<CodeableConcept> additionalInstruction;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Ratio maxDosePerPeriod;
  private final @Nullable Quantity maxDosePerAdministration;
  private final @Nullable Boolean asNeededBoolean;
  private final @Nullable CodeableConcept method;
  private final @Nullable String text;
  private final @Nullable CodeableConcept route;
  private final @Nullable String patientInstruction;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept asNeededCodeableConcept;
  private final @Nullable CodeableConcept site;
  private final @Nullable Quantity maxDosePerLifetime;
  private final @Nullable String id;
  private final @Nullable Timing timing;

  private ImmutableDosage(
      @Nullable Integer sequence,
      @Nullable List<Dosage_DoseAndRate> doseAndRate,
      @Nullable List<CodeableConcept> additionalInstruction,
      @Nullable List<Extension> modifierExtension,
      @Nullable Ratio maxDosePerPeriod,
      @Nullable Quantity maxDosePerAdministration,
      @Nullable Boolean asNeededBoolean,
      @Nullable CodeableConcept method,
      @Nullable String text,
      @Nullable CodeableConcept route,
      @Nullable String patientInstruction,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept asNeededCodeableConcept,
      @Nullable CodeableConcept site,
      @Nullable Quantity maxDosePerLifetime,
      @Nullable String id,
      @Nullable Timing timing) {
    this.sequence = sequence;
    this.doseAndRate = doseAndRate;
    this.additionalInstruction = additionalInstruction;
    this.modifierExtension = modifierExtension;
    this.maxDosePerPeriod = maxDosePerPeriod;
    this.maxDosePerAdministration = maxDosePerAdministration;
    this.asNeededBoolean = asNeededBoolean;
    this.method = method;
    this.text = text;
    this.route = route;
    this.patientInstruction = patientInstruction;
    this.extension = extension;
    this.asNeededCodeableConcept = asNeededCodeableConcept;
    this.site = site;
    this.maxDosePerLifetime = maxDosePerLifetime;
    this.id = id;
    this.timing = timing;
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<Integer> sequence() {
    return Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code doseAndRate} attribute
   */
  @JsonProperty("doseAndRate")
  @Override
  public Optional<List<Dosage_DoseAndRate>> doseAndRate() {
    return Optional.ofNullable(doseAndRate);
  }

  /**
   * @return The value of the {@code additionalInstruction} attribute
   */
  @JsonProperty("additionalInstruction")
  @Override
  public Optional<List<CodeableConcept>> additionalInstruction() {
    return Optional.ofNullable(additionalInstruction);
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
   * @return The value of the {@code maxDosePerPeriod} attribute
   */
  @JsonProperty("maxDosePerPeriod")
  @Override
  public Optional<Ratio> maxDosePerPeriod() {
    return Optional.ofNullable(maxDosePerPeriod);
  }

  /**
   * @return The value of the {@code maxDosePerAdministration} attribute
   */
  @JsonProperty("maxDosePerAdministration")
  @Override
  public Optional<Quantity> maxDosePerAdministration() {
    return Optional.ofNullable(maxDosePerAdministration);
  }

  /**
   * @return The value of the {@code asNeededBoolean} attribute
   */
  @JsonProperty("asNeededBoolean")
  @Override
  public Optional<Boolean> asNeededBoolean() {
    return Optional.ofNullable(asNeededBoolean);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<CodeableConcept> method() {
    return Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code route} attribute
   */
  @JsonProperty("route")
  @Override
  public Optional<CodeableConcept> route() {
    return Optional.ofNullable(route);
  }

  /**
   * @return The value of the {@code patientInstruction} attribute
   */
  @JsonProperty("patientInstruction")
  @Override
  public Optional<String> patientInstruction() {
    return Optional.ofNullable(patientInstruction);
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
   * @return The value of the {@code asNeededCodeableConcept} attribute
   */
  @JsonProperty("asNeededCodeableConcept")
  @Override
  public Optional<CodeableConcept> asNeededCodeableConcept() {
    return Optional.ofNullable(asNeededCodeableConcept);
  }

  /**
   * @return The value of the {@code site} attribute
   */
  @JsonProperty("site")
  @Override
  public Optional<CodeableConcept> site() {
    return Optional.ofNullable(site);
  }

  /**
   * @return The value of the {@code maxDosePerLifetime} attribute
   */
  @JsonProperty("maxDosePerLifetime")
  @Override
  public Optional<Quantity> maxDosePerLifetime() {
    return Optional.ofNullable(maxDosePerLifetime);
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
   * @return The value of the {@code timing} attribute
   */
  @JsonProperty("timing")
  @Override
  public Optional<Timing> timing() {
    return Optional.ofNullable(timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withSequence(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.sequence, newValue)) return this;
    return new ImmutableDosage(
        newValue,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#sequence() sequence} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withSequence(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.sequence, value)) return this;
    return new ImmutableDosage(
        value,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#doseAndRate() doseAndRate} attribute.
   * @param value The value for doseAndRate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withDoseAndRate(List<Dosage_DoseAndRate> value) {
    @Nullable List<Dosage_DoseAndRate> newValue = Objects.requireNonNull(value, "doseAndRate");
    if (this.doseAndRate == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        newValue,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#doseAndRate() doseAndRate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseAndRate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withDoseAndRate(Optional<? extends List<Dosage_DoseAndRate>> optional) {
    @Nullable List<Dosage_DoseAndRate> value = optional.orElse(null);
    if (this.doseAndRate == value) return this;
    return new ImmutableDosage(
        this.sequence,
        value,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#additionalInstruction() additionalInstruction} attribute.
   * @param value The value for additionalInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withAdditionalInstruction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "additionalInstruction");
    if (this.additionalInstruction == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        newValue,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#additionalInstruction() additionalInstruction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additionalInstruction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withAdditionalInstruction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.additionalInstruction == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        value,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        newValue,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        value,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#maxDosePerPeriod() maxDosePerPeriod} attribute.
   * @param value The value for maxDosePerPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withMaxDosePerPeriod(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "maxDosePerPeriod");
    if (this.maxDosePerPeriod == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        newValue,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#maxDosePerPeriod() maxDosePerPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxDosePerPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withMaxDosePerPeriod(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.maxDosePerPeriod == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        value,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#maxDosePerAdministration() maxDosePerAdministration} attribute.
   * @param value The value for maxDosePerAdministration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withMaxDosePerAdministration(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "maxDosePerAdministration");
    if (this.maxDosePerAdministration == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        newValue,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#maxDosePerAdministration() maxDosePerAdministration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxDosePerAdministration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withMaxDosePerAdministration(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.maxDosePerAdministration == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        value,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#asNeededBoolean() asNeededBoolean} attribute.
   * @param value The value for asNeededBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withAsNeededBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.asNeededBoolean, newValue)) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        newValue,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#asNeededBoolean() asNeededBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asNeededBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withAsNeededBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.asNeededBoolean, value)) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        value,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        newValue,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        value,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        newValue,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        value,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#route() route} attribute.
   * @param value The value for route
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withRoute(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "route");
    if (this.route == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        newValue,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#route() route} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for route
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withRoute(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.route == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        value,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#patientInstruction() patientInstruction} attribute.
   * @param value The value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withPatientInstruction(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "patientInstruction");
    if (Objects.equals(this.patientInstruction, newValue)) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        newValue,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#patientInstruction() patientInstruction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withPatientInstruction(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.patientInstruction, value)) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        value,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        newValue,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        value,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#asNeededCodeableConcept() asNeededCodeableConcept} attribute.
   * @param value The value for asNeededCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withAsNeededCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "asNeededCodeableConcept");
    if (this.asNeededCodeableConcept == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        newValue,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#asNeededCodeableConcept() asNeededCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asNeededCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withAsNeededCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.asNeededCodeableConcept == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        value,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#site() site} attribute.
   * @param value The value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withSite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "site");
    if (this.site == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        newValue,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#site() site} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for site
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withSite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.site == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        value,
        this.maxDosePerLifetime,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#maxDosePerLifetime() maxDosePerLifetime} attribute.
   * @param value The value for maxDosePerLifetime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withMaxDosePerLifetime(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "maxDosePerLifetime");
    if (this.maxDosePerLifetime == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        newValue,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#maxDosePerLifetime() maxDosePerLifetime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxDosePerLifetime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withMaxDosePerLifetime(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.maxDosePerLifetime == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        value,
        this.id,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        newValue,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        value,
        this.timing);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage#timing() timing} attribute.
   * @param value The value for timing
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage withTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "timing");
    if (this.timing == newValue) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage#timing() timing} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timing
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage withTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.timing == value) return this;
    return new ImmutableDosage(
        this.sequence,
        this.doseAndRate,
        this.additionalInstruction,
        this.modifierExtension,
        this.maxDosePerPeriod,
        this.maxDosePerAdministration,
        this.asNeededBoolean,
        this.method,
        this.text,
        this.route,
        this.patientInstruction,
        this.extension,
        this.asNeededCodeableConcept,
        this.site,
        this.maxDosePerLifetime,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDosage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDosage
        && equalTo((ImmutableDosage) another);
  }

  private boolean equalTo(ImmutableDosage another) {
    return Objects.equals(sequence, another.sequence)
        && Objects.equals(doseAndRate, another.doseAndRate)
        && Objects.equals(additionalInstruction, another.additionalInstruction)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(maxDosePerPeriod, another.maxDosePerPeriod)
        && Objects.equals(maxDosePerAdministration, another.maxDosePerAdministration)
        && Objects.equals(asNeededBoolean, another.asNeededBoolean)
        && Objects.equals(method, another.method)
        && Objects.equals(text, another.text)
        && Objects.equals(route, another.route)
        && Objects.equals(patientInstruction, another.patientInstruction)
        && Objects.equals(extension, another.extension)
        && Objects.equals(asNeededCodeableConcept, another.asNeededCodeableConcept)
        && Objects.equals(site, another.site)
        && Objects.equals(maxDosePerLifetime, another.maxDosePerLifetime)
        && Objects.equals(id, another.id)
        && Objects.equals(timing, another.timing);
  }

  /**
   * Computes a hash code from attributes: {@code sequence}, {@code doseAndRate}, {@code additionalInstruction}, {@code modifierExtension}, {@code maxDosePerPeriod}, {@code maxDosePerAdministration}, {@code asNeededBoolean}, {@code method}, {@code text}, {@code route}, {@code patientInstruction}, {@code extension}, {@code asNeededCodeableConcept}, {@code site}, {@code maxDosePerLifetime}, {@code id}, {@code timing}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(doseAndRate);
    h += (h << 5) + Objects.hashCode(additionalInstruction);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(maxDosePerPeriod);
    h += (h << 5) + Objects.hashCode(maxDosePerAdministration);
    h += (h << 5) + Objects.hashCode(asNeededBoolean);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(route);
    h += (h << 5) + Objects.hashCode(patientInstruction);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(asNeededCodeableConcept);
    h += (h << 5) + Objects.hashCode(site);
    h += (h << 5) + Objects.hashCode(maxDosePerLifetime);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(timing);
    return h;
  }

  /**
   * Prints the immutable value {@code Dosage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Dosage{");
    if (sequence != null) {
      builder.append("sequence=").append(sequence);
    }
    if (doseAndRate != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("doseAndRate=").append(doseAndRate);
    }
    if (additionalInstruction != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("additionalInstruction=").append(additionalInstruction);
    }
    if (modifierExtension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (maxDosePerPeriod != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("maxDosePerPeriod=").append(maxDosePerPeriod);
    }
    if (maxDosePerAdministration != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("maxDosePerAdministration=").append(maxDosePerAdministration);
    }
    if (asNeededBoolean != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("asNeededBoolean=").append(asNeededBoolean);
    }
    if (method != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (text != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (route != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("route=").append(route);
    }
    if (patientInstruction != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("patientInstruction=").append(patientInstruction);
    }
    if (extension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (asNeededCodeableConcept != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("asNeededCodeableConcept=").append(asNeededCodeableConcept);
    }
    if (site != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("site=").append(site);
    }
    if (maxDosePerLifetime != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("maxDosePerLifetime=").append(maxDosePerLifetime);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (timing != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("timing=").append(timing);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Dosage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Dosage {
    @Nullable Optional<Integer> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<List<Dosage_DoseAndRate>> doseAndRate = Optional.empty();
    boolean doseAndRateIsSet;
    @Nullable Optional<List<CodeableConcept>> additionalInstruction = Optional.empty();
    boolean additionalInstructionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Ratio> maxDosePerPeriod = Optional.empty();
    boolean maxDosePerPeriodIsSet;
    @Nullable Optional<Quantity> maxDosePerAdministration = Optional.empty();
    boolean maxDosePerAdministrationIsSet;
    @Nullable Optional<Boolean> asNeededBoolean = Optional.empty();
    boolean asNeededBooleanIsSet;
    @Nullable Optional<CodeableConcept> method = Optional.empty();
    boolean methodIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<CodeableConcept> route = Optional.empty();
    boolean routeIsSet;
    @Nullable Optional<String> patientInstruction = Optional.empty();
    boolean patientInstructionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> asNeededCodeableConcept = Optional.empty();
    boolean asNeededCodeableConceptIsSet;
    @Nullable Optional<CodeableConcept> site = Optional.empty();
    boolean siteIsSet;
    @Nullable Optional<Quantity> maxDosePerLifetime = Optional.empty();
    boolean maxDosePerLifetimeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Timing> timing = Optional.empty();
    boolean timingIsSet;
    @JsonProperty("sequence")
    public void setSequence(Optional<Integer> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("doseAndRate")
    public void setDoseAndRate(Optional<List<Dosage_DoseAndRate>> doseAndRate) {
      this.doseAndRate = doseAndRate;
      this.doseAndRateIsSet = true;
    }
    @JsonProperty("additionalInstruction")
    public void setAdditionalInstruction(Optional<List<CodeableConcept>> additionalInstruction) {
      this.additionalInstruction = additionalInstruction;
      this.additionalInstructionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("maxDosePerPeriod")
    public void setMaxDosePerPeriod(Optional<Ratio> maxDosePerPeriod) {
      this.maxDosePerPeriod = maxDosePerPeriod;
      this.maxDosePerPeriodIsSet = true;
    }
    @JsonProperty("maxDosePerAdministration")
    public void setMaxDosePerAdministration(Optional<Quantity> maxDosePerAdministration) {
      this.maxDosePerAdministration = maxDosePerAdministration;
      this.maxDosePerAdministrationIsSet = true;
    }
    @JsonProperty("asNeededBoolean")
    public void setAsNeededBoolean(Optional<Boolean> asNeededBoolean) {
      this.asNeededBoolean = asNeededBoolean;
      this.asNeededBooleanIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("route")
    public void setRoute(Optional<CodeableConcept> route) {
      this.route = route;
      this.routeIsSet = true;
    }
    @JsonProperty("patientInstruction")
    public void setPatientInstruction(Optional<String> patientInstruction) {
      this.patientInstruction = patientInstruction;
      this.patientInstructionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("asNeededCodeableConcept")
    public void setAsNeededCodeableConcept(Optional<CodeableConcept> asNeededCodeableConcept) {
      this.asNeededCodeableConcept = asNeededCodeableConcept;
      this.asNeededCodeableConceptIsSet = true;
    }
    @JsonProperty("site")
    public void setSite(Optional<CodeableConcept> site) {
      this.site = site;
      this.siteIsSet = true;
    }
    @JsonProperty("maxDosePerLifetime")
    public void setMaxDosePerLifetime(Optional<Quantity> maxDosePerLifetime) {
      this.maxDosePerLifetime = maxDosePerLifetime;
      this.maxDosePerLifetimeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("timing")
    public void setTiming(Optional<Timing> timing) {
      this.timing = timing;
      this.timingIsSet = true;
    }
    @Override
    public Optional<Integer> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Dosage_DoseAndRate>> doseAndRate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> additionalInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> maxDosePerPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> maxDosePerAdministration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> asNeededBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> route() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> patientInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> asNeededCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> site() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> maxDosePerLifetime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> timing() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDosage fromJson(Json json) {
    ImmutableDosage.Builder builder = ImmutableDosage.builder();
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.doseAndRateIsSet) {
      builder.doseAndRate(json.doseAndRate);
    }
    if (json.additionalInstructionIsSet) {
      builder.additionalInstruction(json.additionalInstruction);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.maxDosePerPeriodIsSet) {
      builder.maxDosePerPeriod(json.maxDosePerPeriod);
    }
    if (json.maxDosePerAdministrationIsSet) {
      builder.maxDosePerAdministration(json.maxDosePerAdministration);
    }
    if (json.asNeededBooleanIsSet) {
      builder.asNeededBoolean(json.asNeededBoolean);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.routeIsSet) {
      builder.route(json.route);
    }
    if (json.patientInstructionIsSet) {
      builder.patientInstruction(json.patientInstruction);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.asNeededCodeableConceptIsSet) {
      builder.asNeededCodeableConcept(json.asNeededCodeableConcept);
    }
    if (json.siteIsSet) {
      builder.site(json.site);
    }
    if (json.maxDosePerLifetimeIsSet) {
      builder.maxDosePerLifetime(json.maxDosePerLifetime);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.timingIsSet) {
      builder.timing(json.timing);
    }
    return (ImmutableDosage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Dosage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Dosage instance
   */
  public static Dosage copyOf(Dosage instance) {
    if (instance instanceof ImmutableDosage) {
      return (ImmutableDosage) instance;
    }
    return ImmutableDosage.builder()
        .sequence(instance.sequence())
        .doseAndRate(instance.doseAndRate())
        .additionalInstruction(instance.additionalInstruction())
        .modifierExtension(instance.modifierExtension())
        .maxDosePerPeriod(instance.maxDosePerPeriod())
        .maxDosePerAdministration(instance.maxDosePerAdministration())
        .asNeededBoolean(instance.asNeededBoolean())
        .method(instance.method())
        .text(instance.text())
        .route(instance.route())
        .patientInstruction(instance.patientInstruction())
        .extension(instance.extension())
        .asNeededCodeableConcept(instance.asNeededCodeableConcept())
        .site(instance.site())
        .maxDosePerLifetime(instance.maxDosePerLifetime())
        .id(instance.id())
        .timing(instance.timing())
        .build();
  }

  /**
   * Creates a builder for {@link Dosage Dosage}.
   * <pre>
   * ImmutableDosage.builder()
   *    .sequence(Integer) // optional {@link Dosage#sequence() sequence}
   *    .doseAndRate(List&amp;lt;com.fhir.Dosage_DoseAndRate&amp;gt;) // optional {@link Dosage#doseAndRate() doseAndRate}
   *    .additionalInstruction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Dosage#additionalInstruction() additionalInstruction}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Dosage#modifierExtension() modifierExtension}
   *    .maxDosePerPeriod(com.fhir.Ratio) // optional {@link Dosage#maxDosePerPeriod() maxDosePerPeriod}
   *    .maxDosePerAdministration(com.fhir.Quantity) // optional {@link Dosage#maxDosePerAdministration() maxDosePerAdministration}
   *    .asNeededBoolean(Boolean) // optional {@link Dosage#asNeededBoolean() asNeededBoolean}
   *    .method(com.fhir.CodeableConcept) // optional {@link Dosage#method() method}
   *    .text(String) // optional {@link Dosage#text() text}
   *    .route(com.fhir.CodeableConcept) // optional {@link Dosage#route() route}
   *    .patientInstruction(String) // optional {@link Dosage#patientInstruction() patientInstruction}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Dosage#extension() extension}
   *    .asNeededCodeableConcept(com.fhir.CodeableConcept) // optional {@link Dosage#asNeededCodeableConcept() asNeededCodeableConcept}
   *    .site(com.fhir.CodeableConcept) // optional {@link Dosage#site() site}
   *    .maxDosePerLifetime(com.fhir.Quantity) // optional {@link Dosage#maxDosePerLifetime() maxDosePerLifetime}
   *    .id(String) // optional {@link Dosage#id() id}
   *    .timing(com.fhir.Timing) // optional {@link Dosage#timing() timing}
   *    .build();
   * </pre>
   * @return A new Dosage builder
   */
  public static ImmutableDosage.Builder builder() {
    return new ImmutableDosage.Builder();
  }

  /**
   * Builds instances of type {@link Dosage Dosage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Dosage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SEQUENCE = 0x1L;
    private static final long OPT_BIT_DOSE_AND_RATE = 0x2L;
    private static final long OPT_BIT_ADDITIONAL_INSTRUCTION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_MAX_DOSE_PER_PERIOD = 0x10L;
    private static final long OPT_BIT_MAX_DOSE_PER_ADMINISTRATION = 0x20L;
    private static final long OPT_BIT_AS_NEEDED_BOOLEAN = 0x40L;
    private static final long OPT_BIT_METHOD = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_ROUTE = 0x200L;
    private static final long OPT_BIT_PATIENT_INSTRUCTION = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT = 0x1000L;
    private static final long OPT_BIT_SITE = 0x2000L;
    private static final long OPT_BIT_MAX_DOSE_PER_LIFETIME = 0x4000L;
    private static final long OPT_BIT_ID = 0x8000L;
    private static final long OPT_BIT_TIMING = 0x10000L;
    private long optBits;

    private @Nullable Integer sequence;
    private @Nullable List<Dosage_DoseAndRate> doseAndRate;
    private @Nullable List<CodeableConcept> additionalInstruction;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Ratio maxDosePerPeriod;
    private @Nullable Quantity maxDosePerAdministration;
    private @Nullable Boolean asNeededBoolean;
    private @Nullable CodeableConcept method;
    private @Nullable String text;
    private @Nullable CodeableConcept route;
    private @Nullable String patientInstruction;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept asNeededCodeableConcept;
    private @Nullable CodeableConcept site;
    private @Nullable Quantity maxDosePerLifetime;
    private @Nullable String id;
    private @Nullable Timing timing;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Dosage#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(int sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence;
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<Integer> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#doseAndRate() doseAndRate} to doseAndRate.
     * @param doseAndRate The value for doseAndRate
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseAndRate(List<Dosage_DoseAndRate> doseAndRate) {
      checkNotIsSet(doseAndRateIsSet(), "doseAndRate");
      this.doseAndRate = Objects.requireNonNull(doseAndRate, "doseAndRate");
      optBits |= OPT_BIT_DOSE_AND_RATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#doseAndRate() doseAndRate} to doseAndRate.
     * @param doseAndRate The value for doseAndRate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseAndRate")
    public final Builder doseAndRate(Optional<? extends List<Dosage_DoseAndRate>> doseAndRate) {
      checkNotIsSet(doseAndRateIsSet(), "doseAndRate");
      this.doseAndRate = doseAndRate.orElse(null);
      optBits |= OPT_BIT_DOSE_AND_RATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#additionalInstruction() additionalInstruction} to additionalInstruction.
     * @param additionalInstruction The value for additionalInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder additionalInstruction(List<CodeableConcept> additionalInstruction) {
      checkNotIsSet(additionalInstructionIsSet(), "additionalInstruction");
      this.additionalInstruction = Objects.requireNonNull(additionalInstruction, "additionalInstruction");
      optBits |= OPT_BIT_ADDITIONAL_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#additionalInstruction() additionalInstruction} to additionalInstruction.
     * @param additionalInstruction The value for additionalInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additionalInstruction")
    public final Builder additionalInstruction(Optional<? extends List<CodeableConcept>> additionalInstruction) {
      checkNotIsSet(additionalInstructionIsSet(), "additionalInstruction");
      this.additionalInstruction = additionalInstruction.orElse(null);
      optBits |= OPT_BIT_ADDITIONAL_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Dosage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Dosage#maxDosePerPeriod() maxDosePerPeriod} to maxDosePerPeriod.
     * @param maxDosePerPeriod The value for maxDosePerPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxDosePerPeriod(Ratio maxDosePerPeriod) {
      checkNotIsSet(maxDosePerPeriodIsSet(), "maxDosePerPeriod");
      this.maxDosePerPeriod = Objects.requireNonNull(maxDosePerPeriod, "maxDosePerPeriod");
      optBits |= OPT_BIT_MAX_DOSE_PER_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#maxDosePerPeriod() maxDosePerPeriod} to maxDosePerPeriod.
     * @param maxDosePerPeriod The value for maxDosePerPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxDosePerPeriod")
    public final Builder maxDosePerPeriod(Optional<? extends Ratio> maxDosePerPeriod) {
      checkNotIsSet(maxDosePerPeriodIsSet(), "maxDosePerPeriod");
      this.maxDosePerPeriod = maxDosePerPeriod.orElse(null);
      optBits |= OPT_BIT_MAX_DOSE_PER_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#maxDosePerAdministration() maxDosePerAdministration} to maxDosePerAdministration.
     * @param maxDosePerAdministration The value for maxDosePerAdministration
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxDosePerAdministration(Quantity maxDosePerAdministration) {
      checkNotIsSet(maxDosePerAdministrationIsSet(), "maxDosePerAdministration");
      this.maxDosePerAdministration = Objects.requireNonNull(maxDosePerAdministration, "maxDosePerAdministration");
      optBits |= OPT_BIT_MAX_DOSE_PER_ADMINISTRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#maxDosePerAdministration() maxDosePerAdministration} to maxDosePerAdministration.
     * @param maxDosePerAdministration The value for maxDosePerAdministration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxDosePerAdministration")
    public final Builder maxDosePerAdministration(Optional<? extends Quantity> maxDosePerAdministration) {
      checkNotIsSet(maxDosePerAdministrationIsSet(), "maxDosePerAdministration");
      this.maxDosePerAdministration = maxDosePerAdministration.orElse(null);
      optBits |= OPT_BIT_MAX_DOSE_PER_ADMINISTRATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder asNeededBoolean(boolean asNeededBoolean) {
      checkNotIsSet(asNeededBooleanIsSet(), "asNeededBoolean");
      this.asNeededBoolean = asNeededBoolean;
      optBits |= OPT_BIT_AS_NEEDED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("asNeededBoolean")
    public final Builder asNeededBoolean(Optional<Boolean> asNeededBoolean) {
      checkNotIsSet(asNeededBooleanIsSet(), "asNeededBoolean");
      this.asNeededBoolean = asNeededBoolean.orElse(null);
      optBits |= OPT_BIT_AS_NEEDED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for chained invocation
     */
    public final Builder route(CodeableConcept route) {
      checkNotIsSet(routeIsSet(), "route");
      this.route = Objects.requireNonNull(route, "route");
      optBits |= OPT_BIT_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("route")
    public final Builder route(Optional<? extends CodeableConcept> route) {
      checkNotIsSet(routeIsSet(), "route");
      this.route = route.orElse(null);
      optBits |= OPT_BIT_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder patientInstruction(String patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = Objects.requireNonNull(patientInstruction, "patientInstruction");
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patientInstruction")
    public final Builder patientInstruction(Optional<String> patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = patientInstruction.orElse(null);
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#extension() extension} to extension.
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
     * Initializes the optional value {@link Dosage#extension() extension} to extension.
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
     * Initializes the optional value {@link Dosage#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder asNeededCodeableConcept(CodeableConcept asNeededCodeableConcept) {
      checkNotIsSet(asNeededCodeableConceptIsSet(), "asNeededCodeableConcept");
      this.asNeededCodeableConcept = Objects.requireNonNull(asNeededCodeableConcept, "asNeededCodeableConcept");
      optBits |= OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("asNeededCodeableConcept")
    public final Builder asNeededCodeableConcept(Optional<? extends CodeableConcept> asNeededCodeableConcept) {
      checkNotIsSet(asNeededCodeableConceptIsSet(), "asNeededCodeableConcept");
      this.asNeededCodeableConcept = asNeededCodeableConcept.orElse(null);
      optBits |= OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    public final Builder site(CodeableConcept site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = Objects.requireNonNull(site, "site");
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("site")
    public final Builder site(Optional<? extends CodeableConcept> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = site.orElse(null);
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#maxDosePerLifetime() maxDosePerLifetime} to maxDosePerLifetime.
     * @param maxDosePerLifetime The value for maxDosePerLifetime
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxDosePerLifetime(Quantity maxDosePerLifetime) {
      checkNotIsSet(maxDosePerLifetimeIsSet(), "maxDosePerLifetime");
      this.maxDosePerLifetime = Objects.requireNonNull(maxDosePerLifetime, "maxDosePerLifetime");
      optBits |= OPT_BIT_MAX_DOSE_PER_LIFETIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#maxDosePerLifetime() maxDosePerLifetime} to maxDosePerLifetime.
     * @param maxDosePerLifetime The value for maxDosePerLifetime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxDosePerLifetime")
    public final Builder maxDosePerLifetime(Optional<? extends Quantity> maxDosePerLifetime) {
      checkNotIsSet(maxDosePerLifetimeIsSet(), "maxDosePerLifetime");
      this.maxDosePerLifetime = maxDosePerLifetime.orElse(null);
      optBits |= OPT_BIT_MAX_DOSE_PER_LIFETIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#id() id} to id.
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
     * Initializes the optional value {@link Dosage#id() id} to id.
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
     * Initializes the optional value {@link Dosage#timing() timing} to timing.
     * @param timing The value for timing
     * @return {@code this} builder for chained invocation
     */
    public final Builder timing(Timing timing) {
      checkNotIsSet(timingIsSet(), "timing");
      this.timing = Objects.requireNonNull(timing, "timing");
      optBits |= OPT_BIT_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage#timing() timing} to timing.
     * @param timing The value for timing
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timing")
    public final Builder timing(Optional<? extends Timing> timing) {
      checkNotIsSet(timingIsSet(), "timing");
      this.timing = timing.orElse(null);
      optBits |= OPT_BIT_TIMING;
      return this;
    }

    /**
     * Builds a new {@link Dosage Dosage}.
     * @return An immutable instance of Dosage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Dosage build() {
      return new ImmutableDosage(
          sequence,
          doseAndRate,
          additionalInstruction,
          modifierExtension,
          maxDosePerPeriod,
          maxDosePerAdministration,
          asNeededBoolean,
          method,
          text,
          route,
          patientInstruction,
          extension,
          asNeededCodeableConcept,
          site,
          maxDosePerLifetime,
          id,
          timing);
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean doseAndRateIsSet() {
      return (optBits & OPT_BIT_DOSE_AND_RATE) != 0;
    }

    private boolean additionalInstructionIsSet() {
      return (optBits & OPT_BIT_ADDITIONAL_INSTRUCTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean maxDosePerPeriodIsSet() {
      return (optBits & OPT_BIT_MAX_DOSE_PER_PERIOD) != 0;
    }

    private boolean maxDosePerAdministrationIsSet() {
      return (optBits & OPT_BIT_MAX_DOSE_PER_ADMINISTRATION) != 0;
    }

    private boolean asNeededBooleanIsSet() {
      return (optBits & OPT_BIT_AS_NEEDED_BOOLEAN) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean routeIsSet() {
      return (optBits & OPT_BIT_ROUTE) != 0;
    }

    private boolean patientInstructionIsSet() {
      return (optBits & OPT_BIT_PATIENT_INSTRUCTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean asNeededCodeableConceptIsSet() {
      return (optBits & OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT) != 0;
    }

    private boolean siteIsSet() {
      return (optBits & OPT_BIT_SITE) != 0;
    }

    private boolean maxDosePerLifetimeIsSet() {
      return (optBits & OPT_BIT_MAX_DOSE_PER_LIFETIME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean timingIsSet() {
      return (optBits & OPT_BIT_TIMING) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Dosage is strict, attribute is already set: ".concat(name));
    }
  }
}
