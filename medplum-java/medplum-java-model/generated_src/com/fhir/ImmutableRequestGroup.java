//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RequestGroup}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRequestGroup.builder()}.
 */
@org.immutables.value.Generated(from = "RequestGroup", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRequestGroup implements com.fhir.RequestGroup {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> action;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.Reference author;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.dateTime authoredOn;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable com.fhir.code intent;
  private final @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;

  private ImmutableRequestGroup(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> action,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.Reference author,
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.dateTime authoredOn,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable com.fhir.code intent,
      @javax.annotation.Nullable com.fhir.Identifier groupIdentifier,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference) {
    this.language = language;
    this.contained = contained;
    this.replaces = replaces;
    this.instantiatesCanonical = instantiatesCanonical;
    this.action = action;
    this.id = id;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.author = author;
    this.priority = priority;
    this.code = code;
    this.identifier = identifier;
    this.authoredOn = authoredOn;
    this.encounter = encounter;
    this.note = note;
    this.instantiatesUri = instantiatesUri;
    this.subject = subject;
    this.basedOn = basedOn;
    this.intent = intent;
    this.groupIdentifier = groupIdentifier;
    this.reasonCode = reasonCode;
    this.meta = meta;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.reasonReference = reasonReference;
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code replaces} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("replaces")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> replaces() {
    return java.util.Optional.ofNullable(replaces);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("action")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RequestGroup_Action>> action() {
    return java.util.Optional.ofNullable(action);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.code> priority() {
    return java.util.Optional.ofNullable(priority);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code authoredOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
  @Override
  public java.util.Optional<com.fhir.dateTime> authoredOn() {
    return java.util.Optional.ofNullable(authoredOn);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
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
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code intent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intent")
  @Override
  public java.util.Optional<com.fhir.code> intent() {
    return java.util.Optional.ofNullable(intent);
  }

  /**
   * @return The value of the {@code groupIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> groupIdentifier() {
    return java.util.Optional.ofNullable(groupIdentifier);
  }

  /**
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableRequestGroup(
        newValue,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableRequestGroup(
        value,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        newValue,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        value,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withReplaces(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        newValue,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withReplaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        value,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        newValue,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        value,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withAction(java.util.List<com.fhir.RequestGroup_Action> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> newValue = java.util.Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        newValue,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withAction(java.util.Optional<? extends java.util.List<com.fhir.RequestGroup_Action>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        value,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        newValue,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        value,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        newValue,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        value,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        newValue,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        value,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        newValue,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        value,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withAuthor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        newValue,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withAuthor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        value,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        newValue,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        value,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        newValue,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        value,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        newValue,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        value,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withAuthoredOn(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        newValue,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withAuthoredOn(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        value,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        newValue,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        value,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        newValue,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        value,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        newValue,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        value,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        newValue,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        value,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        newValue,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        value,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withIntent(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        newValue,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withIntent(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        value,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withGroupIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        newValue,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withGroupIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        value,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        newValue,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        value,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        value,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RequestGroup#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRequestGroup withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        newValue,
        this.implicitRules,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        newValue,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        value,
        this.extension,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        value,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableRequestGroup(
        this.language,
        this.contained,
        this.replaces,
        this.instantiatesCanonical,
        this.action,
        this.id,
        this.text,
        this.modifierExtension,
        this.status,
        this.author,
        this.priority,
        this.code,
        this.identifier,
        this.authoredOn,
        this.encounter,
        this.note,
        this.instantiatesUri,
        this.subject,
        this.basedOn,
        this.intent,
        this.groupIdentifier,
        this.reasonCode,
        this.meta,
        this.resourceType,
        this.implicitRules,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRequestGroup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRequestGroup
        && equalTo((ImmutableRequestGroup) another);
  }

  private boolean equalTo(ImmutableRequestGroup another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(replaces, another.replaces)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(action, another.action)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(authoredOn, another.authoredOn)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(intent, another.intent)
        && java.util.Objects.equals(groupIdentifier, another.groupIdentifier)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(reasonReference, another.reasonReference);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code contained}, {@code replaces}, {@code instantiatesCanonical}, {@code action}, {@code id}, {@code text}, {@code modifierExtension}, {@code status}, {@code author}, {@code priority}, {@code code}, {@code identifier}, {@code authoredOn}, {@code encounter}, {@code note}, {@code instantiatesUri}, {@code subject}, {@code basedOn}, {@code intent}, {@code groupIdentifier}, {@code reasonCode}, {@code meta}, {@code resourceType}, {@code implicitRules}, {@code extension}, {@code reasonReference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(replaces);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(action);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(authoredOn);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(intent);
    h += (h << 5) + java.util.Objects.hashCode(groupIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    return h;
  }

  /**
   * Prints the immutable value {@code RequestGroup} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RequestGroup{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (replaces != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (action != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("action=").append(action);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (author != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (priority != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (code != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (identifier != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (authoredOn != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (encounter != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (note != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (subject != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (basedOn != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (intent != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (groupIdentifier != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (reasonCode != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (meta != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RequestGroup", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RequestGroup {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> replaces = java.util.Optional.empty();
    boolean replacesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RequestGroup_Action>> action = java.util.Optional.empty();
    boolean actionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> authoredOn = java.util.Optional.empty();
    boolean authoredOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> intent = java.util.Optional.empty();
    boolean intentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> groupIdentifier = java.util.Optional.empty();
    boolean groupIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public void setReplaces(java.util.Optional<java.util.List<com.fhir.Reference>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public void setAction(java.util.Optional<java.util.List<com.fhir.RequestGroup_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<com.fhir.Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public void setAuthoredOn(java.util.Optional<com.fhir.dateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public void setIntent(java.util.Optional<com.fhir.code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
    public void setGroupIdentifier(java.util.Optional<com.fhir.Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RequestGroup_Action>> action() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRequestGroup fromJson(Json json) {
    ImmutableRequestGroup.Builder builder = ((ImmutableRequestGroup.Builder) ImmutableRequestGroup.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    return (ImmutableRequestGroup) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RequestGroup} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RequestGroup instance
   */
  public static RequestGroup copyOf(RequestGroup instance) {
    if (instance instanceof ImmutableRequestGroup) {
      return (ImmutableRequestGroup) instance;
    }
    return ((ImmutableRequestGroup.Builder) ImmutableRequestGroup.builder())
        .language(instance.language())
        .contained(instance.contained())
        .replaces(instance.replaces())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .action(instance.action())
        .id(instance.id())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .author(instance.author())
        .priority(instance.priority())
        .code(instance.code())
        .identifier(instance.identifier())
        .authoredOn(instance.authoredOn())
        .encounter(instance.encounter())
        .note(instance.note())
        .instantiatesUri(instance.instantiatesUri())
        .subject(instance.subject())
        .basedOn(instance.basedOn())
        .intent(instance.intent())
        .groupIdentifier(instance.groupIdentifier())
        .reasonCode(instance.reasonCode())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .reasonReference(instance.reasonReference())
        .build();
  }

  /**
   * Creates a builder for {@link RequestGroup RequestGroup}.
   * <pre>
   * ImmutableRequestGroup.builder()
   *    .language(com.fhir.code) // optional {@link RequestGroup#language() language}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link RequestGroup#contained() contained}
   *    .replaces(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link RequestGroup#replaces() replaces}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link RequestGroup#instantiatesCanonical() instantiatesCanonical}
   *    .action(List&amp;lt;com.fhir.RequestGroup_Action&amp;gt;) // optional {@link RequestGroup#action() action}
   *    .id(com.fhir.id) // optional {@link RequestGroup#id() id}
   *    .text(com.fhir.Narrative) // optional {@link RequestGroup#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RequestGroup#modifierExtension() modifierExtension}
   *    .status(com.fhir.code) // optional {@link RequestGroup#status() status}
   *    .author(com.fhir.Reference) // optional {@link RequestGroup#author() author}
   *    .priority(com.fhir.code) // optional {@link RequestGroup#priority() priority}
   *    .code(com.fhir.CodeableConcept) // optional {@link RequestGroup#code() code}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link RequestGroup#identifier() identifier}
   *    .authoredOn(com.fhir.dateTime) // optional {@link RequestGroup#authoredOn() authoredOn}
   *    .encounter(com.fhir.Reference) // optional {@link RequestGroup#encounter() encounter}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link RequestGroup#note() note}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link RequestGroup#instantiatesUri() instantiatesUri}
   *    .subject(com.fhir.Reference) // optional {@link RequestGroup#subject() subject}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link RequestGroup#basedOn() basedOn}
   *    .intent(com.fhir.code) // optional {@link RequestGroup#intent() intent}
   *    .groupIdentifier(com.fhir.Identifier) // optional {@link RequestGroup#groupIdentifier() groupIdentifier}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link RequestGroup#reasonCode() reasonCode}
   *    .meta(com.fhir.Meta) // optional {@link RequestGroup#meta() meta}
   *    .resourceType(String) // required {@link RequestGroup#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link RequestGroup#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RequestGroup#extension() extension}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link RequestGroup#reasonReference() reasonReference}
   *    .build();
   * </pre>
   * @return A new RequestGroup builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableRequestGroup.Builder();
  }

  /**
   * Builds instances of type {@link RequestGroup RequestGroup}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "RequestGroup", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_REPLACES = 0x4L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x8L;
    private static final long OPT_BIT_ACTION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_STATUS = 0x100L;
    private static final long OPT_BIT_AUTHOR = 0x200L;
    private static final long OPT_BIT_PRIORITY = 0x400L;
    private static final long OPT_BIT_CODE = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x2000L;
    private static final long OPT_BIT_ENCOUNTER = 0x4000L;
    private static final long OPT_BIT_NOTE = 0x8000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x10000L;
    private static final long OPT_BIT_SUBJECT = 0x20000L;
    private static final long OPT_BIT_BASED_ON = 0x40000L;
    private static final long OPT_BIT_INTENT = 0x80000L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_REASON_CODE = 0x200000L;
    private static final long OPT_BIT_META = 0x400000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800000L;
    private static final long OPT_BIT_EXTENSION = 0x1000000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x2000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable java.util.List<com.fhir.RequestGroup_Action> action;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.Reference author;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.dateTime authoredOn;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable com.fhir.code intent;
    private @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RequestGroup#language() language} to language.
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
     * Initializes the optional value {@link RequestGroup#language() language} to language.
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
     * Initializes the optional value {@link RequestGroup#contained() contained} to contained.
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
     * Initializes the optional value {@link RequestGroup#contained() contained} to contained.
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
     * Initializes the optional value {@link RequestGroup#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    public final Builder replaces(java.util.List<com.fhir.Reference> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = java.util.Objects.requireNonNull(replaces, "replaces");
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public final Builder replaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = replaces.orElse(null);
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = java.util.Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(java.util.List<com.fhir.RequestGroup_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = java.util.Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public final Builder action(java.util.Optional<? extends java.util.List<com.fhir.RequestGroup_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup#text() text} to text.
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
     * Initializes the optional value {@link RequestGroup#text() text} to text.
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
     * Initializes the optional value {@link RequestGroup#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#author() author} to author.
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
     * Initializes the optional value {@link RequestGroup#author() author} to author.
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
     * Initializes the optional value {@link RequestGroup#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#code() code} to code.
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
     * Initializes the optional value {@link RequestGroup#code() code} to code.
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
     * Initializes the optional value {@link RequestGroup#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RequestGroup#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RequestGroup#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder authoredOn(com.fhir.dateTime authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = java.util.Objects.requireNonNull(authoredOn, "authoredOn");
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public final Builder authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = authoredOn.orElse(null);
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link RequestGroup#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link RequestGroup#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = java.util.Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#subject() subject} to subject.
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
     * Initializes the optional value {@link RequestGroup#subject() subject} to subject.
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
     * Initializes the optional value {@link RequestGroup#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link RequestGroup#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link RequestGroup#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(com.fhir.code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = java.util.Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public final Builder intent(java.util.Optional<? extends com.fhir.code> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupIdentifier(com.fhir.Identifier groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = java.util.Objects.requireNonNull(groupIdentifier, "groupIdentifier");
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
    public final Builder groupIdentifier(java.util.Optional<? extends com.fhir.Identifier> groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = groupIdentifier.orElse(null);
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = java.util.Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public final Builder reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#meta() meta} to meta.
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
     * Initializes the optional value {@link RequestGroup#meta() meta} to meta.
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
     * Initializes the value for the {@link RequestGroup#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link RequestGroup#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RequestGroup#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RequestGroup#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(java.util.List<com.fhir.Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = java.util.Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public final Builder reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Builds a new {@link RequestGroup RequestGroup}.
     * @return An immutable instance of RequestGroup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RequestGroup build() {
      checkRequiredAttributes();
      return new ImmutableRequestGroup(
          language,
          contained,
          replaces,
          instantiatesCanonical,
          action,
          id,
          text,
          modifierExtension,
          status,
          author,
          priority,
          code,
          identifier,
          authoredOn,
          encounter,
          note,
          instantiatesUri,
          subject,
          basedOn,
          intent,
          groupIdentifier,
          reasonCode,
          meta,
          resourceType,
          implicitRules,
          extension,
          reasonReference);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RequestGroup is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build RequestGroup, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "RequestGroup", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link RequestGroup#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "RequestGroup", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link RequestGroup#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link RequestGroup#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link RequestGroup#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link RequestGroup#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link RequestGroup#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(java.util.List<com.fhir.Reference> replaces);

    /**
     * Initializes the optional value {@link RequestGroup#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> replaces);

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link RequestGroup#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    BuildFinal action(java.util.List<com.fhir.RequestGroup_Action> action);

    /**
     * Initializes the optional value {@link RequestGroup#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(java.util.Optional<? extends java.util.List<com.fhir.RequestGroup_Action>> action);

    /**
     * Initializes the optional value {@link RequestGroup#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link RequestGroup#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link RequestGroup#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link RequestGroup#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link RequestGroup#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link RequestGroup#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link RequestGroup#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link RequestGroup#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link RequestGroup#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(com.fhir.Reference author);

    /**
     * Initializes the optional value {@link RequestGroup#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends com.fhir.Reference> author);

    /**
     * Initializes the optional value {@link RequestGroup#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.code priority);

    /**
     * Initializes the optional value {@link RequestGroup#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.code> priority);

    /**
     * Initializes the optional value {@link RequestGroup#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link RequestGroup#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link RequestGroup#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link RequestGroup#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link RequestGroup#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(com.fhir.dateTime authoredOn);

    /**
     * Initializes the optional value {@link RequestGroup#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn);

    /**
     * Initializes the optional value {@link RequestGroup#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link RequestGroup#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link RequestGroup#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link RequestGroup#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link RequestGroup#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link RequestGroup#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link RequestGroup#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link RequestGroup#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link RequestGroup#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link RequestGroup#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(com.fhir.code intent);

    /**
     * Initializes the optional value {@link RequestGroup#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(java.util.Optional<? extends com.fhir.code> intent);

    /**
     * Initializes the optional value {@link RequestGroup#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(com.fhir.Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link RequestGroup#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(java.util.Optional<? extends com.fhir.Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link RequestGroup#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link RequestGroup#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link RequestGroup#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link RequestGroup#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link RequestGroup#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link RequestGroup#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link RequestGroup#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link RequestGroup#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link RequestGroup#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link RequestGroup#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Builds a new {@link RequestGroup RequestGroup}.
     * @return An immutable instance of RequestGroup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    RequestGroup build();
  }
}
