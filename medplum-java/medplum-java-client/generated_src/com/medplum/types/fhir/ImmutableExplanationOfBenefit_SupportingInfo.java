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
 * Immutable implementation of {@link ExplanationOfBenefit_SupportingInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_SupportingInfo.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_SupportingInfo
    implements ExplanationOfBenefit_SupportingInfo {
  private final @Nullable Boolean valueBoolean;
  private final @Nullable Reference valueReference;
  private final @Nullable String id;
  private final @Nullable Coding reason;
  private final @Nullable PositiveInt sequence;
  private final @Nullable String valueString;
  private final @Nullable Attachment valueAttachment;
  private final @Nullable Period timingPeriod;
  private final @Nullable String timingDate;
  private final @Nullable List<Extension> extension;
  private final CodeableConcept category;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept code;
  private final @Nullable Quantity valueQuantity;

  private ImmutableExplanationOfBenefit_SupportingInfo(
      @Nullable Boolean valueBoolean,
      @Nullable Reference valueReference,
      @Nullable String id,
      @Nullable Coding reason,
      @Nullable PositiveInt sequence,
      @Nullable String valueString,
      @Nullable Attachment valueAttachment,
      @Nullable Period timingPeriod,
      @Nullable String timingDate,
      @Nullable List<Extension> extension,
      CodeableConcept category,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept code,
      @Nullable Quantity valueQuantity) {
    this.valueBoolean = valueBoolean;
    this.valueReference = valueReference;
    this.id = id;
    this.reason = reason;
    this.sequence = sequence;
    this.valueString = valueString;
    this.valueAttachment = valueAttachment;
    this.timingPeriod = timingPeriod;
    this.timingDate = timingDate;
    this.extension = extension;
    this.category = category;
    this.modifierExtension = modifierExtension;
    this.code = code;
    this.valueQuantity = valueQuantity;
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @JsonProperty("valueBoolean")
  @Override
  public Optional<Boolean> valueBoolean() {
    return Optional.ofNullable(valueBoolean);
  }

  /**
   * @return The value of the {@code valueReference} attribute
   */
  @JsonProperty("valueReference")
  @Override
  public Optional<Reference> valueReference() {
    return Optional.ofNullable(valueReference);
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
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<Coding> reason() {
    return Optional.ofNullable(reason);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<PositiveInt> sequence() {
    return Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code valueAttachment} attribute
   */
  @JsonProperty("valueAttachment")
  @Override
  public Optional<Attachment> valueAttachment() {
    return Optional.ofNullable(valueAttachment);
  }

  /**
   * @return The value of the {@code timingPeriod} attribute
   */
  @JsonProperty("timingPeriod")
  @Override
  public Optional<Period> timingPeriod() {
    return Optional.ofNullable(timingPeriod);
  }

  /**
   * @return The value of the {@code timingDate} attribute
   */
  @JsonProperty("timingDate")
  @Override
  public Optional<String> timingDate() {
    return Optional.ofNullable(timingDate);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public CodeableConcept category() {
    return category;
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code valueQuantity} attribute
   */
  @JsonProperty("valueQuantity")
  @Override
  public Optional<Quantity> valueQuantity() {
    return Optional.ofNullable(valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        newValue,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        value,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        newValue,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        value,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        newValue,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        value,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withReason(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        newValue,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withReason(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        value,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        newValue,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        value,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        newValue,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        value,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} attribute.
   * @param value The value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "valueAttachment");
    if (this.valueAttachment == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        newValue,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.valueAttachment == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        value,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withTimingPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        newValue,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withTimingPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        value,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} attribute.
   * @param value The value for timingDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withTimingDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timingDate");
    if (Objects.equals(this.timingDate, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        newValue,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withTimingDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timingDate, value)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        value,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        newValue,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        value,
        this.category,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_SupportingInfo#category() category} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withCategory(CodeableConcept value) {
    if (this.category == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "category");
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        newValue,
        this.modifierExtension,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        newValue,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        value,
        this.code,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        newValue,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        value,
        this.valueQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueReference,
        this.id,
        this.reason,
        this.sequence,
        this.valueString,
        this.valueAttachment,
        this.timingPeriod,
        this.timingDate,
        this.extension,
        this.category,
        this.modifierExtension,
        this.code,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_SupportingInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_SupportingInfo
        && equalTo((ImmutableExplanationOfBenefit_SupportingInfo) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_SupportingInfo another) {
    return Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valueReference, another.valueReference)
        && Objects.equals(id, another.id)
        && Objects.equals(reason, another.reason)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueAttachment, another.valueAttachment)
        && Objects.equals(timingPeriod, another.timingPeriod)
        && Objects.equals(timingDate, another.timingDate)
        && Objects.equals(extension, another.extension)
        && category.equals(another.category)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(code, another.code)
        && Objects.equals(valueQuantity, another.valueQuantity);
  }

  /**
   * Computes a hash code from attributes: {@code valueBoolean}, {@code valueReference}, {@code id}, {@code reason}, {@code sequence}, {@code valueString}, {@code valueAttachment}, {@code timingPeriod}, {@code timingDate}, {@code extension}, {@code category}, {@code modifierExtension}, {@code code}, {@code valueQuantity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valueReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueAttachment);
    h += (h << 5) + Objects.hashCode(timingPeriod);
    h += (h << 5) + Objects.hashCode(timingDate);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + category.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_SupportingInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_SupportingInfo{");
    if (valueBoolean != null) {
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueReference != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (id != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (reason != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (sequence != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (valueString != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueAttachment != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("valueAttachment=").append(valueAttachment);
    }
    if (timingPeriod != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (timingDate != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("timingDate=").append(timingDate);
    }
    if (extension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 36) builder.append(", ");
    builder.append("category=").append(category);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (valueQuantity != null) {
      builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_SupportingInfo {
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<Reference> valueReference = Optional.empty();
    boolean valueReferenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Coding> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<Attachment> valueAttachment = Optional.empty();
    boolean valueAttachmentIsSet;
    @Nullable Optional<Period> timingPeriod = Optional.empty();
    boolean timingPeriodIsSet;
    @Nullable Optional<String> timingDate = Optional.empty();
    boolean timingDateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept category;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("valueReference")
    public void setValueReference(Optional<Reference> valueReference) {
      this.valueReference = valueReference;
      this.valueReferenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<Coding> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueAttachment")
    public void setValueAttachment(Optional<Attachment> valueAttachment) {
      this.valueAttachment = valueAttachment;
      this.valueAttachmentIsSet = true;
    }
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Optional<Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @JsonProperty("timingDate")
    public void setTimingDate(Optional<String> timingDate) {
      this.timingDate = timingDate;
      this.timingDateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(CodeableConcept category) {
      this.category = category;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> valueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timingDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_SupportingInfo fromJson(Json json) {
    ImmutableExplanationOfBenefit_SupportingInfo.Builder builder = ((ImmutableExplanationOfBenefit_SupportingInfo.Builder) ImmutableExplanationOfBenefit_SupportingInfo.builder());
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueAttachmentIsSet) {
      builder.valueAttachment(json.valueAttachment);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.timingDateIsSet) {
      builder.timingDate(json.timingDate);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    return (ImmutableExplanationOfBenefit_SupportingInfo) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_SupportingInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_SupportingInfo instance
   */
  public static ExplanationOfBenefit_SupportingInfo copyOf(ExplanationOfBenefit_SupportingInfo instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_SupportingInfo) {
      return (ImmutableExplanationOfBenefit_SupportingInfo) instance;
    }
    return ((ImmutableExplanationOfBenefit_SupportingInfo.Builder) ImmutableExplanationOfBenefit_SupportingInfo.builder())
        .valueBoolean(instance.valueBoolean())
        .valueReference(instance.valueReference())
        .id(instance.id())
        .reason(instance.reason())
        .sequence(instance.sequence())
        .valueString(instance.valueString())
        .valueAttachment(instance.valueAttachment())
        .timingPeriod(instance.timingPeriod())
        .timingDate(instance.timingDate())
        .extension(instance.extension())
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .code(instance.code())
        .valueQuantity(instance.valueQuantity())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_SupportingInfo ExplanationOfBenefit_SupportingInfo}.
   * <pre>
   * ImmutableExplanationOfBenefit_SupportingInfo.builder()
   *    .valueBoolean(Boolean) // optional {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean}
   *    .valueReference(com.medplum.types.fhir.Reference) // optional {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference}
   *    .id(String) // optional {@link ExplanationOfBenefit_SupportingInfo#id() id}
   *    .reason(com.medplum.types.fhir.Coding) // optional {@link ExplanationOfBenefit_SupportingInfo#reason() reason}
   *    .sequence(com.medplum.types.fhir.PositiveInt) // optional {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence}
   *    .valueString(String) // optional {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString}
   *    .valueAttachment(com.medplum.types.fhir.Attachment) // optional {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment}
   *    .timingPeriod(com.medplum.types.fhir.Period) // optional {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod}
   *    .timingDate(String) // optional {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SupportingInfo#extension() extension}
   *    .category(com.medplum.types.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_SupportingInfo#category() category}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension}
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_SupportingInfo#code() code}
   *    .valueQuantity(com.medplum.types.fhir.Quantity) // optional {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_SupportingInfo builder
   */
  public static CategoryBuildStage builder() {
    return new ImmutableExplanationOfBenefit_SupportingInfo.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_SupportingInfo ExplanationOfBenefit_SupportingInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CategoryBuildStage, BuildFinal {
    private static final long INIT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x1L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_REASON = 0x8L;
    private static final long OPT_BIT_SEQUENCE = 0x10L;
    private static final long OPT_BIT_VALUE_STRING = 0x20L;
    private static final long OPT_BIT_VALUE_ATTACHMENT = 0x40L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x80L;
    private static final long OPT_BIT_TIMING_DATE = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_CODE = 0x800L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Boolean valueBoolean;
    private @Nullable Reference valueReference;
    private @Nullable String id;
    private @Nullable Coding reason;
    private @Nullable PositiveInt sequence;
    private @Nullable String valueString;
    private @Nullable Attachment valueAttachment;
    private @Nullable Period timingPeriod;
    private @Nullable String timingDate;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept category;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept code;
    private @Nullable Quantity valueQuantity;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBoolean(boolean valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean;
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueBoolean")
    public final Builder valueBoolean(Optional<Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueReference(Reference valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = Objects.requireNonNull(valueReference, "valueReference");
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueReference")
    public final Builder valueReference(Optional<? extends Reference> valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = valueReference.orElse(null);
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(Coding reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<? extends Coding> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(PositiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<? extends PositiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueString")
    public final Builder valueString(Optional<String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAttachment(Attachment valueAttachment) {
      checkNotIsSet(valueAttachmentIsSet(), "valueAttachment");
      this.valueAttachment = Objects.requireNonNull(valueAttachment, "valueAttachment");
      optBits |= OPT_BIT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueAttachment")
    public final Builder valueAttachment(Optional<? extends Attachment> valueAttachment) {
      checkNotIsSet(valueAttachmentIsSet(), "valueAttachment");
      this.valueAttachment = valueAttachment.orElse(null);
      optBits |= OPT_BIT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingPeriod(Period timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = Objects.requireNonNull(timingPeriod, "timingPeriod");
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingPeriod")
    public final Builder timingPeriod(Optional<? extends Period> timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = timingPeriod.orElse(null);
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDate(String timingDate) {
      checkNotIsSet(timingDateIsSet(), "timingDate");
      this.timingDate = Objects.requireNonNull(timingDate, "timingDate");
      optBits |= OPT_BIT_TIMING_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingDate")
    public final Builder timingDate(Optional<String> timingDate) {
      checkNotIsSet(timingDateIsSet(), "timingDate");
      this.timingDate = timingDate.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#extension() extension} to extension.
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
     * Initializes the value for the {@link ExplanationOfBenefit_SupportingInfo#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueQuantity")
    public final Builder valueQuantity(Optional<? extends Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Builds a new {@link ExplanationOfBenefit_SupportingInfo ExplanationOfBenefit_SupportingInfo}.
     * @return An immutable instance of ExplanationOfBenefit_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_SupportingInfo build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_SupportingInfo(
          valueBoolean,
          valueReference,
          id,
          reason,
          sequence,
          valueString,
          valueAttachment,
          timingPeriod,
          timingDate,
          extension,
          category,
          modifierExtension,
          code,
          valueQuantity);
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueAttachmentIsSet() {
      return (optBits & OPT_BIT_VALUE_ATTACHMENT) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean timingDateIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean categoryIsSet() {
      return (initBits & INIT_BIT_CATEGORY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_SupportingInfo is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!categoryIsSet()) attributes.add("category");
      return "Cannot build ExplanationOfBenefit_SupportingInfo, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
  public interface CategoryBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_SupportingInfo#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(CodeableConcept category);
  }

  @Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueBoolean(boolean valueBoolean);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueBoolean(Optional<Boolean> valueBoolean);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueReference(Reference valueReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueReference(Optional<? extends Reference> valueReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(Coding reason);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(Optional<? extends Coding> reason);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueString(String valueString);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueString(Optional<String> valueString);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueAttachment(Attachment valueAttachment);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueAttachment(Optional<? extends Attachment> valueAttachment);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingPeriod(Period timingPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingPeriod(Optional<? extends Period> timingPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingDate(String timingDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingDate(Optional<String> timingDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueQuantity(Quantity valueQuantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueQuantity(Optional<? extends Quantity> valueQuantity);

    /**
     * Builds a new {@link ExplanationOfBenefit_SupportingInfo ExplanationOfBenefit_SupportingInfo}.
     * @return An immutable instance of ExplanationOfBenefit_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_SupportingInfo build();
  }
}
