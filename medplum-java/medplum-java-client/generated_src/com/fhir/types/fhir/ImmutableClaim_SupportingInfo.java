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
 * Immutable implementation of {@link Claim_SupportingInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_SupportingInfo.builder()}.
 */
@Generated(from = "Claim_SupportingInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_SupportingInfo implements Claim_SupportingInfo {
  private final @Nullable Attachment valueAttachment;
  private final @Nullable String id;
  private final @Nullable String timingDate;
  private final @Nullable Reference valueReference;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable String valueString;
  private final @Nullable CodeableConcept reason;
  private final @Nullable List<Extension> modifierExtension;
  private final CodeableConcept category;
  private final @Nullable PositiveInt sequence;
  private final @Nullable CodeableConcept code;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable List<Extension> extension;
  private final @Nullable Period timingPeriod;

  private ImmutableClaim_SupportingInfo(
      @Nullable Attachment valueAttachment,
      @Nullable String id,
      @Nullable String timingDate,
      @Nullable Reference valueReference,
      @Nullable Quantity valueQuantity,
      @Nullable String valueString,
      @Nullable CodeableConcept reason,
      @Nullable List<Extension> modifierExtension,
      CodeableConcept category,
      @Nullable PositiveInt sequence,
      @Nullable CodeableConcept code,
      @Nullable Boolean valueBoolean,
      @Nullable List<Extension> extension,
      @Nullable Period timingPeriod) {
    this.valueAttachment = valueAttachment;
    this.id = id;
    this.timingDate = timingDate;
    this.valueReference = valueReference;
    this.valueQuantity = valueQuantity;
    this.valueString = valueString;
    this.reason = reason;
    this.modifierExtension = modifierExtension;
    this.category = category;
    this.sequence = sequence;
    this.code = code;
    this.valueBoolean = valueBoolean;
    this.extension = extension;
    this.timingPeriod = timingPeriod;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code valueReference} attribute
   */
  @JsonProperty("valueReference")
  @Override
  public Optional<Reference> valueReference() {
    return Optional.ofNullable(valueReference);
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
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<CodeableConcept> reason() {
    return Optional.ofNullable(reason);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public CodeableConcept category() {
    return category;
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#valueAttachment() valueAttachment} attribute.
   * @param value The value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withValueAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "valueAttachment");
    if (this.valueAttachment == newValue) return this;
    return new ImmutableClaim_SupportingInfo(
        newValue,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#valueAttachment() valueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SupportingInfo withValueAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.valueAttachment == value) return this;
    return new ImmutableClaim_SupportingInfo(
        value,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        newValue,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        value,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#timingDate() timingDate} attribute.
   * @param value The value for timingDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withTimingDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timingDate");
    if (Objects.equals(this.timingDate, newValue)) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        newValue,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#timingDate() timingDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withTimingDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timingDate, value)) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        value,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withValueReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        newValue,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SupportingInfo withValueReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        value,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        newValue,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SupportingInfo withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        value,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        newValue,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        value,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        newValue,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SupportingInfo withReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        value,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        newValue,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SupportingInfo withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        value,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim_SupportingInfo#category() category} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withCategory(CodeableConcept value) {
    if (this.category == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "category");
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        newValue,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        newValue,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SupportingInfo withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        value,
        this.code,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        newValue,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SupportingInfo withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        value,
        this.valueBoolean,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        newValue,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        value,
        this.extension,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        newValue,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SupportingInfo withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        value,
        this.timingPeriod);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SupportingInfo#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SupportingInfo withTimingPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SupportingInfo#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SupportingInfo withTimingPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutableClaim_SupportingInfo(
        this.valueAttachment,
        this.id,
        this.timingDate,
        this.valueReference,
        this.valueQuantity,
        this.valueString,
        this.reason,
        this.modifierExtension,
        this.category,
        this.sequence,
        this.code,
        this.valueBoolean,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_SupportingInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_SupportingInfo
        && equalTo((ImmutableClaim_SupportingInfo) another);
  }

  private boolean equalTo(ImmutableClaim_SupportingInfo another) {
    return Objects.equals(valueAttachment, another.valueAttachment)
        && Objects.equals(id, another.id)
        && Objects.equals(timingDate, another.timingDate)
        && Objects.equals(valueReference, another.valueReference)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(reason, another.reason)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && category.equals(another.category)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(code, another.code)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(extension, another.extension)
        && Objects.equals(timingPeriod, another.timingPeriod);
  }

  /**
   * Computes a hash code from attributes: {@code valueAttachment}, {@code id}, {@code timingDate}, {@code valueReference}, {@code valueQuantity}, {@code valueString}, {@code reason}, {@code modifierExtension}, {@code category}, {@code sequence}, {@code code}, {@code valueBoolean}, {@code extension}, {@code timingPeriod}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueAttachment);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(timingDate);
    h += (h << 5) + Objects.hashCode(valueReference);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + category.hashCode();
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(timingPeriod);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_SupportingInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Claim_SupportingInfo{");
    if (valueAttachment != null) {
      builder.append("valueAttachment=").append(valueAttachment);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (timingDate != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("timingDate=").append(timingDate);
    }
    if (valueReference != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (valueQuantity != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (valueString != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (reason != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("category=").append(category);
    if (sequence != null) {
      builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (valueBoolean != null) {
      builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (timingPeriod != null) {
      builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Claim_SupportingInfo", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Claim_SupportingInfo {
    @Nullable Optional<Attachment> valueAttachment = Optional.empty();
    boolean valueAttachmentIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> timingDate = Optional.empty();
    boolean timingDateIsSet;
    @Nullable Optional<Reference> valueReference = Optional.empty();
    boolean valueReferenceIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<CodeableConcept> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable CodeableConcept category;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Period> timingPeriod = Optional.empty();
    boolean timingPeriodIsSet;
    @JsonProperty("valueAttachment")
    public void setValueAttachment(Optional<Attachment> valueAttachment) {
      this.valueAttachment = valueAttachment;
      this.valueAttachmentIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("timingDate")
    public void setTimingDate(Optional<String> timingDate) {
      this.timingDate = timingDate;
      this.timingDateIsSet = true;
    }
    @JsonProperty("valueReference")
    public void setValueReference(Optional<Reference> valueReference) {
      this.valueReference = valueReference;
      this.valueReferenceIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<CodeableConcept> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(CodeableConcept category) {
      this.category = category;
    }
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Optional<Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @Override
    public Optional<Attachment> valueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timingDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> timingPeriod() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaim_SupportingInfo fromJson(Json json) {
    ImmutableClaim_SupportingInfo.Builder builder = ((ImmutableClaim_SupportingInfo.Builder) ImmutableClaim_SupportingInfo.builder());
    if (json.valueAttachmentIsSet) {
      builder.valueAttachment(json.valueAttachment);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.timingDateIsSet) {
      builder.timingDate(json.timingDate);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    return (ImmutableClaim_SupportingInfo) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim_SupportingInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim_SupportingInfo instance
   */
  public static Claim_SupportingInfo copyOf(Claim_SupportingInfo instance) {
    if (instance instanceof ImmutableClaim_SupportingInfo) {
      return (ImmutableClaim_SupportingInfo) instance;
    }
    return ((ImmutableClaim_SupportingInfo.Builder) ImmutableClaim_SupportingInfo.builder())
        .valueAttachment(instance.valueAttachment())
        .id(instance.id())
        .timingDate(instance.timingDate())
        .valueReference(instance.valueReference())
        .valueQuantity(instance.valueQuantity())
        .valueString(instance.valueString())
        .reason(instance.reason())
        .modifierExtension(instance.modifierExtension())
        .category(instance.category())
        .sequence(instance.sequence())
        .code(instance.code())
        .valueBoolean(instance.valueBoolean())
        .extension(instance.extension())
        .timingPeriod(instance.timingPeriod())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_SupportingInfo Claim_SupportingInfo}.
   * <pre>
   * ImmutableClaim_SupportingInfo.builder()
   *    .valueAttachment(com.fhir.types.fhir.Attachment) // optional {@link Claim_SupportingInfo#valueAttachment() valueAttachment}
   *    .id(String) // optional {@link Claim_SupportingInfo#id() id}
   *    .timingDate(String) // optional {@link Claim_SupportingInfo#timingDate() timingDate}
   *    .valueReference(com.fhir.types.fhir.Reference) // optional {@link Claim_SupportingInfo#valueReference() valueReference}
   *    .valueQuantity(com.fhir.types.fhir.Quantity) // optional {@link Claim_SupportingInfo#valueQuantity() valueQuantity}
   *    .valueString(String) // optional {@link Claim_SupportingInfo#valueString() valueString}
   *    .reason(com.fhir.types.fhir.CodeableConcept) // optional {@link Claim_SupportingInfo#reason() reason}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Claim_SupportingInfo#modifierExtension() modifierExtension}
   *    .category(com.fhir.types.fhir.CodeableConcept) // required {@link Claim_SupportingInfo#category() category}
   *    .sequence(com.fhir.types.fhir.PositiveInt) // optional {@link Claim_SupportingInfo#sequence() sequence}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Claim_SupportingInfo#code() code}
   *    .valueBoolean(Boolean) // optional {@link Claim_SupportingInfo#valueBoolean() valueBoolean}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Claim_SupportingInfo#extension() extension}
   *    .timingPeriod(com.fhir.types.fhir.Period) // optional {@link Claim_SupportingInfo#timingPeriod() timingPeriod}
   *    .build();
   * </pre>
   * @return A new Claim_SupportingInfo builder
   */
  public static CategoryBuildStage builder() {
    return new ImmutableClaim_SupportingInfo.Builder();
  }

  /**
   * Builds instances of type {@link Claim_SupportingInfo Claim_SupportingInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Claim_SupportingInfo", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CategoryBuildStage, BuildFinal {
    private static final long INIT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_VALUE_ATTACHMENT = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_TIMING_DATE = 0x4L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x8L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x10L;
    private static final long OPT_BIT_VALUE_STRING = 0x20L;
    private static final long OPT_BIT_REASON = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_SEQUENCE = 0x100L;
    private static final long OPT_BIT_CODE = 0x200L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Attachment valueAttachment;
    private @Nullable String id;
    private @Nullable String timingDate;
    private @Nullable Reference valueReference;
    private @Nullable Quantity valueQuantity;
    private @Nullable String valueString;
    private @Nullable CodeableConcept reason;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept category;
    private @Nullable PositiveInt sequence;
    private @Nullable CodeableConcept code;
    private @Nullable Boolean valueBoolean;
    private @Nullable List<Extension> extension;
    private @Nullable Period timingPeriod;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
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
     * Initializes the optional value {@link Claim_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
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
     * Initializes the optional value {@link Claim_SupportingInfo#id() id} to id.
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
     * Initializes the optional value {@link Claim_SupportingInfo#id() id} to id.
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
     * Initializes the optional value {@link Claim_SupportingInfo#timingDate() timingDate} to timingDate.
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
     * Initializes the optional value {@link Claim_SupportingInfo#timingDate() timingDate} to timingDate.
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
     * Initializes the optional value {@link Claim_SupportingInfo#valueReference() valueReference} to valueReference.
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
     * Initializes the optional value {@link Claim_SupportingInfo#valueReference() valueReference} to valueReference.
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
     * Initializes the optional value {@link Claim_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link Claim_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link Claim_SupportingInfo#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link Claim_SupportingInfo#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link Claim_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(CodeableConcept reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<? extends CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link Claim_SupportingInfo#category() category} attribute.
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
     * Initializes the optional value {@link Claim_SupportingInfo#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link Claim_SupportingInfo#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link Claim_SupportingInfo#code() code} to code.
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
     * Initializes the optional value {@link Claim_SupportingInfo#code() code} to code.
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
     * Initializes the optional value {@link Claim_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link Claim_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link Claim_SupportingInfo#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_SupportingInfo#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
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
     * Initializes the optional value {@link Claim_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
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
     * Builds a new {@link Claim_SupportingInfo Claim_SupportingInfo}.
     * @return An immutable instance of Claim_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Claim_SupportingInfo build() {
      checkRequiredAttributes();
      return new ImmutableClaim_SupportingInfo(
          valueAttachment,
          id,
          timingDate,
          valueReference,
          valueQuantity,
          valueString,
          reason,
          modifierExtension,
          category,
          sequence,
          code,
          valueBoolean,
          extension,
          timingPeriod);
    }

    private boolean valueAttachmentIsSet() {
      return (optBits & OPT_BIT_VALUE_ATTACHMENT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean timingDateIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean categoryIsSet() {
      return (initBits & INIT_BIT_CATEGORY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Claim_SupportingInfo is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!categoryIsSet()) attributes.add("category");
      return "Cannot build Claim_SupportingInfo, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Claim_SupportingInfo", generator = "Immutables")
  public interface CategoryBuildStage {
    /**
     * Initializes the value for the {@link Claim_SupportingInfo#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(CodeableConcept category);
  }

  @Generated(from = "Claim_SupportingInfo", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueAttachment(Attachment valueAttachment);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueAttachment(Optional<? extends Attachment> valueAttachment);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingDate(String timingDate);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingDate(Optional<String> timingDate);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueReference(Reference valueReference);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueReference(Optional<? extends Reference> valueReference);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueQuantity(Quantity valueQuantity);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueQuantity(Optional<? extends Quantity> valueQuantity);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueString(String valueString);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueString(Optional<String> valueString);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(CodeableConcept reason);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(Optional<? extends CodeableConcept> reason);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueBoolean(boolean valueBoolean);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueBoolean(Optional<Boolean> valueBoolean);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingPeriod(Period timingPeriod);

    /**
     * Initializes the optional value {@link Claim_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingPeriod(Optional<? extends Period> timingPeriod);

    /**
     * Builds a new {@link Claim_SupportingInfo Claim_SupportingInfo}.
     * @return An immutable instance of Claim_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim_SupportingInfo build();
  }
}
