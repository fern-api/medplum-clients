//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CompartmentDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCompartmentDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "CompartmentDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCompartmentDefinition implements com.fhir.CompartmentDefinition {
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.CompartmentdefinitionStatus status;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CompartmentdefinitionCode code;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.lang.Boolean search;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CompartmentDefinition_Resource> resource;
  private final @javax.annotation.Nullable com.fhir.uri url;

  private ImmutableCompartmentDefinition(
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.CompartmentdefinitionStatus status,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CompartmentdefinitionCode code,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.lang.Boolean search,
      @javax.annotation.Nullable java.util.List<com.fhir.CompartmentDefinition_Resource> resource,
      @javax.annotation.Nullable com.fhir.uri url) {
    this.description = description;
    this.contained = contained;
    this.contact = contact;
    this.status = status;
    this.resourceType = resourceType;
    this.date = date;
    this.text = text;
    this.experimental = experimental;
    this.purpose = purpose;
    this.modifierExtension = modifierExtension;
    this.code = code;
    this.id = id;
    this.meta = meta;
    this.extension = extension;
    this.name = name;
    this.implicitRules = implicitRules;
    this.useContext = useContext;
    this.publisher = publisher;
    this.language = language;
    this.version = version;
    this.search = search;
    this.resource = resource;
    this.url = url;
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
  public java.util.Optional<com.fhir.CompartmentdefinitionStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CompartmentdefinitionCode> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code search} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("search")
  @Override
  public java.util.Optional<java.lang.Boolean> search() {
    return java.util.Optional.ofNullable(search);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CompartmentDefinition_Resource>> resource() {
    return java.util.Optional.ofNullable(resource);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableCompartmentDefinition(
        newValue,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableCompartmentDefinition(
        value,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        newValue,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        value,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        newValue,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        value,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withStatus(com.fhir.CompartmentdefinitionStatus value) {
    @javax.annotation.Nullable com.fhir.CompartmentdefinitionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        newValue,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withStatus(java.util.Optional<? extends com.fhir.CompartmentdefinitionStatus> optional) {
    @javax.annotation.Nullable com.fhir.CompartmentdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        value,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CompartmentDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCompartmentDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        newValue,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        newValue,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        value,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        newValue,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        value,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        newValue,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        value,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        newValue,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        value,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        newValue,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        value,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withCode(com.fhir.CompartmentdefinitionCode value) {
    @javax.annotation.Nullable com.fhir.CompartmentdefinitionCode newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        newValue,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withCode(java.util.Optional<? extends com.fhir.CompartmentdefinitionCode> optional) {
    @javax.annotation.Nullable com.fhir.CompartmentdefinitionCode value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        value,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        newValue,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        value,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        newValue,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        value,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        newValue,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        value,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        newValue,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        value,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        newValue,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        value,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        newValue,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        value,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        newValue,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        value,
        this.language,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        newValue,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        value,
        this.version,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        newValue,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        value,
        this.search,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#search() search} attribute.
   * @param value The value for search
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withSearch(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.search, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        newValue,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#search() search} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for search
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withSearch(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.search, value)) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        value,
        this.resource,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withResource(java.util.List<com.fhir.CompartmentDefinition_Resource> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CompartmentDefinition_Resource> newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        newValue,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withResource(java.util.Optional<? extends java.util.List<com.fhir.CompartmentDefinition_Resource>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CompartmentDefinition_Resource> value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        value,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableCompartmentDefinition(
        this.description,
        this.contained,
        this.contact,
        this.status,
        this.resourceType,
        this.date,
        this.text,
        this.experimental,
        this.purpose,
        this.modifierExtension,
        this.code,
        this.id,
        this.meta,
        this.extension,
        this.name,
        this.implicitRules,
        this.useContext,
        this.publisher,
        this.language,
        this.version,
        this.search,
        this.resource,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCompartmentDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCompartmentDefinition
        && equalTo((ImmutableCompartmentDefinition) another);
  }

  private boolean equalTo(ImmutableCompartmentDefinition another) {
    return java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(status, another.status)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(search, another.search)
        && java.util.Objects.equals(resource, another.resource)
        && java.util.Objects.equals(url, another.url);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code contained}, {@code contact}, {@code status}, {@code resourceType}, {@code date}, {@code text}, {@code experimental}, {@code purpose}, {@code modifierExtension}, {@code code}, {@code id}, {@code meta}, {@code extension}, {@code name}, {@code implicitRules}, {@code useContext}, {@code publisher}, {@code language}, {@code version}, {@code search}, {@code resource}, {@code url}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(search);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    h += (h << 5) + java.util.Objects.hashCode(url);
    return h;
  }

  /**
   * Prints the immutable value {@code CompartmentDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CompartmentDefinition{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (contained != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (contact != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (status != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (search != null) {
      builder.append(", ");
      builder.append("search=").append(search);
    }
    if (resource != null) {
      builder.append(", ");
      builder.append("resource=").append(resource);
    }
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
  @org.immutables.value.Generated(from = "CompartmentDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CompartmentDefinition {
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CompartmentdefinitionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CompartmentdefinitionCode> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> search = java.util.Optional.empty();
    boolean searchIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CompartmentDefinition_Resource>> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.CompartmentdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CompartmentdefinitionCode> code) {
      this.code = code;
      this.codeIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("search")
    public void setSearch(java.util.Optional<java.lang.Boolean> search) {
      this.search = search;
      this.searchIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<java.util.List<com.fhir.CompartmentDefinition_Resource>> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CompartmentdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CompartmentdefinitionCode> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> search() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CompartmentDefinition_Resource>> resource() { throw new UnsupportedOperationException(); }
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
  static ImmutableCompartmentDefinition fromJson(Json json) {
    ImmutableCompartmentDefinition.Builder builder = ((ImmutableCompartmentDefinition.Builder) ImmutableCompartmentDefinition.builder());
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.searchIsSet) {
      builder.search(json.search);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    return (ImmutableCompartmentDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CompartmentDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CompartmentDefinition instance
   */
  public static CompartmentDefinition copyOf(CompartmentDefinition instance) {
    if (instance instanceof ImmutableCompartmentDefinition) {
      return (ImmutableCompartmentDefinition) instance;
    }
    return ((ImmutableCompartmentDefinition.Builder) ImmutableCompartmentDefinition.builder())
        .description(instance.description())
        .contained(instance.contained())
        .contact(instance.contact())
        .status(instance.status())
        .resourceType(instance.resourceType())
        .date(instance.date())
        .text(instance.text())
        .experimental(instance.experimental())
        .purpose(instance.purpose())
        .modifierExtension(instance.modifierExtension())
        .code(instance.code())
        .id(instance.id())
        .meta(instance.meta())
        .extension(instance.extension())
        .name(instance.name())
        .implicitRules(instance.implicitRules())
        .useContext(instance.useContext())
        .publisher(instance.publisher())
        .language(instance.language())
        .version(instance.version())
        .search(instance.search())
        .resource(instance.resource())
        .url(instance.url())
        .build();
  }

  /**
   * Creates a builder for {@link CompartmentDefinition CompartmentDefinition}.
   * <pre>
   * ImmutableCompartmentDefinition.builder()
   *    .description(com.fhir.markdown) // optional {@link CompartmentDefinition#description() description}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link CompartmentDefinition#contained() contained}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link CompartmentDefinition#contact() contact}
   *    .status(com.fhir.CompartmentdefinitionStatus) // optional {@link CompartmentDefinition#status() status}
   *    .resourceType(String) // required {@link CompartmentDefinition#resourceType() resourceType}
   *    .date(com.fhir.dateTime) // optional {@link CompartmentDefinition#date() date}
   *    .text(com.fhir.Narrative) // optional {@link CompartmentDefinition#text() text}
   *    .experimental(Boolean) // optional {@link CompartmentDefinition#experimental() experimental}
   *    .purpose(com.fhir.markdown) // optional {@link CompartmentDefinition#purpose() purpose}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CompartmentDefinition#modifierExtension() modifierExtension}
   *    .code(com.fhir.CompartmentdefinitionCode) // optional {@link CompartmentDefinition#code() code}
   *    .id(com.fhir.id) // optional {@link CompartmentDefinition#id() id}
   *    .meta(com.fhir.Meta) // optional {@link CompartmentDefinition#meta() meta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CompartmentDefinition#extension() extension}
   *    .name(String) // optional {@link CompartmentDefinition#name() name}
   *    .implicitRules(com.fhir.uri) // optional {@link CompartmentDefinition#implicitRules() implicitRules}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link CompartmentDefinition#useContext() useContext}
   *    .publisher(String) // optional {@link CompartmentDefinition#publisher() publisher}
   *    .language(com.fhir.code) // optional {@link CompartmentDefinition#language() language}
   *    .version(String) // optional {@link CompartmentDefinition#version() version}
   *    .search(Boolean) // optional {@link CompartmentDefinition#search() search}
   *    .resource(List&amp;lt;com.fhir.CompartmentDefinition_Resource&amp;gt;) // optional {@link CompartmentDefinition#resource() resource}
   *    .url(com.fhir.uri) // optional {@link CompartmentDefinition#url() url}
   *    .build();
   * </pre>
   * @return A new CompartmentDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCompartmentDefinition.Builder();
  }

  /**
   * Builds instances of type {@link CompartmentDefinition CompartmentDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CompartmentDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_CONTACT = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_DATE = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x40L;
    private static final long OPT_BIT_PURPOSE = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_CODE = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_NAME = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x8000L;
    private static final long OPT_BIT_PUBLISHER = 0x10000L;
    private static final long OPT_BIT_LANGUAGE = 0x20000L;
    private static final long OPT_BIT_VERSION = 0x40000L;
    private static final long OPT_BIT_SEARCH = 0x80000L;
    private static final long OPT_BIT_RESOURCE = 0x100000L;
    private static final long OPT_BIT_URL = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.CompartmentdefinitionStatus status;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CompartmentdefinitionCode code;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.lang.Boolean search;
    private @javax.annotation.Nullable java.util.List<com.fhir.CompartmentDefinition_Resource> resource;
    private @javax.annotation.Nullable com.fhir.uri url;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#description() description} to description.
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
     * Initializes the optional value {@link CompartmentDefinition#description() description} to description.
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
     * Initializes the optional value {@link CompartmentDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link CompartmentDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link CompartmentDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link CompartmentDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link CompartmentDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.CompartmentdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.CompartmentdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link CompartmentDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CompartmentDefinition#date() date} to date.
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
     * Initializes the optional value {@link CompartmentDefinition#date() date} to date.
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
     * Initializes the optional value {@link CompartmentDefinition#text() text} to text.
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
     * Initializes the optional value {@link CompartmentDefinition#text() text} to text.
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
     * Initializes the optional value {@link CompartmentDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link CompartmentDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link CompartmentDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link CompartmentDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link CompartmentDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CompartmentDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CompartmentDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CompartmentdefinitionCode code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CompartmentdefinitionCode> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#id() id} to id.
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
     * Initializes the optional value {@link CompartmentDefinition#id() id} to id.
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
     * Initializes the optional value {@link CompartmentDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link CompartmentDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link CompartmentDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link CompartmentDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link CompartmentDefinition#name() name} to name.
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
     * Initializes the optional value {@link CompartmentDefinition#name() name} to name.
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
     * Initializes the optional value {@link CompartmentDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CompartmentDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CompartmentDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link CompartmentDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link CompartmentDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link CompartmentDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link CompartmentDefinition#language() language} to language.
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
     * Initializes the optional value {@link CompartmentDefinition#language() language} to language.
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
     * Initializes the optional value {@link CompartmentDefinition#version() version} to version.
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
     * Initializes the optional value {@link CompartmentDefinition#version() version} to version.
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
     * Initializes the optional value {@link CompartmentDefinition#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for chained invocation
     */
    public final Builder search(boolean search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = search;
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("search")
    public final Builder search(java.util.Optional<java.lang.Boolean> search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = search.orElse(null);
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(java.util.List<com.fhir.CompartmentDefinition_Resource> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends java.util.List<com.fhir.CompartmentDefinition_Resource>> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#url() url} to url.
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
     * Initializes the optional value {@link CompartmentDefinition#url() url} to url.
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
     * Builds a new {@link CompartmentDefinition CompartmentDefinition}.
     * @return An immutable instance of CompartmentDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CompartmentDefinition build() {
      checkRequiredAttributes();
      return new ImmutableCompartmentDefinition(
          description,
          contained,
          contact,
          status,
          resourceType,
          date,
          text,
          experimental,
          purpose,
          modifierExtension,
          code,
          id,
          meta,
          extension,
          name,
          implicitRules,
          useContext,
          publisher,
          language,
          version,
          search,
          resource,
          url);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean searchIsSet() {
      return (optBits & OPT_BIT_SEARCH) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CompartmentDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CompartmentDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CompartmentDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CompartmentDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "CompartmentDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CompartmentDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link CompartmentDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link CompartmentDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link CompartmentDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link CompartmentDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link CompartmentDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link CompartmentDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.CompartmentdefinitionStatus status);

    /**
     * Initializes the optional value {@link CompartmentDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.CompartmentdefinitionStatus> status);

    /**
     * Initializes the optional value {@link CompartmentDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link CompartmentDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link CompartmentDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link CompartmentDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link CompartmentDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link CompartmentDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link CompartmentDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link CompartmentDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link CompartmentDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CompartmentDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CompartmentDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CompartmentdefinitionCode code);

    /**
     * Initializes the optional value {@link CompartmentDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CompartmentdefinitionCode> code);

    /**
     * Initializes the optional value {@link CompartmentDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link CompartmentDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link CompartmentDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link CompartmentDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link CompartmentDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CompartmentDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CompartmentDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link CompartmentDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link CompartmentDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link CompartmentDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link CompartmentDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link CompartmentDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link CompartmentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link CompartmentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link CompartmentDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link CompartmentDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link CompartmentDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link CompartmentDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link CompartmentDefinition#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for chained invocation
     */
    BuildFinal search(boolean search);

    /**
     * Initializes the optional value {@link CompartmentDefinition#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal search(java.util.Optional<java.lang.Boolean> search);

    /**
     * Initializes the optional value {@link CompartmentDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resource(java.util.List<com.fhir.CompartmentDefinition_Resource> resource);

    /**
     * Initializes the optional value {@link CompartmentDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resource(java.util.Optional<? extends java.util.List<com.fhir.CompartmentDefinition_Resource>> resource);

    /**
     * Initializes the optional value {@link CompartmentDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link CompartmentDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Builds a new {@link CompartmentDefinition CompartmentDefinition}.
     * @return An immutable instance of CompartmentDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CompartmentDefinition build();
  }
}
