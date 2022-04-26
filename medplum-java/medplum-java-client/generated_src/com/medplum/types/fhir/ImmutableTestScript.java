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
 * Immutable implementation of {@link TestScript}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript.builder()}.
 */
@Generated(from = "TestScript", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript implements TestScript {
  private final @Nullable DateTime date;
  private final @Nullable TestScript_Setup setup;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable TestScript_Metadata metadata;
  private final @Nullable TestscriptStatus status;
  private final @Nullable Code language;
  private final @Nullable List<TestScript_Destination> destination;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Markdown description;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<TestScript_Test> test;
  private final @Nullable Narrative text;
  private final @Nullable Uri url;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final String resourceType;
  private final @Nullable List<Reference> profile;
  private final @Nullable String publisher;
  private final @Nullable Identifier identifier;
  private final @Nullable Markdown copyright;
  private final @Nullable List<TestScript_Variable> variable;
  private final @Nullable Id id;
  private final @Nullable Meta meta;
  private final @Nullable String name;
  private final @Nullable List<TestScript_Fixture> fixture;
  private final @Nullable Uri implicitRules;
  private final @Nullable String version;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable TestScript_Teardown teardown;
  private final @Nullable String title;
  private final @Nullable List<TestScript_Origin> origin;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean experimental;
  private final @Nullable Markdown purpose;

  private ImmutableTestScript(
      @Nullable DateTime date,
      @Nullable TestScript_Setup setup,
      @Nullable List<Extension> modifierExtension,
      @Nullable TestScript_Metadata metadata,
      @Nullable TestscriptStatus status,
      @Nullable Code language,
      @Nullable List<TestScript_Destination> destination,
      @Nullable List<ContactDetail> contact,
      @Nullable Markdown description,
      @Nullable List<ResourceList> contained,
      @Nullable List<TestScript_Test> test,
      @Nullable Narrative text,
      @Nullable Uri url,
      @Nullable List<CodeableConcept> jurisdiction,
      String resourceType,
      @Nullable List<Reference> profile,
      @Nullable String publisher,
      @Nullable Identifier identifier,
      @Nullable Markdown copyright,
      @Nullable List<TestScript_Variable> variable,
      @Nullable Id id,
      @Nullable Meta meta,
      @Nullable String name,
      @Nullable List<TestScript_Fixture> fixture,
      @Nullable Uri implicitRules,
      @Nullable String version,
      @Nullable List<UsageContext> useContext,
      @Nullable TestScript_Teardown teardown,
      @Nullable String title,
      @Nullable List<TestScript_Origin> origin,
      @Nullable List<Extension> extension,
      @Nullable Boolean experimental,
      @Nullable Markdown purpose) {
    this.date = date;
    this.setup = setup;
    this.modifierExtension = modifierExtension;
    this.metadata = metadata;
    this.status = status;
    this.language = language;
    this.destination = destination;
    this.contact = contact;
    this.description = description;
    this.contained = contained;
    this.test = test;
    this.text = text;
    this.url = url;
    this.jurisdiction = jurisdiction;
    this.resourceType = resourceType;
    this.profile = profile;
    this.publisher = publisher;
    this.identifier = identifier;
    this.copyright = copyright;
    this.variable = variable;
    this.id = id;
    this.meta = meta;
    this.name = name;
    this.fixture = fixture;
    this.implicitRules = implicitRules;
    this.version = version;
    this.useContext = useContext;
    this.teardown = teardown;
    this.title = title;
    this.origin = origin;
    this.extension = extension;
    this.experimental = experimental;
    this.purpose = purpose;
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
   * @return The value of the {@code setup} attribute
   */
  @JsonProperty("setup")
  @Override
  public Optional<TestScript_Setup> setup() {
    return Optional.ofNullable(setup);
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
   * @return The value of the {@code metadata} attribute
   */
  @JsonProperty("metadata")
  @Override
  public Optional<TestScript_Metadata> metadata() {
    return Optional.ofNullable(metadata);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<TestscriptStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code destination} attribute
   */
  @JsonProperty("destination")
  @Override
  public Optional<List<TestScript_Destination>> destination() {
    return Optional.ofNullable(destination);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code test} attribute
   */
  @JsonProperty("test")
  @Override
  public Optional<List<TestScript_Test>> test() {
    return Optional.ofNullable(test);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Optional<List<Reference>> profile() {
    return Optional.ofNullable(profile);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code variable} attribute
   */
  @JsonProperty("variable")
  @Override
  public Optional<List<TestScript_Variable>> variable() {
    return Optional.ofNullable(variable);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code fixture} attribute
   */
  @JsonProperty("fixture")
  @Override
  public Optional<List<TestScript_Fixture>> fixture() {
    return Optional.ofNullable(fixture);
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
   * @return The value of the {@code teardown} attribute
   */
  @JsonProperty("teardown")
  @Override
  public Optional<TestScript_Teardown> teardown() {
    return Optional.ofNullable(teardown);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code origin} attribute
   */
  @JsonProperty("origin")
  @Override
  public Optional<List<TestScript_Origin>> origin() {
    return Optional.ofNullable(origin);
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
   * @return The value of the {@code experimental} attribute
   */
  @JsonProperty("experimental")
  @Override
  public Optional<Boolean> experimental() {
    return Optional.ofNullable(experimental);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableTestScript(
        newValue,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableTestScript(
        value,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#setup() setup} attribute.
   * @param value The value for setup
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withSetup(TestScript_Setup value) {
    @Nullable TestScript_Setup newValue = Objects.requireNonNull(value, "setup");
    if (this.setup == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        newValue,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#setup() setup} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for setup
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withSetup(Optional<? extends TestScript_Setup> optional) {
    @Nullable TestScript_Setup value = optional.orElse(null);
    if (this.setup == value) return this;
    return new ImmutableTestScript(
        this.date,
        value,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        newValue,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        value,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#metadata() metadata} attribute.
   * @param value The value for metadata
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withMetadata(TestScript_Metadata value) {
    @Nullable TestScript_Metadata newValue = Objects.requireNonNull(value, "metadata");
    if (this.metadata == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        newValue,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#metadata() metadata} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for metadata
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withMetadata(Optional<? extends TestScript_Metadata> optional) {
    @Nullable TestScript_Metadata value = optional.orElse(null);
    if (this.metadata == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        value,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withStatus(TestscriptStatus value) {
    @Nullable TestscriptStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        newValue,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withStatus(Optional<? extends TestscriptStatus> optional) {
    @Nullable TestscriptStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        value,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        newValue,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        value,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withDestination(List<TestScript_Destination> value) {
    @Nullable List<TestScript_Destination> newValue = Objects.requireNonNull(value, "destination");
    if (this.destination == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        newValue,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#destination() destination} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withDestination(Optional<? extends List<TestScript_Destination>> optional) {
    @Nullable List<TestScript_Destination> value = optional.orElse(null);
    if (this.destination == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        value,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        newValue,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        value,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        newValue,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        value,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        newValue,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        value,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#test() test} attribute.
   * @param value The value for test
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withTest(List<TestScript_Test> value) {
    @Nullable List<TestScript_Test> newValue = Objects.requireNonNull(value, "test");
    if (this.test == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        newValue,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#test() test} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for test
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withTest(Optional<? extends List<TestScript_Test>> optional) {
    @Nullable List<TestScript_Test> value = optional.orElse(null);
    if (this.test == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        value,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        newValue,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        value,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        newValue,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        value,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        newValue,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        value,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestScript#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestScript withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        newValue,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withProfile(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        newValue,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withProfile(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        value,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        newValue,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        value,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        newValue,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        value,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        newValue,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        value,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#variable() variable} attribute.
   * @param value The value for variable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withVariable(List<TestScript_Variable> value) {
    @Nullable List<TestScript_Variable> newValue = Objects.requireNonNull(value, "variable");
    if (this.variable == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        newValue,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#variable() variable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withVariable(Optional<? extends List<TestScript_Variable>> optional) {
    @Nullable List<TestScript_Variable> value = optional.orElse(null);
    if (this.variable == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        value,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        newValue,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        value,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        newValue,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        value,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        newValue,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        value,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#fixture() fixture} attribute.
   * @param value The value for fixture
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withFixture(List<TestScript_Fixture> value) {
    @Nullable List<TestScript_Fixture> newValue = Objects.requireNonNull(value, "fixture");
    if (this.fixture == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        newValue,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#fixture() fixture} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fixture
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withFixture(Optional<? extends List<TestScript_Fixture>> optional) {
    @Nullable List<TestScript_Fixture> value = optional.orElse(null);
    if (this.fixture == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        value,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        newValue,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        value,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        newValue,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        value,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        newValue,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        value,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#teardown() teardown} attribute.
   * @param value The value for teardown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withTeardown(TestScript_Teardown value) {
    @Nullable TestScript_Teardown newValue = Objects.requireNonNull(value, "teardown");
    if (this.teardown == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        newValue,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#teardown() teardown} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for teardown
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withTeardown(Optional<? extends TestScript_Teardown> optional) {
    @Nullable TestScript_Teardown value = optional.orElse(null);
    if (this.teardown == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        value,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        newValue,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        value,
        this.origin,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#origin() origin} attribute.
   * @param value The value for origin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withOrigin(List<TestScript_Origin> value) {
    @Nullable List<TestScript_Origin> newValue = Objects.requireNonNull(value, "origin");
    if (this.origin == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        newValue,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#origin() origin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for origin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withOrigin(Optional<? extends List<TestScript_Origin>> optional) {
    @Nullable List<TestScript_Origin> value = optional.orElse(null);
    if (this.origin == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        value,
        this.extension,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        newValue,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        value,
        this.experimental,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        newValue,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        value,
        this.purpose);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.setup,
        this.modifierExtension,
        this.metadata,
        this.status,
        this.language,
        this.destination,
        this.contact,
        this.description,
        this.contained,
        this.test,
        this.text,
        this.url,
        this.jurisdiction,
        this.resourceType,
        this.profile,
        this.publisher,
        this.identifier,
        this.copyright,
        this.variable,
        this.id,
        this.meta,
        this.name,
        this.fixture,
        this.implicitRules,
        this.version,
        this.useContext,
        this.teardown,
        this.title,
        this.origin,
        this.extension,
        this.experimental,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript
        && equalTo((ImmutableTestScript) another);
  }

  private boolean equalTo(ImmutableTestScript another) {
    return Objects.equals(date, another.date)
        && Objects.equals(setup, another.setup)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(metadata, another.metadata)
        && Objects.equals(status, another.status)
        && Objects.equals(language, another.language)
        && Objects.equals(destination, another.destination)
        && Objects.equals(contact, another.contact)
        && Objects.equals(description, another.description)
        && Objects.equals(contained, another.contained)
        && Objects.equals(test, another.test)
        && Objects.equals(text, another.text)
        && Objects.equals(url, another.url)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && resourceType.equals(another.resourceType)
        && Objects.equals(profile, another.profile)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(variable, another.variable)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta)
        && Objects.equals(name, another.name)
        && Objects.equals(fixture, another.fixture)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(version, another.version)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(teardown, another.teardown)
        && Objects.equals(title, another.title)
        && Objects.equals(origin, another.origin)
        && Objects.equals(extension, another.extension)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(purpose, another.purpose);
  }

  /**
   * Computes a hash code from attributes: {@code date}, {@code setup}, {@code modifierExtension}, {@code metadata}, {@code status}, {@code language}, {@code destination}, {@code contact}, {@code description}, {@code contained}, {@code test}, {@code text}, {@code url}, {@code jurisdiction}, {@code resourceType}, {@code profile}, {@code publisher}, {@code identifier}, {@code copyright}, {@code variable}, {@code id}, {@code meta}, {@code name}, {@code fixture}, {@code implicitRules}, {@code version}, {@code useContext}, {@code teardown}, {@code title}, {@code origin}, {@code extension}, {@code experimental}, {@code purpose}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(setup);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(metadata);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(destination);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(test);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(variable);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(fixture);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(teardown);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(origin);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(purpose);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript{");
    if (date != null) {
      builder.append("date=").append(date);
    }
    if (setup != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("setup=").append(setup);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (metadata != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("metadata=").append(metadata);
    }
    if (status != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (destination != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (contact != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (description != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (contained != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (test != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("test=").append(test);
    }
    if (text != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (url != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (jurisdiction != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (profile != null) {
      builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (variable != null) {
      builder.append(", ");
      builder.append("variable=").append(variable);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (fixture != null) {
      builder.append(", ");
      builder.append("fixture=").append(fixture);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (teardown != null) {
      builder.append(", ");
      builder.append("teardown=").append(teardown);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (origin != null) {
      builder.append(", ");
      builder.append("origin=").append(origin);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestScript", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript {
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<TestScript_Setup> setup = Optional.empty();
    boolean setupIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<TestScript_Metadata> metadata = Optional.empty();
    boolean metadataIsSet;
    @Nullable Optional<TestscriptStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<TestScript_Destination>> destination = Optional.empty();
    boolean destinationIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<TestScript_Test>> test = Optional.empty();
    boolean testIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Reference>> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<List<TestScript_Variable>> variable = Optional.empty();
    boolean variableIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<TestScript_Fixture>> fixture = Optional.empty();
    boolean fixtureIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<TestScript_Teardown> teardown = Optional.empty();
    boolean teardownIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<TestScript_Origin>> origin = Optional.empty();
    boolean originIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("setup")
    public void setSetup(Optional<TestScript_Setup> setup) {
      this.setup = setup;
      this.setupIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("metadata")
    public void setMetadata(Optional<TestScript_Metadata> metadata) {
      this.metadata = metadata;
      this.metadataIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<TestscriptStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("destination")
    public void setDestination(Optional<List<TestScript_Destination>> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("test")
    public void setTest(Optional<List<TestScript_Test>> test) {
      this.test = test;
      this.testIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("profile")
    public void setProfile(Optional<List<Reference>> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("variable")
    public void setVariable(Optional<List<TestScript_Variable>> variable) {
      this.variable = variable;
      this.variableIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("fixture")
    public void setFixture(Optional<List<TestScript_Fixture>> fixture) {
      this.fixture = fixture;
      this.fixtureIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
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
    @JsonProperty("teardown")
    public void setTeardown(Optional<TestScript_Teardown> teardown) {
      this.teardown = teardown;
      this.teardownIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("origin")
    public void setOrigin(Optional<List<TestScript_Origin>> origin) {
      this.origin = origin;
      this.originIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestScript_Setup> setup() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestScript_Metadata> metadata() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestscriptStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TestScript_Destination>> destination() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TestScript_Test>> test() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TestScript_Variable>> variable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TestScript_Fixture>> fixture() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestScript_Teardown> teardown() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TestScript_Origin>> origin() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript fromJson(Json json) {
    ImmutableTestScript.Builder builder = ((ImmutableTestScript.Builder) ImmutableTestScript.builder());
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.setupIsSet) {
      builder.setup(json.setup);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.metadataIsSet) {
      builder.metadata(json.metadata);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.testIsSet) {
      builder.test(json.test);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.variableIsSet) {
      builder.variable(json.variable);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.fixtureIsSet) {
      builder.fixture(json.fixture);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.teardownIsSet) {
      builder.teardown(json.teardown);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.originIsSet) {
      builder.origin(json.origin);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    return (ImmutableTestScript) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript instance
   */
  public static TestScript copyOf(TestScript instance) {
    if (instance instanceof ImmutableTestScript) {
      return (ImmutableTestScript) instance;
    }
    return ((ImmutableTestScript.Builder) ImmutableTestScript.builder())
        .date(instance.date())
        .setup(instance.setup())
        .modifierExtension(instance.modifierExtension())
        .metadata(instance.metadata())
        .status(instance.status())
        .language(instance.language())
        .destination(instance.destination())
        .contact(instance.contact())
        .description(instance.description())
        .contained(instance.contained())
        .test(instance.test())
        .text(instance.text())
        .url(instance.url())
        .jurisdiction(instance.jurisdiction())
        .resourceType(instance.resourceType())
        .profile(instance.profile())
        .publisher(instance.publisher())
        .identifier(instance.identifier())
        .copyright(instance.copyright())
        .variable(instance.variable())
        .id(instance.id())
        .meta(instance.meta())
        .name(instance.name())
        .fixture(instance.fixture())
        .implicitRules(instance.implicitRules())
        .version(instance.version())
        .useContext(instance.useContext())
        .teardown(instance.teardown())
        .title(instance.title())
        .origin(instance.origin())
        .extension(instance.extension())
        .experimental(instance.experimental())
        .purpose(instance.purpose())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript TestScript}.
   * <pre>
   * ImmutableTestScript.builder()
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link TestScript#date() date}
   *    .setup(com.medplum.types.fhir.TestScript_Setup) // optional {@link TestScript#setup() setup}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestScript#modifierExtension() modifierExtension}
   *    .metadata(com.medplum.types.fhir.TestScript_Metadata) // optional {@link TestScript#metadata() metadata}
   *    .status(com.medplum.types.fhir.TestscriptStatus) // optional {@link TestScript#status() status}
   *    .language(com.medplum.types.fhir.Code) // optional {@link TestScript#language() language}
   *    .destination(List&amp;lt;com.medplum.types.fhir.TestScript_Destination&amp;gt;) // optional {@link TestScript#destination() destination}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link TestScript#contact() contact}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link TestScript#description() description}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link TestScript#contained() contained}
   *    .test(List&amp;lt;com.medplum.types.fhir.TestScript_Test&amp;gt;) // optional {@link TestScript#test() test}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link TestScript#text() text}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link TestScript#url() url}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link TestScript#jurisdiction() jurisdiction}
   *    .resourceType(String) // required {@link TestScript#resourceType() resourceType}
   *    .profile(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link TestScript#profile() profile}
   *    .publisher(String) // optional {@link TestScript#publisher() publisher}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link TestScript#identifier() identifier}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link TestScript#copyright() copyright}
   *    .variable(List&amp;lt;com.medplum.types.fhir.TestScript_Variable&amp;gt;) // optional {@link TestScript#variable() variable}
   *    .id(com.medplum.types.fhir.Id) // optional {@link TestScript#id() id}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link TestScript#meta() meta}
   *    .name(String) // optional {@link TestScript#name() name}
   *    .fixture(List&amp;lt;com.medplum.types.fhir.TestScript_Fixture&amp;gt;) // optional {@link TestScript#fixture() fixture}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link TestScript#implicitRules() implicitRules}
   *    .version(String) // optional {@link TestScript#version() version}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link TestScript#useContext() useContext}
   *    .teardown(com.medplum.types.fhir.TestScript_Teardown) // optional {@link TestScript#teardown() teardown}
   *    .title(String) // optional {@link TestScript#title() title}
   *    .origin(List&amp;lt;com.medplum.types.fhir.TestScript_Origin&amp;gt;) // optional {@link TestScript#origin() origin}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestScript#extension() extension}
   *    .experimental(Boolean) // optional {@link TestScript#experimental() experimental}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link TestScript#purpose() purpose}
   *    .build();
   * </pre>
   * @return A new TestScript builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableTestScript.Builder();
  }

  /**
   * Builds instances of type {@link TestScript TestScript}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestScript", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DATE = 0x1L;
    private static final long OPT_BIT_SETUP = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_METADATA = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_DESTINATION = 0x40L;
    private static final long OPT_BIT_CONTACT = 0x80L;
    private static final long OPT_BIT_DESCRIPTION = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_TEST = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_URL = 0x1000L;
    private static final long OPT_BIT_JURISDICTION = 0x2000L;
    private static final long OPT_BIT_PROFILE = 0x4000L;
    private static final long OPT_BIT_PUBLISHER = 0x8000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_COPYRIGHT = 0x20000L;
    private static final long OPT_BIT_VARIABLE = 0x40000L;
    private static final long OPT_BIT_ID = 0x80000L;
    private static final long OPT_BIT_META = 0x100000L;
    private static final long OPT_BIT_NAME = 0x200000L;
    private static final long OPT_BIT_FIXTURE = 0x400000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800000L;
    private static final long OPT_BIT_VERSION = 0x1000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x2000000L;
    private static final long OPT_BIT_TEARDOWN = 0x4000000L;
    private static final long OPT_BIT_TITLE = 0x8000000L;
    private static final long OPT_BIT_ORIGIN = 0x10000000L;
    private static final long OPT_BIT_EXTENSION = 0x20000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x40000000L;
    private static final long OPT_BIT_PURPOSE = 0x80000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable DateTime date;
    private @Nullable TestScript_Setup setup;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable TestScript_Metadata metadata;
    private @Nullable TestscriptStatus status;
    private @Nullable Code language;
    private @Nullable List<TestScript_Destination> destination;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Markdown description;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<TestScript_Test> test;
    private @Nullable Narrative text;
    private @Nullable Uri url;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable String resourceType;
    private @Nullable List<Reference> profile;
    private @Nullable String publisher;
    private @Nullable Identifier identifier;
    private @Nullable Markdown copyright;
    private @Nullable List<TestScript_Variable> variable;
    private @Nullable Id id;
    private @Nullable Meta meta;
    private @Nullable String name;
    private @Nullable List<TestScript_Fixture> fixture;
    private @Nullable Uri implicitRules;
    private @Nullable String version;
    private @Nullable List<UsageContext> useContext;
    private @Nullable TestScript_Teardown teardown;
    private @Nullable String title;
    private @Nullable List<TestScript_Origin> origin;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean experimental;
    private @Nullable Markdown purpose;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript#date() date} to date.
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
     * Initializes the optional value {@link TestScript#date() date} to date.
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
     * Initializes the optional value {@link TestScript#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for chained invocation
     */
    public final Builder setup(TestScript_Setup setup) {
      checkNotIsSet(setupIsSet(), "setup");
      this.setup = Objects.requireNonNull(setup, "setup");
      optBits |= OPT_BIT_SETUP;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("setup")
    public final Builder setup(Optional<? extends TestScript_Setup> setup) {
      checkNotIsSet(setupIsSet(), "setup");
      this.setup = setup.orElse(null);
      optBits |= OPT_BIT_SETUP;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript#metadata() metadata} to metadata.
     * @param metadata The value for metadata
     * @return {@code this} builder for chained invocation
     */
    public final Builder metadata(TestScript_Metadata metadata) {
      checkNotIsSet(metadataIsSet(), "metadata");
      this.metadata = Objects.requireNonNull(metadata, "metadata");
      optBits |= OPT_BIT_METADATA;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#metadata() metadata} to metadata.
     * @param metadata The value for metadata
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("metadata")
    public final Builder metadata(Optional<? extends TestScript_Metadata> metadata) {
      checkNotIsSet(metadataIsSet(), "metadata");
      this.metadata = metadata.orElse(null);
      optBits |= OPT_BIT_METADATA;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(TestscriptStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends TestscriptStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#language() language} to language.
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
     * Initializes the optional value {@link TestScript#language() language} to language.
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
     * Initializes the optional value {@link TestScript#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(List<TestScript_Destination> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = Objects.requireNonNull(destination, "destination");
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("destination")
    public final Builder destination(Optional<? extends List<TestScript_Destination>> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#contact() contact} to contact.
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
     * Initializes the optional value {@link TestScript#contact() contact} to contact.
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
     * Initializes the optional value {@link TestScript#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(Markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<? extends Markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#contained() contained} to contained.
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
     * Initializes the optional value {@link TestScript#contained() contained} to contained.
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
     * Initializes the optional value {@link TestScript#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for chained invocation
     */
    public final Builder test(List<TestScript_Test> test) {
      checkNotIsSet(testIsSet(), "test");
      this.test = Objects.requireNonNull(test, "test");
      optBits |= OPT_BIT_TEST;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("test")
    public final Builder test(Optional<? extends List<TestScript_Test>> test) {
      checkNotIsSet(testIsSet(), "test");
      this.test = test.orElse(null);
      optBits |= OPT_BIT_TEST;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#text() text} to text.
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
     * Initializes the optional value {@link TestScript#text() text} to text.
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
     * Initializes the optional value {@link TestScript#url() url} to url.
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
     * Initializes the optional value {@link TestScript#url() url} to url.
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
     * Initializes the optional value {@link TestScript#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link TestScript#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the value for the {@link TestScript#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link TestScript#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(List<Reference> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Optional<? extends List<Reference>> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link TestScript#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link TestScript#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link TestScript#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link TestScript#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for chained invocation
     */
    public final Builder variable(List<TestScript_Variable> variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = Objects.requireNonNull(variable, "variable");
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variable")
    public final Builder variable(Optional<? extends List<TestScript_Variable>> variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = variable.orElse(null);
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#id() id} to id.
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
     * Initializes the optional value {@link TestScript#id() id} to id.
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
     * Initializes the optional value {@link TestScript#meta() meta} to meta.
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
     * Initializes the optional value {@link TestScript#meta() meta} to meta.
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
     * Initializes the optional value {@link TestScript#name() name} to name.
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
     * Initializes the optional value {@link TestScript#name() name} to name.
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
     * Initializes the optional value {@link TestScript#fixture() fixture} to fixture.
     * @param fixture The value for fixture
     * @return {@code this} builder for chained invocation
     */
    public final Builder fixture(List<TestScript_Fixture> fixture) {
      checkNotIsSet(fixtureIsSet(), "fixture");
      this.fixture = Objects.requireNonNull(fixture, "fixture");
      optBits |= OPT_BIT_FIXTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#fixture() fixture} to fixture.
     * @param fixture The value for fixture
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fixture")
    public final Builder fixture(Optional<? extends List<TestScript_Fixture>> fixture) {
      checkNotIsSet(fixtureIsSet(), "fixture");
      this.fixture = fixture.orElse(null);
      optBits |= OPT_BIT_FIXTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link TestScript#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link TestScript#version() version} to version.
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
     * Initializes the optional value {@link TestScript#version() version} to version.
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
     * Initializes the optional value {@link TestScript#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link TestScript#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link TestScript#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for chained invocation
     */
    public final Builder teardown(TestScript_Teardown teardown) {
      checkNotIsSet(teardownIsSet(), "teardown");
      this.teardown = Objects.requireNonNull(teardown, "teardown");
      optBits |= OPT_BIT_TEARDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("teardown")
    public final Builder teardown(Optional<? extends TestScript_Teardown> teardown) {
      checkNotIsSet(teardownIsSet(), "teardown");
      this.teardown = teardown.orElse(null);
      optBits |= OPT_BIT_TEARDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    public final Builder origin(List<TestScript_Origin> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = Objects.requireNonNull(origin, "origin");
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("origin")
    public final Builder origin(Optional<? extends List<TestScript_Origin>> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = origin.orElse(null);
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link TestScript#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link TestScript#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link TestScript#purpose() purpose} to purpose.
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
     * Builds a new {@link TestScript TestScript}.
     * @return An immutable instance of TestScript
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript build() {
      checkRequiredAttributes();
      return new ImmutableTestScript(
          date,
          setup,
          modifierExtension,
          metadata,
          status,
          language,
          destination,
          contact,
          description,
          contained,
          test,
          text,
          url,
          jurisdiction,
          resourceType,
          profile,
          publisher,
          identifier,
          copyright,
          variable,
          id,
          meta,
          name,
          fixture,
          implicitRules,
          version,
          useContext,
          teardown,
          title,
          origin,
          extension,
          experimental,
          purpose);
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean setupIsSet() {
      return (optBits & OPT_BIT_SETUP) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean metadataIsSet() {
      return (optBits & OPT_BIT_METADATA) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean testIsSet() {
      return (optBits & OPT_BIT_TEST) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean variableIsSet() {
      return (optBits & OPT_BIT_VARIABLE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean fixtureIsSet() {
      return (optBits & OPT_BIT_FIXTURE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean teardownIsSet() {
      return (optBits & OPT_BIT_TEARDOWN) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean originIsSet() {
      return (optBits & OPT_BIT_ORIGIN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build TestScript, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "TestScript", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link TestScript#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "TestScript", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TestScript#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link TestScript#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link TestScript#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for chained invocation
     */
    BuildFinal setup(TestScript_Setup setup);

    /**
     * Initializes the optional value {@link TestScript#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal setup(Optional<? extends TestScript_Setup> setup);

    /**
     * Initializes the optional value {@link TestScript#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript#metadata() metadata} to metadata.
     * @param metadata The value for metadata
     * @return {@code this} builder for chained invocation
     */
    BuildFinal metadata(TestScript_Metadata metadata);

    /**
     * Initializes the optional value {@link TestScript#metadata() metadata} to metadata.
     * @param metadata The value for metadata
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal metadata(Optional<? extends TestScript_Metadata> metadata);

    /**
     * Initializes the optional value {@link TestScript#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(TestscriptStatus status);

    /**
     * Initializes the optional value {@link TestScript#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends TestscriptStatus> status);

    /**
     * Initializes the optional value {@link TestScript#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link TestScript#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link TestScript#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(List<TestScript_Destination> destination);

    /**
     * Initializes the optional value {@link TestScript#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(Optional<? extends List<TestScript_Destination>> destination);

    /**
     * Initializes the optional value {@link TestScript#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link TestScript#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link TestScript#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link TestScript#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link TestScript#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link TestScript#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link TestScript#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for chained invocation
     */
    BuildFinal test(List<TestScript_Test> test);

    /**
     * Initializes the optional value {@link TestScript#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal test(Optional<? extends List<TestScript_Test>> test);

    /**
     * Initializes the optional value {@link TestScript#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link TestScript#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link TestScript#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link TestScript#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link TestScript#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link TestScript#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link TestScript#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal profile(List<Reference> profile);

    /**
     * Initializes the optional value {@link TestScript#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal profile(Optional<? extends List<Reference>> profile);

    /**
     * Initializes the optional value {@link TestScript#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link TestScript#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link TestScript#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link TestScript#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link TestScript#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link TestScript#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link TestScript#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for chained invocation
     */
    BuildFinal variable(List<TestScript_Variable> variable);

    /**
     * Initializes the optional value {@link TestScript#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal variable(Optional<? extends List<TestScript_Variable>> variable);

    /**
     * Initializes the optional value {@link TestScript#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link TestScript#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link TestScript#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link TestScript#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link TestScript#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link TestScript#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link TestScript#fixture() fixture} to fixture.
     * @param fixture The value for fixture
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fixture(List<TestScript_Fixture> fixture);

    /**
     * Initializes the optional value {@link TestScript#fixture() fixture} to fixture.
     * @param fixture The value for fixture
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fixture(Optional<? extends List<TestScript_Fixture>> fixture);

    /**
     * Initializes the optional value {@link TestScript#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link TestScript#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link TestScript#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link TestScript#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link TestScript#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link TestScript#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link TestScript#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for chained invocation
     */
    BuildFinal teardown(TestScript_Teardown teardown);

    /**
     * Initializes the optional value {@link TestScript#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal teardown(Optional<? extends TestScript_Teardown> teardown);

    /**
     * Initializes the optional value {@link TestScript#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link TestScript#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link TestScript#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal origin(List<TestScript_Origin> origin);

    /**
     * Initializes the optional value {@link TestScript#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal origin(Optional<? extends List<TestScript_Origin>> origin);

    /**
     * Initializes the optional value {@link TestScript#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link TestScript#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link TestScript#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link TestScript#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link TestScript#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link TestScript#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Builds a new {@link TestScript TestScript}.
     * @return An immutable instance of TestScript
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TestScript build();
  }
}
