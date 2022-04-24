//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link GraphDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGraphDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "GraphDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGraphDefinition implements com.fhir.GraphDefinition {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.code start;
  private final @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> link;
  private final @javax.annotation.Nullable com.fhir.canonical profile;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.GraphdefinitionStatus status;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri url;

  private ImmutableGraphDefinition(
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.code start,
      @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> link,
      @javax.annotation.Nullable com.fhir.canonical profile,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.GraphdefinitionStatus status,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri url) {
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.date = date;
    this.language = language;
    this.start = start;
    this.link = link;
    this.profile = profile;
    this.version = version;
    this.useContext = useContext;
    this.status = status;
    this.id = id;
    this.meta = meta;
    this.text = text;
    this.name = name;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.description = description;
    this.publisher = publisher;
    this.purpose = purpose;
    this.contact = contact;
    this.experimental = experimental;
    this.jurisdiction = jurisdiction;
    this.resourceType = resourceType;
    this.url = url;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code start} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("start")
  @Override
  public java.util.Optional<com.fhir.code> start() {
    return java.util.Optional.ofNullable(start);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("link")
  @Override
  public java.util.Optional<java.util.List<com.fhir.GraphDefinition_Link>> link() {
    return java.util.Optional.ofNullable(link);
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("profile")
  @Override
  public java.util.Optional<com.fhir.canonical> profile() {
    return java.util.Optional.ofNullable(profile);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.GraphdefinitionStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<com.fhir.markdown> purpose() {
    return java.util.Optional.ofNullable(purpose);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableGraphDefinition(
        newValue,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableGraphDefinition(
        value,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        newValue,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        value,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        newValue,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        value,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        newValue,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        value,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withStart(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        newValue,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withStart(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        value,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withLink(java.util.List<com.fhir.GraphDefinition_Link> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> newValue = java.util.Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        newValue,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withLink(java.util.Optional<? extends java.util.List<com.fhir.GraphDefinition_Link>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        value,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withProfile(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        newValue,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withProfile(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        value,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        newValue,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        value,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        newValue,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        value,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withStatus(com.fhir.GraphdefinitionStatus value) {
    @javax.annotation.Nullable com.fhir.GraphdefinitionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        newValue,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withStatus(java.util.Optional<? extends com.fhir.GraphdefinitionStatus> optional) {
    @javax.annotation.Nullable com.fhir.GraphdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        value,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        newValue,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        value,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        newValue,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        value,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        newValue,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        value,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        newValue,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        value,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        newValue,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        value,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        newValue,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        value,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        newValue,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        value,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        newValue,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        value,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        newValue,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        value,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        newValue,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        value,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        newValue,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        value,
        this.jurisdiction,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        newValue,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        value,
        this.resourceType,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GraphDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGraphDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        newValue,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableGraphDefinition(
        this.contained,
        this.modifierExtension,
        this.date,
        this.language,
        this.start,
        this.link,
        this.profile,
        this.version,
        this.useContext,
        this.status,
        this.id,
        this.meta,
        this.text,
        this.name,
        this.implicitRules,
        this.extension,
        this.description,
        this.publisher,
        this.purpose,
        this.contact,
        this.experimental,
        this.jurisdiction,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGraphDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGraphDefinition
        && equalTo((ImmutableGraphDefinition) another);
  }

  private boolean equalTo(ImmutableGraphDefinition another) {
    return java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(start, another.start)
        && java.util.Objects.equals(link, another.link)
        && java.util.Objects.equals(profile, another.profile)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(url, another.url);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code modifierExtension}, {@code date}, {@code language}, {@code start}, {@code link}, {@code profile}, {@code version}, {@code useContext}, {@code status}, {@code id}, {@code meta}, {@code text}, {@code name}, {@code implicitRules}, {@code extension}, {@code description}, {@code publisher}, {@code purpose}, {@code contact}, {@code experimental}, {@code jurisdiction}, {@code resourceType}, {@code url}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(start);
    h += (h << 5) + java.util.Objects.hashCode(link);
    h += (h << 5) + java.util.Objects.hashCode(profile);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(url);
    return h;
  }

  /**
   * Prints the immutable value {@code GraphDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("GraphDefinition{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (date != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (language != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (start != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("start=").append(start);
    }
    if (link != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("link=").append(link);
    }
    if (profile != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (version != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (useContext != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (status != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (text != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (name != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (implicitRules != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (publisher != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (purpose != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (contact != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (experimental != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (jurisdiction != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "GraphDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.GraphDefinition {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> start = java.util.Optional.empty();
    boolean startIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.GraphDefinition_Link>> link = java.util.Optional.empty();
    boolean linkIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> profile = java.util.Optional.empty();
    boolean profileIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.GraphdefinitionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    public void setStart(java.util.Optional<com.fhir.code> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public void setLink(java.util.Optional<java.util.List<com.fhir.GraphDefinition_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(java.util.Optional<com.fhir.canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.GraphdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> start() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.GraphDefinition_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.GraphdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableGraphDefinition fromJson(Json json) {
    ImmutableGraphDefinition.Builder builder = ((ImmutableGraphDefinition.Builder) ImmutableGraphDefinition.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.textIsSet) {
      builder.text(json.text);
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
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    return (ImmutableGraphDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GraphDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GraphDefinition instance
   */
  public static GraphDefinition copyOf(GraphDefinition instance) {
    if (instance instanceof ImmutableGraphDefinition) {
      return (ImmutableGraphDefinition) instance;
    }
    return ((ImmutableGraphDefinition.Builder) ImmutableGraphDefinition.builder())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .date(instance.date())
        .language(instance.language())
        .start(instance.start())
        .link(instance.link())
        .profile(instance.profile())
        .version(instance.version())
        .useContext(instance.useContext())
        .status(instance.status())
        .id(instance.id())
        .meta(instance.meta())
        .text(instance.text())
        .name(instance.name())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .description(instance.description())
        .publisher(instance.publisher())
        .purpose(instance.purpose())
        .contact(instance.contact())
        .experimental(instance.experimental())
        .jurisdiction(instance.jurisdiction())
        .resourceType(instance.resourceType())
        .url(instance.url())
        .build();
  }

  /**
   * Creates a builder for {@link GraphDefinition GraphDefinition}.
   * <pre>
   * ImmutableGraphDefinition.builder()
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link GraphDefinition#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link GraphDefinition#modifierExtension() modifierExtension}
   *    .date(com.fhir.dateTime) // optional {@link GraphDefinition#date() date}
   *    .language(com.fhir.code) // optional {@link GraphDefinition#language() language}
   *    .start(com.fhir.code) // optional {@link GraphDefinition#start() start}
   *    .link(List&amp;lt;com.fhir.GraphDefinition_Link&amp;gt;) // optional {@link GraphDefinition#link() link}
   *    .profile(com.fhir.canonical) // optional {@link GraphDefinition#profile() profile}
   *    .version(String) // optional {@link GraphDefinition#version() version}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link GraphDefinition#useContext() useContext}
   *    .status(com.fhir.GraphdefinitionStatus) // optional {@link GraphDefinition#status() status}
   *    .id(com.fhir.id) // optional {@link GraphDefinition#id() id}
   *    .meta(com.fhir.Meta) // optional {@link GraphDefinition#meta() meta}
   *    .text(com.fhir.Narrative) // optional {@link GraphDefinition#text() text}
   *    .name(String) // optional {@link GraphDefinition#name() name}
   *    .implicitRules(com.fhir.uri) // optional {@link GraphDefinition#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link GraphDefinition#extension() extension}
   *    .description(com.fhir.markdown) // optional {@link GraphDefinition#description() description}
   *    .publisher(String) // optional {@link GraphDefinition#publisher() publisher}
   *    .purpose(com.fhir.markdown) // optional {@link GraphDefinition#purpose() purpose}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link GraphDefinition#contact() contact}
   *    .experimental(Boolean) // optional {@link GraphDefinition#experimental() experimental}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link GraphDefinition#jurisdiction() jurisdiction}
   *    .resourceType(String) // required {@link GraphDefinition#resourceType() resourceType}
   *    .url(com.fhir.uri) // optional {@link GraphDefinition#url() url}
   *    .build();
   * </pre>
   * @return A new GraphDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableGraphDefinition.Builder();
  }

  /**
   * Builds instances of type {@link GraphDefinition GraphDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "GraphDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_START = 0x10L;
    private static final long OPT_BIT_LINK = 0x20L;
    private static final long OPT_BIT_PROFILE = 0x40L;
    private static final long OPT_BIT_VERSION = 0x80L;
    private static final long OPT_BIT_USE_CONTEXT = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_NAME = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private static final long OPT_BIT_EXTENSION = 0x8000L;
    private static final long OPT_BIT_DESCRIPTION = 0x10000L;
    private static final long OPT_BIT_PUBLISHER = 0x20000L;
    private static final long OPT_BIT_PURPOSE = 0x40000L;
    private static final long OPT_BIT_CONTACT = 0x80000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x100000L;
    private static final long OPT_BIT_JURISDICTION = 0x200000L;
    private static final long OPT_BIT_URL = 0x400000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.code start;
    private @javax.annotation.Nullable java.util.List<com.fhir.GraphDefinition_Link> link;
    private @javax.annotation.Nullable com.fhir.canonical profile;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.GraphdefinitionStatus status;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri url;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link GraphDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link GraphDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link GraphDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition#date() date} to date.
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
     * Initializes the optional value {@link GraphDefinition#date() date} to date.
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
     * Initializes the optional value {@link GraphDefinition#language() language} to language.
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
     * Initializes the optional value {@link GraphDefinition#language() language} to language.
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
     * Initializes the optional value {@link GraphDefinition#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    public final Builder start(com.fhir.code start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = java.util.Objects.requireNonNull(start, "start");
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    public final Builder start(java.util.Optional<? extends com.fhir.code> start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start.orElse(null);
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(java.util.List<com.fhir.GraphDefinition_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = java.util.Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public final Builder link(java.util.Optional<? extends java.util.List<com.fhir.GraphDefinition_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(com.fhir.canonical profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = java.util.Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public final Builder profile(java.util.Optional<? extends com.fhir.canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#version() version} to version.
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
     * Initializes the optional value {@link GraphDefinition#version() version} to version.
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
     * Initializes the optional value {@link GraphDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link GraphDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link GraphDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.GraphdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.GraphdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link GraphDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link GraphDefinition#text() text} to text.
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
     * Initializes the optional value {@link GraphDefinition#text() text} to text.
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
     * Initializes the optional value {@link GraphDefinition#name() name} to name.
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
     * Initializes the optional value {@link GraphDefinition#name() name} to name.
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
     * Initializes the optional value {@link GraphDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link GraphDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link GraphDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition#description() description} to description.
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
     * Initializes the optional value {@link GraphDefinition#description() description} to description.
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
     * Initializes the optional value {@link GraphDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link GraphDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link GraphDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link GraphDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link GraphDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link GraphDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link GraphDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link GraphDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link GraphDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link GraphDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the value for the {@link GraphDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link GraphDefinition#url() url} to url.
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
     * Initializes the optional value {@link GraphDefinition#url() url} to url.
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
     * Builds a new {@link GraphDefinition GraphDefinition}.
     * @return An immutable instance of GraphDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.GraphDefinition build() {
      checkRequiredAttributes();
      return new ImmutableGraphDefinition(
          contained,
          modifierExtension,
          date,
          language,
          start,
          link,
          profile,
          version,
          useContext,
          status,
          id,
          meta,
          text,
          name,
          implicitRules,
          extension,
          description,
          publisher,
          purpose,
          contact,
          experimental,
          jurisdiction,
          resourceType,
          url);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
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

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of GraphDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build GraphDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "GraphDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link GraphDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "GraphDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link GraphDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link GraphDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link GraphDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link GraphDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link GraphDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link GraphDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link GraphDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link GraphDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link GraphDefinition#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    BuildFinal start(com.fhir.code start);

    /**
     * Initializes the optional value {@link GraphDefinition#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal start(java.util.Optional<? extends com.fhir.code> start);

    /**
     * Initializes the optional value {@link GraphDefinition#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(java.util.List<com.fhir.GraphDefinition_Link> link);

    /**
     * Initializes the optional value {@link GraphDefinition#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(java.util.Optional<? extends java.util.List<com.fhir.GraphDefinition_Link>> link);

    /**
     * Initializes the optional value {@link GraphDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal profile(com.fhir.canonical profile);

    /**
     * Initializes the optional value {@link GraphDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal profile(java.util.Optional<? extends com.fhir.canonical> profile);

    /**
     * Initializes the optional value {@link GraphDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link GraphDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link GraphDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link GraphDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link GraphDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.GraphdefinitionStatus status);

    /**
     * Initializes the optional value {@link GraphDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.GraphdefinitionStatus> status);

    /**
     * Initializes the optional value {@link GraphDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link GraphDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link GraphDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link GraphDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link GraphDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link GraphDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link GraphDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link GraphDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link GraphDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link GraphDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link GraphDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link GraphDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link GraphDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link GraphDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link GraphDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link GraphDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link GraphDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link GraphDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link GraphDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link GraphDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link GraphDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link GraphDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link GraphDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link GraphDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link GraphDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link GraphDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Builds a new {@link GraphDefinition GraphDefinition}.
     * @return An immutable instance of GraphDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    GraphDefinition build();
  }
}
