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
 * Immutable implementation of {@link Questionnaire_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaire_Item.builder()}.
 */
@Generated(from = "Questionnaire_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaire_Item implements Questionnaire_Item {
  private final @Nullable Questionnaire_itemEnablebehavior enableBehavior;
  private final @Nullable String id;
  private final @Nullable Integer maxLength;
  private final @Nullable List<Questionnaire_EnableWhen> enableWhen;
  private final @Nullable String prefix;
  private final @Nullable List<Questionnaire_Initial> initial;
  private final @Nullable Canonical answerValueSet;
  private final @Nullable List<Questionnaire_Item> item;
  private final @Nullable Boolean repeats;
  private final @Nullable Questionnaire_itemType type;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean required;
  private final @Nullable Boolean readOnly;
  private final @Nullable List<Questionnaire_AnswerOption> answerOption;
  private final @Nullable List<Coding> code;
  private final @Nullable String linkId;
  private final @Nullable String text;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri definition;

  private ImmutableQuestionnaire_Item(
      @Nullable Questionnaire_itemEnablebehavior enableBehavior,
      @Nullable String id,
      @Nullable Integer maxLength,
      @Nullable List<Questionnaire_EnableWhen> enableWhen,
      @Nullable String prefix,
      @Nullable List<Questionnaire_Initial> initial,
      @Nullable Canonical answerValueSet,
      @Nullable List<Questionnaire_Item> item,
      @Nullable Boolean repeats,
      @Nullable Questionnaire_itemType type,
      @Nullable List<Extension> extension,
      @Nullable Boolean required,
      @Nullable Boolean readOnly,
      @Nullable List<Questionnaire_AnswerOption> answerOption,
      @Nullable List<Coding> code,
      @Nullable String linkId,
      @Nullable String text,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri definition) {
    this.enableBehavior = enableBehavior;
    this.id = id;
    this.maxLength = maxLength;
    this.enableWhen = enableWhen;
    this.prefix = prefix;
    this.initial = initial;
    this.answerValueSet = answerValueSet;
    this.item = item;
    this.repeats = repeats;
    this.type = type;
    this.extension = extension;
    this.required = required;
    this.readOnly = readOnly;
    this.answerOption = answerOption;
    this.code = code;
    this.linkId = linkId;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.definition = definition;
  }

  /**
   * @return The value of the {@code enableBehavior} attribute
   */
  @JsonProperty("enableBehavior")
  @Override
  public Optional<Questionnaire_itemEnablebehavior> enableBehavior() {
    return Optional.ofNullable(enableBehavior);
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
   * @return The value of the {@code maxLength} attribute
   */
  @JsonProperty("maxLength")
  @Override
  public Optional<Integer> maxLength() {
    return Optional.ofNullable(maxLength);
  }

  /**
   * @return The value of the {@code enableWhen} attribute
   */
  @JsonProperty("enableWhen")
  @Override
  public Optional<List<Questionnaire_EnableWhen>> enableWhen() {
    return Optional.ofNullable(enableWhen);
  }

  /**
   * @return The value of the {@code prefix} attribute
   */
  @JsonProperty("prefix")
  @Override
  public Optional<String> prefix() {
    return Optional.ofNullable(prefix);
  }

  /**
   * @return The value of the {@code initial} attribute
   */
  @JsonProperty("initial")
  @Override
  public Optional<List<Questionnaire_Initial>> initial() {
    return Optional.ofNullable(initial);
  }

  /**
   * @return The value of the {@code answerValueSet} attribute
   */
  @JsonProperty("answerValueSet")
  @Override
  public Optional<Canonical> answerValueSet() {
    return Optional.ofNullable(answerValueSet);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Optional<List<Questionnaire_Item>> item() {
    return Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code repeats} attribute
   */
  @JsonProperty("repeats")
  @Override
  public Optional<Boolean> repeats() {
    return Optional.ofNullable(repeats);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Questionnaire_itemType> type() {
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
   * @return The value of the {@code required} attribute
   */
  @JsonProperty("required")
  @Override
  public Optional<Boolean> required() {
    return Optional.ofNullable(required);
  }

  /**
   * @return The value of the {@code readOnly} attribute
   */
  @JsonProperty("readOnly")
  @Override
  public Optional<Boolean> readOnly() {
    return Optional.ofNullable(readOnly);
  }

  /**
   * @return The value of the {@code answerOption} attribute
   */
  @JsonProperty("answerOption")
  @Override
  public Optional<List<Questionnaire_AnswerOption>> answerOption() {
    return Optional.ofNullable(answerOption);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<List<Coding>> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code linkId} attribute
   */
  @JsonProperty("linkId")
  @Override
  public Optional<String> linkId() {
    return Optional.ofNullable(linkId);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public Optional<Uri> definition() {
    return Optional.ofNullable(definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#enableBehavior() enableBehavior} attribute.
   * @param value The value for enableBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withEnableBehavior(Questionnaire_itemEnablebehavior value) {
    @Nullable Questionnaire_itemEnablebehavior newValue = Objects.requireNonNull(value, "enableBehavior");
    if (this.enableBehavior == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        newValue,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#enableBehavior() enableBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enableBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withEnableBehavior(Optional<? extends Questionnaire_itemEnablebehavior> optional) {
    @Nullable Questionnaire_itemEnablebehavior value = optional.orElse(null);
    if (this.enableBehavior == value) return this;
    return new ImmutableQuestionnaire_Item(
        value,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        newValue,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        value,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#maxLength() maxLength} attribute.
   * @param value The value for maxLength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withMaxLength(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.maxLength, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        newValue,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#maxLength() maxLength} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxLength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withMaxLength(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.maxLength, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        value,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#enableWhen() enableWhen} attribute.
   * @param value The value for enableWhen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withEnableWhen(List<Questionnaire_EnableWhen> value) {
    @Nullable List<Questionnaire_EnableWhen> newValue = Objects.requireNonNull(value, "enableWhen");
    if (this.enableWhen == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        newValue,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#enableWhen() enableWhen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enableWhen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withEnableWhen(Optional<? extends List<Questionnaire_EnableWhen>> optional) {
    @Nullable List<Questionnaire_EnableWhen> value = optional.orElse(null);
    if (this.enableWhen == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        value,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#prefix() prefix} attribute.
   * @param value The value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withPrefix(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "prefix");
    if (Objects.equals(this.prefix, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        newValue,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#prefix() prefix} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withPrefix(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.prefix, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        value,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#initial() initial} attribute.
   * @param value The value for initial
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withInitial(List<Questionnaire_Initial> value) {
    @Nullable List<Questionnaire_Initial> newValue = Objects.requireNonNull(value, "initial");
    if (this.initial == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        newValue,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#initial() initial} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for initial
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withInitial(Optional<? extends List<Questionnaire_Initial>> optional) {
    @Nullable List<Questionnaire_Initial> value = optional.orElse(null);
    if (this.initial == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        value,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#answerValueSet() answerValueSet} attribute.
   * @param value The value for answerValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withAnswerValueSet(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "answerValueSet");
    if (this.answerValueSet == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        newValue,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#answerValueSet() answerValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withAnswerValueSet(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.answerValueSet == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        value,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withItem(List<Questionnaire_Item> value) {
    @Nullable List<Questionnaire_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        newValue,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withItem(Optional<? extends List<Questionnaire_Item>> optional) {
    @Nullable List<Questionnaire_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        value,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#repeats() repeats} attribute.
   * @param value The value for repeats
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withRepeats(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.repeats, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        newValue,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#repeats() repeats} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repeats
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withRepeats(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.repeats, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        value,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withType(Questionnaire_itemType value) {
    @Nullable Questionnaire_itemType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        newValue,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withType(Optional<? extends Questionnaire_itemType> optional) {
    @Nullable Questionnaire_itemType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        value,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        newValue,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        value,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#required() required} attribute.
   * @param value The value for required
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withRequired(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.required, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        newValue,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#required() required} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for required
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withRequired(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.required, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        value,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#readOnly() readOnly} attribute.
   * @param value The value for readOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withReadOnly(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.readOnly, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        newValue,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#readOnly() readOnly} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withReadOnly(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.readOnly, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        value,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#answerOption() answerOption} attribute.
   * @param value The value for answerOption
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withAnswerOption(List<Questionnaire_AnswerOption> value) {
    @Nullable List<Questionnaire_AnswerOption> newValue = Objects.requireNonNull(value, "answerOption");
    if (this.answerOption == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        newValue,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#answerOption() answerOption} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerOption
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withAnswerOption(Optional<? extends List<Questionnaire_AnswerOption>> optional) {
    @Nullable List<Questionnaire_AnswerOption> value = optional.orElse(null);
    if (this.answerOption == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        value,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withCode(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        newValue,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withCode(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        value,
        this.linkId,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#linkId() linkId} attribute.
   * @param value The value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withLinkId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "linkId");
    if (Objects.equals(this.linkId, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        newValue,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#linkId() linkId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withLinkId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.linkId, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        value,
        this.text,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        newValue,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        value,
        this.modifierExtension,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        newValue,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        value,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withDefinition(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withDefinition(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.enableBehavior,
        this.id,
        this.maxLength,
        this.enableWhen,
        this.prefix,
        this.initial,
        this.answerValueSet,
        this.item,
        this.repeats,
        this.type,
        this.extension,
        this.required,
        this.readOnly,
        this.answerOption,
        this.code,
        this.linkId,
        this.text,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaire_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaire_Item
        && equalTo((ImmutableQuestionnaire_Item) another);
  }

  private boolean equalTo(ImmutableQuestionnaire_Item another) {
    return Objects.equals(enableBehavior, another.enableBehavior)
        && Objects.equals(id, another.id)
        && Objects.equals(maxLength, another.maxLength)
        && Objects.equals(enableWhen, another.enableWhen)
        && Objects.equals(prefix, another.prefix)
        && Objects.equals(initial, another.initial)
        && Objects.equals(answerValueSet, another.answerValueSet)
        && Objects.equals(item, another.item)
        && Objects.equals(repeats, another.repeats)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(required, another.required)
        && Objects.equals(readOnly, another.readOnly)
        && Objects.equals(answerOption, another.answerOption)
        && Objects.equals(code, another.code)
        && Objects.equals(linkId, another.linkId)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(definition, another.definition);
  }

  /**
   * Computes a hash code from attributes: {@code enableBehavior}, {@code id}, {@code maxLength}, {@code enableWhen}, {@code prefix}, {@code initial}, {@code answerValueSet}, {@code item}, {@code repeats}, {@code type}, {@code extension}, {@code required}, {@code readOnly}, {@code answerOption}, {@code code}, {@code linkId}, {@code text}, {@code modifierExtension}, {@code definition}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(enableBehavior);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(maxLength);
    h += (h << 5) + Objects.hashCode(enableWhen);
    h += (h << 5) + Objects.hashCode(prefix);
    h += (h << 5) + Objects.hashCode(initial);
    h += (h << 5) + Objects.hashCode(answerValueSet);
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(repeats);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(required);
    h += (h << 5) + Objects.hashCode(readOnly);
    h += (h << 5) + Objects.hashCode(answerOption);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(linkId);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(definition);
    return h;
  }

  /**
   * Prints the immutable value {@code Questionnaire_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Questionnaire_Item{");
    if (enableBehavior != null) {
      builder.append("enableBehavior=").append(enableBehavior);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (maxLength != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("maxLength=").append(maxLength);
    }
    if (enableWhen != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("enableWhen=").append(enableWhen);
    }
    if (prefix != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("prefix=").append(prefix);
    }
    if (initial != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("initial=").append(initial);
    }
    if (answerValueSet != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("answerValueSet=").append(answerValueSet);
    }
    if (item != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (repeats != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("repeats=").append(repeats);
    }
    if (type != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (required != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("required=").append(required);
    }
    if (readOnly != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("readOnly=").append(readOnly);
    }
    if (answerOption != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("answerOption=").append(answerOption);
    }
    if (code != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (linkId != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("linkId=").append(linkId);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (definition != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Questionnaire_Item", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Questionnaire_Item {
    @Nullable Optional<Questionnaire_itemEnablebehavior> enableBehavior = Optional.empty();
    boolean enableBehaviorIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Integer> maxLength = Optional.empty();
    boolean maxLengthIsSet;
    @Nullable Optional<List<Questionnaire_EnableWhen>> enableWhen = Optional.empty();
    boolean enableWhenIsSet;
    @Nullable Optional<String> prefix = Optional.empty();
    boolean prefixIsSet;
    @Nullable Optional<List<Questionnaire_Initial>> initial = Optional.empty();
    boolean initialIsSet;
    @Nullable Optional<Canonical> answerValueSet = Optional.empty();
    boolean answerValueSetIsSet;
    @Nullable Optional<List<Questionnaire_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<Boolean> repeats = Optional.empty();
    boolean repeatsIsSet;
    @Nullable Optional<Questionnaire_itemType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> required = Optional.empty();
    boolean requiredIsSet;
    @Nullable Optional<Boolean> readOnly = Optional.empty();
    boolean readOnlyIsSet;
    @Nullable Optional<List<Questionnaire_AnswerOption>> answerOption = Optional.empty();
    boolean answerOptionIsSet;
    @Nullable Optional<List<Coding>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> linkId = Optional.empty();
    boolean linkIdIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> definition = Optional.empty();
    boolean definitionIsSet;
    @JsonProperty("enableBehavior")
    public void setEnableBehavior(Optional<Questionnaire_itemEnablebehavior> enableBehavior) {
      this.enableBehavior = enableBehavior;
      this.enableBehaviorIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("maxLength")
    public void setMaxLength(Optional<Integer> maxLength) {
      this.maxLength = maxLength;
      this.maxLengthIsSet = true;
    }
    @JsonProperty("enableWhen")
    public void setEnableWhen(Optional<List<Questionnaire_EnableWhen>> enableWhen) {
      this.enableWhen = enableWhen;
      this.enableWhenIsSet = true;
    }
    @JsonProperty("prefix")
    public void setPrefix(Optional<String> prefix) {
      this.prefix = prefix;
      this.prefixIsSet = true;
    }
    @JsonProperty("initial")
    public void setInitial(Optional<List<Questionnaire_Initial>> initial) {
      this.initial = initial;
      this.initialIsSet = true;
    }
    @JsonProperty("answerValueSet")
    public void setAnswerValueSet(Optional<Canonical> answerValueSet) {
      this.answerValueSet = answerValueSet;
      this.answerValueSetIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<Questionnaire_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("repeats")
    public void setRepeats(Optional<Boolean> repeats) {
      this.repeats = repeats;
      this.repeatsIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Questionnaire_itemType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("required")
    public void setRequired(Optional<Boolean> required) {
      this.required = required;
      this.requiredIsSet = true;
    }
    @JsonProperty("readOnly")
    public void setReadOnly(Optional<Boolean> readOnly) {
      this.readOnly = readOnly;
      this.readOnlyIsSet = true;
    }
    @JsonProperty("answerOption")
    public void setAnswerOption(Optional<List<Questionnaire_AnswerOption>> answerOption) {
      this.answerOption = answerOption;
      this.answerOptionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<Coding>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("linkId")
    public void setLinkId(Optional<String> linkId) {
      this.linkId = linkId;
      this.linkIdIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("definition")
    public void setDefinition(Optional<Uri> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @Override
    public Optional<Questionnaire_itemEnablebehavior> enableBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> maxLength() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Questionnaire_EnableWhen>> enableWhen() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> prefix() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Questionnaire_Initial>> initial() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> answerValueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Questionnaire_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> repeats() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Questionnaire_itemType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> required() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> readOnly() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Questionnaire_AnswerOption>> answerOption() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> linkId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> definition() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaire_Item fromJson(Json json) {
    ImmutableQuestionnaire_Item.Builder builder = ImmutableQuestionnaire_Item.builder();
    if (json.enableBehaviorIsSet) {
      builder.enableBehavior(json.enableBehavior);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.maxLengthIsSet) {
      builder.maxLength(json.maxLength);
    }
    if (json.enableWhenIsSet) {
      builder.enableWhen(json.enableWhen);
    }
    if (json.prefixIsSet) {
      builder.prefix(json.prefix);
    }
    if (json.initialIsSet) {
      builder.initial(json.initial);
    }
    if (json.answerValueSetIsSet) {
      builder.answerValueSet(json.answerValueSet);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.repeatsIsSet) {
      builder.repeats(json.repeats);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.requiredIsSet) {
      builder.required(json.required);
    }
    if (json.readOnlyIsSet) {
      builder.readOnly(json.readOnly);
    }
    if (json.answerOptionIsSet) {
      builder.answerOption(json.answerOption);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.linkIdIsSet) {
      builder.linkId(json.linkId);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    return (ImmutableQuestionnaire_Item) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Questionnaire_Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Questionnaire_Item instance
   */
  public static Questionnaire_Item copyOf(Questionnaire_Item instance) {
    if (instance instanceof ImmutableQuestionnaire_Item) {
      return (ImmutableQuestionnaire_Item) instance;
    }
    return ImmutableQuestionnaire_Item.builder()
        .enableBehavior(instance.enableBehavior())
        .id(instance.id())
        .maxLength(instance.maxLength())
        .enableWhen(instance.enableWhen())
        .prefix(instance.prefix())
        .initial(instance.initial())
        .answerValueSet(instance.answerValueSet())
        .item(instance.item())
        .repeats(instance.repeats())
        .type(instance.type())
        .extension(instance.extension())
        .required(instance.required())
        .readOnly(instance.readOnly())
        .answerOption(instance.answerOption())
        .code(instance.code())
        .linkId(instance.linkId())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .definition(instance.definition())
        .build();
  }

  /**
   * Creates a builder for {@link Questionnaire_Item Questionnaire_Item}.
   * <pre>
   * ImmutableQuestionnaire_Item.builder()
   *    .enableBehavior(com.medplum.types.fhir.Questionnaire_itemEnablebehavior) // optional {@link Questionnaire_Item#enableBehavior() enableBehavior}
   *    .id(String) // optional {@link Questionnaire_Item#id() id}
   *    .maxLength(Integer) // optional {@link Questionnaire_Item#maxLength() maxLength}
   *    .enableWhen(List&amp;lt;com.medplum.types.fhir.Questionnaire_EnableWhen&amp;gt;) // optional {@link Questionnaire_Item#enableWhen() enableWhen}
   *    .prefix(String) // optional {@link Questionnaire_Item#prefix() prefix}
   *    .initial(List&amp;lt;com.medplum.types.fhir.Questionnaire_Initial&amp;gt;) // optional {@link Questionnaire_Item#initial() initial}
   *    .answerValueSet(com.medplum.types.fhir.Canonical) // optional {@link Questionnaire_Item#answerValueSet() answerValueSet}
   *    .item(List&amp;lt;com.medplum.types.fhir.Questionnaire_Item&amp;gt;) // optional {@link Questionnaire_Item#item() item}
   *    .repeats(Boolean) // optional {@link Questionnaire_Item#repeats() repeats}
   *    .type(com.medplum.types.fhir.Questionnaire_itemType) // optional {@link Questionnaire_Item#type() type}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Questionnaire_Item#extension() extension}
   *    .required(Boolean) // optional {@link Questionnaire_Item#required() required}
   *    .readOnly(Boolean) // optional {@link Questionnaire_Item#readOnly() readOnly}
   *    .answerOption(List&amp;lt;com.medplum.types.fhir.Questionnaire_AnswerOption&amp;gt;) // optional {@link Questionnaire_Item#answerOption() answerOption}
   *    .code(List&amp;lt;com.medplum.types.fhir.Coding&amp;gt;) // optional {@link Questionnaire_Item#code() code}
   *    .linkId(String) // optional {@link Questionnaire_Item#linkId() linkId}
   *    .text(String) // optional {@link Questionnaire_Item#text() text}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Questionnaire_Item#modifierExtension() modifierExtension}
   *    .definition(com.medplum.types.fhir.Uri) // optional {@link Questionnaire_Item#definition() definition}
   *    .build();
   * </pre>
   * @return A new Questionnaire_Item builder
   */
  public static ImmutableQuestionnaire_Item.Builder builder() {
    return new ImmutableQuestionnaire_Item.Builder();
  }

  /**
   * Builds instances of type {@link Questionnaire_Item Questionnaire_Item}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Questionnaire_Item", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ENABLE_BEHAVIOR = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MAX_LENGTH = 0x4L;
    private static final long OPT_BIT_ENABLE_WHEN = 0x8L;
    private static final long OPT_BIT_PREFIX = 0x10L;
    private static final long OPT_BIT_INITIAL = 0x20L;
    private static final long OPT_BIT_ANSWER_VALUE_SET = 0x40L;
    private static final long OPT_BIT_ITEM = 0x80L;
    private static final long OPT_BIT_REPEATS = 0x100L;
    private static final long OPT_BIT_TYPE = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_REQUIRED = 0x800L;
    private static final long OPT_BIT_READ_ONLY = 0x1000L;
    private static final long OPT_BIT_ANSWER_OPTION = 0x2000L;
    private static final long OPT_BIT_CODE = 0x4000L;
    private static final long OPT_BIT_LINK_ID = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000L;
    private static final long OPT_BIT_DEFINITION = 0x40000L;
    private long optBits;

    private @Nullable Questionnaire_itemEnablebehavior enableBehavior;
    private @Nullable String id;
    private @Nullable Integer maxLength;
    private @Nullable List<Questionnaire_EnableWhen> enableWhen;
    private @Nullable String prefix;
    private @Nullable List<Questionnaire_Initial> initial;
    private @Nullable Canonical answerValueSet;
    private @Nullable List<Questionnaire_Item> item;
    private @Nullable Boolean repeats;
    private @Nullable Questionnaire_itemType type;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean required;
    private @Nullable Boolean readOnly;
    private @Nullable List<Questionnaire_AnswerOption> answerOption;
    private @Nullable List<Coding> code;
    private @Nullable String linkId;
    private @Nullable String text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri definition;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#enableBehavior() enableBehavior} to enableBehavior.
     * @param enableBehavior The value for enableBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder enableBehavior(Questionnaire_itemEnablebehavior enableBehavior) {
      checkNotIsSet(enableBehaviorIsSet(), "enableBehavior");
      this.enableBehavior = Objects.requireNonNull(enableBehavior, "enableBehavior");
      optBits |= OPT_BIT_ENABLE_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#enableBehavior() enableBehavior} to enableBehavior.
     * @param enableBehavior The value for enableBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enableBehavior")
    public final Builder enableBehavior(Optional<? extends Questionnaire_itemEnablebehavior> enableBehavior) {
      checkNotIsSet(enableBehaviorIsSet(), "enableBehavior");
      this.enableBehavior = enableBehavior.orElse(null);
      optBits |= OPT_BIT_ENABLE_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire_Item#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire_Item#maxLength() maxLength} to maxLength.
     * @param maxLength The value for maxLength
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxLength(int maxLength) {
      checkNotIsSet(maxLengthIsSet(), "maxLength");
      this.maxLength = maxLength;
      optBits |= OPT_BIT_MAX_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#maxLength() maxLength} to maxLength.
     * @param maxLength The value for maxLength
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxLength")
    public final Builder maxLength(Optional<Integer> maxLength) {
      checkNotIsSet(maxLengthIsSet(), "maxLength");
      this.maxLength = maxLength.orElse(null);
      optBits |= OPT_BIT_MAX_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#enableWhen() enableWhen} to enableWhen.
     * @param enableWhen The value for enableWhen
     * @return {@code this} builder for chained invocation
     */
    public final Builder enableWhen(List<Questionnaire_EnableWhen> enableWhen) {
      checkNotIsSet(enableWhenIsSet(), "enableWhen");
      this.enableWhen = Objects.requireNonNull(enableWhen, "enableWhen");
      optBits |= OPT_BIT_ENABLE_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#enableWhen() enableWhen} to enableWhen.
     * @param enableWhen The value for enableWhen
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enableWhen")
    public final Builder enableWhen(Optional<? extends List<Questionnaire_EnableWhen>> enableWhen) {
      checkNotIsSet(enableWhenIsSet(), "enableWhen");
      this.enableWhen = enableWhen.orElse(null);
      optBits |= OPT_BIT_ENABLE_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for chained invocation
     */
    public final Builder prefix(String prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = Objects.requireNonNull(prefix, "prefix");
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("prefix")
    public final Builder prefix(Optional<String> prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = prefix.orElse(null);
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#initial() initial} to initial.
     * @param initial The value for initial
     * @return {@code this} builder for chained invocation
     */
    public final Builder initial(List<Questionnaire_Initial> initial) {
      checkNotIsSet(initialIsSet(), "initial");
      this.initial = Objects.requireNonNull(initial, "initial");
      optBits |= OPT_BIT_INITIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#initial() initial} to initial.
     * @param initial The value for initial
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("initial")
    public final Builder initial(Optional<? extends List<Questionnaire_Initial>> initial) {
      checkNotIsSet(initialIsSet(), "initial");
      this.initial = initial.orElse(null);
      optBits |= OPT_BIT_INITIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#answerValueSet() answerValueSet} to answerValueSet.
     * @param answerValueSet The value for answerValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerValueSet(Canonical answerValueSet) {
      checkNotIsSet(answerValueSetIsSet(), "answerValueSet");
      this.answerValueSet = Objects.requireNonNull(answerValueSet, "answerValueSet");
      optBits |= OPT_BIT_ANSWER_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#answerValueSet() answerValueSet} to answerValueSet.
     * @param answerValueSet The value for answerValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerValueSet")
    public final Builder answerValueSet(Optional<? extends Canonical> answerValueSet) {
      checkNotIsSet(answerValueSetIsSet(), "answerValueSet");
      this.answerValueSet = answerValueSet.orElse(null);
      optBits |= OPT_BIT_ANSWER_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(List<Questionnaire_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Optional<? extends List<Questionnaire_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#repeats() repeats} to repeats.
     * @param repeats The value for repeats
     * @return {@code this} builder for chained invocation
     */
    public final Builder repeats(boolean repeats) {
      checkNotIsSet(repeatsIsSet(), "repeats");
      this.repeats = repeats;
      optBits |= OPT_BIT_REPEATS;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#repeats() repeats} to repeats.
     * @param repeats The value for repeats
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("repeats")
    public final Builder repeats(Optional<Boolean> repeats) {
      checkNotIsSet(repeatsIsSet(), "repeats");
      this.repeats = repeats.orElse(null);
      optBits |= OPT_BIT_REPEATS;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Questionnaire_itemType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Questionnaire_itemType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire_Item#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for chained invocation
     */
    public final Builder required(boolean required) {
      checkNotIsSet(requiredIsSet(), "required");
      this.required = required;
      optBits |= OPT_BIT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("required")
    public final Builder required(Optional<Boolean> required) {
      checkNotIsSet(requiredIsSet(), "required");
      this.required = required.orElse(null);
      optBits |= OPT_BIT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#readOnly() readOnly} to readOnly.
     * @param readOnly The value for readOnly
     * @return {@code this} builder for chained invocation
     */
    public final Builder readOnly(boolean readOnly) {
      checkNotIsSet(readOnlyIsSet(), "readOnly");
      this.readOnly = readOnly;
      optBits |= OPT_BIT_READ_ONLY;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#readOnly() readOnly} to readOnly.
     * @param readOnly The value for readOnly
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("readOnly")
    public final Builder readOnly(Optional<Boolean> readOnly) {
      checkNotIsSet(readOnlyIsSet(), "readOnly");
      this.readOnly = readOnly.orElse(null);
      optBits |= OPT_BIT_READ_ONLY;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#answerOption() answerOption} to answerOption.
     * @param answerOption The value for answerOption
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerOption(List<Questionnaire_AnswerOption> answerOption) {
      checkNotIsSet(answerOptionIsSet(), "answerOption");
      this.answerOption = Objects.requireNonNull(answerOption, "answerOption");
      optBits |= OPT_BIT_ANSWER_OPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#answerOption() answerOption} to answerOption.
     * @param answerOption The value for answerOption
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answerOption")
    public final Builder answerOption(Optional<? extends List<Questionnaire_AnswerOption>> answerOption) {
      checkNotIsSet(answerOptionIsSet(), "answerOption");
      this.answerOption = answerOption.orElse(null);
      optBits |= OPT_BIT_ANSWER_OPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(List<Coding> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends List<Coding>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder linkId(String linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = Objects.requireNonNull(linkId, "linkId");
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("linkId")
    public final Builder linkId(Optional<String> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = linkId.orElse(null);
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#text() text} to text.
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
     * Initializes the optional value {@link Questionnaire_Item#text() text} to text.
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
     * Initializes the optional value {@link Questionnaire_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire_Item#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(Uri definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definition")
    public final Builder definition(Optional<? extends Uri> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Builds a new {@link Questionnaire_Item Questionnaire_Item}.
     * @return An immutable instance of Questionnaire_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Questionnaire_Item build() {
      return new ImmutableQuestionnaire_Item(
          enableBehavior,
          id,
          maxLength,
          enableWhen,
          prefix,
          initial,
          answerValueSet,
          item,
          repeats,
          type,
          extension,
          required,
          readOnly,
          answerOption,
          code,
          linkId,
          text,
          modifierExtension,
          definition);
    }

    private boolean enableBehaviorIsSet() {
      return (optBits & OPT_BIT_ENABLE_BEHAVIOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean maxLengthIsSet() {
      return (optBits & OPT_BIT_MAX_LENGTH) != 0;
    }

    private boolean enableWhenIsSet() {
      return (optBits & OPT_BIT_ENABLE_WHEN) != 0;
    }

    private boolean prefixIsSet() {
      return (optBits & OPT_BIT_PREFIX) != 0;
    }

    private boolean initialIsSet() {
      return (optBits & OPT_BIT_INITIAL) != 0;
    }

    private boolean answerValueSetIsSet() {
      return (optBits & OPT_BIT_ANSWER_VALUE_SET) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean repeatsIsSet() {
      return (optBits & OPT_BIT_REPEATS) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean requiredIsSet() {
      return (optBits & OPT_BIT_REQUIRED) != 0;
    }

    private boolean readOnlyIsSet() {
      return (optBits & OPT_BIT_READ_ONLY) != 0;
    }

    private boolean answerOptionIsSet() {
      return (optBits & OPT_BIT_ANSWER_OPTION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean linkIdIsSet() {
      return (optBits & OPT_BIT_LINK_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Questionnaire_Item is strict, attribute is already set: ".concat(name));
    }
  }
}
