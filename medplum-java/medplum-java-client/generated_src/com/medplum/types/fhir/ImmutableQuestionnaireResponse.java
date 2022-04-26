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
 * Immutable implementation of {@link QuestionnaireResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaireResponse.builder()}.
 */
@Generated(from = "QuestionnaireResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaireResponse implements QuestionnaireResponse {
  private final @Nullable List<QuestionnaireResponse_Item> item;
  private final @Nullable Id id;
  private final @Nullable Meta meta;
  private final @Nullable Reference encounter;
  private final @Nullable Reference source;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Reference author;
  private final @Nullable DateTime authored;
  private final @Nullable List<Reference> partOf;
  private final @Nullable Reference subject;
  private final @Nullable QuestionnaireresponseStatus status;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable Identifier identifier;
  private final String resourceType;
  private final @Nullable List<Extension> extension;
  private final @Nullable Narrative text;
  private final @Nullable Canonical questionnaire;
  private final @Nullable Code language;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableQuestionnaireResponse(
      @Nullable List<QuestionnaireResponse_Item> item,
      @Nullable Id id,
      @Nullable Meta meta,
      @Nullable Reference encounter,
      @Nullable Reference source,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable Reference author,
      @Nullable DateTime authored,
      @Nullable List<Reference> partOf,
      @Nullable Reference subject,
      @Nullable QuestionnaireresponseStatus status,
      @Nullable List<Reference> basedOn,
      @Nullable Identifier identifier,
      String resourceType,
      @Nullable List<Extension> extension,
      @Nullable Narrative text,
      @Nullable Canonical questionnaire,
      @Nullable Code language,
      @Nullable List<Extension> modifierExtension) {
    this.item = item;
    this.id = id;
    this.meta = meta;
    this.encounter = encounter;
    this.source = source;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.author = author;
    this.authored = authored;
    this.partOf = partOf;
    this.subject = subject;
    this.status = status;
    this.basedOn = basedOn;
    this.identifier = identifier;
    this.resourceType = resourceType;
    this.extension = extension;
    this.text = text;
    this.questionnaire = questionnaire;
    this.language = language;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
  }

  /**
   * @return The value of the {@code authored} attribute
   */
  @JsonProperty("authored")
  @Override
  public Optional<DateTime> authored() {
    return Optional.ofNullable(authored);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<List<Reference>> partOf() {
    return Optional.ofNullable(partOf);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<QuestionnaireresponseStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code questionnaire} attribute
   */
  @JsonProperty("questionnaire")
  @Override
  public Optional<Canonical> questionnaire() {
    return Optional.ofNullable(questionnaire);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withItem(List<QuestionnaireResponse_Item> value) {
    @Nullable List<QuestionnaireResponse_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        newValue,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withItem(Optional<? extends List<QuestionnaireResponse_Item>> optional) {
    @Nullable List<QuestionnaireResponse_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableQuestionnaireResponse(
        value,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        newValue,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        value,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        newValue,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        value,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        newValue,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        value,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withSource(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        newValue,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withSource(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        value,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        newValue,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        value,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        newValue,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        value,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        newValue,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        value,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#authored() authored} attribute.
   * @param value The value for authored
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withAuthored(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "authored");
    if (this.authored == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        newValue,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#authored() authored} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authored
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withAuthored(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.authored == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        value,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        newValue,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        value,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        newValue,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        value,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withStatus(QuestionnaireresponseStatus value) {
    @Nullable QuestionnaireresponseStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        newValue,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withStatus(Optional<? extends QuestionnaireresponseStatus> optional) {
    @Nullable QuestionnaireresponseStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        value,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        newValue,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        value,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        newValue,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        value,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link QuestionnaireResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestionnaireResponse withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        newValue,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        newValue,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        value,
        this.text,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        newValue,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        value,
        this.questionnaire,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#questionnaire() questionnaire} attribute.
   * @param value The value for questionnaire
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withQuestionnaire(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "questionnaire");
    if (this.questionnaire == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        newValue,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#questionnaire() questionnaire} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for questionnaire
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withQuestionnaire(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.questionnaire == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        value,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.item,
        this.id,
        this.meta,
        this.encounter,
        this.source,
        this.implicitRules,
        this.contained,
        this.author,
        this.authored,
        this.partOf,
        this.subject,
        this.status,
        this.basedOn,
        this.identifier,
        this.resourceType,
        this.extension,
        this.text,
        this.questionnaire,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaireResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaireResponse
        && equalTo((ImmutableQuestionnaireResponse) another);
  }

  private boolean equalTo(ImmutableQuestionnaireResponse another) {
    return Objects.equals(item, another.item)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(source, another.source)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(author, another.author)
        && Objects.equals(authored, another.authored)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(subject, another.subject)
        && Objects.equals(status, another.status)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(identifier, another.identifier)
        && resourceType.equals(another.resourceType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(text, another.text)
        && Objects.equals(questionnaire, another.questionnaire)
        && Objects.equals(language, another.language)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code item}, {@code id}, {@code meta}, {@code encounter}, {@code source}, {@code implicitRules}, {@code contained}, {@code author}, {@code authored}, {@code partOf}, {@code subject}, {@code status}, {@code basedOn}, {@code identifier}, {@code resourceType}, {@code extension}, {@code text}, {@code questionnaire}, {@code language}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(authored);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(questionnaire);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code QuestionnaireResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("QuestionnaireResponse{");
    if (item != null) {
      builder.append("item=").append(item);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (encounter != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (source != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (implicitRules != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (author != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (authored != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("authored=").append(authored);
    }
    if (partOf != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (subject != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (status != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (basedOn != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (identifier != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (questionnaire != null) {
      builder.append(", ");
      builder.append("questionnaire=").append(questionnaire);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "QuestionnaireResponse", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements QuestionnaireResponse {
    @Nullable Optional<List<QuestionnaireResponse_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<Reference> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<DateTime> authored = Optional.empty();
    boolean authoredIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<QuestionnaireresponseStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Canonical> questionnaire = Optional.empty();
    boolean questionnaireIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("item")
    public void setItem(Optional<List<QuestionnaireResponse_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("authored")
    public void setAuthored(Optional<DateTime> authored) {
      this.authored = authored;
      this.authoredIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<QuestionnaireresponseStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("questionnaire")
    public void setQuestionnaire(Optional<Canonical> questionnaire) {
      this.questionnaire = questionnaire;
      this.questionnaireIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<QuestionnaireResponse_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> authored() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<QuestionnaireresponseStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> questionnaire() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaireResponse fromJson(Json json) {
    ImmutableQuestionnaireResponse.Builder builder = ((ImmutableQuestionnaireResponse.Builder) ImmutableQuestionnaireResponse.builder());
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.authoredIsSet) {
      builder.authored(json.authored);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.questionnaireIsSet) {
      builder.questionnaire(json.questionnaire);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableQuestionnaireResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link QuestionnaireResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable QuestionnaireResponse instance
   */
  public static QuestionnaireResponse copyOf(QuestionnaireResponse instance) {
    if (instance instanceof ImmutableQuestionnaireResponse) {
      return (ImmutableQuestionnaireResponse) instance;
    }
    return ((ImmutableQuestionnaireResponse.Builder) ImmutableQuestionnaireResponse.builder())
        .item(instance.item())
        .id(instance.id())
        .meta(instance.meta())
        .encounter(instance.encounter())
        .source(instance.source())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .author(instance.author())
        .authored(instance.authored())
        .partOf(instance.partOf())
        .subject(instance.subject())
        .status(instance.status())
        .basedOn(instance.basedOn())
        .identifier(instance.identifier())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .text(instance.text())
        .questionnaire(instance.questionnaire())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link QuestionnaireResponse QuestionnaireResponse}.
   * <pre>
   * ImmutableQuestionnaireResponse.builder()
   *    .item(List&amp;lt;com.medplum.types.fhir.QuestionnaireResponse_Item&amp;gt;) // optional {@link QuestionnaireResponse#item() item}
   *    .id(com.medplum.types.fhir.Id) // optional {@link QuestionnaireResponse#id() id}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link QuestionnaireResponse#meta() meta}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link QuestionnaireResponse#encounter() encounter}
   *    .source(com.medplum.types.fhir.Reference) // optional {@link QuestionnaireResponse#source() source}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link QuestionnaireResponse#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link QuestionnaireResponse#contained() contained}
   *    .author(com.medplum.types.fhir.Reference) // optional {@link QuestionnaireResponse#author() author}
   *    .authored(com.medplum.types.fhir.DateTime) // optional {@link QuestionnaireResponse#authored() authored}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link QuestionnaireResponse#partOf() partOf}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link QuestionnaireResponse#subject() subject}
   *    .status(com.medplum.types.fhir.QuestionnaireresponseStatus) // optional {@link QuestionnaireResponse#status() status}
   *    .basedOn(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link QuestionnaireResponse#basedOn() basedOn}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link QuestionnaireResponse#identifier() identifier}
   *    .resourceType(String) // required {@link QuestionnaireResponse#resourceType() resourceType}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse#extension() extension}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link QuestionnaireResponse#text() text}
   *    .questionnaire(com.medplum.types.fhir.Canonical) // optional {@link QuestionnaireResponse#questionnaire() questionnaire}
   *    .language(com.medplum.types.fhir.Code) // optional {@link QuestionnaireResponse#language() language}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new QuestionnaireResponse builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableQuestionnaireResponse.Builder();
  }

  /**
   * Builds instances of type {@link QuestionnaireResponse QuestionnaireResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "QuestionnaireResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ITEM = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_ENCOUNTER = 0x8L;
    private static final long OPT_BIT_SOURCE = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_CONTAINED = 0x40L;
    private static final long OPT_BIT_AUTHOR = 0x80L;
    private static final long OPT_BIT_AUTHORED = 0x100L;
    private static final long OPT_BIT_PART_OF = 0x200L;
    private static final long OPT_BIT_SUBJECT = 0x400L;
    private static final long OPT_BIT_STATUS = 0x800L;
    private static final long OPT_BIT_BASED_ON = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_QUESTIONNAIRE = 0x10000L;
    private static final long OPT_BIT_LANGUAGE = 0x20000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<QuestionnaireResponse_Item> item;
    private @Nullable Id id;
    private @Nullable Meta meta;
    private @Nullable Reference encounter;
    private @Nullable Reference source;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference author;
    private @Nullable DateTime authored;
    private @Nullable List<Reference> partOf;
    private @Nullable Reference subject;
    private @Nullable QuestionnaireresponseStatus status;
    private @Nullable List<Reference> basedOn;
    private @Nullable Identifier identifier;
    private @Nullable String resourceType;
    private @Nullable List<Extension> extension;
    private @Nullable Narrative text;
    private @Nullable Canonical questionnaire;
    private @Nullable Code language;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#item() item} to item.
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
     * Initializes the optional value {@link QuestionnaireResponse#item() item} to item.
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
     * Initializes the optional value {@link QuestionnaireResponse#id() id} to id.
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
     * Initializes the optional value {@link QuestionnaireResponse#id() id} to id.
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
     * Initializes the optional value {@link QuestionnaireResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link QuestionnaireResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link QuestionnaireResponse#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link QuestionnaireResponse#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link QuestionnaireResponse#source() source} to source.
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
     * Initializes the optional value {@link QuestionnaireResponse#source() source} to source.
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
     * Initializes the optional value {@link QuestionnaireResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link QuestionnaireResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link QuestionnaireResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#authored() authored} to authored.
     * @param authored The value for authored
     * @return {@code this} builder for chained invocation
     */
    public final Builder authored(DateTime authored) {
      checkNotIsSet(authoredIsSet(), "authored");
      this.authored = Objects.requireNonNull(authored, "authored");
      optBits |= OPT_BIT_AUTHORED;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#authored() authored} to authored.
     * @param authored The value for authored
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authored")
    public final Builder authored(Optional<? extends DateTime> authored) {
      checkNotIsSet(authoredIsSet(), "authored");
      this.authored = authored.orElse(null);
      optBits |= OPT_BIT_AUTHORED;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(List<Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends List<Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#subject() subject} to subject.
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
     * Initializes the optional value {@link QuestionnaireResponse#subject() subject} to subject.
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
     * Initializes the optional value {@link QuestionnaireResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(QuestionnaireresponseStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends QuestionnaireresponseStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(List<Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends List<Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link QuestionnaireResponse#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link QuestionnaireResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link QuestionnaireResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link QuestionnaireResponse#text() text} to text.
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
     * Initializes the optional value {@link QuestionnaireResponse#text() text} to text.
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
     * Initializes the optional value {@link QuestionnaireResponse#questionnaire() questionnaire} to questionnaire.
     * @param questionnaire The value for questionnaire
     * @return {@code this} builder for chained invocation
     */
    public final Builder questionnaire(Canonical questionnaire) {
      checkNotIsSet(questionnaireIsSet(), "questionnaire");
      this.questionnaire = Objects.requireNonNull(questionnaire, "questionnaire");
      optBits |= OPT_BIT_QUESTIONNAIRE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#questionnaire() questionnaire} to questionnaire.
     * @param questionnaire The value for questionnaire
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("questionnaire")
    public final Builder questionnaire(Optional<? extends Canonical> questionnaire) {
      checkNotIsSet(questionnaireIsSet(), "questionnaire");
      this.questionnaire = questionnaire.orElse(null);
      optBits |= OPT_BIT_QUESTIONNAIRE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#language() language} to language.
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
     * Initializes the optional value {@link QuestionnaireResponse#language() language} to language.
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
     * Initializes the optional value {@link QuestionnaireResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link QuestionnaireResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link QuestionnaireResponse QuestionnaireResponse}.
     * @return An immutable instance of QuestionnaireResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public QuestionnaireResponse build() {
      checkRequiredAttributes();
      return new ImmutableQuestionnaireResponse(
          item,
          id,
          meta,
          encounter,
          source,
          implicitRules,
          contained,
          author,
          authored,
          partOf,
          subject,
          status,
          basedOn,
          identifier,
          resourceType,
          extension,
          text,
          questionnaire,
          language,
          modifierExtension);
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean authoredIsSet() {
      return (optBits & OPT_BIT_AUTHORED) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean questionnaireIsSet() {
      return (optBits & OPT_BIT_QUESTIONNAIRE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of QuestionnaireResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build QuestionnaireResponse, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "QuestionnaireResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link QuestionnaireResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "QuestionnaireResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link QuestionnaireResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(List<QuestionnaireResponse_Item> item);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(Optional<? extends List<QuestionnaireResponse_Item>> item);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(Reference source);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(Optional<? extends Reference> source);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(Reference author);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends Reference> author);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#authored() authored} to authored.
     * @param authored The value for authored
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authored(DateTime authored);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#authored() authored} to authored.
     * @param authored The value for authored
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authored(Optional<? extends DateTime> authored);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(QuestionnaireresponseStatus status);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends QuestionnaireresponseStatus> status);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#questionnaire() questionnaire} to questionnaire.
     * @param questionnaire The value for questionnaire
     * @return {@code this} builder for chained invocation
     */
    BuildFinal questionnaire(Canonical questionnaire);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#questionnaire() questionnaire} to questionnaire.
     * @param questionnaire The value for questionnaire
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal questionnaire(Optional<? extends Canonical> questionnaire);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link QuestionnaireResponse QuestionnaireResponse}.
     * @return An immutable instance of QuestionnaireResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    QuestionnaireResponse build();
  }
}
