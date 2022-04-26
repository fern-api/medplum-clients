package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link List}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableList.builder()}.
 */
@Generated(from = "List", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableList implements List {
  private final @Nullable Uri implicitRules;
  private final @Nullable Narrative text;
  private final @Nullable java.util.List<Extension> extension;
  private final @Nullable java.util.List<Identifier> identifier;
  private final String resourceType;
  private final @Nullable java.util.List<List_Entry> entry;
  private final @Nullable Id id;
  private final @Nullable ListStatus status;
  private final @Nullable Meta meta;
  private final @Nullable ListMode mode;
  private final @Nullable java.util.List<ResourceList> contained;
  private final @Nullable CodeableConcept emptyReason;
  private final @Nullable CodeableConcept orderedBy;
  private final @Nullable String title;
  private final @Nullable Reference encounter;
  private final @Nullable Code language;
  private final @Nullable DateTime date;
  private final @Nullable java.util.List<Extension> modifierExtension;
  private final @Nullable CodeableConcept code;
  private final @Nullable Reference subject;
  private final @Nullable java.util.List<Annotation> note;
  private final @Nullable Reference source;

  private ImmutableList(
      @Nullable Uri implicitRules,
      @Nullable Narrative text,
      @Nullable java.util.List<Extension> extension,
      @Nullable java.util.List<Identifier> identifier,
      String resourceType,
      @Nullable java.util.List<List_Entry> entry,
      @Nullable Id id,
      @Nullable ListStatus status,
      @Nullable Meta meta,
      @Nullable ListMode mode,
      @Nullable java.util.List<ResourceList> contained,
      @Nullable CodeableConcept emptyReason,
      @Nullable CodeableConcept orderedBy,
      @Nullable String title,
      @Nullable Reference encounter,
      @Nullable Code language,
      @Nullable DateTime date,
      @Nullable java.util.List<Extension> modifierExtension,
      @Nullable CodeableConcept code,
      @Nullable Reference subject,
      @Nullable java.util.List<Annotation> note,
      @Nullable Reference source) {
    this.implicitRules = implicitRules;
    this.text = text;
    this.extension = extension;
    this.identifier = identifier;
    this.resourceType = resourceType;
    this.entry = entry;
    this.id = id;
    this.status = status;
    this.meta = meta;
    this.mode = mode;
    this.contained = contained;
    this.emptyReason = emptyReason;
    this.orderedBy = orderedBy;
    this.title = title;
    this.encounter = encounter;
    this.language = language;
    this.date = date;
    this.modifierExtension = modifierExtension;
    this.code = code;
    this.subject = subject;
    this.note = note;
    this.source = source;
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<java.util.List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<java.util.List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code entry} attribute
   */
  @JsonProperty("entry")
  @Override
  public Optional<java.util.List<List_Entry>> entry() {
    return Optional.ofNullable(entry);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ListStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<ListMode> mode() {
    return Optional.ofNullable(mode);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<java.util.List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code orderedBy} attribute
   */
  @JsonProperty("orderedBy")
  @Override
  public Optional<CodeableConcept> orderedBy() {
    return Optional.ofNullable(orderedBy);
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
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<java.util.List<Extension>> modifierExtension() {
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<java.util.List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<Reference> source() {
    return Optional.ofNullable(source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableList(
        newValue,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableList(
        value,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        newValue,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableList(
        this.implicitRules,
        value,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withExtension(java.util.List<Extension> value) {
    @Nullable java.util.List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        newValue,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withExtension(Optional<? extends java.util.List<Extension>> optional) {
    @Nullable java.util.List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        value,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withIdentifier(java.util.List<Identifier> value) {
    @Nullable java.util.List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        newValue,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withIdentifier(Optional<? extends java.util.List<Identifier>> optional) {
    @Nullable java.util.List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        value,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link List#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableList withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        newValue,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#entry() entry} attribute.
   * @param value The value for entry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withEntry(java.util.List<List_Entry> value) {
    @Nullable java.util.List<List_Entry> newValue = Objects.requireNonNull(value, "entry");
    if (this.entry == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        newValue,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#entry() entry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withEntry(Optional<? extends java.util.List<List_Entry>> optional) {
    @Nullable java.util.List<List_Entry> value = optional.orElse(null);
    if (this.entry == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        value,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        newValue,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        value,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withStatus(ListStatus value) {
    @Nullable ListStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        newValue,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withStatus(Optional<? extends ListStatus> optional) {
    @Nullable ListStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        value,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        newValue,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        value,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withMode(ListMode value) {
    @Nullable ListMode newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        newValue,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withMode(Optional<? extends ListMode> optional) {
    @Nullable ListMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        value,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withContained(java.util.List<ResourceList> value) {
    @Nullable java.util.List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        newValue,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withContained(Optional<? extends java.util.List<ResourceList>> optional) {
    @Nullable java.util.List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        value,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#emptyReason() emptyReason} attribute.
   * @param value The value for emptyReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withEmptyReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "emptyReason");
    if (this.emptyReason == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        newValue,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#emptyReason() emptyReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for emptyReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withEmptyReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.emptyReason == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        value,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#orderedBy() orderedBy} attribute.
   * @param value The value for orderedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withOrderedBy(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "orderedBy");
    if (this.orderedBy == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        newValue,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#orderedBy() orderedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withOrderedBy(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.orderedBy == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        value,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        newValue,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        value,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        newValue,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        value,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        newValue,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        value,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        newValue,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        value,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withModifierExtension(java.util.List<Extension> value) {
    @Nullable java.util.List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        newValue,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withModifierExtension(Optional<? extends java.util.List<Extension>> optional) {
    @Nullable java.util.List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        value,
        this.code,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        newValue,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        value,
        this.subject,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        newValue,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        value,
        this.note,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withNote(java.util.List<Annotation> value) {
    @Nullable java.util.List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        newValue,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withNote(Optional<? extends java.util.List<Annotation>> optional) {
    @Nullable java.util.List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        value,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withSource(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withSource(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableList(
        this.implicitRules,
        this.text,
        this.extension,
        this.identifier,
        this.resourceType,
        this.entry,
        this.id,
        this.status,
        this.meta,
        this.mode,
        this.contained,
        this.emptyReason,
        this.orderedBy,
        this.title,
        this.encounter,
        this.language,
        this.date,
        this.modifierExtension,
        this.code,
        this.subject,
        this.note,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableList} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableList
        && equalTo((ImmutableList) another);
  }

  private boolean equalTo(ImmutableList another) {
    return Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(text, another.text)
        && Objects.equals(extension, another.extension)
        && Objects.equals(identifier, another.identifier)
        && resourceType.equals(another.resourceType)
        && Objects.equals(entry, another.entry)
        && Objects.equals(id, another.id)
        && Objects.equals(status, another.status)
        && Objects.equals(meta, another.meta)
        && Objects.equals(mode, another.mode)
        && Objects.equals(contained, another.contained)
        && Objects.equals(emptyReason, another.emptyReason)
        && Objects.equals(orderedBy, another.orderedBy)
        && Objects.equals(title, another.title)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(language, another.language)
        && Objects.equals(date, another.date)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(code, another.code)
        && Objects.equals(subject, another.subject)
        && Objects.equals(note, another.note)
        && Objects.equals(source, another.source);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code text}, {@code extension}, {@code identifier}, {@code resourceType}, {@code entry}, {@code id}, {@code status}, {@code meta}, {@code mode}, {@code contained}, {@code emptyReason}, {@code orderedBy}, {@code title}, {@code encounter}, {@code language}, {@code date}, {@code modifierExtension}, {@code code}, {@code subject}, {@code note}, {@code source}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(entry);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(mode);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(emptyReason);
    h += (h << 5) + Objects.hashCode(orderedBy);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(source);
    return h;
  }

  /**
   * Prints the immutable value {@code List} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("List{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (extension != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (entry != null) {
      builder.append(", ");
      builder.append("entry=").append(entry);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (mode != null) {
      builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (emptyReason != null) {
      builder.append(", ");
      builder.append("emptyReason=").append(emptyReason);
    }
    if (orderedBy != null) {
      builder.append(", ");
      builder.append("orderedBy=").append(orderedBy);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "List", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements List {
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<java.util.List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<java.util.List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable String resourceType;
    @Nullable Optional<java.util.List<List_Entry>> entry = Optional.empty();
    boolean entryIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<ListStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<ListMode> mode = Optional.empty();
    boolean modeIsSet;
    @Nullable Optional<java.util.List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<CodeableConcept> emptyReason = Optional.empty();
    boolean emptyReasonIsSet;
    @Nullable Optional<CodeableConcept> orderedBy = Optional.empty();
    boolean orderedByIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<java.util.List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<java.util.List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Reference> source = Optional.empty();
    boolean sourceIsSet;
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<java.util.List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<java.util.List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("entry")
    public void setEntry(Optional<java.util.List<List_Entry>> entry) {
      this.entry = entry;
      this.entryIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ListStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("mode")
    public void setMode(Optional<ListMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<java.util.List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("emptyReason")
    public void setEmptyReason(Optional<CodeableConcept> emptyReason) {
      this.emptyReason = emptyReason;
      this.emptyReasonIsSet = true;
    }
    @JsonProperty("orderedBy")
    public void setOrderedBy(Optional<CodeableConcept> orderedBy) {
      this.orderedBy = orderedBy;
      this.orderedByIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<java.util.List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<java.util.List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<java.util.List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<java.util.List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<java.util.List<List_Entry>> entry() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ListStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ListMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<java.util.List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> emptyReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> orderedBy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<java.util.List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<java.util.List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> source() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableList fromJson(Json json) {
    ImmutableList.Builder builder = ((ImmutableList.Builder) ImmutableList.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.entryIsSet) {
      builder.entry(json.entry);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.emptyReasonIsSet) {
      builder.emptyReason(json.emptyReason);
    }
    if (json.orderedByIsSet) {
      builder.orderedBy(json.orderedBy);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    return (ImmutableList) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link List} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable List instance
   */
  public static List copyOf(List instance) {
    if (instance instanceof ImmutableList) {
      return (ImmutableList) instance;
    }
    return ((ImmutableList.Builder) ImmutableList.builder())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .resourceType(instance.resourceType())
        .entry(instance.entry())
        .id(instance.id())
        .status(instance.status())
        .meta(instance.meta())
        .mode(instance.mode())
        .contained(instance.contained())
        .emptyReason(instance.emptyReason())
        .orderedBy(instance.orderedBy())
        .title(instance.title())
        .encounter(instance.encounter())
        .language(instance.language())
        .date(instance.date())
        .modifierExtension(instance.modifierExtension())
        .code(instance.code())
        .subject(instance.subject())
        .note(instance.note())
        .source(instance.source())
        .build();
  }

  /**
   * Creates a builder for {@link List List}.
   * <pre>
   * ImmutableList.builder()
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link List#implicitRules() implicitRules}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link List#text() text}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link List#extension() extension}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link List#identifier() identifier}
   *    .resourceType(String) // required {@link List#resourceType() resourceType}
   *    .entry(List&amp;lt;com.fhir.types.fhir.List_Entry&amp;gt;) // optional {@link List#entry() entry}
   *    .id(com.fhir.types.fhir.Id) // optional {@link List#id() id}
   *    .status(com.fhir.types.fhir.ListStatus) // optional {@link List#status() status}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link List#meta() meta}
   *    .mode(com.fhir.types.fhir.ListMode) // optional {@link List#mode() mode}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link List#contained() contained}
   *    .emptyReason(com.fhir.types.fhir.CodeableConcept) // optional {@link List#emptyReason() emptyReason}
   *    .orderedBy(com.fhir.types.fhir.CodeableConcept) // optional {@link List#orderedBy() orderedBy}
   *    .title(String) // optional {@link List#title() title}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link List#encounter() encounter}
   *    .language(com.fhir.types.fhir.Code) // optional {@link List#language() language}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link List#date() date}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link List#modifierExtension() modifierExtension}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link List#code() code}
   *    .subject(com.fhir.types.fhir.Reference) // optional {@link List#subject() subject}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link List#note() note}
   *    .source(com.fhir.types.fhir.Reference) // optional {@link List#source() source}
   *    .build();
   * </pre>
   * @return A new List builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableList.Builder();
  }

  /**
   * Builds instances of type {@link List List}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "List", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_ENTRY = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_STATUS = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_MODE = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_EMPTY_REASON = 0x400L;
    private static final long OPT_BIT_ORDERED_BY = 0x800L;
    private static final long OPT_BIT_TITLE = 0x1000L;
    private static final long OPT_BIT_ENCOUNTER = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_DATE = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_CODE = 0x20000L;
    private static final long OPT_BIT_SUBJECT = 0x40000L;
    private static final long OPT_BIT_NOTE = 0x80000L;
    private static final long OPT_BIT_SOURCE = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Uri implicitRules;
    private @Nullable Narrative text;
    private @Nullable java.util.List<Extension> extension;
    private @Nullable java.util.List<Identifier> identifier;
    private @Nullable String resourceType;
    private @Nullable java.util.List<List_Entry> entry;
    private @Nullable Id id;
    private @Nullable ListStatus status;
    private @Nullable Meta meta;
    private @Nullable ListMode mode;
    private @Nullable java.util.List<ResourceList> contained;
    private @Nullable CodeableConcept emptyReason;
    private @Nullable CodeableConcept orderedBy;
    private @Nullable String title;
    private @Nullable Reference encounter;
    private @Nullable Code language;
    private @Nullable DateTime date;
    private @Nullable java.util.List<Extension> modifierExtension;
    private @Nullable CodeableConcept code;
    private @Nullable Reference subject;
    private @Nullable java.util.List<Annotation> note;
    private @Nullable Reference source;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link List#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link List#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link List#text() text} to text.
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
     * Initializes the optional value {@link List#text() text} to text.
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
     * Initializes the optional value {@link List#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link List#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends java.util.List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link List#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link List#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends java.util.List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link List#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    public final Builder entry(java.util.List<List_Entry> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = Objects.requireNonNull(entry, "entry");
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link List#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entry")
    public final Builder entry(Optional<? extends java.util.List<List_Entry>> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = entry.orElse(null);
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link List#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link List#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link List#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ListStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link List#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ListStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link List#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link List#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link List#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(ListMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends ListMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link List#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends java.util.List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link List#emptyReason() emptyReason} to emptyReason.
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
     * Initializes the optional value {@link List#emptyReason() emptyReason} to emptyReason.
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
     * Initializes the optional value {@link List#orderedBy() orderedBy} to orderedBy.
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
     * Initializes the optional value {@link List#orderedBy() orderedBy} to orderedBy.
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
     * Initializes the optional value {@link List#title() title} to title.
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
     * Initializes the optional value {@link List#title() title} to title.
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
     * Initializes the optional value {@link List#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link List#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link List#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link List#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends java.util.List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link List#code() code} to code.
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
     * Initializes the optional value {@link List#code() code} to code.
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
     * Initializes the optional value {@link List#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link List#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link List#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends java.util.List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(Reference source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Builds a new {@link List List}.
     * @return An immutable instance of List
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public List build() {
      checkRequiredAttributes();
      return new ImmutableList(
          implicitRules,
          text,
          extension,
          identifier,
          resourceType,
          entry,
          id,
          status,
          meta,
          mode,
          contained,
          emptyReason,
          orderedBy,
          title,
          encounter,
          language,
          date,
          modifierExtension,
          code,
          subject,
          note,
          source);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean entryIsSet() {
      return (optBits & OPT_BIT_ENTRY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean emptyReasonIsSet() {
      return (optBits & OPT_BIT_EMPTY_REASON) != 0;
    }

    private boolean orderedByIsSet() {
      return (optBits & OPT_BIT_ORDERED_BY) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of List is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build List, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "List", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link List#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "List", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link List#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link List#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link List#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link List#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link List#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<Extension> extension);

    /**
     * Initializes the optional value {@link List#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends java.util.List<Extension>> extension);

    /**
     * Initializes the optional value {@link List#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<Identifier> identifier);

    /**
     * Initializes the optional value {@link List#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends java.util.List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link List#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    BuildFinal entry(java.util.List<List_Entry> entry);

    /**
     * Initializes the optional value {@link List#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal entry(Optional<? extends java.util.List<List_Entry>> entry);

    /**
     * Initializes the optional value {@link List#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link List#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link List#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ListStatus status);

    /**
     * Initializes the optional value {@link List#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ListStatus> status);

    /**
     * Initializes the optional value {@link List#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link List#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link List#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mode(ListMode mode);

    /**
     * Initializes the optional value {@link List#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mode(Optional<? extends ListMode> mode);

    /**
     * Initializes the optional value {@link List#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<ResourceList> contained);

    /**
     * Initializes the optional value {@link List#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends java.util.List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link List#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal emptyReason(CodeableConcept emptyReason);

    /**
     * Initializes the optional value {@link List#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal emptyReason(Optional<? extends CodeableConcept> emptyReason);

    /**
     * Initializes the optional value {@link List#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal orderedBy(CodeableConcept orderedBy);

    /**
     * Initializes the optional value {@link List#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal orderedBy(Optional<? extends CodeableConcept> orderedBy);

    /**
     * Initializes the optional value {@link List#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link List#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link List#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link List#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link List#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link List#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link List#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link List#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link List#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link List#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends java.util.List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link List#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link List#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link List#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link List#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link List#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<Annotation> note);

    /**
     * Initializes the optional value {@link List#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends java.util.List<Annotation>> note);

    /**
     * Initializes the optional value {@link List#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(Reference source);

    /**
     * Initializes the optional value {@link List#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(Optional<? extends Reference> source);

    /**
     * Builds a new {@link List List}.
     * @return An immutable instance of List
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    List build();
  }
}
