//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Composition_Section}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableComposition_Section.builder()}.
 */
@org.immutables.value.Generated(from = "Composition_Section", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableComposition_Section implements com.fhir.Composition_Section {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept orderedBy;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept emptyReason;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Reference focus;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.code mode;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> section;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> entry;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableComposition_Section(
      @javax.annotation.Nullable com.fhir.CodeableConcept orderedBy,
      @javax.annotation.Nullable com.fhir.CodeableConcept emptyReason,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Reference focus,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> author,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.code mode,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> section,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> entry,
      @javax.annotation.Nullable java.lang.String id) {
    this.orderedBy = orderedBy;
    this.emptyReason = emptyReason;
    this.modifierExtension = modifierExtension;
    this.focus = focus;
    this.title = title;
    this.author = author;
    this.extension = extension;
    this.code = code;
    this.mode = mode;
    this.text = text;
    this.section = section;
    this.entry = entry;
    this.id = id;
  }

  /**
   * @return The value of the {@code orderedBy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("orderedBy")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> orderedBy() {
    return java.util.Optional.ofNullable(orderedBy);
  }

  /**
   * @return The value of the {@code emptyReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("emptyReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> emptyReason() {
    return java.util.Optional.ofNullable(emptyReason);
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
   * @return The value of the {@code focus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("focus")
  @Override
  public java.util.Optional<com.fhir.Reference> focus() {
    return java.util.Optional.ofNullable(focus);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> author() {
    return java.util.Optional.ofNullable(author);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mode")
  @Override
  public java.util.Optional<com.fhir.code> mode() {
    return java.util.Optional.ofNullable(mode);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code section} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("section")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Composition_Section>> section() {
    return java.util.Optional.ofNullable(section);
  }

  /**
   * @return The value of the {@code entry} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("entry")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> entry() {
    return java.util.Optional.ofNullable(entry);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#orderedBy() orderedBy} attribute.
   * @param value The value for orderedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withOrderedBy(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "orderedBy");
    if (this.orderedBy == newValue) return this;
    return new ImmutableComposition_Section(
        newValue,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#orderedBy() orderedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withOrderedBy(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.orderedBy == value) return this;
    return new ImmutableComposition_Section(
        value,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#emptyReason() emptyReason} attribute.
   * @param value The value for emptyReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withEmptyReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "emptyReason");
    if (this.emptyReason == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        newValue,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#emptyReason() emptyReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for emptyReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withEmptyReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.emptyReason == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        value,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        newValue,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        value,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withFocus(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        newValue,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withFocus(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        value,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        newValue,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        value,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withAuthor(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        newValue,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withAuthor(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        value,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        newValue,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        value,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        newValue,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        value,
        this.mode,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withMode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        newValue,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withMode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        value,
        this.text,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        newValue,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        value,
        this.section,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#section() section} attribute.
   * @param value The value for section
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withSection(java.util.List<com.fhir.Composition_Section> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> newValue = java.util.Objects.requireNonNull(value, "section");
    if (this.section == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        newValue,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#section() section} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for section
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withSection(java.util.Optional<? extends java.util.List<com.fhir.Composition_Section>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> value = optional.orElse(null);
    if (this.section == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        value,
        this.entry,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#entry() entry} attribute.
   * @param value The value for entry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withEntry(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "entry");
    if (this.entry == newValue) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#entry() entry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_Section withEntry(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.entry == value) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_Section#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_Section#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_Section withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableComposition_Section(
        this.orderedBy,
        this.emptyReason,
        this.modifierExtension,
        this.focus,
        this.title,
        this.author,
        this.extension,
        this.code,
        this.mode,
        this.text,
        this.section,
        this.entry,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableComposition_Section} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableComposition_Section
        && equalTo((ImmutableComposition_Section) another);
  }

  private boolean equalTo(ImmutableComposition_Section another) {
    return java.util.Objects.equals(orderedBy, another.orderedBy)
        && java.util.Objects.equals(emptyReason, another.emptyReason)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(focus, another.focus)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(mode, another.mode)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(section, another.section)
        && java.util.Objects.equals(entry, another.entry)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code orderedBy}, {@code emptyReason}, {@code modifierExtension}, {@code focus}, {@code title}, {@code author}, {@code extension}, {@code code}, {@code mode}, {@code text}, {@code section}, {@code entry}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(orderedBy);
    h += (h << 5) + java.util.Objects.hashCode(emptyReason);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(focus);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(mode);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(section);
    h += (h << 5) + java.util.Objects.hashCode(entry);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Composition_Section} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Composition_Section{");
    if (orderedBy != null) {
      builder.append("orderedBy=").append(orderedBy);
    }
    if (emptyReason != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("emptyReason=").append(emptyReason);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (focus != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (title != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (author != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (mode != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (section != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("section=").append(section);
    }
    if (entry != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("entry=").append(entry);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Composition_Section", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Composition_Section {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> orderedBy = java.util.Optional.empty();
    boolean orderedByIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> emptyReason = java.util.Optional.empty();
    boolean emptyReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> focus = java.util.Optional.empty();
    boolean focusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> mode = java.util.Optional.empty();
    boolean modeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Composition_Section>> section = java.util.Optional.empty();
    boolean sectionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> entry = java.util.Optional.empty();
    boolean entryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("orderedBy")
    public void setOrderedBy(java.util.Optional<com.fhir.CodeableConcept> orderedBy) {
      this.orderedBy = orderedBy;
      this.orderedByIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("emptyReason")
    public void setEmptyReason(java.util.Optional<com.fhir.CodeableConcept> emptyReason) {
      this.emptyReason = emptyReason;
      this.emptyReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public void setFocus(java.util.Optional<com.fhir.Reference> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.Reference>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public void setMode(java.util.Optional<com.fhir.code> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("section")
    public void setSection(java.util.Optional<java.util.List<com.fhir.Composition_Section>> section) {
      this.section = section;
      this.sectionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("entry")
    public void setEntry(java.util.Optional<java.util.List<com.fhir.Reference>> entry) {
      this.entry = entry;
      this.entryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> orderedBy() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> emptyReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> focus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> mode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Composition_Section>> section() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> entry() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableComposition_Section fromJson(Json json) {
    ImmutableComposition_Section.Builder builder = ImmutableComposition_Section.builder();
    if (json.orderedByIsSet) {
      builder.orderedBy(json.orderedBy);
    }
    if (json.emptyReasonIsSet) {
      builder.emptyReason(json.emptyReason);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.sectionIsSet) {
      builder.section(json.section);
    }
    if (json.entryIsSet) {
      builder.entry(json.entry);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .orderedBy(instance.orderedBy())
        .emptyReason(instance.emptyReason())
        .modifierExtension(instance.modifierExtension())
        .focus(instance.focus())
        .title(instance.title())
        .author(instance.author())
        .extension(instance.extension())
        .code(instance.code())
        .mode(instance.mode())
        .text(instance.text())
        .section(instance.section())
        .entry(instance.entry())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Composition_Section Composition_Section}.
   * <pre>
   * ImmutableComposition_Section.builder()
   *    .orderedBy(com.fhir.CodeableConcept) // optional {@link Composition_Section#orderedBy() orderedBy}
   *    .emptyReason(com.fhir.CodeableConcept) // optional {@link Composition_Section#emptyReason() emptyReason}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Composition_Section#modifierExtension() modifierExtension}
   *    .focus(com.fhir.Reference) // optional {@link Composition_Section#focus() focus}
   *    .title(String) // optional {@link Composition_Section#title() title}
   *    .author(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Composition_Section#author() author}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Composition_Section#extension() extension}
   *    .code(com.fhir.CodeableConcept) // optional {@link Composition_Section#code() code}
   *    .mode(com.fhir.code) // optional {@link Composition_Section#mode() mode}
   *    .text(com.fhir.Narrative) // optional {@link Composition_Section#text() text}
   *    .section(List&amp;lt;com.fhir.Composition_Section&amp;gt;) // optional {@link Composition_Section#section() section}
   *    .entry(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Composition_Section#entry() entry}
   *    .id(String) // optional {@link Composition_Section#id() id}
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
  @org.immutables.value.Generated(from = "Composition_Section", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ORDERED_BY = 0x1L;
    private static final long OPT_BIT_EMPTY_REASON = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_FOCUS = 0x8L;
    private static final long OPT_BIT_TITLE = 0x10L;
    private static final long OPT_BIT_AUTHOR = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_CODE = 0x80L;
    private static final long OPT_BIT_MODE = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_SECTION = 0x400L;
    private static final long OPT_BIT_ENTRY = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept orderedBy;
    private @javax.annotation.Nullable com.fhir.CodeableConcept emptyReason;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference focus;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> author;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.code mode;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> section;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> entry;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Composition_Section#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder orderedBy(com.fhir.CodeableConcept orderedBy) {
      checkNotIsSet(orderedByIsSet(), "orderedBy");
      this.orderedBy = java.util.Objects.requireNonNull(orderedBy, "orderedBy");
      optBits |= OPT_BIT_ORDERED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("orderedBy")
    public final Builder orderedBy(java.util.Optional<? extends com.fhir.CodeableConcept> orderedBy) {
      checkNotIsSet(orderedByIsSet(), "orderedBy");
      this.orderedBy = orderedBy.orElse(null);
      optBits |= OPT_BIT_ORDERED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder emptyReason(com.fhir.CodeableConcept emptyReason) {
      checkNotIsSet(emptyReasonIsSet(), "emptyReason");
      this.emptyReason = java.util.Objects.requireNonNull(emptyReason, "emptyReason");
      optBits |= OPT_BIT_EMPTY_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emptyReason")
    public final Builder emptyReason(java.util.Optional<? extends com.fhir.CodeableConcept> emptyReason) {
      checkNotIsSet(emptyReasonIsSet(), "emptyReason");
      this.emptyReason = emptyReason.orElse(null);
      optBits |= OPT_BIT_EMPTY_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_Section#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_Section#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(com.fhir.Reference focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = java.util.Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public final Builder focus(java.util.Optional<? extends com.fhir.Reference> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(java.lang.String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = java.util.Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public final Builder title(java.util.Optional<java.lang.String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(java.util.List<com.fhir.Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = java.util.Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public final Builder author(java.util.Optional<? extends java.util.List<com.fhir.Reference>> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_Section#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_Section#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(com.fhir.code mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = java.util.Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public final Builder mode(java.util.Optional<? extends com.fhir.code> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for chained invocation
     */
    public final Builder section(java.util.List<com.fhir.Composition_Section> section) {
      checkNotIsSet(sectionIsSet(), "section");
      this.section = java.util.Objects.requireNonNull(section, "section");
      optBits |= OPT_BIT_SECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("section")
    public final Builder section(java.util.Optional<? extends java.util.List<com.fhir.Composition_Section>> section) {
      checkNotIsSet(sectionIsSet(), "section");
      this.section = section.orElse(null);
      optBits |= OPT_BIT_SECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    public final Builder entry(java.util.List<com.fhir.Reference> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = java.util.Objects.requireNonNull(entry, "entry");
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entry")
    public final Builder entry(java.util.Optional<? extends java.util.List<com.fhir.Reference>> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = entry.orElse(null);
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_Section#id() id} to id.
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
     * Initializes the optional value {@link Composition_Section#id() id} to id.
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
     * Builds a new {@link Composition_Section Composition_Section}.
     * @return An immutable instance of Composition_Section
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Composition_Section build() {
      return new ImmutableComposition_Section(
          orderedBy,
          emptyReason,
          modifierExtension,
          focus,
          title,
          author,
          extension,
          code,
          mode,
          text,
          section,
          entry,
          id);
    }

    private boolean orderedByIsSet() {
      return (optBits & OPT_BIT_ORDERED_BY) != 0;
    }

    private boolean emptyReasonIsSet() {
      return (optBits & OPT_BIT_EMPTY_REASON) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean sectionIsSet() {
      return (optBits & OPT_BIT_SECTION) != 0;
    }

    private boolean entryIsSet() {
      return (optBits & OPT_BIT_ENTRY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Composition_Section is strict, attribute is already set: ".concat(name));
    }
  }
}
