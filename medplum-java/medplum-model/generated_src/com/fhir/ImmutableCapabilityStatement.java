//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CapabilityStatement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement.builder()}.
 */
@org.immutables.value.Generated(from = "CapabilityStatement", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement implements com.fhir.CapabilityStatement {
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Document> document;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.CapabilitystatementKind kind;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> format;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiates;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable com.fhir.CapabilitystatementFhirversion fhirVersion;
  private final @javax.annotation.Nullable com.fhir.CapabilityStatement_Implementation implementation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> patchFormat;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> imports;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Messaging> messaging;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CapabilitystatementStatus status;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.CapabilityStatement_Software software;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> implementationGuide;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Rest> rest;

  private ImmutableCapabilityStatement(
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Document> document,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.CapabilitystatementKind kind,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable java.util.List<com.fhir.code> format,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiates,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable com.fhir.CapabilitystatementFhirversion fhirVersion,
      @javax.annotation.Nullable com.fhir.CapabilityStatement_Implementation implementation,
      @javax.annotation.Nullable java.util.List<com.fhir.code> patchFormat,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> imports,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Messaging> messaging,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CapabilitystatementStatus status,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.CapabilityStatement_Software software,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> implementationGuide,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Rest> rest) {
    this.publisher = publisher;
    this.text = text;
    this.date = date;
    this.document = document;
    this.experimental = experimental;
    this.kind = kind;
    this.language = language;
    this.contained = contained;
    this.copyright = copyright;
    this.format = format;
    this.instantiates = instantiates;
    this.jurisdiction = jurisdiction;
    this.url = url;
    this.fhirVersion = fhirVersion;
    this.implementation = implementation;
    this.patchFormat = patchFormat;
    this.imports = imports;
    this.meta = meta;
    this.messaging = messaging;
    this.name = name;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.status = status;
    this.title = title;
    this.contact = contact;
    this.software = software;
    this.resourceType = resourceType;
    this.description = description;
    this.useContext = useContext;
    this.implementationGuide = implementationGuide;
    this.id = id;
    this.version = version;
    this.modifierExtension = modifierExtension;
    this.purpose = purpose;
    this.rest = rest;
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code document} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("document")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Document>> document() {
    return java.util.Optional.ofNullable(document);
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
   * @return The value of the {@code kind} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kind")
  @Override
  public java.util.Optional<com.fhir.CapabilitystatementKind> kind() {
    return java.util.Optional.ofNullable(kind);
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
   * @return The value of the {@code format} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("format")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> format() {
    return java.util.Optional.ofNullable(format);
  }

  /**
   * @return The value of the {@code instantiates} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiates")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> instantiates() {
    return java.util.Optional.ofNullable(instantiates);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code fhirVersion} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
  @Override
  public java.util.Optional<com.fhir.CapabilitystatementFhirversion> fhirVersion() {
    return java.util.Optional.ofNullable(fhirVersion);
  }

  /**
   * @return The value of the {@code implementation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implementation")
  @Override
  public java.util.Optional<com.fhir.CapabilityStatement_Implementation> implementation() {
    return java.util.Optional.ofNullable(implementation);
  }

  /**
   * @return The value of the {@code patchFormat} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patchFormat")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> patchFormat() {
    return java.util.Optional.ofNullable(patchFormat);
  }

  /**
   * @return The value of the {@code imports} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("imports")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> imports() {
    return java.util.Optional.ofNullable(imports);
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
   * @return The value of the {@code messaging} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("messaging")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Messaging>> messaging() {
    return java.util.Optional.ofNullable(messaging);
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
  public java.util.Optional<com.fhir.CapabilitystatementStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code software} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("software")
  @Override
  public java.util.Optional<com.fhir.CapabilityStatement_Software> software() {
    return java.util.Optional.ofNullable(software);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code implementationGuide} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implementationGuide")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> implementationGuide() {
    return java.util.Optional.ofNullable(implementationGuide);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
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
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<com.fhir.markdown> purpose() {
    return java.util.Optional.ofNullable(purpose);
  }

  /**
   * @return The value of the {@code rest} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rest")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Rest>> rest() {
    return java.util.Optional.ofNullable(rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableCapabilityStatement(
        newValue,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableCapabilityStatement(
        value,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        newValue,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        value,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        newValue,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        value,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#document() document} attribute.
   * @param value The value for document
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withDocument(java.util.List<com.fhir.CapabilityStatement_Document> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Document> newValue = java.util.Objects.requireNonNull(value, "document");
    if (this.document == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        newValue,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#document() document} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for document
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withDocument(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Document>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Document> value = optional.orElse(null);
    if (this.document == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        value,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        newValue,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        value,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withKind(com.fhir.CapabilitystatementKind value) {
    @javax.annotation.Nullable com.fhir.CapabilitystatementKind newValue = java.util.Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        newValue,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withKind(java.util.Optional<? extends com.fhir.CapabilitystatementKind> optional) {
    @javax.annotation.Nullable com.fhir.CapabilitystatementKind value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        value,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        newValue,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        value,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        newValue,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        value,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        newValue,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        value,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#format() format} attribute.
   * @param value The value for format
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withFormat(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "format");
    if (this.format == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        newValue,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#format() format} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for format
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withFormat(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.format == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        value,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#instantiates() instantiates} attribute.
   * @param value The value for instantiates
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withInstantiates(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiates");
    if (this.instantiates == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        newValue,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#instantiates() instantiates} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiates
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withInstantiates(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiates == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        value,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        newValue,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        value,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        newValue,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        value,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#fhirVersion() fhirVersion} attribute.
   * @param value The value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withFhirVersion(com.fhir.CapabilitystatementFhirversion value) {
    @javax.annotation.Nullable com.fhir.CapabilitystatementFhirversion newValue = java.util.Objects.requireNonNull(value, "fhirVersion");
    if (this.fhirVersion == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        newValue,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#fhirVersion() fhirVersion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withFhirVersion(java.util.Optional<? extends com.fhir.CapabilitystatementFhirversion> optional) {
    @javax.annotation.Nullable com.fhir.CapabilitystatementFhirversion value = optional.orElse(null);
    if (this.fhirVersion == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        value,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#implementation() implementation} attribute.
   * @param value The value for implementation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withImplementation(com.fhir.CapabilityStatement_Implementation value) {
    @javax.annotation.Nullable com.fhir.CapabilityStatement_Implementation newValue = java.util.Objects.requireNonNull(value, "implementation");
    if (this.implementation == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        newValue,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#implementation() implementation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implementation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withImplementation(java.util.Optional<? extends com.fhir.CapabilityStatement_Implementation> optional) {
    @javax.annotation.Nullable com.fhir.CapabilityStatement_Implementation value = optional.orElse(null);
    if (this.implementation == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        value,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#patchFormat() patchFormat} attribute.
   * @param value The value for patchFormat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withPatchFormat(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "patchFormat");
    if (this.patchFormat == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        newValue,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#patchFormat() patchFormat} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patchFormat
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withPatchFormat(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.patchFormat == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        value,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#imports() imports} attribute.
   * @param value The value for imports
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withImports(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "imports");
    if (this.imports == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        newValue,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#imports() imports} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for imports
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withImports(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.imports == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        value,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        newValue,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        value,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#messaging() messaging} attribute.
   * @param value The value for messaging
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withMessaging(java.util.List<com.fhir.CapabilityStatement_Messaging> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Messaging> newValue = java.util.Objects.requireNonNull(value, "messaging");
    if (this.messaging == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        newValue,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#messaging() messaging} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for messaging
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withMessaging(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Messaging>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Messaging> value = optional.orElse(null);
    if (this.messaging == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        value,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        newValue,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        value,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        newValue,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        value,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        newValue,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        value,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withStatus(com.fhir.CapabilitystatementStatus value) {
    @javax.annotation.Nullable com.fhir.CapabilitystatementStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        newValue,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withStatus(java.util.Optional<? extends com.fhir.CapabilitystatementStatus> optional) {
    @javax.annotation.Nullable com.fhir.CapabilitystatementStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        value,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        newValue,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        value,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        newValue,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        value,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#software() software} attribute.
   * @param value The value for software
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withSoftware(com.fhir.CapabilityStatement_Software value) {
    @javax.annotation.Nullable com.fhir.CapabilityStatement_Software newValue = java.util.Objects.requireNonNull(value, "software");
    if (this.software == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        newValue,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#software() software} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for software
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withSoftware(java.util.Optional<? extends com.fhir.CapabilityStatement_Software> optional) {
    @javax.annotation.Nullable com.fhir.CapabilityStatement_Software value = optional.orElse(null);
    if (this.software == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        value,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CapabilityStatement#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCapabilityStatement withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        newValue,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        newValue,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        value,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        newValue,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        value,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#implementationGuide() implementationGuide} attribute.
   * @param value The value for implementationGuide
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withImplementationGuide(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "implementationGuide");
    if (this.implementationGuide == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        newValue,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#implementationGuide() implementationGuide} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implementationGuide
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withImplementationGuide(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.implementationGuide == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        value,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        newValue,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        value,
        this.version,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        newValue,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        value,
        this.modifierExtension,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        newValue,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        value,
        this.purpose,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        newValue,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        value,
        this.rest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement#rest() rest} attribute.
   * @param value The value for rest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement withRest(java.util.List<com.fhir.CapabilityStatement_Rest> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Rest> newValue = java.util.Objects.requireNonNull(value, "rest");
    if (this.rest == newValue) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement#rest() rest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement withRest(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Rest>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Rest> value = optional.orElse(null);
    if (this.rest == value) return this;
    return new ImmutableCapabilityStatement(
        this.publisher,
        this.text,
        this.date,
        this.document,
        this.experimental,
        this.kind,
        this.language,
        this.contained,
        this.copyright,
        this.format,
        this.instantiates,
        this.jurisdiction,
        this.url,
        this.fhirVersion,
        this.implementation,
        this.patchFormat,
        this.imports,
        this.meta,
        this.messaging,
        this.name,
        this.implicitRules,
        this.extension,
        this.status,
        this.title,
        this.contact,
        this.software,
        this.resourceType,
        this.description,
        this.useContext,
        this.implementationGuide,
        this.id,
        this.version,
        this.modifierExtension,
        this.purpose,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement
        && equalTo((ImmutableCapabilityStatement) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement another) {
    return java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(document, another.document)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(kind, another.kind)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(format, another.format)
        && java.util.Objects.equals(instantiates, another.instantiates)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(fhirVersion, another.fhirVersion)
        && java.util.Objects.equals(implementation, another.implementation)
        && java.util.Objects.equals(patchFormat, another.patchFormat)
        && java.util.Objects.equals(imports, another.imports)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(messaging, another.messaging)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(software, another.software)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(implementationGuide, another.implementationGuide)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(rest, another.rest);
  }

  /**
   * Computes a hash code from attributes: {@code publisher}, {@code text}, {@code date}, {@code document}, {@code experimental}, {@code kind}, {@code language}, {@code contained}, {@code copyright}, {@code format}, {@code instantiates}, {@code jurisdiction}, {@code url}, {@code fhirVersion}, {@code implementation}, {@code patchFormat}, {@code imports}, {@code meta}, {@code messaging}, {@code name}, {@code implicitRules}, {@code extension}, {@code status}, {@code title}, {@code contact}, {@code software}, {@code resourceType}, {@code description}, {@code useContext}, {@code implementationGuide}, {@code id}, {@code version}, {@code modifierExtension}, {@code purpose}, {@code rest}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(document);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(kind);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(format);
    h += (h << 5) + java.util.Objects.hashCode(instantiates);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(fhirVersion);
    h += (h << 5) + java.util.Objects.hashCode(implementation);
    h += (h << 5) + java.util.Objects.hashCode(patchFormat);
    h += (h << 5) + java.util.Objects.hashCode(imports);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(messaging);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(software);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(implementationGuide);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(rest);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CapabilityStatement{");
    if (publisher != null) {
      builder.append("publisher=").append(publisher);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (date != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (document != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("document=").append(document);
    }
    if (experimental != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (kind != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (language != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (copyright != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (format != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("format=").append(format);
    }
    if (instantiates != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("instantiates=").append(instantiates);
    }
    if (jurisdiction != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (url != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (fhirVersion != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("fhirVersion=").append(fhirVersion);
    }
    if (implementation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("implementation=").append(implementation);
    }
    if (patchFormat != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("patchFormat=").append(patchFormat);
    }
    if (imports != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("imports=").append(imports);
    }
    if (meta != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (messaging != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("messaging=").append(messaging);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (implicitRules != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (title != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (contact != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (software != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("software=").append(software);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (implementationGuide != null) {
      builder.append(", ");
      builder.append("implementationGuide=").append(implementationGuide);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (rest != null) {
      builder.append(", ");
      builder.append("rest=").append(rest);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CapabilityStatement", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CapabilityStatement {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Document>> document = java.util.Optional.empty();
    boolean documentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CapabilitystatementKind> kind = java.util.Optional.empty();
    boolean kindIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> format = java.util.Optional.empty();
    boolean formatIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiates = java.util.Optional.empty();
    boolean instantiatesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CapabilitystatementFhirversion> fhirVersion = java.util.Optional.empty();
    boolean fhirVersionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CapabilityStatement_Implementation> implementation = java.util.Optional.empty();
    boolean implementationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> patchFormat = java.util.Optional.empty();
    boolean patchFormatIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> imports = java.util.Optional.empty();
    boolean importsIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Messaging>> messaging = java.util.Optional.empty();
    boolean messagingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CapabilitystatementStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CapabilityStatement_Software> software = java.util.Optional.empty();
    boolean softwareIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> implementationGuide = java.util.Optional.empty();
    boolean implementationGuideIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Rest>> rest = java.util.Optional.empty();
    boolean restIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("document")
    public void setDocument(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Document>> document) {
      this.document = document;
      this.documentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public void setKind(java.util.Optional<com.fhir.CapabilitystatementKind> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    public void setFormat(java.util.Optional<java.util.List<com.fhir.code>> format) {
      this.format = format;
      this.formatIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiates")
    public void setInstantiates(java.util.Optional<java.util.List<com.fhir.canonical>> instantiates) {
      this.instantiates = instantiates;
      this.instantiatesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
    public void setFhirVersion(java.util.Optional<com.fhir.CapabilitystatementFhirversion> fhirVersion) {
      this.fhirVersion = fhirVersion;
      this.fhirVersionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implementation")
    public void setImplementation(java.util.Optional<com.fhir.CapabilityStatement_Implementation> implementation) {
      this.implementation = implementation;
      this.implementationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patchFormat")
    public void setPatchFormat(java.util.Optional<java.util.List<com.fhir.code>> patchFormat) {
      this.patchFormat = patchFormat;
      this.patchFormatIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("imports")
    public void setImports(java.util.Optional<java.util.List<com.fhir.canonical>> imports) {
      this.imports = imports;
      this.importsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("messaging")
    public void setMessaging(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Messaging>> messaging) {
      this.messaging = messaging;
      this.messagingIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.CapabilitystatementStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("software")
    public void setSoftware(java.util.Optional<com.fhir.CapabilityStatement_Software> software) {
      this.software = software;
      this.softwareIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implementationGuide")
    public void setImplementationGuide(java.util.Optional<java.util.List<com.fhir.canonical>> implementationGuide) {
      this.implementationGuide = implementationGuide;
      this.implementationGuideIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rest")
    public void setRest(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Rest>> rest) {
      this.rest = rest;
      this.restIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Document>> document() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CapabilitystatementKind> kind() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> format() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiates() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CapabilitystatementFhirversion> fhirVersion() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CapabilityStatement_Implementation> implementation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> patchFormat() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> imports() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Messaging>> messaging() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CapabilitystatementStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CapabilityStatement_Software> software() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> implementationGuide() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Rest>> rest() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement fromJson(Json json) {
    ImmutableCapabilityStatement.Builder builder = ((ImmutableCapabilityStatement.Builder) ImmutableCapabilityStatement.builder());
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.documentIsSet) {
      builder.document(json.document);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.formatIsSet) {
      builder.format(json.format);
    }
    if (json.instantiatesIsSet) {
      builder.instantiates(json.instantiates);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.fhirVersionIsSet) {
      builder.fhirVersion(json.fhirVersion);
    }
    if (json.implementationIsSet) {
      builder.implementation(json.implementation);
    }
    if (json.patchFormatIsSet) {
      builder.patchFormat(json.patchFormat);
    }
    if (json.importsIsSet) {
      builder.imports(json.imports);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.messagingIsSet) {
      builder.messaging(json.messaging);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.softwareIsSet) {
      builder.software(json.software);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.implementationGuideIsSet) {
      builder.implementationGuide(json.implementationGuide);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.restIsSet) {
      builder.rest(json.rest);
    }
    return (ImmutableCapabilityStatement) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement instance
   */
  public static CapabilityStatement copyOf(CapabilityStatement instance) {
    if (instance instanceof ImmutableCapabilityStatement) {
      return (ImmutableCapabilityStatement) instance;
    }
    return ((ImmutableCapabilityStatement.Builder) ImmutableCapabilityStatement.builder())
        .publisher(instance.publisher())
        .text(instance.text())
        .date(instance.date())
        .document(instance.document())
        .experimental(instance.experimental())
        .kind(instance.kind())
        .language(instance.language())
        .contained(instance.contained())
        .copyright(instance.copyright())
        .format(instance.format())
        .instantiates(instance.instantiates())
        .jurisdiction(instance.jurisdiction())
        .url(instance.url())
        .fhirVersion(instance.fhirVersion())
        .implementation(instance.implementation())
        .patchFormat(instance.patchFormat())
        .imports(instance.imports())
        .meta(instance.meta())
        .messaging(instance.messaging())
        .name(instance.name())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .status(instance.status())
        .title(instance.title())
        .contact(instance.contact())
        .software(instance.software())
        .resourceType(instance.resourceType())
        .description(instance.description())
        .useContext(instance.useContext())
        .implementationGuide(instance.implementationGuide())
        .id(instance.id())
        .version(instance.version())
        .modifierExtension(instance.modifierExtension())
        .purpose(instance.purpose())
        .rest(instance.rest())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement CapabilityStatement}.
   * <pre>
   * ImmutableCapabilityStatement.builder()
   *    .publisher(String) // optional {@link CapabilityStatement#publisher() publisher}
   *    .text(com.fhir.Narrative) // optional {@link CapabilityStatement#text() text}
   *    .date(com.fhir.dateTime) // optional {@link CapabilityStatement#date() date}
   *    .document(List&amp;lt;com.fhir.CapabilityStatement_Document&amp;gt;) // optional {@link CapabilityStatement#document() document}
   *    .experimental(Boolean) // optional {@link CapabilityStatement#experimental() experimental}
   *    .kind(com.fhir.CapabilitystatementKind) // optional {@link CapabilityStatement#kind() kind}
   *    .language(com.fhir.code) // optional {@link CapabilityStatement#language() language}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link CapabilityStatement#contained() contained}
   *    .copyright(com.fhir.markdown) // optional {@link CapabilityStatement#copyright() copyright}
   *    .format(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link CapabilityStatement#format() format}
   *    .instantiates(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link CapabilityStatement#instantiates() instantiates}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CapabilityStatement#jurisdiction() jurisdiction}
   *    .url(com.fhir.uri) // optional {@link CapabilityStatement#url() url}
   *    .fhirVersion(com.fhir.CapabilitystatementFhirversion) // optional {@link CapabilityStatement#fhirVersion() fhirVersion}
   *    .implementation(com.fhir.CapabilityStatement_Implementation) // optional {@link CapabilityStatement#implementation() implementation}
   *    .patchFormat(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link CapabilityStatement#patchFormat() patchFormat}
   *    .imports(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link CapabilityStatement#imports() imports}
   *    .meta(com.fhir.Meta) // optional {@link CapabilityStatement#meta() meta}
   *    .messaging(List&amp;lt;com.fhir.CapabilityStatement_Messaging&amp;gt;) // optional {@link CapabilityStatement#messaging() messaging}
   *    .name(String) // optional {@link CapabilityStatement#name() name}
   *    .implicitRules(com.fhir.uri) // optional {@link CapabilityStatement#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement#extension() extension}
   *    .status(com.fhir.CapabilitystatementStatus) // optional {@link CapabilityStatement#status() status}
   *    .title(String) // optional {@link CapabilityStatement#title() title}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link CapabilityStatement#contact() contact}
   *    .software(com.fhir.CapabilityStatement_Software) // optional {@link CapabilityStatement#software() software}
   *    .resourceType(String) // required {@link CapabilityStatement#resourceType() resourceType}
   *    .description(com.fhir.markdown) // optional {@link CapabilityStatement#description() description}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link CapabilityStatement#useContext() useContext}
   *    .implementationGuide(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link CapabilityStatement#implementationGuide() implementationGuide}
   *    .id(com.fhir.id) // optional {@link CapabilityStatement#id() id}
   *    .version(String) // optional {@link CapabilityStatement#version() version}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement#modifierExtension() modifierExtension}
   *    .purpose(com.fhir.markdown) // optional {@link CapabilityStatement#purpose() purpose}
   *    .rest(List&amp;lt;com.fhir.CapabilityStatement_Rest&amp;gt;) // optional {@link CapabilityStatement#rest() rest}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCapabilityStatement.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement CapabilityStatement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CapabilityStatement", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_PUBLISHER = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_DOCUMENT = 0x8L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x10L;
    private static final long OPT_BIT_KIND = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_COPYRIGHT = 0x100L;
    private static final long OPT_BIT_FORMAT = 0x200L;
    private static final long OPT_BIT_INSTANTIATES = 0x400L;
    private static final long OPT_BIT_JURISDICTION = 0x800L;
    private static final long OPT_BIT_URL = 0x1000L;
    private static final long OPT_BIT_FHIR_VERSION = 0x2000L;
    private static final long OPT_BIT_IMPLEMENTATION = 0x4000L;
    private static final long OPT_BIT_PATCH_FORMAT = 0x8000L;
    private static final long OPT_BIT_IMPORTS = 0x10000L;
    private static final long OPT_BIT_META = 0x20000L;
    private static final long OPT_BIT_MESSAGING = 0x40000L;
    private static final long OPT_BIT_NAME = 0x80000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100000L;
    private static final long OPT_BIT_EXTENSION = 0x200000L;
    private static final long OPT_BIT_STATUS = 0x400000L;
    private static final long OPT_BIT_TITLE = 0x800000L;
    private static final long OPT_BIT_CONTACT = 0x1000000L;
    private static final long OPT_BIT_SOFTWARE = 0x2000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x4000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x8000000L;
    private static final long OPT_BIT_IMPLEMENTATION_GUIDE = 0x10000000L;
    private static final long OPT_BIT_ID = 0x20000000L;
    private static final long OPT_BIT_VERSION = 0x40000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000000L;
    private static final long OPT_BIT_PURPOSE = 0x100000000L;
    private static final long OPT_BIT_REST = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Document> document;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.CapabilitystatementKind kind;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> format;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiates;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable com.fhir.CapabilitystatementFhirversion fhirVersion;
    private @javax.annotation.Nullable com.fhir.CapabilityStatement_Implementation implementation;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> patchFormat;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> imports;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Messaging> messaging;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CapabilitystatementStatus status;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.CapabilityStatement_Software software;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> implementationGuide;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Rest> rest;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link CapabilityStatement#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link CapabilityStatement#text() text} to text.
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
     * Initializes the optional value {@link CapabilityStatement#text() text} to text.
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
     * Initializes the optional value {@link CapabilityStatement#date() date} to date.
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
     * Initializes the optional value {@link CapabilityStatement#date() date} to date.
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
     * Initializes the optional value {@link CapabilityStatement#document() document} to document.
     * @param document The value for document
     * @return {@code this} builder for chained invocation
     */
    public final Builder document(java.util.List<com.fhir.CapabilityStatement_Document> document) {
      checkNotIsSet(documentIsSet(), "document");
      this.document = java.util.Objects.requireNonNull(document, "document");
      optBits |= OPT_BIT_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#document() document} to document.
     * @param document The value for document
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("document")
    public final Builder document(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Document>> document) {
      checkNotIsSet(documentIsSet(), "document");
      this.document = document.orElse(null);
      optBits |= OPT_BIT_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link CapabilityStatement#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link CapabilityStatement#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(com.fhir.CapabilitystatementKind kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = java.util.Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public final Builder kind(java.util.Optional<? extends com.fhir.CapabilitystatementKind> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#language() language} to language.
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
     * Initializes the optional value {@link CapabilityStatement#language() language} to language.
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
     * Initializes the optional value {@link CapabilityStatement#contained() contained} to contained.
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
     * Initializes the optional value {@link CapabilityStatement#contained() contained} to contained.
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
     * Initializes the optional value {@link CapabilityStatement#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link CapabilityStatement#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link CapabilityStatement#format() format} to format.
     * @param format The value for format
     * @return {@code this} builder for chained invocation
     */
    public final Builder format(java.util.List<com.fhir.code> format) {
      checkNotIsSet(formatIsSet(), "format");
      this.format = java.util.Objects.requireNonNull(format, "format");
      optBits |= OPT_BIT_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#format() format} to format.
     * @param format The value for format
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    public final Builder format(java.util.Optional<? extends java.util.List<com.fhir.code>> format) {
      checkNotIsSet(formatIsSet(), "format");
      this.format = format.orElse(null);
      optBits |= OPT_BIT_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiates(java.util.List<com.fhir.canonical> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = java.util.Objects.requireNonNull(instantiates, "instantiates");
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiates")
    public final Builder instantiates(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = instantiates.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link CapabilityStatement#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link CapabilityStatement#url() url} to url.
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
     * Initializes the optional value {@link CapabilityStatement#url() url} to url.
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
     * Initializes the optional value {@link CapabilityStatement#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder fhirVersion(com.fhir.CapabilitystatementFhirversion fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = java.util.Objects.requireNonNull(fhirVersion, "fhirVersion");
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
    public final Builder fhirVersion(java.util.Optional<? extends com.fhir.CapabilitystatementFhirversion> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = fhirVersion.orElse(null);
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for chained invocation
     */
    public final Builder implementation(com.fhir.CapabilityStatement_Implementation implementation) {
      checkNotIsSet(implementationIsSet(), "implementation");
      this.implementation = java.util.Objects.requireNonNull(implementation, "implementation");
      optBits |= OPT_BIT_IMPLEMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implementation")
    public final Builder implementation(java.util.Optional<? extends com.fhir.CapabilityStatement_Implementation> implementation) {
      checkNotIsSet(implementationIsSet(), "implementation");
      this.implementation = implementation.orElse(null);
      optBits |= OPT_BIT_IMPLEMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#patchFormat() patchFormat} to patchFormat.
     * @param patchFormat The value for patchFormat
     * @return {@code this} builder for chained invocation
     */
    public final Builder patchFormat(java.util.List<com.fhir.code> patchFormat) {
      checkNotIsSet(patchFormatIsSet(), "patchFormat");
      this.patchFormat = java.util.Objects.requireNonNull(patchFormat, "patchFormat");
      optBits |= OPT_BIT_PATCH_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#patchFormat() patchFormat} to patchFormat.
     * @param patchFormat The value for patchFormat
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchFormat")
    public final Builder patchFormat(java.util.Optional<? extends java.util.List<com.fhir.code>> patchFormat) {
      checkNotIsSet(patchFormatIsSet(), "patchFormat");
      this.patchFormat = patchFormat.orElse(null);
      optBits |= OPT_BIT_PATCH_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#imports() imports} to imports.
     * @param imports The value for imports
     * @return {@code this} builder for chained invocation
     */
    public final Builder imports(java.util.List<com.fhir.canonical> imports) {
      checkNotIsSet(importsIsSet(), "imports");
      this.imports = java.util.Objects.requireNonNull(imports, "imports");
      optBits |= OPT_BIT_IMPORTS;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#imports() imports} to imports.
     * @param imports The value for imports
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imports")
    public final Builder imports(java.util.Optional<? extends java.util.List<com.fhir.canonical>> imports) {
      checkNotIsSet(importsIsSet(), "imports");
      this.imports = imports.orElse(null);
      optBits |= OPT_BIT_IMPORTS;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#meta() meta} to meta.
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
     * Initializes the optional value {@link CapabilityStatement#meta() meta} to meta.
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
     * Initializes the optional value {@link CapabilityStatement#messaging() messaging} to messaging.
     * @param messaging The value for messaging
     * @return {@code this} builder for chained invocation
     */
    public final Builder messaging(java.util.List<com.fhir.CapabilityStatement_Messaging> messaging) {
      checkNotIsSet(messagingIsSet(), "messaging");
      this.messaging = java.util.Objects.requireNonNull(messaging, "messaging");
      optBits |= OPT_BIT_MESSAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#messaging() messaging} to messaging.
     * @param messaging The value for messaging
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("messaging")
    public final Builder messaging(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Messaging>> messaging) {
      checkNotIsSet(messagingIsSet(), "messaging");
      this.messaging = messaging.orElse(null);
      optBits |= OPT_BIT_MESSAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#name() name} to name.
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
     * Initializes the optional value {@link CapabilityStatement#name() name} to name.
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
     * Initializes the optional value {@link CapabilityStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CapabilityStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CapabilityStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.CapabilitystatementStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.CapabilitystatementStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#title() title} to title.
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
     * Initializes the optional value {@link CapabilityStatement#title() title} to title.
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
     * Initializes the optional value {@link CapabilityStatement#contact() contact} to contact.
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
     * Initializes the optional value {@link CapabilityStatement#contact() contact} to contact.
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
     * Initializes the optional value {@link CapabilityStatement#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for chained invocation
     */
    public final Builder software(com.fhir.CapabilityStatement_Software software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = java.util.Objects.requireNonNull(software, "software");
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("software")
    public final Builder software(java.util.Optional<? extends com.fhir.CapabilityStatement_Software> software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = software.orElse(null);
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the value for the {@link CapabilityStatement#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CapabilityStatement#description() description} to description.
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
     * Initializes the optional value {@link CapabilityStatement#description() description} to description.
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
     * Initializes the optional value {@link CapabilityStatement#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link CapabilityStatement#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link CapabilityStatement#implementationGuide() implementationGuide} to implementationGuide.
     * @param implementationGuide The value for implementationGuide
     * @return {@code this} builder for chained invocation
     */
    public final Builder implementationGuide(java.util.List<com.fhir.canonical> implementationGuide) {
      checkNotIsSet(implementationGuideIsSet(), "implementationGuide");
      this.implementationGuide = java.util.Objects.requireNonNull(implementationGuide, "implementationGuide");
      optBits |= OPT_BIT_IMPLEMENTATION_GUIDE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#implementationGuide() implementationGuide} to implementationGuide.
     * @param implementationGuide The value for implementationGuide
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implementationGuide")
    public final Builder implementationGuide(java.util.Optional<? extends java.util.List<com.fhir.canonical>> implementationGuide) {
      checkNotIsSet(implementationGuideIsSet(), "implementationGuide");
      this.implementationGuide = implementationGuide.orElse(null);
      optBits |= OPT_BIT_IMPLEMENTATION_GUIDE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement#version() version} to version.
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
     * Initializes the optional value {@link CapabilityStatement#version() version} to version.
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
     * Initializes the optional value {@link CapabilityStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link CapabilityStatement#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link CapabilityStatement#rest() rest} to rest.
     * @param rest The value for rest
     * @return {@code this} builder for chained invocation
     */
    public final Builder rest(java.util.List<com.fhir.CapabilityStatement_Rest> rest) {
      checkNotIsSet(restIsSet(), "rest");
      this.rest = java.util.Objects.requireNonNull(rest, "rest");
      optBits |= OPT_BIT_REST;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement#rest() rest} to rest.
     * @param rest The value for rest
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rest")
    public final Builder rest(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Rest>> rest) {
      checkNotIsSet(restIsSet(), "rest");
      this.rest = rest.orElse(null);
      optBits |= OPT_BIT_REST;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement CapabilityStatement}.
     * @return An immutable instance of CapabilityStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CapabilityStatement build() {
      checkRequiredAttributes();
      return new ImmutableCapabilityStatement(
          publisher,
          text,
          date,
          document,
          experimental,
          kind,
          language,
          contained,
          copyright,
          format,
          instantiates,
          jurisdiction,
          url,
          fhirVersion,
          implementation,
          patchFormat,
          imports,
          meta,
          messaging,
          name,
          implicitRules,
          extension,
          status,
          title,
          contact,
          software,
          resourceType,
          description,
          useContext,
          implementationGuide,
          id,
          version,
          modifierExtension,
          purpose,
          rest);
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean documentIsSet() {
      return (optBits & OPT_BIT_DOCUMENT) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean formatIsSet() {
      return (optBits & OPT_BIT_FORMAT) != 0;
    }

    private boolean instantiatesIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean fhirVersionIsSet() {
      return (optBits & OPT_BIT_FHIR_VERSION) != 0;
    }

    private boolean implementationIsSet() {
      return (optBits & OPT_BIT_IMPLEMENTATION) != 0;
    }

    private boolean patchFormatIsSet() {
      return (optBits & OPT_BIT_PATCH_FORMAT) != 0;
    }

    private boolean importsIsSet() {
      return (optBits & OPT_BIT_IMPORTS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean messagingIsSet() {
      return (optBits & OPT_BIT_MESSAGING) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean softwareIsSet() {
      return (optBits & OPT_BIT_SOFTWARE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean implementationGuideIsSet() {
      return (optBits & OPT_BIT_IMPLEMENTATION_GUIDE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean restIsSet() {
      return (optBits & OPT_BIT_REST) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CapabilityStatement is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CapabilityStatement, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CapabilityStatement", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CapabilityStatement#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "CapabilityStatement", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CapabilityStatement#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link CapabilityStatement#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link CapabilityStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link CapabilityStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link CapabilityStatement#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link CapabilityStatement#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link CapabilityStatement#document() document} to document.
     * @param document The value for document
     * @return {@code this} builder for chained invocation
     */
    BuildFinal document(java.util.List<com.fhir.CapabilityStatement_Document> document);

    /**
     * Initializes the optional value {@link CapabilityStatement#document() document} to document.
     * @param document The value for document
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal document(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Document>> document);

    /**
     * Initializes the optional value {@link CapabilityStatement#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link CapabilityStatement#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link CapabilityStatement#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(com.fhir.CapabilitystatementKind kind);

    /**
     * Initializes the optional value {@link CapabilityStatement#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(java.util.Optional<? extends com.fhir.CapabilitystatementKind> kind);

    /**
     * Initializes the optional value {@link CapabilityStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link CapabilityStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link CapabilityStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link CapabilityStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link CapabilityStatement#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link CapabilityStatement#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link CapabilityStatement#format() format} to format.
     * @param format The value for format
     * @return {@code this} builder for chained invocation
     */
    BuildFinal format(java.util.List<com.fhir.code> format);

    /**
     * Initializes the optional value {@link CapabilityStatement#format() format} to format.
     * @param format The value for format
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal format(java.util.Optional<? extends java.util.List<com.fhir.code>> format);

    /**
     * Initializes the optional value {@link CapabilityStatement#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiates(java.util.List<com.fhir.canonical> instantiates);

    /**
     * Initializes the optional value {@link CapabilityStatement#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiates(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiates);

    /**
     * Initializes the optional value {@link CapabilityStatement#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link CapabilityStatement#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link CapabilityStatement#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link CapabilityStatement#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link CapabilityStatement#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fhirVersion(com.fhir.CapabilitystatementFhirversion fhirVersion);

    /**
     * Initializes the optional value {@link CapabilityStatement#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fhirVersion(java.util.Optional<? extends com.fhir.CapabilitystatementFhirversion> fhirVersion);

    /**
     * Initializes the optional value {@link CapabilityStatement#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implementation(com.fhir.CapabilityStatement_Implementation implementation);

    /**
     * Initializes the optional value {@link CapabilityStatement#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implementation(java.util.Optional<? extends com.fhir.CapabilityStatement_Implementation> implementation);

    /**
     * Initializes the optional value {@link CapabilityStatement#patchFormat() patchFormat} to patchFormat.
     * @param patchFormat The value for patchFormat
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patchFormat(java.util.List<com.fhir.code> patchFormat);

    /**
     * Initializes the optional value {@link CapabilityStatement#patchFormat() patchFormat} to patchFormat.
     * @param patchFormat The value for patchFormat
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patchFormat(java.util.Optional<? extends java.util.List<com.fhir.code>> patchFormat);

    /**
     * Initializes the optional value {@link CapabilityStatement#imports() imports} to imports.
     * @param imports The value for imports
     * @return {@code this} builder for chained invocation
     */
    BuildFinal imports(java.util.List<com.fhir.canonical> imports);

    /**
     * Initializes the optional value {@link CapabilityStatement#imports() imports} to imports.
     * @param imports The value for imports
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal imports(java.util.Optional<? extends java.util.List<com.fhir.canonical>> imports);

    /**
     * Initializes the optional value {@link CapabilityStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link CapabilityStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link CapabilityStatement#messaging() messaging} to messaging.
     * @param messaging The value for messaging
     * @return {@code this} builder for chained invocation
     */
    BuildFinal messaging(java.util.List<com.fhir.CapabilityStatement_Messaging> messaging);

    /**
     * Initializes the optional value {@link CapabilityStatement#messaging() messaging} to messaging.
     * @param messaging The value for messaging
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal messaging(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Messaging>> messaging);

    /**
     * Initializes the optional value {@link CapabilityStatement#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link CapabilityStatement#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link CapabilityStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link CapabilityStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link CapabilityStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CapabilityStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CapabilityStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.CapabilitystatementStatus status);

    /**
     * Initializes the optional value {@link CapabilityStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.CapabilitystatementStatus> status);

    /**
     * Initializes the optional value {@link CapabilityStatement#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link CapabilityStatement#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link CapabilityStatement#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link CapabilityStatement#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link CapabilityStatement#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for chained invocation
     */
    BuildFinal software(com.fhir.CapabilityStatement_Software software);

    /**
     * Initializes the optional value {@link CapabilityStatement#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal software(java.util.Optional<? extends com.fhir.CapabilityStatement_Software> software);

    /**
     * Initializes the optional value {@link CapabilityStatement#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link CapabilityStatement#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link CapabilityStatement#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link CapabilityStatement#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link CapabilityStatement#implementationGuide() implementationGuide} to implementationGuide.
     * @param implementationGuide The value for implementationGuide
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implementationGuide(java.util.List<com.fhir.canonical> implementationGuide);

    /**
     * Initializes the optional value {@link CapabilityStatement#implementationGuide() implementationGuide} to implementationGuide.
     * @param implementationGuide The value for implementationGuide
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implementationGuide(java.util.Optional<? extends java.util.List<com.fhir.canonical>> implementationGuide);

    /**
     * Initializes the optional value {@link CapabilityStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link CapabilityStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link CapabilityStatement#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link CapabilityStatement#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link CapabilityStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CapabilityStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CapabilityStatement#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link CapabilityStatement#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link CapabilityStatement#rest() rest} to rest.
     * @param rest The value for rest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal rest(java.util.List<com.fhir.CapabilityStatement_Rest> rest);

    /**
     * Initializes the optional value {@link CapabilityStatement#rest() rest} to rest.
     * @param rest The value for rest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal rest(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Rest>> rest);

    /**
     * Builds a new {@link CapabilityStatement CapabilityStatement}.
     * @return An immutable instance of CapabilityStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CapabilityStatement build();
  }
}
