//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link OperationDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOperationDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "OperationDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOperationDefinition implements com.fhir.OperationDefinition {
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.canonical base;
  private final @javax.annotation.Nullable java.lang.Boolean type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.Boolean affectsState;
  private final @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> parameter;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.OperationdefinitionStatus status;
  private final @javax.annotation.Nullable com.fhir.canonical inputProfile;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.OperationdefinitionKind kind;
  private final @javax.annotation.Nullable com.fhir.markdown comment;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.lang.Boolean system;
  private final @javax.annotation.Nullable com.fhir.canonical outputProfile;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Overload> overload;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> resource;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.lang.Boolean instance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.lang.String version;

  private ImmutableOperationDefinition(
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.canonical base,
      @javax.annotation.Nullable java.lang.Boolean type,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.Boolean affectsState,
      @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> parameter,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.OperationdefinitionStatus status,
      @javax.annotation.Nullable com.fhir.canonical inputProfile,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.OperationdefinitionKind kind,
      @javax.annotation.Nullable com.fhir.markdown comment,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.lang.Boolean system,
      @javax.annotation.Nullable com.fhir.canonical outputProfile,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Overload> overload,
      @javax.annotation.Nullable java.util.List<com.fhir.code> resource,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.uri url,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.lang.Boolean instance,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.lang.String version) {
    this.date = date;
    this.extension = extension;
    this.id = id;
    this.language = language;
    this.base = base;
    this.type = type;
    this.jurisdiction = jurisdiction;
    this.meta = meta;
    this.affectsState = affectsState;
    this.parameter = parameter;
    this.name = name;
    this.title = title;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.inputProfile = inputProfile;
    this.description = description;
    this.text = text;
    this.kind = kind;
    this.comment = comment;
    this.experimental = experimental;
    this.contact = contact;
    this.system = system;
    this.outputProfile = outputProfile;
    this.implicitRules = implicitRules;
    this.overload = overload;
    this.resource = resource;
    this.publisher = publisher;
    this.purpose = purpose;
    this.contained = contained;
    this.url = url;
    this.resourceType = resourceType;
    this.code = code;
    this.instance = instance;
    this.useContext = useContext;
    this.version = version;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.lang.Boolean> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code affectsState} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("affectsState")
  @Override
  public java.util.Optional<java.lang.Boolean> affectsState() {
    return java.util.Optional.ofNullable(affectsState);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parameter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.OperationDefinition_Parameter>> parameter() {
    return java.util.Optional.ofNullable(parameter);
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
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
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
  public java.util.Optional<com.fhir.OperationdefinitionStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code inputProfile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("inputProfile")
  @Override
  public java.util.Optional<com.fhir.canonical> inputProfile() {
    return java.util.Optional.ofNullable(inputProfile);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kind")
  @Override
  public java.util.Optional<com.fhir.OperationdefinitionKind> kind() {
    return java.util.Optional.ofNullable(kind);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<com.fhir.markdown> comment() {
    return java.util.Optional.ofNullable(comment);
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
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("system")
  @Override
  public java.util.Optional<java.lang.Boolean> system() {
    return java.util.Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code outputProfile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outputProfile")
  @Override
  public java.util.Optional<com.fhir.canonical> outputProfile() {
    return java.util.Optional.ofNullable(outputProfile);
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
   * @return The value of the {@code overload} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("overload")
  @Override
  public java.util.Optional<java.util.List<com.fhir.OperationDefinition_Overload>> overload() {
    return java.util.Optional.ofNullable(overload);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> resource() {
    return java.util.Optional.ofNullable(resource);
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
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<com.fhir.markdown> purpose() {
    return java.util.Optional.ofNullable(purpose);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code instance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instance")
  @Override
  public java.util.Optional<java.lang.Boolean> instance() {
    return java.util.Optional.ofNullable(instance);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableOperationDefinition(
        newValue,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableOperationDefinition(
        value,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        newValue,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        value,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        newValue,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        value,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        newValue,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        value,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#base() base} attribute.
   * @param value The value for base
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withBase(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "base");
    if (this.base == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        newValue,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#base() base} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for base
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withBase(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.base == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        value,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withType(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.type, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        newValue,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#type() type} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withType(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.type, value)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        value,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        newValue,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        value,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        newValue,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        value,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#affectsState() affectsState} attribute.
   * @param value The value for affectsState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withAffectsState(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.affectsState, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        newValue,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#affectsState() affectsState} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for affectsState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withAffectsState(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.affectsState, value)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        value,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withParameter(java.util.List<com.fhir.OperationDefinition_Parameter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> newValue = java.util.Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        newValue,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withParameter(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_Parameter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        value,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        newValue,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        value,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        newValue,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        value,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        newValue,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        value,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withStatus(com.fhir.OperationdefinitionStatus value) {
    @javax.annotation.Nullable com.fhir.OperationdefinitionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        newValue,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withStatus(java.util.Optional<? extends com.fhir.OperationdefinitionStatus> optional) {
    @javax.annotation.Nullable com.fhir.OperationdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        value,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#inputProfile() inputProfile} attribute.
   * @param value The value for inputProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withInputProfile(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "inputProfile");
    if (this.inputProfile == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        newValue,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#inputProfile() inputProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inputProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withInputProfile(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.inputProfile == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        value,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        newValue,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        value,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        newValue,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        value,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withKind(com.fhir.OperationdefinitionKind value) {
    @javax.annotation.Nullable com.fhir.OperationdefinitionKind newValue = java.util.Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        newValue,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withKind(java.util.Optional<? extends com.fhir.OperationdefinitionKind> optional) {
    @javax.annotation.Nullable com.fhir.OperationdefinitionKind value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        value,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withComment(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "comment");
    if (this.comment == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        newValue,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#comment() comment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withComment(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.comment == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        value,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        newValue,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        value,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        newValue,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        value,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withSystem(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.system, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        newValue,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#system() system} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withSystem(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.system, value)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        value,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#outputProfile() outputProfile} attribute.
   * @param value The value for outputProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withOutputProfile(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "outputProfile");
    if (this.outputProfile == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        newValue,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#outputProfile() outputProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outputProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withOutputProfile(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.outputProfile == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        value,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        newValue,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        value,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#overload() overload} attribute.
   * @param value The value for overload
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withOverload(java.util.List<com.fhir.OperationDefinition_Overload> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Overload> newValue = java.util.Objects.requireNonNull(value, "overload");
    if (this.overload == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        newValue,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#overload() overload} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for overload
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withOverload(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_Overload>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Overload> value = optional.orElse(null);
    if (this.overload == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        value,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withResource(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        newValue,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withResource(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        value,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        newValue,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        value,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        newValue,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        value,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        newValue,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        value,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        newValue,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        value,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OperationDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOperationDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        newValue,
        this.code,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        newValue,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        value,
        this.instance,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#instance() instance} attribute.
   * @param value The value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withInstance(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.instance, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        newValue,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#instance() instance} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withInstance(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.instance, value)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        value,
        this.useContext,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        newValue,
        this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        value,
        this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableOperationDefinition(
        this.date,
        this.extension,
        this.id,
        this.language,
        this.base,
        this.type,
        this.jurisdiction,
        this.meta,
        this.affectsState,
        this.parameter,
        this.name,
        this.title,
        this.modifierExtension,
        this.status,
        this.inputProfile,
        this.description,
        this.text,
        this.kind,
        this.comment,
        this.experimental,
        this.contact,
        this.system,
        this.outputProfile,
        this.implicitRules,
        this.overload,
        this.resource,
        this.publisher,
        this.purpose,
        this.contained,
        this.url,
        this.resourceType,
        this.code,
        this.instance,
        this.useContext,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOperationDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOperationDefinition
        && equalTo((ImmutableOperationDefinition) another);
  }

  private boolean equalTo(ImmutableOperationDefinition another) {
    return java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(base, another.base)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(affectsState, another.affectsState)
        && java.util.Objects.equals(parameter, another.parameter)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(inputProfile, another.inputProfile)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(kind, another.kind)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(system, another.system)
        && java.util.Objects.equals(outputProfile, another.outputProfile)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(overload, another.overload)
        && java.util.Objects.equals(resource, another.resource)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(url, another.url)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(instance, another.instance)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(version, another.version);
  }

  /**
   * Computes a hash code from attributes: {@code date}, {@code extension}, {@code id}, {@code language}, {@code base}, {@code type}, {@code jurisdiction}, {@code meta}, {@code affectsState}, {@code parameter}, {@code name}, {@code title}, {@code modifierExtension}, {@code status}, {@code inputProfile}, {@code description}, {@code text}, {@code kind}, {@code comment}, {@code experimental}, {@code contact}, {@code system}, {@code outputProfile}, {@code implicitRules}, {@code overload}, {@code resource}, {@code publisher}, {@code purpose}, {@code contained}, {@code url}, {@code resourceType}, {@code code}, {@code instance}, {@code useContext}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(base);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(affectsState);
    h += (h << 5) + java.util.Objects.hashCode(parameter);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(inputProfile);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(kind);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(system);
    h += (h << 5) + java.util.Objects.hashCode(outputProfile);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(overload);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(instance);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(version);
    return h;
  }

  /**
   * Prints the immutable value {@code OperationDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("OperationDefinition{");
    if (date != null) {
      builder.append("date=").append(date);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (base != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("base=").append(base);
    }
    if (type != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (jurisdiction != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (meta != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (affectsState != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("affectsState=").append(affectsState);
    }
    if (parameter != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (title != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (inputProfile != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("inputProfile=").append(inputProfile);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (kind != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (comment != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (experimental != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (contact != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (system != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (outputProfile != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("outputProfile=").append(outputProfile);
    }
    if (implicitRules != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (overload != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("overload=").append(overload);
    }
    if (resource != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (publisher != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (purpose != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (contained != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (url != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (instance != null) {
      builder.append(", ");
      builder.append("instance=").append(instance);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "OperationDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.OperationDefinition {
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> base = java.util.Optional.empty();
    boolean baseIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> affectsState = java.util.Optional.empty();
    boolean affectsStateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.OperationDefinition_Parameter>> parameter = java.util.Optional.empty();
    boolean parameterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.OperationdefinitionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> inputProfile = java.util.Optional.empty();
    boolean inputProfileIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.OperationdefinitionKind> kind = java.util.Optional.empty();
    boolean kindIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> system = java.util.Optional.empty();
    boolean systemIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> outputProfile = java.util.Optional.empty();
    boolean outputProfileIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.OperationDefinition_Overload>> overload = java.util.Optional.empty();
    boolean overloadIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> instance = java.util.Optional.empty();
    boolean instanceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("base")
    public void setBase(java.util.Optional<com.fhir.canonical> base) {
      this.base = base;
      this.baseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.lang.Boolean> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("affectsState")
    public void setAffectsState(java.util.Optional<java.lang.Boolean> affectsState) {
      this.affectsState = affectsState;
      this.affectsStateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public void setParameter(java.util.Optional<java.util.List<com.fhir.OperationDefinition_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.OperationdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("inputProfile")
    public void setInputProfile(java.util.Optional<com.fhir.canonical> inputProfile) {
      this.inputProfile = inputProfile;
      this.inputProfileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public void setKind(java.util.Optional<com.fhir.OperationdefinitionKind> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<com.fhir.markdown> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public void setSystem(java.util.Optional<java.lang.Boolean> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outputProfile")
    public void setOutputProfile(java.util.Optional<com.fhir.canonical> outputProfile) {
      this.outputProfile = outputProfile;
      this.outputProfileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("overload")
    public void setOverload(java.util.Optional<java.util.List<com.fhir.OperationDefinition_Overload>> overload) {
      this.overload = overload;
      this.overloadIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<java.util.List<com.fhir.code>> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instance")
    public void setInstance(java.util.Optional<java.lang.Boolean> instance) {
      this.instance = instance;
      this.instanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> base() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> affectsState() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.OperationDefinition_Parameter>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.OperationdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> inputProfile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.OperationdefinitionKind> kind() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> system() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> outputProfile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.OperationDefinition_Overload>> overload() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> resource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> instance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableOperationDefinition fromJson(Json json) {
    ImmutableOperationDefinition.Builder builder = ((ImmutableOperationDefinition.Builder) ImmutableOperationDefinition.builder());
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.baseIsSet) {
      builder.base(json.base);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.affectsStateIsSet) {
      builder.affectsState(json.affectsState);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.inputProfileIsSet) {
      builder.inputProfile(json.inputProfile);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.outputProfileIsSet) {
      builder.outputProfile(json.outputProfile);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.overloadIsSet) {
      builder.overload(json.overload);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.instanceIsSet) {
      builder.instance(json.instance);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    return (ImmutableOperationDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OperationDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OperationDefinition instance
   */
  public static OperationDefinition copyOf(OperationDefinition instance) {
    if (instance instanceof ImmutableOperationDefinition) {
      return (ImmutableOperationDefinition) instance;
    }
    return ((ImmutableOperationDefinition.Builder) ImmutableOperationDefinition.builder())
        .date(instance.date())
        .extension(instance.extension())
        .id(instance.id())
        .language(instance.language())
        .base(instance.base())
        .type(instance.type())
        .jurisdiction(instance.jurisdiction())
        .meta(instance.meta())
        .affectsState(instance.affectsState())
        .parameter(instance.parameter())
        .name(instance.name())
        .title(instance.title())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .inputProfile(instance.inputProfile())
        .description(instance.description())
        .text(instance.text())
        .kind(instance.kind())
        .comment(instance.comment())
        .experimental(instance.experimental())
        .contact(instance.contact())
        .system(instance.system())
        .outputProfile(instance.outputProfile())
        .implicitRules(instance.implicitRules())
        .overload(instance.overload())
        .resource(instance.resource())
        .publisher(instance.publisher())
        .purpose(instance.purpose())
        .contained(instance.contained())
        .url(instance.url())
        .resourceType(instance.resourceType())
        .code(instance.code())
        .instance(instance.instance())
        .useContext(instance.useContext())
        .version(instance.version())
        .build();
  }

  /**
   * Creates a builder for {@link OperationDefinition OperationDefinition}.
   * <pre>
   * ImmutableOperationDefinition.builder()
   *    .date(com.fhir.dateTime) // optional {@link OperationDefinition#date() date}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationDefinition#extension() extension}
   *    .id(com.fhir.id) // optional {@link OperationDefinition#id() id}
   *    .language(com.fhir.code) // optional {@link OperationDefinition#language() language}
   *    .base(com.fhir.canonical) // optional {@link OperationDefinition#base() base}
   *    .type(Boolean) // optional {@link OperationDefinition#type() type}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link OperationDefinition#jurisdiction() jurisdiction}
   *    .meta(com.fhir.Meta) // optional {@link OperationDefinition#meta() meta}
   *    .affectsState(Boolean) // optional {@link OperationDefinition#affectsState() affectsState}
   *    .parameter(List&amp;lt;com.fhir.OperationDefinition_Parameter&amp;gt;) // optional {@link OperationDefinition#parameter() parameter}
   *    .name(String) // optional {@link OperationDefinition#name() name}
   *    .title(String) // optional {@link OperationDefinition#title() title}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationDefinition#modifierExtension() modifierExtension}
   *    .status(com.fhir.OperationdefinitionStatus) // optional {@link OperationDefinition#status() status}
   *    .inputProfile(com.fhir.canonical) // optional {@link OperationDefinition#inputProfile() inputProfile}
   *    .description(com.fhir.markdown) // optional {@link OperationDefinition#description() description}
   *    .text(com.fhir.Narrative) // optional {@link OperationDefinition#text() text}
   *    .kind(com.fhir.OperationdefinitionKind) // optional {@link OperationDefinition#kind() kind}
   *    .comment(com.fhir.markdown) // optional {@link OperationDefinition#comment() comment}
   *    .experimental(Boolean) // optional {@link OperationDefinition#experimental() experimental}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link OperationDefinition#contact() contact}
   *    .system(Boolean) // optional {@link OperationDefinition#system() system}
   *    .outputProfile(com.fhir.canonical) // optional {@link OperationDefinition#outputProfile() outputProfile}
   *    .implicitRules(com.fhir.uri) // optional {@link OperationDefinition#implicitRules() implicitRules}
   *    .overload(List&amp;lt;com.fhir.OperationDefinition_Overload&amp;gt;) // optional {@link OperationDefinition#overload() overload}
   *    .resource(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link OperationDefinition#resource() resource}
   *    .publisher(String) // optional {@link OperationDefinition#publisher() publisher}
   *    .purpose(com.fhir.markdown) // optional {@link OperationDefinition#purpose() purpose}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link OperationDefinition#contained() contained}
   *    .url(com.fhir.uri) // optional {@link OperationDefinition#url() url}
   *    .resourceType(String) // required {@link OperationDefinition#resourceType() resourceType}
   *    .code(com.fhir.code) // optional {@link OperationDefinition#code() code}
   *    .instance(Boolean) // optional {@link OperationDefinition#instance() instance}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link OperationDefinition#useContext() useContext}
   *    .version(String) // optional {@link OperationDefinition#version() version}
   *    .build();
   * </pre>
   * @return A new OperationDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableOperationDefinition.Builder();
  }

  /**
   * Builds instances of type {@link OperationDefinition OperationDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "OperationDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DATE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_BASE = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_JURISDICTION = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_AFFECTS_STATE = 0x100L;
    private static final long OPT_BIT_PARAMETER = 0x200L;
    private static final long OPT_BIT_NAME = 0x400L;
    private static final long OPT_BIT_TITLE = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_STATUS = 0x2000L;
    private static final long OPT_BIT_INPUT_PROFILE = 0x4000L;
    private static final long OPT_BIT_DESCRIPTION = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_KIND = 0x20000L;
    private static final long OPT_BIT_COMMENT = 0x40000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x80000L;
    private static final long OPT_BIT_CONTACT = 0x100000L;
    private static final long OPT_BIT_SYSTEM = 0x200000L;
    private static final long OPT_BIT_OUTPUT_PROFILE = 0x400000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800000L;
    private static final long OPT_BIT_OVERLOAD = 0x1000000L;
    private static final long OPT_BIT_RESOURCE = 0x2000000L;
    private static final long OPT_BIT_PUBLISHER = 0x4000000L;
    private static final long OPT_BIT_PURPOSE = 0x8000000L;
    private static final long OPT_BIT_CONTAINED = 0x10000000L;
    private static final long OPT_BIT_URL = 0x20000000L;
    private static final long OPT_BIT_CODE = 0x40000000L;
    private static final long OPT_BIT_INSTANCE = 0x80000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x100000000L;
    private static final long OPT_BIT_VERSION = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.canonical base;
    private @javax.annotation.Nullable java.lang.Boolean type;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.Boolean affectsState;
    private @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Parameter> parameter;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.OperationdefinitionStatus status;
    private @javax.annotation.Nullable com.fhir.canonical inputProfile;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.OperationdefinitionKind kind;
    private @javax.annotation.Nullable com.fhir.markdown comment;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.lang.Boolean system;
    private @javax.annotation.Nullable com.fhir.canonical outputProfile;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.OperationDefinition_Overload> overload;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> resource;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.lang.Boolean instance;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.lang.String version;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OperationDefinition#date() date} to date.
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
     * Initializes the optional value {@link OperationDefinition#date() date} to date.
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
     * Initializes the optional value {@link OperationDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition#language() language} to language.
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
     * Initializes the optional value {@link OperationDefinition#language() language} to language.
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
     * Initializes the optional value {@link OperationDefinition#base() base} to base.
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
     * Initializes the optional value {@link OperationDefinition#base() base} to base.
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
     * Initializes the optional value {@link OperationDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(boolean type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type;
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<java.lang.Boolean> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link OperationDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link OperationDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link OperationDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link OperationDefinition#affectsState() affectsState} to affectsState.
     * @param affectsState The value for affectsState
     * @return {@code this} builder for chained invocation
     */
    public final Builder affectsState(boolean affectsState) {
      checkNotIsSet(affectsStateIsSet(), "affectsState");
      this.affectsState = affectsState;
      optBits |= OPT_BIT_AFFECTS_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#affectsState() affectsState} to affectsState.
     * @param affectsState The value for affectsState
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affectsState")
    public final Builder affectsState(java.util.Optional<java.lang.Boolean> affectsState) {
      checkNotIsSet(affectsStateIsSet(), "affectsState");
      this.affectsState = affectsState.orElse(null);
      optBits |= OPT_BIT_AFFECTS_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(java.util.List<com.fhir.OperationDefinition_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = java.util.Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public final Builder parameter(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#name() name} to name.
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
     * Initializes the optional value {@link OperationDefinition#name() name} to name.
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
     * Initializes the optional value {@link OperationDefinition#title() title} to title.
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
     * Initializes the optional value {@link OperationDefinition#title() title} to title.
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
     * Initializes the optional value {@link OperationDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.OperationdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.OperationdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#inputProfile() inputProfile} to inputProfile.
     * @param inputProfile The value for inputProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder inputProfile(com.fhir.canonical inputProfile) {
      checkNotIsSet(inputProfileIsSet(), "inputProfile");
      this.inputProfile = java.util.Objects.requireNonNull(inputProfile, "inputProfile");
      optBits |= OPT_BIT_INPUT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#inputProfile() inputProfile} to inputProfile.
     * @param inputProfile The value for inputProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inputProfile")
    public final Builder inputProfile(java.util.Optional<? extends com.fhir.canonical> inputProfile) {
      checkNotIsSet(inputProfileIsSet(), "inputProfile");
      this.inputProfile = inputProfile.orElse(null);
      optBits |= OPT_BIT_INPUT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#description() description} to description.
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
     * Initializes the optional value {@link OperationDefinition#description() description} to description.
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
     * Initializes the optional value {@link OperationDefinition#text() text} to text.
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
     * Initializes the optional value {@link OperationDefinition#text() text} to text.
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
     * Initializes the optional value {@link OperationDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(com.fhir.OperationdefinitionKind kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = java.util.Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public final Builder kind(java.util.Optional<? extends com.fhir.OperationdefinitionKind> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(com.fhir.markdown comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<? extends com.fhir.markdown> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link OperationDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link OperationDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link OperationDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link OperationDefinition#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(boolean system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system;
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public final Builder system(java.util.Optional<java.lang.Boolean> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#outputProfile() outputProfile} to outputProfile.
     * @param outputProfile The value for outputProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder outputProfile(com.fhir.canonical outputProfile) {
      checkNotIsSet(outputProfileIsSet(), "outputProfile");
      this.outputProfile = java.util.Objects.requireNonNull(outputProfile, "outputProfile");
      optBits |= OPT_BIT_OUTPUT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#outputProfile() outputProfile} to outputProfile.
     * @param outputProfile The value for outputProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outputProfile")
    public final Builder outputProfile(java.util.Optional<? extends com.fhir.canonical> outputProfile) {
      checkNotIsSet(outputProfileIsSet(), "outputProfile");
      this.outputProfile = outputProfile.orElse(null);
      optBits |= OPT_BIT_OUTPUT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OperationDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OperationDefinition#overload() overload} to overload.
     * @param overload The value for overload
     * @return {@code this} builder for chained invocation
     */
    public final Builder overload(java.util.List<com.fhir.OperationDefinition_Overload> overload) {
      checkNotIsSet(overloadIsSet(), "overload");
      this.overload = java.util.Objects.requireNonNull(overload, "overload");
      optBits |= OPT_BIT_OVERLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#overload() overload} to overload.
     * @param overload The value for overload
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overload")
    public final Builder overload(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_Overload>> overload) {
      checkNotIsSet(overloadIsSet(), "overload");
      this.overload = overload.orElse(null);
      optBits |= OPT_BIT_OVERLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(java.util.List<com.fhir.code> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends java.util.List<com.fhir.code>> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link OperationDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link OperationDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link OperationDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link OperationDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link OperationDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link OperationDefinition#url() url} to url.
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
     * Initializes the optional value {@link OperationDefinition#url() url} to url.
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
     * Initializes the value for the {@link OperationDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link OperationDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    public final Builder instance(boolean instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance;
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instance")
    public final Builder instance(java.util.Optional<java.lang.Boolean> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance.orElse(null);
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link OperationDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link OperationDefinition#version() version} to version.
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
     * Initializes the optional value {@link OperationDefinition#version() version} to version.
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
     * Builds a new {@link OperationDefinition OperationDefinition}.
     * @return An immutable instance of OperationDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.OperationDefinition build() {
      checkRequiredAttributes();
      return new ImmutableOperationDefinition(
          date,
          extension,
          id,
          language,
          base,
          type,
          jurisdiction,
          meta,
          affectsState,
          parameter,
          name,
          title,
          modifierExtension,
          status,
          inputProfile,
          description,
          text,
          kind,
          comment,
          experimental,
          contact,
          system,
          outputProfile,
          implicitRules,
          overload,
          resource,
          publisher,
          purpose,
          contained,
          url,
          resourceType,
          code,
          instance,
          useContext,
          version);
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean baseIsSet() {
      return (optBits & OPT_BIT_BASE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean affectsStateIsSet() {
      return (optBits & OPT_BIT_AFFECTS_STATE) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean inputProfileIsSet() {
      return (optBits & OPT_BIT_INPUT_PROFILE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean outputProfileIsSet() {
      return (optBits & OPT_BIT_OUTPUT_PROFILE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean overloadIsSet() {
      return (optBits & OPT_BIT_OVERLOAD) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean instanceIsSet() {
      return (optBits & OPT_BIT_INSTANCE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of OperationDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build OperationDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "OperationDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link OperationDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "OperationDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link OperationDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link OperationDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link OperationDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link OperationDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link OperationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link OperationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link OperationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link OperationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link OperationDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    BuildFinal base(com.fhir.canonical base);

    /**
     * Initializes the optional value {@link OperationDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal base(java.util.Optional<? extends com.fhir.canonical> base);

    /**
     * Initializes the optional value {@link OperationDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(boolean type);

    /**
     * Initializes the optional value {@link OperationDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<java.lang.Boolean> type);

    /**
     * Initializes the optional value {@link OperationDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link OperationDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link OperationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link OperationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link OperationDefinition#affectsState() affectsState} to affectsState.
     * @param affectsState The value for affectsState
     * @return {@code this} builder for chained invocation
     */
    BuildFinal affectsState(boolean affectsState);

    /**
     * Initializes the optional value {@link OperationDefinition#affectsState() affectsState} to affectsState.
     * @param affectsState The value for affectsState
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal affectsState(java.util.Optional<java.lang.Boolean> affectsState);

    /**
     * Initializes the optional value {@link OperationDefinition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parameter(java.util.List<com.fhir.OperationDefinition_Parameter> parameter);

    /**
     * Initializes the optional value {@link OperationDefinition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parameter(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_Parameter>> parameter);

    /**
     * Initializes the optional value {@link OperationDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link OperationDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link OperationDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link OperationDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link OperationDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link OperationDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link OperationDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.OperationdefinitionStatus status);

    /**
     * Initializes the optional value {@link OperationDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.OperationdefinitionStatus> status);

    /**
     * Initializes the optional value {@link OperationDefinition#inputProfile() inputProfile} to inputProfile.
     * @param inputProfile The value for inputProfile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal inputProfile(com.fhir.canonical inputProfile);

    /**
     * Initializes the optional value {@link OperationDefinition#inputProfile() inputProfile} to inputProfile.
     * @param inputProfile The value for inputProfile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal inputProfile(java.util.Optional<? extends com.fhir.canonical> inputProfile);

    /**
     * Initializes the optional value {@link OperationDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link OperationDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link OperationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link OperationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link OperationDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(com.fhir.OperationdefinitionKind kind);

    /**
     * Initializes the optional value {@link OperationDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(java.util.Optional<? extends com.fhir.OperationdefinitionKind> kind);

    /**
     * Initializes the optional value {@link OperationDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(com.fhir.markdown comment);

    /**
     * Initializes the optional value {@link OperationDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(java.util.Optional<? extends com.fhir.markdown> comment);

    /**
     * Initializes the optional value {@link OperationDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link OperationDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link OperationDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link OperationDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link OperationDefinition#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    BuildFinal system(boolean system);

    /**
     * Initializes the optional value {@link OperationDefinition#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal system(java.util.Optional<java.lang.Boolean> system);

    /**
     * Initializes the optional value {@link OperationDefinition#outputProfile() outputProfile} to outputProfile.
     * @param outputProfile The value for outputProfile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outputProfile(com.fhir.canonical outputProfile);

    /**
     * Initializes the optional value {@link OperationDefinition#outputProfile() outputProfile} to outputProfile.
     * @param outputProfile The value for outputProfile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outputProfile(java.util.Optional<? extends com.fhir.canonical> outputProfile);

    /**
     * Initializes the optional value {@link OperationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link OperationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link OperationDefinition#overload() overload} to overload.
     * @param overload The value for overload
     * @return {@code this} builder for chained invocation
     */
    BuildFinal overload(java.util.List<com.fhir.OperationDefinition_Overload> overload);

    /**
     * Initializes the optional value {@link OperationDefinition#overload() overload} to overload.
     * @param overload The value for overload
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal overload(java.util.Optional<? extends java.util.List<com.fhir.OperationDefinition_Overload>> overload);

    /**
     * Initializes the optional value {@link OperationDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resource(java.util.List<com.fhir.code> resource);

    /**
     * Initializes the optional value {@link OperationDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resource(java.util.Optional<? extends java.util.List<com.fhir.code>> resource);

    /**
     * Initializes the optional value {@link OperationDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link OperationDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link OperationDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link OperationDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link OperationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link OperationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link OperationDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link OperationDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link OperationDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.code code);

    /**
     * Initializes the optional value {@link OperationDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.code> code);

    /**
     * Initializes the optional value {@link OperationDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instance(boolean instance);

    /**
     * Initializes the optional value {@link OperationDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(java.util.Optional<java.lang.Boolean> instance);

    /**
     * Initializes the optional value {@link OperationDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link OperationDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link OperationDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link OperationDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Builds a new {@link OperationDefinition OperationDefinition}.
     * @return An immutable instance of OperationDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    OperationDefinition build();
  }
}
