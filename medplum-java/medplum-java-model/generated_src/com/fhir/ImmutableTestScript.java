//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TestScript}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript.builder()}.
 */
@org.immutables.value.Generated(from = "TestScript", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript implements com.fhir.TestScript {
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable com.fhir.TestScript_Setup setup;
  private final @javax.annotation.Nullable com.fhir.TestScript_Metadata metadata;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Fixture> fixture;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.TestScript_Teardown teardown;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> profile;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Variable> variable;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Test> test;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Origin> origin;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Destination> destination;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.TestscriptStatus status;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;

  private ImmutableTestScript(
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable com.fhir.TestScript_Setup setup,
      @javax.annotation.Nullable com.fhir.TestScript_Metadata metadata,
      @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Fixture> fixture,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.TestScript_Teardown teardown,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> profile,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Variable> variable,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Test> test,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Origin> origin,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Destination> destination,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.TestscriptStatus status,
      @javax.annotation.Nullable com.fhir.markdown copyright) {
    this.date = date;
    this.purpose = purpose;
    this.identifier = identifier;
    this.setup = setup;
    this.metadata = metadata;
    this.fixture = fixture;
    this.meta = meta;
    this.useContext = useContext;
    this.resourceType = resourceType;
    this.teardown = teardown;
    this.language = language;
    this.title = title;
    this.modifierExtension = modifierExtension;
    this.url = url;
    this.contact = contact;
    this.publisher = publisher;
    this.profile = profile;
    this.implicitRules = implicitRules;
    this.variable = variable;
    this.version = version;
    this.description = description;
    this.name = name;
    this.test = test;
    this.experimental = experimental;
    this.jurisdiction = jurisdiction;
    this.contained = contained;
    this.origin = origin;
    this.text = text;
    this.destination = destination;
    this.id = id;
    this.extension = extension;
    this.status = status;
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
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<com.fhir.markdown> purpose() {
    return java.util.Optional.ofNullable(purpose);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code setup} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("setup")
  @Override
  public java.util.Optional<com.fhir.TestScript_Setup> setup() {
    return java.util.Optional.ofNullable(setup);
  }

  /**
   * @return The value of the {@code metadata} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("metadata")
  @Override
  public java.util.Optional<com.fhir.TestScript_Metadata> metadata() {
    return java.util.Optional.ofNullable(metadata);
  }

  /**
   * @return The value of the {@code fixture} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fixture")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TestScript_Fixture>> fixture() {
    return java.util.Optional.ofNullable(fixture);
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
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
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
   * @return The value of the {@code teardown} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("teardown")
  @Override
  public java.util.Optional<com.fhir.TestScript_Teardown> teardown() {
    return java.util.Optional.ofNullable(teardown);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
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
   * @return The value of the {@code profile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("profile")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> profile() {
    return java.util.Optional.ofNullable(profile);
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
   * @return The value of the {@code variable} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("variable")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TestScript_Variable>> variable() {
    return java.util.Optional.ofNullable(variable);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code test} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("test")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TestScript_Test>> test() {
    return java.util.Optional.ofNullable(test);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code origin} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("origin")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TestScript_Origin>> origin() {
    return java.util.Optional.ofNullable(origin);
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
   * @return The value of the {@code destination} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("destination")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TestScript_Destination>> destination() {
    return java.util.Optional.ofNullable(destination);
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
  public java.util.Optional<com.fhir.TestscriptStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableTestScript(
        newValue,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableTestScript(
        value,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        newValue,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableTestScript(
        this.date,
        value,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        newValue,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        value,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#setup() setup} attribute.
   * @param value The value for setup
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withSetup(com.fhir.TestScript_Setup value) {
    @javax.annotation.Nullable com.fhir.TestScript_Setup newValue = java.util.Objects.requireNonNull(value, "setup");
    if (this.setup == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        newValue,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#setup() setup} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for setup
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withSetup(java.util.Optional<? extends com.fhir.TestScript_Setup> optional) {
    @javax.annotation.Nullable com.fhir.TestScript_Setup value = optional.orElse(null);
    if (this.setup == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        value,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#metadata() metadata} attribute.
   * @param value The value for metadata
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withMetadata(com.fhir.TestScript_Metadata value) {
    @javax.annotation.Nullable com.fhir.TestScript_Metadata newValue = java.util.Objects.requireNonNull(value, "metadata");
    if (this.metadata == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        newValue,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#metadata() metadata} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for metadata
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withMetadata(java.util.Optional<? extends com.fhir.TestScript_Metadata> optional) {
    @javax.annotation.Nullable com.fhir.TestScript_Metadata value = optional.orElse(null);
    if (this.metadata == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        value,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#fixture() fixture} attribute.
   * @param value The value for fixture
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withFixture(java.util.List<com.fhir.TestScript_Fixture> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Fixture> newValue = java.util.Objects.requireNonNull(value, "fixture");
    if (this.fixture == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        newValue,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#fixture() fixture} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fixture
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withFixture(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Fixture>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Fixture> value = optional.orElse(null);
    if (this.fixture == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        value,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        newValue,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        value,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        newValue,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        value,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestScript#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestScript withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        newValue,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#teardown() teardown} attribute.
   * @param value The value for teardown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withTeardown(com.fhir.TestScript_Teardown value) {
    @javax.annotation.Nullable com.fhir.TestScript_Teardown newValue = java.util.Objects.requireNonNull(value, "teardown");
    if (this.teardown == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        newValue,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#teardown() teardown} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for teardown
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withTeardown(java.util.Optional<? extends com.fhir.TestScript_Teardown> optional) {
    @javax.annotation.Nullable com.fhir.TestScript_Teardown value = optional.orElse(null);
    if (this.teardown == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        value,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        newValue,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        value,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        newValue,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        value,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        newValue,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        value,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        newValue,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        value,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        newValue,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        value,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        newValue,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        value,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withProfile(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        newValue,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withProfile(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        value,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        newValue,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        value,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#variable() variable} attribute.
   * @param value The value for variable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withVariable(java.util.List<com.fhir.TestScript_Variable> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Variable> newValue = java.util.Objects.requireNonNull(value, "variable");
    if (this.variable == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        newValue,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#variable() variable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withVariable(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Variable>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Variable> value = optional.orElse(null);
    if (this.variable == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        value,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        newValue,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        value,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        newValue,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        value,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        newValue,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        value,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#test() test} attribute.
   * @param value The value for test
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withTest(java.util.List<com.fhir.TestScript_Test> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Test> newValue = java.util.Objects.requireNonNull(value, "test");
    if (this.test == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        newValue,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#test() test} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for test
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withTest(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Test>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Test> value = optional.orElse(null);
    if (this.test == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        value,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        newValue,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        value,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        newValue,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        value,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        newValue,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        value,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#origin() origin} attribute.
   * @param value The value for origin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withOrigin(java.util.List<com.fhir.TestScript_Origin> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Origin> newValue = java.util.Objects.requireNonNull(value, "origin");
    if (this.origin == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        newValue,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#origin() origin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for origin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withOrigin(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Origin>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Origin> value = optional.orElse(null);
    if (this.origin == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        value,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        newValue,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        value,
        this.destination,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withDestination(java.util.List<com.fhir.TestScript_Destination> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Destination> newValue = java.util.Objects.requireNonNull(value, "destination");
    if (this.destination == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        newValue,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#destination() destination} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withDestination(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Destination>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Destination> value = optional.orElse(null);
    if (this.destination == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        value,
        this.id,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        newValue,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        value,
        this.extension,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        newValue,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        value,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withStatus(com.fhir.TestscriptStatus value) {
    @javax.annotation.Nullable com.fhir.TestscriptStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        newValue,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withStatus(java.util.Optional<? extends com.fhir.TestscriptStatus> optional) {
    @javax.annotation.Nullable com.fhir.TestscriptStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        value,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableTestScript(
        this.date,
        this.purpose,
        this.identifier,
        this.setup,
        this.metadata,
        this.fixture,
        this.meta,
        this.useContext,
        this.resourceType,
        this.teardown,
        this.language,
        this.title,
        this.modifierExtension,
        this.url,
        this.contact,
        this.publisher,
        this.profile,
        this.implicitRules,
        this.variable,
        this.version,
        this.description,
        this.name,
        this.test,
        this.experimental,
        this.jurisdiction,
        this.contained,
        this.origin,
        this.text,
        this.destination,
        this.id,
        this.extension,
        this.status,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript
        && equalTo((ImmutableTestScript) another);
  }

  private boolean equalTo(ImmutableTestScript another) {
    return java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(setup, another.setup)
        && java.util.Objects.equals(metadata, another.metadata)
        && java.util.Objects.equals(fixture, another.fixture)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(useContext, another.useContext)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(teardown, another.teardown)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(profile, another.profile)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(variable, another.variable)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(test, another.test)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(origin, another.origin)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(destination, another.destination)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(copyright, another.copyright);
  }

  /**
   * Computes a hash code from attributes: {@code date}, {@code purpose}, {@code identifier}, {@code setup}, {@code metadata}, {@code fixture}, {@code meta}, {@code useContext}, {@code resourceType}, {@code teardown}, {@code language}, {@code title}, {@code modifierExtension}, {@code url}, {@code contact}, {@code publisher}, {@code profile}, {@code implicitRules}, {@code variable}, {@code version}, {@code description}, {@code name}, {@code test}, {@code experimental}, {@code jurisdiction}, {@code contained}, {@code origin}, {@code text}, {@code destination}, {@code id}, {@code extension}, {@code status}, {@code copyright}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(setup);
    h += (h << 5) + java.util.Objects.hashCode(metadata);
    h += (h << 5) + java.util.Objects.hashCode(fixture);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(teardown);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(profile);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(variable);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(test);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(origin);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(destination);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TestScript{");
    if (date != null) {
      builder.append("date=").append(date);
    }
    if (purpose != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (identifier != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (setup != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("setup=").append(setup);
    }
    if (metadata != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("metadata=").append(metadata);
    }
    if (fixture != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("fixture=").append(fixture);
    }
    if (meta != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (useContext != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (teardown != null) {
      builder.append(", ");
      builder.append("teardown=").append(teardown);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (profile != null) {
      builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (variable != null) {
      builder.append(", ");
      builder.append("variable=").append(variable);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (test != null) {
      builder.append(", ");
      builder.append("test=").append(test);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (origin != null) {
      builder.append(", ");
      builder.append("origin=").append(origin);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (destination != null) {
      builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
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
  @org.immutables.value.Generated(from = "TestScript", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TestScript {
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TestScript_Setup> setup = java.util.Optional.empty();
    boolean setupIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TestScript_Metadata> metadata = java.util.Optional.empty();
    boolean metadataIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TestScript_Fixture>> fixture = java.util.Optional.empty();
    boolean fixtureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TestScript_Teardown> teardown = java.util.Optional.empty();
    boolean teardownIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> profile = java.util.Optional.empty();
    boolean profileIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TestScript_Variable>> variable = java.util.Optional.empty();
    boolean variableIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TestScript_Test>> test = java.util.Optional.empty();
    boolean testIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TestScript_Origin>> origin = java.util.Optional.empty();
    boolean originIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TestScript_Destination>> destination = java.util.Optional.empty();
    boolean destinationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TestscriptStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("setup")
    public void setSetup(java.util.Optional<com.fhir.TestScript_Setup> setup) {
      this.setup = setup;
      this.setupIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    public void setMetadata(java.util.Optional<com.fhir.TestScript_Metadata> metadata) {
      this.metadata = metadata;
      this.metadataIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fixture")
    public void setFixture(java.util.Optional<java.util.List<com.fhir.TestScript_Fixture>> fixture) {
      this.fixture = fixture;
      this.fixtureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("teardown")
    public void setTeardown(java.util.Optional<com.fhir.TestScript_Teardown> teardown) {
      this.teardown = teardown;
      this.teardownIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(java.util.Optional<java.util.List<com.fhir.Reference>> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("variable")
    public void setVariable(java.util.Optional<java.util.List<com.fhir.TestScript_Variable>> variable) {
      this.variable = variable;
      this.variableIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("test")
    public void setTest(java.util.Optional<java.util.List<com.fhir.TestScript_Test>> test) {
      this.test = test;
      this.testIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    public void setOrigin(java.util.Optional<java.util.List<com.fhir.TestScript_Origin>> origin) {
      this.origin = origin;
      this.originIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public void setDestination(java.util.Optional<java.util.List<com.fhir.TestScript_Destination>> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.TestscriptStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TestScript_Setup> setup() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TestScript_Metadata> metadata() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TestScript_Fixture>> fixture() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TestScript_Teardown> teardown() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> profile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TestScript_Variable>> variable() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TestScript_Test>> test() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TestScript_Origin>> origin() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TestScript_Destination>> destination() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TestscriptStatus> status() { throw new UnsupportedOperationException(); }
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
  static ImmutableTestScript fromJson(Json json) {
    ImmutableTestScript.Builder builder = ((ImmutableTestScript.Builder) ImmutableTestScript.builder());
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.setupIsSet) {
      builder.setup(json.setup);
    }
    if (json.metadataIsSet) {
      builder.metadata(json.metadata);
    }
    if (json.fixtureIsSet) {
      builder.fixture(json.fixture);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.teardownIsSet) {
      builder.teardown(json.teardown);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.variableIsSet) {
      builder.variable(json.variable);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.testIsSet) {
      builder.test(json.test);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.originIsSet) {
      builder.origin(json.origin);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
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
        .purpose(instance.purpose())
        .identifier(instance.identifier())
        .setup(instance.setup())
        .metadata(instance.metadata())
        .fixture(instance.fixture())
        .meta(instance.meta())
        .useContext(instance.useContext())
        .resourceType(instance.resourceType())
        .teardown(instance.teardown())
        .language(instance.language())
        .title(instance.title())
        .modifierExtension(instance.modifierExtension())
        .url(instance.url())
        .contact(instance.contact())
        .publisher(instance.publisher())
        .profile(instance.profile())
        .implicitRules(instance.implicitRules())
        .variable(instance.variable())
        .version(instance.version())
        .description(instance.description())
        .name(instance.name())
        .test(instance.test())
        .experimental(instance.experimental())
        .jurisdiction(instance.jurisdiction())
        .contained(instance.contained())
        .origin(instance.origin())
        .text(instance.text())
        .destination(instance.destination())
        .id(instance.id())
        .extension(instance.extension())
        .status(instance.status())
        .copyright(instance.copyright())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript TestScript}.
   * <pre>
   * ImmutableTestScript.builder()
   *    .date(com.fhir.dateTime) // optional {@link TestScript#date() date}
   *    .purpose(com.fhir.markdown) // optional {@link TestScript#purpose() purpose}
   *    .identifier(com.fhir.Identifier) // optional {@link TestScript#identifier() identifier}
   *    .setup(com.fhir.TestScript_Setup) // optional {@link TestScript#setup() setup}
   *    .metadata(com.fhir.TestScript_Metadata) // optional {@link TestScript#metadata() metadata}
   *    .fixture(List&amp;lt;com.fhir.TestScript_Fixture&amp;gt;) // optional {@link TestScript#fixture() fixture}
   *    .meta(com.fhir.Meta) // optional {@link TestScript#meta() meta}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link TestScript#useContext() useContext}
   *    .resourceType(String) // required {@link TestScript#resourceType() resourceType}
   *    .teardown(com.fhir.TestScript_Teardown) // optional {@link TestScript#teardown() teardown}
   *    .language(com.fhir.code) // optional {@link TestScript#language() language}
   *    .title(String) // optional {@link TestScript#title() title}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript#modifierExtension() modifierExtension}
   *    .url(com.fhir.uri) // optional {@link TestScript#url() url}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link TestScript#contact() contact}
   *    .publisher(String) // optional {@link TestScript#publisher() publisher}
   *    .profile(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link TestScript#profile() profile}
   *    .implicitRules(com.fhir.uri) // optional {@link TestScript#implicitRules() implicitRules}
   *    .variable(List&amp;lt;com.fhir.TestScript_Variable&amp;gt;) // optional {@link TestScript#variable() variable}
   *    .version(String) // optional {@link TestScript#version() version}
   *    .description(com.fhir.markdown) // optional {@link TestScript#description() description}
   *    .name(String) // optional {@link TestScript#name() name}
   *    .test(List&amp;lt;com.fhir.TestScript_Test&amp;gt;) // optional {@link TestScript#test() test}
   *    .experimental(Boolean) // optional {@link TestScript#experimental() experimental}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link TestScript#jurisdiction() jurisdiction}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link TestScript#contained() contained}
   *    .origin(List&amp;lt;com.fhir.TestScript_Origin&amp;gt;) // optional {@link TestScript#origin() origin}
   *    .text(com.fhir.Narrative) // optional {@link TestScript#text() text}
   *    .destination(List&amp;lt;com.fhir.TestScript_Destination&amp;gt;) // optional {@link TestScript#destination() destination}
   *    .id(com.fhir.id) // optional {@link TestScript#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript#extension() extension}
   *    .status(com.fhir.TestscriptStatus) // optional {@link TestScript#status() status}
   *    .copyright(com.fhir.markdown) // optional {@link TestScript#copyright() copyright}
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
  @org.immutables.value.Generated(from = "TestScript", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DATE = 0x1L;
    private static final long OPT_BIT_PURPOSE = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_SETUP = 0x8L;
    private static final long OPT_BIT_METADATA = 0x10L;
    private static final long OPT_BIT_FIXTURE = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_USE_CONTEXT = 0x80L;
    private static final long OPT_BIT_TEARDOWN = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_TITLE = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_URL = 0x1000L;
    private static final long OPT_BIT_CONTACT = 0x2000L;
    private static final long OPT_BIT_PUBLISHER = 0x4000L;
    private static final long OPT_BIT_PROFILE = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private static final long OPT_BIT_VARIABLE = 0x20000L;
    private static final long OPT_BIT_VERSION = 0x40000L;
    private static final long OPT_BIT_DESCRIPTION = 0x80000L;
    private static final long OPT_BIT_NAME = 0x100000L;
    private static final long OPT_BIT_TEST = 0x200000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x400000L;
    private static final long OPT_BIT_JURISDICTION = 0x800000L;
    private static final long OPT_BIT_CONTAINED = 0x1000000L;
    private static final long OPT_BIT_ORIGIN = 0x2000000L;
    private static final long OPT_BIT_TEXT = 0x4000000L;
    private static final long OPT_BIT_DESTINATION = 0x8000000L;
    private static final long OPT_BIT_ID = 0x10000000L;
    private static final long OPT_BIT_EXTENSION = 0x20000000L;
    private static final long OPT_BIT_STATUS = 0x40000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x80000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable com.fhir.TestScript_Setup setup;
    private @javax.annotation.Nullable com.fhir.TestScript_Metadata metadata;
    private @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Fixture> fixture;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.TestScript_Teardown teardown;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> profile;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Variable> variable;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Test> test;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Origin> origin;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.TestScript_Destination> destination;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.TestscriptStatus status;
    private @javax.annotation.Nullable com.fhir.markdown copyright;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript#date() date} to date.
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
     * Initializes the optional value {@link TestScript#date() date} to date.
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
     * Initializes the optional value {@link TestScript#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link TestScript#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link TestScript#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for chained invocation
     */
    public final Builder setup(com.fhir.TestScript_Setup setup) {
      checkNotIsSet(setupIsSet(), "setup");
      this.setup = java.util.Objects.requireNonNull(setup, "setup");
      optBits |= OPT_BIT_SETUP;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("setup")
    public final Builder setup(java.util.Optional<? extends com.fhir.TestScript_Setup> setup) {
      checkNotIsSet(setupIsSet(), "setup");
      this.setup = setup.orElse(null);
      optBits |= OPT_BIT_SETUP;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#metadata() metadata} to metadata.
     * @param metadata The value for metadata
     * @return {@code this} builder for chained invocation
     */
    public final Builder metadata(com.fhir.TestScript_Metadata metadata) {
      checkNotIsSet(metadataIsSet(), "metadata");
      this.metadata = java.util.Objects.requireNonNull(metadata, "metadata");
      optBits |= OPT_BIT_METADATA;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#metadata() metadata} to metadata.
     * @param metadata The value for metadata
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    public final Builder metadata(java.util.Optional<? extends com.fhir.TestScript_Metadata> metadata) {
      checkNotIsSet(metadataIsSet(), "metadata");
      this.metadata = metadata.orElse(null);
      optBits |= OPT_BIT_METADATA;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#fixture() fixture} to fixture.
     * @param fixture The value for fixture
     * @return {@code this} builder for chained invocation
     */
    public final Builder fixture(java.util.List<com.fhir.TestScript_Fixture> fixture) {
      checkNotIsSet(fixtureIsSet(), "fixture");
      this.fixture = java.util.Objects.requireNonNull(fixture, "fixture");
      optBits |= OPT_BIT_FIXTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#fixture() fixture} to fixture.
     * @param fixture The value for fixture
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fixture")
    public final Builder fixture(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Fixture>> fixture) {
      checkNotIsSet(fixtureIsSet(), "fixture");
      this.fixture = fixture.orElse(null);
      optBits |= OPT_BIT_FIXTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#meta() meta} to meta.
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
     * Initializes the optional value {@link TestScript#meta() meta} to meta.
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
     * Initializes the optional value {@link TestScript#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link TestScript#useContext() useContext} to useContext.
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
     * Initializes the value for the {@link TestScript#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link TestScript#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for chained invocation
     */
    public final Builder teardown(com.fhir.TestScript_Teardown teardown) {
      checkNotIsSet(teardownIsSet(), "teardown");
      this.teardown = java.util.Objects.requireNonNull(teardown, "teardown");
      optBits |= OPT_BIT_TEARDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("teardown")
    public final Builder teardown(java.util.Optional<? extends com.fhir.TestScript_Teardown> teardown) {
      checkNotIsSet(teardownIsSet(), "teardown");
      this.teardown = teardown.orElse(null);
      optBits |= OPT_BIT_TEARDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#language() language} to language.
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
     * Initializes the optional value {@link TestScript#language() language} to language.
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
     * Initializes the optional value {@link TestScript#title() title} to title.
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
     * Initializes the optional value {@link TestScript#title() title} to title.
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
     * Initializes the optional value {@link TestScript#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript#url() url} to url.
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
     * Initializes the optional value {@link TestScript#url() url} to url.
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
     * Initializes the optional value {@link TestScript#contact() contact} to contact.
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
     * Initializes the optional value {@link TestScript#contact() contact} to contact.
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
     * Initializes the optional value {@link TestScript#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link TestScript#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link TestScript#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(java.util.List<com.fhir.Reference> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = java.util.Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public final Builder profile(java.util.Optional<? extends java.util.List<com.fhir.Reference>> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link TestScript#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link TestScript#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for chained invocation
     */
    public final Builder variable(java.util.List<com.fhir.TestScript_Variable> variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = java.util.Objects.requireNonNull(variable, "variable");
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("variable")
    public final Builder variable(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Variable>> variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = variable.orElse(null);
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#version() version} to version.
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
     * Initializes the optional value {@link TestScript#version() version} to version.
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
     * Initializes the optional value {@link TestScript#description() description} to description.
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
     * Initializes the optional value {@link TestScript#description() description} to description.
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
     * Initializes the optional value {@link TestScript#name() name} to name.
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
     * Initializes the optional value {@link TestScript#name() name} to name.
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
     * Initializes the optional value {@link TestScript#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for chained invocation
     */
    public final Builder test(java.util.List<com.fhir.TestScript_Test> test) {
      checkNotIsSet(testIsSet(), "test");
      this.test = java.util.Objects.requireNonNull(test, "test");
      optBits |= OPT_BIT_TEST;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("test")
    public final Builder test(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Test>> test) {
      checkNotIsSet(testIsSet(), "test");
      this.test = test.orElse(null);
      optBits |= OPT_BIT_TEST;
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
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public final Builder experimental(java.util.Optional<java.lang.Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link TestScript#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link TestScript#contained() contained} to contained.
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
     * Initializes the optional value {@link TestScript#contained() contained} to contained.
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
     * Initializes the optional value {@link TestScript#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    public final Builder origin(java.util.List<com.fhir.TestScript_Origin> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = java.util.Objects.requireNonNull(origin, "origin");
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    public final Builder origin(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Origin>> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = origin.orElse(null);
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#text() text} to text.
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
     * Initializes the optional value {@link TestScript#text() text} to text.
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
     * Initializes the optional value {@link TestScript#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(java.util.List<com.fhir.TestScript_Destination> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = java.util.Objects.requireNonNull(destination, "destination");
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public final Builder destination(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Destination>> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#id() id} to id.
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
     * Initializes the optional value {@link TestScript#id() id} to id.
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
     * Initializes the optional value {@link TestScript#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.TestscriptStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.TestscriptStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link TestScript#copyright() copyright} to copyright.
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
     * Builds a new {@link TestScript TestScript}.
     * @return An immutable instance of TestScript
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TestScript build() {
      checkRequiredAttributes();
      return new ImmutableTestScript(
          date,
          purpose,
          identifier,
          setup,
          metadata,
          fixture,
          meta,
          useContext,
          resourceType,
          teardown,
          language,
          title,
          modifierExtension,
          url,
          contact,
          publisher,
          profile,
          implicitRules,
          variable,
          version,
          description,
          name,
          test,
          experimental,
          jurisdiction,
          contained,
          origin,
          text,
          destination,
          id,
          extension,
          status,
          copyright);
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean setupIsSet() {
      return (optBits & OPT_BIT_SETUP) != 0;
    }

    private boolean metadataIsSet() {
      return (optBits & OPT_BIT_METADATA) != 0;
    }

    private boolean fixtureIsSet() {
      return (optBits & OPT_BIT_FIXTURE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean teardownIsSet() {
      return (optBits & OPT_BIT_TEARDOWN) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean variableIsSet() {
      return (optBits & OPT_BIT_VARIABLE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean testIsSet() {
      return (optBits & OPT_BIT_TEST) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean originIsSet() {
      return (optBits & OPT_BIT_ORIGIN) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TestScript is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build TestScript, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "TestScript", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link TestScript#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "TestScript", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TestScript#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link TestScript#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link TestScript#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link TestScript#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link TestScript#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link TestScript#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link TestScript#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for chained invocation
     */
    BuildFinal setup(com.fhir.TestScript_Setup setup);

    /**
     * Initializes the optional value {@link TestScript#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal setup(java.util.Optional<? extends com.fhir.TestScript_Setup> setup);

    /**
     * Initializes the optional value {@link TestScript#metadata() metadata} to metadata.
     * @param metadata The value for metadata
     * @return {@code this} builder for chained invocation
     */
    BuildFinal metadata(com.fhir.TestScript_Metadata metadata);

    /**
     * Initializes the optional value {@link TestScript#metadata() metadata} to metadata.
     * @param metadata The value for metadata
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal metadata(java.util.Optional<? extends com.fhir.TestScript_Metadata> metadata);

    /**
     * Initializes the optional value {@link TestScript#fixture() fixture} to fixture.
     * @param fixture The value for fixture
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fixture(java.util.List<com.fhir.TestScript_Fixture> fixture);

    /**
     * Initializes the optional value {@link TestScript#fixture() fixture} to fixture.
     * @param fixture The value for fixture
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fixture(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Fixture>> fixture);

    /**
     * Initializes the optional value {@link TestScript#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link TestScript#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link TestScript#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link TestScript#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link TestScript#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for chained invocation
     */
    BuildFinal teardown(com.fhir.TestScript_Teardown teardown);

    /**
     * Initializes the optional value {@link TestScript#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal teardown(java.util.Optional<? extends com.fhir.TestScript_Teardown> teardown);

    /**
     * Initializes the optional value {@link TestScript#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link TestScript#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link TestScript#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link TestScript#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link TestScript#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link TestScript#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link TestScript#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link TestScript#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link TestScript#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link TestScript#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link TestScript#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal profile(java.util.List<com.fhir.Reference> profile);

    /**
     * Initializes the optional value {@link TestScript#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal profile(java.util.Optional<? extends java.util.List<com.fhir.Reference>> profile);

    /**
     * Initializes the optional value {@link TestScript#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link TestScript#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link TestScript#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for chained invocation
     */
    BuildFinal variable(java.util.List<com.fhir.TestScript_Variable> variable);

    /**
     * Initializes the optional value {@link TestScript#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal variable(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Variable>> variable);

    /**
     * Initializes the optional value {@link TestScript#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link TestScript#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link TestScript#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link TestScript#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link TestScript#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link TestScript#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link TestScript#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for chained invocation
     */
    BuildFinal test(java.util.List<com.fhir.TestScript_Test> test);

    /**
     * Initializes the optional value {@link TestScript#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal test(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Test>> test);

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
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link TestScript#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link TestScript#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link TestScript#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link TestScript#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link TestScript#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal origin(java.util.List<com.fhir.TestScript_Origin> origin);

    /**
     * Initializes the optional value {@link TestScript#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal origin(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Origin>> origin);

    /**
     * Initializes the optional value {@link TestScript#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link TestScript#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link TestScript#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(java.util.List<com.fhir.TestScript_Destination> destination);

    /**
     * Initializes the optional value {@link TestScript#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(java.util.Optional<? extends java.util.List<com.fhir.TestScript_Destination>> destination);

    /**
     * Initializes the optional value {@link TestScript#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link TestScript#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link TestScript#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link TestScript#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link TestScript#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.TestscriptStatus status);

    /**
     * Initializes the optional value {@link TestScript#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.TestscriptStatus> status);

    /**
     * Initializes the optional value {@link TestScript#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link TestScript#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Builds a new {@link TestScript TestScript}.
     * @return An immutable instance of TestScript
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TestScript build();
  }
}