package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Composition_Section}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableComposition_Section.builder()}.
 */
@Generated(from = "Composition_Section", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableComposition_Section implements Composition_Section {
  private final @Nullable Code mode;
  private final @Nullable String title;
  private final @Nullable CodeableConcept orderedBy;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Reference> author;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> entry;
  private final @Nullable Reference focus;
  private final @Nullable Narrative text;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Composition_Section> section;
  private final @Nullable CodeableConcept emptyReason;

  private ImmutableComposition_Section(
      @Nullable Code mode,
      @Nullable String title,
      @Nullable CodeableConcept orderedBy,
      @Nullable CodeableConcept code,
      @Nullable List<Reference> author,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> entry,
      @Nullable Reference focus,
      @Nullable Narrative text,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Composition_Section> section,
      @Nullable CodeableConcept emptyReason) {
    this.mode = mode;
    this.title = title;
    this.orderedBy = orderedBy;
    this.code = code;
    this.author = author;
    this.modifierExtension = modifierExtension;
    this.entry = entry;
    this.focus = focus;
    this.text = text;
    this.id = id;
    this.extension = extension;
    this.section = section;
    this.emptyReason = emptyReason;
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<Code> mode() {
    return Optional.ofNullable(mode);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code orderedBy} attribute
   */
  @JsonProperty("orderedBy")
  @Override
  public Optional<CodeableConcept> orderedBy() {
    return Optional.ofNullable(orderedBy);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<List<Reference>> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code entry} attribute
   */
  @JsonProperty("entry")
  @Override
  public Optional<List<Reference>> entry() {
    return Optional.ofNullable(entry);
  }

  /**
   * @return The value of the {@code focus} attribute
   */
  @JsonProperty("focus")
  @Override
  public Optional<Reference> focus() {
    return Optional.ofNullable(focus);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code section} attribute
   */
  @JsonProperty("section")
  @Override
  public Optional<List<Composition_Section>> section() {
    return Optional.ofNullable(section);
  }

  /**
   * @return The value of the {@code emptyReason} attribute
   */
  @JsonProperty("emptyReason")
  @Override
  public Optional<CodeableConcept> emptyReason() {
    return Optional.ofNullable(emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withMode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableComposition_Section(
        newValue,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withMode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableComposition_Section(
        value,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableComposition_Section(
        this.mode,
        newValue,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableComposition_Section(
        this.mode,
        value,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#orderedBy() orderedBy} attribute.
   * @param value The value for orderedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withOrderedBy(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "orderedBy");
    if (this.orderedBy == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        newValue,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#orderedBy() orderedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withOrderedBy(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.orderedBy == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        value,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        newValue,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        value,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withAuthor(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        newValue,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withAuthor(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        value,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        newValue,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        value,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#entry() entry} attribute.
   * @param value The value for entry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withEntry(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "entry");
    if (this.entry == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        newValue,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#entry() entry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withEntry(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.entry == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        value,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withFocus(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        newValue,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withFocus(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        value,
        this.text,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        newValue,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        value,
        this.id,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        newValue,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        value,
        this.extension,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        newValue,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        value,
        this.section,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#section() section} attribute.
   * @param value The value for section
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withSection(List<Composition_Section> value) {
    @Nullable List<Composition_Section> newValue = Objects.requireNonNull(value, "section");
    if (this.section == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        newValue,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#section() section} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for section
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withSection(Optional<? extends List<Composition_Section>> optional) {
    @Nullable List<Composition_Section> value = optional.orElse(null);
    if (this.section == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        value,
        this.emptyReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#emptyReason() emptyReason} attribute.
   * @param value The value for emptyReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withEmptyReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "emptyReason");
    if (this.emptyReason == newValue) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#emptyReason() emptyReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for emptyReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withEmptyReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.emptyReason == value) return this;
    return new ImmutableComposition_Section(
        this.mode,
        this.title,
        this.orderedBy,
        this.code,
        this.author,
        this.modifierExtension,
        this.entry,
        this.focus,
        this.text,
        this.id,
        this.extension,
        this.section,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableComposition_Section} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableComposition_Section
        && equalTo((ImmutableComposition_Section) another);
  }

  private boolean equalTo(ImmutableComposition_Section another) {
    return Objects.equals(mode, another.mode)
        && Objects.equals(title, another.title)
        && Objects.equals(orderedBy, another.orderedBy)
        && Objects.equals(code, another.code)
        && Objects.equals(author, another.author)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(entry, another.entry)
        && Objects.equals(focus, another.focus)
        && Objects.equals(text, another.text)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(section, another.section)
        && Objects.equals(emptyReason, another.emptyReason);
  }

  /**
   * Computes a hash code from attributes: {@code mode}, {@code title}, {@code orderedBy}, {@code code}, {@code author}, {@code modifierExtension}, {@code entry}, {@code focus}, {@code text}, {@code id}, {@code extension}, {@code section}, {@code emptyReason}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(mode);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(orderedBy);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(entry);
    h += (h << 5) + Objects.hashCode(focus);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(section);
    h += (h << 5) + Objects.hashCode(emptyReason);
    return h;
  }

  /**
   * Prints the immutable value {@code Composition_Section} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Composition_Section{");
    if (mode != null) {
      builder.append("mode=").append(mode);
    }
    if (title != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (orderedBy != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("orderedBy=").append(orderedBy);
    }
    if (code != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (author != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (entry != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("entry=").append(entry);
    }
    if (focus != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (section != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("section=").append(section);
    }
    if (emptyReason != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("emptyReason=").append(emptyReason);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Composition_Section", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Composition_Section {
    @Nullable Optional<Code> mode = Optional.empty();
    boolean modeIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<CodeableConcept> orderedBy = Optional.empty();
    boolean orderedByIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Reference>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> entry = Optional.empty();
    boolean entryIsSet;
    @Nullable Optional<Reference> focus = Optional.empty();
    boolean focusIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Composition_Section>> section = Optional.empty();
    boolean sectionIsSet;
    @Nullable Optional<CodeableConcept> emptyReason = Optional.empty();
    boolean emptyReasonIsSet;
    @JsonProperty("mode")
    public void setMode(Optional<Code> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("orderedBy")
    public void setOrderedBy(Optional<CodeableConcept> orderedBy) {
      this.orderedBy = orderedBy;
      this.orderedByIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<Reference>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("entry")
    public void setEntry(Optional<List<Reference>> entry) {
      this.entry = entry;
      this.entryIsSet = true;
    }
    @JsonProperty("focus")
    public void setFocus(Optional<Reference> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("section")
    public void setSection(Optional<List<Composition_Section>> section) {
      this.section = section;
      this.sectionIsSet = true;
    }
    @JsonProperty("emptyReason")
    public void setEmptyReason(Optional<CodeableConcept> emptyReason) {
      this.emptyReason = emptyReason;
      this.emptyReasonIsSet = true;
    }
    @Override
    public Optional<Code> mode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> orderedBy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> entry() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> focus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Composition_Section>> section() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> emptyReason() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableComposition_Section fromJson(Json json) {
    ImmutableComposition_Section.Builder builder = ImmutableComposition_Section.builder();
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.orderedByIsSet) {
      builder.orderedBy(json.orderedBy);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.entryIsSet) {
      builder.entry(json.entry);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.sectionIsSet) {
      builder.section(json.section);
    }
    if (json.emptyReasonIsSet) {
      builder.emptyReason(json.emptyReason);
    }
    return (ImmutableComposition_Section) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Composition_Section} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Composition_Section instance
   */
  public static Composition_Section copyOf(Composition_Section instance) {
    if (instance instanceof ImmutableComposition_Section) {
      return (ImmutableComposition_Section) instance;
    }
    return ImmutableComposition_Section.builder()
        .mode(instance.mode())
        .title(instance.title())
        .orderedBy(instance.orderedBy())
        .code(instance.code())
        .author(instance.author())
        .modifierExtension(instance.modifierExtension())
        .entry(instance.entry())
        .focus(instance.focus())
        .text(instance.text())
        .id(instance.id())
        .extension(instance.extension())
        .section(instance.section())
        .emptyReason(instance.emptyReason())
        .build();
  }

  /**
   * Creates a builder for {@link Composition_Section Composition_Section}.
   * <pre>
   * ImmutableComposition_Section.builder()
   *    .mode(com.fhir.types.fhir.Code) // optional {@link Composition_Section#mode() mode}
   *    .title(String) // optional {@link Composition_Section#title() title}
   *    .orderedBy(com.fhir.types.fhir.CodeableConcept) // optional {@link Composition_Section#orderedBy() orderedBy}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Composition_Section#code() code}
   *    .author(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Composition_Section#author() author}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Composition_Section#modifierExtension() modifierExtension}
   *    .entry(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Composition_Section#entry() entry}
   *    .focus(com.fhir.types.fhir.Reference) // optional {@link Composition_Section#focus() focus}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Composition_Section#text() text}
   *    .id(String) // optional {@link Composition_Section#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Composition_Section#extension() extension}
   *    .section(List&amp;lt;com.fhir.types.fhir.Composition_Section&amp;gt;) // optional {@link Composition_Section#section() section}
   *    .emptyReason(com.fhir.types.fhir.CodeableConcept) // optional {@link Composition_Section#emptyReason() emptyReason}
   *    .build();
   * </pre>
   * @return A new Composition_Section builder
   */
  public static ImmutableComposition_Section.Builder builder() {
    return new ImmutableComposition_Section.Builder();
  }

  /**
   * Builds instances of type {@link Composition_Section Composition_Section}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Composition_Section", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODE = 0x1L;
    private static final long OPT_BIT_TITLE = 0x2L;
    private static final long OPT_BIT_ORDERED_BY = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_AUTHOR = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_ENTRY = 0x40L;
    private static final long OPT_BIT_FOCUS = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_SECTION = 0x800L;
    private static final long OPT_BIT_EMPTY_REASON = 0x1000L;
    private long optBits;

    private @Nullable Code mode;
    private @Nullable String title;
    private @Nullable CodeableConcept orderedBy;
    private @Nullable CodeableConcept code;
    private @Nullable List<Reference> author;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> entry;
    private @Nullable Reference focus;
    private @Nullable Narrative text;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Composition_Section> section;
    private @Nullable CodeableConcept emptyReason;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Composition_Section#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(Code mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends Code> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder orderedBy(CodeableConcept orderedBy) {
      checkNotIsSet(orderedByIsSet(), "orderedBy");
      this.orderedBy = Objects.requireNonNull(orderedBy, "orderedBy");
      optBits |= OPT_BIT_ORDERED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("orderedBy")
    public final Builder orderedBy(Optional<? extends CodeableConcept> orderedBy) {
      checkNotIsSet(orderedByIsSet(), "orderedBy");
      this.orderedBy = orderedBy.orElse(null);
      optBits |= OPT_BIT_ORDERED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#code() code} to code.
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
     * Initializes the optional value {@link Composition_Section#code() code} to code.
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
     * Initializes the optional value {@link Composition_Section#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(List<Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends List<Reference>> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_Section#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_Section#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    public final Builder entry(List<Reference> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = Objects.requireNonNull(entry, "entry");
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entry")
    public final Builder entry(Optional<? extends List<Reference>> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = entry.orElse(null);
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(Reference focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("focus")
    public final Builder focus(Optional<? extends Reference> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#id() id} to id.
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
     * Initializes the optional value {@link Composition_Section#id() id} to id.
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
     * Initializes the optional value {@link Composition_Section#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_Section#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_Section#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for chained invocation
     */
    public final Builder section(List<Composition_Section> section) {
      checkNotIsSet(sectionIsSet(), "section");
      this.section = Objects.requireNonNull(section, "section");
      optBits |= OPT_BIT_SECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("section")
    public final Builder section(Optional<? extends List<Composition_Section>> section) {
      checkNotIsSet(sectionIsSet(), "section");
      this.section = section.orElse(null);
      optBits |= OPT_BIT_SECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder emptyReason(CodeableConcept emptyReason) {
      checkNotIsSet(emptyReasonIsSet(), "emptyReason");
      this.emptyReason = Objects.requireNonNull(emptyReason, "emptyReason");
      optBits |= OPT_BIT_EMPTY_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("emptyReason")
    public final Builder emptyReason(Optional<? extends CodeableConcept> emptyReason) {
      checkNotIsSet(emptyReasonIsSet(), "emptyReason");
      this.emptyReason = emptyReason.orElse(null);
      optBits |= OPT_BIT_EMPTY_REASON;
      return this;
    }

    /**
     * Builds a new {@link Composition_Section Composition_Section}.
     * @return An immutable instance of Composition_Section
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Composition_Section build() {
      return new ImmutableComposition_Section(
          mode,
          title,
          orderedBy,
          code,
          author,
          modifierExtension,
          entry,
          focus,
          text,
          id,
          extension,
          section,
          emptyReason);
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean orderedByIsSet() {
      return (optBits & OPT_BIT_ORDERED_BY) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean entryIsSet() {
      return (optBits & OPT_BIT_ENTRY) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sectionIsSet() {
      return (optBits & OPT_BIT_SECTION) != 0;
    }

    private boolean emptyReasonIsSet() {
      return (optBits & OPT_BIT_EMPTY_REASON) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Composition_Section is strict, attribute is already set: ".concat(name));
    }
  }
}
