//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link QuestionnaireResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaireResponse.builder()}.
 */
@org.immutables.value.Generated(from = "QuestionnaireResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaireResponse implements com.fhir.QuestionnaireResponse {
  private final @javax.annotation.Nullable com.fhir.QuestionnaireresponseStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.Reference author;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Reference source;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.canonical questionnaire;
  private final @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> item;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.dateTime authored;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;

  private ImmutableQuestionnaireResponse(
      @javax.annotation.Nullable com.fhir.QuestionnaireresponseStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.Reference author,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Reference source,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.canonical questionnaire,
      @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> item,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.dateTime authored,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id) {
    this.status = status;
    this.extension = extension;
    this.partOf = partOf;
    this.subject = subject;
    this.identifier = identifier;
    this.encounter = encounter;
    this.author = author;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.source = source;
    this.text = text;
    this.language = language;
    this.questionnaire = questionnaire;
    this.item = item;
    this.basedOn = basedOn;
    this.modifierExtension = modifierExtension;
    this.authored = authored;
    this.meta = meta;
    this.contained = contained;
    this.id = id;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.QuestionnaireresponseStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<com.fhir.Reference> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<com.fhir.Reference> author() {
    return java.util.Optional.ofNullable(author);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.Optional<com.fhir.Reference> source() {
    return java.util.Optional.ofNullable(source);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code questionnaire} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("questionnaire")
  @Override
  public java.util.Optional<com.fhir.canonical> questionnaire() {
    return java.util.Optional.ofNullable(questionnaire);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Item>> item() {
    return java.util.Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
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
   * @return The value of the {@code authored} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authored")
  @Override
  public java.util.Optional<com.fhir.dateTime> authored() {
    return java.util.Optional.ofNullable(authored);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withStatus(com.fhir.QuestionnaireresponseStatus value) {
    @javax.annotation.Nullable com.fhir.QuestionnaireresponseStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        newValue,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withStatus(java.util.Optional<? extends com.fhir.QuestionnaireresponseStatus> optional) {
    @javax.annotation.Nullable com.fhir.QuestionnaireresponseStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableQuestionnaireResponse(
        value,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        newValue,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        value,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        newValue,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        value,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        newValue,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        value,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        newValue,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        value,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        newValue,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        value,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withAuthor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withAuthor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        value,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link QuestionnaireResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestionnaireResponse withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        newValue,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        newValue,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        value,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withSource(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withSource(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        value,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        newValue,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        value,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        newValue,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        value,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#questionnaire() questionnaire} attribute.
   * @param value The value for questionnaire
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withQuestionnaire(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "questionnaire");
    if (this.questionnaire == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        newValue,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#questionnaire() questionnaire} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for questionnaire
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withQuestionnaire(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.questionnaire == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        value,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withItem(java.util.List<com.fhir.QuestionnaireResponse_Item> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> newValue = java.util.Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        newValue,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withItem(java.util.Optional<? extends java.util.List<com.fhir.QuestionnaireResponse_Item>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        value,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        newValue,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        value,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        newValue,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        value,
        this.authored,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#authored() authored} attribute.
   * @param value The value for authored
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withAuthored(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "authored");
    if (this.authored == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        newValue,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#authored() authored} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authored
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withAuthored(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.authored == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        value,
        this.meta,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        newValue,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        value,
        this.contained,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link QuestionnaireResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaireResponse withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link QuestionnaireResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaireResponse withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableQuestionnaireResponse(
        this.status,
        this.extension,
        this.partOf,
        this.subject,
        this.identifier,
        this.encounter,
        this.author,
        this.resourceType,
        this.implicitRules,
        this.source,
        this.text,
        this.language,
        this.questionnaire,
        this.item,
        this.basedOn,
        this.modifierExtension,
        this.authored,
        this.meta,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaireResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaireResponse
        && equalTo((ImmutableQuestionnaireResponse) another);
  }

  private boolean equalTo(ImmutableQuestionnaireResponse another) {
    return java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(author, another.author)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(questionnaire, another.questionnaire)
        && java.util.Objects.equals(item, another.item)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(authored, another.authored)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code extension}, {@code partOf}, {@code subject}, {@code identifier}, {@code encounter}, {@code author}, {@code resourceType}, {@code implicitRules}, {@code source}, {@code text}, {@code language}, {@code questionnaire}, {@code item}, {@code basedOn}, {@code modifierExtension}, {@code authored}, {@code meta}, {@code contained}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(questionnaire);
    h += (h << 5) + java.util.Objects.hashCode(item);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(authored);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code QuestionnaireResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("QuestionnaireResponse{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (partOf != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (subject != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (identifier != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (encounter != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (author != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (questionnaire != null) {
      builder.append(", ");
      builder.append("questionnaire=").append(questionnaire);
    }
    if (item != null) {
      builder.append(", ");
      builder.append("item=").append(item);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (authored != null) {
      builder.append(", ");
      builder.append("authored=").append(authored);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "QuestionnaireResponse", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.QuestionnaireResponse {
    @javax.annotation.Nullable java.util.Optional<com.fhir.QuestionnaireresponseStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> questionnaire = java.util.Optional.empty();
    boolean questionnaireIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Item>> item = java.util.Optional.empty();
    boolean itemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> authored = java.util.Optional.empty();
    boolean authoredIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.QuestionnaireresponseStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<com.fhir.Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<com.fhir.Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("questionnaire")
    public void setQuestionnaire(java.util.Optional<com.fhir.canonical> questionnaire) {
      this.questionnaire = questionnaire;
      this.questionnaireIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authored")
    public void setAuthored(java.util.Optional<com.fhir.dateTime> authored) {
      this.authored = authored;
      this.authoredIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.QuestionnaireresponseStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> questionnaire() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.QuestionnaireResponse_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> authored() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaireResponse fromJson(Json json) {
    ImmutableQuestionnaireResponse.Builder builder = ((ImmutableQuestionnaireResponse.Builder) ImmutableQuestionnaireResponse.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.questionnaireIsSet) {
      builder.questionnaire(json.questionnaire);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.authoredIsSet) {
      builder.authored(json.authored);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .status(instance.status())
        .extension(instance.extension())
        .partOf(instance.partOf())
        .subject(instance.subject())
        .identifier(instance.identifier())
        .encounter(instance.encounter())
        .author(instance.author())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .source(instance.source())
        .text(instance.text())
        .language(instance.language())
        .questionnaire(instance.questionnaire())
        .item(instance.item())
        .basedOn(instance.basedOn())
        .modifierExtension(instance.modifierExtension())
        .authored(instance.authored())
        .meta(instance.meta())
        .contained(instance.contained())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link QuestionnaireResponse QuestionnaireResponse}.
   * <pre>
   * ImmutableQuestionnaireResponse.builder()
   *    .status(com.fhir.QuestionnaireresponseStatus) // optional {@link QuestionnaireResponse#status() status}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse#extension() extension}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link QuestionnaireResponse#partOf() partOf}
   *    .subject(com.fhir.Reference) // optional {@link QuestionnaireResponse#subject() subject}
   *    .identifier(com.fhir.Identifier) // optional {@link QuestionnaireResponse#identifier() identifier}
   *    .encounter(com.fhir.Reference) // optional {@link QuestionnaireResponse#encounter() encounter}
   *    .author(com.fhir.Reference) // optional {@link QuestionnaireResponse#author() author}
   *    .resourceType(String) // required {@link QuestionnaireResponse#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link QuestionnaireResponse#implicitRules() implicitRules}
   *    .source(com.fhir.Reference) // optional {@link QuestionnaireResponse#source() source}
   *    .text(com.fhir.Narrative) // optional {@link QuestionnaireResponse#text() text}
   *    .language(com.fhir.code) // optional {@link QuestionnaireResponse#language() language}
   *    .questionnaire(com.fhir.canonical) // optional {@link QuestionnaireResponse#questionnaire() questionnaire}
   *    .item(List&amp;lt;com.fhir.QuestionnaireResponse_Item&amp;gt;) // optional {@link QuestionnaireResponse#item() item}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link QuestionnaireResponse#basedOn() basedOn}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link QuestionnaireResponse#modifierExtension() modifierExtension}
   *    .authored(com.fhir.dateTime) // optional {@link QuestionnaireResponse#authored() authored}
   *    .meta(com.fhir.Meta) // optional {@link QuestionnaireResponse#meta() meta}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link QuestionnaireResponse#contained() contained}
   *    .id(com.fhir.id) // optional {@link QuestionnaireResponse#id() id}
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
  @org.immutables.value.Generated(from = "QuestionnaireResponse", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_PART_OF = 0x4L;
    private static final long OPT_BIT_SUBJECT = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_ENCOUNTER = 0x20L;
    private static final long OPT_BIT_AUTHOR = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_SOURCE = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_QUESTIONNAIRE = 0x800L;
    private static final long OPT_BIT_ITEM = 0x1000L;
    private static final long OPT_BIT_BASED_ON = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_AUTHORED = 0x8000L;
    private static final long OPT_BIT_META = 0x10000L;
    private static final long OPT_BIT_CONTAINED = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.QuestionnaireresponseStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.Reference author;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Reference source;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.canonical questionnaire;
    private @javax.annotation.Nullable java.util.List<com.fhir.QuestionnaireResponse_Item> item;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.dateTime authored;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.QuestionnaireresponseStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.QuestionnaireresponseStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link QuestionnaireResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link QuestionnaireResponse#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(java.util.List<com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf) {
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
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(com.fhir.Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = java.util.Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public final Builder encounter(java.util.Optional<? extends com.fhir.Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(com.fhir.Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = java.util.Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public final Builder author(java.util.Optional<? extends com.fhir.Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the value for the {@link QuestionnaireResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(com.fhir.Reference source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(java.util.Optional<? extends com.fhir.Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#text() text} to text.
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
     * Initializes the optional value {@link QuestionnaireResponse#text() text} to text.
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
     * Initializes the optional value {@link QuestionnaireResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#questionnaire() questionnaire} to questionnaire.
     * @param questionnaire The value for questionnaire
     * @return {@code this} builder for chained invocation
     */
    public final Builder questionnaire(com.fhir.canonical questionnaire) {
      checkNotIsSet(questionnaireIsSet(), "questionnaire");
      this.questionnaire = java.util.Objects.requireNonNull(questionnaire, "questionnaire");
      optBits |= OPT_BIT_QUESTIONNAIRE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#questionnaire() questionnaire} to questionnaire.
     * @param questionnaire The value for questionnaire
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("questionnaire")
    public final Builder questionnaire(java.util.Optional<? extends com.fhir.canonical> questionnaire) {
      checkNotIsSet(questionnaireIsSet(), "questionnaire");
      this.questionnaire = questionnaire.orElse(null);
      optBits |= OPT_BIT_QUESTIONNAIRE;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(java.util.List<com.fhir.QuestionnaireResponse_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = java.util.Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public final Builder item(java.util.Optional<? extends java.util.List<com.fhir.QuestionnaireResponse_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(java.util.List<com.fhir.Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = java.util.Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public final Builder basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link QuestionnaireResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link QuestionnaireResponse#authored() authored} to authored.
     * @param authored The value for authored
     * @return {@code this} builder for chained invocation
     */
    public final Builder authored(com.fhir.dateTime authored) {
      checkNotIsSet(authoredIsSet(), "authored");
      this.authored = java.util.Objects.requireNonNull(authored, "authored");
      optBits |= OPT_BIT_AUTHORED;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#authored() authored} to authored.
     * @param authored The value for authored
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authored")
    public final Builder authored(java.util.Optional<? extends com.fhir.dateTime> authored) {
      checkNotIsSet(authoredIsSet(), "authored");
      this.authored = authored.orElse(null);
      optBits |= OPT_BIT_AUTHORED;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link QuestionnaireResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Builds a new {@link QuestionnaireResponse QuestionnaireResponse}.
     * @return An immutable instance of QuestionnaireResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.QuestionnaireResponse build() {
      checkRequiredAttributes();
      return new ImmutableQuestionnaireResponse(
          status,
          extension,
          partOf,
          subject,
          identifier,
          encounter,
          author,
          resourceType,
          implicitRules,
          source,
          text,
          language,
          questionnaire,
          item,
          basedOn,
          modifierExtension,
          authored,
          meta,
          contained,
          id);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean questionnaireIsSet() {
      return (optBits & OPT_BIT_QUESTIONNAIRE) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean authoredIsSet() {
      return (optBits & OPT_BIT_AUTHORED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of QuestionnaireResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build QuestionnaireResponse, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "QuestionnaireResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link QuestionnaireResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "QuestionnaireResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link QuestionnaireResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.QuestionnaireresponseStatus status);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.QuestionnaireresponseStatus> status);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(com.fhir.Reference author);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends com.fhir.Reference> author);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(com.fhir.Reference source);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(java.util.Optional<? extends com.fhir.Reference> source);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#questionnaire() questionnaire} to questionnaire.
     * @param questionnaire The value for questionnaire
     * @return {@code this} builder for chained invocation
     */
    BuildFinal questionnaire(com.fhir.canonical questionnaire);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#questionnaire() questionnaire} to questionnaire.
     * @param questionnaire The value for questionnaire
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal questionnaire(java.util.Optional<? extends com.fhir.canonical> questionnaire);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(java.util.List<com.fhir.QuestionnaireResponse_Item> item);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(java.util.Optional<? extends java.util.List<com.fhir.QuestionnaireResponse_Item>> item);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#authored() authored} to authored.
     * @param authored The value for authored
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authored(com.fhir.dateTime authored);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#authored() authored} to authored.
     * @param authored The value for authored
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authored(java.util.Optional<? extends com.fhir.dateTime> authored);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link QuestionnaireResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Builds a new {@link QuestionnaireResponse QuestionnaireResponse}.
     * @return An immutable instance of QuestionnaireResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    QuestionnaireResponse build();
  }
}
