//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DocumentManifest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDocumentManifest.builder()}.
 */
@org.immutables.value.Generated(from = "DocumentManifest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDocumentManifest implements com.fhir.DocumentManifest {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> recipient;
  private final @javax.annotation.Nullable com.fhir.Identifier masterIdentifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DocumentManifest_Related> related;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.DocumentmanifestStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final java.util.List<com.fhir.Reference> content;
  private final @javax.annotation.Nullable com.fhir.uri source;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Reference subject;

  private ImmutableDocumentManifest(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> recipient,
      @javax.annotation.Nullable com.fhir.Identifier masterIdentifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> author,
      @javax.annotation.Nullable java.util.List<com.fhir.DocumentManifest_Related> related,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.dateTime created,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.DocumentmanifestStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      java.util.List<com.fhir.Reference> content,
      @javax.annotation.Nullable com.fhir.uri source,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Reference subject) {
    this.recipient = recipient;
    this.masterIdentifier = masterIdentifier;
    this.author = author;
    this.related = related;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.id = id;
    this.identifier = identifier;
    this.text = text;
    this.created = created;
    this.extension = extension;
    this.meta = meta;
    this.language = language;
    this.status = status;
    this.contained = contained;
    this.content = content;
    this.source = source;
    this.type = type;
    this.description = description;
    this.implicitRules = implicitRules;
    this.subject = subject;
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recipient")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> recipient() {
    return java.util.Optional.ofNullable(recipient);
  }

  /**
   * @return The value of the {@code masterIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("masterIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> masterIdentifier() {
    return java.util.Optional.ofNullable(masterIdentifier);
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
   * @return The value of the {@code related} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("related")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DocumentManifest_Related>> related() {
    return java.util.Optional.ofNullable(related);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code created} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("created")
  @Override
  public java.util.Optional<com.fhir.dateTime> created() {
    return java.util.Optional.ofNullable(created);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.DocumentmanifestStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code content} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  @Override
  public java.util.List<com.fhir.Reference> content() {
    return content;
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.Optional<com.fhir.uri> source() {
    return java.util.Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<com.fhir.Reference> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withRecipient(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableDocumentManifest(
        newValue,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withRecipient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableDocumentManifest(
        value,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#masterIdentifier() masterIdentifier} attribute.
   * @param value The value for masterIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withMasterIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "masterIdentifier");
    if (this.masterIdentifier == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        newValue,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#masterIdentifier() masterIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for masterIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withMasterIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.masterIdentifier == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        value,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withAuthor(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        newValue,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withAuthor(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        value,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#related() related} attribute.
   * @param value The value for related
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withRelated(java.util.List<com.fhir.DocumentManifest_Related> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DocumentManifest_Related> newValue = java.util.Objects.requireNonNull(value, "related");
    if (this.related == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#related() related} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for related
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withRelated(java.util.Optional<? extends java.util.List<com.fhir.DocumentManifest_Related>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DocumentManifest_Related> value = optional.orElse(null);
    if (this.related == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        value,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        newValue,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        value,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DocumentManifest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDocumentManifest withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        newValue,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        value,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        newValue,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        value,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        newValue,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        value,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        newValue,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        value,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        newValue,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        value,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        newValue,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        value,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        newValue,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        value,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withStatus(com.fhir.DocumentmanifestStatus value) {
    @javax.annotation.Nullable com.fhir.DocumentmanifestStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        newValue,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withStatus(java.util.Optional<? extends com.fhir.DocumentmanifestStatus> optional) {
    @javax.annotation.Nullable com.fhir.DocumentmanifestStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        value,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        newValue,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        value,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DocumentManifest#content() content}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withContent(com.fhir.Reference... elements) {
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        newValue,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DocumentManifest#content() content}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of content elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withContent(Iterable<? extends com.fhir.Reference> elements) {
    if (this.content == elements) return this;
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        newValue,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withSource(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        newValue,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withSource(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        value,
        this.type,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        newValue,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        value,
        this.description,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        newValue,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        value,
        this.implicitRules,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        newValue,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        value,
        this.subject);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.masterIdentifier,
        this.author,
        this.related,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.identifier,
        this.text,
        this.created,
        this.extension,
        this.meta,
        this.language,
        this.status,
        this.contained,
        this.content,
        this.source,
        this.type,
        this.description,
        this.implicitRules,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDocumentManifest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDocumentManifest
        && equalTo((ImmutableDocumentManifest) another);
  }

  private boolean equalTo(ImmutableDocumentManifest another) {
    return java.util.Objects.equals(recipient, another.recipient)
        && java.util.Objects.equals(masterIdentifier, another.masterIdentifier)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(related, another.related)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(created, another.created)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(contained, another.contained)
        && content.equals(another.content)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(subject, another.subject);
  }

  /**
   * Computes a hash code from attributes: {@code recipient}, {@code masterIdentifier}, {@code author}, {@code related}, {@code modifierExtension}, {@code resourceType}, {@code id}, {@code identifier}, {@code text}, {@code created}, {@code extension}, {@code meta}, {@code language}, {@code status}, {@code contained}, {@code content}, {@code source}, {@code type}, {@code description}, {@code implicitRules}, {@code subject}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(recipient);
    h += (h << 5) + java.util.Objects.hashCode(masterIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(related);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + content.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    return h;
  }

  /**
   * Prints the immutable value {@code DocumentManifest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DocumentManifest{");
    if (recipient != null) {
      builder.append("recipient=").append(recipient);
    }
    if (masterIdentifier != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("masterIdentifier=").append(masterIdentifier);
    }
    if (author != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (related != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("related=").append(related);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    builder.append(", ");
    builder.append("content=").append(content);
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DocumentManifest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DocumentManifest {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> recipient = java.util.Optional.empty();
    boolean recipientIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> masterIdentifier = java.util.Optional.empty();
    boolean masterIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DocumentManifest_Related>> related = java.util.Optional.empty();
    boolean relatedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DocumentmanifestStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> content = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public void setRecipient(java.util.Optional<java.util.List<com.fhir.Reference>> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("masterIdentifier")
    public void setMasterIdentifier(java.util.Optional<com.fhir.Identifier> masterIdentifier) {
      this.masterIdentifier = masterIdentifier;
      this.masterIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.Reference>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("related")
    public void setRelated(java.util.Optional<java.util.List<com.fhir.DocumentManifest_Related>> related) {
      this.related = related;
      this.relatedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public void setCreated(java.util.Optional<com.fhir.dateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.DocumentmanifestStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    public void setContent(java.util.List<com.fhir.Reference> content) {
      this.content = content;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<com.fhir.uri> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> masterIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DocumentManifest_Related>> related() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DocumentmanifestStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Reference> content() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDocumentManifest fromJson(Json json) {
    ImmutableDocumentManifest.Builder builder = ((ImmutableDocumentManifest.Builder) ImmutableDocumentManifest.builder());
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.masterIdentifierIsSet) {
      builder.masterIdentifier(json.masterIdentifier);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.relatedIsSet) {
      builder.related(json.related);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.content != null) {
      builder.addAllContent(json.content);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    return (ImmutableDocumentManifest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DocumentManifest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DocumentManifest instance
   */
  public static DocumentManifest copyOf(DocumentManifest instance) {
    if (instance instanceof ImmutableDocumentManifest) {
      return (ImmutableDocumentManifest) instance;
    }
    return ((ImmutableDocumentManifest.Builder) ImmutableDocumentManifest.builder())
        .recipient(instance.recipient())
        .masterIdentifier(instance.masterIdentifier())
        .author(instance.author())
        .related(instance.related())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .identifier(instance.identifier())
        .text(instance.text())
        .created(instance.created())
        .extension(instance.extension())
        .meta(instance.meta())
        .language(instance.language())
        .status(instance.status())
        .contained(instance.contained())
        .addAllContent(instance.content())
        .source(instance.source())
        .type(instance.type())
        .description(instance.description())
        .implicitRules(instance.implicitRules())
        .subject(instance.subject())
        .build();
  }

  /**
   * Creates a builder for {@link DocumentManifest DocumentManifest}.
   * <pre>
   * ImmutableDocumentManifest.builder()
   *    .recipient(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DocumentManifest#recipient() recipient}
   *    .masterIdentifier(com.fhir.Identifier) // optional {@link DocumentManifest#masterIdentifier() masterIdentifier}
   *    .author(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DocumentManifest#author() author}
   *    .related(List&amp;lt;com.fhir.DocumentManifest_Related&amp;gt;) // optional {@link DocumentManifest#related() related}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DocumentManifest#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link DocumentManifest#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link DocumentManifest#id() id}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link DocumentManifest#identifier() identifier}
   *    .text(com.fhir.Narrative) // optional {@link DocumentManifest#text() text}
   *    .created(com.fhir.dateTime) // optional {@link DocumentManifest#created() created}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DocumentManifest#extension() extension}
   *    .meta(com.fhir.Meta) // optional {@link DocumentManifest#meta() meta}
   *    .language(com.fhir.code) // optional {@link DocumentManifest#language() language}
   *    .status(com.fhir.DocumentmanifestStatus) // optional {@link DocumentManifest#status() status}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link DocumentManifest#contained() contained}
   *    .addContent|addAllContent(com.fhir.Reference) // {@link DocumentManifest#content() content} elements
   *    .source(com.fhir.uri) // optional {@link DocumentManifest#source() source}
   *    .type(com.fhir.CodeableConcept) // optional {@link DocumentManifest#type() type}
   *    .description(String) // optional {@link DocumentManifest#description() description}
   *    .implicitRules(com.fhir.uri) // optional {@link DocumentManifest#implicitRules() implicitRules}
   *    .subject(com.fhir.Reference) // optional {@link DocumentManifest#subject() subject}
   *    .build();
   * </pre>
   * @return A new DocumentManifest builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDocumentManifest.Builder();
  }

  /**
   * Builds instances of type {@link DocumentManifest DocumentManifest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "DocumentManifest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_RECIPIENT = 0x1L;
    private static final long OPT_BIT_MASTER_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_AUTHOR = 0x4L;
    private static final long OPT_BIT_RELATED = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private static final long OPT_BIT_CREATED = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_META = 0x400L;
    private static final long OPT_BIT_LANGUAGE = 0x800L;
    private static final long OPT_BIT_STATUS = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_SOURCE = 0x4000L;
    private static final long OPT_BIT_TYPE = 0x8000L;
    private static final long OPT_BIT_DESCRIPTION = 0x10000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000L;
    private static final long OPT_BIT_SUBJECT = 0x40000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> recipient;
    private @javax.annotation.Nullable com.fhir.Identifier masterIdentifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> author;
    private @javax.annotation.Nullable java.util.List<com.fhir.DocumentManifest_Related> related;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.DocumentmanifestStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private final java.util.List<com.fhir.Reference> content = new java.util.ArrayList<com.fhir.Reference>();
    private @javax.annotation.Nullable com.fhir.uri source;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Reference subject;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DocumentManifest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(java.util.List<com.fhir.Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = java.util.Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public final Builder recipient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder masterIdentifier(com.fhir.Identifier masterIdentifier) {
      checkNotIsSet(masterIdentifierIsSet(), "masterIdentifier");
      this.masterIdentifier = java.util.Objects.requireNonNull(masterIdentifier, "masterIdentifier");
      optBits |= OPT_BIT_MASTER_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("masterIdentifier")
    public final Builder masterIdentifier(java.util.Optional<? extends com.fhir.Identifier> masterIdentifier) {
      checkNotIsSet(masterIdentifierIsSet(), "masterIdentifier");
      this.masterIdentifier = masterIdentifier.orElse(null);
      optBits |= OPT_BIT_MASTER_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#author() author} to author.
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
     * Initializes the optional value {@link DocumentManifest#author() author} to author.
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
     * Initializes the optional value {@link DocumentManifest#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    public final Builder related(java.util.List<com.fhir.DocumentManifest_Related> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = java.util.Objects.requireNonNull(related, "related");
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("related")
    public final Builder related(java.util.Optional<? extends java.util.List<com.fhir.DocumentManifest_Related>> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = related.orElse(null);
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentManifest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link DocumentManifest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DocumentManifest#id() id} to id.
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
     * Initializes the optional value {@link DocumentManifest#id() id} to id.
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
     * Initializes the optional value {@link DocumentManifest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#text() text} to text.
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
     * Initializes the optional value {@link DocumentManifest#text() text} to text.
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
     * Initializes the optional value {@link DocumentManifest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(com.fhir.dateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = java.util.Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public final Builder created(java.util.Optional<? extends com.fhir.dateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentManifest#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentManifest#meta() meta} to meta.
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
     * Initializes the optional value {@link DocumentManifest#meta() meta} to meta.
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
     * Initializes the optional value {@link DocumentManifest#language() language} to language.
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
     * Initializes the optional value {@link DocumentManifest#language() language} to language.
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
     * Initializes the optional value {@link DocumentManifest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.DocumentmanifestStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.DocumentmanifestStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#contained() contained} to contained.
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
     * Initializes the optional value {@link DocumentManifest#contained() contained} to contained.
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
     * Adds one element to {@link DocumentManifest#content() content} list.
     * @param element A content element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addContent(com.fhir.Reference element) {
      this.content.add(java.util.Objects.requireNonNull(element, "content element"));
      return this;
    }

    /**
     * Adds elements to {@link DocumentManifest#content() content} list.
     * @param elements An array of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addContent(com.fhir.Reference... elements) {
      for (com.fhir.Reference element : elements) {
        this.content.add(java.util.Objects.requireNonNull(element, "content element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link DocumentManifest#content() content} list.
     * @param elements An iterable of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllContent(Iterable<? extends com.fhir.Reference> elements) {
      for (com.fhir.Reference element : elements) {
        this.content.add(java.util.Objects.requireNonNull(element, "content element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(com.fhir.uri source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(java.util.Optional<? extends com.fhir.uri> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DocumentManifest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DocumentManifest#subject() subject} to subject.
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
     * Initializes the optional value {@link DocumentManifest#subject() subject} to subject.
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
     * Builds a new {@link DocumentManifest DocumentManifest}.
     * @return An immutable instance of DocumentManifest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DocumentManifest build() {
      checkRequiredAttributes();
      return new ImmutableDocumentManifest(
          recipient,
          masterIdentifier,
          author,
          related,
          modifierExtension,
          resourceType,
          id,
          identifier,
          text,
          created,
          extension,
          meta,
          language,
          status,
          contained,
          createUnmodifiableList(true, content),
          source,
          type,
          description,
          implicitRules,
          subject);
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean masterIdentifierIsSet() {
      return (optBits & OPT_BIT_MASTER_IDENTIFIER) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean relatedIsSet() {
      return (optBits & OPT_BIT_RELATED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DocumentManifest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DocumentManifest, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "DocumentManifest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DocumentManifest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "DocumentManifest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DocumentManifest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recipient(java.util.List<com.fhir.Reference> recipient);

    /**
     * Initializes the optional value {@link DocumentManifest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recipient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> recipient);

    /**
     * Initializes the optional value {@link DocumentManifest#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal masterIdentifier(com.fhir.Identifier masterIdentifier);

    /**
     * Initializes the optional value {@link DocumentManifest#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal masterIdentifier(java.util.Optional<? extends com.fhir.Identifier> masterIdentifier);

    /**
     * Initializes the optional value {@link DocumentManifest#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.Reference> author);

    /**
     * Initializes the optional value {@link DocumentManifest#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.Reference>> author);

    /**
     * Initializes the optional value {@link DocumentManifest#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    BuildFinal related(java.util.List<com.fhir.DocumentManifest_Related> related);

    /**
     * Initializes the optional value {@link DocumentManifest#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal related(java.util.Optional<? extends java.util.List<com.fhir.DocumentManifest_Related>> related);

    /**
     * Initializes the optional value {@link DocumentManifest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentManifest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentManifest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link DocumentManifest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link DocumentManifest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link DocumentManifest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link DocumentManifest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link DocumentManifest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link DocumentManifest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link DocumentManifest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link DocumentManifest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link DocumentManifest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link DocumentManifest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link DocumentManifest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link DocumentManifest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link DocumentManifest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link DocumentManifest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.DocumentmanifestStatus status);

    /**
     * Initializes the optional value {@link DocumentManifest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.DocumentmanifestStatus> status);

    /**
     * Initializes the optional value {@link DocumentManifest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link DocumentManifest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Adds one element to {@link DocumentManifest#content() content} list.
     * @param element A content element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addContent(com.fhir.Reference element);

    /**
     * Adds elements to {@link DocumentManifest#content() content} list.
     * @param elements An array of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addContent(com.fhir.Reference... elements);

    /**
     * Adds elements to {@link DocumentManifest#content() content} list.
     * @param elements An iterable of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllContent(Iterable<? extends com.fhir.Reference> elements);

    /**
     * Initializes the optional value {@link DocumentManifest#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(com.fhir.uri source);

    /**
     * Initializes the optional value {@link DocumentManifest#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(java.util.Optional<? extends com.fhir.uri> source);

    /**
     * Initializes the optional value {@link DocumentManifest#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link DocumentManifest#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link DocumentManifest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link DocumentManifest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link DocumentManifest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link DocumentManifest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link DocumentManifest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link DocumentManifest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Builds a new {@link DocumentManifest DocumentManifest}.
     * @return An immutable instance of DocumentManifest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DocumentManifest build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
