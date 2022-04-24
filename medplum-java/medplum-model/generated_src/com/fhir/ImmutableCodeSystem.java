//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CodeSystem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem.builder()}.
 */
@org.immutables.value.Generated(from = "CodeSystem", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem implements com.fhir.CodeSystem {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> concept;
  private final @javax.annotation.Nullable com.fhir.CodesystemStatus status;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.canonical supplements;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.canonical valueSet;
  private final @javax.annotation.Nullable java.lang.String version;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.Boolean versionNeeded;
  private final @javax.annotation.Nullable com.fhir.unsignedInt count;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.Boolean compositional;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable com.fhir.CodesystemHierarchymeaning hierarchyMeaning;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Filter> filter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.lang.Boolean caseSensitive;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property> property;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.CodesystemContent content;

  private ImmutableCodeSystem(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> concept,
      @javax.annotation.Nullable com.fhir.CodesystemStatus status,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.canonical supplements,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.canonical valueSet,
      @javax.annotation.Nullable java.lang.String version,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.Boolean versionNeeded,
      @javax.annotation.Nullable com.fhir.unsignedInt count,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.Boolean compositional,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable com.fhir.CodesystemHierarchymeaning hierarchyMeaning,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Filter> filter,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.lang.Boolean caseSensitive,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property> property,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.CodesystemContent content) {
    this.modifierExtension = modifierExtension;
    this.publisher = publisher;
    this.concept = concept;
    this.status = status;
    this.experimental = experimental;
    this.text = text;
    this.supplements = supplements;
    this.jurisdiction = jurisdiction;
    this.extension = extension;
    this.valueSet = valueSet;
    this.version = version;
    this.resourceType = resourceType;
    this.id = id;
    this.versionNeeded = versionNeeded;
    this.count = count;
    this.meta = meta;
    this.compositional = compositional;
    this.contact = contact;
    this.purpose = purpose;
    this.hierarchyMeaning = hierarchyMeaning;
    this.filter = filter;
    this.identifier = identifier;
    this.name = name;
    this.implicitRules = implicitRules;
    this.title = title;
    this.caseSensitive = caseSensitive;
    this.property = property;
    this.contained = contained;
    this.description = description;
    this.url = url;
    this.language = language;
    this.date = date;
    this.useContext = useContext;
    this.copyright = copyright;
    this.content = content;
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
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
  }

  /**
   * @return The value of the {@code concept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("concept")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeSystem_Concept>> concept() {
    return java.util.Optional.ofNullable(concept);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.CodesystemStatus> status() {
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code supplements} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supplements")
  @Override
  public java.util.Optional<com.fhir.canonical> supplements() {
    return java.util.Optional.ofNullable(supplements);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code valueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
  @Override
  public java.util.Optional<com.fhir.canonical> valueSet() {
    return java.util.Optional.ofNullable(valueSet);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code versionNeeded} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("versionNeeded")
  @Override
  public java.util.Optional<java.lang.Boolean> versionNeeded() {
    return java.util.Optional.ofNullable(versionNeeded);
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("count")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> count() {
    return java.util.Optional.ofNullable(count);
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
   * @return The value of the {@code compositional} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("compositional")
  @Override
  public java.util.Optional<java.lang.Boolean> compositional() {
    return java.util.Optional.ofNullable(compositional);
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
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<com.fhir.markdown> purpose() {
    return java.util.Optional.ofNullable(purpose);
  }

  /**
   * @return The value of the {@code hierarchyMeaning} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hierarchyMeaning")
  @Override
  public java.util.Optional<com.fhir.CodesystemHierarchymeaning> hierarchyMeaning() {
    return java.util.Optional.ofNullable(hierarchyMeaning);
  }

  /**
   * @return The value of the {@code filter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("filter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeSystem_Filter>> filter() {
    return java.util.Optional.ofNullable(filter);
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
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code caseSensitive} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("caseSensitive")
  @Override
  public java.util.Optional<java.lang.Boolean> caseSensitive() {
    return java.util.Optional.ofNullable(caseSensitive);
  }

  /**
   * @return The value of the {@code property} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("property")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeSystem_Property>> property() {
    return java.util.Optional.ofNullable(property);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
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
   * @return The value of the {@code content} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  @Override
  public java.util.Optional<com.fhir.CodesystemContent> content() {
    return java.util.Optional.ofNullable(content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem(
        newValue,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem(
        value,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        newValue,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        value,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#concept() concept} attribute.
   * @param value The value for concept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withConcept(java.util.List<com.fhir.CodeSystem_Concept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> newValue = java.util.Objects.requireNonNull(value, "concept");
    if (this.concept == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        newValue,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#concept() concept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for concept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withConcept(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Concept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> value = optional.orElse(null);
    if (this.concept == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        value,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withStatus(com.fhir.CodesystemStatus value) {
    @javax.annotation.Nullable com.fhir.CodesystemStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        newValue,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withStatus(java.util.Optional<? extends com.fhir.CodesystemStatus> optional) {
    @javax.annotation.Nullable com.fhir.CodesystemStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        value,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        newValue,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        value,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        newValue,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        value,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#supplements() supplements} attribute.
   * @param value The value for supplements
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withSupplements(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "supplements");
    if (this.supplements == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        newValue,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#supplements() supplements} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supplements
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withSupplements(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.supplements == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        value,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        newValue,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        value,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        newValue,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        value,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#valueSet() valueSet} attribute.
   * @param value The value for valueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withValueSet(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "valueSet");
    if (this.valueSet == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        newValue,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#valueSet() valueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withValueSet(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.valueSet == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        value,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        newValue,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        value,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CodeSystem#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCodeSystem withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        newValue,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        newValue,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        value,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#versionNeeded() versionNeeded} attribute.
   * @param value The value for versionNeeded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withVersionNeeded(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.versionNeeded, newValue)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        newValue,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#versionNeeded() versionNeeded} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versionNeeded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withVersionNeeded(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.versionNeeded, value)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        value,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#count() count} attribute.
   * @param value The value for count
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCount(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "count");
    if (this.count == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        newValue,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#count() count} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for count
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withCount(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.count == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        value,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        newValue,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        value,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#compositional() compositional} attribute.
   * @param value The value for compositional
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCompositional(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.compositional, newValue)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        newValue,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#compositional() compositional} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compositional
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCompositional(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.compositional, value)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        value,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        newValue,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        value,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        newValue,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        value,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} attribute.
   * @param value The value for hierarchyMeaning
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withHierarchyMeaning(com.fhir.CodesystemHierarchymeaning value) {
    @javax.annotation.Nullable com.fhir.CodesystemHierarchymeaning newValue = java.util.Objects.requireNonNull(value, "hierarchyMeaning");
    if (this.hierarchyMeaning == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        newValue,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hierarchyMeaning
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withHierarchyMeaning(java.util.Optional<? extends com.fhir.CodesystemHierarchymeaning> optional) {
    @javax.annotation.Nullable com.fhir.CodesystemHierarchymeaning value = optional.orElse(null);
    if (this.hierarchyMeaning == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        value,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#filter() filter} attribute.
   * @param value The value for filter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withFilter(java.util.List<com.fhir.CodeSystem_Filter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Filter> newValue = java.util.Objects.requireNonNull(value, "filter");
    if (this.filter == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        newValue,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#filter() filter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for filter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withFilter(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Filter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Filter> value = optional.orElse(null);
    if (this.filter == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        value,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        newValue,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        value,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        newValue,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        value,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        newValue,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        value,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        newValue,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        value,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#caseSensitive() caseSensitive} attribute.
   * @param value The value for caseSensitive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCaseSensitive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.caseSensitive, newValue)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        newValue,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#caseSensitive() caseSensitive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for caseSensitive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCaseSensitive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.caseSensitive, value)) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        value,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withProperty(java.util.List<com.fhir.CodeSystem_Property> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property> newValue = java.util.Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        newValue,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withProperty(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Property>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        value,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        newValue,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        value,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        newValue,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        value,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        newValue,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        value,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        newValue,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        value,
        this.date,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        newValue,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        value,
        this.useContext,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        newValue,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        value,
        this.copyright,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        newValue,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        value,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#content() content} attribute.
   * @param value The value for content
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withContent(com.fhir.CodesystemContent value) {
    @javax.annotation.Nullable com.fhir.CodesystemContent newValue = java.util.Objects.requireNonNull(value, "content");
    if (this.content == newValue) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#content() content} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for content
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withContent(java.util.Optional<? extends com.fhir.CodesystemContent> optional) {
    @javax.annotation.Nullable com.fhir.CodesystemContent value = optional.orElse(null);
    if (this.content == value) return this;
    return new ImmutableCodeSystem(
        this.modifierExtension,
        this.publisher,
        this.concept,
        this.status,
        this.experimental,
        this.text,
        this.supplements,
        this.jurisdiction,
        this.extension,
        this.valueSet,
        this.version,
        this.resourceType,
        this.id,
        this.versionNeeded,
        this.count,
        this.meta,
        this.compositional,
        this.contact,
        this.purpose,
        this.hierarchyMeaning,
        this.filter,
        this.identifier,
        this.name,
        this.implicitRules,
        this.title,
        this.caseSensitive,
        this.property,
        this.contained,
        this.description,
        this.url,
        this.language,
        this.date,
        this.useContext,
        this.copyright,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem
        && equalTo((ImmutableCodeSystem) another);
  }

  private boolean equalTo(ImmutableCodeSystem another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(concept, another.concept)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(supplements, another.supplements)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(valueSet, another.valueSet)
        && java.util.Objects.equals(version, another.version)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(versionNeeded, another.versionNeeded)
        && java.util.Objects.equals(count, another.count)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(compositional, another.compositional)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(hierarchyMeaning, another.hierarchyMeaning)
        && java.util.Objects.equals(filter, another.filter)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(caseSensitive, another.caseSensitive)
        && java.util.Objects.equals(property, another.property)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(content, another.content);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code publisher}, {@code concept}, {@code status}, {@code experimental}, {@code text}, {@code supplements}, {@code jurisdiction}, {@code extension}, {@code valueSet}, {@code version}, {@code resourceType}, {@code id}, {@code versionNeeded}, {@code count}, {@code meta}, {@code compositional}, {@code contact}, {@code purpose}, {@code hierarchyMeaning}, {@code filter}, {@code identifier}, {@code name}, {@code implicitRules}, {@code title}, {@code caseSensitive}, {@code property}, {@code contained}, {@code description}, {@code url}, {@code language}, {@code date}, {@code useContext}, {@code copyright}, {@code content}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(concept);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(supplements);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(valueSet);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(versionNeeded);
    h += (h << 5) + java.util.Objects.hashCode(count);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(compositional);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(hierarchyMeaning);
    h += (h << 5) + java.util.Objects.hashCode(filter);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(caseSensitive);
    h += (h << 5) + java.util.Objects.hashCode(property);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(content);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CodeSystem{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (publisher != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (concept != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("concept=").append(concept);
    }
    if (status != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (experimental != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (text != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (supplements != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("supplements=").append(supplements);
    }
    if (jurisdiction != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valueSet != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("valueSet=").append(valueSet);
    }
    if (version != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (versionNeeded != null) {
      builder.append(", ");
      builder.append("versionNeeded=").append(versionNeeded);
    }
    if (count != null) {
      builder.append(", ");
      builder.append("count=").append(count);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (compositional != null) {
      builder.append(", ");
      builder.append("compositional=").append(compositional);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (hierarchyMeaning != null) {
      builder.append(", ");
      builder.append("hierarchyMeaning=").append(hierarchyMeaning);
    }
    if (filter != null) {
      builder.append(", ");
      builder.append("filter=").append(filter);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (caseSensitive != null) {
      builder.append(", ");
      builder.append("caseSensitive=").append(caseSensitive);
    }
    if (property != null) {
      builder.append(", ");
      builder.append("property=").append(property);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (content != null) {
      builder.append(", ");
      builder.append("content=").append(content);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CodeSystem", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CodeSystem {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeSystem_Concept>> concept = java.util.Optional.empty();
    boolean conceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodesystemStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> supplements = java.util.Optional.empty();
    boolean supplementsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> valueSet = java.util.Optional.empty();
    boolean valueSetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> versionNeeded = java.util.Optional.empty();
    boolean versionNeededIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> count = java.util.Optional.empty();
    boolean countIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> compositional = java.util.Optional.empty();
    boolean compositionalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodesystemHierarchymeaning> hierarchyMeaning = java.util.Optional.empty();
    boolean hierarchyMeaningIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeSystem_Filter>> filter = java.util.Optional.empty();
    boolean filterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> caseSensitive = java.util.Optional.empty();
    boolean caseSensitiveIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeSystem_Property>> property = java.util.Optional.empty();
    boolean propertyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodesystemContent> content = java.util.Optional.empty();
    boolean contentIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("concept")
    public void setConcept(java.util.Optional<java.util.List<com.fhir.CodeSystem_Concept>> concept) {
      this.concept = concept;
      this.conceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.CodesystemStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supplements")
    public void setSupplements(java.util.Optional<com.fhir.canonical> supplements) {
      this.supplements = supplements;
      this.supplementsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
    public void setValueSet(java.util.Optional<com.fhir.canonical> valueSet) {
      this.valueSet = valueSet;
      this.valueSetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("versionNeeded")
    public void setVersionNeeded(java.util.Optional<java.lang.Boolean> versionNeeded) {
      this.versionNeeded = versionNeeded;
      this.versionNeededIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    public void setCount(java.util.Optional<com.fhir.unsignedInt> count) {
      this.count = count;
      this.countIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("compositional")
    public void setCompositional(java.util.Optional<java.lang.Boolean> compositional) {
      this.compositional = compositional;
      this.compositionalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("hierarchyMeaning")
    public void setHierarchyMeaning(java.util.Optional<com.fhir.CodesystemHierarchymeaning> hierarchyMeaning) {
      this.hierarchyMeaning = hierarchyMeaning;
      this.hierarchyMeaningIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    public void setFilter(java.util.Optional<java.util.List<com.fhir.CodeSystem_Filter>> filter) {
      this.filter = filter;
      this.filterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("caseSensitive")
    public void setCaseSensitive(java.util.Optional<java.lang.Boolean> caseSensitive) {
      this.caseSensitive = caseSensitive;
      this.caseSensitiveIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public void setProperty(java.util.Optional<java.util.List<com.fhir.CodeSystem_Property>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    public void setContent(java.util.Optional<com.fhir.CodesystemContent> content) {
      this.content = content;
      this.contentIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeSystem_Concept>> concept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodesystemStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> supplements() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> valueSet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> versionNeeded() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> count() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> compositional() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodesystemHierarchymeaning> hierarchyMeaning() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeSystem_Filter>> filter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> caseSensitive() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeSystem_Property>> property() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodesystemContent> content() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem fromJson(Json json) {
    ImmutableCodeSystem.Builder builder = ((ImmutableCodeSystem.Builder) ImmutableCodeSystem.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.conceptIsSet) {
      builder.concept(json.concept);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.supplementsIsSet) {
      builder.supplements(json.supplements);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueSetIsSet) {
      builder.valueSet(json.valueSet);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionNeededIsSet) {
      builder.versionNeeded(json.versionNeeded);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.compositionalIsSet) {
      builder.compositional(json.compositional);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.hierarchyMeaningIsSet) {
      builder.hierarchyMeaning(json.hierarchyMeaning);
    }
    if (json.filterIsSet) {
      builder.filter(json.filter);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.caseSensitiveIsSet) {
      builder.caseSensitive(json.caseSensitive);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.contentIsSet) {
      builder.content(json.content);
    }
    return (ImmutableCodeSystem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeSystem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeSystem instance
   */
  public static CodeSystem copyOf(CodeSystem instance) {
    if (instance instanceof ImmutableCodeSystem) {
      return (ImmutableCodeSystem) instance;
    }
    return ((ImmutableCodeSystem.Builder) ImmutableCodeSystem.builder())
        .modifierExtension(instance.modifierExtension())
        .publisher(instance.publisher())
        .concept(instance.concept())
        .status(instance.status())
        .experimental(instance.experimental())
        .text(instance.text())
        .supplements(instance.supplements())
        .jurisdiction(instance.jurisdiction())
        .extension(instance.extension())
        .valueSet(instance.valueSet())
        .version(instance.version())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .versionNeeded(instance.versionNeeded())
        .count(instance.count())
        .meta(instance.meta())
        .compositional(instance.compositional())
        .contact(instance.contact())
        .purpose(instance.purpose())
        .hierarchyMeaning(instance.hierarchyMeaning())
        .filter(instance.filter())
        .identifier(instance.identifier())
        .name(instance.name())
        .implicitRules(instance.implicitRules())
        .title(instance.title())
        .caseSensitive(instance.caseSensitive())
        .property(instance.property())
        .contained(instance.contained())
        .description(instance.description())
        .url(instance.url())
        .language(instance.language())
        .date(instance.date())
        .useContext(instance.useContext())
        .copyright(instance.copyright())
        .content(instance.content())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem CodeSystem}.
   * <pre>
   * ImmutableCodeSystem.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem#modifierExtension() modifierExtension}
   *    .publisher(String) // optional {@link CodeSystem#publisher() publisher}
   *    .concept(List&amp;lt;com.fhir.CodeSystem_Concept&amp;gt;) // optional {@link CodeSystem#concept() concept}
   *    .status(com.fhir.CodesystemStatus) // optional {@link CodeSystem#status() status}
   *    .experimental(Boolean) // optional {@link CodeSystem#experimental() experimental}
   *    .text(com.fhir.Narrative) // optional {@link CodeSystem#text() text}
   *    .supplements(com.fhir.canonical) // optional {@link CodeSystem#supplements() supplements}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CodeSystem#jurisdiction() jurisdiction}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem#extension() extension}
   *    .valueSet(com.fhir.canonical) // optional {@link CodeSystem#valueSet() valueSet}
   *    .version(String) // optional {@link CodeSystem#version() version}
   *    .resourceType(String) // required {@link CodeSystem#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link CodeSystem#id() id}
   *    .versionNeeded(Boolean) // optional {@link CodeSystem#versionNeeded() versionNeeded}
   *    .count(com.fhir.unsignedInt) // optional {@link CodeSystem#count() count}
   *    .meta(com.fhir.Meta) // optional {@link CodeSystem#meta() meta}
   *    .compositional(Boolean) // optional {@link CodeSystem#compositional() compositional}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link CodeSystem#contact() contact}
   *    .purpose(com.fhir.markdown) // optional {@link CodeSystem#purpose() purpose}
   *    .hierarchyMeaning(com.fhir.CodesystemHierarchymeaning) // optional {@link CodeSystem#hierarchyMeaning() hierarchyMeaning}
   *    .filter(List&amp;lt;com.fhir.CodeSystem_Filter&amp;gt;) // optional {@link CodeSystem#filter() filter}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link CodeSystem#identifier() identifier}
   *    .name(String) // optional {@link CodeSystem#name() name}
   *    .implicitRules(com.fhir.uri) // optional {@link CodeSystem#implicitRules() implicitRules}
   *    .title(String) // optional {@link CodeSystem#title() title}
   *    .caseSensitive(Boolean) // optional {@link CodeSystem#caseSensitive() caseSensitive}
   *    .property(List&amp;lt;com.fhir.CodeSystem_Property&amp;gt;) // optional {@link CodeSystem#property() property}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link CodeSystem#contained() contained}
   *    .description(com.fhir.markdown) // optional {@link CodeSystem#description() description}
   *    .url(com.fhir.uri) // optional {@link CodeSystem#url() url}
   *    .language(com.fhir.code) // optional {@link CodeSystem#language() language}
   *    .date(com.fhir.dateTime) // optional {@link CodeSystem#date() date}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link CodeSystem#useContext() useContext}
   *    .copyright(com.fhir.markdown) // optional {@link CodeSystem#copyright() copyright}
   *    .content(com.fhir.CodesystemContent) // optional {@link CodeSystem#content() content}
   *    .build();
   * </pre>
   * @return A new CodeSystem builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCodeSystem.Builder();
  }

  /**
   * Builds instances of type {@link CodeSystem CodeSystem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CodeSystem", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_PUBLISHER = 0x2L;
    private static final long OPT_BIT_CONCEPT = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_SUPPLEMENTS = 0x40L;
    private static final long OPT_BIT_JURISDICTION = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_VALUE_SET = 0x200L;
    private static final long OPT_BIT_VERSION = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_VERSION_NEEDED = 0x1000L;
    private static final long OPT_BIT_COUNT = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_COMPOSITIONAL = 0x8000L;
    private static final long OPT_BIT_CONTACT = 0x10000L;
    private static final long OPT_BIT_PURPOSE = 0x20000L;
    private static final long OPT_BIT_HIERARCHY_MEANING = 0x40000L;
    private static final long OPT_BIT_FILTER = 0x80000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_NAME = 0x200000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400000L;
    private static final long OPT_BIT_TITLE = 0x800000L;
    private static final long OPT_BIT_CASE_SENSITIVE = 0x1000000L;
    private static final long OPT_BIT_PROPERTY = 0x2000000L;
    private static final long OPT_BIT_CONTAINED = 0x4000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x8000000L;
    private static final long OPT_BIT_URL = 0x10000000L;
    private static final long OPT_BIT_LANGUAGE = 0x20000000L;
    private static final long OPT_BIT_DATE = 0x40000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x80000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x100000000L;
    private static final long OPT_BIT_CONTENT = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Concept> concept;
    private @javax.annotation.Nullable com.fhir.CodesystemStatus status;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.canonical supplements;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.canonical valueSet;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.Boolean versionNeeded;
    private @javax.annotation.Nullable com.fhir.unsignedInt count;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.Boolean compositional;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable com.fhir.CodesystemHierarchymeaning hierarchyMeaning;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Filter> filter;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.lang.Boolean caseSensitive;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeSystem_Property> property;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.CodesystemContent content;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link CodeSystem#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link CodeSystem#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for chained invocation
     */
    public final Builder concept(java.util.List<com.fhir.CodeSystem_Concept> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = java.util.Objects.requireNonNull(concept, "concept");
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("concept")
    public final Builder concept(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Concept>> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = concept.orElse(null);
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.CodesystemStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.CodesystemStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link CodeSystem#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link CodeSystem#text() text} to text.
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
     * Initializes the optional value {@link CodeSystem#text() text} to text.
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
     * Initializes the optional value {@link CodeSystem#supplements() supplements} to supplements.
     * @param supplements The value for supplements
     * @return {@code this} builder for chained invocation
     */
    public final Builder supplements(com.fhir.canonical supplements) {
      checkNotIsSet(supplementsIsSet(), "supplements");
      this.supplements = java.util.Objects.requireNonNull(supplements, "supplements");
      optBits |= OPT_BIT_SUPPLEMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#supplements() supplements} to supplements.
     * @param supplements The value for supplements
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supplements")
    public final Builder supplements(java.util.Optional<? extends com.fhir.canonical> supplements) {
      checkNotIsSet(supplementsIsSet(), "supplements");
      this.supplements = supplements.orElse(null);
      optBits |= OPT_BIT_SUPPLEMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link CodeSystem#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link CodeSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSet(com.fhir.canonical valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = java.util.Objects.requireNonNull(valueSet, "valueSet");
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
    public final Builder valueSet(java.util.Optional<? extends com.fhir.canonical> valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = valueSet.orElse(null);
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#version() version} to version.
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
     * Initializes the optional value {@link CodeSystem#version() version} to version.
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
     * Initializes the value for the {@link CodeSystem#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CodeSystem#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem#versionNeeded() versionNeeded} to versionNeeded.
     * @param versionNeeded The value for versionNeeded
     * @return {@code this} builder for chained invocation
     */
    public final Builder versionNeeded(boolean versionNeeded) {
      checkNotIsSet(versionNeededIsSet(), "versionNeeded");
      this.versionNeeded = versionNeeded;
      optBits |= OPT_BIT_VERSION_NEEDED;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#versionNeeded() versionNeeded} to versionNeeded.
     * @param versionNeeded The value for versionNeeded
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versionNeeded")
    public final Builder versionNeeded(java.util.Optional<java.lang.Boolean> versionNeeded) {
      checkNotIsSet(versionNeededIsSet(), "versionNeeded");
      this.versionNeeded = versionNeeded.orElse(null);
      optBits |= OPT_BIT_VERSION_NEEDED;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for chained invocation
     */
    public final Builder count(com.fhir.unsignedInt count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = java.util.Objects.requireNonNull(count, "count");
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    public final Builder count(java.util.Optional<? extends com.fhir.unsignedInt> count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = count.orElse(null);
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#meta() meta} to meta.
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
     * Initializes the optional value {@link CodeSystem#meta() meta} to meta.
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
     * Initializes the optional value {@link CodeSystem#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for chained invocation
     */
    public final Builder compositional(boolean compositional) {
      checkNotIsSet(compositionalIsSet(), "compositional");
      this.compositional = compositional;
      optBits |= OPT_BIT_COMPOSITIONAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compositional")
    public final Builder compositional(java.util.Optional<java.lang.Boolean> compositional) {
      checkNotIsSet(compositionalIsSet(), "compositional");
      this.compositional = compositional.orElse(null);
      optBits |= OPT_BIT_COMPOSITIONAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#contact() contact} to contact.
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
     * Initializes the optional value {@link CodeSystem#contact() contact} to contact.
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
     * Initializes the optional value {@link CodeSystem#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link CodeSystem#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} to hierarchyMeaning.
     * @param hierarchyMeaning The value for hierarchyMeaning
     * @return {@code this} builder for chained invocation
     */
    public final Builder hierarchyMeaning(com.fhir.CodesystemHierarchymeaning hierarchyMeaning) {
      checkNotIsSet(hierarchyMeaningIsSet(), "hierarchyMeaning");
      this.hierarchyMeaning = java.util.Objects.requireNonNull(hierarchyMeaning, "hierarchyMeaning");
      optBits |= OPT_BIT_HIERARCHY_MEANING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} to hierarchyMeaning.
     * @param hierarchyMeaning The value for hierarchyMeaning
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hierarchyMeaning")
    public final Builder hierarchyMeaning(java.util.Optional<? extends com.fhir.CodesystemHierarchymeaning> hierarchyMeaning) {
      checkNotIsSet(hierarchyMeaningIsSet(), "hierarchyMeaning");
      this.hierarchyMeaning = hierarchyMeaning.orElse(null);
      optBits |= OPT_BIT_HIERARCHY_MEANING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for chained invocation
     */
    public final Builder filter(java.util.List<com.fhir.CodeSystem_Filter> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = java.util.Objects.requireNonNull(filter, "filter");
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    public final Builder filter(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Filter>> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = filter.orElse(null);
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CodeSystem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CodeSystem#name() name} to name.
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
     * Initializes the optional value {@link CodeSystem#name() name} to name.
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
     * Initializes the optional value {@link CodeSystem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CodeSystem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CodeSystem#title() title} to title.
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
     * Initializes the optional value {@link CodeSystem#title() title} to title.
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
     * Initializes the optional value {@link CodeSystem#caseSensitive() caseSensitive} to caseSensitive.
     * @param caseSensitive The value for caseSensitive
     * @return {@code this} builder for chained invocation
     */
    public final Builder caseSensitive(boolean caseSensitive) {
      checkNotIsSet(caseSensitiveIsSet(), "caseSensitive");
      this.caseSensitive = caseSensitive;
      optBits |= OPT_BIT_CASE_SENSITIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#caseSensitive() caseSensitive} to caseSensitive.
     * @param caseSensitive The value for caseSensitive
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caseSensitive")
    public final Builder caseSensitive(java.util.Optional<java.lang.Boolean> caseSensitive) {
      checkNotIsSet(caseSensitiveIsSet(), "caseSensitive");
      this.caseSensitive = caseSensitive.orElse(null);
      optBits |= OPT_BIT_CASE_SENSITIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(java.util.List<com.fhir.CodeSystem_Property> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = java.util.Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public final Builder property(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Property>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#contained() contained} to contained.
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
     * Initializes the optional value {@link CodeSystem#contained() contained} to contained.
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
     * Initializes the optional value {@link CodeSystem#description() description} to description.
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
     * Initializes the optional value {@link CodeSystem#description() description} to description.
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
     * Initializes the optional value {@link CodeSystem#url() url} to url.
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
     * Initializes the optional value {@link CodeSystem#url() url} to url.
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
     * Initializes the optional value {@link CodeSystem#language() language} to language.
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
     * Initializes the optional value {@link CodeSystem#language() language} to language.
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
     * Initializes the optional value {@link CodeSystem#date() date} to date.
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
     * Initializes the optional value {@link CodeSystem#date() date} to date.
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
     * Initializes the optional value {@link CodeSystem#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link CodeSystem#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link CodeSystem#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link CodeSystem#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link CodeSystem#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for chained invocation
     */
    public final Builder content(com.fhir.CodesystemContent content) {
      checkNotIsSet(contentIsSet(), "content");
      this.content = java.util.Objects.requireNonNull(content, "content");
      optBits |= OPT_BIT_CONTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    public final Builder content(java.util.Optional<? extends com.fhir.CodesystemContent> content) {
      checkNotIsSet(contentIsSet(), "content");
      this.content = content.orElse(null);
      optBits |= OPT_BIT_CONTENT;
      return this;
    }

    /**
     * Builds a new {@link CodeSystem CodeSystem}.
     * @return An immutable instance of CodeSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CodeSystem build() {
      checkRequiredAttributes();
      return new ImmutableCodeSystem(
          modifierExtension,
          publisher,
          concept,
          status,
          experimental,
          text,
          supplements,
          jurisdiction,
          extension,
          valueSet,
          version,
          resourceType,
          id,
          versionNeeded,
          count,
          meta,
          compositional,
          contact,
          purpose,
          hierarchyMeaning,
          filter,
          identifier,
          name,
          implicitRules,
          title,
          caseSensitive,
          property,
          contained,
          description,
          url,
          language,
          date,
          useContext,
          copyright,
          content);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean conceptIsSet() {
      return (optBits & OPT_BIT_CONCEPT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean supplementsIsSet() {
      return (optBits & OPT_BIT_SUPPLEMENTS) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueSetIsSet() {
      return (optBits & OPT_BIT_VALUE_SET) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionNeededIsSet() {
      return (optBits & OPT_BIT_VERSION_NEEDED) != 0;
    }

    private boolean countIsSet() {
      return (optBits & OPT_BIT_COUNT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean compositionalIsSet() {
      return (optBits & OPT_BIT_COMPOSITIONAL) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean hierarchyMeaningIsSet() {
      return (optBits & OPT_BIT_HIERARCHY_MEANING) != 0;
    }

    private boolean filterIsSet() {
      return (optBits & OPT_BIT_FILTER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean caseSensitiveIsSet() {
      return (optBits & OPT_BIT_CASE_SENSITIVE) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean contentIsSet() {
      return (optBits & OPT_BIT_CONTENT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CodeSystem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CodeSystem, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CodeSystem", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CodeSystem#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "CodeSystem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CodeSystem#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link CodeSystem#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link CodeSystem#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal concept(java.util.List<com.fhir.CodeSystem_Concept> concept);

    /**
     * Initializes the optional value {@link CodeSystem#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal concept(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Concept>> concept);

    /**
     * Initializes the optional value {@link CodeSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.CodesystemStatus status);

    /**
     * Initializes the optional value {@link CodeSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.CodesystemStatus> status);

    /**
     * Initializes the optional value {@link CodeSystem#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link CodeSystem#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link CodeSystem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link CodeSystem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link CodeSystem#supplements() supplements} to supplements.
     * @param supplements The value for supplements
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supplements(com.fhir.canonical supplements);

    /**
     * Initializes the optional value {@link CodeSystem#supplements() supplements} to supplements.
     * @param supplements The value for supplements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supplements(java.util.Optional<? extends com.fhir.canonical> supplements);

    /**
     * Initializes the optional value {@link CodeSystem#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link CodeSystem#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link CodeSystem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CodeSystem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CodeSystem#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueSet(com.fhir.canonical valueSet);

    /**
     * Initializes the optional value {@link CodeSystem#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueSet(java.util.Optional<? extends com.fhir.canonical> valueSet);

    /**
     * Initializes the optional value {@link CodeSystem#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link CodeSystem#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link CodeSystem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link CodeSystem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link CodeSystem#versionNeeded() versionNeeded} to versionNeeded.
     * @param versionNeeded The value for versionNeeded
     * @return {@code this} builder for chained invocation
     */
    BuildFinal versionNeeded(boolean versionNeeded);

    /**
     * Initializes the optional value {@link CodeSystem#versionNeeded() versionNeeded} to versionNeeded.
     * @param versionNeeded The value for versionNeeded
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal versionNeeded(java.util.Optional<java.lang.Boolean> versionNeeded);

    /**
     * Initializes the optional value {@link CodeSystem#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for chained invocation
     */
    BuildFinal count(com.fhir.unsignedInt count);

    /**
     * Initializes the optional value {@link CodeSystem#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal count(java.util.Optional<? extends com.fhir.unsignedInt> count);

    /**
     * Initializes the optional value {@link CodeSystem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link CodeSystem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link CodeSystem#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for chained invocation
     */
    BuildFinal compositional(boolean compositional);

    /**
     * Initializes the optional value {@link CodeSystem#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal compositional(java.util.Optional<java.lang.Boolean> compositional);

    /**
     * Initializes the optional value {@link CodeSystem#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link CodeSystem#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link CodeSystem#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link CodeSystem#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} to hierarchyMeaning.
     * @param hierarchyMeaning The value for hierarchyMeaning
     * @return {@code this} builder for chained invocation
     */
    BuildFinal hierarchyMeaning(com.fhir.CodesystemHierarchymeaning hierarchyMeaning);

    /**
     * Initializes the optional value {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} to hierarchyMeaning.
     * @param hierarchyMeaning The value for hierarchyMeaning
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal hierarchyMeaning(java.util.Optional<? extends com.fhir.CodesystemHierarchymeaning> hierarchyMeaning);

    /**
     * Initializes the optional value {@link CodeSystem#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal filter(java.util.List<com.fhir.CodeSystem_Filter> filter);

    /**
     * Initializes the optional value {@link CodeSystem#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal filter(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Filter>> filter);

    /**
     * Initializes the optional value {@link CodeSystem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link CodeSystem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link CodeSystem#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link CodeSystem#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link CodeSystem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link CodeSystem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link CodeSystem#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link CodeSystem#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link CodeSystem#caseSensitive() caseSensitive} to caseSensitive.
     * @param caseSensitive The value for caseSensitive
     * @return {@code this} builder for chained invocation
     */
    BuildFinal caseSensitive(boolean caseSensitive);

    /**
     * Initializes the optional value {@link CodeSystem#caseSensitive() caseSensitive} to caseSensitive.
     * @param caseSensitive The value for caseSensitive
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal caseSensitive(java.util.Optional<java.lang.Boolean> caseSensitive);

    /**
     * Initializes the optional value {@link CodeSystem#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    BuildFinal property(java.util.List<com.fhir.CodeSystem_Property> property);

    /**
     * Initializes the optional value {@link CodeSystem#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal property(java.util.Optional<? extends java.util.List<com.fhir.CodeSystem_Property>> property);

    /**
     * Initializes the optional value {@link CodeSystem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link CodeSystem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link CodeSystem#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link CodeSystem#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link CodeSystem#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link CodeSystem#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link CodeSystem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link CodeSystem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link CodeSystem#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link CodeSystem#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link CodeSystem#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link CodeSystem#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link CodeSystem#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link CodeSystem#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link CodeSystem#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for chained invocation
     */
    BuildFinal content(com.fhir.CodesystemContent content);

    /**
     * Initializes the optional value {@link CodeSystem#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal content(java.util.Optional<? extends com.fhir.CodesystemContent> content);

    /**
     * Builds a new {@link CodeSystem CodeSystem}.
     * @return An immutable instance of CodeSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CodeSystem build();
  }
}
