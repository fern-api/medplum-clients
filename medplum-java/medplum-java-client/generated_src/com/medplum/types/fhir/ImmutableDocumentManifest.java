package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link DocumentManifest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDocumentManifest.builder()}.
 */
@Generated(from = "DocumentManifest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDocumentManifest implements DocumentManifest {
  private final @Nullable List<Reference> recipient;
  private final @Nullable List<Identifier> identifier;
  private final List<Reference> content;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference subject;
  private final @Nullable Identifier masterIdentifier;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept type;
  private final @Nullable DocumentmanifestStatus status;
  private final @Nullable List<Reference> author;
  private final @Nullable Meta meta;
  private final @Nullable String description;
  private final @Nullable List<DocumentManifest_Related> related;
  private final @Nullable DateTime created;
  private final String resourceType;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable Uri source;
  private final @Nullable Code language;
  private final @Nullable Narrative text;
  private final @Nullable Id id;

  private ImmutableDocumentManifest(
      @Nullable List<Reference> recipient,
      @Nullable List<Identifier> identifier,
      List<Reference> content,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference subject,
      @Nullable Identifier masterIdentifier,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept type,
      @Nullable DocumentmanifestStatus status,
      @Nullable List<Reference> author,
      @Nullable Meta meta,
      @Nullable String description,
      @Nullable List<DocumentManifest_Related> related,
      @Nullable DateTime created,
      String resourceType,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable Uri source,
      @Nullable Code language,
      @Nullable Narrative text,
      @Nullable Id id) {
    this.recipient = recipient;
    this.identifier = identifier;
    this.content = content;
    this.modifierExtension = modifierExtension;
    this.subject = subject;
    this.masterIdentifier = masterIdentifier;
    this.implicitRules = implicitRules;
    this.type = type;
    this.status = status;
    this.author = author;
    this.meta = meta;
    this.description = description;
    this.related = related;
    this.created = created;
    this.resourceType = resourceType;
    this.contained = contained;
    this.extension = extension;
    this.source = source;
    this.language = language;
    this.text = text;
    this.id = id;
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @JsonProperty("recipient")
  @Override
  public Optional<List<Reference>> recipient() {
    return Optional.ofNullable(recipient);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code content} attribute
   */
  @JsonProperty("content")
  @Override
  public List<Reference> content() {
    return content;
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code masterIdentifier} attribute
   */
  @JsonProperty("masterIdentifier")
  @Override
  public Optional<Identifier> masterIdentifier() {
    return Optional.ofNullable(masterIdentifier);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<DocumentmanifestStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code related} attribute
   */
  @JsonProperty("related")
  @Override
  public Optional<List<DocumentManifest_Related>> related() {
    return Optional.ofNullable(related);
  }

  /**
   * @return The value of the {@code created} attribute
   */
  @JsonProperty("created")
  @Override
  public Optional<DateTime> created() {
    return Optional.ofNullable(created);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<Uri> source() {
    return Optional.ofNullable(source);
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
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withRecipient(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableDocumentManifest(
        newValue,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withRecipient(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableDocumentManifest(
        value,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        newValue,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        value,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DocumentManifest#content() content}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withContent(Reference... elements) {
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DocumentManifest#content() content}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of content elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withContent(Iterable<? extends Reference> elements) {
    if (this.content == elements) return this;
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        newValue,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        value,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        newValue,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        value,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#masterIdentifier() masterIdentifier} attribute.
   * @param value The value for masterIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withMasterIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "masterIdentifier");
    if (this.masterIdentifier == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        newValue,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#masterIdentifier() masterIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for masterIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withMasterIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.masterIdentifier == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        value,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        newValue,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        value,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        newValue,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        value,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withStatus(DocumentmanifestStatus value) {
    @Nullable DocumentmanifestStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        newValue,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withStatus(Optional<? extends DocumentmanifestStatus> optional) {
    @Nullable DocumentmanifestStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        value,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withAuthor(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        newValue,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withAuthor(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        value,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        newValue,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        value,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        newValue,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        value,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#related() related} attribute.
   * @param value The value for related
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withRelated(List<DocumentManifest_Related> value) {
    @Nullable List<DocumentManifest_Related> newValue = Objects.requireNonNull(value, "related");
    if (this.related == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        newValue,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#related() related} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for related
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withRelated(Optional<? extends List<DocumentManifest_Related>> optional) {
    @Nullable List<DocumentManifest_Related> value = optional.orElse(null);
    if (this.related == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        value,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        newValue,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        value,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DocumentManifest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDocumentManifest withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        newValue,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        newValue,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        value,
        this.extension,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        newValue,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        value,
        this.source,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withSource(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        newValue,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withSource(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        value,
        this.language,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        newValue,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        value,
        this.text,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentManifest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentManifest withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentManifest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentManifest withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDocumentManifest(
        this.recipient,
        this.identifier,
        this.content,
        this.modifierExtension,
        this.subject,
        this.masterIdentifier,
        this.implicitRules,
        this.type,
        this.status,
        this.author,
        this.meta,
        this.description,
        this.related,
        this.created,
        this.resourceType,
        this.contained,
        this.extension,
        this.source,
        this.language,
        this.text,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDocumentManifest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDocumentManifest
        && equalTo((ImmutableDocumentManifest) another);
  }

  private boolean equalTo(ImmutableDocumentManifest another) {
    return Objects.equals(recipient, another.recipient)
        && Objects.equals(identifier, another.identifier)
        && content.equals(another.content)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(subject, another.subject)
        && Objects.equals(masterIdentifier, another.masterIdentifier)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(type, another.type)
        && Objects.equals(status, another.status)
        && Objects.equals(author, another.author)
        && Objects.equals(meta, another.meta)
        && Objects.equals(description, another.description)
        && Objects.equals(related, another.related)
        && Objects.equals(created, another.created)
        && resourceType.equals(another.resourceType)
        && Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(source, another.source)
        && Objects.equals(language, another.language)
        && Objects.equals(text, another.text)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code recipient}, {@code identifier}, {@code content}, {@code modifierExtension}, {@code subject}, {@code masterIdentifier}, {@code implicitRules}, {@code type}, {@code status}, {@code author}, {@code meta}, {@code description}, {@code related}, {@code created}, {@code resourceType}, {@code contained}, {@code extension}, {@code source}, {@code language}, {@code text}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(recipient);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + content.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(masterIdentifier);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(related);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code DocumentManifest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DocumentManifest{");
    if (recipient != null) {
      builder.append("recipient=").append(recipient);
    }
    if (identifier != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("content=").append(content);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (masterIdentifier != null) {
      builder.append(", ");
      builder.append("masterIdentifier=").append(masterIdentifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (related != null) {
      builder.append(", ");
      builder.append("related=").append(related);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
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
  @Generated(from = "DocumentManifest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DocumentManifest {
    @Nullable Optional<List<Reference>> recipient = Optional.empty();
    boolean recipientIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable List<Reference> content = Collections.emptyList();
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<Identifier> masterIdentifier = Optional.empty();
    boolean masterIdentifierIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<DocumentmanifestStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Reference>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<DocumentManifest_Related>> related = Optional.empty();
    boolean relatedIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Uri> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("recipient")
    public void setRecipient(Optional<List<Reference>> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("content")
    public void setContent(List<Reference> content) {
      this.content = content;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("masterIdentifier")
    public void setMasterIdentifier(Optional<Identifier> masterIdentifier) {
      this.masterIdentifier = masterIdentifier;
      this.masterIdentifierIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<DocumentmanifestStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<Reference>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("related")
    public void setRelated(Optional<List<DocumentManifest_Related>> related) {
      this.related = related;
      this.relatedIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<Uri> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Reference>> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public List<Reference> content() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> masterIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DocumentmanifestStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DocumentManifest_Related>> related() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDocumentManifest fromJson(Json json) {
    ImmutableDocumentManifest.Builder builder = ((ImmutableDocumentManifest.Builder) ImmutableDocumentManifest.builder());
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.content != null) {
      builder.addAllContent(json.content);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.masterIdentifierIsSet) {
      builder.masterIdentifier(json.masterIdentifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.relatedIsSet) {
      builder.related(json.related);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .identifier(instance.identifier())
        .addAllContent(instance.content())
        .modifierExtension(instance.modifierExtension())
        .subject(instance.subject())
        .masterIdentifier(instance.masterIdentifier())
        .implicitRules(instance.implicitRules())
        .type(instance.type())
        .status(instance.status())
        .author(instance.author())
        .meta(instance.meta())
        .description(instance.description())
        .related(instance.related())
        .created(instance.created())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .extension(instance.extension())
        .source(instance.source())
        .language(instance.language())
        .text(instance.text())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link DocumentManifest DocumentManifest}.
   * <pre>
   * ImmutableDocumentManifest.builder()
   *    .recipient(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DocumentManifest#recipient() recipient}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link DocumentManifest#identifier() identifier}
   *    .addContent|addAllContent(com.medplum.types.fhir.Reference) // {@link DocumentManifest#content() content} elements
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DocumentManifest#modifierExtension() modifierExtension}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link DocumentManifest#subject() subject}
   *    .masterIdentifier(com.medplum.types.fhir.Identifier) // optional {@link DocumentManifest#masterIdentifier() masterIdentifier}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link DocumentManifest#implicitRules() implicitRules}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link DocumentManifest#type() type}
   *    .status(com.medplum.types.fhir.DocumentmanifestStatus) // optional {@link DocumentManifest#status() status}
   *    .author(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link DocumentManifest#author() author}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link DocumentManifest#meta() meta}
   *    .description(String) // optional {@link DocumentManifest#description() description}
   *    .related(List&amp;lt;com.medplum.types.fhir.DocumentManifest_Related&amp;gt;) // optional {@link DocumentManifest#related() related}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link DocumentManifest#created() created}
   *    .resourceType(String) // required {@link DocumentManifest#resourceType() resourceType}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link DocumentManifest#contained() contained}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DocumentManifest#extension() extension}
   *    .source(com.medplum.types.fhir.Uri) // optional {@link DocumentManifest#source() source}
   *    .language(com.medplum.types.fhir.Code) // optional {@link DocumentManifest#language() language}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link DocumentManifest#text() text}
   *    .id(com.medplum.types.fhir.Id) // optional {@link DocumentManifest#id() id}
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
  @Generated(from = "DocumentManifest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_RECIPIENT = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_SUBJECT = 0x8L;
    private static final long OPT_BIT_MASTER_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_TYPE = 0x40L;
    private static final long OPT_BIT_STATUS = 0x80L;
    private static final long OPT_BIT_AUTHOR = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_DESCRIPTION = 0x400L;
    private static final long OPT_BIT_RELATED = 0x800L;
    private static final long OPT_BIT_CREATED = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_SOURCE = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_TEXT = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Reference> recipient;
    private @Nullable List<Identifier> identifier;
    private final List<Reference> content = new ArrayList<Reference>();
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference subject;
    private @Nullable Identifier masterIdentifier;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept type;
    private @Nullable DocumentmanifestStatus status;
    private @Nullable List<Reference> author;
    private @Nullable Meta meta;
    private @Nullable String description;
    private @Nullable List<DocumentManifest_Related> related;
    private @Nullable DateTime created;
    private @Nullable String resourceType;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable Uri source;
    private @Nullable Code language;
    private @Nullable Narrative text;
    private @Nullable Id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DocumentManifest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(List<Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recipient")
    public final Builder recipient(Optional<? extends List<Reference>> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Adds one element to {@link DocumentManifest#content() content} list.
     * @param element A content element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addContent(Reference element) {
      this.content.add(Objects.requireNonNull(element, "content element"));
      return this;
    }

    /**
     * Adds elements to {@link DocumentManifest#content() content} list.
     * @param elements An array of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addContent(Reference... elements) {
      for (Reference element : elements) {
        this.content.add(Objects.requireNonNull(element, "content element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link DocumentManifest#content() content} list.
     * @param elements An iterable of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllContent(Iterable<? extends Reference> elements) {
      for (Reference element : elements) {
        this.content.add(Objects.requireNonNull(element, "content element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentManifest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentManifest#subject() subject} to subject.
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
     * Initializes the optional value {@link DocumentManifest#subject() subject} to subject.
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
     * Initializes the optional value {@link DocumentManifest#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder masterIdentifier(Identifier masterIdentifier) {
      checkNotIsSet(masterIdentifierIsSet(), "masterIdentifier");
      this.masterIdentifier = Objects.requireNonNull(masterIdentifier, "masterIdentifier");
      optBits |= OPT_BIT_MASTER_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("masterIdentifier")
    public final Builder masterIdentifier(Optional<? extends Identifier> masterIdentifier) {
      checkNotIsSet(masterIdentifierIsSet(), "masterIdentifier");
      this.masterIdentifier = masterIdentifier.orElse(null);
      optBits |= OPT_BIT_MASTER_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DocumentManifest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DocumentManifest#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(DocumentmanifestStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends DocumentmanifestStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#author() author} to author.
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
     * Initializes the optional value {@link DocumentManifest#author() author} to author.
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
     * Initializes the optional value {@link DocumentManifest#meta() meta} to meta.
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
     * Initializes the optional value {@link DocumentManifest#meta() meta} to meta.
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
     * Initializes the optional value {@link DocumentManifest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    public final Builder related(List<DocumentManifest_Related> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = Objects.requireNonNull(related, "related");
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("related")
    public final Builder related(Optional<? extends List<DocumentManifest_Related>> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = related.orElse(null);
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(DateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("created")
    public final Builder created(Optional<? extends DateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the value for the {@link DocumentManifest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DocumentManifest#contained() contained} to contained.
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
     * Initializes the optional value {@link DocumentManifest#contained() contained} to contained.
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
     * Initializes the optional value {@link DocumentManifest#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentManifest#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentManifest#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(Uri source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends Uri> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentManifest#language() language} to language.
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
     * Initializes the optional value {@link DocumentManifest#language() language} to language.
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
     * Initializes the optional value {@link DocumentManifest#text() text} to text.
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
     * Initializes the optional value {@link DocumentManifest#text() text} to text.
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
     * Initializes the optional value {@link DocumentManifest#id() id} to id.
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
     * Initializes the optional value {@link DocumentManifest#id() id} to id.
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
     * Builds a new {@link DocumentManifest DocumentManifest}.
     * @return An immutable instance of DocumentManifest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DocumentManifest build() {
      checkRequiredAttributes();
      return new ImmutableDocumentManifest(
          recipient,
          identifier,
          createUnmodifiableList(true, content),
          modifierExtension,
          subject,
          masterIdentifier,
          implicitRules,
          type,
          status,
          author,
          meta,
          description,
          related,
          created,
          resourceType,
          contained,
          extension,
          source,
          language,
          text,
          id);
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean masterIdentifierIsSet() {
      return (optBits & OPT_BIT_MASTER_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean relatedIsSet() {
      return (optBits & OPT_BIT_RELATED) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DocumentManifest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DocumentManifest, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DocumentManifest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DocumentManifest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "DocumentManifest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DocumentManifest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recipient(List<Reference> recipient);

    /**
     * Initializes the optional value {@link DocumentManifest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recipient(Optional<? extends List<Reference>> recipient);

    /**
     * Initializes the optional value {@link DocumentManifest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link DocumentManifest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Adds one element to {@link DocumentManifest#content() content} list.
     * @param element A content element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addContent(Reference element);

    /**
     * Adds elements to {@link DocumentManifest#content() content} list.
     * @param elements An array of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addContent(Reference... elements);

    /**
     * Adds elements to {@link DocumentManifest#content() content} list.
     * @param elements An iterable of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllContent(Iterable<? extends Reference> elements);

    /**
     * Initializes the optional value {@link DocumentManifest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentManifest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentManifest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link DocumentManifest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link DocumentManifest#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal masterIdentifier(Identifier masterIdentifier);

    /**
     * Initializes the optional value {@link DocumentManifest#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal masterIdentifier(Optional<? extends Identifier> masterIdentifier);

    /**
     * Initializes the optional value {@link DocumentManifest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link DocumentManifest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link DocumentManifest#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link DocumentManifest#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link DocumentManifest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(DocumentmanifestStatus status);

    /**
     * Initializes the optional value {@link DocumentManifest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends DocumentmanifestStatus> status);

    /**
     * Initializes the optional value {@link DocumentManifest#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(List<Reference> author);

    /**
     * Initializes the optional value {@link DocumentManifest#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends List<Reference>> author);

    /**
     * Initializes the optional value {@link DocumentManifest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link DocumentManifest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link DocumentManifest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link DocumentManifest#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link DocumentManifest#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    BuildFinal related(List<DocumentManifest_Related> related);

    /**
     * Initializes the optional value {@link DocumentManifest#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal related(Optional<? extends List<DocumentManifest_Related>> related);

    /**
     * Initializes the optional value {@link DocumentManifest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link DocumentManifest#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link DocumentManifest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link DocumentManifest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link DocumentManifest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DocumentManifest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DocumentManifest#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(Uri source);

    /**
     * Initializes the optional value {@link DocumentManifest#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(Optional<? extends Uri> source);

    /**
     * Initializes the optional value {@link DocumentManifest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link DocumentManifest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link DocumentManifest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link DocumentManifest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link DocumentManifest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link DocumentManifest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Builds a new {@link DocumentManifest DocumentManifest}.
     * @return An immutable instance of DocumentManifest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DocumentManifest build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
