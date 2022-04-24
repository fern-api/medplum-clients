//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MessageDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "MessageDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageDefinition implements com.fhir.MessageDefinition {
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> replaces;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_Focus> focus;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.MessagedefinitionResponserequired responseRequired;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String eventUri;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> parent;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.MessagedefinitionCategory category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> graph;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.MessagedefinitionStatus status;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.Coding eventCoding;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_AllowedResponse> allowedResponse;
  private final @javax.annotation.Nullable com.fhir.canonical base;

  private ImmutableMessageDefinition(
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> replaces,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_Focus> focus,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.MessagedefinitionResponserequired responseRequired,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String eventUri,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.Narrative text,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> parent,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.MessagedefinitionCategory category,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> graph,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.MessagedefinitionStatus status,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.Coding eventCoding,
      @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_AllowedResponse> allowedResponse,
      @javax.annotation.Nullable com.fhir.canonical base) {
    this.url = url;
    this.replaces = replaces;
    this.version = version;
    this.name = name;
    this.focus = focus;
    this.jurisdiction = jurisdiction;
    this.responseRequired = responseRequired;
    this.implicitRules = implicitRules;
    this.identifier = identifier;
    this.useContext = useContext;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.publisher = publisher;
    this.description = description;
    this.meta = meta;
    this.eventUri = eventUri;
    this.purpose = purpose;
    this.contact = contact;
    this.text = text;
    this.resourceType = resourceType;
    this.extension = extension;
    this.language = language;
    this.title = title;
    this.parent = parent;
    this.contained = contained;
    this.category = category;
    this.graph = graph;
    this.copyright = copyright;
    this.status = status;
    this.experimental = experimental;
    this.date = date;
    this.eventCoding = eventCoding;
    this.allowedResponse = allowedResponse;
    this.base = base;
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code replaces} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("replaces")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> replaces() {
    return java.util.Optional.ofNullable(replaces);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code focus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("focus")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MessageDefinition_Focus>> focus() {
    return java.util.Optional.ofNullable(focus);
  }

  /**
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
  }

  /**
   * @return The value of the {@code responseRequired} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("responseRequired")
  @Override
  public java.util.Optional<com.fhir.MessagedefinitionResponserequired> responseRequired() {
    return java.util.Optional.ofNullable(responseRequired);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code eventUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("eventUri")
  @Override
  public java.util.Optional<java.lang.String> eventUri() {
    return java.util.Optional.ofNullable(eventUri);
  }

  /**
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<com.fhir.markdown> purpose() {
    return java.util.Optional.ofNullable(purpose);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code parent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parent")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> parent() {
    return java.util.Optional.ofNullable(parent);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<com.fhir.MessagedefinitionCategory> category() {
    return java.util.Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code graph} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("graph")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> graph() {
    return java.util.Optional.ofNullable(graph);
  }

  /**
   * @return The value of the {@code copyright} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("copyright")
  @Override
  public java.util.Optional<com.fhir.markdown> copyright() {
    return java.util.Optional.ofNullable(copyright);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.MessagedefinitionStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code experimental} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("experimental")
  @Override
  public java.util.Optional<java.lang.Boolean> experimental() {
    return java.util.Optional.ofNullable(experimental);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code allowedResponse} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("allowedResponse")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MessageDefinition_AllowedResponse>> allowedResponse() {
    return java.util.Optional.ofNullable(allowedResponse);
  }

  /**
   * @return The value of the {@code base} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("base")
  @Override
  public java.util.Optional<com.fhir.canonical> base() {
    return java.util.Optional.ofNullable(base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableMessageDefinition(
        newValue,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableMessageDefinition(
        value,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withReplaces(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        newValue,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withReplaces(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        value,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        newValue,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        value,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        newValue,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        value,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withFocus(java.util.List<com.fhir.MessageDefinition_Focus> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_Focus> newValue = java.util.Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        newValue,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withFocus(java.util.Optional<? extends java.util.List<com.fhir.MessageDefinition_Focus>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_Focus> value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        value,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        newValue,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        value,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#responseRequired() responseRequired} attribute.
   * @param value The value for responseRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withResponseRequired(com.fhir.MessagedefinitionResponserequired value) {
    @javax.annotation.Nullable com.fhir.MessagedefinitionResponserequired newValue = java.util.Objects.requireNonNull(value, "responseRequired");
    if (this.responseRequired == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        newValue,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#responseRequired() responseRequired} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responseRequired
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withResponseRequired(java.util.Optional<? extends com.fhir.MessagedefinitionResponserequired> optional) {
    @javax.annotation.Nullable com.fhir.MessagedefinitionResponserequired value = optional.orElse(null);
    if (this.responseRequired == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        value,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        newValue,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        value,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        newValue,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        value,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        value,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        newValue,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        value,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        newValue,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        value,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        newValue,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        value,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        newValue,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        value,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        newValue,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        value,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#eventUri() eventUri} attribute.
   * @param value The value for eventUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withEventUri(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "eventUri");
    if (java.util.Objects.equals(this.eventUri, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        newValue,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#eventUri() eventUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withEventUri(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.eventUri, value)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        value,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        newValue,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        value,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        newValue,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        value,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        newValue,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        value,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MessageDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMessageDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        newValue,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        newValue,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        value,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        newValue,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        value,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        newValue,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        value,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withParent(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        newValue,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withParent(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        value,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        newValue,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        value,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withCategory(com.fhir.MessagedefinitionCategory value) {
    @javax.annotation.Nullable com.fhir.MessagedefinitionCategory newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        newValue,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withCategory(java.util.Optional<? extends com.fhir.MessagedefinitionCategory> optional) {
    @javax.annotation.Nullable com.fhir.MessagedefinitionCategory value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        value,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#graph() graph} attribute.
   * @param value The value for graph
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withGraph(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "graph");
    if (this.graph == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        newValue,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#graph() graph} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for graph
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withGraph(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.graph == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        value,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        newValue,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        value,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withStatus(com.fhir.MessagedefinitionStatus value) {
    @javax.annotation.Nullable com.fhir.MessagedefinitionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        newValue,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withStatus(java.util.Optional<? extends com.fhir.MessagedefinitionStatus> optional) {
    @javax.annotation.Nullable com.fhir.MessagedefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        value,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        newValue,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        value,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        newValue,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        value,
        this.eventCoding,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#eventCoding() eventCoding} attribute.
   * @param value The value for eventCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withEventCoding(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "eventCoding");
    if (this.eventCoding == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        newValue,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#eventCoding() eventCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withEventCoding(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.eventCoding == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        value,
        this.allowedResponse,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#allowedResponse() allowedResponse} attribute.
   * @param value The value for allowedResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withAllowedResponse(java.util.List<com.fhir.MessageDefinition_AllowedResponse> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_AllowedResponse> newValue = java.util.Objects.requireNonNull(value, "allowedResponse");
    if (this.allowedResponse == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        newValue,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#allowedResponse() allowedResponse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedResponse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withAllowedResponse(java.util.Optional<? extends java.util.List<com.fhir.MessageDefinition_AllowedResponse>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_AllowedResponse> value = optional.orElse(null);
    if (this.allowedResponse == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        value,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#base() base} attribute.
   * @param value The value for base
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withBase(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "base");
    if (this.base == newValue) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#base() base} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for base
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withBase(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.base == value) return this;
    return new ImmutableMessageDefinition(
        this.url,
        this.replaces,
        this.version,
        this.name,
        this.focus,
        this.jurisdiction,
        this.responseRequired,
        this.implicitRules,
        this.identifier,
        this.useContext,
        this.modifierExtension,
        this.id,
        this.publisher,
        this.description,
        this.meta,
        this.eventUri,
        this.purpose,
        this.contact,
        this.text,
        this.resourceType,
        this.extension,
        this.language,
        this.title,
        this.parent,
        this.contained,
        this.category,
        this.graph,
        this.copyright,
        this.status,
        this.experimental,
        this.date,
        this.eventCoding,
        this.allowedResponse,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageDefinition
        && equalTo((ImmutableMessageDefinition) another);
  }

  private boolean equalTo(ImmutableMessageDefinition another) {
    return java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(replaces, another.replaces)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(focus, another.focus)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(responseRequired, another.responseRequired)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(eventUri, another.eventUri)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(parent, another.parent)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(graph, another.graph)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(eventCoding, another.eventCoding)
        && java.util.Objects.equals(allowedResponse, another.allowedResponse)
        && java.util.Objects.equals(base, another.base);
  }

  /**
   * Computes a hash code from attributes: {@code url}, {@code replaces}, {@code version}, {@code name}, {@code focus}, {@code jurisdiction}, {@code responseRequired}, {@code implicitRules}, {@code identifier}, {@code useContext}, {@code modifierExtension}, {@code id}, {@code publisher}, {@code description}, {@code meta}, {@code eventUri}, {@code purpose}, {@code contact}, {@code text}, {@code resourceType}, {@code extension}, {@code language}, {@code title}, {@code parent}, {@code contained}, {@code category}, {@code graph}, {@code copyright}, {@code status}, {@code experimental}, {@code date}, {@code eventCoding}, {@code allowedResponse}, {@code base}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(replaces);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(focus);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(responseRequired);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(eventUri);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(parent);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(graph);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(eventCoding);
    h += (h << 5) + java.util.Objects.hashCode(allowedResponse);
    h += (h << 5) + java.util.Objects.hashCode(base);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MessageDefinition{");
    if (url != null) {
      builder.append("url=").append(url);
    }
    if (replaces != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (version != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (name != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (focus != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (jurisdiction != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (responseRequired != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("responseRequired=").append(responseRequired);
    }
    if (implicitRules != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (identifier != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (useContext != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (publisher != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (description != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (meta != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (eventUri != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("eventUri=").append(eventUri);
    }
    if (purpose != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (contact != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (text != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (parent != null) {
      builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (graph != null) {
      builder.append(", ");
      builder.append("graph=").append(graph);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (eventCoding != null) {
      builder.append(", ");
      builder.append("eventCoding=").append(eventCoding);
    }
    if (allowedResponse != null) {
      builder.append(", ");
      builder.append("allowedResponse=").append(allowedResponse);
    }
    if (base != null) {
      builder.append(", ");
      builder.append("base=").append(base);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MessageDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MessageDefinition {
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> replaces = java.util.Optional.empty();
    boolean replacesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MessageDefinition_Focus>> focus = java.util.Optional.empty();
    boolean focusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MessagedefinitionResponserequired> responseRequired = java.util.Optional.empty();
    boolean responseRequiredIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> eventUri = java.util.Optional.empty();
    boolean eventUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> parent = java.util.Optional.empty();
    boolean parentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MessagedefinitionCategory> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> graph = java.util.Optional.empty();
    boolean graphIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MessagedefinitionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> eventCoding = java.util.Optional.empty();
    boolean eventCodingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MessageDefinition_AllowedResponse>> allowedResponse = java.util.Optional.empty();
    boolean allowedResponseIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> base = java.util.Optional.empty();
    boolean baseIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public void setReplaces(java.util.Optional<java.util.List<com.fhir.canonical>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public void setFocus(java.util.Optional<java.util.List<com.fhir.MessageDefinition_Focus>> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("responseRequired")
    public void setResponseRequired(java.util.Optional<com.fhir.MessagedefinitionResponserequired> responseRequired) {
      this.responseRequired = responseRequired;
      this.responseRequiredIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("eventUri")
    public void setEventUri(java.util.Optional<java.lang.String> eventUri) {
      this.eventUri = eventUri;
      this.eventUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public void setParent(java.util.Optional<java.util.List<com.fhir.canonical>> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<com.fhir.MessagedefinitionCategory> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("graph")
    public void setGraph(java.util.Optional<java.util.List<com.fhir.canonical>> graph) {
      this.graph = graph;
      this.graphIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.MessagedefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("eventCoding")
    public void setEventCoding(java.util.Optional<com.fhir.Coding> eventCoding) {
      this.eventCoding = eventCoding;
      this.eventCodingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("allowedResponse")
    public void setAllowedResponse(java.util.Optional<java.util.List<com.fhir.MessageDefinition_AllowedResponse>> allowedResponse) {
      this.allowedResponse = allowedResponse;
      this.allowedResponseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("base")
    public void setBase(java.util.Optional<com.fhir.canonical> base) {
      this.base = base;
      this.baseIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MessageDefinition_Focus>> focus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MessagedefinitionResponserequired> responseRequired() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> eventUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> parent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MessagedefinitionCategory> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> graph() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MessagedefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> eventCoding() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MessageDefinition_AllowedResponse>> allowedResponse() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> base() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMessageDefinition fromJson(Json json) {
    ImmutableMessageDefinition.Builder builder = ((ImmutableMessageDefinition.Builder) ImmutableMessageDefinition.builder());
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.responseRequiredIsSet) {
      builder.responseRequired(json.responseRequired);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.eventUriIsSet) {
      builder.eventUri(json.eventUri);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.graphIsSet) {
      builder.graph(json.graph);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.eventCodingIsSet) {
      builder.eventCoding(json.eventCoding);
    }
    if (json.allowedResponseIsSet) {
      builder.allowedResponse(json.allowedResponse);
    }
    if (json.baseIsSet) {
      builder.base(json.base);
    }
    return (ImmutableMessageDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageDefinition instance
   */
  public static MessageDefinition copyOf(MessageDefinition instance) {
    if (instance instanceof ImmutableMessageDefinition) {
      return (ImmutableMessageDefinition) instance;
    }
    return ((ImmutableMessageDefinition.Builder) ImmutableMessageDefinition.builder())
        .url(instance.url())
        .replaces(instance.replaces())
        .version(instance.version())
        .name(instance.name())
        .focus(instance.focus())
        .jurisdiction(instance.jurisdiction())
        .responseRequired(instance.responseRequired())
        .implicitRules(instance.implicitRules())
        .identifier(instance.identifier())
        .useContext(instance.useContext())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .publisher(instance.publisher())
        .description(instance.description())
        .meta(instance.meta())
        .eventUri(instance.eventUri())
        .purpose(instance.purpose())
        .contact(instance.contact())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .language(instance.language())
        .title(instance.title())
        .parent(instance.parent())
        .contained(instance.contained())
        .category(instance.category())
        .graph(instance.graph())
        .copyright(instance.copyright())
        .status(instance.status())
        .experimental(instance.experimental())
        .date(instance.date())
        .eventCoding(instance.eventCoding())
        .allowedResponse(instance.allowedResponse())
        .base(instance.base())
        .build();
  }

  /**
   * Creates a builder for {@link MessageDefinition MessageDefinition}.
   * <pre>
   * ImmutableMessageDefinition.builder()
   *    .url(com.fhir.uri) // optional {@link MessageDefinition#url() url}
   *    .replaces(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link MessageDefinition#replaces() replaces}
   *    .version(String) // optional {@link MessageDefinition#version() version}
   *    .name(String) // optional {@link MessageDefinition#name() name}
   *    .focus(List&amp;lt;com.fhir.MessageDefinition_Focus&amp;gt;) // optional {@link MessageDefinition#focus() focus}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MessageDefinition#jurisdiction() jurisdiction}
   *    .responseRequired(com.fhir.MessagedefinitionResponserequired) // optional {@link MessageDefinition#responseRequired() responseRequired}
   *    .implicitRules(com.fhir.uri) // optional {@link MessageDefinition#implicitRules() implicitRules}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MessageDefinition#identifier() identifier}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link MessageDefinition#useContext() useContext}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageDefinition#modifierExtension() modifierExtension}
   *    .id(com.fhir.id) // optional {@link MessageDefinition#id() id}
   *    .publisher(String) // optional {@link MessageDefinition#publisher() publisher}
   *    .description(com.fhir.markdown) // optional {@link MessageDefinition#description() description}
   *    .meta(com.fhir.Meta) // optional {@link MessageDefinition#meta() meta}
   *    .eventUri(String) // optional {@link MessageDefinition#eventUri() eventUri}
   *    .purpose(com.fhir.markdown) // optional {@link MessageDefinition#purpose() purpose}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link MessageDefinition#contact() contact}
   *    .text(com.fhir.Narrative) // optional {@link MessageDefinition#text() text}
   *    .resourceType(String) // required {@link MessageDefinition#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageDefinition#extension() extension}
   *    .language(com.fhir.code) // optional {@link MessageDefinition#language() language}
   *    .title(String) // optional {@link MessageDefinition#title() title}
   *    .parent(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link MessageDefinition#parent() parent}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MessageDefinition#contained() contained}
   *    .category(com.fhir.MessagedefinitionCategory) // optional {@link MessageDefinition#category() category}
   *    .graph(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link MessageDefinition#graph() graph}
   *    .copyright(com.fhir.markdown) // optional {@link MessageDefinition#copyright() copyright}
   *    .status(com.fhir.MessagedefinitionStatus) // optional {@link MessageDefinition#status() status}
   *    .experimental(Boolean) // optional {@link MessageDefinition#experimental() experimental}
   *    .date(com.fhir.dateTime) // optional {@link MessageDefinition#date() date}
   *    .eventCoding(com.fhir.Coding) // optional {@link MessageDefinition#eventCoding() eventCoding}
   *    .allowedResponse(List&amp;lt;com.fhir.MessageDefinition_AllowedResponse&amp;gt;) // optional {@link MessageDefinition#allowedResponse() allowedResponse}
   *    .base(com.fhir.canonical) // optional {@link MessageDefinition#base() base}
   *    .build();
   * </pre>
   * @return A new MessageDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMessageDefinition.Builder();
  }

  /**
   * Builds instances of type {@link MessageDefinition MessageDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MessageDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_URL = 0x1L;
    private static final long OPT_BIT_REPLACES = 0x2L;
    private static final long OPT_BIT_VERSION = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_FOCUS = 0x10L;
    private static final long OPT_BIT_JURISDICTION = 0x20L;
    private static final long OPT_BIT_RESPONSE_REQUIRED = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_USE_CONTEXT = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_PUBLISHER = 0x1000L;
    private static final long OPT_BIT_DESCRIPTION = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_EVENT_URI = 0x8000L;
    private static final long OPT_BIT_PURPOSE = 0x10000L;
    private static final long OPT_BIT_CONTACT = 0x20000L;
    private static final long OPT_BIT_TEXT = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000L;
    private static final long OPT_BIT_TITLE = 0x200000L;
    private static final long OPT_BIT_PARENT = 0x400000L;
    private static final long OPT_BIT_CONTAINED = 0x800000L;
    private static final long OPT_BIT_CATEGORY = 0x1000000L;
    private static final long OPT_BIT_GRAPH = 0x2000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x4000000L;
    private static final long OPT_BIT_STATUS = 0x8000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x10000000L;
    private static final long OPT_BIT_DATE = 0x20000000L;
    private static final long OPT_BIT_EVENT_CODING = 0x40000000L;
    private static final long OPT_BIT_ALLOWED_RESPONSE = 0x80000000L;
    private static final long OPT_BIT_BASE = 0x100000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> replaces;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_Focus> focus;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.MessagedefinitionResponserequired responseRequired;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String eventUri;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> parent;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.MessagedefinitionCategory category;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> graph;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.MessagedefinitionStatus status;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.Coding eventCoding;
    private @javax.annotation.Nullable java.util.List<com.fhir.MessageDefinition_AllowedResponse> allowedResponse;
    private @javax.annotation.Nullable com.fhir.canonical base;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(com.fhir.uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(java.util.Optional<? extends com.fhir.uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    public final Builder replaces(java.util.List<com.fhir.canonical> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = java.util.Objects.requireNonNull(replaces, "replaces");
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public final Builder replaces(java.util.Optional<? extends java.util.List<com.fhir.canonical>> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = replaces.orElse(null);
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.lang.String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<java.lang.String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(java.util.List<com.fhir.MessageDefinition_Focus> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = java.util.Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public final Builder focus(java.util.Optional<? extends java.util.List<com.fhir.MessageDefinition_Focus>> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = java.util.Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public final Builder jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#responseRequired() responseRequired} to responseRequired.
     * @param responseRequired The value for responseRequired
     * @return {@code this} builder for chained invocation
     */
    public final Builder responseRequired(com.fhir.MessagedefinitionResponserequired responseRequired) {
      checkNotIsSet(responseRequiredIsSet(), "responseRequired");
      this.responseRequired = java.util.Objects.requireNonNull(responseRequired, "responseRequired");
      optBits |= OPT_BIT_RESPONSE_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#responseRequired() responseRequired} to responseRequired.
     * @param responseRequired The value for responseRequired
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responseRequired")
    public final Builder responseRequired(java.util.Optional<? extends com.fhir.MessagedefinitionResponserequired> responseRequired) {
      checkNotIsSet(responseRequiredIsSet(), "responseRequired");
      this.responseRequired = responseRequired.orElse(null);
      optBits |= OPT_BIT_RESPONSE_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MessageDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MessageDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MessageDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MessageDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder useContext(java.util.List<com.fhir.UsageContext> useContext) {
      checkNotIsSet(useContextIsSet(), "useContext");
      this.useContext = java.util.Objects.requireNonNull(useContext, "useContext");
      optBits |= OPT_BIT_USE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public final Builder useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext) {
      checkNotIsSet(useContextIsSet(), "useContext");
      this.useContext = useContext.orElse(null);
      optBits |= OPT_BIT_USE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageDefinition#id() id} to id.
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
     * Initializes the optional value {@link MessageDefinition#id() id} to id.
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
     * Initializes the optional value {@link MessageDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    public final Builder publisher(java.lang.String publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = java.util.Objects.requireNonNull(publisher, "publisher");
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public final Builder publisher(java.util.Optional<java.lang.String> publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = publisher.orElse(null);
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(com.fhir.markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<? extends com.fhir.markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link MessageDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link MessageDefinition#eventUri() eventUri} to eventUri.
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
     * Initializes the optional value {@link MessageDefinition#eventUri() eventUri} to eventUri.
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
     * Initializes the optional value {@link MessageDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(com.fhir.markdown purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = java.util.Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public final Builder purpose(java.util.Optional<? extends com.fhir.markdown> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.ContactDetail> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#text() text} to text.
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
     * Initializes the optional value {@link MessageDefinition#text() text} to text.
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
     * Initializes the value for the {@link MessageDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MessageDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition#language() language} to language.
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
     * Initializes the optional value {@link MessageDefinition#language() language} to language.
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
     * Initializes the optional value {@link MessageDefinition#title() title} to title.
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
     * Initializes the optional value {@link MessageDefinition#title() title} to title.
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
     * Initializes the optional value {@link MessageDefinition#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(java.util.List<com.fhir.canonical> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = java.util.Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public final Builder parent(java.util.Optional<? extends java.util.List<com.fhir.canonical>> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link MessageDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link MessageDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(com.fhir.MessagedefinitionCategory category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends com.fhir.MessagedefinitionCategory> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#graph() graph} to graph.
     * @param graph The value for graph
     * @return {@code this} builder for chained invocation
     */
    public final Builder graph(java.util.List<com.fhir.canonical> graph) {
      checkNotIsSet(graphIsSet(), "graph");
      this.graph = java.util.Objects.requireNonNull(graph, "graph");
      optBits |= OPT_BIT_GRAPH;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#graph() graph} to graph.
     * @param graph The value for graph
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("graph")
    public final Builder graph(java.util.Optional<? extends java.util.List<com.fhir.canonical>> graph) {
      checkNotIsSet(graphIsSet(), "graph");
      this.graph = graph.orElse(null);
      optBits |= OPT_BIT_GRAPH;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    public final Builder copyright(com.fhir.markdown copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = java.util.Objects.requireNonNull(copyright, "copyright");
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public final Builder copyright(java.util.Optional<? extends com.fhir.markdown> copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = copyright.orElse(null);
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.MessagedefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.MessagedefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    public final Builder experimental(boolean experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental;
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public final Builder experimental(java.util.Optional<java.lang.Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#eventCoding() eventCoding} to eventCoding.
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
     * Initializes the optional value {@link MessageDefinition#eventCoding() eventCoding} to eventCoding.
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
     * Initializes the optional value {@link MessageDefinition#allowedResponse() allowedResponse} to allowedResponse.
     * @param allowedResponse The value for allowedResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder allowedResponse(java.util.List<com.fhir.MessageDefinition_AllowedResponse> allowedResponse) {
      checkNotIsSet(allowedResponseIsSet(), "allowedResponse");
      this.allowedResponse = java.util.Objects.requireNonNull(allowedResponse, "allowedResponse");
      optBits |= OPT_BIT_ALLOWED_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#allowedResponse() allowedResponse} to allowedResponse.
     * @param allowedResponse The value for allowedResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedResponse")
    public final Builder allowedResponse(java.util.Optional<? extends java.util.List<com.fhir.MessageDefinition_AllowedResponse>> allowedResponse) {
      checkNotIsSet(allowedResponseIsSet(), "allowedResponse");
      this.allowedResponse = allowedResponse.orElse(null);
      optBits |= OPT_BIT_ALLOWED_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    public final Builder base(com.fhir.canonical base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = java.util.Objects.requireNonNull(base, "base");
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("base")
    public final Builder base(java.util.Optional<? extends com.fhir.canonical> base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = base.orElse(null);
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Builds a new {@link MessageDefinition MessageDefinition}.
     * @return An immutable instance of MessageDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MessageDefinition build() {
      checkRequiredAttributes();
      return new ImmutableMessageDefinition(
          url,
          replaces,
          version,
          name,
          focus,
          jurisdiction,
          responseRequired,
          implicitRules,
          identifier,
          useContext,
          modifierExtension,
          id,
          publisher,
          description,
          meta,
          eventUri,
          purpose,
          contact,
          text,
          resourceType,
          extension,
          language,
          title,
          parent,
          contained,
          category,
          graph,
          copyright,
          status,
          experimental,
          date,
          eventCoding,
          allowedResponse,
          base);
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean responseRequiredIsSet() {
      return (optBits & OPT_BIT_RESPONSE_REQUIRED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean eventUriIsSet() {
      return (optBits & OPT_BIT_EVENT_URI) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean graphIsSet() {
      return (optBits & OPT_BIT_GRAPH) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean eventCodingIsSet() {
      return (optBits & OPT_BIT_EVENT_CODING) != 0;
    }

    private boolean allowedResponseIsSet() {
      return (optBits & OPT_BIT_ALLOWED_RESPONSE) != 0;
    }

    private boolean baseIsSet() {
      return (optBits & OPT_BIT_BASE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MessageDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MessageDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MessageDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MessageDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MessageDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MessageDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link MessageDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link MessageDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(java.util.List<com.fhir.canonical> replaces);

    /**
     * Initializes the optional value {@link MessageDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(java.util.Optional<? extends java.util.List<com.fhir.canonical>> replaces);

    /**
     * Initializes the optional value {@link MessageDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link MessageDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link MessageDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link MessageDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link MessageDefinition#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(java.util.List<com.fhir.MessageDefinition_Focus> focus);

    /**
     * Initializes the optional value {@link MessageDefinition#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(java.util.Optional<? extends java.util.List<com.fhir.MessageDefinition_Focus>> focus);

    /**
     * Initializes the optional value {@link MessageDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link MessageDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link MessageDefinition#responseRequired() responseRequired} to responseRequired.
     * @param responseRequired The value for responseRequired
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responseRequired(com.fhir.MessagedefinitionResponserequired responseRequired);

    /**
     * Initializes the optional value {@link MessageDefinition#responseRequired() responseRequired} to responseRequired.
     * @param responseRequired The value for responseRequired
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responseRequired(java.util.Optional<? extends com.fhir.MessagedefinitionResponserequired> responseRequired);

    /**
     * Initializes the optional value {@link MessageDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MessageDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MessageDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MessageDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link MessageDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link MessageDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link MessageDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MessageDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MessageDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MessageDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MessageDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link MessageDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link MessageDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link MessageDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link MessageDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MessageDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MessageDefinition#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventUri(java.lang.String eventUri);

    /**
     * Initializes the optional value {@link MessageDefinition#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventUri(java.util.Optional<java.lang.String> eventUri);

    /**
     * Initializes the optional value {@link MessageDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link MessageDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link MessageDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link MessageDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link MessageDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MessageDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MessageDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MessageDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MessageDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MessageDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MessageDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link MessageDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link MessageDefinition#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(java.util.List<com.fhir.canonical> parent);

    /**
     * Initializes the optional value {@link MessageDefinition#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(java.util.Optional<? extends java.util.List<com.fhir.canonical>> parent);

    /**
     * Initializes the optional value {@link MessageDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MessageDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MessageDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(com.fhir.MessagedefinitionCategory category);

    /**
     * Initializes the optional value {@link MessageDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends com.fhir.MessagedefinitionCategory> category);

    /**
     * Initializes the optional value {@link MessageDefinition#graph() graph} to graph.
     * @param graph The value for graph
     * @return {@code this} builder for chained invocation
     */
    BuildFinal graph(java.util.List<com.fhir.canonical> graph);

    /**
     * Initializes the optional value {@link MessageDefinition#graph() graph} to graph.
     * @param graph The value for graph
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal graph(java.util.Optional<? extends java.util.List<com.fhir.canonical>> graph);

    /**
     * Initializes the optional value {@link MessageDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link MessageDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link MessageDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.MessagedefinitionStatus status);

    /**
     * Initializes the optional value {@link MessageDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.MessagedefinitionStatus> status);

    /**
     * Initializes the optional value {@link MessageDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link MessageDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link MessageDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link MessageDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link MessageDefinition#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventCoding(com.fhir.Coding eventCoding);

    /**
     * Initializes the optional value {@link MessageDefinition#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventCoding(java.util.Optional<? extends com.fhir.Coding> eventCoding);

    /**
     * Initializes the optional value {@link MessageDefinition#allowedResponse() allowedResponse} to allowedResponse.
     * @param allowedResponse The value for allowedResponse
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allowedResponse(java.util.List<com.fhir.MessageDefinition_AllowedResponse> allowedResponse);

    /**
     * Initializes the optional value {@link MessageDefinition#allowedResponse() allowedResponse} to allowedResponse.
     * @param allowedResponse The value for allowedResponse
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allowedResponse(java.util.Optional<? extends java.util.List<com.fhir.MessageDefinition_AllowedResponse>> allowedResponse);

    /**
     * Initializes the optional value {@link MessageDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    BuildFinal base(com.fhir.canonical base);

    /**
     * Initializes the optional value {@link MessageDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal base(java.util.Optional<? extends com.fhir.canonical> base);

    /**
     * Builds a new {@link MessageDefinition MessageDefinition}.
     * @return An immutable instance of MessageDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MessageDefinition build();
  }
}
