//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ImplementationGuide}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide.builder()}.
 */
@org.immutables.value.Generated(from = "ImplementationGuide", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide implements com.fhir.ImplementationGuide {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_DependsOn> dependsOn;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_Global> global;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ImplementationguideFhirversionItem> fhirVersion;
  private final @javax.annotation.Nullable com.fhir.ImplementationGuide_Definition definition;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.ImplementationguideLicense license;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.ImplementationGuide_Manifest manifest;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.ImplementationguideStatus status;
  private final @javax.annotation.Nullable com.fhir.id packageId;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;

  private ImmutableImplementationGuide(
      @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_DependsOn> dependsOn,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_Global> global,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.ImplementationguideFhirversionItem> fhirVersion,
      @javax.annotation.Nullable com.fhir.ImplementationGuide_Definition definition,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.ImplementationguideLicense license,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.ImplementationGuide_Manifest manifest,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.ImplementationguideStatus status,
      @javax.annotation.Nullable com.fhir.id packageId,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.Boolean experimental) {
    this.dependsOn = dependsOn;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.global = global;
    this.resourceType = resourceType;
    this.description = description;
    this.url = url;
    this.version = version;
    this.copyright = copyright;
    this.language = language;
    this.title = title;
    this.fhirVersion = fhirVersion;
    this.definition = definition;
    this.id = id;
    this.date = date;
    this.license = license;
    this.contact = contact;
    this.useContext = useContext;
    this.extension = extension;
    this.manifest = manifest;
    this.name = name;
    this.text = text;
    this.jurisdiction = jurisdiction;
    this.publisher = publisher;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.packageId = packageId;
    this.meta = meta;
    this.experimental = experimental;
  }

  /**
   * @return The value of the {@code dependsOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ImplementationGuide_DependsOn>> dependsOn() {
    return java.util.Optional.ofNullable(dependsOn);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code global} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("global")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ImplementationGuide_Global>> global() {
    return java.util.Optional.ofNullable(global);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
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
   * @return The value of the {@code copyright} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("copyright")
  @Override
  public java.util.Optional<com.fhir.markdown> copyright() {
    return java.util.Optional.ofNullable(copyright);
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
   * @return The value of the {@code fhirVersion} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ImplementationguideFhirversionItem>> fhirVersion() {
    return java.util.Optional.ofNullable(fhirVersion);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definition")
  @Override
  public java.util.Optional<com.fhir.ImplementationGuide_Definition> definition() {
    return java.util.Optional.ofNullable(definition);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code license} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("license")
  @Override
  public java.util.Optional<com.fhir.ImplementationguideLicense> license() {
    return java.util.Optional.ofNullable(license);
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
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
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
   * @return The value of the {@code manifest} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manifest")
  @Override
  public java.util.Optional<com.fhir.ImplementationGuide_Manifest> manifest() {
    return java.util.Optional.ofNullable(manifest);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ImplementationguideStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code packageId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("packageId")
  @Override
  public java.util.Optional<com.fhir.id> packageId() {
    return java.util.Optional.ofNullable(packageId);
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
   * @return The value of the {@code experimental} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("experimental")
  @Override
  public java.util.Optional<java.lang.Boolean> experimental() {
    return java.util.Optional.ofNullable(experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#dependsOn() dependsOn} attribute.
   * @param value The value for dependsOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withDependsOn(java.util.List<com.fhir.ImplementationGuide_DependsOn> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_DependsOn> newValue = java.util.Objects.requireNonNull(value, "dependsOn");
    if (this.dependsOn == newValue) return this;
    return new ImmutableImplementationGuide(
        newValue,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#dependsOn() dependsOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dependsOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withDependsOn(java.util.Optional<? extends java.util.List<com.fhir.ImplementationGuide_DependsOn>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_DependsOn> value = optional.orElse(null);
    if (this.dependsOn == value) return this;
    return new ImmutableImplementationGuide(
        value,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        newValue,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        value,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        newValue,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        value,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#global() global} attribute.
   * @param value The value for global
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withGlobal(java.util.List<com.fhir.ImplementationGuide_Global> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_Global> newValue = java.util.Objects.requireNonNull(value, "global");
    if (this.global == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        newValue,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#global() global} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for global
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withGlobal(java.util.Optional<? extends java.util.List<com.fhir.ImplementationGuide_Global>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_Global> value = optional.orElse(null);
    if (this.global == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        value,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImplementationGuide#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImplementationGuide withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        newValue,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        newValue,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        value,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        newValue,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        value,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        newValue,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        value,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        newValue,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        value,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        newValue,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        value,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        newValue,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        value,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#fhirVersion() fhirVersion} attribute.
   * @param value The value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withFhirVersion(java.util.List<com.fhir.ImplementationguideFhirversionItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImplementationguideFhirversionItem> newValue = java.util.Objects.requireNonNull(value, "fhirVersion");
    if (this.fhirVersion == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        newValue,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#fhirVersion() fhirVersion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withFhirVersion(java.util.Optional<? extends java.util.List<com.fhir.ImplementationguideFhirversionItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImplementationguideFhirversionItem> value = optional.orElse(null);
    if (this.fhirVersion == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        value,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withDefinition(com.fhir.ImplementationGuide_Definition value) {
    @javax.annotation.Nullable com.fhir.ImplementationGuide_Definition newValue = java.util.Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        newValue,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withDefinition(java.util.Optional<? extends com.fhir.ImplementationGuide_Definition> optional) {
    @javax.annotation.Nullable com.fhir.ImplementationGuide_Definition value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        value,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        newValue,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        value,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        newValue,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        value,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#license() license} attribute.
   * @param value The value for license
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withLicense(com.fhir.ImplementationguideLicense value) {
    @javax.annotation.Nullable com.fhir.ImplementationguideLicense newValue = java.util.Objects.requireNonNull(value, "license");
    if (this.license == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        newValue,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#license() license} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for license
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withLicense(java.util.Optional<? extends com.fhir.ImplementationguideLicense> optional) {
    @javax.annotation.Nullable com.fhir.ImplementationguideLicense value = optional.orElse(null);
    if (this.license == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        value,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        newValue,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        value,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        newValue,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        value,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        newValue,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        value,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#manifest() manifest} attribute.
   * @param value The value for manifest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withManifest(com.fhir.ImplementationGuide_Manifest value) {
    @javax.annotation.Nullable com.fhir.ImplementationGuide_Manifest newValue = java.util.Objects.requireNonNull(value, "manifest");
    if (this.manifest == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        newValue,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#manifest() manifest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manifest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withManifest(java.util.Optional<? extends com.fhir.ImplementationGuide_Manifest> optional) {
    @javax.annotation.Nullable com.fhir.ImplementationGuide_Manifest value = optional.orElse(null);
    if (this.manifest == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        value,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        newValue,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        value,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        newValue,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        value,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        newValue,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        value,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        newValue,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        value,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        newValue,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        value,
        this.status,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withStatus(com.fhir.ImplementationguideStatus value) {
    @javax.annotation.Nullable com.fhir.ImplementationguideStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        newValue,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withStatus(java.util.Optional<? extends com.fhir.ImplementationguideStatus> optional) {
    @javax.annotation.Nullable com.fhir.ImplementationguideStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        value,
        this.packageId,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#packageId() packageId} attribute.
   * @param value The value for packageId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withPackageId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "packageId");
    if (this.packageId == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        newValue,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#packageId() packageId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packageId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withPackageId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.packageId == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        value,
        this.meta,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        newValue,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        value,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableImplementationGuide(
        this.dependsOn,
        this.implicitRules,
        this.contained,
        this.global,
        this.resourceType,
        this.description,
        this.url,
        this.version,
        this.copyright,
        this.language,
        this.title,
        this.fhirVersion,
        this.definition,
        this.id,
        this.date,
        this.license,
        this.contact,
        this.useContext,
        this.extension,
        this.manifest,
        this.name,
        this.text,
        this.jurisdiction,
        this.publisher,
        this.modifierExtension,
        this.status,
        this.packageId,
        this.meta,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide
        && equalTo((ImmutableImplementationGuide) another);
  }

  private boolean equalTo(ImmutableImplementationGuide another) {
    return java.util.Objects.equals(dependsOn, another.dependsOn)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(global, another.global)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(fhirVersion, another.fhirVersion)
        && java.util.Objects.equals(definition, another.definition)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(license, another.license)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(manifest, another.manifest)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(packageId, another.packageId)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(experimental, another.experimental);
  }

  /**
   * Computes a hash code from attributes: {@code dependsOn}, {@code implicitRules}, {@code contained}, {@code global}, {@code resourceType}, {@code description}, {@code url}, {@code version}, {@code copyright}, {@code language}, {@code title}, {@code fhirVersion}, {@code definition}, {@code id}, {@code date}, {@code license}, {@code contact}, {@code useContext}, {@code extension}, {@code manifest}, {@code name}, {@code text}, {@code jurisdiction}, {@code publisher}, {@code modifierExtension}, {@code status}, {@code packageId}, {@code meta}, {@code experimental}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(dependsOn);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(global);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(fhirVersion);
    h += (h << 5) + java.util.Objects.hashCode(definition);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(license);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(manifest);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(packageId);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ImplementationGuide{");
    if (dependsOn != null) {
      builder.append("dependsOn=").append(dependsOn);
    }
    if (implicitRules != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (global != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("global=").append(global);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (fhirVersion != null) {
      builder.append(", ");
      builder.append("fhirVersion=").append(fhirVersion);
    }
    if (definition != null) {
      builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (license != null) {
      builder.append(", ");
      builder.append("license=").append(license);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (manifest != null) {
      builder.append(", ");
      builder.append("manifest=").append(manifest);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (packageId != null) {
      builder.append(", ");
      builder.append("packageId=").append(packageId);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
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
  @org.immutables.value.Generated(from = "ImplementationGuide", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ImplementationGuide {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ImplementationGuide_DependsOn>> dependsOn = java.util.Optional.empty();
    boolean dependsOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ImplementationGuide_Global>> global = java.util.Optional.empty();
    boolean globalIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ImplementationguideFhirversionItem>> fhirVersion = java.util.Optional.empty();
    boolean fhirVersionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ImplementationGuide_Definition> definition = java.util.Optional.empty();
    boolean definitionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ImplementationguideLicense> license = java.util.Optional.empty();
    boolean licenseIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ImplementationGuide_Manifest> manifest = java.util.Optional.empty();
    boolean manifestIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ImplementationguideStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> packageId = java.util.Optional.empty();
    boolean packageIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
    public void setDependsOn(java.util.Optional<java.util.List<com.fhir.ImplementationGuide_DependsOn>> dependsOn) {
      this.dependsOn = dependsOn;
      this.dependsOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("global")
    public void setGlobal(java.util.Optional<java.util.List<com.fhir.ImplementationGuide_Global>> global) {
      this.global = global;
      this.globalIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
    public void setFhirVersion(java.util.Optional<java.util.List<com.fhir.ImplementationguideFhirversionItem>> fhirVersion) {
      this.fhirVersion = fhirVersion;
      this.fhirVersionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public void setDefinition(java.util.Optional<com.fhir.ImplementationGuide_Definition> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("license")
    public void setLicense(java.util.Optional<com.fhir.ImplementationguideLicense> license) {
      this.license = license;
      this.licenseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manifest")
    public void setManifest(java.util.Optional<com.fhir.ImplementationGuide_Manifest> manifest) {
      this.manifest = manifest;
      this.manifestIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ImplementationguideStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("packageId")
    public void setPackageId(java.util.Optional<com.fhir.id> packageId) {
      this.packageId = packageId;
      this.packageIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ImplementationGuide_DependsOn>> dependsOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ImplementationGuide_Global>> global() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ImplementationguideFhirversionItem>> fhirVersion() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ImplementationGuide_Definition> definition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ImplementationguideLicense> license() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ImplementationGuide_Manifest> manifest() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ImplementationguideStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> packageId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
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
  static ImmutableImplementationGuide fromJson(Json json) {
    ImmutableImplementationGuide.Builder builder = ((ImmutableImplementationGuide.Builder) ImmutableImplementationGuide.builder());
    if (json.dependsOnIsSet) {
      builder.dependsOn(json.dependsOn);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.globalIsSet) {
      builder.global(json.global);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.fhirVersionIsSet) {
      builder.fhirVersion(json.fhirVersion);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.licenseIsSet) {
      builder.license(json.license);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.manifestIsSet) {
      builder.manifest(json.manifest);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.packageIdIsSet) {
      builder.packageId(json.packageId);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    return (ImmutableImplementationGuide) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide instance
   */
  public static ImplementationGuide copyOf(ImplementationGuide instance) {
    if (instance instanceof ImmutableImplementationGuide) {
      return (ImmutableImplementationGuide) instance;
    }
    return ((ImmutableImplementationGuide.Builder) ImmutableImplementationGuide.builder())
        .dependsOn(instance.dependsOn())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .global(instance.global())
        .resourceType(instance.resourceType())
        .description(instance.description())
        .url(instance.url())
        .version(instance.version())
        .copyright(instance.copyright())
        .language(instance.language())
        .title(instance.title())
        .fhirVersion(instance.fhirVersion())
        .definition(instance.definition())
        .id(instance.id())
        .date(instance.date())
        .license(instance.license())
        .contact(instance.contact())
        .useContext(instance.useContext())
        .extension(instance.extension())
        .manifest(instance.manifest())
        .name(instance.name())
        .text(instance.text())
        .jurisdiction(instance.jurisdiction())
        .publisher(instance.publisher())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .packageId(instance.packageId())
        .meta(instance.meta())
        .experimental(instance.experimental())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide ImplementationGuide}.
   * <pre>
   * ImmutableImplementationGuide.builder()
   *    .dependsOn(List&amp;lt;com.fhir.ImplementationGuide_DependsOn&amp;gt;) // optional {@link ImplementationGuide#dependsOn() dependsOn}
   *    .implicitRules(com.fhir.uri) // optional {@link ImplementationGuide#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ImplementationGuide#contained() contained}
   *    .global(List&amp;lt;com.fhir.ImplementationGuide_Global&amp;gt;) // optional {@link ImplementationGuide#global() global}
   *    .resourceType(String) // required {@link ImplementationGuide#resourceType() resourceType}
   *    .description(com.fhir.markdown) // optional {@link ImplementationGuide#description() description}
   *    .url(com.fhir.uri) // optional {@link ImplementationGuide#url() url}
   *    .version(String) // optional {@link ImplementationGuide#version() version}
   *    .copyright(com.fhir.markdown) // optional {@link ImplementationGuide#copyright() copyright}
   *    .language(com.fhir.code) // optional {@link ImplementationGuide#language() language}
   *    .title(String) // optional {@link ImplementationGuide#title() title}
   *    .fhirVersion(List&amp;lt;com.fhir.ImplementationguideFhirversionItem&amp;gt;) // optional {@link ImplementationGuide#fhirVersion() fhirVersion}
   *    .definition(com.fhir.ImplementationGuide_Definition) // optional {@link ImplementationGuide#definition() definition}
   *    .id(com.fhir.id) // optional {@link ImplementationGuide#id() id}
   *    .date(com.fhir.dateTime) // optional {@link ImplementationGuide#date() date}
   *    .license(com.fhir.ImplementationguideLicense) // optional {@link ImplementationGuide#license() license}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ImplementationGuide#contact() contact}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link ImplementationGuide#useContext() useContext}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide#extension() extension}
   *    .manifest(com.fhir.ImplementationGuide_Manifest) // optional {@link ImplementationGuide#manifest() manifest}
   *    .name(String) // optional {@link ImplementationGuide#name() name}
   *    .text(com.fhir.Narrative) // optional {@link ImplementationGuide#text() text}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ImplementationGuide#jurisdiction() jurisdiction}
   *    .publisher(String) // optional {@link ImplementationGuide#publisher() publisher}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide#modifierExtension() modifierExtension}
   *    .status(com.fhir.ImplementationguideStatus) // optional {@link ImplementationGuide#status() status}
   *    .packageId(com.fhir.id) // optional {@link ImplementationGuide#packageId() packageId}
   *    .meta(com.fhir.Meta) // optional {@link ImplementationGuide#meta() meta}
   *    .experimental(Boolean) // optional {@link ImplementationGuide#experimental() experimental}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableImplementationGuide.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide ImplementationGuide}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ImplementationGuide", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DEPENDS_ON = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_GLOBAL = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private static final long OPT_BIT_URL = 0x20L;
    private static final long OPT_BIT_VERSION = 0x40L;
    private static final long OPT_BIT_COPYRIGHT = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_TITLE = 0x200L;
    private static final long OPT_BIT_FHIR_VERSION = 0x400L;
    private static final long OPT_BIT_DEFINITION = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_DATE = 0x2000L;
    private static final long OPT_BIT_LICENSE = 0x4000L;
    private static final long OPT_BIT_CONTACT = 0x8000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_MANIFEST = 0x40000L;
    private static final long OPT_BIT_NAME = 0x80000L;
    private static final long OPT_BIT_TEXT = 0x100000L;
    private static final long OPT_BIT_JURISDICTION = 0x200000L;
    private static final long OPT_BIT_PUBLISHER = 0x400000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800000L;
    private static final long OPT_BIT_STATUS = 0x1000000L;
    private static final long OPT_BIT_PACKAGE_ID = 0x2000000L;
    private static final long OPT_BIT_META = 0x4000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x8000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_DependsOn> dependsOn;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.ImplementationGuide_Global> global;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.ImplementationguideFhirversionItem> fhirVersion;
    private @javax.annotation.Nullable com.fhir.ImplementationGuide_Definition definition;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.ImplementationguideLicense license;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.ImplementationGuide_Manifest manifest;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.ImplementationguideStatus status;
    private @javax.annotation.Nullable com.fhir.id packageId;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.Boolean experimental;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder dependsOn(java.util.List<com.fhir.ImplementationGuide_DependsOn> dependsOn) {
      checkNotIsSet(dependsOnIsSet(), "dependsOn");
      this.dependsOn = java.util.Objects.requireNonNull(dependsOn, "dependsOn");
      optBits |= OPT_BIT_DEPENDS_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
    public final Builder dependsOn(java.util.Optional<? extends java.util.List<com.fhir.ImplementationGuide_DependsOn>> dependsOn) {
      checkNotIsSet(dependsOnIsSet(), "dependsOn");
      this.dependsOn = dependsOn.orElse(null);
      optBits |= OPT_BIT_DEPENDS_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImplementationGuide#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImplementationGuide#contained() contained} to contained.
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
     * Initializes the optional value {@link ImplementationGuide#contained() contained} to contained.
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
     * Initializes the optional value {@link ImplementationGuide#global() global} to global.
     * @param global The value for global
     * @return {@code this} builder for chained invocation
     */
    public final Builder global(java.util.List<com.fhir.ImplementationGuide_Global> global) {
      checkNotIsSet(globalIsSet(), "global");
      this.global = java.util.Objects.requireNonNull(global, "global");
      optBits |= OPT_BIT_GLOBAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#global() global} to global.
     * @param global The value for global
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("global")
    public final Builder global(java.util.Optional<? extends java.util.List<com.fhir.ImplementationGuide_Global>> global) {
      checkNotIsSet(globalIsSet(), "global");
      this.global = global.orElse(null);
      optBits |= OPT_BIT_GLOBAL;
      return this;
    }

    /**
     * Initializes the value for the {@link ImplementationGuide#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ImplementationGuide#description() description} to description.
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
     * Initializes the optional value {@link ImplementationGuide#description() description} to description.
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
     * Initializes the optional value {@link ImplementationGuide#url() url} to url.
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
     * Initializes the optional value {@link ImplementationGuide#url() url} to url.
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
     * Initializes the optional value {@link ImplementationGuide#version() version} to version.
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
     * Initializes the optional value {@link ImplementationGuide#version() version} to version.
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
     * Initializes the optional value {@link ImplementationGuide#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ImplementationGuide#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ImplementationGuide#language() language} to language.
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
     * Initializes the optional value {@link ImplementationGuide#language() language} to language.
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
     * Initializes the optional value {@link ImplementationGuide#title() title} to title.
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
     * Initializes the optional value {@link ImplementationGuide#title() title} to title.
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
     * Initializes the optional value {@link ImplementationGuide#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder fhirVersion(java.util.List<com.fhir.ImplementationguideFhirversionItem> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = java.util.Objects.requireNonNull(fhirVersion, "fhirVersion");
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
    public final Builder fhirVersion(java.util.Optional<? extends java.util.List<com.fhir.ImplementationguideFhirversionItem>> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = fhirVersion.orElse(null);
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(com.fhir.ImplementationGuide_Definition definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = java.util.Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public final Builder definition(java.util.Optional<? extends com.fhir.ImplementationGuide_Definition> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide#date() date} to date.
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
     * Initializes the optional value {@link ImplementationGuide#date() date} to date.
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
     * Initializes the optional value {@link ImplementationGuide#license() license} to license.
     * @param license The value for license
     * @return {@code this} builder for chained invocation
     */
    public final Builder license(com.fhir.ImplementationguideLicense license) {
      checkNotIsSet(licenseIsSet(), "license");
      this.license = java.util.Objects.requireNonNull(license, "license");
      optBits |= OPT_BIT_LICENSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#license() license} to license.
     * @param license The value for license
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("license")
    public final Builder license(java.util.Optional<? extends com.fhir.ImplementationguideLicense> license) {
      checkNotIsSet(licenseIsSet(), "license");
      this.license = license.orElse(null);
      optBits |= OPT_BIT_LICENSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#contact() contact} to contact.
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
     * Initializes the optional value {@link ImplementationGuide#contact() contact} to contact.
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
     * Initializes the optional value {@link ImplementationGuide#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ImplementationGuide#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ImplementationGuide#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide#manifest() manifest} to manifest.
     * @param manifest The value for manifest
     * @return {@code this} builder for chained invocation
     */
    public final Builder manifest(com.fhir.ImplementationGuide_Manifest manifest) {
      checkNotIsSet(manifestIsSet(), "manifest");
      this.manifest = java.util.Objects.requireNonNull(manifest, "manifest");
      optBits |= OPT_BIT_MANIFEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#manifest() manifest} to manifest.
     * @param manifest The value for manifest
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manifest")
    public final Builder manifest(java.util.Optional<? extends com.fhir.ImplementationGuide_Manifest> manifest) {
      checkNotIsSet(manifestIsSet(), "manifest");
      this.manifest = manifest.orElse(null);
      optBits |= OPT_BIT_MANIFEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#name() name} to name.
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
     * Initializes the optional value {@link ImplementationGuide#name() name} to name.
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
     * Initializes the optional value {@link ImplementationGuide#text() text} to text.
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
     * Initializes the optional value {@link ImplementationGuide#text() text} to text.
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
     * Initializes the optional value {@link ImplementationGuide#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ImplementationGuide#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ImplementationGuide#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ImplementationGuide#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ImplementationGuide#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ImplementationguideStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ImplementationguideStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for chained invocation
     */
    public final Builder packageId(com.fhir.id packageId) {
      checkNotIsSet(packageIdIsSet(), "packageId");
      this.packageId = java.util.Objects.requireNonNull(packageId, "packageId");
      optBits |= OPT_BIT_PACKAGE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageId")
    public final Builder packageId(java.util.Optional<? extends com.fhir.id> packageId) {
      checkNotIsSet(packageIdIsSet(), "packageId");
      this.packageId = packageId.orElse(null);
      optBits |= OPT_BIT_PACKAGE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#meta() meta} to meta.
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
     * Initializes the optional value {@link ImplementationGuide#meta() meta} to meta.
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
     * Initializes the optional value {@link ImplementationGuide#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ImplementationGuide#experimental() experimental} to experimental.
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
     * Builds a new {@link ImplementationGuide ImplementationGuide}.
     * @return An immutable instance of ImplementationGuide
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ImplementationGuide build() {
      checkRequiredAttributes();
      return new ImmutableImplementationGuide(
          dependsOn,
          implicitRules,
          contained,
          global,
          resourceType,
          description,
          url,
          version,
          copyright,
          language,
          title,
          fhirVersion,
          definition,
          id,
          date,
          license,
          contact,
          useContext,
          extension,
          manifest,
          name,
          text,
          jurisdiction,
          publisher,
          modifierExtension,
          status,
          packageId,
          meta,
          experimental);
    }

    private boolean dependsOnIsSet() {
      return (optBits & OPT_BIT_DEPENDS_ON) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean globalIsSet() {
      return (optBits & OPT_BIT_GLOBAL) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean fhirVersionIsSet() {
      return (optBits & OPT_BIT_FHIR_VERSION) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean licenseIsSet() {
      return (optBits & OPT_BIT_LICENSE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean manifestIsSet() {
      return (optBits & OPT_BIT_MANIFEST) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean packageIdIsSet() {
      return (optBits & OPT_BIT_PACKAGE_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ImplementationGuide is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ImplementationGuide, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ImplementationGuide", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ImplementationGuide#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ImplementationGuide", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImplementationGuide#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dependsOn(java.util.List<com.fhir.ImplementationGuide_DependsOn> dependsOn);

    /**
     * Initializes the optional value {@link ImplementationGuide#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dependsOn(java.util.Optional<? extends java.util.List<com.fhir.ImplementationGuide_DependsOn>> dependsOn);

    /**
     * Initializes the optional value {@link ImplementationGuide#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ImplementationGuide#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ImplementationGuide#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ImplementationGuide#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ImplementationGuide#global() global} to global.
     * @param global The value for global
     * @return {@code this} builder for chained invocation
     */
    BuildFinal global(java.util.List<com.fhir.ImplementationGuide_Global> global);

    /**
     * Initializes the optional value {@link ImplementationGuide#global() global} to global.
     * @param global The value for global
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal global(java.util.Optional<? extends java.util.List<com.fhir.ImplementationGuide_Global>> global);

    /**
     * Initializes the optional value {@link ImplementationGuide#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link ImplementationGuide#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link ImplementationGuide#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link ImplementationGuide#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link ImplementationGuide#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link ImplementationGuide#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link ImplementationGuide#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link ImplementationGuide#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link ImplementationGuide#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ImplementationGuide#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ImplementationGuide#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link ImplementationGuide#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link ImplementationGuide#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fhirVersion(java.util.List<com.fhir.ImplementationguideFhirversionItem> fhirVersion);

    /**
     * Initializes the optional value {@link ImplementationGuide#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fhirVersion(java.util.Optional<? extends java.util.List<com.fhir.ImplementationguideFhirversionItem>> fhirVersion);

    /**
     * Initializes the optional value {@link ImplementationGuide#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definition(com.fhir.ImplementationGuide_Definition definition);

    /**
     * Initializes the optional value {@link ImplementationGuide#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definition(java.util.Optional<? extends com.fhir.ImplementationGuide_Definition> definition);

    /**
     * Initializes the optional value {@link ImplementationGuide#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ImplementationGuide#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ImplementationGuide#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link ImplementationGuide#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link ImplementationGuide#license() license} to license.
     * @param license The value for license
     * @return {@code this} builder for chained invocation
     */
    BuildFinal license(com.fhir.ImplementationguideLicense license);

    /**
     * Initializes the optional value {@link ImplementationGuide#license() license} to license.
     * @param license The value for license
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal license(java.util.Optional<? extends com.fhir.ImplementationguideLicense> license);

    /**
     * Initializes the optional value {@link ImplementationGuide#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link ImplementationGuide#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ImplementationGuide#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link ImplementationGuide#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ImplementationGuide#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide#manifest() manifest} to manifest.
     * @param manifest The value for manifest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manifest(com.fhir.ImplementationGuide_Manifest manifest);

    /**
     * Initializes the optional value {@link ImplementationGuide#manifest() manifest} to manifest.
     * @param manifest The value for manifest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manifest(java.util.Optional<? extends com.fhir.ImplementationGuide_Manifest> manifest);

    /**
     * Initializes the optional value {@link ImplementationGuide#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link ImplementationGuide#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link ImplementationGuide#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ImplementationGuide#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ImplementationGuide#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ImplementationGuide#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ImplementationGuide#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link ImplementationGuide#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link ImplementationGuide#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ImplementationguideStatus status);

    /**
     * Initializes the optional value {@link ImplementationGuide#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ImplementationguideStatus> status);

    /**
     * Initializes the optional value {@link ImplementationGuide#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal packageId(com.fhir.id packageId);

    /**
     * Initializes the optional value {@link ImplementationGuide#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal packageId(java.util.Optional<? extends com.fhir.id> packageId);

    /**
     * Initializes the optional value {@link ImplementationGuide#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ImplementationGuide#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ImplementationGuide#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link ImplementationGuide#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Builds a new {@link ImplementationGuide ImplementationGuide}.
     * @return An immutable instance of ImplementationGuide
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImplementationGuide build();
  }
}
