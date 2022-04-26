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
 * Immutable implementation of {@link QuestionnaireResponse_Answer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaireResponse_Answer.builder()}.
 */
@Generated(from = "QuestionnaireResponse_Answer", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaireResponse_Answer
    implements QuestionnaireResponse_Answer {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<QuestionnaireResponse_Item> item;
  private final @Nullable Reference valueReference;
  private final @Nullable String valueString;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable String valueDateTime;
  private final @Nullable Attachment valueAttachment;
  private final @Nullable Coding valueCoding;
  private final @Nullable String valueTime;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Double valueDecimal;
  private final @Nullable String valueDate;
  private final @Nullable Double valueInteger;
  private final @Nullable String valueUri;
  private final @Nullable Boolean valueBoolean;

  private ImmutableQuestionnaireResponse_Answer(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<QuestionnaireResponse_Item> item,
      @Nullable Reference valueReference,
      @Nullable String valueString,
      @Nullable Quantity valueQuantity,
      @Nullable String valueDateTime,
      @Nullable Attachment valueAttachment,
      @Nullable Coding valueCoding,
      @Nullable String valueTime,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Double valueDecimal,
      @Nullable String valueDate,
      @Nullable Double valueInteger,
      @Nullable String valueUri,
      @Nullable Boolean valueBoolean) {
    this.modifierExtension = modifierExtension;
    this.item = item;
    this.valueReference = valueReference;
    this.valueString = valueString;
    this.valueQuantity = valueQuantity;
    this.valueDateTime = valueDateTime;
    this.valueAttachment = valueAttachment;
    this.valueCoding = valueCoding;
    this.valueTime = valueTime;
    this.extension = extension;
    this.id = id;
    this.valueDecimal = valueDecimal;
    this.valueDate = valueDate;
    this.valueInteger = valueInteger;
    this.valueUri = valueUri;
    this.valueBoolean = valueBoolean;
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
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Optional<List<QuestionnaireResponse_Item>> item() {
    return Optional.ofNullable(item);
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
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
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
   * @return The value of the {@code valueDateTime} attribute
   */
  @JsonProperty("valueDateTime")
  @Override
  public Optional<String> valueDateTime() {
    return Optional.ofNullable(valueDateTime);
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
   * @return The value of the {@code valueCoding} attribute
   */
  @JsonProperty("valueCoding")
  @Override
  public Optional<Coding> valueCoding() {
    return Optional.ofNullable(valueCoding);
  }

  /**
   * @return The value of the {@code valueTime} attribute
   */
  @JsonProperty("valueTime")
  @Override
  public Optional<String> valueTime() {
    return Optional.ofNullable(valueTime);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code valueDecimal} attribute
   */
  @JsonProperty("valueDecimal")
  @Override
  public Optional<Double> valueDecimal() {
    return Optional.ofNullable(valueDecimal);
  }

  /**
   * @return The value of the {@code valueDate} attribute
   */
  @JsonProperty("valueDate")
  @Override
  public Optional<String> valueDate() {
    return Optional.ofNullable(valueDate);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @JsonProperty("valueInteger")
  @Override
  public Optional<Double> valueInteger() {
    return Optional.ofNullable(valueInteger);
  }

  /**
   * @return The value of the {@code valueUri} attribute
   */
  @JsonProperty("valueUri")
  @Override
  public Optional<String> valueUri() {
    return Optional.ofNullable(valueUri);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        newValue,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Answer withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        value,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withItem(List<QuestionnaireResponse_Item> value) {
    @Nullable List<QuestionnaireResponse_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        newValue,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Answer withItem(Optional<? extends List<QuestionnaireResponse_Item>> optional) {
    @Nullable List<QuestionnaireResponse_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        value,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        newValue,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Answer withValueReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        value,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        newValue,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        value,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        newValue,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Answer withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        value,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDateTime");
    if (Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        newValue,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        value,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueAttachment() valueAttachment} attribute.
   * @param value The value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "valueAttachment");
    if (this.valueAttachment == newValue) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        newValue,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueAttachment() valueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Answer withValueAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.valueAttachment == value) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        value,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueCoding() valueCoding} attribute.
   * @param value The value for valueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "valueCoding");
    if (this.valueCoding == newValue) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        newValue,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueCoding() valueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Answer withValueCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.valueCoding == value) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        value,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueTime() valueTime} attribute.
   * @param value The value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueTime");
    if (Objects.equals(this.valueTime, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        newValue,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueTime() valueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueTime, value)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        value,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        newValue,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse_Answer withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        value,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        newValue,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        value,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        newValue,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        value,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueDate() valueDate} attribute.
   * @param value The value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDate");
    if (Objects.equals(this.valueDate, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        newValue,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueDate() valueDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDate, value)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        value,
        this.valueInteger,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        newValue,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        value,
        this.valueUri,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueUri() valueUri} attribute.
   * @param value The value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUri");
    if (Objects.equals(this.valueUri, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        newValue,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueUri() valueUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUri, value)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        value,
        this.valueBoolean);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse_Answer#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse_Answer#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse_Answer withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableQuestionnaireResponse_Answer(
        this.modifierExtension,
        this.item,
        this.valueReference,
        this.valueString,
        this.valueQuantity,
        this.valueDateTime,
        this.valueAttachment,
        this.valueCoding,
        this.valueTime,
        this.extension,
        this.id,
        this.valueDecimal,
        this.valueDate,
        this.valueInteger,
        this.valueUri,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaireResponse_Answer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaireResponse_Answer
        && equalTo((ImmutableQuestionnaireResponse_Answer) another);
  }

  private boolean equalTo(ImmutableQuestionnaireResponse_Answer another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(item, another.item)
        && Objects.equals(valueReference, another.valueReference)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(valueDateTime, another.valueDateTime)
        && Objects.equals(valueAttachment, another.valueAttachment)
        && Objects.equals(valueCoding, another.valueCoding)
        && Objects.equals(valueTime, another.valueTime)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(valueDecimal, another.valueDecimal)
        && Objects.equals(valueDate, another.valueDate)
        && Objects.equals(valueInteger, another.valueInteger)
        && Objects.equals(valueUri, another.valueUri)
        && Objects.equals(valueBoolean, another.valueBoolean);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code item}, {@code valueReference}, {@code valueString}, {@code valueQuantity}, {@code valueDateTime}, {@code valueAttachment}, {@code valueCoding}, {@code valueTime}, {@code extension}, {@code id}, {@code valueDecimal}, {@code valueDate}, {@code valueInteger}, {@code valueUri}, {@code valueBoolean}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(valueReference);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(valueDateTime);
    h += (h << 5) + Objects.hashCode(valueAttachment);
    h += (h << 5) + Objects.hashCode(valueCoding);
    h += (h << 5) + Objects.hashCode(valueTime);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(valueDecimal);
    h += (h << 5) + Objects.hashCode(valueDate);
    h += (h << 5) + Objects.hashCode(valueInteger);
    h += (h << 5) + Objects.hashCode(valueUri);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    return h;
  }

  /**
   * Prints the immutable value {@code QuestionnaireResponse_Answer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("QuestionnaireResponse_Answer{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (item != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (valueReference != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (valueString != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueQuantity != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (valueDateTime != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (valueAttachment != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueAttachment=").append(valueAttachment);
    }
    if (valueCoding != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueCoding=").append(valueCoding);
    }
    if (valueTime != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueTime=").append(valueTime);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueDecimal != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (valueDate != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueDate=").append(valueDate);
    }
    if (valueInteger != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (valueUri != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueUri=").append(valueUri);
    }
    if (valueBoolean != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "QuestionnaireResponse_Answer", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements QuestionnaireResponse_Answer {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<QuestionnaireResponse_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<Reference> valueReference = Optional.empty();
    boolean valueReferenceIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<String> valueDateTime = Optional.empty();
    boolean valueDateTimeIsSet;
    @Nullable Optional<Attachment> valueAttachment = Optional.empty();
    boolean valueAttachmentIsSet;
    @Nullable Optional<Coding> valueCoding = Optional.empty();
    boolean valueCodingIsSet;
    @Nullable Optional<String> valueTime = Optional.empty();
    boolean valueTimeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Double> valueDecimal = Optional.empty();
    boolean valueDecimalIsSet;
    @Nullable Optional<String> valueDate = Optional.empty();
    boolean valueDateIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @Nullable Optional<String> valueUri = Optional.empty();
    boolean valueUriIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<QuestionnaireResponse_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("valueReference")
    public void setValueReference(Optional<Reference> valueReference) {
      this.valueReference = valueReference;
      this.valueReferenceIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("valueDateTime")
    public void setValueDateTime(Optional<String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @JsonProperty("valueAttachment")
    public void setValueAttachment(Optional<Attachment> valueAttachment) {
      this.valueAttachment = valueAttachment;
      this.valueAttachmentIsSet = true;
    }
    @JsonProperty("valueCoding")
    public void setValueCoding(Optional<Coding> valueCoding) {
      this.valueCoding = valueCoding;
      this.valueCodingIsSet = true;
    }
    @JsonProperty("valueTime")
    public void setValueTime(Optional<String> valueTime) {
      this.valueTime = valueTime;
      this.valueTimeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Optional<Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @JsonProperty("valueDate")
    public void setValueDate(Optional<String> valueDate) {
      this.valueDate = valueDate;
      this.valueDateIsSet = true;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @JsonProperty("valueUri")
    public void setValueUri(Optional<String> valueUri) {
      this.valueUri = valueUri;
      this.valueUriIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<QuestionnaireResponse_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> valueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> valueCoding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaireResponse_Answer fromJson(Json json) {
    ImmutableQuestionnaireResponse_Answer.Builder builder = ImmutableQuestionnaireResponse_Answer.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.valueAttachmentIsSet) {
      builder.valueAttachment(json.valueAttachment);
    }
    if (json.valueCodingIsSet) {
      builder.valueCoding(json.valueCoding);
    }
    if (json.valueTimeIsSet) {
      builder.valueTime(json.valueTime);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.valueDateIsSet) {
      builder.valueDate(json.valueDate);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.valueUriIsSet) {
      builder.valueUri(json.valueUri);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    return (ImmutableQuestionnaireResponse_Answer) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link QuestionnaireResponse_Answer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable QuestionnaireResponse_Answer instance
   */
  public static QuestionnaireResponse_Answer copyOf(QuestionnaireResponse_Answer instance) {
    if (instance instanceof ImmutableQuestionnaireResponse_Answer) {
      return (ImmutableQuestionnaireResponse_Answer) instance;
    }
    return ImmutableQuestionnaireResponse_Answer.builder()
        .modifierExtension(instance.modifierExtension())
        .item(instance.item())
        .valueReference(instance.valueReference())
        .valueString(instance.valueString())
        .valueQuantity(instance.valueQuantity())
        .valueDateTime(instance.valueDateTime())
        .valueAttachment(instance.valueAttachment())
        .valueCoding(instance.valueCoding())
        .valueTime(instance.valueTime())
        .extension(instance.extension())
        .id(instance.id())
        .valueDecimal(instance.valueDecimal())
        .valueDate(instance.valueDate())
        .valueInteger(instance.valueInteger())
        .valueUri(instance.valueUri())
        .valueBoolean(instance.valueBoolean())
        .build();
  }

  /**
   * Creates a builder for {@link QuestionnaireResponse_Answer QuestionnaireResponse_Answer}.
   * <pre>
   * ImmutableQuestionnaireResponse_Answer.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse_Answer#modifierExtension() modifierExtension}
   *    .item(List&amp;lt;com.medplum.types.fhir.QuestionnaireResponse_Item&amp;gt;) // optional {@link QuestionnaireResponse_Answer#item() item}
   *    .valueReference(com.medplum.types.fhir.Reference) // optional {@link QuestionnaireResponse_Answer#valueReference() valueReference}
   *    .valueString(String) // optional {@link QuestionnaireResponse_Answer#valueString() valueString}
   *    .valueQuantity(com.medplum.types.fhir.Quantity) // optional {@link QuestionnaireResponse_Answer#valueQuantity() valueQuantity}
   *    .valueDateTime(String) // optional {@link QuestionnaireResponse_Answer#valueDateTime() valueDateTime}
   *    .valueAttachment(com.medplum.types.fhir.Attachment) // optional {@link QuestionnaireResponse_Answer#valueAttachment() valueAttachment}
   *    .valueCoding(com.medplum.types.fhir.Coding) // optional {@link QuestionnaireResponse_Answer#valueCoding() valueCoding}
   *    .valueTime(String) // optional {@link QuestionnaireResponse_Answer#valueTime() valueTime}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse_Answer#extension() extension}
   *    .id(String) // optional {@link QuestionnaireResponse_Answer#id() id}
   *    .valueDecimal(Double) // optional {@link QuestionnaireResponse_Answer#valueDecimal() valueDecimal}
   *    .valueDate(String) // optional {@link QuestionnaireResponse_Answer#valueDate() valueDate}
   *    .valueInteger(Double) // optional {@link QuestionnaireResponse_Answer#valueInteger() valueInteger}
   *    .valueUri(String) // optional {@link QuestionnaireResponse_Answer#valueUri() valueUri}
   *    .valueBoolean(Boolean) // optional {@link QuestionnaireResponse_Answer#valueBoolean() valueBoolean}
   *    .build();
   * </pre>
   * @return A new QuestionnaireResponse_Answer builder
   */
  public static ImmutableQuestionnaireResponse_Answer.Builder builder() {
    return new ImmutableQuestionnaireResponse_Answer.Builder();
  }

  /**
   * Builds instances of type {@link QuestionnaireResponse_Answer QuestionnaireResponse_Answer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "QuestionnaireResponse_Answer", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ITEM = 0x2L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x4L;
    private static final long OPT_BIT_VALUE_STRING = 0x8L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x10L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x20L;
    private static final long OPT_BIT_VALUE_ATTACHMENT = 0x40L;
    private static final long OPT_BIT_VALUE_CODING = 0x80L;
    private static final long OPT_BIT_VALUE_TIME = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x800L;
    private static final long OPT_BIT_VALUE_DATE = 0x1000L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x2000L;
    private static final long OPT_BIT_VALUE_URI = 0x4000L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x8000L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<QuestionnaireResponse_Item> item;
    private @Nullable Reference valueReference;
    private @Nullable String valueString;
    private @Nullable Quantity valueQuantity;
    private @Nullable String valueDateTime;
    private @Nullable Attachment valueAttachment;
    private @Nullable Coding valueCoding;
    private @Nullable String valueTime;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Double valueDecimal;
    private @Nullable String valueDate;
    private @Nullable Double valueInteger;
    private @Nullable String valueUri;
    private @Nullable Boolean valueBoolean;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(List<QuestionnaireResponse_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Optional<? extends List<QuestionnaireResponse_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueReference() valueReference} to valueReference.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueReference() valueReference} to valueReference.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDateTime(String valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = Objects.requireNonNull(valueDateTime, "valueDateTime");
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDateTime")
    public final Builder valueDateTime(Optional<String> valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = valueDateTime.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueAttachment() valueAttachment} to valueAttachment.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueAttachment() valueAttachment} to valueAttachment.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCoding(Coding valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = Objects.requireNonNull(valueCoding, "valueCoding");
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCoding")
    public final Builder valueCoding(Optional<? extends Coding> valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = valueCoding.orElse(null);
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTime(String valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = Objects.requireNonNull(valueTime, "valueTime");
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueTime")
    public final Builder valueTime(Optional<String> valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = valueTime.orElse(null);
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#extension() extension} to extension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#extension() extension} to extension.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#id() id} to id.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#id() id} to id.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDecimal(double valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal;
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDecimal")
    public final Builder valueDecimal(Optional<Double> valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal.orElse(null);
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDate(String valueDate) {
      checkNotIsSet(valueDateIsSet(), "valueDate");
      this.valueDate = Objects.requireNonNull(valueDate, "valueDate");
      optBits |= OPT_BIT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDate")
    public final Builder valueDate(Optional<String> valueDate) {
      checkNotIsSet(valueDateIsSet(), "valueDate");
      this.valueDate = valueDate.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueInteger(double valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger;
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueInteger")
    public final Builder valueInteger(Optional<Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUri(String valueUri) {
      checkNotIsSet(valueUriIsSet(), "valueUri");
      this.valueUri = Objects.requireNonNull(valueUri, "valueUri");
      optBits |= OPT_BIT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueUri")
    public final Builder valueUri(Optional<String> valueUri) {
      checkNotIsSet(valueUriIsSet(), "valueUri");
      this.valueUri = valueUri.orElse(null);
      optBits |= OPT_BIT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link QuestionnaireResponse_Answer#valueBoolean() valueBoolean} to valueBoolean.
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
     * Builds a new {@link QuestionnaireResponse_Answer QuestionnaireResponse_Answer}.
     * @return An immutable instance of QuestionnaireResponse_Answer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public QuestionnaireResponse_Answer build() {
      return new ImmutableQuestionnaireResponse_Answer(
          modifierExtension,
          item,
          valueReference,
          valueString,
          valueQuantity,
          valueDateTime,
          valueAttachment,
          valueCoding,
          valueTime,
          extension,
          id,
          valueDecimal,
          valueDate,
          valueInteger,
          valueUri,
          valueBoolean);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean valueAttachmentIsSet() {
      return (optBits & OPT_BIT_VALUE_ATTACHMENT) != 0;
    }

    private boolean valueCodingIsSet() {
      return (optBits & OPT_BIT_VALUE_CODING) != 0;
    }

    private boolean valueTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_TIME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean valueDateIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean valueUriIsSet() {
      return (optBits & OPT_BIT_VALUE_URI) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of QuestionnaireResponse_Answer is strict, attribute is already set: ".concat(name));
    }
  }
}