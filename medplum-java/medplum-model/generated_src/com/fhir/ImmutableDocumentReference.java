//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DocumentReference}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDocumentReference.builder()}.
 */
@org.immutables.value.Generated(from = "DocumentReference", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDocumentReference implements com.fhir.DocumentReference {
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.DocumentReference_Context context;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> securityLabel;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code docStatus;
  private final @javax.annotation.Nullable com.fhir.Reference authenticator;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.DocumentreferenceStatus status;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DocumentReference_RelatesTo> relatesTo;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final java.util.List<com.fhir.DocumentReference_Content> content;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference custodian;
  private final @javax.annotation.Nullable com.fhir.Identifier masterIdentifier;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.instant date;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;

  private ImmutableDocumentReference(
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.DocumentReference_Context context,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> author,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> securityLabel,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code docStatus,
      @javax.annotation.Nullable com.fhir.Reference authenticator,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.DocumentreferenceStatus status,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.DocumentReference_RelatesTo> relatesTo,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      java.util.List<com.fhir.DocumentReference_Content> content,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference custodian,
      @javax.annotation.Nullable com.fhir.Identifier masterIdentifier,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.instant date,
      @javax.annotation.Nullable com.fhir.uri implicitRules) {
    this.subject = subject;
    this.language = language;
    this.description = description;
    this.contained = contained;
    this.context = context;
    this.category = category;
    this.author = author;
    this.identifier = identifier;
    this.securityLabel = securityLabel;
    this.meta = meta;
    this.docStatus = docStatus;
    this.authenticator = authenticator;
    this.extension = extension;
    this.status = status;
    this.id = id;
    this.relatesTo = relatesTo;
    this.modifierExtension = modifierExtension;
    this.content = content;
    this.text = text;
    this.custodian = custodian;
    this.masterIdentifier = masterIdentifier;
    this.type = type;
    this.resourceType = resourceType;
    this.date = date;
    this.implicitRules = implicitRules;
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("context")
  @Override
  public java.util.Optional<com.fhir.DocumentReference_Context> context() {
    return java.util.Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code securityLabel} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("securityLabel")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> securityLabel() {
    return java.util.Optional.ofNullable(securityLabel);
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
   * @return The value of the {@code docStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("docStatus")
  @Override
  public java.util.Optional<com.fhir.code> docStatus() {
    return java.util.Optional.ofNullable(docStatus);
  }

  /**
   * @return The value of the {@code authenticator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authenticator")
  @Override
  public java.util.Optional<com.fhir.Reference> authenticator() {
    return java.util.Optional.ofNullable(authenticator);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.DocumentreferenceStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code relatesTo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatesTo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DocumentReference_RelatesTo>> relatesTo() {
    return java.util.Optional.ofNullable(relatesTo);
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
   * @return The value of the {@code content} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  @Override
  public java.util.List<com.fhir.DocumentReference_Content> content() {
    return content;
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
   * @return The value of the {@code custodian} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("custodian")
  @Override
  public java.util.Optional<com.fhir.Reference> custodian() {
    return java.util.Optional.ofNullable(custodian);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.instant> date() {
    return java.util.Optional.ofNullable(date);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableDocumentReference(
        newValue,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableDocumentReference(
        value,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        newValue,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        value,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        newValue,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        value,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        newValue,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        value,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withContext(com.fhir.DocumentReference_Context value) {
    @javax.annotation.Nullable com.fhir.DocumentReference_Context newValue = java.util.Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        newValue,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withContext(java.util.Optional<? extends com.fhir.DocumentReference_Context> optional) {
    @javax.annotation.Nullable com.fhir.DocumentReference_Context value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        value,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        newValue,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        value,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withAuthor(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        newValue,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withAuthor(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        value,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        newValue,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        value,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#securityLabel() securityLabel} attribute.
   * @param value The value for securityLabel
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withSecurityLabel(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "securityLabel");
    if (this.securityLabel == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        newValue,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#securityLabel() securityLabel} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabel
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withSecurityLabel(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.securityLabel == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        value,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        newValue,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        value,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#docStatus() docStatus} attribute.
   * @param value The value for docStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withDocStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "docStatus");
    if (this.docStatus == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        newValue,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#docStatus() docStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for docStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withDocStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.docStatus == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        value,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#authenticator() authenticator} attribute.
   * @param value The value for authenticator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withAuthenticator(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "authenticator");
    if (this.authenticator == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        newValue,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#authenticator() authenticator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authenticator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withAuthenticator(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.authenticator == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        value,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        newValue,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        value,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withStatus(com.fhir.DocumentreferenceStatus value) {
    @javax.annotation.Nullable com.fhir.DocumentreferenceStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        newValue,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withStatus(java.util.Optional<? extends com.fhir.DocumentreferenceStatus> optional) {
    @javax.annotation.Nullable com.fhir.DocumentreferenceStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        value,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        newValue,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        value,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#relatesTo() relatesTo} attribute.
   * @param value The value for relatesTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withRelatesTo(java.util.List<com.fhir.DocumentReference_RelatesTo> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DocumentReference_RelatesTo> newValue = java.util.Objects.requireNonNull(value, "relatesTo");
    if (this.relatesTo == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        newValue,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#relatesTo() relatesTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatesTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withRelatesTo(java.util.Optional<? extends java.util.List<com.fhir.DocumentReference_RelatesTo>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DocumentReference_RelatesTo> value = optional.orElse(null);
    if (this.relatesTo == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        value,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        newValue,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        value,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DocumentReference#content() content}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withContent(com.fhir.DocumentReference_Content... elements) {
    java.util.List<com.fhir.DocumentReference_Content> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        newValue,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DocumentReference#content() content}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of content elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withContent(Iterable<? extends com.fhir.DocumentReference_Content> elements) {
    if (this.content == elements) return this;
    java.util.List<com.fhir.DocumentReference_Content> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        newValue,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        newValue,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        value,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#custodian() custodian} attribute.
   * @param value The value for custodian
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withCustodian(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "custodian");
    if (this.custodian == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        newValue,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#custodian() custodian} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for custodian
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withCustodian(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.custodian == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        value,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#masterIdentifier() masterIdentifier} attribute.
   * @param value The value for masterIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withMasterIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "masterIdentifier");
    if (this.masterIdentifier == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        newValue,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#masterIdentifier() masterIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for masterIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withMasterIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.masterIdentifier == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        value,
        this.type,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        newValue,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        value,
        this.resourceType,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DocumentReference#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDocumentReference withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        newValue,
        this.date,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withDate(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withDate(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        value,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDocumentReference(
        this.subject,
        this.language,
        this.description,
        this.contained,
        this.context,
        this.category,
        this.author,
        this.identifier,
        this.securityLabel,
        this.meta,
        this.docStatus,
        this.authenticator,
        this.extension,
        this.status,
        this.id,
        this.relatesTo,
        this.modifierExtension,
        this.content,
        this.text,
        this.custodian,
        this.masterIdentifier,
        this.type,
        this.resourceType,
        this.date,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDocumentReference} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDocumentReference
        && equalTo((ImmutableDocumentReference) another);
  }

  private boolean equalTo(ImmutableDocumentReference another) {
    return java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(context, another.context)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(securityLabel, another.securityLabel)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(docStatus, another.docStatus)
        && java.util.Objects.equals(authenticator, another.authenticator)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(relatesTo, another.relatesTo)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && content.equals(another.content)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(custodian, another.custodian)
        && java.util.Objects.equals(masterIdentifier, another.masterIdentifier)
        && java.util.Objects.equals(type, another.type)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code subject}, {@code language}, {@code description}, {@code contained}, {@code context}, {@code category}, {@code author}, {@code identifier}, {@code securityLabel}, {@code meta}, {@code docStatus}, {@code authenticator}, {@code extension}, {@code status}, {@code id}, {@code relatesTo}, {@code modifierExtension}, {@code content}, {@code text}, {@code custodian}, {@code masterIdentifier}, {@code type}, {@code resourceType}, {@code date}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(context);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(securityLabel);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(docStatus);
    h += (h << 5) + java.util.Objects.hashCode(authenticator);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(relatesTo);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + content.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(custodian);
    h += (h << 5) + java.util.Objects.hashCode(masterIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code DocumentReference} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DocumentReference{");
    if (subject != null) {
      builder.append("subject=").append(subject);
    }
    if (language != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (description != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (contained != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (context != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("context=").append(context);
    }
    if (category != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (author != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (identifier != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (securityLabel != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("securityLabel=").append(securityLabel);
    }
    if (meta != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (docStatus != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("docStatus=").append(docStatus);
    }
    if (authenticator != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("authenticator=").append(authenticator);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (relatesTo != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("relatesTo=").append(relatesTo);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("content=").append(content);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (custodian != null) {
      builder.append(", ");
      builder.append("custodian=").append(custodian);
    }
    if (masterIdentifier != null) {
      builder.append(", ");
      builder.append("masterIdentifier=").append(masterIdentifier);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DocumentReference", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DocumentReference {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DocumentReference_Context> context = java.util.Optional.empty();
    boolean contextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> securityLabel = java.util.Optional.empty();
    boolean securityLabelIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> docStatus = java.util.Optional.empty();
    boolean docStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> authenticator = java.util.Optional.empty();
    boolean authenticatorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DocumentreferenceStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DocumentReference_RelatesTo>> relatesTo = java.util.Optional.empty();
    boolean relatesToIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.DocumentReference_Content> content = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> custodian = java.util.Optional.empty();
    boolean custodianIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> masterIdentifier = java.util.Optional.empty();
    boolean masterIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Optional<com.fhir.DocumentReference_Context> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.Reference>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("securityLabel")
    public void setSecurityLabel(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> securityLabel) {
      this.securityLabel = securityLabel;
      this.securityLabelIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("docStatus")
    public void setDocStatus(java.util.Optional<com.fhir.code> docStatus) {
      this.docStatus = docStatus;
      this.docStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authenticator")
    public void setAuthenticator(java.util.Optional<com.fhir.Reference> authenticator) {
      this.authenticator = authenticator;
      this.authenticatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.DocumentreferenceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatesTo")
    public void setRelatesTo(java.util.Optional<java.util.List<com.fhir.DocumentReference_RelatesTo>> relatesTo) {
      this.relatesTo = relatesTo;
      this.relatesToIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    public void setContent(java.util.List<com.fhir.DocumentReference_Content> content) {
      this.content = content;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("custodian")
    public void setCustodian(java.util.Optional<com.fhir.Reference> custodian) {
      this.custodian = custodian;
      this.custodianIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("masterIdentifier")
    public void setMasterIdentifier(java.util.Optional<com.fhir.Identifier> masterIdentifier) {
      this.masterIdentifier = masterIdentifier;
      this.masterIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.instant> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DocumentReference_Context> context() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> securityLabel() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> docStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> authenticator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DocumentreferenceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DocumentReference_RelatesTo>> relatesTo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.DocumentReference_Content> content() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> custodian() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> masterIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDocumentReference fromJson(Json json) {
    ImmutableDocumentReference.Builder builder = ((ImmutableDocumentReference.Builder) ImmutableDocumentReference.builder());
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.securityLabelIsSet) {
      builder.securityLabel(json.securityLabel);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.docStatusIsSet) {
      builder.docStatus(json.docStatus);
    }
    if (json.authenticatorIsSet) {
      builder.authenticator(json.authenticator);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.relatesToIsSet) {
      builder.relatesTo(json.relatesTo);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.content != null) {
      builder.addAllContent(json.content);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.custodianIsSet) {
      builder.custodian(json.custodian);
    }
    if (json.masterIdentifierIsSet) {
      builder.masterIdentifier(json.masterIdentifier);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
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
        .subject(instance.subject())
        .language(instance.language())
        .description(instance.description())
        .contained(instance.contained())
        .context(instance.context())
        .category(instance.category())
        .author(instance.author())
        .identifier(instance.identifier())
        .securityLabel(instance.securityLabel())
        .meta(instance.meta())
        .docStatus(instance.docStatus())
        .authenticator(instance.authenticator())
        .extension(instance.extension())
        .status(instance.status())
        .id(instance.id())
        .relatesTo(instance.relatesTo())
        .modifierExtension(instance.modifierExtension())
        .addAllContent(instance.content())
        .text(instance.text())
        .custodian(instance.custodian())
        .masterIdentifier(instance.masterIdentifier())
        .type(instance.type())
        .resourceType(instance.resourceType())
        .date(instance.date())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link DocumentReference DocumentReference}.
   * <pre>
   * ImmutableDocumentReference.builder()
   *    .subject(com.fhir.Reference) // optional {@link DocumentReference#subject() subject}
   *    .language(com.fhir.code) // optional {@link DocumentReference#language() language}
   *    .description(String) // optional {@link DocumentReference#description() description}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link DocumentReference#contained() contained}
   *    .context(com.fhir.DocumentReference_Context) // optional {@link DocumentReference#context() context}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DocumentReference#category() category}
   *    .author(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DocumentReference#author() author}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link DocumentReference#identifier() identifier}
   *    .securityLabel(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DocumentReference#securityLabel() securityLabel}
   *    .meta(com.fhir.Meta) // optional {@link DocumentReference#meta() meta}
   *    .docStatus(com.fhir.code) // optional {@link DocumentReference#docStatus() docStatus}
   *    .authenticator(com.fhir.Reference) // optional {@link DocumentReference#authenticator() authenticator}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DocumentReference#extension() extension}
   *    .status(com.fhir.DocumentreferenceStatus) // optional {@link DocumentReference#status() status}
   *    .id(com.fhir.id) // optional {@link DocumentReference#id() id}
   *    .relatesTo(List&amp;lt;com.fhir.DocumentReference_RelatesTo&amp;gt;) // optional {@link DocumentReference#relatesTo() relatesTo}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DocumentReference#modifierExtension() modifierExtension}
   *    .addContent|addAllContent(com.fhir.DocumentReference_Content) // {@link DocumentReference#content() content} elements
   *    .text(com.fhir.Narrative) // optional {@link DocumentReference#text() text}
   *    .custodian(com.fhir.Reference) // optional {@link DocumentReference#custodian() custodian}
   *    .masterIdentifier(com.fhir.Identifier) // optional {@link DocumentReference#masterIdentifier() masterIdentifier}
   *    .type(com.fhir.CodeableConcept) // optional {@link DocumentReference#type() type}
   *    .resourceType(String) // required {@link DocumentReference#resourceType() resourceType}
   *    .date(com.fhir.instant) // optional {@link DocumentReference#date() date}
   *    .implicitRules(com.fhir.uri) // optional {@link DocumentReference#implicitRules() implicitRules}
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
  @org.immutables.value.Generated(from = "DocumentReference", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_SUBJECT = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_CONTEXT = 0x10L;
    private static final long OPT_BIT_CATEGORY = 0x20L;
    private static final long OPT_BIT_AUTHOR = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_SECURITY_LABEL = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_DOC_STATUS = 0x400L;
    private static final long OPT_BIT_AUTHENTICATOR = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_STATUS = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_RELATES_TO = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_TEXT = 0x20000L;
    private static final long OPT_BIT_CUSTODIAN = 0x40000L;
    private static final long OPT_BIT_MASTER_IDENTIFIER = 0x80000L;
    private static final long OPT_BIT_TYPE = 0x100000L;
    private static final long OPT_BIT_DATE = 0x200000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.DocumentReference_Context context;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> author;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> securityLabel;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code docStatus;
    private @javax.annotation.Nullable com.fhir.Reference authenticator;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.DocumentreferenceStatus status;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.DocumentReference_RelatesTo> relatesTo;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private final java.util.List<com.fhir.DocumentReference_Content> content = new java.util.ArrayList<com.fhir.DocumentReference_Content>();
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference custodian;
    private @javax.annotation.Nullable com.fhir.Identifier masterIdentifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.instant date;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DocumentReference#subject() subject} to subject.
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
     * Initializes the optional value {@link DocumentReference#subject() subject} to subject.
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
     * Initializes the optional value {@link DocumentReference#language() language} to language.
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
     * Initializes the optional value {@link DocumentReference#language() language} to language.
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
     * Initializes the optional value {@link DocumentReference#description() description} to description.
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
     * Initializes the optional value {@link DocumentReference#description() description} to description.
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
     * Initializes the optional value {@link DocumentReference#contained() contained} to contained.
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
     * Initializes the optional value {@link DocumentReference#contained() contained} to contained.
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
     * Initializes the optional value {@link DocumentReference#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(com.fhir.DocumentReference_Context context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = java.util.Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public final Builder context(java.util.Optional<? extends com.fhir.DocumentReference_Context> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(java.util.List<com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#author() author} to author.
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
     * Initializes the optional value {@link DocumentReference#author() author} to author.
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
     * Initializes the optional value {@link DocumentReference#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DocumentReference#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DocumentReference#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabel(java.util.List<com.fhir.CodeableConcept> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = java.util.Objects.requireNonNull(securityLabel, "securityLabel");
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityLabel")
    public final Builder securityLabel(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = securityLabel.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#meta() meta} to meta.
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
     * Initializes the optional value {@link DocumentReference#meta() meta} to meta.
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
     * Initializes the optional value {@link DocumentReference#docStatus() docStatus} to docStatus.
     * @param docStatus The value for docStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder docStatus(com.fhir.code docStatus) {
      checkNotIsSet(docStatusIsSet(), "docStatus");
      this.docStatus = java.util.Objects.requireNonNull(docStatus, "docStatus");
      optBits |= OPT_BIT_DOC_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#docStatus() docStatus} to docStatus.
     * @param docStatus The value for docStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("docStatus")
    public final Builder docStatus(java.util.Optional<? extends com.fhir.code> docStatus) {
      checkNotIsSet(docStatusIsSet(), "docStatus");
      this.docStatus = docStatus.orElse(null);
      optBits |= OPT_BIT_DOC_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#authenticator() authenticator} to authenticator.
     * @param authenticator The value for authenticator
     * @return {@code this} builder for chained invocation
     */
    public final Builder authenticator(com.fhir.Reference authenticator) {
      checkNotIsSet(authenticatorIsSet(), "authenticator");
      this.authenticator = java.util.Objects.requireNonNull(authenticator, "authenticator");
      optBits |= OPT_BIT_AUTHENTICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#authenticator() authenticator} to authenticator.
     * @param authenticator The value for authenticator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticator")
    public final Builder authenticator(java.util.Optional<? extends com.fhir.Reference> authenticator) {
      checkNotIsSet(authenticatorIsSet(), "authenticator");
      this.authenticator = authenticator.orElse(null);
      optBits |= OPT_BIT_AUTHENTICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.DocumentreferenceStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.DocumentreferenceStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#id() id} to id.
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
     * Initializes the optional value {@link DocumentReference#id() id} to id.
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
     * Initializes the optional value {@link DocumentReference#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatesTo(java.util.List<com.fhir.DocumentReference_RelatesTo> relatesTo) {
      checkNotIsSet(relatesToIsSet(), "relatesTo");
      this.relatesTo = java.util.Objects.requireNonNull(relatesTo, "relatesTo");
      optBits |= OPT_BIT_RELATES_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatesTo")
    public final Builder relatesTo(java.util.Optional<? extends java.util.List<com.fhir.DocumentReference_RelatesTo>> relatesTo) {
      checkNotIsSet(relatesToIsSet(), "relatesTo");
      this.relatesTo = relatesTo.orElse(null);
      optBits |= OPT_BIT_RELATES_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentReference#modifierExtension() modifierExtension} to modifierExtension.
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
     * Adds one element to {@link DocumentReference#content() content} list.
     * @param element A content element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addContent(com.fhir.DocumentReference_Content element) {
      this.content.add(java.util.Objects.requireNonNull(element, "content element"));
      return this;
    }

    /**
     * Adds elements to {@link DocumentReference#content() content} list.
     * @param elements An array of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addContent(com.fhir.DocumentReference_Content... elements) {
      for (com.fhir.DocumentReference_Content element : elements) {
        this.content.add(java.util.Objects.requireNonNull(element, "content element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link DocumentReference#content() content} list.
     * @param elements An iterable of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllContent(Iterable<? extends com.fhir.DocumentReference_Content> elements) {
      for (com.fhir.DocumentReference_Content element : elements) {
        this.content.add(java.util.Objects.requireNonNull(element, "content element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#text() text} to text.
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
     * Initializes the optional value {@link DocumentReference#text() text} to text.
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
     * Initializes the optional value {@link DocumentReference#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for chained invocation
     */
    public final Builder custodian(com.fhir.Reference custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = java.util.Objects.requireNonNull(custodian, "custodian");
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("custodian")
    public final Builder custodian(java.util.Optional<? extends com.fhir.Reference> custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = custodian.orElse(null);
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#masterIdentifier() masterIdentifier} to masterIdentifier.
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
     * Initializes the optional value {@link DocumentReference#masterIdentifier() masterIdentifier} to masterIdentifier.
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
     * Initializes the optional value {@link DocumentReference#type() type} to type.
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
     * Initializes the optional value {@link DocumentReference#type() type} to type.
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
     * Initializes the value for the {@link DocumentReference#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DocumentReference#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.instant date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.instant> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DocumentReference#implicitRules() implicitRules} to implicitRules.
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
     * Builds a new {@link DocumentReference DocumentReference}.
     * @return An immutable instance of DocumentReference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DocumentReference build() {
      checkRequiredAttributes();
      return new ImmutableDocumentReference(
          subject,
          language,
          description,
          contained,
          context,
          category,
          author,
          identifier,
          securityLabel,
          meta,
          docStatus,
          authenticator,
          extension,
          status,
          id,
          relatesTo,
          modifierExtension,
          createUnmodifiableList(true, content),
          text,
          custodian,
          masterIdentifier,
          type,
          resourceType,
          date,
          implicitRules);
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean securityLabelIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean docStatusIsSet() {
      return (optBits & OPT_BIT_DOC_STATUS) != 0;
    }

    private boolean authenticatorIsSet() {
      return (optBits & OPT_BIT_AUTHENTICATOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean relatesToIsSet() {
      return (optBits & OPT_BIT_RELATES_TO) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean custodianIsSet() {
      return (optBits & OPT_BIT_CUSTODIAN) != 0;
    }

    private boolean masterIdentifierIsSet() {
      return (optBits & OPT_BIT_MASTER_IDENTIFIER) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DocumentReference is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DocumentReference, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "DocumentReference", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DocumentReference#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "DocumentReference", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DocumentReference#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link DocumentReference#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link DocumentReference#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link DocumentReference#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link DocumentReference#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link DocumentReference#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link DocumentReference#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link DocumentReference#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link DocumentReference#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(com.fhir.DocumentReference_Context context);

    /**
     * Initializes the optional value {@link DocumentReference#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(java.util.Optional<? extends com.fhir.DocumentReference_Context> context);

    /**
     * Initializes the optional value {@link DocumentReference#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link DocumentReference#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link DocumentReference#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.Reference> author);

    /**
     * Initializes the optional value {@link DocumentReference#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.Reference>> author);

    /**
     * Initializes the optional value {@link DocumentReference#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link DocumentReference#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link DocumentReference#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    BuildFinal securityLabel(java.util.List<com.fhir.CodeableConcept> securityLabel);

    /**
     * Initializes the optional value {@link DocumentReference#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal securityLabel(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> securityLabel);

    /**
     * Initializes the optional value {@link DocumentReference#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link DocumentReference#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link DocumentReference#docStatus() docStatus} to docStatus.
     * @param docStatus The value for docStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal docStatus(com.fhir.code docStatus);

    /**
     * Initializes the optional value {@link DocumentReference#docStatus() docStatus} to docStatus.
     * @param docStatus The value for docStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal docStatus(java.util.Optional<? extends com.fhir.code> docStatus);

    /**
     * Initializes the optional value {@link DocumentReference#authenticator() authenticator} to authenticator.
     * @param authenticator The value for authenticator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authenticator(com.fhir.Reference authenticator);

    /**
     * Initializes the optional value {@link DocumentReference#authenticator() authenticator} to authenticator.
     * @param authenticator The value for authenticator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authenticator(java.util.Optional<? extends com.fhir.Reference> authenticator);

    /**
     * Initializes the optional value {@link DocumentReference#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link DocumentReference#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link DocumentReference#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.DocumentreferenceStatus status);

    /**
     * Initializes the optional value {@link DocumentReference#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.DocumentreferenceStatus> status);

    /**
     * Initializes the optional value {@link DocumentReference#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link DocumentReference#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link DocumentReference#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatesTo(java.util.List<com.fhir.DocumentReference_RelatesTo> relatesTo);

    /**
     * Initializes the optional value {@link DocumentReference#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatesTo(java.util.Optional<? extends java.util.List<com.fhir.DocumentReference_RelatesTo>> relatesTo);

    /**
     * Initializes the optional value {@link DocumentReference#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentReference#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Adds one element to {@link DocumentReference#content() content} list.
     * @param element A content element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addContent(com.fhir.DocumentReference_Content element);

    /**
     * Adds elements to {@link DocumentReference#content() content} list.
     * @param elements An array of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addContent(com.fhir.DocumentReference_Content... elements);

    /**
     * Adds elements to {@link DocumentReference#content() content} list.
     * @param elements An iterable of content elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllContent(Iterable<? extends com.fhir.DocumentReference_Content> elements);

    /**
     * Initializes the optional value {@link DocumentReference#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link DocumentReference#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link DocumentReference#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for chained invocation
     */
    BuildFinal custodian(com.fhir.Reference custodian);

    /**
     * Initializes the optional value {@link DocumentReference#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal custodian(java.util.Optional<? extends com.fhir.Reference> custodian);

    /**
     * Initializes the optional value {@link DocumentReference#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal masterIdentifier(com.fhir.Identifier masterIdentifier);

    /**
     * Initializes the optional value {@link DocumentReference#masterIdentifier() masterIdentifier} to masterIdentifier.
     * @param masterIdentifier The value for masterIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal masterIdentifier(java.util.Optional<? extends com.fhir.Identifier> masterIdentifier);

    /**
     * Initializes the optional value {@link DocumentReference#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link DocumentReference#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link DocumentReference#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.instant date);

    /**
     * Initializes the optional value {@link DocumentReference#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.instant> date);

    /**
     * Initializes the optional value {@link DocumentReference#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link DocumentReference#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Builds a new {@link DocumentReference DocumentReference}.
     * @return An immutable instance of DocumentReference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DocumentReference build();
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
