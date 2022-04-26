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
 * Immutable implementation of {@link StructureDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureDefinition.builder()}.
 */
@Generated(from = "StructureDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureDefinition implements StructureDefinition {
  private final @Nullable String publisher;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable String title;
  private final @Nullable Markdown copyright;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable DateTime date;
  private final @Nullable Meta meta;
  private final @Nullable StructuredefinitionDerivation derivation;
  private final String resourceType;
  private final @Nullable Id id;
  private final @Nullable List<StructureDefinition_Context> context;
  private final @Nullable StructuredefinitionFhirversion fhirVersion;
  private final @Nullable Code language;
  private final @Nullable StructuredefinitionKind kind;
  private final @Nullable List<StructureDefinition_Mapping> mapping;
  private final @Nullable Narrative text;
  private final @Nullable String name;
  private final @Nullable Uri type;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Markdown description;
  private final @Nullable List<Coding> keyword;
  private final @Nullable Uri implicitRules;
  private final @Nullable Uri url;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean _abstract;
  private final @Nullable Canonical baseDefinition;
  private final @Nullable String version;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Boolean experimental;
  private final @Nullable Markdown purpose;
  private final @Nullable StructureDefinition_Differential differential;
  private final @Nullable List<Extension> extension;
  private final @Nullable StructureDefinition_Snapshot snapshot;
  private final @Nullable StructuredefinitionStatus status;
  private final @Nullable List<String> contextInvariant;

  private ImmutableStructureDefinition(
      @Nullable String publisher,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable String title,
      @Nullable Markdown copyright,
      @Nullable List<ContactDetail> contact,
      @Nullable DateTime date,
      @Nullable Meta meta,
      @Nullable StructuredefinitionDerivation derivation,
      String resourceType,
      @Nullable Id id,
      @Nullable List<StructureDefinition_Context> context,
      @Nullable StructuredefinitionFhirversion fhirVersion,
      @Nullable Code language,
      @Nullable StructuredefinitionKind kind,
      @Nullable List<StructureDefinition_Mapping> mapping,
      @Nullable Narrative text,
      @Nullable String name,
      @Nullable Uri type,
      @Nullable List<Identifier> identifier,
      @Nullable List<UsageContext> useContext,
      @Nullable Markdown description,
      @Nullable List<Coding> keyword,
      @Nullable Uri implicitRules,
      @Nullable Uri url,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean _abstract,
      @Nullable Canonical baseDefinition,
      @Nullable String version,
      @Nullable List<ResourceList> contained,
      @Nullable Boolean experimental,
      @Nullable Markdown purpose,
      @Nullable StructureDefinition_Differential differential,
      @Nullable List<Extension> extension,
      @Nullable StructureDefinition_Snapshot snapshot,
      @Nullable StructuredefinitionStatus status,
      @Nullable List<String> contextInvariant) {
    this.publisher = publisher;
    this.jurisdiction = jurisdiction;
    this.title = title;
    this.copyright = copyright;
    this.contact = contact;
    this.date = date;
    this.meta = meta;
    this.derivation = derivation;
    this.resourceType = resourceType;
    this.id = id;
    this.context = context;
    this.fhirVersion = fhirVersion;
    this.language = language;
    this.kind = kind;
    this.mapping = mapping;
    this.text = text;
    this.name = name;
    this.type = type;
    this.identifier = identifier;
    this.useContext = useContext;
    this.description = description;
    this.keyword = keyword;
    this.implicitRules = implicitRules;
    this.url = url;
    this.modifierExtension = modifierExtension;
    this._abstract = _abstract;
    this.baseDefinition = baseDefinition;
    this.version = version;
    this.contained = contained;
    this.experimental = experimental;
    this.purpose = purpose;
    this.differential = differential;
    this.extension = extension;
    this.snapshot = snapshot;
    this.status = status;
    this.contextInvariant = contextInvariant;
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code derivation} attribute
   */
  @JsonProperty("derivation")
  @Override
  public Optional<StructuredefinitionDerivation> derivation() {
    return Optional.ofNullable(derivation);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<List<StructureDefinition_Context>> context() {
    return Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code fhirVersion} attribute
   */
  @JsonProperty("fhirVersion")
  @Override
  public Optional<StructuredefinitionFhirversion> fhirVersion() {
    return Optional.ofNullable(fhirVersion);
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
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public Optional<StructuredefinitionKind> kind() {
    return Optional.ofNullable(kind);
  }

  /**
   * @return The value of the {@code mapping} attribute
   */
  @JsonProperty("mapping")
  @Override
  public Optional<List<StructureDefinition_Mapping>> mapping() {
    return Optional.ofNullable(mapping);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Uri> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code useContext} attribute
   */
  @JsonProperty("useContext")
  @Override
  public Optional<List<UsageContext>> useContext() {
    return Optional.ofNullable(useContext);
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
   * @return The value of the {@code keyword} attribute
   */
  @JsonProperty("keyword")
  @Override
  public Optional<List<Coding>> keyword() {
    return Optional.ofNullable(keyword);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
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
   * @return The value of the {@code _abstract} attribute
   */
  @JsonProperty("abstract")
  @Override
  public Optional<Boolean> _abstract() {
    return Optional.ofNullable(_abstract);
  }

  /**
   * @return The value of the {@code baseDefinition} attribute
   */
  @JsonProperty("baseDefinition")
  @Override
  public Optional<Canonical> baseDefinition() {
    return Optional.ofNullable(baseDefinition);
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
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<Markdown> purpose() {
    return Optional.ofNullable(purpose);
  }

  /**
   * @return The value of the {@code differential} attribute
   */
  @JsonProperty("differential")
  @Override
  public Optional<StructureDefinition_Differential> differential() {
    return Optional.ofNullable(differential);
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
   * @return The value of the {@code snapshot} attribute
   */
  @JsonProperty("snapshot")
  @Override
  public Optional<StructureDefinition_Snapshot> snapshot() {
    return Optional.ofNullable(snapshot);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<StructuredefinitionStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code contextInvariant} attribute
   */
  @JsonProperty("contextInvariant")
  @Override
  public Optional<List<String>> contextInvariant() {
    return Optional.ofNullable(contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableStructureDefinition(
        newValue,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableStructureDefinition(
        value,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        newValue,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        value,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        newValue,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        value,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        newValue,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        value,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        newValue,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        value,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        newValue,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        value,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        newValue,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        value,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#derivation() derivation} attribute.
   * @param value The value for derivation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withDerivation(StructuredefinitionDerivation value) {
    @Nullable StructuredefinitionDerivation newValue = Objects.requireNonNull(value, "derivation");
    if (this.derivation == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        newValue,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#derivation() derivation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withDerivation(Optional<? extends StructuredefinitionDerivation> optional) {
    @Nullable StructuredefinitionDerivation value = optional.orElse(null);
    if (this.derivation == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        value,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StructureDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStructureDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        newValue,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        newValue,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        value,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withContext(List<StructureDefinition_Context> value) {
    @Nullable List<StructureDefinition_Context> newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        newValue,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withContext(Optional<? extends List<StructureDefinition_Context>> optional) {
    @Nullable List<StructureDefinition_Context> value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        value,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#fhirVersion() fhirVersion} attribute.
   * @param value The value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withFhirVersion(StructuredefinitionFhirversion value) {
    @Nullable StructuredefinitionFhirversion newValue = Objects.requireNonNull(value, "fhirVersion");
    if (this.fhirVersion == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        newValue,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#fhirVersion() fhirVersion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withFhirVersion(Optional<? extends StructuredefinitionFhirversion> optional) {
    @Nullable StructuredefinitionFhirversion value = optional.orElse(null);
    if (this.fhirVersion == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        value,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        newValue,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        value,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withKind(StructuredefinitionKind value) {
    @Nullable StructuredefinitionKind newValue = Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        newValue,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withKind(Optional<? extends StructuredefinitionKind> optional) {
    @Nullable StructuredefinitionKind value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        value,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#mapping() mapping} attribute.
   * @param value The value for mapping
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withMapping(List<StructureDefinition_Mapping> value) {
    @Nullable List<StructureDefinition_Mapping> newValue = Objects.requireNonNull(value, "mapping");
    if (this.mapping == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        newValue,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#mapping() mapping} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mapping
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withMapping(Optional<? extends List<StructureDefinition_Mapping>> optional) {
    @Nullable List<StructureDefinition_Mapping> value = optional.orElse(null);
    if (this.mapping == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        value,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        newValue,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        value,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        newValue,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        value,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withType(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        newValue,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withType(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        value,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        newValue,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        value,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        newValue,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        value,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        newValue,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        value,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#keyword() keyword} attribute.
   * @param value The value for keyword
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withKeyword(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "keyword");
    if (this.keyword == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        newValue,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#keyword() keyword} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for keyword
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withKeyword(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.keyword == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        value,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        newValue,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        value,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        value,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        newValue,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        value,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#_abstract() _abstract} attribute.
   * @param value The value for _abstract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition with_abstract(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this._abstract, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        newValue,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#_abstract() _abstract} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _abstract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition with_abstract(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this._abstract, value)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        value,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#baseDefinition() baseDefinition} attribute.
   * @param value The value for baseDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withBaseDefinition(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "baseDefinition");
    if (this.baseDefinition == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        newValue,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#baseDefinition() baseDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for baseDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withBaseDefinition(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.baseDefinition == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        value,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        newValue,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        value,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        newValue,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        value,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        newValue,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        value,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        newValue,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        value,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#differential() differential} attribute.
   * @param value The value for differential
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withDifferential(StructureDefinition_Differential value) {
    @Nullable StructureDefinition_Differential newValue = Objects.requireNonNull(value, "differential");
    if (this.differential == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        newValue,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#differential() differential} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for differential
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withDifferential(Optional<? extends StructureDefinition_Differential> optional) {
    @Nullable StructureDefinition_Differential value = optional.orElse(null);
    if (this.differential == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        value,
        this.extension,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        newValue,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        value,
        this.snapshot,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#snapshot() snapshot} attribute.
   * @param value The value for snapshot
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withSnapshot(StructureDefinition_Snapshot value) {
    @Nullable StructureDefinition_Snapshot newValue = Objects.requireNonNull(value, "snapshot");
    if (this.snapshot == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        newValue,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#snapshot() snapshot} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for snapshot
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withSnapshot(Optional<? extends StructureDefinition_Snapshot> optional) {
    @Nullable StructureDefinition_Snapshot value = optional.orElse(null);
    if (this.snapshot == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        value,
        this.status,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withStatus(StructuredefinitionStatus value) {
    @Nullable StructuredefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        newValue,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withStatus(Optional<? extends StructuredefinitionStatus> optional) {
    @Nullable StructuredefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        value,
        this.contextInvariant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureDefinition#contextInvariant() contextInvariant} attribute.
   * @param value The value for contextInvariant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureDefinition withContextInvariant(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "contextInvariant");
    if (this.contextInvariant == newValue) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureDefinition#contextInvariant() contextInvariant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contextInvariant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureDefinition withContextInvariant(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.contextInvariant == value) return this;
    return new ImmutableStructureDefinition(
        this.publisher,
        this.jurisdiction,
        this.title,
        this.copyright,
        this.contact,
        this.date,
        this.meta,
        this.derivation,
        this.resourceType,
        this.id,
        this.context,
        this.fhirVersion,
        this.language,
        this.kind,
        this.mapping,
        this.text,
        this.name,
        this.type,
        this.identifier,
        this.useContext,
        this.description,
        this.keyword,
        this.implicitRules,
        this.url,
        this.modifierExtension,
        this._abstract,
        this.baseDefinition,
        this.version,
        this.contained,
        this.experimental,
        this.purpose,
        this.differential,
        this.extension,
        this.snapshot,
        this.status,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureDefinition
        && equalTo((ImmutableStructureDefinition) another);
  }

  private boolean equalTo(ImmutableStructureDefinition another) {
    return Objects.equals(publisher, another.publisher)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(title, another.title)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(contact, another.contact)
        && Objects.equals(date, another.date)
        && Objects.equals(meta, another.meta)
        && Objects.equals(derivation, another.derivation)
        && resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && Objects.equals(context, another.context)
        && Objects.equals(fhirVersion, another.fhirVersion)
        && Objects.equals(language, another.language)
        && Objects.equals(kind, another.kind)
        && Objects.equals(mapping, another.mapping)
        && Objects.equals(text, another.text)
        && Objects.equals(name, another.name)
        && Objects.equals(type, another.type)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(description, another.description)
        && Objects.equals(keyword, another.keyword)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(url, another.url)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(_abstract, another._abstract)
        && Objects.equals(baseDefinition, another.baseDefinition)
        && Objects.equals(version, another.version)
        && Objects.equals(contained, another.contained)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(differential, another.differential)
        && Objects.equals(extension, another.extension)
        && Objects.equals(snapshot, another.snapshot)
        && Objects.equals(status, another.status)
        && Objects.equals(contextInvariant, another.contextInvariant);
  }

  /**
   * Computes a hash code from attributes: {@code publisher}, {@code jurisdiction}, {@code title}, {@code copyright}, {@code contact}, {@code date}, {@code meta}, {@code derivation}, {@code resourceType}, {@code id}, {@code context}, {@code fhirVersion}, {@code language}, {@code kind}, {@code mapping}, {@code text}, {@code name}, {@code type}, {@code identifier}, {@code useContext}, {@code description}, {@code keyword}, {@code implicitRules}, {@code url}, {@code modifierExtension}, {@code _abstract}, {@code baseDefinition}, {@code version}, {@code contained}, {@code experimental}, {@code purpose}, {@code differential}, {@code extension}, {@code snapshot}, {@code status}, {@code contextInvariant}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(derivation);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(context);
    h += (h << 5) + Objects.hashCode(fhirVersion);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(kind);
    h += (h << 5) + Objects.hashCode(mapping);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(keyword);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(_abstract);
    h += (h << 5) + Objects.hashCode(baseDefinition);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(differential);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(snapshot);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(contextInvariant);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureDefinition{");
    if (publisher != null) {
      builder.append("publisher=").append(publisher);
    }
    if (jurisdiction != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (title != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (copyright != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (contact != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (date != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (meta != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (derivation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("derivation=").append(derivation);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    if (fhirVersion != null) {
      builder.append(", ");
      builder.append("fhirVersion=").append(fhirVersion);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (kind != null) {
      builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (mapping != null) {
      builder.append(", ");
      builder.append("mapping=").append(mapping);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (keyword != null) {
      builder.append(", ");
      builder.append("keyword=").append(keyword);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (_abstract != null) {
      builder.append(", ");
      builder.append("_abstract=").append(_abstract);
    }
    if (baseDefinition != null) {
      builder.append(", ");
      builder.append("baseDefinition=").append(baseDefinition);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (differential != null) {
      builder.append(", ");
      builder.append("differential=").append(differential);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (snapshot != null) {
      builder.append(", ");
      builder.append("snapshot=").append(snapshot);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (contextInvariant != null) {
      builder.append(", ");
      builder.append("contextInvariant=").append(contextInvariant);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureDefinition {
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<StructuredefinitionDerivation> derivation = Optional.empty();
    boolean derivationIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<StructureDefinition_Context>> context = Optional.empty();
    boolean contextIsSet;
    @Nullable Optional<StructuredefinitionFhirversion> fhirVersion = Optional.empty();
    boolean fhirVersionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<StructuredefinitionKind> kind = Optional.empty();
    boolean kindIsSet;
    @Nullable Optional<List<StructureDefinition_Mapping>> mapping = Optional.empty();
    boolean mappingIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Uri> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Coding>> keyword = Optional.empty();
    boolean keywordIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> _abstract = Optional.empty();
    boolean _abstractIsSet;
    @Nullable Optional<Canonical> baseDefinition = Optional.empty();
    boolean baseDefinitionIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<StructureDefinition_Differential> differential = Optional.empty();
    boolean differentialIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<StructureDefinition_Snapshot> snapshot = Optional.empty();
    boolean snapshotIsSet;
    @Nullable Optional<StructuredefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<String>> contextInvariant = Optional.empty();
    boolean contextInvariantIsSet;
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("derivation")
    public void setDerivation(Optional<StructuredefinitionDerivation> derivation) {
      this.derivation = derivation;
      this.derivationIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<List<StructureDefinition_Context>> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @JsonProperty("fhirVersion")
    public void setFhirVersion(Optional<StructuredefinitionFhirversion> fhirVersion) {
      this.fhirVersion = fhirVersion;
      this.fhirVersionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(Optional<StructuredefinitionKind> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @JsonProperty("mapping")
    public void setMapping(Optional<List<StructureDefinition_Mapping>> mapping) {
      this.mapping = mapping;
      this.mappingIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Uri> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("keyword")
    public void setKeyword(Optional<List<Coding>> keyword) {
      this.keyword = keyword;
      this.keywordIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("abstract")
    public void set_abstract(Optional<Boolean> _abstract) {
      this._abstract = _abstract;
      this._abstractIsSet = true;
    }
    @JsonProperty("baseDefinition")
    public void setBaseDefinition(Optional<Canonical> baseDefinition) {
      this.baseDefinition = baseDefinition;
      this.baseDefinitionIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
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
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("differential")
    public void setDifferential(Optional<StructureDefinition_Differential> differential) {
      this.differential = differential;
      this.differentialIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("snapshot")
    public void setSnapshot(Optional<StructureDefinition_Snapshot> snapshot) {
      this.snapshot = snapshot;
      this.snapshotIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<StructuredefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("contextInvariant")
    public void setContextInvariant(Optional<List<String>> contextInvariant) {
      this.contextInvariant = contextInvariant;
      this.contextInvariantIsSet = true;
    }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<StructuredefinitionDerivation> derivation() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<StructureDefinition_Context>> context() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<StructuredefinitionFhirversion> fhirVersion() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<StructuredefinitionKind> kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<StructureDefinition_Mapping>> mapping() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> keyword() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> _abstract() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> baseDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<StructureDefinition_Differential> differential() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<StructureDefinition_Snapshot> snapshot() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<StructuredefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> contextInvariant() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureDefinition fromJson(Json json) {
    ImmutableStructureDefinition.Builder builder = ((ImmutableStructureDefinition.Builder) ImmutableStructureDefinition.builder());
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.derivationIsSet) {
      builder.derivation(json.derivation);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.fhirVersionIsSet) {
      builder.fhirVersion(json.fhirVersion);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.mappingIsSet) {
      builder.mapping(json.mapping);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.keywordIsSet) {
      builder.keyword(json.keyword);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json._abstractIsSet) {
      builder._abstract(json._abstract);
    }
    if (json.baseDefinitionIsSet) {
      builder.baseDefinition(json.baseDefinition);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.differentialIsSet) {
      builder.differential(json.differential);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.snapshotIsSet) {
      builder.snapshot(json.snapshot);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.contextInvariantIsSet) {
      builder.contextInvariant(json.contextInvariant);
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
        .publisher(instance.publisher())
        .jurisdiction(instance.jurisdiction())
        .title(instance.title())
        .copyright(instance.copyright())
        .contact(instance.contact())
        .date(instance.date())
        .meta(instance.meta())
        .derivation(instance.derivation())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .context(instance.context())
        .fhirVersion(instance.fhirVersion())
        .language(instance.language())
        .kind(instance.kind())
        .mapping(instance.mapping())
        .text(instance.text())
        .name(instance.name())
        .type(instance.type())
        .identifier(instance.identifier())
        .useContext(instance.useContext())
        .description(instance.description())
        .keyword(instance.keyword())
        .implicitRules(instance.implicitRules())
        .url(instance.url())
        .modifierExtension(instance.modifierExtension())
        ._abstract(instance._abstract())
        .baseDefinition(instance.baseDefinition())
        .version(instance.version())
        .contained(instance.contained())
        .experimental(instance.experimental())
        .purpose(instance.purpose())
        .differential(instance.differential())
        .extension(instance.extension())
        .snapshot(instance.snapshot())
        .status(instance.status())
        .contextInvariant(instance.contextInvariant())
        .build();
  }

  /**
   * Creates a builder for {@link StructureDefinition StructureDefinition}.
   * <pre>
   * ImmutableStructureDefinition.builder()
   *    .publisher(String) // optional {@link StructureDefinition#publisher() publisher}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link StructureDefinition#jurisdiction() jurisdiction}
   *    .title(String) // optional {@link StructureDefinition#title() title}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link StructureDefinition#copyright() copyright}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link StructureDefinition#contact() contact}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link StructureDefinition#date() date}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link StructureDefinition#meta() meta}
   *    .derivation(com.medplum.types.fhir.StructuredefinitionDerivation) // optional {@link StructureDefinition#derivation() derivation}
   *    .resourceType(String) // required {@link StructureDefinition#resourceType() resourceType}
   *    .id(com.medplum.types.fhir.Id) // optional {@link StructureDefinition#id() id}
   *    .context(List&amp;lt;com.medplum.types.fhir.StructureDefinition_Context&amp;gt;) // optional {@link StructureDefinition#context() context}
   *    .fhirVersion(com.medplum.types.fhir.StructuredefinitionFhirversion) // optional {@link StructureDefinition#fhirVersion() fhirVersion}
   *    .language(com.medplum.types.fhir.Code) // optional {@link StructureDefinition#language() language}
   *    .kind(com.medplum.types.fhir.StructuredefinitionKind) // optional {@link StructureDefinition#kind() kind}
   *    .mapping(List&amp;lt;com.medplum.types.fhir.StructureDefinition_Mapping&amp;gt;) // optional {@link StructureDefinition#mapping() mapping}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link StructureDefinition#text() text}
   *    .name(String) // optional {@link StructureDefinition#name() name}
   *    .type(com.medplum.types.fhir.Uri) // optional {@link StructureDefinition#type() type}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link StructureDefinition#identifier() identifier}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link StructureDefinition#useContext() useContext}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link StructureDefinition#description() description}
   *    .keyword(List&amp;lt;com.medplum.types.fhir.Coding&amp;gt;) // optional {@link StructureDefinition#keyword() keyword}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link StructureDefinition#implicitRules() implicitRules}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link StructureDefinition#url() url}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link StructureDefinition#modifierExtension() modifierExtension}
   *    ._abstract(Boolean) // optional {@link StructureDefinition#_abstract() _abstract}
   *    .baseDefinition(com.medplum.types.fhir.Canonical) // optional {@link StructureDefinition#baseDefinition() baseDefinition}
   *    .version(String) // optional {@link StructureDefinition#version() version}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link StructureDefinition#contained() contained}
   *    .experimental(Boolean) // optional {@link StructureDefinition#experimental() experimental}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link StructureDefinition#purpose() purpose}
   *    .differential(com.medplum.types.fhir.StructureDefinition_Differential) // optional {@link StructureDefinition#differential() differential}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link StructureDefinition#extension() extension}
   *    .snapshot(com.medplum.types.fhir.StructureDefinition_Snapshot) // optional {@link StructureDefinition#snapshot() snapshot}
   *    .status(com.medplum.types.fhir.StructuredefinitionStatus) // optional {@link StructureDefinition#status() status}
   *    .contextInvariant(List&amp;lt;String&amp;gt;) // optional {@link StructureDefinition#contextInvariant() contextInvariant}
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
  @Generated(from = "StructureDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_PUBLISHER = 0x1L;
    private static final long OPT_BIT_JURISDICTION = 0x2L;
    private static final long OPT_BIT_TITLE = 0x4L;
    private static final long OPT_BIT_COPYRIGHT = 0x8L;
    private static final long OPT_BIT_CONTACT = 0x10L;
    private static final long OPT_BIT_DATE = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_DERIVATION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_CONTEXT = 0x200L;
    private static final long OPT_BIT_FHIR_VERSION = 0x400L;
    private static final long OPT_BIT_LANGUAGE = 0x800L;
    private static final long OPT_BIT_KIND = 0x1000L;
    private static final long OPT_BIT_MAPPING = 0x2000L;
    private static final long OPT_BIT_TEXT = 0x4000L;
    private static final long OPT_BIT_NAME = 0x8000L;
    private static final long OPT_BIT_TYPE = 0x10000L;
    private static final long OPT_BIT_IDENTIFIER = 0x20000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x40000L;
    private static final long OPT_BIT_DESCRIPTION = 0x80000L;
    private static final long OPT_BIT_KEYWORD = 0x100000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200000L;
    private static final long OPT_BIT_URL = 0x400000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800000L;
    private static final long OPT_BIT__ABSTRACT = 0x1000000L;
    private static final long OPT_BIT_BASE_DEFINITION = 0x2000000L;
    private static final long OPT_BIT_VERSION = 0x4000000L;
    private static final long OPT_BIT_CONTAINED = 0x8000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x10000000L;
    private static final long OPT_BIT_PURPOSE = 0x20000000L;
    private static final long OPT_BIT_DIFFERENTIAL = 0x40000000L;
    private static final long OPT_BIT_EXTENSION = 0x80000000L;
    private static final long OPT_BIT_SNAPSHOT = 0x100000000L;
    private static final long OPT_BIT_STATUS = 0x200000000L;
    private static final long OPT_BIT_CONTEXT_INVARIANT = 0x400000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String publisher;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable String title;
    private @Nullable Markdown copyright;
    private @Nullable List<ContactDetail> contact;
    private @Nullable DateTime date;
    private @Nullable Meta meta;
    private @Nullable StructuredefinitionDerivation derivation;
    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable List<StructureDefinition_Context> context;
    private @Nullable StructuredefinitionFhirversion fhirVersion;
    private @Nullable Code language;
    private @Nullable StructuredefinitionKind kind;
    private @Nullable List<StructureDefinition_Mapping> mapping;
    private @Nullable Narrative text;
    private @Nullable String name;
    private @Nullable Uri type;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<UsageContext> useContext;
    private @Nullable Markdown description;
    private @Nullable List<Coding> keyword;
    private @Nullable Uri implicitRules;
    private @Nullable Uri url;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean _abstract;
    private @Nullable Canonical baseDefinition;
    private @Nullable String version;
    private @Nullable List<ResourceList> contained;
    private @Nullable Boolean experimental;
    private @Nullable Markdown purpose;
    private @Nullable StructureDefinition_Differential differential;
    private @Nullable List<Extension> extension;
    private @Nullable StructureDefinition_Snapshot snapshot;
    private @Nullable StructuredefinitionStatus status;
    private @Nullable List<String> contextInvariant;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link StructureDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link StructureDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link StructureDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link StructureDefinition#title() title} to title.
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
     * Initializes the optional value {@link StructureDefinition#title() title} to title.
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
     * Initializes the optional value {@link StructureDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link StructureDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link StructureDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link StructureDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link StructureDefinition#date() date} to date.
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
     * Initializes the optional value {@link StructureDefinition#date() date} to date.
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
     * Initializes the optional value {@link StructureDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link StructureDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link StructureDefinition#derivation() derivation} to derivation.
     * @param derivation The value for derivation
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivation(StructuredefinitionDerivation derivation) {
      checkNotIsSet(derivationIsSet(), "derivation");
      this.derivation = Objects.requireNonNull(derivation, "derivation");
      optBits |= OPT_BIT_DERIVATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#derivation() derivation} to derivation.
     * @param derivation The value for derivation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("derivation")
    public final Builder derivation(Optional<? extends StructuredefinitionDerivation> derivation) {
      checkNotIsSet(derivationIsSet(), "derivation");
      this.derivation = derivation.orElse(null);
      optBits |= OPT_BIT_DERIVATION;
      return this;
    }

    /**
     * Initializes the value for the {@link StructureDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link StructureDefinition#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition#id() id} to id.
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
     * Initializes the optional value {@link StructureDefinition#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(List<StructureDefinition_Context> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends List<StructureDefinition_Context>> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder fhirVersion(StructuredefinitionFhirversion fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = Objects.requireNonNull(fhirVersion, "fhirVersion");
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fhirVersion")
    public final Builder fhirVersion(Optional<? extends StructuredefinitionFhirversion> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = fhirVersion.orElse(null);
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#language() language} to language.
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
     * Initializes the optional value {@link StructureDefinition#language() language} to language.
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
     * Initializes the optional value {@link StructureDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(StructuredefinitionKind kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(Optional<? extends StructuredefinitionKind> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#mapping() mapping} to mapping.
     * @param mapping The value for mapping
     * @return {@code this} builder for chained invocation
     */
    public final Builder mapping(List<StructureDefinition_Mapping> mapping) {
      checkNotIsSet(mappingIsSet(), "mapping");
      this.mapping = Objects.requireNonNull(mapping, "mapping");
      optBits |= OPT_BIT_MAPPING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#mapping() mapping} to mapping.
     * @param mapping The value for mapping
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mapping")
    public final Builder mapping(Optional<? extends List<StructureDefinition_Mapping>> mapping) {
      checkNotIsSet(mappingIsSet(), "mapping");
      this.mapping = mapping.orElse(null);
      optBits |= OPT_BIT_MAPPING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#text() text} to text.
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
     * Initializes the optional value {@link StructureDefinition#text() text} to text.
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
     * Initializes the optional value {@link StructureDefinition#name() name} to name.
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
     * Initializes the optional value {@link StructureDefinition#name() name} to name.
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
     * Initializes the optional value {@link StructureDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Uri type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Uri> type) {
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
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link StructureDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link StructureDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link StructureDefinition#description() description} to description.
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
     * Initializes the optional value {@link StructureDefinition#description() description} to description.
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
     * Initializes the optional value {@link StructureDefinition#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for chained invocation
     */
    public final Builder keyword(List<Coding> keyword) {
      checkNotIsSet(keywordIsSet(), "keyword");
      this.keyword = Objects.requireNonNull(keyword, "keyword");
      optBits |= OPT_BIT_KEYWORD;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("keyword")
    public final Builder keyword(Optional<? extends List<Coding>> keyword) {
      checkNotIsSet(keywordIsSet(), "keyword");
      this.keyword = keyword.orElse(null);
      optBits |= OPT_BIT_KEYWORD;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link StructureDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link StructureDefinition#url() url} to url.
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
     * Initializes the optional value {@link StructureDefinition#url() url} to url.
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
     * Initializes the optional value {@link StructureDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
    @JsonProperty("abstract")
    public final Builder _abstract(Optional<Boolean> _abstract) {
      checkNotIsSet(_abstractIsSet(), "_abstract");
      this._abstract = _abstract.orElse(null);
      optBits |= OPT_BIT__ABSTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#baseDefinition() baseDefinition} to baseDefinition.
     * @param baseDefinition The value for baseDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder baseDefinition(Canonical baseDefinition) {
      checkNotIsSet(baseDefinitionIsSet(), "baseDefinition");
      this.baseDefinition = Objects.requireNonNull(baseDefinition, "baseDefinition");
      optBits |= OPT_BIT_BASE_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#baseDefinition() baseDefinition} to baseDefinition.
     * @param baseDefinition The value for baseDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("baseDefinition")
    public final Builder baseDefinition(Optional<? extends Canonical> baseDefinition) {
      checkNotIsSet(baseDefinitionIsSet(), "baseDefinition");
      this.baseDefinition = baseDefinition.orElse(null);
      optBits |= OPT_BIT_BASE_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#version() version} to version.
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
     * Initializes the optional value {@link StructureDefinition#version() version} to version.
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
     * Initializes the optional value {@link StructureDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link StructureDefinition#contained() contained} to contained.
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
    @JsonProperty("experimental")
    public final Builder experimental(Optional<Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link StructureDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link StructureDefinition#differential() differential} to differential.
     * @param differential The value for differential
     * @return {@code this} builder for chained invocation
     */
    public final Builder differential(StructureDefinition_Differential differential) {
      checkNotIsSet(differentialIsSet(), "differential");
      this.differential = Objects.requireNonNull(differential, "differential");
      optBits |= OPT_BIT_DIFFERENTIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#differential() differential} to differential.
     * @param differential The value for differential
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("differential")
    public final Builder differential(Optional<? extends StructureDefinition_Differential> differential) {
      checkNotIsSet(differentialIsSet(), "differential");
      this.differential = differential.orElse(null);
      optBits |= OPT_BIT_DIFFERENTIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureDefinition#snapshot() snapshot} to snapshot.
     * @param snapshot The value for snapshot
     * @return {@code this} builder for chained invocation
     */
    public final Builder snapshot(StructureDefinition_Snapshot snapshot) {
      checkNotIsSet(snapshotIsSet(), "snapshot");
      this.snapshot = Objects.requireNonNull(snapshot, "snapshot");
      optBits |= OPT_BIT_SNAPSHOT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#snapshot() snapshot} to snapshot.
     * @param snapshot The value for snapshot
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("snapshot")
    public final Builder snapshot(Optional<? extends StructureDefinition_Snapshot> snapshot) {
      checkNotIsSet(snapshotIsSet(), "snapshot");
      this.snapshot = snapshot.orElse(null);
      optBits |= OPT_BIT_SNAPSHOT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(StructuredefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends StructuredefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#contextInvariant() contextInvariant} to contextInvariant.
     * @param contextInvariant The value for contextInvariant
     * @return {@code this} builder for chained invocation
     */
    public final Builder contextInvariant(List<String> contextInvariant) {
      checkNotIsSet(contextInvariantIsSet(), "contextInvariant");
      this.contextInvariant = Objects.requireNonNull(contextInvariant, "contextInvariant");
      optBits |= OPT_BIT_CONTEXT_INVARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureDefinition#contextInvariant() contextInvariant} to contextInvariant.
     * @param contextInvariant The value for contextInvariant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contextInvariant")
    public final Builder contextInvariant(Optional<? extends List<String>> contextInvariant) {
      checkNotIsSet(contextInvariantIsSet(), "contextInvariant");
      this.contextInvariant = contextInvariant.orElse(null);
      optBits |= OPT_BIT_CONTEXT_INVARIANT;
      return this;
    }

    /**
     * Builds a new {@link StructureDefinition StructureDefinition}.
     * @return An immutable instance of StructureDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureDefinition build() {
      checkRequiredAttributes();
      return new ImmutableStructureDefinition(
          publisher,
          jurisdiction,
          title,
          copyright,
          contact,
          date,
          meta,
          derivation,
          resourceType,
          id,
          context,
          fhirVersion,
          language,
          kind,
          mapping,
          text,
          name,
          type,
          identifier,
          useContext,
          description,
          keyword,
          implicitRules,
          url,
          modifierExtension,
          _abstract,
          baseDefinition,
          version,
          contained,
          experimental,
          purpose,
          differential,
          extension,
          snapshot,
          status,
          contextInvariant);
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean derivationIsSet() {
      return (optBits & OPT_BIT_DERIVATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean fhirVersionIsSet() {
      return (optBits & OPT_BIT_FHIR_VERSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean mappingIsSet() {
      return (optBits & OPT_BIT_MAPPING) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean keywordIsSet() {
      return (optBits & OPT_BIT_KEYWORD) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean _abstractIsSet() {
      return (optBits & OPT_BIT__ABSTRACT) != 0;
    }

    private boolean baseDefinitionIsSet() {
      return (optBits & OPT_BIT_BASE_DEFINITION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean differentialIsSet() {
      return (optBits & OPT_BIT_DIFFERENTIAL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean snapshotIsSet() {
      return (optBits & OPT_BIT_SNAPSHOT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean contextInvariantIsSet() {
      return (optBits & OPT_BIT_CONTEXT_INVARIANT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build StructureDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "StructureDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link StructureDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "StructureDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link StructureDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link StructureDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link StructureDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link StructureDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link StructureDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link StructureDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link StructureDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link StructureDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link StructureDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link StructureDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link StructureDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link StructureDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link StructureDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link StructureDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link StructureDefinition#derivation() derivation} to derivation.
     * @param derivation The value for derivation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivation(StructuredefinitionDerivation derivation);

    /**
     * Initializes the optional value {@link StructureDefinition#derivation() derivation} to derivation.
     * @param derivation The value for derivation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivation(Optional<? extends StructuredefinitionDerivation> derivation);

    /**
     * Initializes the optional value {@link StructureDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link StructureDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link StructureDefinition#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(List<StructureDefinition_Context> context);

    /**
     * Initializes the optional value {@link StructureDefinition#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(Optional<? extends List<StructureDefinition_Context>> context);

    /**
     * Initializes the optional value {@link StructureDefinition#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fhirVersion(StructuredefinitionFhirversion fhirVersion);

    /**
     * Initializes the optional value {@link StructureDefinition#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fhirVersion(Optional<? extends StructuredefinitionFhirversion> fhirVersion);

    /**
     * Initializes the optional value {@link StructureDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link StructureDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link StructureDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(StructuredefinitionKind kind);

    /**
     * Initializes the optional value {@link StructureDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(Optional<? extends StructuredefinitionKind> kind);

    /**
     * Initializes the optional value {@link StructureDefinition#mapping() mapping} to mapping.
     * @param mapping The value for mapping
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mapping(List<StructureDefinition_Mapping> mapping);

    /**
     * Initializes the optional value {@link StructureDefinition#mapping() mapping} to mapping.
     * @param mapping The value for mapping
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mapping(Optional<? extends List<StructureDefinition_Mapping>> mapping);

    /**
     * Initializes the optional value {@link StructureDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link StructureDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link StructureDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link StructureDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link StructureDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(Uri type);

    /**
     * Initializes the optional value {@link StructureDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends Uri> type);

    /**
     * Initializes the optional value {@link StructureDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link StructureDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link StructureDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link StructureDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link StructureDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link StructureDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link StructureDefinition#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for chained invocation
     */
    BuildFinal keyword(List<Coding> keyword);

    /**
     * Initializes the optional value {@link StructureDefinition#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal keyword(Optional<? extends List<Coding>> keyword);

    /**
     * Initializes the optional value {@link StructureDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link StructureDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link StructureDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link StructureDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link StructureDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link StructureDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

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
    BuildFinal _abstract(Optional<Boolean> _abstract);

    /**
     * Initializes the optional value {@link StructureDefinition#baseDefinition() baseDefinition} to baseDefinition.
     * @param baseDefinition The value for baseDefinition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal baseDefinition(Canonical baseDefinition);

    /**
     * Initializes the optional value {@link StructureDefinition#baseDefinition() baseDefinition} to baseDefinition.
     * @param baseDefinition The value for baseDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal baseDefinition(Optional<? extends Canonical> baseDefinition);

    /**
     * Initializes the optional value {@link StructureDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link StructureDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link StructureDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link StructureDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

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
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link StructureDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link StructureDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link StructureDefinition#differential() differential} to differential.
     * @param differential The value for differential
     * @return {@code this} builder for chained invocation
     */
    BuildFinal differential(StructureDefinition_Differential differential);

    /**
     * Initializes the optional value {@link StructureDefinition#differential() differential} to differential.
     * @param differential The value for differential
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal differential(Optional<? extends StructureDefinition_Differential> differential);

    /**
     * Initializes the optional value {@link StructureDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link StructureDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link StructureDefinition#snapshot() snapshot} to snapshot.
     * @param snapshot The value for snapshot
     * @return {@code this} builder for chained invocation
     */
    BuildFinal snapshot(StructureDefinition_Snapshot snapshot);

    /**
     * Initializes the optional value {@link StructureDefinition#snapshot() snapshot} to snapshot.
     * @param snapshot The value for snapshot
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal snapshot(Optional<? extends StructureDefinition_Snapshot> snapshot);

    /**
     * Initializes the optional value {@link StructureDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(StructuredefinitionStatus status);

    /**
     * Initializes the optional value {@link StructureDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends StructuredefinitionStatus> status);

    /**
     * Initializes the optional value {@link StructureDefinition#contextInvariant() contextInvariant} to contextInvariant.
     * @param contextInvariant The value for contextInvariant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contextInvariant(List<String> contextInvariant);

    /**
     * Initializes the optional value {@link StructureDefinition#contextInvariant() contextInvariant} to contextInvariant.
     * @param contextInvariant The value for contextInvariant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contextInvariant(Optional<? extends List<String>> contextInvariant);

    /**
     * Builds a new {@link StructureDefinition StructureDefinition}.
     * @return An immutable instance of StructureDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    StructureDefinition build();
  }
}
