//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Questionnaire_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaire_Item.builder()}.
 */
@org.immutables.value.Generated(from = "Questionnaire_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaire_Item implements com.fhir.Questionnaire_Item {
  private final @javax.annotation.Nullable java.lang.Boolean repeats;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coding> code;
  private final @javax.annotation.Nullable java.lang.Boolean required;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Questionnaire_itemEnablebehavior enableBehavior;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> item;
  private final @javax.annotation.Nullable java.lang.Integer maxLength;
  private final @javax.annotation.Nullable java.lang.Boolean readOnly;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String linkId;
  private final @javax.annotation.Nullable com.fhir.uri definition;
  private final @javax.annotation.Nullable com.fhir.Questionnaire_itemType type;
  private final @javax.annotation.Nullable java.lang.String text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_AnswerOption> answerOption;
  private final @javax.annotation.Nullable java.lang.String prefix;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_EnableWhen> enableWhen;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Initial> initial;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.canonical answerValueSet;

  private ImmutableQuestionnaire_Item(
      @javax.annotation.Nullable java.lang.Boolean repeats,
      @javax.annotation.Nullable java.util.List<com.fhir.Coding> code,
      @javax.annotation.Nullable java.lang.Boolean required,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Questionnaire_itemEnablebehavior enableBehavior,
      @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> item,
      @javax.annotation.Nullable java.lang.Integer maxLength,
      @javax.annotation.Nullable java.lang.Boolean readOnly,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String linkId,
      @javax.annotation.Nullable com.fhir.uri definition,
      @javax.annotation.Nullable com.fhir.Questionnaire_itemType type,
      @javax.annotation.Nullable java.lang.String text,
      @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_AnswerOption> answerOption,
      @javax.annotation.Nullable java.lang.String prefix,
      @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_EnableWhen> enableWhen,
      @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Initial> initial,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.canonical answerValueSet) {
    this.repeats = repeats;
    this.code = code;
    this.required = required;
    this.extension = extension;
    this.enableBehavior = enableBehavior;
    this.item = item;
    this.maxLength = maxLength;
    this.readOnly = readOnly;
    this.modifierExtension = modifierExtension;
    this.linkId = linkId;
    this.definition = definition;
    this.type = type;
    this.text = text;
    this.answerOption = answerOption;
    this.prefix = prefix;
    this.enableWhen = enableWhen;
    this.initial = initial;
    this.id = id;
    this.answerValueSet = answerValueSet;
  }

  /**
   * @return The value of the {@code repeats} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("repeats")
  @Override
  public java.util.Optional<java.lang.Boolean> repeats() {
    return java.util.Optional.ofNullable(repeats);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coding>> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code required} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("required")
  @Override
  public java.util.Optional<java.lang.Boolean> required() {
    return java.util.Optional.ofNullable(required);
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
   * @return The value of the {@code enableBehavior} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enableBehavior")
  @Override
  public java.util.Optional<com.fhir.Questionnaire_itemEnablebehavior> enableBehavior() {
    return java.util.Optional.ofNullable(enableBehavior);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Questionnaire_Item>> item() {
    return java.util.Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code maxLength} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
  @Override
  public java.util.Optional<java.lang.Integer> maxLength() {
    return java.util.Optional.ofNullable(maxLength);
  }

  /**
   * @return The value of the {@code readOnly} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
  @Override
  public java.util.Optional<java.lang.Boolean> readOnly() {
    return java.util.Optional.ofNullable(readOnly);
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
   * @return The value of the {@code linkId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("linkId")
  @Override
  public java.util.Optional<java.lang.String> linkId() {
    return java.util.Optional.ofNullable(linkId);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definition")
  @Override
  public java.util.Optional<com.fhir.uri> definition() {
    return java.util.Optional.ofNullable(definition);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.Questionnaire_itemType> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<java.lang.String> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code answerOption} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("answerOption")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Questionnaire_AnswerOption>> answerOption() {
    return java.util.Optional.ofNullable(answerOption);
  }

  /**
   * @return The value of the {@code prefix} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("prefix")
  @Override
  public java.util.Optional<java.lang.String> prefix() {
    return java.util.Optional.ofNullable(prefix);
  }

  /**
   * @return The value of the {@code enableWhen} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enableWhen")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Questionnaire_EnableWhen>> enableWhen() {
    return java.util.Optional.ofNullable(enableWhen);
  }

  /**
   * @return The value of the {@code initial} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("initial")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Questionnaire_Initial>> initial() {
    return java.util.Optional.ofNullable(initial);
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
   * @return The value of the {@code answerValueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("answerValueSet")
  @Override
  public java.util.Optional<com.fhir.canonical> answerValueSet() {
    return java.util.Optional.ofNullable(answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#repeats() repeats} attribute.
   * @param value The value for repeats
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withRepeats(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.repeats, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        newValue,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#repeats() repeats} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repeats
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withRepeats(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.repeats, value)) return this;
    return new ImmutableQuestionnaire_Item(
        value,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withCode(java.util.List<com.fhir.Coding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        newValue,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withCode(java.util.Optional<? extends java.util.List<com.fhir.Coding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        value,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#required() required} attribute.
   * @param value The value for required
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withRequired(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.required, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        newValue,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#required() required} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for required
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withRequired(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.required, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        value,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        newValue,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        value,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#enableBehavior() enableBehavior} attribute.
   * @param value The value for enableBehavior
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withEnableBehavior(com.fhir.Questionnaire_itemEnablebehavior value) {
    @javax.annotation.Nullable com.fhir.Questionnaire_itemEnablebehavior newValue = java.util.Objects.requireNonNull(value, "enableBehavior");
    if (this.enableBehavior == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        newValue,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#enableBehavior() enableBehavior} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enableBehavior
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withEnableBehavior(java.util.Optional<? extends com.fhir.Questionnaire_itemEnablebehavior> optional) {
    @javax.annotation.Nullable com.fhir.Questionnaire_itemEnablebehavior value = optional.orElse(null);
    if (this.enableBehavior == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        value,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withItem(java.util.List<com.fhir.Questionnaire_Item> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> newValue = java.util.Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        newValue,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withItem(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_Item>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        value,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#maxLength() maxLength} attribute.
   * @param value The value for maxLength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withMaxLength(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.maxLength, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        newValue,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#maxLength() maxLength} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxLength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withMaxLength(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.maxLength, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        value,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#readOnly() readOnly} attribute.
   * @param value The value for readOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withReadOnly(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.readOnly, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        newValue,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#readOnly() readOnly} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withReadOnly(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.readOnly, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        value,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        newValue,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        value,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#linkId() linkId} attribute.
   * @param value The value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withLinkId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "linkId");
    if (java.util.Objects.equals(this.linkId, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        newValue,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#linkId() linkId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withLinkId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.linkId, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        value,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withDefinition(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        newValue,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withDefinition(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        value,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withType(com.fhir.Questionnaire_itemType value) {
    @javax.annotation.Nullable com.fhir.Questionnaire_itemType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        newValue,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withType(java.util.Optional<? extends com.fhir.Questionnaire_itemType> optional) {
    @javax.annotation.Nullable com.fhir.Questionnaire_itemType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        value,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withText(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "text");
    if (java.util.Objects.equals(this.text, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        newValue,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withText(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.text, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        value,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#answerOption() answerOption} attribute.
   * @param value The value for answerOption
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withAnswerOption(java.util.List<com.fhir.Questionnaire_AnswerOption> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_AnswerOption> newValue = java.util.Objects.requireNonNull(value, "answerOption");
    if (this.answerOption == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        newValue,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#answerOption() answerOption} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerOption
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withAnswerOption(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_AnswerOption>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_AnswerOption> value = optional.orElse(null);
    if (this.answerOption == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        value,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#prefix() prefix} attribute.
   * @param value The value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withPrefix(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "prefix");
    if (java.util.Objects.equals(this.prefix, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        newValue,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#prefix() prefix} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withPrefix(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.prefix, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        value,
        this.enableWhen,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#enableWhen() enableWhen} attribute.
   * @param value The value for enableWhen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withEnableWhen(java.util.List<com.fhir.Questionnaire_EnableWhen> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_EnableWhen> newValue = java.util.Objects.requireNonNull(value, "enableWhen");
    if (this.enableWhen == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        newValue,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#enableWhen() enableWhen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enableWhen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withEnableWhen(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_EnableWhen>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_EnableWhen> value = optional.orElse(null);
    if (this.enableWhen == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        value,
        this.initial,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#initial() initial} attribute.
   * @param value The value for initial
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withInitial(java.util.List<com.fhir.Questionnaire_Initial> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Initial> newValue = java.util.Objects.requireNonNull(value, "initial");
    if (this.initial == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        newValue,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#initial() initial} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for initial
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withInitial(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_Initial>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Initial> value = optional.orElse(null);
    if (this.initial == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        value,
        this.id,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        newValue,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        value,
        this.answerValueSet);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire_Item#answerValueSet() answerValueSet} attribute.
   * @param value The value for answerValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire_Item withAnswerValueSet(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "answerValueSet");
    if (this.answerValueSet == newValue) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire_Item#answerValueSet() answerValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answerValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire_Item withAnswerValueSet(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.answerValueSet == value) return this;
    return new ImmutableQuestionnaire_Item(
        this.repeats,
        this.code,
        this.required,
        this.extension,
        this.enableBehavior,
        this.item,
        this.maxLength,
        this.readOnly,
        this.modifierExtension,
        this.linkId,
        this.definition,
        this.type,
        this.text,
        this.answerOption,
        this.prefix,
        this.enableWhen,
        this.initial,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaire_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaire_Item
        && equalTo((ImmutableQuestionnaire_Item) another);
  }

  private boolean equalTo(ImmutableQuestionnaire_Item another) {
    return java.util.Objects.equals(repeats, another.repeats)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(required, another.required)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(enableBehavior, another.enableBehavior)
        && java.util.Objects.equals(item, another.item)
        && java.util.Objects.equals(maxLength, another.maxLength)
        && java.util.Objects.equals(readOnly, another.readOnly)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(linkId, another.linkId)
        && java.util.Objects.equals(definition, another.definition)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(answerOption, another.answerOption)
        && java.util.Objects.equals(prefix, another.prefix)
        && java.util.Objects.equals(enableWhen, another.enableWhen)
        && java.util.Objects.equals(initial, another.initial)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(answerValueSet, another.answerValueSet);
  }

  /**
   * Computes a hash code from attributes: {@code repeats}, {@code code}, {@code required}, {@code extension}, {@code enableBehavior}, {@code item}, {@code maxLength}, {@code readOnly}, {@code modifierExtension}, {@code linkId}, {@code definition}, {@code type}, {@code text}, {@code answerOption}, {@code prefix}, {@code enableWhen}, {@code initial}, {@code id}, {@code answerValueSet}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(repeats);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(required);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(enableBehavior);
    h += (h << 5) + java.util.Objects.hashCode(item);
    h += (h << 5) + java.util.Objects.hashCode(maxLength);
    h += (h << 5) + java.util.Objects.hashCode(readOnly);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(linkId);
    h += (h << 5) + java.util.Objects.hashCode(definition);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(answerOption);
    h += (h << 5) + java.util.Objects.hashCode(prefix);
    h += (h << 5) + java.util.Objects.hashCode(enableWhen);
    h += (h << 5) + java.util.Objects.hashCode(initial);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(answerValueSet);
    return h;
  }

  /**
   * Prints the immutable value {@code Questionnaire_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Questionnaire_Item{");
    if (repeats != null) {
      builder.append("repeats=").append(repeats);
    }
    if (code != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (required != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("required=").append(required);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (enableBehavior != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("enableBehavior=").append(enableBehavior);
    }
    if (item != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (maxLength != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("maxLength=").append(maxLength);
    }
    if (readOnly != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("readOnly=").append(readOnly);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (linkId != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("linkId=").append(linkId);
    }
    if (definition != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (type != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (answerOption != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("answerOption=").append(answerOption);
    }
    if (prefix != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("prefix=").append(prefix);
    }
    if (enableWhen != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("enableWhen=").append(enableWhen);
    }
    if (initial != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("initial=").append(initial);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (answerValueSet != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("answerValueSet=").append(answerValueSet);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Questionnaire_Item", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Questionnaire_Item {
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> repeats = java.util.Optional.empty();
    boolean repeatsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coding>> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> required = java.util.Optional.empty();
    boolean requiredIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Questionnaire_itemEnablebehavior> enableBehavior = java.util.Optional.empty();
    boolean enableBehaviorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Questionnaire_Item>> item = java.util.Optional.empty();
    boolean itemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> maxLength = java.util.Optional.empty();
    boolean maxLengthIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> readOnly = java.util.Optional.empty();
    boolean readOnlyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> linkId = java.util.Optional.empty();
    boolean linkIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> definition = java.util.Optional.empty();
    boolean definitionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Questionnaire_itemType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Questionnaire_AnswerOption>> answerOption = java.util.Optional.empty();
    boolean answerOptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> prefix = java.util.Optional.empty();
    boolean prefixIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Questionnaire_EnableWhen>> enableWhen = java.util.Optional.empty();
    boolean enableWhenIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Questionnaire_Initial>> initial = java.util.Optional.empty();
    boolean initialIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> answerValueSet = java.util.Optional.empty();
    boolean answerValueSetIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("repeats")
    public void setRepeats(java.util.Optional<java.lang.Boolean> repeats) {
      this.repeats = repeats;
      this.repeatsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.util.List<com.fhir.Coding>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    public void setRequired(java.util.Optional<java.lang.Boolean> required) {
      this.required = required;
      this.requiredIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enableBehavior")
    public void setEnableBehavior(java.util.Optional<com.fhir.Questionnaire_itemEnablebehavior> enableBehavior) {
      this.enableBehavior = enableBehavior;
      this.enableBehaviorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(java.util.Optional<java.util.List<com.fhir.Questionnaire_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
    public void setMaxLength(java.util.Optional<java.lang.Integer> maxLength) {
      this.maxLength = maxLength;
      this.maxLengthIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    public void setReadOnly(java.util.Optional<java.lang.Boolean> readOnly) {
      this.readOnly = readOnly;
      this.readOnlyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("linkId")
    public void setLinkId(java.util.Optional<java.lang.String> linkId) {
      this.linkId = linkId;
      this.linkIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public void setDefinition(java.util.Optional<com.fhir.uri> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.Questionnaire_itemType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<java.lang.String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("answerOption")
    public void setAnswerOption(java.util.Optional<java.util.List<com.fhir.Questionnaire_AnswerOption>> answerOption) {
      this.answerOption = answerOption;
      this.answerOptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    public void setPrefix(java.util.Optional<java.lang.String> prefix) {
      this.prefix = prefix;
      this.prefixIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enableWhen")
    public void setEnableWhen(java.util.Optional<java.util.List<com.fhir.Questionnaire_EnableWhen>> enableWhen) {
      this.enableWhen = enableWhen;
      this.enableWhenIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("initial")
    public void setInitial(java.util.Optional<java.util.List<com.fhir.Questionnaire_Initial>> initial) {
      this.initial = initial;
      this.initialIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("answerValueSet")
    public void setAnswerValueSet(java.util.Optional<com.fhir.canonical> answerValueSet) {
      this.answerValueSet = answerValueSet;
      this.answerValueSetIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.Boolean> repeats() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coding>> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> required() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Questionnaire_itemEnablebehavior> enableBehavior() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Questionnaire_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> maxLength() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> readOnly() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> linkId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> definition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Questionnaire_itemType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Questionnaire_AnswerOption>> answerOption() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> prefix() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Questionnaire_EnableWhen>> enableWhen() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Questionnaire_Initial>> initial() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> answerValueSet() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaire_Item fromJson(Json json) {
    ImmutableQuestionnaire_Item.Builder builder = ImmutableQuestionnaire_Item.builder();
    if (json.repeatsIsSet) {
      builder.repeats(json.repeats);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.requiredIsSet) {
      builder.required(json.required);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.enableBehaviorIsSet) {
      builder.enableBehavior(json.enableBehavior);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.maxLengthIsSet) {
      builder.maxLength(json.maxLength);
    }
    if (json.readOnlyIsSet) {
      builder.readOnly(json.readOnly);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.linkIdIsSet) {
      builder.linkId(json.linkId);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.answerOptionIsSet) {
      builder.answerOption(json.answerOption);
    }
    if (json.prefixIsSet) {
      builder.prefix(json.prefix);
    }
    if (json.enableWhenIsSet) {
      builder.enableWhen(json.enableWhen);
    }
    if (json.initialIsSet) {
      builder.initial(json.initial);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.answerValueSetIsSet) {
      builder.answerValueSet(json.answerValueSet);
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
        .repeats(instance.repeats())
        .code(instance.code())
        .required(instance.required())
        .extension(instance.extension())
        .enableBehavior(instance.enableBehavior())
        .item(instance.item())
        .maxLength(instance.maxLength())
        .readOnly(instance.readOnly())
        .modifierExtension(instance.modifierExtension())
        .linkId(instance.linkId())
        .definition(instance.definition())
        .type(instance.type())
        .text(instance.text())
        .answerOption(instance.answerOption())
        .prefix(instance.prefix())
        .enableWhen(instance.enableWhen())
        .initial(instance.initial())
        .id(instance.id())
        .answerValueSet(instance.answerValueSet())
        .build();
  }

  /**
   * Creates a builder for {@link Questionnaire_Item Questionnaire_Item}.
   * <pre>
   * ImmutableQuestionnaire_Item.builder()
   *    .repeats(Boolean) // optional {@link Questionnaire_Item#repeats() repeats}
   *    .code(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link Questionnaire_Item#code() code}
   *    .required(Boolean) // optional {@link Questionnaire_Item#required() required}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Questionnaire_Item#extension() extension}
   *    .enableBehavior(com.fhir.Questionnaire_itemEnablebehavior) // optional {@link Questionnaire_Item#enableBehavior() enableBehavior}
   *    .item(List&amp;lt;com.fhir.Questionnaire_Item&amp;gt;) // optional {@link Questionnaire_Item#item() item}
   *    .maxLength(Integer) // optional {@link Questionnaire_Item#maxLength() maxLength}
   *    .readOnly(Boolean) // optional {@link Questionnaire_Item#readOnly() readOnly}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Questionnaire_Item#modifierExtension() modifierExtension}
   *    .linkId(String) // optional {@link Questionnaire_Item#linkId() linkId}
   *    .definition(com.fhir.uri) // optional {@link Questionnaire_Item#definition() definition}
   *    .type(com.fhir.Questionnaire_itemType) // optional {@link Questionnaire_Item#type() type}
   *    .text(String) // optional {@link Questionnaire_Item#text() text}
   *    .answerOption(List&amp;lt;com.fhir.Questionnaire_AnswerOption&amp;gt;) // optional {@link Questionnaire_Item#answerOption() answerOption}
   *    .prefix(String) // optional {@link Questionnaire_Item#prefix() prefix}
   *    .enableWhen(List&amp;lt;com.fhir.Questionnaire_EnableWhen&amp;gt;) // optional {@link Questionnaire_Item#enableWhen() enableWhen}
   *    .initial(List&amp;lt;com.fhir.Questionnaire_Initial&amp;gt;) // optional {@link Questionnaire_Item#initial() initial}
   *    .id(String) // optional {@link Questionnaire_Item#id() id}
   *    .answerValueSet(com.fhir.canonical) // optional {@link Questionnaire_Item#answerValueSet() answerValueSet}
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
  @org.immutables.value.Generated(from = "Questionnaire_Item", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_REPEATS = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_REQUIRED = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_ENABLE_BEHAVIOR = 0x10L;
    private static final long OPT_BIT_ITEM = 0x20L;
    private static final long OPT_BIT_MAX_LENGTH = 0x40L;
    private static final long OPT_BIT_READ_ONLY = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_LINK_ID = 0x200L;
    private static final long OPT_BIT_DEFINITION = 0x400L;
    private static final long OPT_BIT_TYPE = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_ANSWER_OPTION = 0x2000L;
    private static final long OPT_BIT_PREFIX = 0x4000L;
    private static final long OPT_BIT_ENABLE_WHEN = 0x8000L;
    private static final long OPT_BIT_INITIAL = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_ANSWER_VALUE_SET = 0x40000L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.Boolean repeats;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coding> code;
    private @javax.annotation.Nullable java.lang.Boolean required;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Questionnaire_itemEnablebehavior enableBehavior;
    private @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> item;
    private @javax.annotation.Nullable java.lang.Integer maxLength;
    private @javax.annotation.Nullable java.lang.Boolean readOnly;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String linkId;
    private @javax.annotation.Nullable com.fhir.uri definition;
    private @javax.annotation.Nullable com.fhir.Questionnaire_itemType type;
    private @javax.annotation.Nullable java.lang.String text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_AnswerOption> answerOption;
    private @javax.annotation.Nullable java.lang.String prefix;
    private @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_EnableWhen> enableWhen;
    private @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Initial> initial;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.canonical answerValueSet;

    private Builder() {
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
    @com.fasterxml.jackson.annotation.JsonProperty("repeats")
    public final Builder repeats(java.util.Optional<java.lang.Boolean> repeats) {
      checkNotIsSet(repeatsIsSet(), "repeats");
      this.repeats = repeats.orElse(null);
      optBits |= OPT_BIT_REPEATS;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(java.util.List<com.fhir.Coding> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends java.util.List<com.fhir.Coding>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
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
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    public final Builder required(java.util.Optional<java.lang.Boolean> required) {
      checkNotIsSet(requiredIsSet(), "required");
      this.required = required.orElse(null);
      optBits |= OPT_BIT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire_Item#enableBehavior() enableBehavior} to enableBehavior.
     * @param enableBehavior The value for enableBehavior
     * @return {@code this} builder for chained invocation
     */
    public final Builder enableBehavior(com.fhir.Questionnaire_itemEnablebehavior enableBehavior) {
      checkNotIsSet(enableBehaviorIsSet(), "enableBehavior");
      this.enableBehavior = java.util.Objects.requireNonNull(enableBehavior, "enableBehavior");
      optBits |= OPT_BIT_ENABLE_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#enableBehavior() enableBehavior} to enableBehavior.
     * @param enableBehavior The value for enableBehavior
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableBehavior")
    public final Builder enableBehavior(java.util.Optional<? extends com.fhir.Questionnaire_itemEnablebehavior> enableBehavior) {
      checkNotIsSet(enableBehaviorIsSet(), "enableBehavior");
      this.enableBehavior = enableBehavior.orElse(null);
      optBits |= OPT_BIT_ENABLE_BEHAVIOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(java.util.List<com.fhir.Questionnaire_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = java.util.Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public final Builder item(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
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
    @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
    public final Builder maxLength(java.util.Optional<java.lang.Integer> maxLength) {
      checkNotIsSet(maxLengthIsSet(), "maxLength");
      this.maxLength = maxLength.orElse(null);
      optBits |= OPT_BIT_MAX_LENGTH;
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
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    public final Builder readOnly(java.util.Optional<java.lang.Boolean> readOnly) {
      checkNotIsSet(readOnlyIsSet(), "readOnly");
      this.readOnly = readOnly.orElse(null);
      optBits |= OPT_BIT_READ_ONLY;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire_Item#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder linkId(java.lang.String linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = java.util.Objects.requireNonNull(linkId, "linkId");
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("linkId")
    public final Builder linkId(java.util.Optional<java.lang.String> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = linkId.orElse(null);
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(com.fhir.uri definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = java.util.Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public final Builder definition(java.util.Optional<? extends com.fhir.uri> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.Questionnaire_itemType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.Questionnaire_itemType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(java.lang.String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<java.lang.String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#answerOption() answerOption} to answerOption.
     * @param answerOption The value for answerOption
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerOption(java.util.List<com.fhir.Questionnaire_AnswerOption> answerOption) {
      checkNotIsSet(answerOptionIsSet(), "answerOption");
      this.answerOption = java.util.Objects.requireNonNull(answerOption, "answerOption");
      optBits |= OPT_BIT_ANSWER_OPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#answerOption() answerOption} to answerOption.
     * @param answerOption The value for answerOption
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("answerOption")
    public final Builder answerOption(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_AnswerOption>> answerOption) {
      checkNotIsSet(answerOptionIsSet(), "answerOption");
      this.answerOption = answerOption.orElse(null);
      optBits |= OPT_BIT_ANSWER_OPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for chained invocation
     */
    public final Builder prefix(java.lang.String prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = java.util.Objects.requireNonNull(prefix, "prefix");
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    public final Builder prefix(java.util.Optional<java.lang.String> prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = prefix.orElse(null);
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#enableWhen() enableWhen} to enableWhen.
     * @param enableWhen The value for enableWhen
     * @return {@code this} builder for chained invocation
     */
    public final Builder enableWhen(java.util.List<com.fhir.Questionnaire_EnableWhen> enableWhen) {
      checkNotIsSet(enableWhenIsSet(), "enableWhen");
      this.enableWhen = java.util.Objects.requireNonNull(enableWhen, "enableWhen");
      optBits |= OPT_BIT_ENABLE_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#enableWhen() enableWhen} to enableWhen.
     * @param enableWhen The value for enableWhen
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableWhen")
    public final Builder enableWhen(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_EnableWhen>> enableWhen) {
      checkNotIsSet(enableWhenIsSet(), "enableWhen");
      this.enableWhen = enableWhen.orElse(null);
      optBits |= OPT_BIT_ENABLE_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#initial() initial} to initial.
     * @param initial The value for initial
     * @return {@code this} builder for chained invocation
     */
    public final Builder initial(java.util.List<com.fhir.Questionnaire_Initial> initial) {
      checkNotIsSet(initialIsSet(), "initial");
      this.initial = java.util.Objects.requireNonNull(initial, "initial");
      optBits |= OPT_BIT_INITIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#initial() initial} to initial.
     * @param initial The value for initial
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initial")
    public final Builder initial(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_Initial>> initial) {
      checkNotIsSet(initialIsSet(), "initial");
      this.initial = initial.orElse(null);
      optBits |= OPT_BIT_INITIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire_Item#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire_Item#answerValueSet() answerValueSet} to answerValueSet.
     * @param answerValueSet The value for answerValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder answerValueSet(com.fhir.canonical answerValueSet) {
      checkNotIsSet(answerValueSetIsSet(), "answerValueSet");
      this.answerValueSet = java.util.Objects.requireNonNull(answerValueSet, "answerValueSet");
      optBits |= OPT_BIT_ANSWER_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire_Item#answerValueSet() answerValueSet} to answerValueSet.
     * @param answerValueSet The value for answerValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("answerValueSet")
    public final Builder answerValueSet(java.util.Optional<? extends com.fhir.canonical> answerValueSet) {
      checkNotIsSet(answerValueSetIsSet(), "answerValueSet");
      this.answerValueSet = answerValueSet.orElse(null);
      optBits |= OPT_BIT_ANSWER_VALUE_SET;
      return this;
    }

    /**
     * Builds a new {@link Questionnaire_Item Questionnaire_Item}.
     * @return An immutable instance of Questionnaire_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Questionnaire_Item build() {
      return new ImmutableQuestionnaire_Item(
          repeats,
          code,
          required,
          extension,
          enableBehavior,
          item,
          maxLength,
          readOnly,
          modifierExtension,
          linkId,
          definition,
          type,
          text,
          answerOption,
          prefix,
          enableWhen,
          initial,
          id,
          answerValueSet);
    }

    private boolean repeatsIsSet() {
      return (optBits & OPT_BIT_REPEATS) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean requiredIsSet() {
      return (optBits & OPT_BIT_REQUIRED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean enableBehaviorIsSet() {
      return (optBits & OPT_BIT_ENABLE_BEHAVIOR) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean maxLengthIsSet() {
      return (optBits & OPT_BIT_MAX_LENGTH) != 0;
    }

    private boolean readOnlyIsSet() {
      return (optBits & OPT_BIT_READ_ONLY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean linkIdIsSet() {
      return (optBits & OPT_BIT_LINK_ID) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean answerOptionIsSet() {
      return (optBits & OPT_BIT_ANSWER_OPTION) != 0;
    }

    private boolean prefixIsSet() {
      return (optBits & OPT_BIT_PREFIX) != 0;
    }

    private boolean enableWhenIsSet() {
      return (optBits & OPT_BIT_ENABLE_WHEN) != 0;
    }

    private boolean initialIsSet() {
      return (optBits & OPT_BIT_INITIAL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean answerValueSetIsSet() {
      return (optBits & OPT_BIT_ANSWER_VALUE_SET) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Questionnaire_Item is strict, attribute is already set: ".concat(name));
    }
  }
}
