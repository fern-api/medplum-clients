//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExampleScenario}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario.builder()}.
 */
@org.immutables.value.Generated(from = "ExampleScenario", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario implements com.fhir.ExampleScenario {
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Process> process;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Instance> instance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> workflow;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Actor> actor;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.ExamplescenarioStatus status;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;

  private ImmutableExampleScenario(
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Process> process,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Instance> instance,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> workflow,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Actor> actor,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.ExamplescenarioStatus status,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.markdown copyright) {
    this.date = date;
    this.process = process;
    this.contained = contained;
    this.id = id;
    this.url = url;
    this.name = name;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.useContext = useContext;
    this.purpose = purpose;
    this.version = version;
    this.meta = meta;
    this.instance = instance;
    this.contact = contact;
    this.workflow = workflow;
    this.jurisdiction = jurisdiction;
    this.actor = actor;
    this.resourceType = resourceType;
    this.status = status;
    this.text = text;
    this.experimental = experimental;
    this.language = language;
    this.publisher = publisher;
    this.identifier = identifier;
    this.extension = extension;
    this.copyright = copyright;
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
   * @return The value of the {@code process} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("process")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Process>> process() {
    return java.util.Optional.ofNullable(process);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
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
   * @return The value of the {@code instance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Instance>> instance() {
    return java.util.Optional.ofNullable(instance);
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
   * @return The value of the {@code workflow} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("workflow")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> workflow() {
    return java.util.Optional.ofNullable(workflow);
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
   * @return The value of the {@code actor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("actor")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Actor>> actor() {
    return java.util.Optional.ofNullable(actor);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ExamplescenarioStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code experimental} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("experimental")
  @Override
  public java.util.Optional<java.lang.Boolean> experimental() {
    return java.util.Optional.ofNullable(experimental);
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
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableExampleScenario(
        newValue,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableExampleScenario(
        value,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#process() process} attribute.
   * @param value The value for process
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withProcess(java.util.List<com.fhir.ExampleScenario_Process> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Process> newValue = java.util.Objects.requireNonNull(value, "process");
    if (this.process == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        newValue,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#process() process} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for process
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withProcess(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Process>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Process> value = optional.orElse(null);
    if (this.process == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        value,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        newValue,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        value,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        newValue,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        value,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        newValue,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        value,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        newValue,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        value,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        newValue,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        value,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        newValue,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        value,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        newValue,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        value,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        newValue,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        value,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#instance() instance} attribute.
   * @param value The value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withInstance(java.util.List<com.fhir.ExampleScenario_Instance> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Instance> newValue = java.util.Objects.requireNonNull(value, "instance");
    if (this.instance == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        newValue,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#instance() instance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withInstance(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Instance>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Instance> value = optional.orElse(null);
    if (this.instance == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        value,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        newValue,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        value,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#workflow() workflow} attribute.
   * @param value The value for workflow
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withWorkflow(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "workflow");
    if (this.workflow == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        newValue,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#workflow() workflow} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for workflow
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withWorkflow(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.workflow == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        value,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        newValue,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        value,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#actor() actor} attribute.
   * @param value The value for actor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withActor(java.util.List<com.fhir.ExampleScenario_Actor> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Actor> newValue = java.util.Objects.requireNonNull(value, "actor");
    if (this.actor == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        newValue,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#actor() actor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withActor(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Actor>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Actor> value = optional.orElse(null);
    if (this.actor == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        value,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExampleScenario#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExampleScenario withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        newValue,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withStatus(com.fhir.ExamplescenarioStatus value) {
    @javax.annotation.Nullable com.fhir.ExamplescenarioStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        newValue,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withStatus(java.util.Optional<? extends com.fhir.ExamplescenarioStatus> optional) {
    @javax.annotation.Nullable com.fhir.ExamplescenarioStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        value,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        newValue,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        value,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        newValue,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        value,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        newValue,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        value,
        this.publisher,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        newValue,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        value,
        this.identifier,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        newValue,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        value,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        newValue,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        value,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableExampleScenario(
        this.date,
        this.process,
        this.contained,
        this.id,
        this.url,
        this.name,
        this.implicitRules,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.version,
        this.meta,
        this.instance,
        this.contact,
        this.workflow,
        this.jurisdiction,
        this.actor,
        this.resourceType,
        this.status,
        this.text,
        this.experimental,
        this.language,
        this.publisher,
        this.identifier,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario
        && equalTo((ImmutableExampleScenario) another);
  }

  private boolean equalTo(ImmutableExampleScenario another) {
    return java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(process, another.process)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(instance, another.instance)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(workflow, another.workflow)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(actor, another.actor)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(copyright, another.copyright);
  }

  /**
   * Computes a hash code from attributes: {@code date}, {@code process}, {@code contained}, {@code id}, {@code url}, {@code name}, {@code implicitRules}, {@code modifierExtension}, {@code useContext}, {@code purpose}, {@code version}, {@code meta}, {@code instance}, {@code contact}, {@code workflow}, {@code jurisdiction}, {@code actor}, {@code resourceType}, {@code status}, {@code text}, {@code experimental}, {@code language}, {@code publisher}, {@code identifier}, {@code extension}, {@code copyright}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(process);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(instance);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(workflow);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(actor);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExampleScenario{");
    if (date != null) {
      builder.append("date=").append(date);
    }
    if (process != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("process=").append(process);
    }
    if (contained != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (url != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (name != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (implicitRules != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (useContext != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (purpose != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (version != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (meta != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (instance != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("instance=").append(instance);
    }
    if (contact != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (workflow != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("workflow=").append(workflow);
    }
    if (jurisdiction != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (actor != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("actor=").append(actor);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ExampleScenario", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExampleScenario {
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExampleScenario_Process>> process = java.util.Optional.empty();
    boolean processIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExampleScenario_Instance>> instance = java.util.Optional.empty();
    boolean instanceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> workflow = java.util.Optional.empty();
    boolean workflowIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExampleScenario_Actor>> actor = java.util.Optional.empty();
    boolean actorIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ExamplescenarioStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("process")
    public void setProcess(java.util.Optional<java.util.List<com.fhir.ExampleScenario_Process>> process) {
      this.process = process;
      this.processIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instance")
    public void setInstance(java.util.Optional<java.util.List<com.fhir.ExampleScenario_Instance>> instance) {
      this.instance = instance;
      this.instanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("workflow")
    public void setWorkflow(java.util.Optional<java.util.List<com.fhir.canonical>> workflow) {
      this.workflow = workflow;
      this.workflowIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("actor")
    public void setActor(java.util.Optional<java.util.List<com.fhir.ExampleScenario_Actor>> actor) {
      this.actor = actor;
      this.actorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ExamplescenarioStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Process>> process() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Instance>> instance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> workflow() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Actor>> actor() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ExamplescenarioStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario fromJson(Json json) {
    ImmutableExampleScenario.Builder builder = ((ImmutableExampleScenario.Builder) ImmutableExampleScenario.builder());
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.processIsSet) {
      builder.process(json.process);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.instanceIsSet) {
      builder.instance(json.instance);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.workflowIsSet) {
      builder.workflow(json.workflow);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.actorIsSet) {
      builder.actor(json.actor);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    return (ImmutableExampleScenario) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario instance
   */
  public static ExampleScenario copyOf(ExampleScenario instance) {
    if (instance instanceof ImmutableExampleScenario) {
      return (ImmutableExampleScenario) instance;
    }
    return ((ImmutableExampleScenario.Builder) ImmutableExampleScenario.builder())
        .date(instance.date())
        .process(instance.process())
        .contained(instance.contained())
        .id(instance.id())
        .url(instance.url())
        .name(instance.name())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .useContext(instance.useContext())
        .purpose(instance.purpose())
        .version(instance.version())
        .meta(instance.meta())
        .instance(instance.instance())
        .contact(instance.contact())
        .workflow(instance.workflow())
        .jurisdiction(instance.jurisdiction())
        .actor(instance.actor())
        .resourceType(instance.resourceType())
        .status(instance.status())
        .text(instance.text())
        .experimental(instance.experimental())
        .language(instance.language())
        .publisher(instance.publisher())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .copyright(instance.copyright())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario ExampleScenario}.
   * <pre>
   * ImmutableExampleScenario.builder()
   *    .date(com.fhir.dateTime) // optional {@link ExampleScenario#date() date}
   *    .process(List&amp;lt;com.fhir.ExampleScenario_Process&amp;gt;) // optional {@link ExampleScenario#process() process}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ExampleScenario#contained() contained}
   *    .id(com.fhir.id) // optional {@link ExampleScenario#id() id}
   *    .url(com.fhir.uri) // optional {@link ExampleScenario#url() url}
   *    .name(String) // optional {@link ExampleScenario#name() name}
   *    .implicitRules(com.fhir.uri) // optional {@link ExampleScenario#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExampleScenario#modifierExtension() modifierExtension}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link ExampleScenario#useContext() useContext}
   *    .purpose(com.fhir.markdown) // optional {@link ExampleScenario#purpose() purpose}
   *    .version(String) // optional {@link ExampleScenario#version() version}
   *    .meta(com.fhir.Meta) // optional {@link ExampleScenario#meta() meta}
   *    .instance(List&amp;lt;com.fhir.ExampleScenario_Instance&amp;gt;) // optional {@link ExampleScenario#instance() instance}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ExampleScenario#contact() contact}
   *    .workflow(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ExampleScenario#workflow() workflow}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ExampleScenario#jurisdiction() jurisdiction}
   *    .actor(List&amp;lt;com.fhir.ExampleScenario_Actor&amp;gt;) // optional {@link ExampleScenario#actor() actor}
   *    .resourceType(String) // required {@link ExampleScenario#resourceType() resourceType}
   *    .status(com.fhir.ExamplescenarioStatus) // optional {@link ExampleScenario#status() status}
   *    .text(com.fhir.Narrative) // optional {@link ExampleScenario#text() text}
   *    .experimental(Boolean) // optional {@link ExampleScenario#experimental() experimental}
   *    .language(com.fhir.code) // optional {@link ExampleScenario#language() language}
   *    .publisher(String) // optional {@link ExampleScenario#publisher() publisher}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ExampleScenario#identifier() identifier}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExampleScenario#extension() extension}
   *    .copyright(com.fhir.markdown) // optional {@link ExampleScenario#copyright() copyright}
   *    .build();
   * </pre>
   * @return A new ExampleScenario builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableExampleScenario.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario ExampleScenario}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ExampleScenario", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DATE = 0x1L;
    private static final long OPT_BIT_PROCESS = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_URL = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_USE_CONTEXT = 0x100L;
    private static final long OPT_BIT_PURPOSE = 0x200L;
    private static final long OPT_BIT_VERSION = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_INSTANCE = 0x1000L;
    private static final long OPT_BIT_CONTACT = 0x2000L;
    private static final long OPT_BIT_WORKFLOW = 0x4000L;
    private static final long OPT_BIT_JURISDICTION = 0x8000L;
    private static final long OPT_BIT_ACTOR = 0x10000L;
    private static final long OPT_BIT_STATUS = 0x20000L;
    private static final long OPT_BIT_TEXT = 0x40000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x80000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000L;
    private static final long OPT_BIT_PUBLISHER = 0x200000L;
    private static final long OPT_BIT_IDENTIFIER = 0x400000L;
    private static final long OPT_BIT_EXTENSION = 0x800000L;
    private static final long OPT_BIT_COPYRIGHT = 0x1000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Process> process;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Instance> instance;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> workflow;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Actor> actor;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.ExamplescenarioStatus status;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.markdown copyright;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario#date() date} to date.
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
     * Initializes the optional value {@link ExampleScenario#date() date} to date.
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
     * Initializes the optional value {@link ExampleScenario#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for chained invocation
     */
    public final Builder process(java.util.List<com.fhir.ExampleScenario_Process> process) {
      checkNotIsSet(processIsSet(), "process");
      this.process = java.util.Objects.requireNonNull(process, "process");
      optBits |= OPT_BIT_PROCESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("process")
    public final Builder process(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Process>> process) {
      checkNotIsSet(processIsSet(), "process");
      this.process = process.orElse(null);
      optBits |= OPT_BIT_PROCESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#contained() contained} to contained.
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
     * Initializes the optional value {@link ExampleScenario#contained() contained} to contained.
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
     * Initializes the optional value {@link ExampleScenario#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario#url() url} to url.
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
     * Initializes the optional value {@link ExampleScenario#url() url} to url.
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
     * Initializes the optional value {@link ExampleScenario#name() name} to name.
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
     * Initializes the optional value {@link ExampleScenario#name() name} to name.
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
     * Initializes the optional value {@link ExampleScenario#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ExampleScenario#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ExampleScenario#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ExampleScenario#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ExampleScenario#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ExampleScenario#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ExampleScenario#version() version} to version.
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
     * Initializes the optional value {@link ExampleScenario#version() version} to version.
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
     * Initializes the optional value {@link ExampleScenario#meta() meta} to meta.
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
     * Initializes the optional value {@link ExampleScenario#meta() meta} to meta.
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
     * Initializes the optional value {@link ExampleScenario#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    public final Builder instance(java.util.List<com.fhir.ExampleScenario_Instance> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = java.util.Objects.requireNonNull(instance, "instance");
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instance")
    public final Builder instance(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Instance>> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance.orElse(null);
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#contact() contact} to contact.
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
     * Initializes the optional value {@link ExampleScenario#contact() contact} to contact.
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
     * Initializes the optional value {@link ExampleScenario#workflow() workflow} to workflow.
     * @param workflow The value for workflow
     * @return {@code this} builder for chained invocation
     */
    public final Builder workflow(java.util.List<com.fhir.canonical> workflow) {
      checkNotIsSet(workflowIsSet(), "workflow");
      this.workflow = java.util.Objects.requireNonNull(workflow, "workflow");
      optBits |= OPT_BIT_WORKFLOW;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#workflow() workflow} to workflow.
     * @param workflow The value for workflow
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workflow")
    public final Builder workflow(java.util.Optional<? extends java.util.List<com.fhir.canonical>> workflow) {
      checkNotIsSet(workflowIsSet(), "workflow");
      this.workflow = workflow.orElse(null);
      optBits |= OPT_BIT_WORKFLOW;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ExampleScenario#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ExampleScenario#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for chained invocation
     */
    public final Builder actor(java.util.List<com.fhir.ExampleScenario_Actor> actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = java.util.Objects.requireNonNull(actor, "actor");
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actor")
    public final Builder actor(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Actor>> actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = actor.orElse(null);
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the value for the {@link ExampleScenario#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ExampleScenario#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ExamplescenarioStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ExamplescenarioStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#text() text} to text.
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
     * Initializes the optional value {@link ExampleScenario#text() text} to text.
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
     * Initializes the optional value {@link ExampleScenario#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ExampleScenario#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ExampleScenario#language() language} to language.
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
     * Initializes the optional value {@link ExampleScenario#language() language} to language.
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
     * Initializes the optional value {@link ExampleScenario#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ExampleScenario#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ExampleScenario#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ExampleScenario#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ExampleScenario#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ExampleScenario#copyright() copyright} to copyright.
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
     * Builds a new {@link ExampleScenario ExampleScenario}.
     * @return An immutable instance of ExampleScenario
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExampleScenario build() {
      checkRequiredAttributes();
      return new ImmutableExampleScenario(
          date,
          process,
          contained,
          id,
          url,
          name,
          implicitRules,
          modifierExtension,
          useContext,
          purpose,
          version,
          meta,
          instance,
          contact,
          workflow,
          jurisdiction,
          actor,
          resourceType,
          status,
          text,
          experimental,
          language,
          publisher,
          identifier,
          extension,
          copyright);
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean processIsSet() {
      return (optBits & OPT_BIT_PROCESS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean instanceIsSet() {
      return (optBits & OPT_BIT_INSTANCE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean workflowIsSet() {
      return (optBits & OPT_BIT_WORKFLOW) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean actorIsSet() {
      return (optBits & OPT_BIT_ACTOR) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExampleScenario is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ExampleScenario, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ExampleScenario", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ExampleScenario#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ExampleScenario", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExampleScenario#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link ExampleScenario#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link ExampleScenario#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for chained invocation
     */
    BuildFinal process(java.util.List<com.fhir.ExampleScenario_Process> process);

    /**
     * Initializes the optional value {@link ExampleScenario#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal process(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Process>> process);

    /**
     * Initializes the optional value {@link ExampleScenario#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ExampleScenario#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ExampleScenario#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ExampleScenario#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ExampleScenario#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link ExampleScenario#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link ExampleScenario#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link ExampleScenario#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link ExampleScenario#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ExampleScenario#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ExampleScenario#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExampleScenario#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExampleScenario#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link ExampleScenario#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ExampleScenario#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link ExampleScenario#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link ExampleScenario#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link ExampleScenario#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link ExampleScenario#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ExampleScenario#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ExampleScenario#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instance(java.util.List<com.fhir.ExampleScenario_Instance> instance);

    /**
     * Initializes the optional value {@link ExampleScenario#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Instance>> instance);

    /**
     * Initializes the optional value {@link ExampleScenario#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link ExampleScenario#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ExampleScenario#workflow() workflow} to workflow.
     * @param workflow The value for workflow
     * @return {@code this} builder for chained invocation
     */
    BuildFinal workflow(java.util.List<com.fhir.canonical> workflow);

    /**
     * Initializes the optional value {@link ExampleScenario#workflow() workflow} to workflow.
     * @param workflow The value for workflow
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal workflow(java.util.Optional<? extends java.util.List<com.fhir.canonical>> workflow);

    /**
     * Initializes the optional value {@link ExampleScenario#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ExampleScenario#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ExampleScenario#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actor(java.util.List<com.fhir.ExampleScenario_Actor> actor);

    /**
     * Initializes the optional value {@link ExampleScenario#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actor(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Actor>> actor);

    /**
     * Initializes the optional value {@link ExampleScenario#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ExamplescenarioStatus status);

    /**
     * Initializes the optional value {@link ExampleScenario#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ExamplescenarioStatus> status);

    /**
     * Initializes the optional value {@link ExampleScenario#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ExampleScenario#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ExampleScenario#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link ExampleScenario#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link ExampleScenario#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ExampleScenario#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ExampleScenario#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link ExampleScenario#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link ExampleScenario#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ExampleScenario#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ExampleScenario#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ExampleScenario#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ExampleScenario#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link ExampleScenario#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Builds a new {@link ExampleScenario ExampleScenario}.
     * @return An immutable instance of ExampleScenario
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExampleScenario build();
  }
}
