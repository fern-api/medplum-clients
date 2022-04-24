//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link StructureMap}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap.builder()}.
 */
@org.immutables.value.Generated(from = "StructureMap", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap implements com.fhir.StructureMap {
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final java.util.List<com.fhir.StructureMap_Group> group;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> _import;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Structure> structure;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.StructuremapStatus status;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable com.fhir.markdown description;

  private ImmutableStructureMap(
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable com.fhir.code language,
      java.util.List<com.fhir.StructureMap_Group> group,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> _import,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Structure> structure,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.StructuremapStatus status,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri url,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable com.fhir.markdown description) {
    this.meta = meta;
    this.publisher = publisher;
    this.title = title;
    this.language = language;
    this.group = group;
    this._import = _import;
    this.contained = contained;
    this.copyright = copyright;
    this.identifier = identifier;
    this.date = date;
    this.version = version;
    this.useContext = useContext;
    this.structure = structure;
    this.extension = extension;
    this.text = text;
    this.contact = contact;
    this.status = status;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.url = url;
    this.resourceType = resourceType;
    this.id = id;
    this.experimental = experimental;
    this.jurisdiction = jurisdiction;
    this.name = name;
    this.purpose = purpose;
    this.description = description;
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
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
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
   * @return The value of the {@code group} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("group")
  @Override
  public java.util.List<com.fhir.StructureMap_Group> group() {
    return group;
  }

  /**
   * @return The value of the {@code _import} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("import")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> _import() {
    return java.util.Optional.ofNullable(_import);
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
   * @return The value of the {@code copyright} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("copyright")
  @Override
  public java.util.Optional<com.fhir.markdown> copyright() {
    return java.util.Optional.ofNullable(copyright);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
  }

  /**
   * @return The value of the {@code structure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("structure")
  @Override
  public java.util.Optional<java.util.List<com.fhir.StructureMap_Structure>> structure() {
    return java.util.Optional.ofNullable(structure);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
  public java.util.Optional<com.fhir.StructuremapStatus> status() {
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableStructureMap(
        newValue,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableStructureMap(
        value,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableStructureMap(
        this.meta,
        newValue,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableStructureMap(
        this.meta,
        value,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        newValue,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        value,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        newValue,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        value,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap#group() group}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withGroup(com.fhir.StructureMap_Group... elements) {
    java.util.List<com.fhir.StructureMap_Group> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        newValue,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap#group() group}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of group elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withGroup(Iterable<? extends com.fhir.StructureMap_Group> elements) {
    if (this.group == elements) return this;
    java.util.List<com.fhir.StructureMap_Group> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        newValue,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#_import() _import} attribute.
   * @param value The value for _import
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap with_import(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "_import");
    if (this._import == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        newValue,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#_import() _import} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _import
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap with_import(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this._import == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        value,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        newValue,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        value,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        newValue,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        value,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        newValue,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        value,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        newValue,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        value,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        newValue,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        value,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        newValue,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        value,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#structure() structure} attribute.
   * @param value The value for structure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withStructure(java.util.List<com.fhir.StructureMap_Structure> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Structure> newValue = java.util.Objects.requireNonNull(value, "structure");
    if (this.structure == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        newValue,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#structure() structure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for structure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withStructure(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Structure>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Structure> value = optional.orElse(null);
    if (this.structure == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        value,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        newValue,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        value,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        newValue,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        value,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        newValue,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        value,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withStatus(com.fhir.StructuremapStatus value) {
    @javax.annotation.Nullable com.fhir.StructuremapStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withStatus(java.util.Optional<? extends com.fhir.StructuremapStatus> optional) {
    @javax.annotation.Nullable com.fhir.StructuremapStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        newValue,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        value,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        newValue,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        value,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StructureMap#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStructureMap withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        newValue,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        newValue,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        value,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        newValue,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        value,
        this.jurisdiction,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        newValue,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        value,
        this.name,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        newValue,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        value,
        this.purpose,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableStructureMap(
        this.meta,
        this.publisher,
        this.title,
        this.language,
        this.group,
        this._import,
        this.contained,
        this.copyright,
        this.identifier,
        this.date,
        this.version,
        this.useContext,
        this.structure,
        this.extension,
        this.text,
        this.contact,
        this.status,
        this.implicitRules,
        this.modifierExtension,
        this.url,
        this.resourceType,
        this.id,
        this.experimental,
        this.jurisdiction,
        this.name,
        this.purpose,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap
        && equalTo((ImmutableStructureMap) another);
  }

  private boolean equalTo(ImmutableStructureMap another) {
    return java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(language, another.language)
        && group.equals(another.group)
        && java.util.Objects.equals(_import, another._import)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(structure, another.structure)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(url, another.url)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code publisher}, {@code title}, {@code language}, {@code group}, {@code _import}, {@code contained}, {@code copyright}, {@code identifier}, {@code date}, {@code version}, {@code useContext}, {@code structure}, {@code extension}, {@code text}, {@code contact}, {@code status}, {@code implicitRules}, {@code modifierExtension}, {@code url}, {@code resourceType}, {@code id}, {@code experimental}, {@code jurisdiction}, {@code name}, {@code purpose}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + group.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(_import);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(structure);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("StructureMap{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (publisher != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (title != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (language != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("group=").append(group);
    if (_import != null) {
      builder.append(", ");
      builder.append("_import=").append(_import);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (structure != null) {
      builder.append(", ");
      builder.append("structure=").append(structure);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
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
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "StructureMap", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.StructureMap {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Group> group = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> _import = java.util.Optional.empty();
    boolean _importIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.StructureMap_Structure>> structure = java.util.Optional.empty();
    boolean structureIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.StructuremapStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    public void setGroup(java.util.List<com.fhir.StructureMap_Group> group) {
      this.group = group;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("import")
    public void set_import(java.util.Optional<java.util.List<com.fhir.canonical>> _import) {
      this._import = _import;
      this._importIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("structure")
    public void setStructure(java.util.Optional<java.util.List<com.fhir.StructureMap_Structure>> structure) {
      this.structure = structure;
      this.structureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.StructuremapStatus> status) {
      this.status = status;
      this.statusIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.StructureMap_Group> group() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> _import() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.StructureMap_Structure>> structure() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.StructuremapStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap fromJson(Json json) {
    ImmutableStructureMap.Builder builder = ((ImmutableStructureMap.Builder) ImmutableStructureMap.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.group != null) {
      builder.addAllGroup(json.group);
    }
    if (json._importIsSet) {
      builder._import(json._import);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.structureIsSet) {
      builder.structure(json.structure);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
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
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableStructureMap) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap instance
   */
  public static StructureMap copyOf(StructureMap instance) {
    if (instance instanceof ImmutableStructureMap) {
      return (ImmutableStructureMap) instance;
    }
    return ((ImmutableStructureMap.Builder) ImmutableStructureMap.builder())
        .meta(instance.meta())
        .publisher(instance.publisher())
        .title(instance.title())
        .language(instance.language())
        .addAllGroup(instance.group())
        ._import(instance._import())
        .contained(instance.contained())
        .copyright(instance.copyright())
        .identifier(instance.identifier())
        .date(instance.date())
        .version(instance.version())
        .useContext(instance.useContext())
        .structure(instance.structure())
        .extension(instance.extension())
        .text(instance.text())
        .contact(instance.contact())
        .status(instance.status())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .url(instance.url())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .experimental(instance.experimental())
        .jurisdiction(instance.jurisdiction())
        .name(instance.name())
        .purpose(instance.purpose())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap StructureMap}.
   * <pre>
   * ImmutableStructureMap.builder()
   *    .meta(com.fhir.Meta) // optional {@link StructureMap#meta() meta}
   *    .publisher(String) // optional {@link StructureMap#publisher() publisher}
   *    .title(String) // optional {@link StructureMap#title() title}
   *    .language(com.fhir.code) // optional {@link StructureMap#language() language}
   *    .addGroup|addAllGroup(com.fhir.StructureMap_Group) // {@link StructureMap#group() group} elements
   *    ._import(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link StructureMap#_import() _import}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link StructureMap#contained() contained}
   *    .copyright(com.fhir.markdown) // optional {@link StructureMap#copyright() copyright}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link StructureMap#identifier() identifier}
   *    .date(com.fhir.dateTime) // optional {@link StructureMap#date() date}
   *    .version(String) // optional {@link StructureMap#version() version}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link StructureMap#useContext() useContext}
   *    .structure(List&amp;lt;com.fhir.StructureMap_Structure&amp;gt;) // optional {@link StructureMap#structure() structure}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap#extension() extension}
   *    .text(com.fhir.Narrative) // optional {@link StructureMap#text() text}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link StructureMap#contact() contact}
   *    .status(com.fhir.StructuremapStatus) // optional {@link StructureMap#status() status}
   *    .implicitRules(com.fhir.uri) // optional {@link StructureMap#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap#modifierExtension() modifierExtension}
   *    .url(com.fhir.uri) // optional {@link StructureMap#url() url}
   *    .resourceType(String) // required {@link StructureMap#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link StructureMap#id() id}
   *    .experimental(Boolean) // optional {@link StructureMap#experimental() experimental}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link StructureMap#jurisdiction() jurisdiction}
   *    .name(String) // optional {@link StructureMap#name() name}
   *    .purpose(com.fhir.markdown) // optional {@link StructureMap#purpose() purpose}
   *    .description(com.fhir.markdown) // optional {@link StructureMap#description() description}
   *    .build();
   * </pre>
   * @return A new StructureMap builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableStructureMap.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap StructureMap}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "StructureMap", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_PUBLISHER = 0x2L;
    private static final long OPT_BIT_TITLE = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT__IMPORT = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_COPYRIGHT = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_DATE = 0x100L;
    private static final long OPT_BIT_VERSION = 0x200L;
    private static final long OPT_BIT_USE_CONTEXT = 0x400L;
    private static final long OPT_BIT_STRUCTURE = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_TEXT = 0x2000L;
    private static final long OPT_BIT_CONTACT = 0x4000L;
    private static final long OPT_BIT_STATUS = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000L;
    private static final long OPT_BIT_URL = 0x40000L;
    private static final long OPT_BIT_ID = 0x80000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x100000L;
    private static final long OPT_BIT_JURISDICTION = 0x200000L;
    private static final long OPT_BIT_NAME = 0x400000L;
    private static final long OPT_BIT_PURPOSE = 0x800000L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.code language;
    private final java.util.List<com.fhir.StructureMap_Group> group = new java.util.ArrayList<com.fhir.StructureMap_Group>();
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> _import;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.util.List<com.fhir.StructureMap_Structure> structure;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.StructuremapStatus status;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable com.fhir.markdown description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap#meta() meta} to meta.
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
     * Initializes the optional value {@link StructureMap#meta() meta} to meta.
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
     * Initializes the optional value {@link StructureMap#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link StructureMap#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link StructureMap#title() title} to title.
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
     * Initializes the optional value {@link StructureMap#title() title} to title.
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
     * Initializes the optional value {@link StructureMap#language() language} to language.
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
     * Initializes the optional value {@link StructureMap#language() language} to language.
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
     * Adds one element to {@link StructureMap#group() group} list.
     * @param element A group element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGroup(com.fhir.StructureMap_Group element) {
      this.group.add(java.util.Objects.requireNonNull(element, "group element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureMap#group() group} list.
     * @param elements An array of group elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGroup(com.fhir.StructureMap_Group... elements) {
      for (com.fhir.StructureMap_Group element : elements) {
        this.group.add(java.util.Objects.requireNonNull(element, "group element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link StructureMap#group() group} list.
     * @param elements An iterable of group elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllGroup(Iterable<? extends com.fhir.StructureMap_Group> elements) {
      for (com.fhir.StructureMap_Group element : elements) {
        this.group.add(java.util.Objects.requireNonNull(element, "group element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#_import() _import} to _import.
     * @param _import The value for _import
     * @return {@code this} builder for chained invocation
     */
    public final Builder _import(java.util.List<com.fhir.canonical> _import) {
      checkNotIsSet(_importIsSet(), "_import");
      this._import = java.util.Objects.requireNonNull(_import, "_import");
      optBits |= OPT_BIT__IMPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#_import() _import} to _import.
     * @param _import The value for _import
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("import")
    public final Builder _import(java.util.Optional<? extends java.util.List<com.fhir.canonical>> _import) {
      checkNotIsSet(_importIsSet(), "_import");
      this._import = _import.orElse(null);
      optBits |= OPT_BIT__IMPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#contained() contained} to contained.
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
     * Initializes the optional value {@link StructureMap#contained() contained} to contained.
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
     * Initializes the optional value {@link StructureMap#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link StructureMap#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link StructureMap#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link StructureMap#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link StructureMap#date() date} to date.
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
     * Initializes the optional value {@link StructureMap#date() date} to date.
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
     * Initializes the optional value {@link StructureMap#version() version} to version.
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
     * Initializes the optional value {@link StructureMap#version() version} to version.
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
     * Initializes the optional value {@link StructureMap#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link StructureMap#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link StructureMap#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for chained invocation
     */
    public final Builder structure(java.util.List<com.fhir.StructureMap_Structure> structure) {
      checkNotIsSet(structureIsSet(), "structure");
      this.structure = java.util.Objects.requireNonNull(structure, "structure");
      optBits |= OPT_BIT_STRUCTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("structure")
    public final Builder structure(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Structure>> structure) {
      checkNotIsSet(structureIsSet(), "structure");
      this.structure = structure.orElse(null);
      optBits |= OPT_BIT_STRUCTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap#text() text} to text.
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
     * Initializes the optional value {@link StructureMap#text() text} to text.
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
     * Initializes the optional value {@link StructureMap#contact() contact} to contact.
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
     * Initializes the optional value {@link StructureMap#contact() contact} to contact.
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
     * Initializes the optional value {@link StructureMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.StructuremapStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.StructuremapStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link StructureMap#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link StructureMap#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap#url() url} to url.
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
     * Initializes the optional value {@link StructureMap#url() url} to url.
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
     * Initializes the value for the {@link StructureMap#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link StructureMap#id() id} to id.
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
     * Initializes the optional value {@link StructureMap#id() id} to id.
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
     * Initializes the optional value {@link StructureMap#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link StructureMap#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link StructureMap#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link StructureMap#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link StructureMap#name() name} to name.
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
     * Initializes the optional value {@link StructureMap#name() name} to name.
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
     * Initializes the optional value {@link StructureMap#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link StructureMap#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link StructureMap#description() description} to description.
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
     * Initializes the optional value {@link StructureMap#description() description} to description.
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
     * Builds a new {@link StructureMap StructureMap}.
     * @return An immutable instance of StructureMap
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.StructureMap build() {
      checkRequiredAttributes();
      return new ImmutableStructureMap(
          meta,
          publisher,
          title,
          language,
          createUnmodifiableList(true, group),
          _import,
          contained,
          copyright,
          identifier,
          date,
          version,
          useContext,
          structure,
          extension,
          text,
          contact,
          status,
          implicitRules,
          modifierExtension,
          url,
          resourceType,
          id,
          experimental,
          jurisdiction,
          name,
          purpose,
          description);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean _importIsSet() {
      return (optBits & OPT_BIT__IMPORT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean structureIsSet() {
      return (optBits & OPT_BIT_STRUCTURE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
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

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of StructureMap is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build StructureMap, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "StructureMap", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link StructureMap#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "StructureMap", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link StructureMap#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link StructureMap#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link StructureMap#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link StructureMap#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link StructureMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link StructureMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link StructureMap#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link StructureMap#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Adds one element to {@link StructureMap#group() group} list.
     * @param element A group element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addGroup(com.fhir.StructureMap_Group element);

    /**
     * Adds elements to {@link StructureMap#group() group} list.
     * @param elements An array of group elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addGroup(com.fhir.StructureMap_Group... elements);

    /**
     * Adds elements to {@link StructureMap#group() group} list.
     * @param elements An iterable of group elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllGroup(Iterable<? extends com.fhir.StructureMap_Group> elements);

    /**
     * Initializes the optional value {@link StructureMap#_import() _import} to _import.
     * @param _import The value for _import
     * @return {@code this} builder for chained invocation
     */
    BuildFinal _import(java.util.List<com.fhir.canonical> _import);

    /**
     * Initializes the optional value {@link StructureMap#_import() _import} to _import.
     * @param _import The value for _import
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _import(java.util.Optional<? extends java.util.List<com.fhir.canonical>> _import);

    /**
     * Initializes the optional value {@link StructureMap#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link StructureMap#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link StructureMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link StructureMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link StructureMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link StructureMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link StructureMap#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link StructureMap#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link StructureMap#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link StructureMap#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link StructureMap#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link StructureMap#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link StructureMap#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal structure(java.util.List<com.fhir.StructureMap_Structure> structure);

    /**
     * Initializes the optional value {@link StructureMap#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal structure(java.util.Optional<? extends java.util.List<com.fhir.StructureMap_Structure>> structure);

    /**
     * Initializes the optional value {@link StructureMap#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link StructureMap#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link StructureMap#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link StructureMap#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link StructureMap#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link StructureMap#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link StructureMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.StructuremapStatus status);

    /**
     * Initializes the optional value {@link StructureMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.StructuremapStatus> status);

    /**
     * Initializes the optional value {@link StructureMap#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link StructureMap#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link StructureMap#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link StructureMap#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link StructureMap#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link StructureMap#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link StructureMap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link StructureMap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link StructureMap#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link StructureMap#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link StructureMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link StructureMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link StructureMap#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link StructureMap#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link StructureMap#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link StructureMap#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link StructureMap#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link StructureMap#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Builds a new {@link StructureMap StructureMap}.
     * @return An immutable instance of StructureMap
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    StructureMap build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
