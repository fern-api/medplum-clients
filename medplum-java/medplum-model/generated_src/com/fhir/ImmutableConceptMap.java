//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ConceptMap}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConceptMap.builder()}.
 */
@org.immutables.value.Generated(from = "ConceptMap", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConceptMap implements com.fhir.ConceptMap {
  private final @javax.annotation.Nullable java.lang.String sourceUri;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_Group> group;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.lang.String targetCanonical;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.lang.String targetUri;
  private final @javax.annotation.Nullable java.lang.String sourceCanonical;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.ConceptmapStatus status;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.Narrative text;

  private ImmutableConceptMap(
      @javax.annotation.Nullable java.lang.String sourceUri,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_Group> group,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.lang.String targetCanonical,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.lang.String targetUri,
      @javax.annotation.Nullable java.lang.String sourceCanonical,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.ConceptmapStatus status,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.Narrative text) {
    this.sourceUri = sourceUri;
    this.meta = meta;
    this.extension = extension;
    this.version = version;
    this.group = group;
    this.jurisdiction = jurisdiction;
    this.targetCanonical = targetCanonical;
    this.title = title;
    this.language = language;
    this.identifier = identifier;
    this.contained = contained;
    this.targetUri = targetUri;
    this.sourceCanonical = sourceCanonical;
    this.resourceType = resourceType;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.useContext = useContext;
    this.purpose = purpose;
    this.copyright = copyright;
    this.publisher = publisher;
    this.description = description;
    this.experimental = experimental;
    this.contact = contact;
    this.status = status;
    this.implicitRules = implicitRules;
    this.date = date;
    this.url = url;
    this.name = name;
    this.text = text;
  }

  /**
   * @return The value of the {@code sourceUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
  @Override
  public java.util.Optional<java.lang.String> sourceUri() {
    return java.util.Optional.ofNullable(sourceUri);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code group} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("group")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ConceptMap_Group>> group() {
    return java.util.Optional.ofNullable(group);
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
   * @return The value of the {@code targetCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetCanonical")
  @Override
  public java.util.Optional<java.lang.String> targetCanonical() {
    return java.util.Optional.ofNullable(targetCanonical);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code targetUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetUri")
  @Override
  public java.util.Optional<java.lang.String> targetUri() {
    return java.util.Optional.ofNullable(targetUri);
  }

  /**
   * @return The value of the {@code sourceCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceCanonical")
  @Override
  public java.util.Optional<java.lang.String> sourceCanonical() {
    return java.util.Optional.ofNullable(sourceCanonical);
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
   * @return The value of the {@code copyright} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("copyright")
  @Override
  public java.util.Optional<com.fhir.markdown> copyright() {
    return java.util.Optional.ofNullable(copyright);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ConceptmapStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#sourceUri() sourceUri} attribute.
   * @param value The value for sourceUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withSourceUri(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "sourceUri");
    if (java.util.Objects.equals(this.sourceUri, newValue)) return this;
    return new ImmutableConceptMap(
        newValue,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#sourceUri() sourceUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withSourceUri(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.sourceUri, value)) return this;
    return new ImmutableConceptMap(
        value,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        newValue,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        value,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        newValue,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        value,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        newValue,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        value,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#group() group} attribute.
   * @param value The value for group
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withGroup(java.util.List<com.fhir.ConceptMap_Group> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_Group> newValue = java.util.Objects.requireNonNull(value, "group");
    if (this.group == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        newValue,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#group() group} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for group
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withGroup(java.util.Optional<? extends java.util.List<com.fhir.ConceptMap_Group>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_Group> value = optional.orElse(null);
    if (this.group == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        value,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        newValue,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        value,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#targetCanonical() targetCanonical} attribute.
   * @param value The value for targetCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTargetCanonical(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "targetCanonical");
    if (java.util.Objects.equals(this.targetCanonical, newValue)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        newValue,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#targetCanonical() targetCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTargetCanonical(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.targetCanonical, value)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        value,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        newValue,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        value,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        newValue,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        value,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        newValue,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        value,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        newValue,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        value,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#targetUri() targetUri} attribute.
   * @param value The value for targetUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTargetUri(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "targetUri");
    if (java.util.Objects.equals(this.targetUri, newValue)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        newValue,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#targetUri() targetUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTargetUri(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.targetUri, value)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        value,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#sourceCanonical() sourceCanonical} attribute.
   * @param value The value for sourceCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withSourceCanonical(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "sourceCanonical");
    if (java.util.Objects.equals(this.sourceCanonical, newValue)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        newValue,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#sourceCanonical() sourceCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withSourceCanonical(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.sourceCanonical, value)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        value,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConceptMap#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConceptMap withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        newValue,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        newValue,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        value,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        newValue,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        value,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        newValue,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        value,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        newValue,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        value,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        newValue,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        value,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        newValue,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        value,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        newValue,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        value,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        newValue,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        value,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        newValue,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        value,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withStatus(com.fhir.ConceptmapStatus value) {
    @javax.annotation.Nullable com.fhir.ConceptmapStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        newValue,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withStatus(java.util.Optional<? extends com.fhir.ConceptmapStatus> optional) {
    @javax.annotation.Nullable com.fhir.ConceptmapStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        value,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        newValue,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        value,
        this.date,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        newValue,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        value,
        this.url,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        newValue,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        value,
        this.name,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableConceptMap(
        this.sourceUri,
        this.meta,
        this.extension,
        this.version,
        this.group,
        this.jurisdiction,
        this.targetCanonical,
        this.title,
        this.language,
        this.identifier,
        this.contained,
        this.targetUri,
        this.sourceCanonical,
        this.resourceType,
        this.id,
        this.modifierExtension,
        this.useContext,
        this.purpose,
        this.copyright,
        this.publisher,
        this.description,
        this.experimental,
        this.contact,
        this.status,
        this.implicitRules,
        this.date,
        this.url,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConceptMap} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConceptMap
        && equalTo((ImmutableConceptMap) another);
  }

  private boolean equalTo(ImmutableConceptMap another) {
    return java.util.Objects.equals(sourceUri, another.sourceUri)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(group, another.group)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(targetCanonical, another.targetCanonical)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(targetUri, another.targetUri)
        && java.util.Objects.equals(sourceCanonical, another.sourceCanonical)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code sourceUri}, {@code meta}, {@code extension}, {@code version}, {@code group}, {@code jurisdiction}, {@code targetCanonical}, {@code title}, {@code language}, {@code identifier}, {@code contained}, {@code targetUri}, {@code sourceCanonical}, {@code resourceType}, {@code id}, {@code modifierExtension}, {@code useContext}, {@code purpose}, {@code copyright}, {@code publisher}, {@code description}, {@code experimental}, {@code contact}, {@code status}, {@code implicitRules}, {@code date}, {@code url}, {@code name}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(sourceUri);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(group);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(targetCanonical);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(targetUri);
    h += (h << 5) + java.util.Objects.hashCode(sourceCanonical);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code ConceptMap} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ConceptMap{");
    if (sourceUri != null) {
      builder.append("sourceUri=").append(sourceUri);
    }
    if (meta != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (version != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (group != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("group=").append(group);
    }
    if (jurisdiction != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (targetCanonical != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("targetCanonical=").append(targetCanonical);
    }
    if (title != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identifier != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contained != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (targetUri != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("targetUri=").append(targetUri);
    }
    if (sourceCanonical != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("sourceCanonical=").append(sourceCanonical);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ConceptMap", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ConceptMap {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> sourceUri = java.util.Optional.empty();
    boolean sourceUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ConceptMap_Group>> group = java.util.Optional.empty();
    boolean groupIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> targetCanonical = java.util.Optional.empty();
    boolean targetCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> targetUri = java.util.Optional.empty();
    boolean targetUriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> sourceCanonical = java.util.Optional.empty();
    boolean sourceCanonicalIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ConceptmapStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
    public void setSourceUri(java.util.Optional<java.lang.String> sourceUri) {
      this.sourceUri = sourceUri;
      this.sourceUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    public void setGroup(java.util.Optional<java.util.List<com.fhir.ConceptMap_Group>> group) {
      this.group = group;
      this.groupIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetCanonical")
    public void setTargetCanonical(java.util.Optional<java.lang.String> targetCanonical) {
      this.targetCanonical = targetCanonical;
      this.targetCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetUri")
    public void setTargetUri(java.util.Optional<java.lang.String> targetUri) {
      this.targetUri = targetUri;
      this.targetUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceCanonical")
    public void setSourceCanonical(java.util.Optional<java.lang.String> sourceCanonical) {
      this.sourceCanonical = sourceCanonical;
      this.sourceCanonicalIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ConceptmapStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> sourceUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ConceptMap_Group>> group() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> targetCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> targetUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> sourceCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ConceptmapStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableConceptMap fromJson(Json json) {
    ImmutableConceptMap.Builder builder = ((ImmutableConceptMap.Builder) ImmutableConceptMap.builder());
    if (json.sourceUriIsSet) {
      builder.sourceUri(json.sourceUri);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.groupIsSet) {
      builder.group(json.group);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.targetCanonicalIsSet) {
      builder.targetCanonical(json.targetCanonical);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.targetUriIsSet) {
      builder.targetUri(json.targetUri);
    }
    if (json.sourceCanonicalIsSet) {
      builder.sourceCanonical(json.sourceCanonical);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    return (ImmutableConceptMap) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConceptMap} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConceptMap instance
   */
  public static ConceptMap copyOf(ConceptMap instance) {
    if (instance instanceof ImmutableConceptMap) {
      return (ImmutableConceptMap) instance;
    }
    return ((ImmutableConceptMap.Builder) ImmutableConceptMap.builder())
        .sourceUri(instance.sourceUri())
        .meta(instance.meta())
        .extension(instance.extension())
        .version(instance.version())
        .group(instance.group())
        .jurisdiction(instance.jurisdiction())
        .targetCanonical(instance.targetCanonical())
        .title(instance.title())
        .language(instance.language())
        .identifier(instance.identifier())
        .contained(instance.contained())
        .targetUri(instance.targetUri())
        .sourceCanonical(instance.sourceCanonical())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .useContext(instance.useContext())
        .purpose(instance.purpose())
        .copyright(instance.copyright())
        .publisher(instance.publisher())
        .description(instance.description())
        .experimental(instance.experimental())
        .contact(instance.contact())
        .status(instance.status())
        .implicitRules(instance.implicitRules())
        .date(instance.date())
        .url(instance.url())
        .name(instance.name())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link ConceptMap ConceptMap}.
   * <pre>
   * ImmutableConceptMap.builder()
   *    .sourceUri(String) // optional {@link ConceptMap#sourceUri() sourceUri}
   *    .meta(com.fhir.Meta) // optional {@link ConceptMap#meta() meta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ConceptMap#extension() extension}
   *    .version(String) // optional {@link ConceptMap#version() version}
   *    .group(List&amp;lt;com.fhir.ConceptMap_Group&amp;gt;) // optional {@link ConceptMap#group() group}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ConceptMap#jurisdiction() jurisdiction}
   *    .targetCanonical(String) // optional {@link ConceptMap#targetCanonical() targetCanonical}
   *    .title(String) // optional {@link ConceptMap#title() title}
   *    .language(com.fhir.code) // optional {@link ConceptMap#language() language}
   *    .identifier(com.fhir.Identifier) // optional {@link ConceptMap#identifier() identifier}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ConceptMap#contained() contained}
   *    .targetUri(String) // optional {@link ConceptMap#targetUri() targetUri}
   *    .sourceCanonical(String) // optional {@link ConceptMap#sourceCanonical() sourceCanonical}
   *    .resourceType(String) // required {@link ConceptMap#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link ConceptMap#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ConceptMap#modifierExtension() modifierExtension}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link ConceptMap#useContext() useContext}
   *    .purpose(com.fhir.markdown) // optional {@link ConceptMap#purpose() purpose}
   *    .copyright(com.fhir.markdown) // optional {@link ConceptMap#copyright() copyright}
   *    .publisher(String) // optional {@link ConceptMap#publisher() publisher}
   *    .description(com.fhir.markdown) // optional {@link ConceptMap#description() description}
   *    .experimental(Boolean) // optional {@link ConceptMap#experimental() experimental}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ConceptMap#contact() contact}
   *    .status(com.fhir.ConceptmapStatus) // optional {@link ConceptMap#status() status}
   *    .implicitRules(com.fhir.uri) // optional {@link ConceptMap#implicitRules() implicitRules}
   *    .date(com.fhir.dateTime) // optional {@link ConceptMap#date() date}
   *    .url(com.fhir.uri) // optional {@link ConceptMap#url() url}
   *    .name(String) // optional {@link ConceptMap#name() name}
   *    .text(com.fhir.Narrative) // optional {@link ConceptMap#text() text}
   *    .build();
   * </pre>
   * @return A new ConceptMap builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableConceptMap.Builder();
  }

  /**
   * Builds instances of type {@link ConceptMap ConceptMap}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ConceptMap", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_SOURCE_URI = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_VERSION = 0x8L;
    private static final long OPT_BIT_GROUP = 0x10L;
    private static final long OPT_BIT_JURISDICTION = 0x20L;
    private static final long OPT_BIT_TARGET_CANONICAL = 0x40L;
    private static final long OPT_BIT_TITLE = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_TARGET_URI = 0x800L;
    private static final long OPT_BIT_SOURCE_CANONICAL = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x8000L;
    private static final long OPT_BIT_PURPOSE = 0x10000L;
    private static final long OPT_BIT_COPYRIGHT = 0x20000L;
    private static final long OPT_BIT_PUBLISHER = 0x40000L;
    private static final long OPT_BIT_DESCRIPTION = 0x80000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x100000L;
    private static final long OPT_BIT_CONTACT = 0x200000L;
    private static final long OPT_BIT_STATUS = 0x400000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800000L;
    private static final long OPT_BIT_DATE = 0x1000000L;
    private static final long OPT_BIT_URL = 0x2000000L;
    private static final long OPT_BIT_NAME = 0x4000000L;
    private static final long OPT_BIT_TEXT = 0x8000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String sourceUri;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.ConceptMap_Group> group;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.lang.String targetCanonical;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String targetUri;
    private @javax.annotation.Nullable java.lang.String sourceCanonical;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.ConceptmapStatus status;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Narrative text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ConceptMap#sourceUri() sourceUri} to sourceUri.
     * @param sourceUri The value for sourceUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceUri(java.lang.String sourceUri) {
      checkNotIsSet(sourceUriIsSet(), "sourceUri");
      this.sourceUri = java.util.Objects.requireNonNull(sourceUri, "sourceUri");
      optBits |= OPT_BIT_SOURCE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#sourceUri() sourceUri} to sourceUri.
     * @param sourceUri The value for sourceUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUri")
    public final Builder sourceUri(java.util.Optional<java.lang.String> sourceUri) {
      checkNotIsSet(sourceUriIsSet(), "sourceUri");
      this.sourceUri = sourceUri.orElse(null);
      optBits |= OPT_BIT_SOURCE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#meta() meta} to meta.
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
     * Initializes the optional value {@link ConceptMap#meta() meta} to meta.
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
     * Initializes the optional value {@link ConceptMap#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap#version() version} to version.
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
     * Initializes the optional value {@link ConceptMap#version() version} to version.
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
     * Initializes the optional value {@link ConceptMap#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    public final Builder group(java.util.List<com.fhir.ConceptMap_Group> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = java.util.Objects.requireNonNull(group, "group");
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    public final Builder group(java.util.Optional<? extends java.util.List<com.fhir.ConceptMap_Group>> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = group.orElse(null);
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ConceptMap#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ConceptMap#targetCanonical() targetCanonical} to targetCanonical.
     * @param targetCanonical The value for targetCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetCanonical(java.lang.String targetCanonical) {
      checkNotIsSet(targetCanonicalIsSet(), "targetCanonical");
      this.targetCanonical = java.util.Objects.requireNonNull(targetCanonical, "targetCanonical");
      optBits |= OPT_BIT_TARGET_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#targetCanonical() targetCanonical} to targetCanonical.
     * @param targetCanonical The value for targetCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCanonical")
    public final Builder targetCanonical(java.util.Optional<java.lang.String> targetCanonical) {
      checkNotIsSet(targetCanonicalIsSet(), "targetCanonical");
      this.targetCanonical = targetCanonical.orElse(null);
      optBits |= OPT_BIT_TARGET_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#title() title} to title.
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
     * Initializes the optional value {@link ConceptMap#title() title} to title.
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
     * Initializes the optional value {@link ConceptMap#language() language} to language.
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
     * Initializes the optional value {@link ConceptMap#language() language} to language.
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
     * Initializes the optional value {@link ConceptMap#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ConceptMap#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ConceptMap#contained() contained} to contained.
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
     * Initializes the optional value {@link ConceptMap#contained() contained} to contained.
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
     * Initializes the optional value {@link ConceptMap#targetUri() targetUri} to targetUri.
     * @param targetUri The value for targetUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetUri(java.lang.String targetUri) {
      checkNotIsSet(targetUriIsSet(), "targetUri");
      this.targetUri = java.util.Objects.requireNonNull(targetUri, "targetUri");
      optBits |= OPT_BIT_TARGET_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#targetUri() targetUri} to targetUri.
     * @param targetUri The value for targetUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetUri")
    public final Builder targetUri(java.util.Optional<java.lang.String> targetUri) {
      checkNotIsSet(targetUriIsSet(), "targetUri");
      this.targetUri = targetUri.orElse(null);
      optBits |= OPT_BIT_TARGET_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#sourceCanonical() sourceCanonical} to sourceCanonical.
     * @param sourceCanonical The value for sourceCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceCanonical(java.lang.String sourceCanonical) {
      checkNotIsSet(sourceCanonicalIsSet(), "sourceCanonical");
      this.sourceCanonical = java.util.Objects.requireNonNull(sourceCanonical, "sourceCanonical");
      optBits |= OPT_BIT_SOURCE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#sourceCanonical() sourceCanonical} to sourceCanonical.
     * @param sourceCanonical The value for sourceCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceCanonical")
    public final Builder sourceCanonical(java.util.Optional<java.lang.String> sourceCanonical) {
      checkNotIsSet(sourceCanonicalIsSet(), "sourceCanonical");
      this.sourceCanonical = sourceCanonical.orElse(null);
      optBits |= OPT_BIT_SOURCE_CANONICAL;
      return this;
    }

    /**
     * Initializes the value for the {@link ConceptMap#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ConceptMap#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ConceptMap#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ConceptMap#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ConceptMap#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ConceptMap#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ConceptMap#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ConceptMap#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ConceptMap#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ConceptMap#description() description} to description.
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
     * Initializes the optional value {@link ConceptMap#description() description} to description.
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
     * Initializes the optional value {@link ConceptMap#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ConceptMap#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ConceptMap#contact() contact} to contact.
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
     * Initializes the optional value {@link ConceptMap#contact() contact} to contact.
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
     * Initializes the optional value {@link ConceptMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ConceptmapStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ConceptmapStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ConceptMap#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ConceptMap#date() date} to date.
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
     * Initializes the optional value {@link ConceptMap#date() date} to date.
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
     * Initializes the optional value {@link ConceptMap#url() url} to url.
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
     * Initializes the optional value {@link ConceptMap#url() url} to url.
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
     * Initializes the optional value {@link ConceptMap#name() name} to name.
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
     * Initializes the optional value {@link ConceptMap#name() name} to name.
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
     * Initializes the optional value {@link ConceptMap#text() text} to text.
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
     * Initializes the optional value {@link ConceptMap#text() text} to text.
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
     * Builds a new {@link ConceptMap ConceptMap}.
     * @return An immutable instance of ConceptMap
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ConceptMap build() {
      checkRequiredAttributes();
      return new ImmutableConceptMap(
          sourceUri,
          meta,
          extension,
          version,
          group,
          jurisdiction,
          targetCanonical,
          title,
          language,
          identifier,
          contained,
          targetUri,
          sourceCanonical,
          resourceType,
          id,
          modifierExtension,
          useContext,
          purpose,
          copyright,
          publisher,
          description,
          experimental,
          contact,
          status,
          implicitRules,
          date,
          url,
          name,
          text);
    }

    private boolean sourceUriIsSet() {
      return (optBits & OPT_BIT_SOURCE_URI) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean groupIsSet() {
      return (optBits & OPT_BIT_GROUP) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean targetCanonicalIsSet() {
      return (optBits & OPT_BIT_TARGET_CANONICAL) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean targetUriIsSet() {
      return (optBits & OPT_BIT_TARGET_URI) != 0;
    }

    private boolean sourceCanonicalIsSet() {
      return (optBits & OPT_BIT_SOURCE_CANONICAL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
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

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ConceptMap is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ConceptMap, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ConceptMap", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ConceptMap#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ConceptMap", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ConceptMap#sourceUri() sourceUri} to sourceUri.
     * @param sourceUri The value for sourceUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceUri(java.lang.String sourceUri);

    /**
     * Initializes the optional value {@link ConceptMap#sourceUri() sourceUri} to sourceUri.
     * @param sourceUri The value for sourceUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceUri(java.util.Optional<java.lang.String> sourceUri);

    /**
     * Initializes the optional value {@link ConceptMap#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ConceptMap#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ConceptMap#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ConceptMap#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ConceptMap#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link ConceptMap#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link ConceptMap#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    BuildFinal group(java.util.List<com.fhir.ConceptMap_Group> group);

    /**
     * Initializes the optional value {@link ConceptMap#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal group(java.util.Optional<? extends java.util.List<com.fhir.ConceptMap_Group>> group);

    /**
     * Initializes the optional value {@link ConceptMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ConceptMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ConceptMap#targetCanonical() targetCanonical} to targetCanonical.
     * @param targetCanonical The value for targetCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetCanonical(java.lang.String targetCanonical);

    /**
     * Initializes the optional value {@link ConceptMap#targetCanonical() targetCanonical} to targetCanonical.
     * @param targetCanonical The value for targetCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetCanonical(java.util.Optional<java.lang.String> targetCanonical);

    /**
     * Initializes the optional value {@link ConceptMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link ConceptMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link ConceptMap#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ConceptMap#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ConceptMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link ConceptMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ConceptMap#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ConceptMap#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ConceptMap#targetUri() targetUri} to targetUri.
     * @param targetUri The value for targetUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetUri(java.lang.String targetUri);

    /**
     * Initializes the optional value {@link ConceptMap#targetUri() targetUri} to targetUri.
     * @param targetUri The value for targetUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetUri(java.util.Optional<java.lang.String> targetUri);

    /**
     * Initializes the optional value {@link ConceptMap#sourceCanonical() sourceCanonical} to sourceCanonical.
     * @param sourceCanonical The value for sourceCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceCanonical(java.lang.String sourceCanonical);

    /**
     * Initializes the optional value {@link ConceptMap#sourceCanonical() sourceCanonical} to sourceCanonical.
     * @param sourceCanonical The value for sourceCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceCanonical(java.util.Optional<java.lang.String> sourceCanonical);

    /**
     * Initializes the optional value {@link ConceptMap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ConceptMap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ConceptMap#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ConceptMap#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ConceptMap#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link ConceptMap#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ConceptMap#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link ConceptMap#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link ConceptMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link ConceptMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link ConceptMap#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link ConceptMap#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link ConceptMap#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link ConceptMap#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link ConceptMap#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link ConceptMap#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link ConceptMap#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link ConceptMap#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ConceptMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ConceptmapStatus status);

    /**
     * Initializes the optional value {@link ConceptMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ConceptmapStatus> status);

    /**
     * Initializes the optional value {@link ConceptMap#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ConceptMap#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ConceptMap#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link ConceptMap#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link ConceptMap#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link ConceptMap#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link ConceptMap#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link ConceptMap#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link ConceptMap#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ConceptMap#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Builds a new {@link ConceptMap ConceptMap}.
     * @return An immutable instance of ConceptMap
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ConceptMap build();
  }
}
