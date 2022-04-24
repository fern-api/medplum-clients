//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TerminologyCapabilities}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTerminologyCapabilities.builder()}.
 */
@org.immutables.value.Generated(from = "TerminologyCapabilities", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTerminologyCapabilities implements com.fhir.TerminologyCapabilities {
  private final @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Implementation implementation;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Expansion expansion;
  private final @javax.annotation.Nullable com.fhir.TerminologycapabilitiesCodesearch codeSearch;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_CodeSystem> codeSystem;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.TerminologyCapabilities_ValidateCode validateCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Translation translation;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable com.fhir.TerminologycapabilitiesStatus status;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Software software;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.lang.Boolean lockedDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.code kind;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Closure closure;

  private ImmutableTerminologyCapabilities(
      @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Implementation implementation,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Expansion expansion,
      @javax.annotation.Nullable com.fhir.TerminologycapabilitiesCodesearch codeSearch,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_CodeSystem> codeSystem,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.TerminologyCapabilities_ValidateCode validateCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Translation translation,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable com.fhir.TerminologycapabilitiesStatus status,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Software software,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.lang.Boolean lockedDate,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.code kind,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Closure closure) {
    this.implementation = implementation;
    this.id = id;
    this.meta = meta;
    this.expansion = expansion;
    this.codeSearch = codeSearch;
    this.publisher = publisher;
    this.extension = extension;
    this.title = title;
    this.codeSystem = codeSystem;
    this.contained = contained;
    this.name = name;
    this.copyright = copyright;
    this.validateCode = validateCode;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.date = date;
    this.useContext = useContext;
    this.translation = translation;
    this.version = version;
    this.status = status;
    this.language = language;
    this.text = text;
    this.implicitRules = implicitRules;
    this.software = software;
    this.resourceType = resourceType;
    this.experimental = experimental;
    this.purpose = purpose;
    this.lockedDate = lockedDate;
    this.jurisdiction = jurisdiction;
    this.kind = kind;
    this.url = url;
    this.contact = contact;
    this.closure = closure;
  }

  /**
   * @return The value of the {@code implementation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implementation")
  @Override
  public java.util.Optional<com.fhir.TerminologyCapabilities_Implementation> implementation() {
    return java.util.Optional.ofNullable(implementation);
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
   * @return The value of the {@code expansion} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expansion")
  @Override
  public java.util.Optional<com.fhir.TerminologyCapabilities_Expansion> expansion() {
    return java.util.Optional.ofNullable(expansion);
  }

  /**
   * @return The value of the {@code codeSearch} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("codeSearch")
  @Override
  public java.util.Optional<com.fhir.TerminologycapabilitiesCodesearch> codeSearch() {
    return java.util.Optional.ofNullable(codeSearch);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code codeSystem} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("codeSystem")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_CodeSystem>> codeSystem() {
    return java.util.Optional.ofNullable(codeSystem);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
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
   * @return The value of the {@code validateCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validateCode")
  @Override
  public java.util.Optional<com.fhir.TerminologyCapabilities_ValidateCode> validateCode() {
    return java.util.Optional.ofNullable(validateCode);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code translation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("translation")
  @Override
  public java.util.Optional<com.fhir.TerminologyCapabilities_Translation> translation() {
    return java.util.Optional.ofNullable(translation);
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
  public java.util.Optional<com.fhir.TerminologycapabilitiesStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code software} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("software")
  @Override
  public java.util.Optional<com.fhir.TerminologyCapabilities_Software> software() {
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
   * @return The value of the {@code experimental} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("experimental")
  @Override
  public java.util.Optional<java.lang.Boolean> experimental() {
    return java.util.Optional.ofNullable(experimental);
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
   * @return The value of the {@code lockedDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lockedDate")
  @Override
  public java.util.Optional<java.lang.Boolean> lockedDate() {
    return java.util.Optional.ofNullable(lockedDate);
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
   * @return The value of the {@code kind} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kind")
  @Override
  public java.util.Optional<com.fhir.code> kind() {
    return java.util.Optional.ofNullable(kind);
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
   * @return The value of the {@code closure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("closure")
  @Override
  public java.util.Optional<com.fhir.TerminologyCapabilities_Closure> closure() {
    return java.util.Optional.ofNullable(closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#implementation() implementation} attribute.
   * @param value The value for implementation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withImplementation(com.fhir.TerminologyCapabilities_Implementation value) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Implementation newValue = java.util.Objects.requireNonNull(value, "implementation");
    if (this.implementation == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        newValue,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#implementation() implementation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implementation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withImplementation(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Implementation> optional) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Implementation value = optional.orElse(null);
    if (this.implementation == value) return this;
    return new ImmutableTerminologyCapabilities(
        value,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        newValue,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        value,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        newValue,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        value,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#expansion() expansion} attribute.
   * @param value The value for expansion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withExpansion(com.fhir.TerminologyCapabilities_Expansion value) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Expansion newValue = java.util.Objects.requireNonNull(value, "expansion");
    if (this.expansion == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        newValue,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#expansion() expansion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expansion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withExpansion(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Expansion> optional) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Expansion value = optional.orElse(null);
    if (this.expansion == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        value,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#codeSearch() codeSearch} attribute.
   * @param value The value for codeSearch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withCodeSearch(com.fhir.TerminologycapabilitiesCodesearch value) {
    @javax.annotation.Nullable com.fhir.TerminologycapabilitiesCodesearch newValue = java.util.Objects.requireNonNull(value, "codeSearch");
    if (this.codeSearch == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        newValue,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#codeSearch() codeSearch} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeSearch
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withCodeSearch(java.util.Optional<? extends com.fhir.TerminologycapabilitiesCodesearch> optional) {
    @javax.annotation.Nullable com.fhir.TerminologycapabilitiesCodesearch value = optional.orElse(null);
    if (this.codeSearch == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        value,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        newValue,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        value,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        newValue,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        value,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        newValue,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        value,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#codeSystem() codeSystem} attribute.
   * @param value The value for codeSystem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withCodeSystem(java.util.List<com.fhir.TerminologyCapabilities_CodeSystem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_CodeSystem> newValue = java.util.Objects.requireNonNull(value, "codeSystem");
    if (this.codeSystem == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        newValue,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#codeSystem() codeSystem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeSystem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withCodeSystem(java.util.Optional<? extends java.util.List<com.fhir.TerminologyCapabilities_CodeSystem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_CodeSystem> value = optional.orElse(null);
    if (this.codeSystem == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        value,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        newValue,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        value,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        newValue,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        value,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        newValue,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        value,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#validateCode() validateCode} attribute.
   * @param value The value for validateCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withValidateCode(com.fhir.TerminologyCapabilities_ValidateCode value) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_ValidateCode newValue = java.util.Objects.requireNonNull(value, "validateCode");
    if (this.validateCode == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        newValue,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#validateCode() validateCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validateCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withValidateCode(java.util.Optional<? extends com.fhir.TerminologyCapabilities_ValidateCode> optional) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_ValidateCode value = optional.orElse(null);
    if (this.validateCode == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        value,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        newValue,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        value,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        newValue,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        value,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        newValue,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        value,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        newValue,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        value,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#translation() translation} attribute.
   * @param value The value for translation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withTranslation(com.fhir.TerminologyCapabilities_Translation value) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Translation newValue = java.util.Objects.requireNonNull(value, "translation");
    if (this.translation == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        newValue,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#translation() translation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for translation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withTranslation(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Translation> optional) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Translation value = optional.orElse(null);
    if (this.translation == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        value,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        newValue,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        value,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withStatus(com.fhir.TerminologycapabilitiesStatus value) {
    @javax.annotation.Nullable com.fhir.TerminologycapabilitiesStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        newValue,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withStatus(java.util.Optional<? extends com.fhir.TerminologycapabilitiesStatus> optional) {
    @javax.annotation.Nullable com.fhir.TerminologycapabilitiesStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        value,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        newValue,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        value,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        newValue,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        value,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        newValue,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        value,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#software() software} attribute.
   * @param value The value for software
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withSoftware(com.fhir.TerminologyCapabilities_Software value) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Software newValue = java.util.Objects.requireNonNull(value, "software");
    if (this.software == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#software() software} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for software
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withSoftware(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Software> optional) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Software value = optional.orElse(null);
    if (this.software == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        value,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TerminologyCapabilities#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTerminologyCapabilities withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        newValue,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        newValue,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        value,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        newValue,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        value,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#lockedDate() lockedDate} attribute.
   * @param value The value for lockedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withLockedDate(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.lockedDate, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        newValue,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#lockedDate() lockedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lockedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withLockedDate(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.lockedDate, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        value,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        newValue,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        value,
        this.kind,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withKind(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        newValue,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withKind(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        value,
        this.url,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        newValue,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        value,
        this.contact,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        newValue,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        value,
        this.closure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#closure() closure} attribute.
   * @param value The value for closure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withClosure(com.fhir.TerminologyCapabilities_Closure value) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Closure newValue = java.util.Objects.requireNonNull(value, "closure");
    if (this.closure == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#closure() closure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for closure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withClosure(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Closure> optional) {
    @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Closure value = optional.orElse(null);
    if (this.closure == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.implementation,
        this.id,
        this.meta,
        this.expansion,
        this.codeSearch,
        this.publisher,
        this.extension,
        this.title,
        this.codeSystem,
        this.contained,
        this.name,
        this.copyright,
        this.validateCode,
        this.modifierExtension,
        this.description,
        this.date,
        this.useContext,
        this.translation,
        this.version,
        this.status,
        this.language,
        this.text,
        this.implicitRules,
        this.software,
        this.resourceType,
        this.experimental,
        this.purpose,
        this.lockedDate,
        this.jurisdiction,
        this.kind,
        this.url,
        this.contact,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTerminologyCapabilities} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTerminologyCapabilities
        && equalTo((ImmutableTerminologyCapabilities) another);
  }

  private boolean equalTo(ImmutableTerminologyCapabilities another) {
    return java.util.Objects.equals(implementation, another.implementation)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(expansion, another.expansion)
        && java.util.Objects.equals(codeSearch, another.codeSearch)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(codeSystem, another.codeSystem)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(validateCode, another.validateCode)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(translation, another.translation)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(software, another.software)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(lockedDate, another.lockedDate)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(kind, another.kind)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(closure, another.closure);
  }

  /**
   * Computes a hash code from attributes: {@code implementation}, {@code id}, {@code meta}, {@code expansion}, {@code codeSearch}, {@code publisher}, {@code extension}, {@code title}, {@code codeSystem}, {@code contained}, {@code name}, {@code copyright}, {@code validateCode}, {@code modifierExtension}, {@code description}, {@code date}, {@code useContext}, {@code translation}, {@code version}, {@code status}, {@code language}, {@code text}, {@code implicitRules}, {@code software}, {@code resourceType}, {@code experimental}, {@code purpose}, {@code lockedDate}, {@code jurisdiction}, {@code kind}, {@code url}, {@code contact}, {@code closure}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(implementation);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(expansion);
    h += (h << 5) + java.util.Objects.hashCode(codeSearch);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(codeSystem);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(validateCode);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(translation);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(software);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(lockedDate);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(kind);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(closure);
    return h;
  }

  /**
   * Prints the immutable value {@code TerminologyCapabilities} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TerminologyCapabilities{");
    if (implementation != null) {
      builder.append("implementation=").append(implementation);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (expansion != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("expansion=").append(expansion);
    }
    if (codeSearch != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("codeSearch=").append(codeSearch);
    }
    if (publisher != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (title != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (codeSystem != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("codeSystem=").append(codeSystem);
    }
    if (contained != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (name != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (copyright != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (validateCode != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("validateCode=").append(validateCode);
    }
    if (modifierExtension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (date != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (useContext != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (translation != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("translation=").append(translation);
    }
    if (version != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (status != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (language != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (implicitRules != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (software != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("software=").append(software);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (lockedDate != null) {
      builder.append(", ");
      builder.append("lockedDate=").append(lockedDate);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (kind != null) {
      builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (closure != null) {
      builder.append(", ");
      builder.append("closure=").append(closure);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "TerminologyCapabilities", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TerminologyCapabilities {
    @javax.annotation.Nullable java.util.Optional<com.fhir.TerminologyCapabilities_Implementation> implementation = java.util.Optional.empty();
    boolean implementationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TerminologyCapabilities_Expansion> expansion = java.util.Optional.empty();
    boolean expansionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TerminologycapabilitiesCodesearch> codeSearch = java.util.Optional.empty();
    boolean codeSearchIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_CodeSystem>> codeSystem = java.util.Optional.empty();
    boolean codeSystemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TerminologyCapabilities_ValidateCode> validateCode = java.util.Optional.empty();
    boolean validateCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TerminologyCapabilities_Translation> translation = java.util.Optional.empty();
    boolean translationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TerminologycapabilitiesStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TerminologyCapabilities_Software> software = java.util.Optional.empty();
    boolean softwareIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> lockedDate = java.util.Optional.empty();
    boolean lockedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> kind = java.util.Optional.empty();
    boolean kindIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TerminologyCapabilities_Closure> closure = java.util.Optional.empty();
    boolean closureIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("implementation")
    public void setImplementation(java.util.Optional<com.fhir.TerminologyCapabilities_Implementation> implementation) {
      this.implementation = implementation;
      this.implementationIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("expansion")
    public void setExpansion(java.util.Optional<com.fhir.TerminologyCapabilities_Expansion> expansion) {
      this.expansion = expansion;
      this.expansionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("codeSearch")
    public void setCodeSearch(java.util.Optional<com.fhir.TerminologycapabilitiesCodesearch> codeSearch) {
      this.codeSearch = codeSearch;
      this.codeSearchIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("codeSystem")
    public void setCodeSystem(java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_CodeSystem>> codeSystem) {
      this.codeSystem = codeSystem;
      this.codeSystemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validateCode")
    public void setValidateCode(java.util.Optional<com.fhir.TerminologyCapabilities_ValidateCode> validateCode) {
      this.validateCode = validateCode;
      this.validateCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("translation")
    public void setTranslation(java.util.Optional<com.fhir.TerminologyCapabilities_Translation> translation) {
      this.translation = translation;
      this.translationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.TerminologycapabilitiesStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("software")
    public void setSoftware(java.util.Optional<com.fhir.TerminologyCapabilities_Software> software) {
      this.software = software;
      this.softwareIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lockedDate")
    public void setLockedDate(java.util.Optional<java.lang.Boolean> lockedDate) {
      this.lockedDate = lockedDate;
      this.lockedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public void setKind(java.util.Optional<com.fhir.code> kind) {
      this.kind = kind;
      this.kindIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("closure")
    public void setClosure(java.util.Optional<com.fhir.TerminologyCapabilities_Closure> closure) {
      this.closure = closure;
      this.closureIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.TerminologyCapabilities_Implementation> implementation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TerminologyCapabilities_Expansion> expansion() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TerminologycapabilitiesCodesearch> codeSearch() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_CodeSystem>> codeSystem() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TerminologyCapabilities_ValidateCode> validateCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TerminologyCapabilities_Translation> translation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TerminologycapabilitiesStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TerminologyCapabilities_Software> software() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> lockedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> kind() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TerminologyCapabilities_Closure> closure() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTerminologyCapabilities fromJson(Json json) {
    ImmutableTerminologyCapabilities.Builder builder = ((ImmutableTerminologyCapabilities.Builder) ImmutableTerminologyCapabilities.builder());
    if (json.implementationIsSet) {
      builder.implementation(json.implementation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.expansionIsSet) {
      builder.expansion(json.expansion);
    }
    if (json.codeSearchIsSet) {
      builder.codeSearch(json.codeSearch);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.codeSystemIsSet) {
      builder.codeSystem(json.codeSystem);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.validateCodeIsSet) {
      builder.validateCode(json.validateCode);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.translationIsSet) {
      builder.translation(json.translation);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.softwareIsSet) {
      builder.software(json.software);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.lockedDateIsSet) {
      builder.lockedDate(json.lockedDate);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.closureIsSet) {
      builder.closure(json.closure);
    }
    return (ImmutableTerminologyCapabilities) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TerminologyCapabilities} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TerminologyCapabilities instance
   */
  public static TerminologyCapabilities copyOf(TerminologyCapabilities instance) {
    if (instance instanceof ImmutableTerminologyCapabilities) {
      return (ImmutableTerminologyCapabilities) instance;
    }
    return ((ImmutableTerminologyCapabilities.Builder) ImmutableTerminologyCapabilities.builder())
        .implementation(instance.implementation())
        .id(instance.id())
        .meta(instance.meta())
        .expansion(instance.expansion())
        .codeSearch(instance.codeSearch())
        .publisher(instance.publisher())
        .extension(instance.extension())
        .title(instance.title())
        .codeSystem(instance.codeSystem())
        .contained(instance.contained())
        .name(instance.name())
        .copyright(instance.copyright())
        .validateCode(instance.validateCode())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .date(instance.date())
        .useContext(instance.useContext())
        .translation(instance.translation())
        .version(instance.version())
        .status(instance.status())
        .language(instance.language())
        .text(instance.text())
        .implicitRules(instance.implicitRules())
        .software(instance.software())
        .resourceType(instance.resourceType())
        .experimental(instance.experimental())
        .purpose(instance.purpose())
        .lockedDate(instance.lockedDate())
        .jurisdiction(instance.jurisdiction())
        .kind(instance.kind())
        .url(instance.url())
        .contact(instance.contact())
        .closure(instance.closure())
        .build();
  }

  /**
   * Creates a builder for {@link TerminologyCapabilities TerminologyCapabilities}.
   * <pre>
   * ImmutableTerminologyCapabilities.builder()
   *    .implementation(com.fhir.TerminologyCapabilities_Implementation) // optional {@link TerminologyCapabilities#implementation() implementation}
   *    .id(com.fhir.id) // optional {@link TerminologyCapabilities#id() id}
   *    .meta(com.fhir.Meta) // optional {@link TerminologyCapabilities#meta() meta}
   *    .expansion(com.fhir.TerminologyCapabilities_Expansion) // optional {@link TerminologyCapabilities#expansion() expansion}
   *    .codeSearch(com.fhir.TerminologycapabilitiesCodesearch) // optional {@link TerminologyCapabilities#codeSearch() codeSearch}
   *    .publisher(String) // optional {@link TerminologyCapabilities#publisher() publisher}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities#extension() extension}
   *    .title(String) // optional {@link TerminologyCapabilities#title() title}
   *    .codeSystem(List&amp;lt;com.fhir.TerminologyCapabilities_CodeSystem&amp;gt;) // optional {@link TerminologyCapabilities#codeSystem() codeSystem}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link TerminologyCapabilities#contained() contained}
   *    .name(String) // optional {@link TerminologyCapabilities#name() name}
   *    .copyright(com.fhir.markdown) // optional {@link TerminologyCapabilities#copyright() copyright}
   *    .validateCode(com.fhir.TerminologyCapabilities_ValidateCode) // optional {@link TerminologyCapabilities#validateCode() validateCode}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities#modifierExtension() modifierExtension}
   *    .description(com.fhir.markdown) // optional {@link TerminologyCapabilities#description() description}
   *    .date(com.fhir.dateTime) // optional {@link TerminologyCapabilities#date() date}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link TerminologyCapabilities#useContext() useContext}
   *    .translation(com.fhir.TerminologyCapabilities_Translation) // optional {@link TerminologyCapabilities#translation() translation}
   *    .version(String) // optional {@link TerminologyCapabilities#version() version}
   *    .status(com.fhir.TerminologycapabilitiesStatus) // optional {@link TerminologyCapabilities#status() status}
   *    .language(com.fhir.code) // optional {@link TerminologyCapabilities#language() language}
   *    .text(com.fhir.Narrative) // optional {@link TerminologyCapabilities#text() text}
   *    .implicitRules(com.fhir.uri) // optional {@link TerminologyCapabilities#implicitRules() implicitRules}
   *    .software(com.fhir.TerminologyCapabilities_Software) // optional {@link TerminologyCapabilities#software() software}
   *    .resourceType(String) // required {@link TerminologyCapabilities#resourceType() resourceType}
   *    .experimental(Boolean) // optional {@link TerminologyCapabilities#experimental() experimental}
   *    .purpose(com.fhir.markdown) // optional {@link TerminologyCapabilities#purpose() purpose}
   *    .lockedDate(Boolean) // optional {@link TerminologyCapabilities#lockedDate() lockedDate}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link TerminologyCapabilities#jurisdiction() jurisdiction}
   *    .kind(com.fhir.code) // optional {@link TerminologyCapabilities#kind() kind}
   *    .url(com.fhir.uri) // optional {@link TerminologyCapabilities#url() url}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link TerminologyCapabilities#contact() contact}
   *    .closure(com.fhir.TerminologyCapabilities_Closure) // optional {@link TerminologyCapabilities#closure() closure}
   *    .build();
   * </pre>
   * @return A new TerminologyCapabilities builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableTerminologyCapabilities.Builder();
  }

  /**
   * Builds instances of type {@link TerminologyCapabilities TerminologyCapabilities}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "TerminologyCapabilities", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IMPLEMENTATION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_EXPANSION = 0x8L;
    private static final long OPT_BIT_CODE_SEARCH = 0x10L;
    private static final long OPT_BIT_PUBLISHER = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_TITLE = 0x80L;
    private static final long OPT_BIT_CODE_SYSTEM = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_NAME = 0x400L;
    private static final long OPT_BIT_COPYRIGHT = 0x800L;
    private static final long OPT_BIT_VALIDATE_CODE = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_DESCRIPTION = 0x4000L;
    private static final long OPT_BIT_DATE = 0x8000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x10000L;
    private static final long OPT_BIT_TRANSLATION = 0x20000L;
    private static final long OPT_BIT_VERSION = 0x40000L;
    private static final long OPT_BIT_STATUS = 0x80000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400000L;
    private static final long OPT_BIT_SOFTWARE = 0x800000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x1000000L;
    private static final long OPT_BIT_PURPOSE = 0x2000000L;
    private static final long OPT_BIT_LOCKED_DATE = 0x4000000L;
    private static final long OPT_BIT_JURISDICTION = 0x8000000L;
    private static final long OPT_BIT_KIND = 0x10000000L;
    private static final long OPT_BIT_URL = 0x20000000L;
    private static final long OPT_BIT_CONTACT = 0x40000000L;
    private static final long OPT_BIT_CLOSURE = 0x80000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Implementation implementation;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Expansion expansion;
    private @javax.annotation.Nullable com.fhir.TerminologycapabilitiesCodesearch codeSearch;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_CodeSystem> codeSystem;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.TerminologyCapabilities_ValidateCode validateCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Translation translation;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable com.fhir.TerminologycapabilitiesStatus status;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Software software;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.lang.Boolean lockedDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.code kind;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.TerminologyCapabilities_Closure closure;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for chained invocation
     */
    public final Builder implementation(com.fhir.TerminologyCapabilities_Implementation implementation) {
      checkNotIsSet(implementationIsSet(), "implementation");
      this.implementation = java.util.Objects.requireNonNull(implementation, "implementation");
      optBits |= OPT_BIT_IMPLEMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implementation")
    public final Builder implementation(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Implementation> implementation) {
      checkNotIsSet(implementationIsSet(), "implementation");
      this.implementation = implementation.orElse(null);
      optBits |= OPT_BIT_IMPLEMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities#meta() meta} to meta.
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
     * Initializes the optional value {@link TerminologyCapabilities#meta() meta} to meta.
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
     * Initializes the optional value {@link TerminologyCapabilities#expansion() expansion} to expansion.
     * @param expansion The value for expansion
     * @return {@code this} builder for chained invocation
     */
    public final Builder expansion(com.fhir.TerminologyCapabilities_Expansion expansion) {
      checkNotIsSet(expansionIsSet(), "expansion");
      this.expansion = java.util.Objects.requireNonNull(expansion, "expansion");
      optBits |= OPT_BIT_EXPANSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#expansion() expansion} to expansion.
     * @param expansion The value for expansion
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expansion")
    public final Builder expansion(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Expansion> expansion) {
      checkNotIsSet(expansionIsSet(), "expansion");
      this.expansion = expansion.orElse(null);
      optBits |= OPT_BIT_EXPANSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSearch() codeSearch} to codeSearch.
     * @param codeSearch The value for codeSearch
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeSearch(com.fhir.TerminologycapabilitiesCodesearch codeSearch) {
      checkNotIsSet(codeSearchIsSet(), "codeSearch");
      this.codeSearch = java.util.Objects.requireNonNull(codeSearch, "codeSearch");
      optBits |= OPT_BIT_CODE_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSearch() codeSearch} to codeSearch.
     * @param codeSearch The value for codeSearch
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("codeSearch")
    public final Builder codeSearch(java.util.Optional<? extends com.fhir.TerminologycapabilitiesCodesearch> codeSearch) {
      checkNotIsSet(codeSearchIsSet(), "codeSearch");
      this.codeSearch = codeSearch.orElse(null);
      optBits |= OPT_BIT_CODE_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link TerminologyCapabilities#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link TerminologyCapabilities#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities#title() title} to title.
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
     * Initializes the optional value {@link TerminologyCapabilities#title() title} to title.
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
     * Initializes the optional value {@link TerminologyCapabilities#codeSystem() codeSystem} to codeSystem.
     * @param codeSystem The value for codeSystem
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeSystem(java.util.List<com.fhir.TerminologyCapabilities_CodeSystem> codeSystem) {
      checkNotIsSet(codeSystemIsSet(), "codeSystem");
      this.codeSystem = java.util.Objects.requireNonNull(codeSystem, "codeSystem");
      optBits |= OPT_BIT_CODE_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSystem() codeSystem} to codeSystem.
     * @param codeSystem The value for codeSystem
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("codeSystem")
    public final Builder codeSystem(java.util.Optional<? extends java.util.List<com.fhir.TerminologyCapabilities_CodeSystem>> codeSystem) {
      checkNotIsSet(codeSystemIsSet(), "codeSystem");
      this.codeSystem = codeSystem.orElse(null);
      optBits |= OPT_BIT_CODE_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#contained() contained} to contained.
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
     * Initializes the optional value {@link TerminologyCapabilities#contained() contained} to contained.
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
     * Initializes the optional value {@link TerminologyCapabilities#name() name} to name.
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
     * Initializes the optional value {@link TerminologyCapabilities#name() name} to name.
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
     * Initializes the optional value {@link TerminologyCapabilities#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link TerminologyCapabilities#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link TerminologyCapabilities#validateCode() validateCode} to validateCode.
     * @param validateCode The value for validateCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder validateCode(com.fhir.TerminologyCapabilities_ValidateCode validateCode) {
      checkNotIsSet(validateCodeIsSet(), "validateCode");
      this.validateCode = java.util.Objects.requireNonNull(validateCode, "validateCode");
      optBits |= OPT_BIT_VALIDATE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#validateCode() validateCode} to validateCode.
     * @param validateCode The value for validateCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validateCode")
    public final Builder validateCode(java.util.Optional<? extends com.fhir.TerminologyCapabilities_ValidateCode> validateCode) {
      checkNotIsSet(validateCodeIsSet(), "validateCode");
      this.validateCode = validateCode.orElse(null);
      optBits |= OPT_BIT_VALIDATE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities#description() description} to description.
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
     * Initializes the optional value {@link TerminologyCapabilities#description() description} to description.
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
     * Initializes the optional value {@link TerminologyCapabilities#date() date} to date.
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
     * Initializes the optional value {@link TerminologyCapabilities#date() date} to date.
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
     * Initializes the optional value {@link TerminologyCapabilities#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link TerminologyCapabilities#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link TerminologyCapabilities#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for chained invocation
     */
    public final Builder translation(com.fhir.TerminologyCapabilities_Translation translation) {
      checkNotIsSet(translationIsSet(), "translation");
      this.translation = java.util.Objects.requireNonNull(translation, "translation");
      optBits |= OPT_BIT_TRANSLATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("translation")
    public final Builder translation(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Translation> translation) {
      checkNotIsSet(translationIsSet(), "translation");
      this.translation = translation.orElse(null);
      optBits |= OPT_BIT_TRANSLATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#version() version} to version.
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
     * Initializes the optional value {@link TerminologyCapabilities#version() version} to version.
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
     * Initializes the optional value {@link TerminologyCapabilities#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.TerminologycapabilitiesStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.TerminologycapabilitiesStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#language() language} to language.
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
     * Initializes the optional value {@link TerminologyCapabilities#language() language} to language.
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
     * Initializes the optional value {@link TerminologyCapabilities#text() text} to text.
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
     * Initializes the optional value {@link TerminologyCapabilities#text() text} to text.
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
     * Initializes the optional value {@link TerminologyCapabilities#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link TerminologyCapabilities#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link TerminologyCapabilities#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for chained invocation
     */
    public final Builder software(com.fhir.TerminologyCapabilities_Software software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = java.util.Objects.requireNonNull(software, "software");
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("software")
    public final Builder software(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Software> software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = software.orElse(null);
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the value for the {@link TerminologyCapabilities#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link TerminologyCapabilities#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link TerminologyCapabilities#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link TerminologyCapabilities#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link TerminologyCapabilities#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link TerminologyCapabilities#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lockedDate(boolean lockedDate) {
      checkNotIsSet(lockedDateIsSet(), "lockedDate");
      this.lockedDate = lockedDate;
      optBits |= OPT_BIT_LOCKED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lockedDate")
    public final Builder lockedDate(java.util.Optional<java.lang.Boolean> lockedDate) {
      checkNotIsSet(lockedDateIsSet(), "lockedDate");
      this.lockedDate = lockedDate.orElse(null);
      optBits |= OPT_BIT_LOCKED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link TerminologyCapabilities#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link TerminologyCapabilities#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(com.fhir.code kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = java.util.Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public final Builder kind(java.util.Optional<? extends com.fhir.code> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#url() url} to url.
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
     * Initializes the optional value {@link TerminologyCapabilities#url() url} to url.
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
     * Initializes the optional value {@link TerminologyCapabilities#contact() contact} to contact.
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
     * Initializes the optional value {@link TerminologyCapabilities#contact() contact} to contact.
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
     * Initializes the optional value {@link TerminologyCapabilities#closure() closure} to closure.
     * @param closure The value for closure
     * @return {@code this} builder for chained invocation
     */
    public final Builder closure(com.fhir.TerminologyCapabilities_Closure closure) {
      checkNotIsSet(closureIsSet(), "closure");
      this.closure = java.util.Objects.requireNonNull(closure, "closure");
      optBits |= OPT_BIT_CLOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#closure() closure} to closure.
     * @param closure The value for closure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("closure")
    public final Builder closure(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Closure> closure) {
      checkNotIsSet(closureIsSet(), "closure");
      this.closure = closure.orElse(null);
      optBits |= OPT_BIT_CLOSURE;
      return this;
    }

    /**
     * Builds a new {@link TerminologyCapabilities TerminologyCapabilities}.
     * @return An immutable instance of TerminologyCapabilities
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TerminologyCapabilities build() {
      checkRequiredAttributes();
      return new ImmutableTerminologyCapabilities(
          implementation,
          id,
          meta,
          expansion,
          codeSearch,
          publisher,
          extension,
          title,
          codeSystem,
          contained,
          name,
          copyright,
          validateCode,
          modifierExtension,
          description,
          date,
          useContext,
          translation,
          version,
          status,
          language,
          text,
          implicitRules,
          software,
          resourceType,
          experimental,
          purpose,
          lockedDate,
          jurisdiction,
          kind,
          url,
          contact,
          closure);
    }

    private boolean implementationIsSet() {
      return (optBits & OPT_BIT_IMPLEMENTATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean expansionIsSet() {
      return (optBits & OPT_BIT_EXPANSION) != 0;
    }

    private boolean codeSearchIsSet() {
      return (optBits & OPT_BIT_CODE_SEARCH) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean codeSystemIsSet() {
      return (optBits & OPT_BIT_CODE_SYSTEM) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean validateCodeIsSet() {
      return (optBits & OPT_BIT_VALIDATE_CODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean translationIsSet() {
      return (optBits & OPT_BIT_TRANSLATION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean softwareIsSet() {
      return (optBits & OPT_BIT_SOFTWARE) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean lockedDateIsSet() {
      return (optBits & OPT_BIT_LOCKED_DATE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean closureIsSet() {
      return (optBits & OPT_BIT_CLOSURE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TerminologyCapabilities is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build TerminologyCapabilities, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "TerminologyCapabilities", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link TerminologyCapabilities#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "TerminologyCapabilities", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implementation(com.fhir.TerminologyCapabilities_Implementation implementation);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implementation(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Implementation> implementation);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#expansion() expansion} to expansion.
     * @param expansion The value for expansion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expansion(com.fhir.TerminologyCapabilities_Expansion expansion);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#expansion() expansion} to expansion.
     * @param expansion The value for expansion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expansion(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Expansion> expansion);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSearch() codeSearch} to codeSearch.
     * @param codeSearch The value for codeSearch
     * @return {@code this} builder for chained invocation
     */
    BuildFinal codeSearch(com.fhir.TerminologycapabilitiesCodesearch codeSearch);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSearch() codeSearch} to codeSearch.
     * @param codeSearch The value for codeSearch
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal codeSearch(java.util.Optional<? extends com.fhir.TerminologycapabilitiesCodesearch> codeSearch);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSystem() codeSystem} to codeSystem.
     * @param codeSystem The value for codeSystem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal codeSystem(java.util.List<com.fhir.TerminologyCapabilities_CodeSystem> codeSystem);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSystem() codeSystem} to codeSystem.
     * @param codeSystem The value for codeSystem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal codeSystem(java.util.Optional<? extends java.util.List<com.fhir.TerminologyCapabilities_CodeSystem>> codeSystem);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#validateCode() validateCode} to validateCode.
     * @param validateCode The value for validateCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validateCode(com.fhir.TerminologyCapabilities_ValidateCode validateCode);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#validateCode() validateCode} to validateCode.
     * @param validateCode The value for validateCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validateCode(java.util.Optional<? extends com.fhir.TerminologyCapabilities_ValidateCode> validateCode);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal translation(com.fhir.TerminologyCapabilities_Translation translation);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal translation(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Translation> translation);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.TerminologycapabilitiesStatus status);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.TerminologycapabilitiesStatus> status);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for chained invocation
     */
    BuildFinal software(com.fhir.TerminologyCapabilities_Software software);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal software(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Software> software);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lockedDate(boolean lockedDate);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lockedDate(java.util.Optional<java.lang.Boolean> lockedDate);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(com.fhir.code kind);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(java.util.Optional<? extends com.fhir.code> kind);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#closure() closure} to closure.
     * @param closure The value for closure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal closure(com.fhir.TerminologyCapabilities_Closure closure);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#closure() closure} to closure.
     * @param closure The value for closure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal closure(java.util.Optional<? extends com.fhir.TerminologyCapabilities_Closure> closure);

    /**
     * Builds a new {@link TerminologyCapabilities TerminologyCapabilities}.
     * @return An immutable instance of TerminologyCapabilities
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TerminologyCapabilities build();
  }
}
