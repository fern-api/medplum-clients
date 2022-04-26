package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ExampleScenario}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario.builder()}.
 */
@Generated(from = "ExampleScenario", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario implements ExampleScenario {
  private final String resourceType;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable List<ExampleScenario_Instance> instance;
  private final @Nullable String name;
  private final @Nullable List<ExampleScenario_Actor> actor;
  private final @Nullable Markdown copyright;
  private final @Nullable String publisher;
  private final @Nullable DateTime date;
  private final @Nullable Uri url;
  private final @Nullable String version;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ExampleScenario_Process> process;
  private final @Nullable Markdown purpose;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Boolean experimental;
  private final @Nullable List<Canonical> workflow;
  private final @Nullable Id id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Meta meta;
  private final @Nullable ExamplescenarioStatus status;

  private ImmutableExampleScenario(
      String resourceType,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<Identifier> identifier,
      @Nullable List<ContactDetail> contact,
      @Nullable List<ExampleScenario_Instance> instance,
      @Nullable String name,
      @Nullable List<ExampleScenario_Actor> actor,
      @Nullable Markdown copyright,
      @Nullable String publisher,
      @Nullable DateTime date,
      @Nullable Uri url,
      @Nullable String version,
      @Nullable List<UsageContext> useContext,
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ExampleScenario_Process> process,
      @Nullable Markdown purpose,
      @Nullable List<ResourceList> contained,
      @Nullable Boolean experimental,
      @Nullable List<Canonical> workflow,
      @Nullable Id id,
      @Nullable List<Extension> extension,
      @Nullable Meta meta,
      @Nullable ExamplescenarioStatus status) {
    this.resourceType = resourceType;
    this.jurisdiction = jurisdiction;
    this.implicitRules = implicitRules;
    this.language = language;
    this.identifier = identifier;
    this.contact = contact;
    this.instance = instance;
    this.name = name;
    this.actor = actor;
    this.copyright = copyright;
    this.publisher = publisher;
    this.date = date;
    this.url = url;
    this.version = version;
    this.useContext = useContext;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.process = process;
    this.purpose = purpose;
    this.contained = contained;
    this.experimental = experimental;
    this.workflow = workflow;
    this.id = id;
    this.extension = extension;
    this.meta = meta;
    this.status = status;
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code instance} attribute
   */
  @JsonProperty("instance")
  @Override
  public Optional<List<ExampleScenario_Instance>> instance() {
    return Optional.ofNullable(instance);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code actor} attribute
   */
  @JsonProperty("actor")
  @Override
  public Optional<List<ExampleScenario_Actor>> actor() {
    return Optional.ofNullable(actor);
  }

  /**
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
  }

  /**
   * @return The value of the {@code publisher} attribute
   */
  @JsonProperty("publisher")
  @Override
  public Optional<String> publisher() {
    return Optional.ofNullable(publisher);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code useContext} attribute
   */
  @JsonProperty("useContext")
  @Override
  public Optional<List<UsageContext>> useContext() {
    return Optional.ofNullable(useContext);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code process} attribute
   */
  @JsonProperty("process")
  @Override
  public Optional<List<ExampleScenario_Process>> process() {
    return Optional.ofNullable(process);
  }

  /**
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<Markdown> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code experimental} attribute
   */
  @JsonProperty("experimental")
  @Override
  public Optional<Boolean> experimental() {
    return Optional.ofNullable(experimental);
  }

  /**
   * @return The value of the {@code workflow} attribute
   */
  @JsonProperty("workflow")
  @Override
  public Optional<List<Canonical>> workflow() {
    return Optional.ofNullable(workflow);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ExamplescenarioStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExampleScenario#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExampleScenario withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableExampleScenario(
        newValue,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        newValue,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        value,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        newValue,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        value,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        newValue,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        value,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        newValue,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        value,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        newValue,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        value,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#instance() instance} attribute.
   * @param value The value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withInstance(List<ExampleScenario_Instance> value) {
    @Nullable List<ExampleScenario_Instance> newValue = Objects.requireNonNull(value, "instance");
    if (this.instance == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        newValue,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#instance() instance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withInstance(Optional<? extends List<ExampleScenario_Instance>> optional) {
    @Nullable List<ExampleScenario_Instance> value = optional.orElse(null);
    if (this.instance == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        value,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        newValue,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        value,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#actor() actor} attribute.
   * @param value The value for actor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withActor(List<ExampleScenario_Actor> value) {
    @Nullable List<ExampleScenario_Actor> newValue = Objects.requireNonNull(value, "actor");
    if (this.actor == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        newValue,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#actor() actor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withActor(Optional<? extends List<ExampleScenario_Actor>> optional) {
    @Nullable List<ExampleScenario_Actor> value = optional.orElse(null);
    if (this.actor == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        value,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        newValue,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        value,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        newValue,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        value,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        newValue,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        value,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        newValue,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        value,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        newValue,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        value,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        newValue,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        value,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        newValue,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        value,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        newValue,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        value,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#process() process} attribute.
   * @param value The value for process
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withProcess(List<ExampleScenario_Process> value) {
    @Nullable List<ExampleScenario_Process> newValue = Objects.requireNonNull(value, "process");
    if (this.process == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        newValue,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#process() process} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for process
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withProcess(Optional<? extends List<ExampleScenario_Process>> optional) {
    @Nullable List<ExampleScenario_Process> value = optional.orElse(null);
    if (this.process == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        value,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        newValue,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        value,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        newValue,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        value,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        newValue,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        value,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#workflow() workflow} attribute.
   * @param value The value for workflow
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withWorkflow(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "workflow");
    if (this.workflow == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        newValue,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#workflow() workflow} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for workflow
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withWorkflow(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.workflow == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        value,
        this.id,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        newValue,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        value,
        this.extension,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        newValue,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        value,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        newValue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        value,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario withStatus(ExamplescenarioStatus value) {
    @Nullable ExamplescenarioStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario withStatus(Optional<? extends ExamplescenarioStatus> optional) {
    @Nullable ExamplescenarioStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableExampleScenario(
        this.resourceType,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.identifier,
        this.contact,
        this.instance,
        this.name,
        this.actor,
        this.copyright,
        this.publisher,
        this.date,
        this.url,
        this.version,
        this.useContext,
        this.text,
        this.modifierExtension,
        this.process,
        this.purpose,
        this.contained,
        this.experimental,
        this.workflow,
        this.id,
        this.extension,
        this.meta,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario
        && equalTo((ImmutableExampleScenario) another);
  }

  private boolean equalTo(ImmutableExampleScenario another) {
    return resourceType.equals(another.resourceType)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(contact, another.contact)
        && Objects.equals(instance, another.instance)
        && Objects.equals(name, another.name)
        && Objects.equals(actor, another.actor)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(date, another.date)
        && Objects.equals(url, another.url)
        && Objects.equals(version, another.version)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(process, another.process)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(contained, another.contained)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(workflow, another.workflow)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(meta, another.meta)
        && Objects.equals(status, another.status);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code jurisdiction}, {@code implicitRules}, {@code language}, {@code identifier}, {@code contact}, {@code instance}, {@code name}, {@code actor}, {@code copyright}, {@code publisher}, {@code date}, {@code url}, {@code version}, {@code useContext}, {@code text}, {@code modifierExtension}, {@code process}, {@code purpose}, {@code contained}, {@code experimental}, {@code workflow}, {@code id}, {@code extension}, {@code meta}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(instance);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(actor);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(process);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(workflow);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(status);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExampleScenario{");
    builder.append("resourceType=").append(resourceType);
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (instance != null) {
      builder.append(", ");
      builder.append("instance=").append(instance);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (actor != null) {
      builder.append(", ");
      builder.append("actor=").append(actor);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (process != null) {
      builder.append(", ");
      builder.append("process=").append(process);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (workflow != null) {
      builder.append(", ");
      builder.append("workflow=").append(workflow);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExampleScenario", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExampleScenario {
    @Nullable String resourceType;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<ExampleScenario_Instance>> instance = Optional.empty();
    boolean instanceIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<ExampleScenario_Actor>> actor = Optional.empty();
    boolean actorIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ExampleScenario_Process>> process = Optional.empty();
    boolean processIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<List<Canonical>> workflow = Optional.empty();
    boolean workflowIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<ExamplescenarioStatus> status = Optional.empty();
    boolean statusIsSet;
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("instance")
    public void setInstance(Optional<List<ExampleScenario_Instance>> instance) {
      this.instance = instance;
      this.instanceIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("actor")
    public void setActor(Optional<List<ExampleScenario_Actor>> actor) {
      this.actor = actor;
      this.actorIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("process")
    public void setProcess(Optional<List<ExampleScenario_Process>> process) {
      this.process = process;
      this.processIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("workflow")
    public void setWorkflow(Optional<List<Canonical>> workflow) {
      this.workflow = workflow;
      this.workflowIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ExamplescenarioStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExampleScenario_Instance>> instance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExampleScenario_Actor>> actor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExampleScenario_Process>> process() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> workflow() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ExamplescenarioStatus> status() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario fromJson(Json json) {
    ImmutableExampleScenario.Builder builder = ((ImmutableExampleScenario.Builder) ImmutableExampleScenario.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.instanceIsSet) {
      builder.instance(json.instance);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.actorIsSet) {
      builder.actor(json.actor);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.processIsSet) {
      builder.process(json.process);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.workflowIsSet) {
      builder.workflow(json.workflow);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
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
        .resourceType(instance.resourceType())
        .jurisdiction(instance.jurisdiction())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .identifier(instance.identifier())
        .contact(instance.contact())
        .instance(instance.instance())
        .name(instance.name())
        .actor(instance.actor())
        .copyright(instance.copyright())
        .publisher(instance.publisher())
        .date(instance.date())
        .url(instance.url())
        .version(instance.version())
        .useContext(instance.useContext())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .process(instance.process())
        .purpose(instance.purpose())
        .contained(instance.contained())
        .experimental(instance.experimental())
        .workflow(instance.workflow())
        .id(instance.id())
        .extension(instance.extension())
        .meta(instance.meta())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario ExampleScenario}.
   * <pre>
   * ImmutableExampleScenario.builder()
   *    .resourceType(String) // required {@link ExampleScenario#resourceType() resourceType}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExampleScenario#jurisdiction() jurisdiction}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ExampleScenario#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ExampleScenario#language() language}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ExampleScenario#identifier() identifier}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ExampleScenario#contact() contact}
   *    .instance(List&amp;lt;com.medplum.types.fhir.ExampleScenario_Instance&amp;gt;) // optional {@link ExampleScenario#instance() instance}
   *    .name(String) // optional {@link ExampleScenario#name() name}
   *    .actor(List&amp;lt;com.medplum.types.fhir.ExampleScenario_Actor&amp;gt;) // optional {@link ExampleScenario#actor() actor}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link ExampleScenario#copyright() copyright}
   *    .publisher(String) // optional {@link ExampleScenario#publisher() publisher}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link ExampleScenario#date() date}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link ExampleScenario#url() url}
   *    .version(String) // optional {@link ExampleScenario#version() version}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link ExampleScenario#useContext() useContext}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ExampleScenario#text() text}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario#modifierExtension() modifierExtension}
   *    .process(List&amp;lt;com.medplum.types.fhir.ExampleScenario_Process&amp;gt;) // optional {@link ExampleScenario#process() process}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link ExampleScenario#purpose() purpose}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ExampleScenario#contained() contained}
   *    .experimental(Boolean) // optional {@link ExampleScenario#experimental() experimental}
   *    .workflow(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link ExampleScenario#workflow() workflow}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ExampleScenario#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario#extension() extension}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ExampleScenario#meta() meta}
   *    .status(com.medplum.types.fhir.ExamplescenarioStatus) // optional {@link ExampleScenario#status() status}
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
  @Generated(from = "ExampleScenario", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_JURISDICTION = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_CONTACT = 0x10L;
    private static final long OPT_BIT_INSTANCE = 0x20L;
    private static final long OPT_BIT_NAME = 0x40L;
    private static final long OPT_BIT_ACTOR = 0x80L;
    private static final long OPT_BIT_COPYRIGHT = 0x100L;
    private static final long OPT_BIT_PUBLISHER = 0x200L;
    private static final long OPT_BIT_DATE = 0x400L;
    private static final long OPT_BIT_URL = 0x800L;
    private static final long OPT_BIT_VERSION = 0x1000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x2000L;
    private static final long OPT_BIT_TEXT = 0x4000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8000L;
    private static final long OPT_BIT_PROCESS = 0x10000L;
    private static final long OPT_BIT_PURPOSE = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x80000L;
    private static final long OPT_BIT_WORKFLOW = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private static final long OPT_BIT_EXTENSION = 0x400000L;
    private static final long OPT_BIT_META = 0x800000L;
    private static final long OPT_BIT_STATUS = 0x1000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String resourceType;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<ContactDetail> contact;
    private @Nullable List<ExampleScenario_Instance> instance;
    private @Nullable String name;
    private @Nullable List<ExampleScenario_Actor> actor;
    private @Nullable Markdown copyright;
    private @Nullable String publisher;
    private @Nullable DateTime date;
    private @Nullable Uri url;
    private @Nullable String version;
    private @Nullable List<UsageContext> useContext;
    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ExampleScenario_Process> process;
    private @Nullable Markdown purpose;
    private @Nullable List<ResourceList> contained;
    private @Nullable Boolean experimental;
    private @Nullable List<Canonical> workflow;
    private @Nullable Id id;
    private @Nullable List<Extension> extension;
    private @Nullable Meta meta;
    private @Nullable ExamplescenarioStatus status;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link ExampleScenario#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ExampleScenario#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(List<CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdiction")
    public final Builder jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ExampleScenario#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ExampleScenario#language() language} to language.
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
     * Initializes the optional value {@link ExampleScenario#language() language} to language.
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
     * Initializes the optional value {@link ExampleScenario#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ExampleScenario#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ExampleScenario#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<ContactDetail> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<ContactDetail>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    public final Builder instance(List<ExampleScenario_Instance> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = Objects.requireNonNull(instance, "instance");
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instance")
    public final Builder instance(Optional<? extends List<ExampleScenario_Instance>> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance.orElse(null);
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for chained invocation
     */
    public final Builder actor(List<ExampleScenario_Actor> actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = Objects.requireNonNull(actor, "actor");
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actor")
    public final Builder actor(Optional<? extends List<ExampleScenario_Actor>> actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = actor.orElse(null);
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    public final Builder copyright(Markdown copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = Objects.requireNonNull(copyright, "copyright");
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("copyright")
    public final Builder copyright(Optional<? extends Markdown> copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = copyright.orElse(null);
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    public final Builder publisher(String publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = Objects.requireNonNull(publisher, "publisher");
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("publisher")
    public final Builder publisher(Optional<String> publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = publisher.orElse(null);
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder useContext(List<UsageContext> useContext) {
      checkNotIsSet(useContextIsSet(), "useContext");
      this.useContext = Objects.requireNonNull(useContext, "useContext");
      optBits |= OPT_BIT_USE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("useContext")
    public final Builder useContext(Optional<? extends List<UsageContext>> useContext) {
      checkNotIsSet(useContextIsSet(), "useContext");
      this.useContext = useContext.orElse(null);
      optBits |= OPT_BIT_USE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#text() text} to text.
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
     * Initializes the optional value {@link ExampleScenario#text() text} to text.
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
     * Initializes the optional value {@link ExampleScenario#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for chained invocation
     */
    public final Builder process(List<ExampleScenario_Process> process) {
      checkNotIsSet(processIsSet(), "process");
      this.process = Objects.requireNonNull(process, "process");
      optBits |= OPT_BIT_PROCESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("process")
    public final Builder process(Optional<? extends List<ExampleScenario_Process>> process) {
      checkNotIsSet(processIsSet(), "process");
      this.process = process.orElse(null);
      optBits |= OPT_BIT_PROCESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(Markdown purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("purpose")
    public final Builder purpose(Optional<? extends Markdown> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#contained() contained} to contained.
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
     * Initializes the optional value {@link ExampleScenario#contained() contained} to contained.
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
    @JsonProperty("experimental")
    public final Builder experimental(Optional<Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#workflow() workflow} to workflow.
     * @param workflow The value for workflow
     * @return {@code this} builder for chained invocation
     */
    public final Builder workflow(List<Canonical> workflow) {
      checkNotIsSet(workflowIsSet(), "workflow");
      this.workflow = Objects.requireNonNull(workflow, "workflow");
      optBits |= OPT_BIT_WORKFLOW;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#workflow() workflow} to workflow.
     * @param workflow The value for workflow
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("workflow")
    public final Builder workflow(Optional<? extends List<Canonical>> workflow) {
      checkNotIsSet(workflowIsSet(), "workflow");
      this.workflow = workflow.orElse(null);
      optBits |= OPT_BIT_WORKFLOW;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario#meta() meta} to meta.
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
     * Initializes the optional value {@link ExampleScenario#meta() meta} to meta.
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
     * Initializes the optional value {@link ExampleScenario#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ExamplescenarioStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ExamplescenarioStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Builds a new {@link ExampleScenario ExampleScenario}.
     * @return An immutable instance of ExampleScenario
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExampleScenario build() {
      checkRequiredAttributes();
      return new ImmutableExampleScenario(
          resourceType,
          jurisdiction,
          implicitRules,
          language,
          identifier,
          contact,
          instance,
          name,
          actor,
          copyright,
          publisher,
          date,
          url,
          version,
          useContext,
          text,
          modifierExtension,
          process,
          purpose,
          contained,
          experimental,
          workflow,
          id,
          extension,
          meta,
          status);
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean instanceIsSet() {
      return (optBits & OPT_BIT_INSTANCE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean actorIsSet() {
      return (optBits & OPT_BIT_ACTOR) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean processIsSet() {
      return (optBits & OPT_BIT_PROCESS) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean workflowIsSet() {
      return (optBits & OPT_BIT_WORKFLOW) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExampleScenario is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ExampleScenario, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExampleScenario", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ExampleScenario#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ExampleScenario", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExampleScenario#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ExampleScenario#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ExampleScenario#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ExampleScenario#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ExampleScenario#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ExampleScenario#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ExampleScenario#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ExampleScenario#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ExampleScenario#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link ExampleScenario#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ExampleScenario#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instance(List<ExampleScenario_Instance> instance);

    /**
     * Initializes the optional value {@link ExampleScenario#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(Optional<? extends List<ExampleScenario_Instance>> instance);

    /**
     * Initializes the optional value {@link ExampleScenario#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link ExampleScenario#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link ExampleScenario#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actor(List<ExampleScenario_Actor> actor);

    /**
     * Initializes the optional value {@link ExampleScenario#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actor(Optional<? extends List<ExampleScenario_Actor>> actor);

    /**
     * Initializes the optional value {@link ExampleScenario#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link ExampleScenario#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link ExampleScenario#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link ExampleScenario#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link ExampleScenario#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ExampleScenario#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link ExampleScenario#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link ExampleScenario#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link ExampleScenario#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link ExampleScenario#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link ExampleScenario#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link ExampleScenario#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ExampleScenario#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ExampleScenario#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ExampleScenario#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExampleScenario#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExampleScenario#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for chained invocation
     */
    BuildFinal process(List<ExampleScenario_Process> process);

    /**
     * Initializes the optional value {@link ExampleScenario#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal process(Optional<? extends List<ExampleScenario_Process>> process);

    /**
     * Initializes the optional value {@link ExampleScenario#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link ExampleScenario#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link ExampleScenario#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ExampleScenario#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

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
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link ExampleScenario#workflow() workflow} to workflow.
     * @param workflow The value for workflow
     * @return {@code this} builder for chained invocation
     */
    BuildFinal workflow(List<Canonical> workflow);

    /**
     * Initializes the optional value {@link ExampleScenario#workflow() workflow} to workflow.
     * @param workflow The value for workflow
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal workflow(Optional<? extends List<Canonical>> workflow);

    /**
     * Initializes the optional value {@link ExampleScenario#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ExampleScenario#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ExampleScenario#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExampleScenario#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExampleScenario#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ExampleScenario#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ExampleScenario#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ExamplescenarioStatus status);

    /**
     * Initializes the optional value {@link ExampleScenario#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ExamplescenarioStatus> status);

    /**
     * Builds a new {@link ExampleScenario ExampleScenario}.
     * @return An immutable instance of ExampleScenario
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExampleScenario build();
  }
}
