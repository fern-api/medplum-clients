package com.fhir.types.fhir;

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
 * Immutable implementation of {@link DocumentReference}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDocumentReference.builder()}.
 */
@Generated(from = "DocumentReference", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDocumentReference implements DocumentReference {
  private final @Nullable DocumentreferenceStatus status;
  private final @Nullable List<DocumentReference_RelatesTo> relatesTo;
  private final List<DocumentReference_Content> content;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable String description;
  private final @Nullable List<Extension> extension;
  private final @Nullable Uri implicitRules;
  private final @Nullable Id id;
  private final @Nullable Reference custodian;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> author;
  private final String resourceType;
  private final @Nullable Instant date;
  private final @Nullable Meta meta;
  private final @Nullable List<CodeableConcept> securityLabel;
  private final @Nullable Code language;
  private final @Nullable Reference authenticator;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Reference subject;
  private final @Nullable Code docStatus;
  private final @Nullable Identifier masterIdentifier;
  private final @Nullable CodeableConcept type;
  private final @Nullable DocumentReference_Context context;

  private ImmutableDocumentReference(
      @Nullable DocumentreferenceStatus status,
      @Nullable List<DocumentReference_RelatesTo> relatesTo,
      List<DocumentReference_Content> content,
      @Nullable List<CodeableConcept> category,
      @Nullable String description,
      @Nullable List<Extension> extension,
      @Nullable Uri implicitRules,
      @Nullable Id id,
      @Nullable Reference custodian,
      @Nullable Narrative text,
      @Nullable List<Reference> author,
      String resourceType,
      @Nullable Instant date,
      @Nullable Meta meta,
      @Nullable List<CodeableConcept> securityLabel,
      @Nullable Code language,
      @Nullable Reference authenticator,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ResourceList> contained,
      @Nullable List<Identifier> identifier,
      @Nullable Reference subject,
      @Nullable Code docStatus,
      @Nullable Identifier masterIdentifier,
      @Nullable CodeableConcept type,
      @Nullable DocumentReference_Context context) {
    this.status = status;
    this.relatesTo = relatesTo;
    this.content = content;
    this.category = category;
    this.description = description;
    this.extension = extension;
    this.implicitRules = implicitRules;
    this.id = id;
    this.custodian = custodian;
    this.text = text;
    this.author = author;
    this.resourceType = resourceType;
    this.date = date;
    this.meta = meta;
    this.securityLabel = securityLabel;
    this.language = language;
    this.authenticator = authenticator;
    this.modifierExtension = modifierExtension;
    this.contained = contained;
    this.identifier = identifier;
    this.subject = subject;
    this.docStatus = docStatus;
    this.masterIdentifier = masterIdentifier;
    this.type = type;
    this.context = context;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<DocumentreferenceStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code relatesTo} attribute
   */
  @JsonProperty("relatesTo")
  @Override
  public Optional<List<DocumentReference_RelatesTo>> relatesTo() {
    return Optional.ofNullable(relatesTo);
  }

  /**
   * @return The value of the {@code content} attribute
   */
  @JsonProperty("content")
  @Override
  public List<DocumentReference_Content> content() {
    return content;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code custodian} attribute
   */
  @JsonProperty("custodian")
  @Override
  public Optional<Reference> custodian() {
    return Optional.ofNullable(custodian);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<List<Reference>> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<Instant> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code securityLabel} attribute
   */
  @JsonProperty("securityLabel")
  @Override
  public Optional<List<CodeableConcept>> securityLabel() {
    return Optional.ofNullable(securityLabel);
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
   * @return The value of the {@code authenticator} attribute
   */
  @JsonProperty("authenticator")
  @Override
  public Optional<Reference> authenticator() {
    return Optional.ofNullable(authenticator);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code docStatus} attribute
   */
  @JsonProperty("docStatus")
  @Override
  public Optional<Code> docStatus() {
    return Optional.ofNullable(docStatus);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<DocumentReference_Context> context() {
    return Optional.ofNullable(context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withStatus(DocumentreferenceStatus value) {
    @Nullable DocumentreferenceStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDocumentReference(
        newValue,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withStatus(Optional<? extends DocumentreferenceStatus> optional) {
    @Nullable DocumentreferenceStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDocumentReference(
        value,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#relatesTo() relatesTo} attribute.
   * @param value The value for relatesTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withRelatesTo(List<DocumentReference_RelatesTo> value) {
    @Nullable List<DocumentReference_RelatesTo> newValue = Objects.requireNonNull(value, "relatesTo");
    if (this.relatesTo == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        newValue,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#relatesTo() relatesTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatesTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withRelatesTo(Optional<? extends List<DocumentReference_RelatesTo>> optional) {
    @Nullable List<DocumentReference_RelatesTo> value = optional.orElse(null);
    if (this.relatesTo == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        value,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DocumentReference#content() content}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withContent(DocumentReference_Content... elements) {
    List<DocumentReference_Content> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        newValue,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DocumentReference#content() content}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of content elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withContent(Iterable<? extends DocumentReference_Content> elements) {
    if (this.content == elements) return this;
    List<DocumentReference_Content> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        newValue,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        newValue,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        value,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        newValue,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        value,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        newValue,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        value,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        newValue,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        value,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        newValue,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        value,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#custodian() custodian} attribute.
   * @param value The value for custodian
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withCustodian(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "custodian");
    if (this.custodian == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        newValue,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#custodian() custodian} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for custodian
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withCustodian(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.custodian == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        value,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        newValue,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        value,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withAuthor(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        newValue,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withAuthor(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        value,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DocumentReference#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDocumentReference withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        newValue,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withDate(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        newValue,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withDate(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        value,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        newValue,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        value,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#securityLabel() securityLabel} attribute.
   * @param value The value for securityLabel
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withSecurityLabel(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "securityLabel");
    if (this.securityLabel == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        newValue,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#securityLabel() securityLabel} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabel
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withSecurityLabel(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.securityLabel == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        value,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        newValue,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        value,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#authenticator() authenticator} attribute.
   * @param value The value for authenticator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withAuthenticator(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "authenticator");
    if (this.authenticator == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        newValue,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#authenticator() authenticator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authenticator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withAuthenticator(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.authenticator == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        value,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        newValue,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        value,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        value,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        newValue,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        value,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        newValue,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        value,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#docStatus() docStatus} attribute.
   * @param value The value for docStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withDocStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "docStatus");
    if (this.docStatus == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        newValue,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#docStatus() docStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for docStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withDocStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.docStatus == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        value,
        this.masterIdentifier,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#masterIdentifier() masterIdentifier} attribute.
   * @param value The value for masterIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withMasterIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "masterIdentifier");
    if (this.masterIdentifier == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        newValue,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#masterIdentifier() masterIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for masterIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withMasterIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.masterIdentifier == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        value,
        this.type,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        newValue,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        value,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withContext(DocumentReference_Context value) {
    @Nullable DocumentReference_Context newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withContext(Optional<? extends DocumentReference_Context> optional) {
    @Nullable DocumentReference_Context value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableDocumentReference(
        this.status,
        this.relatesTo,
        this.content,
        this.category,
        this.description,
        this.extension,
        this.implicitRules,
        this.id,
        this.custodian,
        this.text,
        this.author,
        this.resourceType,
        this.date,
        this.meta,
        this.securityLabel,
        this.language,
        this.authenticator,
        this.modifierExtension,
        this.contained,
        this.identifier,
        this.subject,
        this.docStatus,
        this.masterIdentifier,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDocumentReference} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDocumentReference
        && equalTo((ImmutableDocumentReference) another);
  }

  private boolean equalTo(ImmutableDocumentReference another) {
    return Objects.equals(status, another.status)
        && Objects.equals(relatesTo, another.relatesTo)
        && content.equals(another.content)
        && Objects.equals(category, another.category)
        && Objects.equals(description, another.description)
        && Objects.equals(extension, another.extension)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(id, another.id)
        && Objects.equals(custodian, another.custodian)
        && Objects.equals(text, another.text)
        && Objects.equals(author, another.author)
        && resourceType.equals(another.resourceType)
        && Objects.equals(date, another.date)
        && Objects.equals(meta, another.meta)
        && Objects.equals(securityLabel, another.securityLabel)
        && Objects.equals(language, another.language)
        && Objects.equals(authenticator, another.authenticator)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(contained, another.contained)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(subject, another.subject)
        && Objects.equals(docStatus, another.docStatus)
        && Objects.equals(masterIdentifier, another.masterIdentifier)
        && Objects.equals(type, another.type)
        && Objects.equals(context, another.context);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code relatesTo}, {@code content}, {@code category}, {@code description}, {@code extension}, {@code implicitRules}, {@code id}, {@code custodian}, {@code text}, {@code author}, {@code resourceType}, {@code date}, {@code meta}, {@code securityLabel}, {@code language}, {@code authenticator}, {@code modifierExtension}, {@code contained}, {@code identifier}, {@code subject}, {@code docStatus}, {@code masterIdentifier}, {@code type}, {@code context}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(relatesTo);
    h += (h << 5) + content.hashCode();
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(custodian);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(securityLabel);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(authenticator);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(docStatus);
    h += (h << 5) + Objects.hashCode(masterIdentifier);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(context);
    return h;
  }

  /**
   * Prints the immutable value {@code DocumentReference} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DocumentReference{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (relatesTo != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("relatesTo=").append(relatesTo);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("content=").append(content);
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (custodian != null) {
      builder.append(", ");
      builder.append("custodian=").append(custodian);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (securityLabel != null) {
      builder.append(", ");
      builder.append("securityLabel=").append(securityLabel);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (authenticator != null) {
      builder.append(", ");
      builder.append("authenticator=").append(authenticator);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (docStatus != null) {
      builder.append(", ");
      builder.append("docStatus=").append(docStatus);
    }
    if (masterIdentifier != null) {
      builder.append(", ");
      builder.append("masterIdentifier=").append(masterIdentifier);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DocumentReference", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DocumentReference {
    @Nullable Optional<DocumentreferenceStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<DocumentReference_RelatesTo>> relatesTo = Optional.empty();
    boolean relatesToIsSet;
    @Nullable List<DocumentReference_Content> content = Collections.emptyList();
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> custodian = Optional.empty();
    boolean custodianIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Instant> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<CodeableConcept>> securityLabel = Optional.empty();
    boolean securityLabelIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Reference> authenticator = Optional.empty();
    boolean authenticatorIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<Code> docStatus = Optional.empty();
    boolean docStatusIsSet;
    @Nullable Optional<Identifier> masterIdentifier = Optional.empty();
    boolean masterIdentifierIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<DocumentReference_Context> context = Optional.empty();
    boolean contextIsSet;
    @JsonProperty("status")
    public void setStatus(Optional<DocumentreferenceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("relatesTo")
    public void setRelatesTo(Optional<List<DocumentReference_RelatesTo>> relatesTo) {
      this.relatesTo = relatesTo;
      this.relatesToIsSet = true;
    }
    @JsonProperty("content")
    public void setContent(List<DocumentReference_Content> content) {
      this.content = content;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("custodian")
    public void setCustodian(Optional<Reference> custodian) {
      this.custodian = custodian;
      this.custodianIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<Reference>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("date")
    public void setDate(Optional<Instant> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("securityLabel")
    public void setSecurityLabel(Optional<List<CodeableConcept>> securityLabel) {
      this.securityLabel = securityLabel;
      this.securityLabelIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("authenticator")
    public void setAuthenticator(Optional<Reference> authenticator) {
      this.authenticator = authenticator;
      this.authenticatorIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("docStatus")
    public void setDocStatus(Optional<Code> docStatus) {
      this.docStatus = docStatus;
      this.docStatusIsSet = true;
    }
    @JsonProperty("masterIdentifier")
    public void setMasterIdentifier(Optional<Identifier> masterIdentifier) {
      this.masterIdentifier = masterIdentifier;
      this.masterIdentifierIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<DocumentReference_Context> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @Override
    public Optional<DocumentreferenceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DocumentReference_RelatesTo>> relatesTo() { throw new UnsupportedOperationException(); }
    @Override
    public List<DocumentReference_Content> content() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> custodian() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> author() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> securityLabel() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> authenticator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> docStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> masterIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DocumentReference_Context> context() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDocumentReference fromJson(Json json) {
    ImmutableDocumentReference.Builder builder = ((ImmutableDocumentReference.Builder) ImmutableDocumentReference.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.relatesToIsSet) {
      builder.relatesTo(json.relatesTo);
    }
    if (json.content != null) {
      builder.addAllContent(json.content);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.custodianIsSet) {
      builder.custodian(json.custodian);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.securityLabelIsSet) {
      builder.securityLabel(json.securityLabel);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.authenticatorIsSet) {
      builder.authenticator(json.authenticator);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.docStatusIsSet) {
      builder.docStatus(json.docStatus);
    }
    if (json.masterIdentifierIsSet) {
      builder.masterIdentifier(json.masterIdentifier);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    return (ImmutableDocumentReference) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DocumentReference} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DocumentReference instance
   */
  public static DocumentReference copyOf(DocumentReference instance) {
    if (instance instanceof ImmutableDocumentReference) {
      return (ImmutableDocumentReference) instance;
    }
    return ((ImmutableDocumentReference.Builder) ImmutableDocumentReference.builder())
        .status(instance.status())
        .relatesTo(instance.relatesTo())
        .addAllContent(instance.content())
        .category(instance.category())
        .description(instance.description())
        .extension(instance.extension())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .custodian(instance.custodian())
        .text(instance.text())
        .author(instance.author())
        .resourceType(instance.resourceType())
        .date(instance.date())
        .meta(instance.meta())
        .securityLabel(instance.securityLabel())
        .language(instance.language())
        .authenticator(instance.authenticator())
        .modifierExtension(instance.modifierExtension())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .subject(instance.subject())
        .docStatus(instance.docStatus())
        .masterIdentifier(instance.masterIdentifier())
        .type(instance.type())
        .context(instance.context())
        .build();
  }

  /**
   * Creates a builder for {@link DocumentReference DocumentReference}.
   * <pre>
   * ImmutableDocumentReference.builder()
   *    .status(com.fhir.types.fhir.DocumentreferenceStatus) // optional {@link DocumentReference#status() status}
   *    .relatesTo(List&amp;lt;com.fhir.types.fhir.DocumentReference_RelatesTo&amp;gt;) // optional {@link DocumentReference#relatesTo() relatesTo}
   *    .addContent|addAllContent(com.fhir.types.fhir.DocumentReference_Content) // {@link DocumentReference#content() content} elements
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link DocumentReference#category() category}
   *    .description(String) // optional {@link DocumentReference#description() description}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DocumentReference#extension() extension}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link DocumentReference#implicitRules() implicitRules}
   *    .id(com.fhir.types.fhir.Id) // optional {@link DocumentReference#id() id}
   *    .custodian(com.fhir.types.fhir.Reference) // optional {@link DocumentReference#custodian() custodian}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link DocumentReference#text() text}
   *    .author(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link DocumentReference#author() author}
   *    .resourceType(String) // required {@link DocumentReference#resourceType() resourceType}
   *    .date(com.fhir.types.fhir.Instant) // optional {@link DocumentReference#date() date}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link DocumentReference#meta() meta}
   *    .securityLabel(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link DocumentReference#securityLabel() securityLabel}
   *    .language(com.fhir.types.fhir.Code) // optional {@link DocumentReference#language() language}
   *    .authenticator(com.fhir.types.fhir.Reference) // optional {@link DocumentReference#authenticator() authenticator}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DocumentReference#modifierExtension() modifierExtension}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link DocumentReference#contained() contained}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link DocumentReference#identifier() identifier}
   *    .subject(com.fhir.types.fhir.Reference) // optional {@link DocumentReference#subject() subject}
   *    .docStatus(com.fhir.types.fhir.Code) // optional {@link DocumentReference#docStatus() docStatus}
   *    .masterIdentifier(com.fhir.types.fhir.Identifier) // optional {@link DocumentReference#masterIdentifier() masterIdentifier}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link DocumentReference#type() type}
   *    .context(com.fhir.types.fhir.DocumentReference_Context) // optional {@link DocumentReference#context() context}
   *    .build();
   * </pre>
   * @return A new DocumentReference builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDocumentReference.Builder();
  }

  /**
   * Builds instances of type {@link DocumentReference DocumentReference}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DocumentReference", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_RELATES_TO = 0x2L;
    private static final long OPT_BIT_CATEGORY = 0x4L;
    private static final long OPT_BIT_DESCRIPTION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_CUSTODIAN = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_AUTHOR = 0x200L;
    private static final long OPT_BIT_DATE = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_SECURITY_LABEL = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private static final long OPT_BIT_AUTHENTICATOR = 0x4000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8000L;
    private static final long OPT_BIT_CONTAINED = 0x10000L;
    private static final long OPT_BIT_IDENTIFIER = 0x20000L;
    private static final long OPT_BIT_SUBJECT = 0x40000L;
    private static final long OPT_BIT_DOC_STATUS = 0x80000L;
    private static final long OPT_BIT_MASTER_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_TYPE = 0x200000L;
    private static final long OPT_BIT_CONTEXT = 0x400000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable DocumentreferenceStatus status;
    private @Nullable List<DocumentReference_RelatesTo> relatesTo;
    private final List<DocumentReference_Content> content = new ArrayList<DocumentReference_Content>();
    private @Nullable List<CodeableConcept> category;
    private @Nullable String description;
    private @Nullable List<Extension> extension;
    private @Nullable Uri implicitRules;
    private @Nullable Id id;
    private @Nullable Reference custodian;
    private @Nullable Narrative text;
    private @Nullable List<Reference> author;
    private @Nullable String resourceType;
    private @Nullable Instant date;
    private @Nullable Meta meta;
    private @Nullable List<CodeableConcept> securityLabel;
    private @Nullable Code language;
    private @Nullable Reference authenticator;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference subject;
    private @Nullable Code docStatus;
    private @Nullable Identifier masterIdentifier;
    private @Nullable CodeableConcept type;
    private @Nullable DocumentReference_Context context;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DocumentReference#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(DocumentreferenceStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends DocumentreferenceStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatesTo(List<DocumentReference_RelatesTo> relatesTo) {
      checkNotIsSet(relatesToIsSet(), "relatesTo");
      this.relatesTo = Objects.requireNonNull(relatesTo, "relatesTo");
      optBits |= OPT_BIT_RELATES_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relatesTo")
    public final Builder relatesTo(Optional<? extends List<DocumentReference_RelatesTo>> relatesTo) {
      checkNotIsSet(relatesToIsSet(), "relatesTo");
      this.relatesTo = relatesTo.orElse(null);
      optBits |= OPT_BIT_RELATES_TO;
      return this;
    }

    /**
     * Adds one element to {@link DocumentReference#content() content} list.
     * @param element A content element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addContent(DocumentReference_Content element) {
      this.content.add(Objects.requireNonNull(element, "content element"));
      return this;
    }

    /**
     * Adds elements to {@link DocumentReference#content() content} list.
     * @param elements An array of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addContent(DocumentReference_Content... elements) {
      for (DocumentReference_Content element : elements) {
        this.content.add(Objects.requireNonNull(element, "content element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link DocumentReference#content() content} list.
     * @param elements An iterable of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllContent(Iterable<? extends DocumentReference_Content> elements) {
      for (DocumentReference_Content element : elements) {
        this.content.add(Objects.requireNonNull(element, "content element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#description() description} to description.
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
     * Initializes the optional value {@link DocumentReference#description() description} to description.
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
     * Initializes the optional value {@link DocumentReference#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DocumentReference#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DocumentReference#id() id} to id.
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
     * Initializes the optional value {@link DocumentReference#id() id} to id.
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
     * Initializes the optional value {@link DocumentReference#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for chained invocation
     */
    public final Builder custodian(Reference custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = Objects.requireNonNull(custodian, "custodian");
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("custodian")
    public final Builder custodian(Optional<? extends Reference> custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = custodian.orElse(null);
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#text() text} to text.
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
     * Initializes the optional value {@link DocumentReference#text() text} to text.
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
     * Initializes the optional value {@link DocumentReference#author() author} to author.
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
     * Initializes the optional value {@link DocumentReference#author() author} to author.
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
     * Initializes the value for the {@link DocumentReference#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DocumentReference#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(Instant date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends Instant> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#meta() meta} to meta.
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
     * Initializes the optional value {@link DocumentReference#meta() meta} to meta.
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
     * Initializes the optional value {@link DocumentReference#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabel(List<CodeableConcept> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = Objects.requireNonNull(securityLabel, "securityLabel");
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("securityLabel")
    public final Builder securityLabel(Optional<? extends List<CodeableConcept>> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = securityLabel.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#language() language} to language.
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
     * Initializes the optional value {@link DocumentReference#language() language} to language.
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
     * Initializes the optional value {@link DocumentReference#authenticator() authenticator} to authenticator.
     * @param authenticator The value for authenticator
     * @return {@code this} builder for chained invocation
     */
    public final Builder authenticator(Reference authenticator) {
      checkNotIsSet(authenticatorIsSet(), "authenticator");
      this.authenticator = Objects.requireNonNull(authenticator, "authenticator");
      optBits |= OPT_BIT_AUTHENTICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#authenticator() authenticator} to authenticator.
     * @param authenticator The value for authenticator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authenticator")
    public final Builder authenticator(Optional<? extends Reference> authenticator) {
      checkNotIsSet(authenticatorIsSet(), "authenticator");
      this.authenticator = authenticator.orElse(null);
      optBits |= OPT_BIT_AUTHENTICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentReference#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentReference#contained() contained} to contained.
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
     * Initializes the optional value {@link DocumentReference#contained() contained} to contained.
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
     * Initializes the optional value {@link DocumentReference#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DocumentReference#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DocumentReference#subject() subject} to subject.
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
     * Initializes the optional value {@link DocumentReference#subject() subject} to subject.
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
     * Initializes the optional value {@link DocumentReference#docStatus() docStatus} to docStatus.
     * @param docStatus The value for docStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder docStatus(Code docStatus) {
      checkNotIsSet(docStatusIsSet(), "docStatus");
      this.docStatus = Objects.requireNonNull(docStatus, "docStatus");
      optBits |= OPT_BIT_DOC_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#docStatus() docStatus} to docStatus.
     * @param docStatus The value for docStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("docStatus")
    public final Builder docStatus(Optional<? extends Code> docStatus) {
      checkNotIsSet(docStatusIsSet(), "docStatus");
      this.docStatus = docStatus.orElse(null);
      optBits |= OPT_BIT_DOC_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#masterIdentifier() masterIdentifier} to masterIdentifier.
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
     * Initializes the optional value {@link DocumentReference#masterIdentifier() masterIdentifier} to masterIdentifier.
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
     * Initializes the optional value {@link DocumentReference#type() type} to type.
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
     * Initializes the optional value {@link DocumentReference#type() type} to type.
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
     * Initializes the optional value {@link DocumentReference#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(DocumentReference_Context context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends DocumentReference_Context> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Builds a new {@link DocumentReference DocumentReference}.
     * @return An immutable instance of DocumentReference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DocumentReference build() {
      checkRequiredAttributes();
      return new ImmutableDocumentReference(
          status,
          relatesTo,
          createUnmodifiableList(true, content),
          category,
          description,
          extension,
          implicitRules,
          id,
          custodian,
          text,
          author,
          resourceType,
          date,
          meta,
          securityLabel,
          language,
          authenticator,
          modifierExtension,
          contained,
          identifier,
          subject,
          docStatus,
          masterIdentifier,
          type,
          context);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean relatesToIsSet() {
      return (optBits & OPT_BIT_RELATES_TO) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean custodianIsSet() {
      return (optBits & OPT_BIT_CUSTODIAN) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean securityLabelIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean authenticatorIsSet() {
      return (optBits & OPT_BIT_AUTHENTICATOR) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean docStatusIsSet() {
      return (optBits & OPT_BIT_DOC_STATUS) != 0;
    }

    private boolean masterIdentifierIsSet() {
      return (optBits & OPT_BIT_MASTER_IDENTIFIER) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DocumentReference is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DocumentReference, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DocumentReference", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DocumentReference#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "DocumentReference", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DocumentReference#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(DocumentreferenceStatus status);

    /**
     * Initializes the optional value {@link DocumentReference#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends DocumentreferenceStatus> status);

    /**
     * Initializes the optional value {@link DocumentReference#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatesTo(List<DocumentReference_RelatesTo> relatesTo);

    /**
     * Initializes the optional value {@link DocumentReference#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatesTo(Optional<? extends List<DocumentReference_RelatesTo>> relatesTo);

    /**
     * Adds one element to {@link DocumentReference#content() content} list.
     * @param element A content element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addContent(DocumentReference_Content element);

    /**
     * Adds elements to {@link DocumentReference#content() content} list.
     * @param elements An array of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addContent(DocumentReference_Content... elements);

    /**
     * Adds elements to {@link DocumentReference#content() content} list.
     * @param elements An iterable of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllContent(Iterable<? extends DocumentReference_Content> elements);

    /**
     * Initializes the optional value {@link DocumentReference#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link DocumentReference#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link DocumentReference#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link DocumentReference#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link DocumentReference#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DocumentReference#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DocumentReference#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link DocumentReference#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link DocumentReference#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link DocumentReference#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link DocumentReference#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for chained invocation
     */
    BuildFinal custodian(Reference custodian);

    /**
     * Initializes the optional value {@link DocumentReference#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal custodian(Optional<? extends Reference> custodian);

    /**
     * Initializes the optional value {@link DocumentReference#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link DocumentReference#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link DocumentReference#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(List<Reference> author);

    /**
     * Initializes the optional value {@link DocumentReference#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends List<Reference>> author);

    /**
     * Initializes the optional value {@link DocumentReference#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(Instant date);

    /**
     * Initializes the optional value {@link DocumentReference#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends Instant> date);

    /**
     * Initializes the optional value {@link DocumentReference#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link DocumentReference#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link DocumentReference#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    BuildFinal securityLabel(List<CodeableConcept> securityLabel);

    /**
     * Initializes the optional value {@link DocumentReference#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal securityLabel(Optional<? extends List<CodeableConcept>> securityLabel);

    /**
     * Initializes the optional value {@link DocumentReference#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link DocumentReference#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link DocumentReference#authenticator() authenticator} to authenticator.
     * @param authenticator The value for authenticator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authenticator(Reference authenticator);

    /**
     * Initializes the optional value {@link DocumentReference#authenticator() authenticator} to authenticator.
     * @param authenticator The value for authenticator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authenticator(Optional<? extends Reference> authenticator);

    /**
     * Initializes the optional value {@link DocumentReference#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentReference#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentReference#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link DocumentReference#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link DocumentReference#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link DocumentReference#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link DocumentReference#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link DocumentReference#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link DocumentReference#docStatus() docStatus} to docStatus.
     * @param docStatus The value for docStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal docStatus(Code docStatus);

    /**
     * Initializes the optional value {@link DocumentReference#docStatus() docStatus} to docStatus.
     * @param docStatus The value for docStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal docStatus(Optional<? extends Code> docStatus);

    /**
     * Initializes the optional value {@link DocumentReference#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal masterIdentifier(Identifier masterIdentifier);

    /**
     * Initializes the optional value {@link DocumentReference#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal masterIdentifier(Optional<? extends Identifier> masterIdentifier);

    /**
     * Initializes the optional value {@link DocumentReference#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link DocumentReference#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link DocumentReference#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(DocumentReference_Context context);

    /**
     * Initializes the optional value {@link DocumentReference#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(Optional<? extends DocumentReference_Context> context);

    /**
     * Builds a new {@link DocumentReference DocumentReference}.
     * @return An immutable instance of DocumentReference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DocumentReference build();
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
