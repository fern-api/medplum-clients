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
 * Immutable implementation of {@link Questionnaire_EnableWhen}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaire_EnableWhen.builder()}.
 */
@Generated(from = "Questionnaire_EnableWhen", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaire_EnableWhen implements Questionnaire_EnableWhen {
  private final @Nullable String answerDate;
  private final @Nullable Coding answerCoding;
  private final @Nullable String question;
  private final @Nullable String answerString;
  private final @Nullable Questionnaire_enablewhenOperator operator;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String answerTime;
  private final @Nullable List<Extension> extension;
  private final @Nullable String answerDateTime;
  private final @Nullable Double answerInteger;
  private final @Nullable Quantity answerQuantity;
  private final @Nullable Boolean answerBoolean;
  private final @Nullable Double answerDecimal;
  private final @Nullable Reference answerReference;

  private ImmutableQuestionnaire_EnableWhen(
      @Nullable String answerDate,
      @Nullable Coding answerCoding,
      @Nullable String question,
      @Nullable String answerString,
      @Nullable Questionnaire_enablewhenOperator operator,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable String answerTime,
      @Nullable List<Extension> extension,
      @Nullable String answerDateTime,
      @Nullable Double answerInteger,
      @Nullable Quantity answerQuantity,
      @Nullable Boolean answerBoolean,
      @Nullable Double answerDecimal,
      @Nullable Reference answerReference) {
    this.answerDate = answerDate;
    this.answerCoding = answerCoding;
    this.question = question;
    this.answerString = answerString;
    this.operator = operator;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.answerTime = answerTime;
    this.extension = extension;
    this.answerDateTime = answerDateTime;
    this.answerInteger = answerInteger;
    this.answerQuantity = answerQuantity;
    this.answerBoolean = answerBoolean;
    this.answerDecimal = answerDecimal;
    this.answerReference = answerReference;
  }

  /**
   * @return The value of the {@code answerDate} attribute
   */
  @JsonProperty("answerDate")
  @Override
  public Optional<String> answerDate() {
    return Optional.ofNullable(answerDate);
  }

  /**
   * @return The value of the {@code answerCoding} attribute
   */
  @JsonProperty("answerCoding")
  @Override
  public Optional<Coding> answerCoding() {
    return Optional.ofNullable(answerCoding);
  }

  /**
   * @return The value of the {@code question} attribute
   */
  @JsonProperty("question")
  @Override
  public Optional<String> question() {
    return Optional.ofNullable(question);
  }

  /**
   * @return The value of the {@code answerString} attribute
   */
  @JsonProperty("answerString")
  @Override
  public Optional<String> answerString() {
    return Optional.ofNullable(answerString);
  }

  /**
   * @return The value of the {@code operator} attribute
   */
  @JsonProperty("operator")
  @Override
  public Optional<Questionnaire_enablewhenOperator> operator() {
    return Optional.ofNullable(operator);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code answerTime} attribute
   */
  @JsonProperty("answerTime")
  @Override
  public Optional<String> answerTime() {
    return Optional.ofNullable(answerTime);
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
   * @return The value of the {@code answerDateTime} attribute
   */
  @JsonProperty("answerDateTime")
  @Override
  public Optional<String> answerDateTime() {
    return Optional.ofNullable(answerDateTime);
  }

  /**
   * @return The value of the {@code answerInteger} attribute
   */
  @JsonProperty("answerInteger")
  @Override
  public Optional<Double> answerInteger() {
    return Optional.ofNullable(answerInteger);
  }

  /**
   * @return The value of the {@code answerQuantity} attribute
   */
  @JsonProperty("answerQuantity")
  @Override
  public Optional<Quantity> answerQuantity() {
    return Optional.ofNullable(answerQuantity);
  }

  /**
   * @return The value of the {@code answerBoolean} attribute
   */
  @JsonProperty("answerBoolean")
  @Override
  public Optional<Boolean> answerBoolean() {
    return Optional.ofNullable(answerBoolean);
  }

  /**
   * @return The value of the {@code answerDecimal} attribute
   */
  @JsonProperty("answerDecimal")
  @Override
  public Optional<Double> answerDecimal() {
    return Optional.ofNullable(answerDecimal);
  }

  /**
   * @return The value of the {@code answerReference} attribute
   */
  @JsonProperty("answerReference")
  @Override
  public Optional<Reference> answerReference() {
    return Optional.ofNullable(answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerDate() answerDate} attribute.
   * @param value The value for answerDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "answerDate");
    if (Objects.equals(this.answerDate, newValue)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        newValue,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerDate() answerDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.answerDate, value)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        value,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerCoding() answerCoding} attribute.
   * @param value The value for answerCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "answerCoding");
    if (this.answerCoding == newValue) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        newValue,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerCoding() answerCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_EnableWhen withAnswerCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.answerCoding == value) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        value,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#question() question} attribute.
   * @param value The value for question
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withQuestion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "question");
    if (Objects.equals(this.question, newValue)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        newValue,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#question() question} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for question
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withQuestion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.question, value)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        value,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerString() answerString} attribute.
   * @param value The value for answerString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "answerString");
    if (Objects.equals(this.answerString, newValue)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        newValue,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerString() answerString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.answerString, value)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        value,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#operator() operator} attribute.
   * @param value The value for operator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withOperator(Questionnaire_enablewhenOperator value) {
    @Nullable Questionnaire_enablewhenOperator newValue = Objects.requireNonNull(value, "operator");
    if (this.operator == newValue) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        newValue,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#operator() operator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_EnableWhen withOperator(Optional<? extends Questionnaire_enablewhenOperator> optional) {
    @Nullable Questionnaire_enablewhenOperator value = optional.orElse(null);
    if (this.operator == value) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        value,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        newValue,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        value,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        newValue,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_EnableWhen withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        value,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerTime() answerTime} attribute.
   * @param value The value for answerTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "answerTime");
    if (Objects.equals(this.answerTime, newValue)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        newValue,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerTime() answerTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.answerTime, value)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        value,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        newValue,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_EnableWhen withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        value,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerDateTime() answerDateTime} attribute.
   * @param value The value for answerDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "answerDateTime");
    if (Objects.equals(this.answerDateTime, newValue)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        newValue,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerDateTime() answerDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.answerDateTime, value)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        value,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerInteger() answerInteger} attribute.
   * @param value The value for answerInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.answerInteger, newValue)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        newValue,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerInteger() answerInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.answerInteger, value)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        value,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerQuantity() answerQuantity} attribute.
   * @param value The value for answerQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "answerQuantity");
    if (this.answerQuantity == newValue) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        newValue,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerQuantity() answerQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_EnableWhen withAnswerQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.answerQuantity == value) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        value,
        this.answerBoolean,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerBoolean() answerBoolean} attribute.
   * @param value The value for answerBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.answerBoolean, newValue)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        newValue,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerBoolean() answerBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.answerBoolean, value)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        value,
        this.answerDecimal,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerDecimal() answerDecimal} attribute.
   * @param value The value for answerDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.answerDecimal, newValue)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        newValue,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerDecimal() answerDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.answerDecimal, value)) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        value,
        this.answerReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_EnableWhen#answerReference() answerReference} attribute.
   * @param value The value for answerReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_EnableWhen withAnswerReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "answerReference");
    if (this.answerReference == newValue) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_EnableWhen#answerReference() answerReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_EnableWhen withAnswerReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.answerReference == value) return this;
    return new ImmutableQuestionnaire_EnableWhen(
        this.answerDate,
        this.answerCoding,
        this.question,
        this.answerString,
        this.operator,
        this.id,
        this.modifierExtension,
        this.answerTime,
        this.extension,
        this.answerDateTime,
        this.answerInteger,
        this.answerQuantity,
        this.answerBoolean,
        this.answerDecimal,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaire_EnableWhen} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaire_EnableWhen
        && equalTo((ImmutableQuestionnaire_EnableWhen) another);
  }

  private boolean equalTo(ImmutableQuestionnaire_EnableWhen another) {
    return Objects.equals(answerDate, another.answerDate)
        && Objects.equals(answerCoding, another.answerCoding)
        && Objects.equals(question, another.question)
        && Objects.equals(answerString, another.answerString)
        && Objects.equals(operator, another.operator)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(answerTime, another.answerTime)
        && Objects.equals(extension, another.extension)
        && Objects.equals(answerDateTime, another.answerDateTime)
        && Objects.equals(answerInteger, another.answerInteger)
        && Objects.equals(answerQuantity, another.answerQuantity)
        && Objects.equals(answerBoolean, another.answerBoolean)
        && Objects.equals(answerDecimal, another.answerDecimal)
        && Objects.equals(answerReference, another.answerReference);
  }

  /**
   * Computes a hash code from attributes: {@code answerDate}, {@code answerCoding}, {@code question}, {@code answerString}, {@code operator}, {@code id}, {@code modifierExtension}, {@code answerTime}, {@code extension}, {@code answerDateTime}, {@code answerInteger}, {@code answerQuantity}, {@code answerBoolean}, {@code answerDecimal}, {@code answerReference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(answerDate);
    h += (h << 5) + Objects.hashCode(answerCoding);
    h += (h << 5) + Objects.hashCode(question);
    h += (h << 5) + Objects.hashCode(answerString);
    h += (h << 5) + Objects.hashCode(operator);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(answerTime);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(answerDateTime);
    h += (h << 5) + Objects.hashCode(answerInteger);
    h += (h << 5) + Objects.hashCode(answerQuantity);
    h += (h << 5) + Objects.hashCode(answerBoolean);
    h += (h << 5) + Objects.hashCode(answerDecimal);
    h += (h << 5) + Objects.hashCode(answerReference);
    return h;
  }

  /**
   * Prints the immutable value {@code Questionnaire_EnableWhen} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Questionnaire_EnableWhen{");
    if (answerDate != null) {
      builder.append("answerDate=").append(answerDate);
    }
    if (answerCoding != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("answerCoding=").append(answerCoding);
    }
    if (question != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("question=").append(question);
    }
    if (answerString != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("answerString=").append(answerString);
    }
    if (operator != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("operator=").append(operator);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (answerTime != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("answerTime=").append(answerTime);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (answerDateTime != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("answerDateTime=").append(answerDateTime);
    }
    if (answerInteger != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("answerInteger=").append(answerInteger);
    }
    if (answerQuantity != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("answerQuantity=").append(answerQuantity);
    }
    if (answerBoolean != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("answerBoolean=").append(answerBoolean);
    }
    if (answerDecimal != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("answerDecimal=").append(answerDecimal);
    }
    if (answerReference != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("answerReference=").append(answerReference);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Questionnaire_EnableWhen", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Questionnaire_EnableWhen {
    @Nullable Optional<String> answerDate = Optional.empty();
    boolean answerDateIsSet;
    @Nullable Optional<Coding> answerCoding = Optional.empty();
    boolean answerCodingIsSet;
    @Nullable Optional<String> question = Optional.empty();
    boolean questionIsSet;
    @Nullable Optional<String> answerString = Optional.empty();
    boolean answerStringIsSet;
    @Nullable Optional<Questionnaire_enablewhenOperator> operator = Optional.empty();
    boolean operatorIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> answerTime = Optional.empty();
    boolean answerTimeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> answerDateTime = Optional.empty();
    boolean answerDateTimeIsSet;
    @Nullable Optional<Double> answerInteger = Optional.empty();
    boolean answerIntegerIsSet;
    @Nullable Optional<Quantity> answerQuantity = Optional.empty();
    boolean answerQuantityIsSet;
    @Nullable Optional<Boolean> answerBoolean = Optional.empty();
    boolean answerBooleanIsSet;
    @Nullable Optional<Double> answerDecimal = Optional.empty();
    boolean answerDecimalIsSet;
    @Nullable Optional<Reference> answerReference = Optional.empty();
    boolean answerReferenceIsSet;
    @JsonProperty("answerDate")
    public void setAnswerDate(Optional<String> answerDate) {
      this.answerDate = answerDate;
      this.answerDateIsSet = true;
    }
    @JsonProperty("answerCoding")
    public void setAnswerCoding(Optional<Coding> answerCoding) {
      this.answerCoding = answerCoding;
      this.answerCodingIsSet = true;
    }
    @JsonProperty("question")
    public void setQuestion(Optional<String> question) {
      this.question = question;
      this.questionIsSet = true;
    }
    @JsonProperty("answerString")
    public void setAnswerString(Optional<String> answerString) {
      this.answerString = answerString;
      this.answerStringIsSet = true;
    }
    @JsonProperty("operator")
    public void setOperator(Optional<Questionnaire_enablewhenOperator> operator) {
      this.operator = operator;
      this.operatorIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("answerTime")
    public void setAnswerTime(Optional<String> answerTime) {
      this.answerTime = answerTime;
      this.answerTimeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("answerDateTime")
    public void setAnswerDateTime(Optional<String> answerDateTime) {
      this.answerDateTime = answerDateTime;
      this.answerDateTimeIsSet = true;
    }
    @JsonProperty("answerInteger")
    public void setAnswerInteger(Optional<Double> answerInteger) {
      this.answerInteger = answerInteger;
      this.answerIntegerIsSet = true;
    }
    @JsonProperty("answerQuantity")
    public void setAnswerQuantity(Optional<Quantity> answerQuantity) {
      this.answerQuantity = answerQuantity;
      this.answerQuantityIsSet = true;
    }
    @JsonProperty("answerBoolean")
    public void setAnswerBoolean(Optional<Boolean> answerBoolean) {
      this.answerBoolean = answerBoolean;
      this.answerBooleanIsSet = true;
    }
    @JsonProperty("answerDecimal")
    public void setAnswerDecimal(Optional<Double> answerDecimal) {
      this.answerDecimal = answerDecimal;
      this.answerDecimalIsSet = true;
    }
    @JsonProperty("answerReference")
    public void setAnswerReference(Optional<Reference> answerReference) {
      this.answerReference = answerReference;
      this.answerReferenceIsSet = true;
    }
    @Override
    public Optional<String> answerDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> answerCoding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> question() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> answerString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Questionnaire_enablewhenOperator> operator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> answerTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> answerDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> answerInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> answerQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> answerBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> answerDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> answerReference() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaire_EnableWhen fromJson(Json json) {
    ImmutableQuestionnaire_EnableWhen.Builder builder = ImmutableQuestionnaire_EnableWhen.builder();
    if (json.answerDateIsSet) {
      builder.answerDate(json.answerDate);
    }
    if (json.answerCodingIsSet) {
      builder.answerCoding(json.answerCoding);
    }
    if (json.questionIsSet) {
      builder.question(json.question);
    }
    if (json.answerStringIsSet) {
      builder.answerString(json.answerString);
    }
    if (json.operatorIsSet) {
      builder.operator(json.operator);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.answerTimeIsSet) {
      builder.answerTime(json.answerTime);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.answerDateTimeIsSet) {
      builder.answerDateTime(json.answerDateTime);
    }
    if (json.answerIntegerIsSet) {
      builder.answerInteger(json.answerInteger);
    }
    if (json.answerQuantityIsSet) {
      builder.answerQuantity(json.answerQuantity);
    }
    if (json.answerBooleanIsSet) {
      builder.answerBoolean(json.answerBoolean);
    }
    if (json.answerDecimalIsSet) {
      builder.answerDecimal(json.answerDecimal);
    }
    if (json.answerReferenceIsSet) {
      builder.answerReference(json.answerReference);
    }
    return (ImmutableQuestionnaire_EnableWhen) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Questionnaire_EnableWhen} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Questionnaire_EnableWhen instance
   */
  public static Questionnaire_EnableWhen copyOf(Questionnaire_EnableWhen instance) {
    if (instance instanceof ImmutableQuestionnaire_EnableWhen) {
      return (ImmutableQuestionnaire_EnableWhen) instance;
    }
    return ImmutableQuestionnaire_EnableWhen.builder()
        .answerDate(instance.answerDate())
        .answerCoding(instance.answerCoding())
        .question(instance.question())
        .answerString(instance.answerString())
        .operator(instance.operator())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .answerTime(instance.answerTime())
        .extension(instance.extension())
        .answerDateTime(instance.answerDateTime())
        .answerInteger(instance.answerInteger())
        .answerQuantity(instance.answerQuantity())
        .answerBoolean(instance.answerBoolean())
        .answerDecimal(instance.answerDecimal())
        .answerReference(instance.answerReference())
        .build();
  }

  /**
   * Creates a builder for {@link Questionnaire_EnableWhen Questionnaire_EnableWhen}.
   * <pre>
   * ImmutableQuestionnaire_EnableWhen.builder()
   *    .answerDate(String) // optional {@link Questionnaire_EnableWhen#answerDate() answerDate}
   *    .answerCoding(com.fhir.Coding) // optional {@link Questionnaire_EnableWhen#answerCoding() answerCoding}
   *    .question(String) // optional {@link Questionnaire_EnableWhen#question() question}
   *    .answerString(String) // optional {@link Questionnaire_EnableWhen#answerString() answerString}
   *    .operator(com.fhir.Questionnaire_enablewhenOperator) // optional {@link Questionnaire_EnableWhen#operator() operator}
   *    .id(String) // optional {@link Questionnaire_EnableWhen#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Questionnaire_EnableWhen#modifierExtension() modifierExtension}
   *    .answerTime(String) // optional {@link Questionnaire_EnableWhen#answerTime() answerTime}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Questionnaire_EnableWhen#extension() extension}
   *    .answerDateTime(String) // optional {@link Questionnaire_EnableWhen#answerDateTime() answerDateTime}
   *    .answerInteger(Double) // optional {@link Questionnaire_EnableWhen#answerInteger() answerInteger}
   *    .answerQuantity(com.fhir.Quantity) // optional {@link Questionnaire_EnableWhen#answerQuantity() answerQuantity}
   *    .answerBoolean(Boolean) // optional {@link Questionnaire_EnableWhen#answerBoolean() answerBoolean}
   *    .answerDecimal(Double) // optional {@link Questionnaire_EnableWhen#answerDecimal() answerDecimal}
   *    .answerReference(com.fhir.Reference) // optional {@link Questionnaire_EnableWhen#answerReference() answerReference}
   *    .build();
   * </pre>
   * @return A new Questionnaire_EnableWhen builder
   */
  public static ImmutableQuestionnaire_EnableWhen.Builder builder() {
    return new ImmutableQuestionnaire_EnableWhen.Builder();
  }

  /**
   * Builds instances of type {@link Questionnaire_EnableWhen Questionnaire_EnableWhen}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Questionnaire_EnableWhen", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ANSWER_DATE = 0x1L;
    private static final long OPT_BIT_ANSWER_CODING = 0x2L;
    private static final long OPT_BIT_QUESTION = 0x4L;
    private static final long OPT_BIT_ANSWER_STRING = 0x8L;
    private static final long OPT_BIT_OPERATOR = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_ANSWER_TIME = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_ANSWER_DATE_TIME = 0x200L;
    private static final long OPT_BIT_ANSWER_INTEGER = 0x400L;
    private static final long OPT_BIT_ANSWER_QUANTITY = 0x800L;
    private static final long OPT_BIT_ANSWER_BOOLEAN = 0x1000L;
    private static final long OPT_BIT_ANSWER_DECIMAL = 0x2000L;
    private static final long OPT_BIT_ANSWER_REFERENCE = 0x4000L;
    private long optBits;

    private @Nullable String answerDate;
    private @Nullable Coding answerCoding;
    private @Nullable String question;
    private @Nullable String answerString;
    private @Nullable Questionnaire_enablewhenOperator operator;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String answerTime;
    private @Nullable List<Extension> extension;
    private @Nullable String answerDateTime;
    private @Nullable Double answerInteger;
    private @Nullable Quantity answerQuantity;
    private @Nullable Boolean answerBoolean;
    private @Nullable Double answerDecimal;
    private @Nullable Reference answerReference;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerDate() answerDate} to answerDate.
     * @param answerDate The value for answerDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerDate(String answerDate) {
      checkNotIsSet(answerDateIsSet(), "answerDate");
      this.answerDate = Objects.requireNonNull(answerDate, "answerDate");
      optBits |= OPT_BIT_ANSWER_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerDate() answerDate} to answerDate.
     * @param answerDate The value for answerDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerDate")
    public final Builder answerDate(Optional<String> answerDate) {
      checkNotIsSet(answerDateIsSet(), "answerDate");
      this.answerDate = answerDate.orElse(null);
      optBits |= OPT_BIT_ANSWER_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerCoding() answerCoding} to answerCoding.
     * @param answerCoding The value for answerCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerCoding(Coding answerCoding) {
      checkNotIsSet(answerCodingIsSet(), "answerCoding");
      this.answerCoding = Objects.requireNonNull(answerCoding, "answerCoding");
      optBits |= OPT_BIT_ANSWER_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerCoding() answerCoding} to answerCoding.
     * @param answerCoding The value for answerCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerCoding")
    public final Builder answerCoding(Optional<? extends Coding> answerCoding) {
      checkNotIsSet(answerCodingIsSet(), "answerCoding");
      this.answerCoding = answerCoding.orElse(null);
      optBits |= OPT_BIT_ANSWER_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#question() question} to question.
     * @param question The value for question
     * @return {@code this} builder for chained invocation
     */
    public final Builder question(String question) {
      checkNotIsSet(questionIsSet(), "question");
      this.question = Objects.requireNonNull(question, "question");
      optBits |= OPT_BIT_QUESTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#question() question} to question.
     * @param question The value for question
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("question")
    public final Builder question(Optional<String> question) {
      checkNotIsSet(questionIsSet(), "question");
      this.question = question.orElse(null);
      optBits |= OPT_BIT_QUESTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerString() answerString} to answerString.
     * @param answerString The value for answerString
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerString(String answerString) {
      checkNotIsSet(answerStringIsSet(), "answerString");
      this.answerString = Objects.requireNonNull(answerString, "answerString");
      optBits |= OPT_BIT_ANSWER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerString() answerString} to answerString.
     * @param answerString The value for answerString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerString")
    public final Builder answerString(Optional<String> answerString) {
      checkNotIsSet(answerStringIsSet(), "answerString");
      this.answerString = answerString.orElse(null);
      optBits |= OPT_BIT_ANSWER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for chained invocation
     */
    public final Builder operator(Questionnaire_enablewhenOperator operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = Objects.requireNonNull(operator, "operator");
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operator")
    public final Builder operator(Optional<? extends Questionnaire_enablewhenOperator> operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = operator.orElse(null);
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire_EnableWhen#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire_EnableWhen#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire_EnableWhen#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerTime() answerTime} to answerTime.
     * @param answerTime The value for answerTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerTime(String answerTime) {
      checkNotIsSet(answerTimeIsSet(), "answerTime");
      this.answerTime = Objects.requireNonNull(answerTime, "answerTime");
      optBits |= OPT_BIT_ANSWER_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerTime() answerTime} to answerTime.
     * @param answerTime The value for answerTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerTime")
    public final Builder answerTime(Optional<String> answerTime) {
      checkNotIsSet(answerTimeIsSet(), "answerTime");
      this.answerTime = answerTime.orElse(null);
      optBits |= OPT_BIT_ANSWER_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire_EnableWhen#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerDateTime() answerDateTime} to answerDateTime.
     * @param answerDateTime The value for answerDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerDateTime(String answerDateTime) {
      checkNotIsSet(answerDateTimeIsSet(), "answerDateTime");
      this.answerDateTime = Objects.requireNonNull(answerDateTime, "answerDateTime");
      optBits |= OPT_BIT_ANSWER_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerDateTime() answerDateTime} to answerDateTime.
     * @param answerDateTime The value for answerDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerDateTime")
    public final Builder answerDateTime(Optional<String> answerDateTime) {
      checkNotIsSet(answerDateTimeIsSet(), "answerDateTime");
      this.answerDateTime = answerDateTime.orElse(null);
      optBits |= OPT_BIT_ANSWER_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerInteger() answerInteger} to answerInteger.
     * @param answerInteger The value for answerInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerInteger(double answerInteger) {
      checkNotIsSet(answerIntegerIsSet(), "answerInteger");
      this.answerInteger = answerInteger;
      optBits |= OPT_BIT_ANSWER_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerInteger() answerInteger} to answerInteger.
     * @param answerInteger The value for answerInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerInteger")
    public final Builder answerInteger(Optional<Double> answerInteger) {
      checkNotIsSet(answerIntegerIsSet(), "answerInteger");
      this.answerInteger = answerInteger.orElse(null);
      optBits |= OPT_BIT_ANSWER_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerQuantity() answerQuantity} to answerQuantity.
     * @param answerQuantity The value for answerQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerQuantity(Quantity answerQuantity) {
      checkNotIsSet(answerQuantityIsSet(), "answerQuantity");
      this.answerQuantity = Objects.requireNonNull(answerQuantity, "answerQuantity");
      optBits |= OPT_BIT_ANSWER_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerQuantity() answerQuantity} to answerQuantity.
     * @param answerQuantity The value for answerQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerQuantity")
    public final Builder answerQuantity(Optional<? extends Quantity> answerQuantity) {
      checkNotIsSet(answerQuantityIsSet(), "answerQuantity");
      this.answerQuantity = answerQuantity.orElse(null);
      optBits |= OPT_BIT_ANSWER_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerBoolean() answerBoolean} to answerBoolean.
     * @param answerBoolean The value for answerBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerBoolean(boolean answerBoolean) {
      checkNotIsSet(answerBooleanIsSet(), "answerBoolean");
      this.answerBoolean = answerBoolean;
      optBits |= OPT_BIT_ANSWER_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerBoolean() answerBoolean} to answerBoolean.
     * @param answerBoolean The value for answerBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerBoolean")
    public final Builder answerBoolean(Optional<Boolean> answerBoolean) {
      checkNotIsSet(answerBooleanIsSet(), "answerBoolean");
      this.answerBoolean = answerBoolean.orElse(null);
      optBits |= OPT_BIT_ANSWER_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerDecimal() answerDecimal} to answerDecimal.
     * @param answerDecimal The value for answerDecimal
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerDecimal(double answerDecimal) {
      checkNotIsSet(answerDecimalIsSet(), "answerDecimal");
      this.answerDecimal = answerDecimal;
      optBits |= OPT_BIT_ANSWER_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerDecimal() answerDecimal} to answerDecimal.
     * @param answerDecimal The value for answerDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerDecimal")
    public final Builder answerDecimal(Optional<Double> answerDecimal) {
      checkNotIsSet(answerDecimalIsSet(), "answerDecimal");
      this.answerDecimal = answerDecimal.orElse(null);
      optBits |= OPT_BIT_ANSWER_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerReference() answerReference} to answerReference.
     * @param answerReference The value for answerReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerReference(Reference answerReference) {
      checkNotIsSet(answerReferenceIsSet(), "answerReference");
      this.answerReference = Objects.requireNonNull(answerReference, "answerReference");
      optBits |= OPT_BIT_ANSWER_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_EnableWhen#answerReference() answerReference} to answerReference.
     * @param answerReference The value for answerReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerReference")
    public final Builder answerReference(Optional<? extends Reference> answerReference) {
      checkNotIsSet(answerReferenceIsSet(), "answerReference");
      this.answerReference = answerReference.orElse(null);
      optBits |= OPT_BIT_ANSWER_REFERENCE;
      return this;
    }

    /**
     * Builds a new {@link Questionnaire_EnableWhen Questionnaire_EnableWhen}.
     * @return An immutable instance of Questionnaire_EnableWhen
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Questionnaire_EnableWhen build() {
      return new ImmutableQuestionnaire_EnableWhen(
          answerDate,
          answerCoding,
          question,
          answerString,
          operator,
          id,
          modifierExtension,
          answerTime,
          extension,
          answerDateTime,
          answerInteger,
          answerQuantity,
          answerBoolean,
          answerDecimal,
          answerReference);
    }

    private boolean answerDateIsSet() {
      return (optBits & OPT_BIT_ANSWER_DATE) != 0;
    }

    private boolean answerCodingIsSet() {
      return (optBits & OPT_BIT_ANSWER_CODING) != 0;
    }

    private boolean questionIsSet() {
      return (optBits & OPT_BIT_QUESTION) != 0;
    }

    private boolean answerStringIsSet() {
      return (optBits & OPT_BIT_ANSWER_STRING) != 0;
    }

    private boolean operatorIsSet() {
      return (optBits & OPT_BIT_OPERATOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean answerTimeIsSet() {
      return (optBits & OPT_BIT_ANSWER_TIME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean answerDateTimeIsSet() {
      return (optBits & OPT_BIT_ANSWER_DATE_TIME) != 0;
    }

    private boolean answerIntegerIsSet() {
      return (optBits & OPT_BIT_ANSWER_INTEGER) != 0;
    }

    private boolean answerQuantityIsSet() {
      return (optBits & OPT_BIT_ANSWER_QUANTITY) != 0;
    }

    private boolean answerBooleanIsSet() {
      return (optBits & OPT_BIT_ANSWER_BOOLEAN) != 0;
    }

    private boolean answerDecimalIsSet() {
      return (optBits & OPT_BIT_ANSWER_DECIMAL) != 0;
    }

    private boolean answerReferenceIsSet() {
      return (optBits & OPT_BIT_ANSWER_REFERENCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Questionnaire_EnableWhen is strict, attribute is already set: ".concat(name));
    }
  }
}
