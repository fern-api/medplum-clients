//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MessageHeader}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageHeader.builder()}.
 */
@org.immutables.value.Generated(from = "MessageHeader", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageHeader implements com.fhir.MessageHeader {
  private final @javax.annotation.Nullable com.fhir.Reference author;
  private final com.fhir.MessageHeader_Source source;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.canonical definition;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.String eventUri;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MessageHeader_Destination> destination;
  private final @javax.annotation.Nullable com.fhir.Reference sender;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Coding eventCoding;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference enterer;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept reason;
  private final @javax.annotation.Nullable com.fhir.MessageHeader_Response response;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> focus;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Reference responsible;

  private ImmutableMessageHeader(
      @javax.annotation.Nullable com.fhir.Reference author,
      com.fhir.MessageHeader_Source source,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.canonical definition,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.String eventUri,
      @javax.annotation.Nullable java.util.List<com.fhir.MessageHeader_Destination> destination,
      @javax.annotation.Nullable com.fhir.Reference sender,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Coding eventCoding,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference enterer,
      @javax.annotation.Nullable com.fhir.CodeableConcept reason,
      @javax.annotation.Nullable com.fhir.MessageHeader_Response response,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> focus,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Reference responsible) {
    this.author = author;
    this.source = source;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.definition = definition;
    this.text = text;
    this.eventUri = eventUri;
    this.destination = destination;
    this.sender = sender;
    this.language = language;
    this.eventCoding = eventCoding;
    this.implicitRules = implicitRules;
    this.resourceType = resourceType;
    this.extension = extension;
    this.enterer = enterer;
    this.reason = reason;
    this.response = response;
    this.focus = focus;
    this.id = id;
    this.meta = meta;
    this.responsible = responsible;
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
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public com.fhir.MessageHeader_Source source() {
    return source;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definition")
  @Override
  public java.util.Optional<com.fhir.canonical> definition() {
    return java.util.Optional.ofNullable(definition);
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
   * @return The value of the {@code eventUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("eventUri")
  @Override
  public java.util.Optional<java.lang.String> eventUri() {
    return java.util.Optional.ofNullable(eventUri);
  }

  /**
   * @return The value of the {@code destination} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("destination")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MessageHeader_Destination>> destination() {
    return java.util.Optional.ofNullable(destination);
  }

  /**
   * @return The value of the {@code sender} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sender")
  @Override
  public java.util.Optional<com.fhir.Reference> sender() {
    return java.util.Optional.ofNullable(sender);
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
   * @return The value of the {@code eventCoding} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("eventCoding")
  @Override
  public java.util.Optional<com.fhir.Coding> eventCoding() {
    return java.util.Optional.ofNullable(eventCoding);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code enterer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enterer")
  @Override
  public java.util.Optional<com.fhir.Reference> enterer() {
    return java.util.Optional.ofNullable(enterer);
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> reason() {
    return java.util.Optional.ofNullable(reason);
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("response")
  @Override
  public java.util.Optional<com.fhir.MessageHeader_Response> response() {
    return java.util.Optional.ofNullable(response);
  }

  /**
   * @return The value of the {@code focus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("focus")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> focus() {
    return java.util.Optional.ofNullable(focus);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code responsible} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("responsible")
  @Override
  public java.util.Optional<com.fhir.Reference> responsible() {
    return java.util.Optional.ofNullable(responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withAuthor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableMessageHeader(
        newValue,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withAuthor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableMessageHeader(
        value,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MessageHeader#source() source} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for source
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMessageHeader withSource(com.fhir.MessageHeader_Source value) {
    if (this.source == value) return this;
    com.fhir.MessageHeader_Source newValue = java.util.Objects.requireNonNull(value, "source");
    return new ImmutableMessageHeader(
        this.author,
        newValue,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        newValue,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        value,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        newValue,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        value,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withDefinition(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        newValue,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withDefinition(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        value,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        newValue,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        value,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#eventUri() eventUri} attribute.
   * @param value The value for eventUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withEventUri(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "eventUri");
    if (java.util.Objects.equals(this.eventUri, newValue)) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        newValue,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#eventUri() eventUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withEventUri(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.eventUri, value)) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        value,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withDestination(java.util.List<com.fhir.MessageHeader_Destination> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MessageHeader_Destination> newValue = java.util.Objects.requireNonNull(value, "destination");
    if (this.destination == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        newValue,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#destination() destination} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withDestination(java.util.Optional<? extends java.util.List<com.fhir.MessageHeader_Destination>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MessageHeader_Destination> value = optional.orElse(null);
    if (this.destination == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        value,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#sender() sender} attribute.
   * @param value The value for sender
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withSender(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "sender");
    if (this.sender == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        newValue,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#sender() sender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withSender(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.sender == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        value,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        newValue,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        value,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#eventCoding() eventCoding} attribute.
   * @param value The value for eventCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withEventCoding(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "eventCoding");
    if (this.eventCoding == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        newValue,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#eventCoding() eventCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withEventCoding(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.eventCoding == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        value,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        newValue,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        value,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MessageHeader#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMessageHeader withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        newValue,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        newValue,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        value,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withEnterer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        newValue,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withEnterer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        value,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        newValue,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        value,
        this.response,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withResponse(com.fhir.MessageHeader_Response value) {
    @javax.annotation.Nullable com.fhir.MessageHeader_Response newValue = java.util.Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        newValue,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withResponse(java.util.Optional<? extends com.fhir.MessageHeader_Response> optional) {
    @javax.annotation.Nullable com.fhir.MessageHeader_Response value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        value,
        this.focus,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withFocus(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        newValue,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withFocus(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        value,
        this.id,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        newValue,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        value,
        this.meta,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        newValue,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        value,
        this.responsible);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader withResponsible(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "responsible");
    if (this.responsible == newValue) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader#responsible() responsible} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader withResponsible(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.responsible == value) return this;
    return new ImmutableMessageHeader(
        this.author,
        this.source,
        this.contained,
        this.modifierExtension,
        this.definition,
        this.text,
        this.eventUri,
        this.destination,
        this.sender,
        this.language,
        this.eventCoding,
        this.implicitRules,
        this.resourceType,
        this.extension,
        this.enterer,
        this.reason,
        this.response,
        this.focus,
        this.id,
        this.meta,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageHeader} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageHeader
        && equalTo((ImmutableMessageHeader) another);
  }

  private boolean equalTo(ImmutableMessageHeader another) {
    return java.util.Objects.equals(author, another.author)
        && source.equals(another.source)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(definition, another.definition)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(eventUri, another.eventUri)
        && java.util.Objects.equals(destination, another.destination)
        && java.util.Objects.equals(sender, another.sender)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(eventCoding, another.eventCoding)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(enterer, another.enterer)
        && java.util.Objects.equals(reason, another.reason)
        && java.util.Objects.equals(response, another.response)
        && java.util.Objects.equals(focus, another.focus)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(responsible, another.responsible);
  }

  /**
   * Computes a hash code from attributes: {@code author}, {@code source}, {@code contained}, {@code modifierExtension}, {@code definition}, {@code text}, {@code eventUri}, {@code destination}, {@code sender}, {@code language}, {@code eventCoding}, {@code implicitRules}, {@code resourceType}, {@code extension}, {@code enterer}, {@code reason}, {@code response}, {@code focus}, {@code id}, {@code meta}, {@code responsible}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + source.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(definition);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(eventUri);
    h += (h << 5) + java.util.Objects.hashCode(destination);
    h += (h << 5) + java.util.Objects.hashCode(sender);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(eventCoding);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(enterer);
    h += (h << 5) + java.util.Objects.hashCode(reason);
    h += (h << 5) + java.util.Objects.hashCode(response);
    h += (h << 5) + java.util.Objects.hashCode(focus);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(responsible);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageHeader} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MessageHeader{");
    if (author != null) {
      builder.append("author=").append(author);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("source=").append(source);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (definition != null) {
      builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (eventUri != null) {
      builder.append(", ");
      builder.append("eventUri=").append(eventUri);
    }
    if (destination != null) {
      builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (sender != null) {
      builder.append(", ");
      builder.append("sender=").append(sender);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (eventCoding != null) {
      builder.append(", ");
      builder.append("eventCoding=").append(eventCoding);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (enterer != null) {
      builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (response != null) {
      builder.append(", ");
      builder.append("response=").append(response);
    }
    if (focus != null) {
      builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (responsible != null) {
      builder.append(", ");
      builder.append("responsible=").append(responsible);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MessageHeader", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MessageHeader {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable com.fhir.MessageHeader_Source source;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> definition = java.util.Optional.empty();
    boolean definitionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> eventUri = java.util.Optional.empty();
    boolean eventUriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MessageHeader_Destination>> destination = java.util.Optional.empty();
    boolean destinationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> sender = java.util.Optional.empty();
    boolean senderIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> eventCoding = java.util.Optional.empty();
    boolean eventCodingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> enterer = java.util.Optional.empty();
    boolean entererIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> reason = java.util.Optional.empty();
    boolean reasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MessageHeader_Response> response = java.util.Optional.empty();
    boolean responseIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> focus = java.util.Optional.empty();
    boolean focusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> responsible = java.util.Optional.empty();
    boolean responsibleIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<com.fhir.Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(com.fhir.MessageHeader_Source source) {
      this.source = source;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public void setDefinition(java.util.Optional<com.fhir.canonical> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("eventUri")
    public void setEventUri(java.util.Optional<java.lang.String> eventUri) {
      this.eventUri = eventUri;
      this.eventUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public void setDestination(java.util.Optional<java.util.List<com.fhir.MessageHeader_Destination>> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    public void setSender(java.util.Optional<com.fhir.Reference> sender) {
      this.sender = sender;
      this.senderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("eventCoding")
    public void setEventCoding(java.util.Optional<com.fhir.Coding> eventCoding) {
      this.eventCoding = eventCoding;
      this.eventCodingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enterer")
    public void setEnterer(java.util.Optional<com.fhir.Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(java.util.Optional<com.fhir.CodeableConcept> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public void setResponse(java.util.Optional<com.fhir.MessageHeader_Response> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public void setFocus(java.util.Optional<java.util.List<com.fhir.Reference>> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("responsible")
    public void setResponsible(java.util.Optional<com.fhir.Reference> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.MessageHeader_Source source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> definition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> eventUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MessageHeader_Destination>> destination() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> sender() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> eventCoding() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> reason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MessageHeader_Response> response() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> focus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> responsible() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMessageHeader fromJson(Json json) {
    ImmutableMessageHeader.Builder builder = ((ImmutableMessageHeader.Builder) ImmutableMessageHeader.builder());
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.source != null) {
      builder.source(json.source);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.eventUriIsSet) {
      builder.eventUri(json.eventUri);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.senderIsSet) {
      builder.sender(json.sender);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.eventCodingIsSet) {
      builder.eventCoding(json.eventCoding);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    return (ImmutableMessageHeader) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageHeader} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageHeader instance
   */
  public static MessageHeader copyOf(MessageHeader instance) {
    if (instance instanceof ImmutableMessageHeader) {
      return (ImmutableMessageHeader) instance;
    }
    return ((ImmutableMessageHeader.Builder) ImmutableMessageHeader.builder())
        .author(instance.author())
        .source(instance.source())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .definition(instance.definition())
        .text(instance.text())
        .eventUri(instance.eventUri())
        .destination(instance.destination())
        .sender(instance.sender())
        .language(instance.language())
        .eventCoding(instance.eventCoding())
        .implicitRules(instance.implicitRules())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .enterer(instance.enterer())
        .reason(instance.reason())
        .response(instance.response())
        .focus(instance.focus())
        .id(instance.id())
        .meta(instance.meta())
        .responsible(instance.responsible())
        .build();
  }

  /**
   * Creates a builder for {@link MessageHeader MessageHeader}.
   * <pre>
   * ImmutableMessageHeader.builder()
   *    .author(com.fhir.Reference) // optional {@link MessageHeader#author() author}
   *    .source(com.fhir.MessageHeader_Source) // required {@link MessageHeader#source() source}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MessageHeader#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageHeader#modifierExtension() modifierExtension}
   *    .definition(com.fhir.canonical) // optional {@link MessageHeader#definition() definition}
   *    .text(com.fhir.Narrative) // optional {@link MessageHeader#text() text}
   *    .eventUri(String) // optional {@link MessageHeader#eventUri() eventUri}
   *    .destination(List&amp;lt;com.fhir.MessageHeader_Destination&amp;gt;) // optional {@link MessageHeader#destination() destination}
   *    .sender(com.fhir.Reference) // optional {@link MessageHeader#sender() sender}
   *    .language(com.fhir.code) // optional {@link MessageHeader#language() language}
   *    .eventCoding(com.fhir.Coding) // optional {@link MessageHeader#eventCoding() eventCoding}
   *    .implicitRules(com.fhir.uri) // optional {@link MessageHeader#implicitRules() implicitRules}
   *    .resourceType(String) // required {@link MessageHeader#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageHeader#extension() extension}
   *    .enterer(com.fhir.Reference) // optional {@link MessageHeader#enterer() enterer}
   *    .reason(com.fhir.CodeableConcept) // optional {@link MessageHeader#reason() reason}
   *    .response(com.fhir.MessageHeader_Response) // optional {@link MessageHeader#response() response}
   *    .focus(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MessageHeader#focus() focus}
   *    .id(com.fhir.id) // optional {@link MessageHeader#id() id}
   *    .meta(com.fhir.Meta) // optional {@link MessageHeader#meta() meta}
   *    .responsible(com.fhir.Reference) // optional {@link MessageHeader#responsible() responsible}
   *    .build();
   * </pre>
   * @return A new MessageHeader builder
   */
  public static SourceBuildStage builder() {
    return new ImmutableMessageHeader.Builder();
  }

  /**
   * Builds instances of type {@link MessageHeader MessageHeader}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MessageHeader", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SourceBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SOURCE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_AUTHOR = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_DEFINITION = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_EVENT_URI = 0x20L;
    private static final long OPT_BIT_DESTINATION = 0x40L;
    private static final long OPT_BIT_SENDER = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_EVENT_CODING = 0x200L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_ENTERER = 0x1000L;
    private static final long OPT_BIT_REASON = 0x2000L;
    private static final long OPT_BIT_RESPONSE = 0x4000L;
    private static final long OPT_BIT_FOCUS = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_META = 0x20000L;
    private static final long OPT_BIT_RESPONSIBLE = 0x40000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference author;
    private @javax.annotation.Nullable com.fhir.MessageHeader_Source source;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.canonical definition;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String eventUri;
    private @javax.annotation.Nullable java.util.List<com.fhir.MessageHeader_Destination> destination;
    private @javax.annotation.Nullable com.fhir.Reference sender;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Coding eventCoding;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference enterer;
    private @javax.annotation.Nullable com.fhir.CodeableConcept reason;
    private @javax.annotation.Nullable com.fhir.MessageHeader_Response response;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> focus;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Reference responsible;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageHeader#author() author} to author.
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
     * Initializes the optional value {@link MessageHeader#author() author} to author.
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
     * Initializes the value for the {@link MessageHeader#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(com.fhir.MessageHeader_Source source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      initBits &= ~INIT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#contained() contained} to contained.
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
     * Initializes the optional value {@link MessageHeader#contained() contained} to contained.
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
     * Initializes the optional value {@link MessageHeader#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(com.fhir.canonical definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = java.util.Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public final Builder definition(java.util.Optional<? extends com.fhir.canonical> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#text() text} to text.
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
     * Initializes the optional value {@link MessageHeader#text() text} to text.
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
     * Initializes the optional value {@link MessageHeader#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder eventUri(java.lang.String eventUri) {
      checkNotIsSet(eventUriIsSet(), "eventUri");
      this.eventUri = java.util.Objects.requireNonNull(eventUri, "eventUri");
      optBits |= OPT_BIT_EVENT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventUri")
    public final Builder eventUri(java.util.Optional<java.lang.String> eventUri) {
      checkNotIsSet(eventUriIsSet(), "eventUri");
      this.eventUri = eventUri.orElse(null);
      optBits |= OPT_BIT_EVENT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(java.util.List<com.fhir.MessageHeader_Destination> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = java.util.Objects.requireNonNull(destination, "destination");
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public final Builder destination(java.util.Optional<? extends java.util.List<com.fhir.MessageHeader_Destination>> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    public final Builder sender(com.fhir.Reference sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = java.util.Objects.requireNonNull(sender, "sender");
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    public final Builder sender(java.util.Optional<? extends com.fhir.Reference> sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = sender.orElse(null);
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#language() language} to language.
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
     * Initializes the optional value {@link MessageHeader#language() language} to language.
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
     * Initializes the optional value {@link MessageHeader#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder eventCoding(com.fhir.Coding eventCoding) {
      checkNotIsSet(eventCodingIsSet(), "eventCoding");
      this.eventCoding = java.util.Objects.requireNonNull(eventCoding, "eventCoding");
      optBits |= OPT_BIT_EVENT_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventCoding")
    public final Builder eventCoding(java.util.Optional<? extends com.fhir.Coding> eventCoding) {
      checkNotIsSet(eventCodingIsSet(), "eventCoding");
      this.eventCoding = eventCoding.orElse(null);
      optBits |= OPT_BIT_EVENT_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MessageHeader#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link MessageHeader#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MessageHeader#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    public final Builder enterer(com.fhir.Reference enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = java.util.Objects.requireNonNull(enterer, "enterer");
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enterer")
    public final Builder enterer(java.util.Optional<? extends com.fhir.Reference> enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = enterer.orElse(null);
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(com.fhir.CodeableConcept reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = java.util.Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public final Builder reason(java.util.Optional<? extends com.fhir.CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(com.fhir.MessageHeader_Response response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = java.util.Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public final Builder response(java.util.Optional<? extends com.fhir.MessageHeader_Response> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(java.util.List<com.fhir.Reference> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = java.util.Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public final Builder focus(java.util.Optional<? extends java.util.List<com.fhir.Reference>> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader#meta() meta} to meta.
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
     * Initializes the optional value {@link MessageHeader#meta() meta} to meta.
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
     * Initializes the optional value {@link MessageHeader#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    public final Builder responsible(com.fhir.Reference responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = java.util.Objects.requireNonNull(responsible, "responsible");
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responsible")
    public final Builder responsible(java.util.Optional<? extends com.fhir.Reference> responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = responsible.orElse(null);
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Builds a new {@link MessageHeader MessageHeader}.
     * @return An immutable instance of MessageHeader
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MessageHeader build() {
      checkRequiredAttributes();
      return new ImmutableMessageHeader(
          author,
          source,
          contained,
          modifierExtension,
          definition,
          text,
          eventUri,
          destination,
          sender,
          language,
          eventCoding,
          implicitRules,
          resourceType,
          extension,
          enterer,
          reason,
          response,
          focus,
          id,
          meta,
          responsible);
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean eventUriIsSet() {
      return (optBits & OPT_BIT_EVENT_URI) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean senderIsSet() {
      return (optBits & OPT_BIT_SENDER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean eventCodingIsSet() {
      return (optBits & OPT_BIT_EVENT_CODING) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean sourceIsSet() {
      return (initBits & INIT_BIT_SOURCE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MessageHeader is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!sourceIsSet()) attributes.add("source");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MessageHeader, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MessageHeader", generator = "Immutables")
  public interface SourceBuildStage {
    /**
     * Initializes the value for the {@link MessageHeader#source() source} attribute.
     * @param source The value for source 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage source(com.fhir.MessageHeader_Source source);
  }

  @org.immutables.value.Generated(from = "MessageHeader", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MessageHeader#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MessageHeader", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MessageHeader#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(com.fhir.Reference author);

    /**
     * Initializes the optional value {@link MessageHeader#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends com.fhir.Reference> author);

    /**
     * Initializes the optional value {@link MessageHeader#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MessageHeader#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MessageHeader#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MessageHeader#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MessageHeader#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definition(com.fhir.canonical definition);

    /**
     * Initializes the optional value {@link MessageHeader#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definition(java.util.Optional<? extends com.fhir.canonical> definition);

    /**
     * Initializes the optional value {@link MessageHeader#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MessageHeader#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MessageHeader#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventUri(java.lang.String eventUri);

    /**
     * Initializes the optional value {@link MessageHeader#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventUri(java.util.Optional<java.lang.String> eventUri);

    /**
     * Initializes the optional value {@link MessageHeader#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(java.util.List<com.fhir.MessageHeader_Destination> destination);

    /**
     * Initializes the optional value {@link MessageHeader#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(java.util.Optional<? extends java.util.List<com.fhir.MessageHeader_Destination>> destination);

    /**
     * Initializes the optional value {@link MessageHeader#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sender(com.fhir.Reference sender);

    /**
     * Initializes the optional value {@link MessageHeader#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sender(java.util.Optional<? extends com.fhir.Reference> sender);

    /**
     * Initializes the optional value {@link MessageHeader#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MessageHeader#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MessageHeader#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventCoding(com.fhir.Coding eventCoding);

    /**
     * Initializes the optional value {@link MessageHeader#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventCoding(java.util.Optional<? extends com.fhir.Coding> eventCoding);

    /**
     * Initializes the optional value {@link MessageHeader#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MessageHeader#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MessageHeader#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MessageHeader#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MessageHeader#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(com.fhir.Reference enterer);

    /**
     * Initializes the optional value {@link MessageHeader#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(java.util.Optional<? extends com.fhir.Reference> enterer);

    /**
     * Initializes the optional value {@link MessageHeader#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(com.fhir.CodeableConcept reason);

    /**
     * Initializes the optional value {@link MessageHeader#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(java.util.Optional<? extends com.fhir.CodeableConcept> reason);

    /**
     * Initializes the optional value {@link MessageHeader#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    BuildFinal response(com.fhir.MessageHeader_Response response);

    /**
     * Initializes the optional value {@link MessageHeader#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal response(java.util.Optional<? extends com.fhir.MessageHeader_Response> response);

    /**
     * Initializes the optional value {@link MessageHeader#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(java.util.List<com.fhir.Reference> focus);

    /**
     * Initializes the optional value {@link MessageHeader#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(java.util.Optional<? extends java.util.List<com.fhir.Reference>> focus);

    /**
     * Initializes the optional value {@link MessageHeader#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MessageHeader#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MessageHeader#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MessageHeader#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MessageHeader#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responsible(com.fhir.Reference responsible);

    /**
     * Initializes the optional value {@link MessageHeader#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responsible(java.util.Optional<? extends com.fhir.Reference> responsible);

    /**
     * Builds a new {@link MessageHeader MessageHeader}.
     * @return An immutable instance of MessageHeader
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MessageHeader build();
  }
}
