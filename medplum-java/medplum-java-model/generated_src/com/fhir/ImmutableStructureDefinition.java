//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link StructureDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "StructureDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureDefinition implements com.fhir.StructureDefinition {
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Mapping> mapping;
  private final @javax.annotation.Nullable com.fhir.StructuredefinitionKind kind;
  private final @javax.annotation.Nullable java.lang.Boolean _abstract;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.uri type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable com.fhir.StructuredefinitionDerivation derivation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> contextInvariant;
  private final @javax.annotation.Nullable com.fhir.StructureDefinition_Differential differential;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable com.fhir.StructuredefinitionStatus status;
  private final @javax.annotation.Nullable com.fhir.StructuredefinitionFhirversion fhirVersion;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coding> keyword;
  private final @javax.annotation.Nullable com.fhir.StructureDefinition_Snapshot snapshot;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Context> context;
  private final @javax.annotation.Nullable com.fhir.canonical baseDefinition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;

  private ImmutableStructureDefinition(
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Mapping> mapping,
      @javax.annotation.Nullable com.fhir.StructuredefinitionKind kind,
      @javax.annotation.Nullable java.lang.Boolean _abstract,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.uri type,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable com.fhir.StructuredefinitionDerivation derivation,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<java.lang.String> contextInvariant,
      @javax.annotation.Nullable com.fhir.StructureDefinition_Differential differential,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable com.fhir.StructuredefinitionStatus status,
      @javax.annotation.Nullable com.fhir.StructuredefinitionFhirversion fhirVersion,
      @javax.annotation.Nullable java.util.List<com.fhir.Coding> keyword,
      @javax.annotation.Nullable com.fhir.StructureDefinition_Snapshot snapshot,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Context> context,
      @javax.annotation.Nullable com.fhir.canonical baseDefinition,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Boolean experimental) {
    this.name = name;
    this.date = date;
    this.description = description;
    this.implicitRules = implicitRules;
    this.mapping = mapping;
    this.kind = kind;
    this._abstract = _abstract;
    this.title = title;
    this.purpose = purpose;
    this.id = id;
    this.meta = meta;
    this.copyright = copyright;
    this.text = text;
    this.type = type;
    this.identifier = identifier;
    this.url = url;
    this.derivation = derivation;
    this.contact = contact;
    this.publisher = publisher;
    this.contextInvariant = contextInvariant;
    this.differential = differential;
    this.contained = contained;
    this.version = version;
    this.status = status;
    this.fhirVersion = fhirVersion;
    this.keyword = keyword;
    this.snapshot = snapshot;
    this.jurisdiction = jurisdiction;
    this.context = context;
    this.baseDefinition = baseDefinition;
    this.modifierExtension = modifierExtension;
    this.useContext = useContext;
    this.resourceType = resourceType;
    this.language = language;
    this.extension = extension;
    this.experimental = experimental;
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code mapping} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mapping")
  @Override
  public java.util.Optional<java.util.List<com.fhir.StructureDefinition_Mapping>> mapping() {
    return java.util.Optional.ofNullable(mapping);
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kind")
  @Override
  public java.util.Optional<com.fhir.StructuredefinitionKind> kind() {
    return java.util.Optional.ofNullable(kind);
  }

  /**
   * @return The value of the {@code _abstract} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("abstract")
  @Override
  public java.util.Optional<java.lang.Boolean> _abstract() {
    return java.util.Optional.ofNullable(_abstract);
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
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<com.fhir.markdown> purpose() {
    return java.util.Optional.ofNullable(purpose);
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
   * @return The value of the {@code copyright} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("copyright")
  @Override
  public java.util.Optional<com.fhir.markdown> copyright() {
    return java.util.Optional.ofNullable(copyright);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.uri> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code derivation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("derivation")
  @Override
  public java.util.Optional<com.fhir.StructuredefinitionDerivation> derivation() {
    return java.util.Optional.ofNullable(derivation);
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
   * @return The value of the {@code contextInvariant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contextInvariant")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> contextInvariant() {
    return java.util.Optional.ofNullable(contextInvariant);
  }

  /**
   * @return The value of the {@code differential} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("differential")
  @Override
  public java.util.Optional<com.fhir.StructureDefinition_Differential> differential() {
    return java.util.Optional.ofNullable(differential);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.StructuredefinitionStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code fhirVersion} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
  @Override
  public java.util.Optional<com.fhir.StructuredefinitionFhirversion> fhirVersion() {
    return java.util.Optional.ofNullable(fhirVersion);
  }

  /**
   * @return The value of the {@code keyword} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("keyword")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coding>> keyword() {
    return java.util.Optional.ofNullable(keyword);
  }

  /**
   * @return The value of the {@code snapshot} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("snapshot")
  @Override
  public java.util.Optional<com.fhir.StructureDefinition_Snapshot> snapshot() {
    return java.util.Optional.ofNullable(snapshot);
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
   * @return The value of the {@code context} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("context")
  @Override
  public java.util.Optional<java.util.List<com.fhir.StructureDefinition_Context>> context() {
    return java.util.Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code baseDefinition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("baseDefinition")
  @Override
  public java.util.Optional<com.fhir.canonical> baseDefinition() {
    return java.util.Optional.ofNullable(baseDefinition);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableStructureDefinition(
        newValue,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableStructureDefinition(
        value,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        newValue,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        value,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        newValue,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        value,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        newValue,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        value,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#mapping() mapping} attribute.
   * @param value The value for mapping
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withMapping(java.util.List<com.fhir.StructureDefinition_Mapping> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Mapping> newValue = java.util.Objects.requireNonNull(value, "mapping");
    if (this.mapping == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        newValue,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#mapping() mapping} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mapping
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withMapping(java.util.Optional<? extends java.util.List<com.fhir.StructureDefinition_Mapping>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Mapping> value = optional.orElse(null);
    if (this.mapping == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        value,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withKind(com.fhir.StructuredefinitionKind value) {
    @javax.annotation.Nullable com.fhir.StructuredefinitionKind newValue = java.util.Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        newValue,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withKind(java.util.Optional<? extends com.fhir.StructuredefinitionKind> optional) {
    @javax.annotation.Nullable com.fhir.StructuredefinitionKind value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        value,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#_abstract() _abstract} attribute.
   * @param value The value for _abstract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition with_abstract(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this._abstract, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        newValue,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#_abstract() _abstract} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _abstract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition with_abstract(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this._abstract, value)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        value,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        newValue,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        value,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        newValue,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        value,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        newValue,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        value,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        newValue,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        value,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        newValue,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        value,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        newValue,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        value,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withType(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        newValue,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withType(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        value,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        newValue,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        value,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        newValue,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        value,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#derivation() derivation} attribute.
   * @param value The value for derivation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withDerivation(com.fhir.StructuredefinitionDerivation value) {
    @javax.annotation.Nullable com.fhir.StructuredefinitionDerivation newValue = java.util.Objects.requireNonNull(value, "derivation");
    if (this.derivation == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        newValue,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#derivation() derivation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withDerivation(java.util.Optional<? extends com.fhir.StructuredefinitionDerivation> optional) {
    @javax.annotation.Nullable com.fhir.StructuredefinitionDerivation value = optional.orElse(null);
    if (this.derivation == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        value,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        newValue,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        value,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        newValue,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        value,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#contextInvariant() contextInvariant} attribute.
   * @param value The value for contextInvariant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withContextInvariant(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "contextInvariant");
    if (this.contextInvariant == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        newValue,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#contextInvariant() contextInvariant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contextInvariant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withContextInvariant(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.contextInvariant == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        value,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#differential() differential} attribute.
   * @param value The value for differential
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withDifferential(com.fhir.StructureDefinition_Differential value) {
    @javax.annotation.Nullable com.fhir.StructureDefinition_Differential newValue = java.util.Objects.requireNonNull(value, "differential");
    if (this.differential == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        newValue,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#differential() differential} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for differential
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withDifferential(java.util.Optional<? extends com.fhir.StructureDefinition_Differential> optional) {
    @javax.annotation.Nullable com.fhir.StructureDefinition_Differential value = optional.orElse(null);
    if (this.differential == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        value,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        newValue,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        value,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        newValue,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        value,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withStatus(com.fhir.StructuredefinitionStatus value) {
    @javax.annotation.Nullable com.fhir.StructuredefinitionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        newValue,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withStatus(java.util.Optional<? extends com.fhir.StructuredefinitionStatus> optional) {
    @javax.annotation.Nullable com.fhir.StructuredefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        value,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#fhirVersion() fhirVersion} attribute.
   * @param value The value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withFhirVersion(com.fhir.StructuredefinitionFhirversion value) {
    @javax.annotation.Nullable com.fhir.StructuredefinitionFhirversion newValue = java.util.Objects.requireNonNull(value, "fhirVersion");
    if (this.fhirVersion == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        newValue,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#fhirVersion() fhirVersion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withFhirVersion(java.util.Optional<? extends com.fhir.StructuredefinitionFhirversion> optional) {
    @javax.annotation.Nullable com.fhir.StructuredefinitionFhirversion value = optional.orElse(null);
    if (this.fhirVersion == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        value,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#keyword() keyword} attribute.
   * @param value The value for keyword
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withKeyword(java.util.List<com.fhir.Coding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> newValue = java.util.Objects.requireNonNull(value, "keyword");
    if (this.keyword == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        newValue,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#keyword() keyword} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for keyword
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withKeyword(java.util.Optional<? extends java.util.List<com.fhir.Coding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> value = optional.orElse(null);
    if (this.keyword == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        value,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#snapshot() snapshot} attribute.
   * @param value The value for snapshot
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withSnapshot(com.fhir.StructureDefinition_Snapshot value) {
    @javax.annotation.Nullable com.fhir.StructureDefinition_Snapshot newValue = java.util.Objects.requireNonNull(value, "snapshot");
    if (this.snapshot == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        newValue,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#snapshot() snapshot} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for snapshot
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withSnapshot(java.util.Optional<? extends com.fhir.StructureDefinition_Snapshot> optional) {
    @javax.annotation.Nullable com.fhir.StructureDefinition_Snapshot value = optional.orElse(null);
    if (this.snapshot == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        value,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        newValue,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        value,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withContext(java.util.List<com.fhir.StructureDefinition_Context> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Context> newValue = java.util.Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        newValue,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withContext(java.util.Optional<? extends java.util.List<com.fhir.StructureDefinition_Context>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Context> value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        value,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#baseDefinition() baseDefinition} attribute.
   * @param value The value for baseDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withBaseDefinition(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "baseDefinition");
    if (this.baseDefinition == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        newValue,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#baseDefinition() baseDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for baseDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withBaseDefinition(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.baseDefinition == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        value,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        newValue,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        value,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        newValue,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        value,
        this.resourceType,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StructureDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStructureDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        newValue,
        this.language,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        newValue,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        value,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        newValue,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        value,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableStructureDefinition(
        this.name,
        this.date,
        this.description,
        this.implicitRules,
        this.mapping,
        this.kind,
        this._abstract,
        this.title,
        this.purpose,
        this.id,
        this.meta,
        this.copyright,
        this.text,
        this.type,
        this.identifier,
        this.url,
        this.derivation,
        this.contact,
        this.publisher,
        this.contextInvariant,
        this.differential,
        this.contained,
        this.version,
        this.status,
        this.fhirVersion,
        this.keyword,
        this.snapshot,
        this.jurisdiction,
        this.context,
        this.baseDefinition,
        this.modifierExtension,
        this.useContext,
        this.resourceType,
        this.language,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureDefinition
        && equalTo((ImmutableStructureDefinition) another);
  }

  private boolean equalTo(ImmutableStructureDefinition another) {
    return java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(mapping, another.mapping)
        && java.util.Objects.equals(kind, another.kind)
        && java.util.Objects.equals(_abstract, another._abstract)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(derivation, another.derivation)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(contextInvariant, another.contextInvariant)
        && java.util.Objects.equals(differential, another.differential)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(fhirVersion, another.fhirVersion)
        && java.util.Objects.equals(keyword, another.keyword)
        && java.util.Objects.equals(snapshot, another.snapshot)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(context, another.context)
        && java.util.Objects.equals(baseDefinition, another.baseDefinition)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(useContext, another.useContext)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(experimental, another.experimental);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code date}, {@code description}, {@code implicitRules}, {@code mapping}, {@code kind}, {@code _abstract}, {@code title}, {@code purpose}, {@code id}, {@code meta}, {@code copyright}, {@code text}, {@code type}, {@code identifier}, {@code url}, {@code derivation}, {@code contact}, {@code publisher}, {@code contextInvariant}, {@code differential}, {@code contained}, {@code version}, {@code status}, {@code fhirVersion}, {@code keyword}, {@code snapshot}, {@code jurisdiction}, {@code context}, {@code baseDefinition}, {@code modifierExtension}, {@code useContext}, {@code resourceType}, {@code language}, {@code extension}, {@code experimental}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(mapping);
    h += (h << 5) + java.util.Objects.hashCode(kind);
    h += (h << 5) + java.util.Objects.hashCode(_abstract);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(derivation);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(contextInvariant);
    h += (h << 5) + java.util.Objects.hashCode(differential);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(fhirVersion);
    h += (h << 5) + java.util.Objects.hashCode(keyword);
    h += (h << 5) + java.util.Objects.hashCode(snapshot);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(context);
    h += (h << 5) + java.util.Objects.hashCode(baseDefinition);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("StructureDefinition{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (date != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (implicitRules != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (mapping != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("mapping=").append(mapping);
    }
    if (kind != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (_abstract != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("_abstract=").append(_abstract);
    }
    if (title != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (purpose != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (copyright != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (type != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (identifier != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (url != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (derivation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("derivation=").append(derivation);
    }
    if (contact != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (publisher != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (contextInvariant != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contextInvariant=").append(contextInvariant);
    }
    if (differential != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("differential=").append(differential);
    }
    if (contained != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (version != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (status != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (fhirVersion != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("fhirVersion=").append(fhirVersion);
    }
    if (keyword != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("keyword=").append(keyword);
    }
    if (snapshot != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("snapshot=").append(snapshot);
    }
    if (jurisdiction != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (context != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("context=").append(context);
    }
    if (baseDefinition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("baseDefinition=").append(baseDefinition);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (useContext != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "StructureDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.StructureDefinition {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.StructureDefinition_Mapping>> mapping = java.util.Optional.empty();
    boolean mappingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.StructuredefinitionKind> kind = java.util.Optional.empty();
    boolean kindIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> _abstract = java.util.Optional.empty();
    boolean _abstractIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.StructuredefinitionDerivation> derivation = java.util.Optional.empty();
    boolean derivationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> contextInvariant = java.util.Optional.empty();
    boolean contextInvariantIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.StructureDefinition_Differential> differential = java.util.Optional.empty();
    boolean differentialIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.StructuredefinitionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.StructuredefinitionFhirversion> fhirVersion = java.util.Optional.empty();
    boolean fhirVersionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coding>> keyword = java.util.Optional.empty();
    boolean keywordIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.StructureDefinition_Snapshot> snapshot = java.util.Optional.empty();
    boolean snapshotIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.StructureDefinition_Context>> context = java.util.Optional.empty();
    boolean contextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> baseDefinition = java.util.Optional.empty();
    boolean baseDefinitionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("mapping")
    public void setMapping(java.util.Optional<java.util.List<com.fhir.StructureDefinition_Mapping>> mapping) {
      this.mapping = mapping;
      this.mappingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public void setKind(java.util.Optional<com.fhir.StructuredefinitionKind> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("abstract")
    public void set_abstract(java.util.Optional<java.lang.Boolean> _abstract) {
      this._abstract = _abstract;
      this._abstractIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.uri> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("derivation")
    public void setDerivation(java.util.Optional<com.fhir.StructuredefinitionDerivation> derivation) {
      this.derivation = derivation;
      this.derivationIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contextInvariant")
    public void setContextInvariant(java.util.Optional<java.util.List<java.lang.String>> contextInvariant) {
      this.contextInvariant = contextInvariant;
      this.contextInvariantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("differential")
    public void setDifferential(java.util.Optional<com.fhir.StructureDefinition_Differential> differential) {
      this.differential = differential;
      this.differentialIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.StructuredefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
    public void setFhirVersion(java.util.Optional<com.fhir.StructuredefinitionFhirversion> fhirVersion) {
      this.fhirVersion = fhirVersion;
      this.fhirVersionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("keyword")
    public void setKeyword(java.util.Optional<java.util.List<com.fhir.Coding>> keyword) {
      this.keyword = keyword;
      this.keywordIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("snapshot")
    public void setSnapshot(java.util.Optional<com.fhir.StructureDefinition_Snapshot> snapshot) {
      this.snapshot = snapshot;
      this.snapshotIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Optional<java.util.List<com.fhir.StructureDefinition_Context>> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("baseDefinition")
    public void setBaseDefinition(java.util.Optional<com.fhir.canonical> baseDefinition) {
      this.baseDefinition = baseDefinition;
      this.baseDefinitionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.StructureDefinition_Mapping>> mapping() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.StructuredefinitionKind> kind() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> _abstract() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.StructuredefinitionDerivation> derivation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> contextInvariant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.StructureDefinition_Differential> differential() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.StructuredefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.StructuredefinitionFhirversion> fhirVersion() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coding>> keyword() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.StructureDefinition_Snapshot> snapshot() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.StructureDefinition_Context>> context() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> baseDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableStructureDefinition fromJson(Json json) {
    ImmutableStructureDefinition.Builder builder = ((ImmutableStructureDefinition.Builder) ImmutableStructureDefinition.builder());
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.mappingIsSet) {
      builder.mapping(json.mapping);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json._abstractIsSet) {
      builder._abstract(json._abstract);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.derivationIsSet) {
      builder.derivation(json.derivation);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.contextInvariantIsSet) {
      builder.contextInvariant(json.contextInvariant);
    }
    if (json.differentialIsSet) {
      builder.differential(json.differential);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.fhirVersionIsSet) {
      builder.fhirVersion(json.fhirVersion);
    }
    if (json.keywordIsSet) {
      builder.keyword(json.keyword);
    }
    if (json.snapshotIsSet) {
      builder.snapshot(json.snapshot);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.baseDefinitionIsSet) {
      builder.baseDefinition(json.baseDefinition);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    return (ImmutableStructureDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureDefinition instance
   */
  public static StructureDefinition copyOf(StructureDefinition instance) {
    if (instance instanceof ImmutableStructureDefinition) {
      return (ImmutableStructureDefinition) instance;
    }
    return ((ImmutableStructureDefinition.Builder) ImmutableStructureDefinition.builder())
        .name(instance.name())
        .date(instance.date())
        .description(instance.description())
        .implicitRules(instance.implicitRules())
        .mapping(instance.mapping())
        .kind(instance.kind())
        ._abstract(instance._abstract())
        .title(instance.title())
        .purpose(instance.purpose())
        .id(instance.id())
        .meta(instance.meta())
        .copyright(instance.copyright())
        .text(instance.text())
        .type(instance.type())
        .identifier(instance.identifier())
        .url(instance.url())
        .derivation(instance.derivation())
        .contact(instance.contact())
        .publisher(instance.publisher())
        .contextInvariant(instance.contextInvariant())
        .differential(instance.differential())
        .contained(instance.contained())
        .version(instance.version())
        .status(instance.status())
        .fhirVersion(instance.fhirVersion())
        .keyword(instance.keyword())
        .snapshot(instance.snapshot())
        .jurisdiction(instance.jurisdiction())
        .context(instance.context())
        .baseDefinition(instance.baseDefinition())
        .modifierExtension(instance.modifierExtension())
        .useContext(instance.useContext())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .extension(instance.extension())
        .experimental(instance.experimental())
        .build();
  }

  /**
   * Creates a builder for {@link StructureDefinition StructureDefinition}.
   * <pre>
   * ImmutableStructureDefinition.builder()
   *    .name(String) // optional {@link StructureDefinition#name() name}
   *    .date(com.fhir.dateTime) // optional {@link StructureDefinition#date() date}
   *    .description(com.fhir.markdown) // optional {@link StructureDefinition#description() description}
   *    .implicitRules(com.fhir.uri) // optional {@link StructureDefinition#implicitRules() implicitRules}
   *    .mapping(List&amp;lt;com.fhir.StructureDefinition_Mapping&amp;gt;) // optional {@link StructureDefinition#mapping() mapping}
   *    .kind(com.fhir.StructuredefinitionKind) // optional {@link StructureDefinition#kind() kind}
   *    ._abstract(Boolean) // optional {@link StructureDefinition#_abstract() _abstract}
   *    .title(String) // optional {@link StructureDefinition#title() title}
   *    .purpose(com.fhir.markdown) // optional {@link StructureDefinition#purpose() purpose}
   *    .id(com.fhir.id) // optional {@link StructureDefinition#id() id}
   *    .meta(com.fhir.Meta) // optional {@link StructureDefinition#meta() meta}
   *    .copyright(com.fhir.markdown) // optional {@link StructureDefinition#copyright() copyright}
   *    .text(com.fhir.Narrative) // optional {@link StructureDefinition#text() text}
   *    .type(com.fhir.uri) // optional {@link StructureDefinition#type() type}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link StructureDefinition#identifier() identifier}
   *    .url(com.fhir.uri) // optional {@link StructureDefinition#url() url}
   *    .derivation(com.fhir.StructuredefinitionDerivation) // optional {@link StructureDefinition#derivation() derivation}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link StructureDefinition#contact() contact}
   *    .publisher(String) // optional {@link StructureDefinition#publisher() publisher}
   *    .contextInvariant(List&amp;lt;String&amp;gt;) // optional {@link StructureDefinition#contextInvariant() contextInvariant}
   *    .differential(com.fhir.StructureDefinition_Differential) // optional {@link StructureDefinition#differential() differential}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link StructureDefinition#contained() contained}
   *    .version(String) // optional {@link StructureDefinition#version() version}
   *    .status(com.fhir.StructuredefinitionStatus) // optional {@link StructureDefinition#status() status}
   *    .fhirVersion(com.fhir.StructuredefinitionFhirversion) // optional {@link StructureDefinition#fhirVersion() fhirVersion}
   *    .keyword(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link StructureDefinition#keyword() keyword}
   *    .snapshot(com.fhir.StructureDefinition_Snapshot) // optional {@link StructureDefinition#snapshot() snapshot}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link StructureDefinition#jurisdiction() jurisdiction}
   *    .context(List&amp;lt;com.fhir.StructureDefinition_Context&amp;gt;) // optional {@link StructureDefinition#context() context}
   *    .baseDefinition(com.fhir.canonical) // optional {@link StructureDefinition#baseDefinition() baseDefinition}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureDefinition#modifierExtension() modifierExtension}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link StructureDefinition#useContext() useContext}
   *    .resourceType(String) // required {@link StructureDefinition#resourceType() resourceType}
   *    .language(com.fhir.code) // optional {@link StructureDefinition#language() language}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureDefinition#extension() extension}
   *    .experimental(Boolean) // optional {@link StructureDefinition#experimental() experimental}
   *    .build();
   * </pre>
   * @return A new StructureDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableStructureDefinition.Builder();
  }

  /**
   * Builds instances of type {@link StructureDefinition StructureDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "StructureDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_DATE = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_MAPPING = 0x10L;
    private static final long OPT_BIT_KIND = 0x20L;
    private static final long OPT_BIT__ABSTRACT = 0x40L;
    private static final long OPT_BIT_TITLE = 0x80L;
    private static final long OPT_BIT_PURPOSE = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_META = 0x400L;
    private static final long OPT_BIT_COPYRIGHT = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_TYPE = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_URL = 0x8000L;
    private static final long OPT_BIT_DERIVATION = 0x10000L;
    private static final long OPT_BIT_CONTACT = 0x20000L;
    private static final long OPT_BIT_PUBLISHER = 0x40000L;
    private static final long OPT_BIT_CONTEXT_INVARIANT = 0x80000L;
    private static final long OPT_BIT_DIFFERENTIAL = 0x100000L;
    private static final long OPT_BIT_CONTAINED = 0x200000L;
    private static final long OPT_BIT_VERSION = 0x400000L;
    private static final long OPT_BIT_STATUS = 0x800000L;
    private static final long OPT_BIT_FHIR_VERSION = 0x1000000L;
    private static final long OPT_BIT_KEYWORD = 0x2000000L;
    private static final long OPT_BIT_SNAPSHOT = 0x4000000L;
    private static final long OPT_BIT_JURISDICTION = 0x8000000L;
    private static final long OPT_BIT_CONTEXT = 0x10000000L;
    private static final long OPT_BIT_BASE_DEFINITION = 0x20000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x80000000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000000L;
    private static final long OPT_BIT_EXTENSION = 0x200000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x400000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Mapping> mapping;
    private @javax.annotation.Nullable com.fhir.StructuredefinitionKind kind;
    private @javax.annotation.Nullable java.lang.Boolean _abstract;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.uri type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable com.fhir.StructuredefinitionDerivation derivation;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<java.lang.String> contextInvariant;
    private @javax.annotation.Nullable com.fhir.StructureDefinition_Differential differential;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable com.fhir.StructuredefinitionStatus status;
    private @javax.annotation.Nullable com.fhir.StructuredefinitionFhirversion fhirVersion;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coding> keyword;
    private @javax.annotation.Nullable com.fhir.StructureDefinition_Snapshot snapshot;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.StructureDefinition_Context> context;
    private @javax.annotation.Nullable com.fhir.canonical baseDefinition;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Boolean experimental;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureDefinition#name() name} to name.
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
     * Initializes the optional value {@link StructureDefinition#name() name} to name.
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
     * Initializes the optional value {@link StructureDefinition#date() date} to date.
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
     * Initializes the optional value {@link StructureDefinition#date() date} to date.
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
     * Initializes the optional value {@link StructureDefinition#description() description} to description.
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
     * Initializes the optional value {@link StructureDefinition#description() description} to description.
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
     * Initializes the optional value {@link StructureDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link StructureDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link StructureDefinition#mapping() mapping} to mapping.
     * @param mapping The value for mapping
     * @return {@code this} builder for chained invocation
     */
    public final Builder mapping(java.util.List<com.fhir.StructureDefinition_Mapping> mapping) {
      checkNotIsSet(mappingIsSet(), "mapping");
      this.mapping = java.util.Objects.requireNonNull(mapping, "mapping");
      optBits |= OPT_BIT_MAPPING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#mapping() mapping} to mapping.
     * @param mapping The value for mapping
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mapping")
    public final Builder mapping(java.util.Optional<? extends java.util.List<com.fhir.StructureDefinition_Mapping>> mapping) {
      checkNotIsSet(mappingIsSet(), "mapping");
      this.mapping = mapping.orElse(null);
      optBits |= OPT_BIT_MAPPING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(com.fhir.StructuredefinitionKind kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = java.util.Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public final Builder kind(java.util.Optional<? extends com.fhir.StructuredefinitionKind> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#_abstract() _abstract} to _abstract.
     * @param _abstract The value for _abstract
     * @return {@code this} builder for chained invocation
     */
    public final Builder _abstract(boolean _abstract) {
      checkNotIsSet(_abstractIsSet(), "_abstract");
      this._abstract = _abstract;
      optBits |= OPT_BIT__ABSTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#_abstract() _abstract} to _abstract.
     * @param _abstract The value for _abstract
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abstract")
    public final Builder _abstract(java.util.Optional<java.lang.Boolean> _abstract) {
      checkNotIsSet(_abstractIsSet(), "_abstract");
      this._abstract = _abstract.orElse(null);
      optBits |= OPT_BIT__ABSTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#title() title} to title.
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
     * Initializes the optional value {@link StructureDefinition#title() title} to title.
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
     * Initializes the optional value {@link StructureDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link StructureDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link StructureDefinition#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link StructureDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link StructureDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link StructureDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link StructureDefinition#text() text} to text.
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
     * Initializes the optional value {@link StructureDefinition#text() text} to text.
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
     * Initializes the optional value {@link StructureDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.uri type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.uri> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link StructureDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link StructureDefinition#url() url} to url.
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
     * Initializes the optional value {@link StructureDefinition#url() url} to url.
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
     * Initializes the optional value {@link StructureDefinition#derivation() derivation} to derivation.
     * @param derivation The value for derivation
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivation(com.fhir.StructuredefinitionDerivation derivation) {
      checkNotIsSet(derivationIsSet(), "derivation");
      this.derivation = java.util.Objects.requireNonNull(derivation, "derivation");
      optBits |= OPT_BIT_DERIVATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#derivation() derivation} to derivation.
     * @param derivation The value for derivation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("derivation")
    public final Builder derivation(java.util.Optional<? extends com.fhir.StructuredefinitionDerivation> derivation) {
      checkNotIsSet(derivationIsSet(), "derivation");
      this.derivation = derivation.orElse(null);
      optBits |= OPT_BIT_DERIVATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link StructureDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link StructureDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link StructureDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link StructureDefinition#contextInvariant() contextInvariant} to contextInvariant.
     * @param contextInvariant The value for contextInvariant
     * @return {@code this} builder for chained invocation
     */
    public final Builder contextInvariant(java.util.List<java.lang.String> contextInvariant) {
      checkNotIsSet(contextInvariantIsSet(), "contextInvariant");
      this.contextInvariant = java.util.Objects.requireNonNull(contextInvariant, "contextInvariant");
      optBits |= OPT_BIT_CONTEXT_INVARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#contextInvariant() contextInvariant} to contextInvariant.
     * @param contextInvariant The value for contextInvariant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contextInvariant")
    public final Builder contextInvariant(java.util.Optional<? extends java.util.List<java.lang.String>> contextInvariant) {
      checkNotIsSet(contextInvariantIsSet(), "contextInvariant");
      this.contextInvariant = contextInvariant.orElse(null);
      optBits |= OPT_BIT_CONTEXT_INVARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#differential() differential} to differential.
     * @param differential The value for differential
     * @return {@code this} builder for chained invocation
     */
    public final Builder differential(com.fhir.StructureDefinition_Differential differential) {
      checkNotIsSet(differentialIsSet(), "differential");
      this.differential = java.util.Objects.requireNonNull(differential, "differential");
      optBits |= OPT_BIT_DIFFERENTIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#differential() differential} to differential.
     * @param differential The value for differential
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("differential")
    public final Builder differential(java.util.Optional<? extends com.fhir.StructureDefinition_Differential> differential) {
      checkNotIsSet(differentialIsSet(), "differential");
      this.differential = differential.orElse(null);
      optBits |= OPT_BIT_DIFFERENTIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link StructureDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link StructureDefinition#version() version} to version.
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
     * Initializes the optional value {@link StructureDefinition#version() version} to version.
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
     * Initializes the optional value {@link StructureDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.StructuredefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.StructuredefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder fhirVersion(com.fhir.StructuredefinitionFhirversion fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = java.util.Objects.requireNonNull(fhirVersion, "fhirVersion");
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
    public final Builder fhirVersion(java.util.Optional<? extends com.fhir.StructuredefinitionFhirversion> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = fhirVersion.orElse(null);
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for chained invocation
     */
    public final Builder keyword(java.util.List<com.fhir.Coding> keyword) {
      checkNotIsSet(keywordIsSet(), "keyword");
      this.keyword = java.util.Objects.requireNonNull(keyword, "keyword");
      optBits |= OPT_BIT_KEYWORD;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyword")
    public final Builder keyword(java.util.Optional<? extends java.util.List<com.fhir.Coding>> keyword) {
      checkNotIsSet(keywordIsSet(), "keyword");
      this.keyword = keyword.orElse(null);
      optBits |= OPT_BIT_KEYWORD;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#snapshot() snapshot} to snapshot.
     * @param snapshot The value for snapshot
     * @return {@code this} builder for chained invocation
     */
    public final Builder snapshot(com.fhir.StructureDefinition_Snapshot snapshot) {
      checkNotIsSet(snapshotIsSet(), "snapshot");
      this.snapshot = java.util.Objects.requireNonNull(snapshot, "snapshot");
      optBits |= OPT_BIT_SNAPSHOT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#snapshot() snapshot} to snapshot.
     * @param snapshot The value for snapshot
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshot")
    public final Builder snapshot(java.util.Optional<? extends com.fhir.StructureDefinition_Snapshot> snapshot) {
      checkNotIsSet(snapshotIsSet(), "snapshot");
      this.snapshot = snapshot.orElse(null);
      optBits |= OPT_BIT_SNAPSHOT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link StructureDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link StructureDefinition#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(java.util.List<com.fhir.StructureDefinition_Context> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = java.util.Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public final Builder context(java.util.Optional<? extends java.util.List<com.fhir.StructureDefinition_Context>> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#baseDefinition() baseDefinition} to baseDefinition.
     * @param baseDefinition The value for baseDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder baseDefinition(com.fhir.canonical baseDefinition) {
      checkNotIsSet(baseDefinitionIsSet(), "baseDefinition");
      this.baseDefinition = java.util.Objects.requireNonNull(baseDefinition, "baseDefinition");
      optBits |= OPT_BIT_BASE_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#baseDefinition() baseDefinition} to baseDefinition.
     * @param baseDefinition The value for baseDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseDefinition")
    public final Builder baseDefinition(java.util.Optional<? extends com.fhir.canonical> baseDefinition) {
      checkNotIsSet(baseDefinitionIsSet(), "baseDefinition");
      this.baseDefinition = baseDefinition.orElse(null);
      optBits |= OPT_BIT_BASE_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link StructureDefinition#useContext() useContext} to useContext.
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
     * Initializes the value for the {@link StructureDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link StructureDefinition#language() language} to language.
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
     * Initializes the optional value {@link StructureDefinition#language() language} to language.
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
     * Initializes the optional value {@link StructureDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link StructureDefinition#experimental() experimental} to experimental.
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
     * Builds a new {@link StructureDefinition StructureDefinition}.
     * @return An immutable instance of StructureDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.StructureDefinition build() {
      checkRequiredAttributes();
      return new ImmutableStructureDefinition(
          name,
          date,
          description,
          implicitRules,
          mapping,
          kind,
          _abstract,
          title,
          purpose,
          id,
          meta,
          copyright,
          text,
          type,
          identifier,
          url,
          derivation,
          contact,
          publisher,
          contextInvariant,
          differential,
          contained,
          version,
          status,
          fhirVersion,
          keyword,
          snapshot,
          jurisdiction,
          context,
          baseDefinition,
          modifierExtension,
          useContext,
          resourceType,
          language,
          extension,
          experimental);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean mappingIsSet() {
      return (optBits & OPT_BIT_MAPPING) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean _abstractIsSet() {
      return (optBits & OPT_BIT__ABSTRACT) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean derivationIsSet() {
      return (optBits & OPT_BIT_DERIVATION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean contextInvariantIsSet() {
      return (optBits & OPT_BIT_CONTEXT_INVARIANT) != 0;
    }

    private boolean differentialIsSet() {
      return (optBits & OPT_BIT_DIFFERENTIAL) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean fhirVersionIsSet() {
      return (optBits & OPT_BIT_FHIR_VERSION) != 0;
    }

    private boolean keywordIsSet() {
      return (optBits & OPT_BIT_KEYWORD) != 0;
    }

    private boolean snapshotIsSet() {
      return (optBits & OPT_BIT_SNAPSHOT) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean baseDefinitionIsSet() {
      return (optBits & OPT_BIT_BASE_DEFINITION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of StructureDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build StructureDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "StructureDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link StructureDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "StructureDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link StructureDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link StructureDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link StructureDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link StructureDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link StructureDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link StructureDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link StructureDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link StructureDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link StructureDefinition#mapping() mapping} to mapping.
     * @param mapping The value for mapping
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mapping(java.util.List<com.fhir.StructureDefinition_Mapping> mapping);

    /**
     * Initializes the optional value {@link StructureDefinition#mapping() mapping} to mapping.
     * @param mapping The value for mapping
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mapping(java.util.Optional<? extends java.util.List<com.fhir.StructureDefinition_Mapping>> mapping);

    /**
     * Initializes the optional value {@link StructureDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(com.fhir.StructuredefinitionKind kind);

    /**
     * Initializes the optional value {@link StructureDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(java.util.Optional<? extends com.fhir.StructuredefinitionKind> kind);

    /**
     * Initializes the optional value {@link StructureDefinition#_abstract() _abstract} to _abstract.
     * @param _abstract The value for _abstract
     * @return {@code this} builder for chained invocation
     */
    BuildFinal _abstract(boolean _abstract);

    /**
     * Initializes the optional value {@link StructureDefinition#_abstract() _abstract} to _abstract.
     * @param _abstract The value for _abstract
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _abstract(java.util.Optional<java.lang.Boolean> _abstract);

    /**
     * Initializes the optional value {@link StructureDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link StructureDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link StructureDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link StructureDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link StructureDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link StructureDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link StructureDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link StructureDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link StructureDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link StructureDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link StructureDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link StructureDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link StructureDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.uri type);

    /**
     * Initializes the optional value {@link StructureDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.uri> type);

    /**
     * Initializes the optional value {@link StructureDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link StructureDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link StructureDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link StructureDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link StructureDefinition#derivation() derivation} to derivation.
     * @param derivation The value for derivation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivation(com.fhir.StructuredefinitionDerivation derivation);

    /**
     * Initializes the optional value {@link StructureDefinition#derivation() derivation} to derivation.
     * @param derivation The value for derivation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivation(java.util.Optional<? extends com.fhir.StructuredefinitionDerivation> derivation);

    /**
     * Initializes the optional value {@link StructureDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link StructureDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link StructureDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link StructureDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link StructureDefinition#contextInvariant() contextInvariant} to contextInvariant.
     * @param contextInvariant The value for contextInvariant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contextInvariant(java.util.List<java.lang.String> contextInvariant);

    /**
     * Initializes the optional value {@link StructureDefinition#contextInvariant() contextInvariant} to contextInvariant.
     * @param contextInvariant The value for contextInvariant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contextInvariant(java.util.Optional<? extends java.util.List<java.lang.String>> contextInvariant);

    /**
     * Initializes the optional value {@link StructureDefinition#differential() differential} to differential.
     * @param differential The value for differential
     * @return {@code this} builder for chained invocation
     */
    BuildFinal differential(com.fhir.StructureDefinition_Differential differential);

    /**
     * Initializes the optional value {@link StructureDefinition#differential() differential} to differential.
     * @param differential The value for differential
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal differential(java.util.Optional<? extends com.fhir.StructureDefinition_Differential> differential);

    /**
     * Initializes the optional value {@link StructureDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link StructureDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link StructureDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link StructureDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link StructureDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.StructuredefinitionStatus status);

    /**
     * Initializes the optional value {@link StructureDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.StructuredefinitionStatus> status);

    /**
     * Initializes the optional value {@link StructureDefinition#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fhirVersion(com.fhir.StructuredefinitionFhirversion fhirVersion);

    /**
     * Initializes the optional value {@link StructureDefinition#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fhirVersion(java.util.Optional<? extends com.fhir.StructuredefinitionFhirversion> fhirVersion);

    /**
     * Initializes the optional value {@link StructureDefinition#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for chained invocation
     */
    BuildFinal keyword(java.util.List<com.fhir.Coding> keyword);

    /**
     * Initializes the optional value {@link StructureDefinition#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal keyword(java.util.Optional<? extends java.util.List<com.fhir.Coding>> keyword);

    /**
     * Initializes the optional value {@link StructureDefinition#snapshot() snapshot} to snapshot.
     * @param snapshot The value for snapshot
     * @return {@code this} builder for chained invocation
     */
    BuildFinal snapshot(com.fhir.StructureDefinition_Snapshot snapshot);

    /**
     * Initializes the optional value {@link StructureDefinition#snapshot() snapshot} to snapshot.
     * @param snapshot The value for snapshot
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal snapshot(java.util.Optional<? extends com.fhir.StructureDefinition_Snapshot> snapshot);

    /**
     * Initializes the optional value {@link StructureDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link StructureDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link StructureDefinition#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(java.util.List<com.fhir.StructureDefinition_Context> context);

    /**
     * Initializes the optional value {@link StructureDefinition#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(java.util.Optional<? extends java.util.List<com.fhir.StructureDefinition_Context>> context);

    /**
     * Initializes the optional value {@link StructureDefinition#baseDefinition() baseDefinition} to baseDefinition.
     * @param baseDefinition The value for baseDefinition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal baseDefinition(com.fhir.canonical baseDefinition);

    /**
     * Initializes the optional value {@link StructureDefinition#baseDefinition() baseDefinition} to baseDefinition.
     * @param baseDefinition The value for baseDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal baseDefinition(java.util.Optional<? extends com.fhir.canonical> baseDefinition);

    /**
     * Initializes the optional value {@link StructureDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link StructureDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link StructureDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link StructureDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link StructureDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link StructureDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link StructureDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link StructureDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link StructureDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link StructureDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Builds a new {@link StructureDefinition StructureDefinition}.
     * @return An immutable instance of StructureDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    StructureDefinition build();
  }
}
