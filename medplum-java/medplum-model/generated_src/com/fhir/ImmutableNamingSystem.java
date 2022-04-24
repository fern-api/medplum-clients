//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link NamingSystem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNamingSystem.builder()}.
 */
@org.immutables.value.Generated(from = "NamingSystem", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNamingSystem implements com.fhir.NamingSystem {
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.lang.String usage;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.NamingsystemStatus status;
  private final @javax.annotation.Nullable java.lang.String responsible;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.NamingsystemKind kind;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.util.List<com.fhir.NamingSystem_UniqueId> uniqueId;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.String name;

  private ImmutableNamingSystem(
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.lang.String usage,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.NamingsystemStatus status,
      @javax.annotation.Nullable java.lang.String responsible,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.NamingsystemKind kind,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.util.List<com.fhir.NamingSystem_UniqueId> uniqueId,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.String name) {
    this.description = description;
    this.id = id;
    this.date = date;
    this.contact = contact;
    this.usage = usage;
    this.publisher = publisher;
    this.status = status;
    this.responsible = responsible;
    this.jurisdiction = jurisdiction;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.type = type;
    this.resourceType = resourceType;
    this.contained = contained;
    this.extension = extension;
    this.useContext = useContext;
    this.language = language;
    this.kind = kind;
    this.meta = meta;
    this.uniqueId = uniqueId;
    this.text = text;
    this.name = name;
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
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code usage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("usage")
  @Override
  public java.util.Optional<java.lang.String> usage() {
    return java.util.Optional.ofNullable(usage);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.NamingsystemStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code responsible} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("responsible")
  @Override
  public java.util.Optional<java.lang.String> responsible() {
    return java.util.Optional.ofNullable(responsible);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
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
   * @return The value of the {@code kind} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kind")
  @Override
  public java.util.Optional<com.fhir.NamingsystemKind> kind() {
    return java.util.Optional.ofNullable(kind);
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
   * @return The value of the {@code uniqueId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("uniqueId")
  @Override
  public java.util.List<com.fhir.NamingSystem_UniqueId> uniqueId() {
    return uniqueId;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableNamingSystem(
        newValue,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableNamingSystem(
        value,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        newValue,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        value,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        newValue,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        value,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        newValue,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        value,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUsage(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "usage");
    if (java.util.Objects.equals(this.usage, newValue)) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        newValue,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUsage(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.usage, value)) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        value,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        newValue,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        value,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withStatus(com.fhir.NamingsystemStatus value) {
    @javax.annotation.Nullable com.fhir.NamingsystemStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        newValue,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withStatus(java.util.Optional<? extends com.fhir.NamingsystemStatus> optional) {
    @javax.annotation.Nullable com.fhir.NamingsystemStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        value,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withResponsible(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "responsible");
    if (java.util.Objects.equals(this.responsible, newValue)) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        newValue,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#responsible() responsible} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withResponsible(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.responsible, value)) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        value,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        value,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        newValue,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        value,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        newValue,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        value,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        value,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NamingSystem#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNamingSystem withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        newValue,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        newValue,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        value,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        newValue,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        value,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        newValue,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        value,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        newValue,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        value,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withKind(com.fhir.NamingsystemKind value) {
    @javax.annotation.Nullable com.fhir.NamingsystemKind newValue = java.util.Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        newValue,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withKind(java.util.Optional<? extends com.fhir.NamingsystemKind> optional) {
    @javax.annotation.Nullable com.fhir.NamingsystemKind value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        value,
        this.meta,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        newValue,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        value,
        this.uniqueId,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link NamingSystem#uniqueId() uniqueId}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUniqueId(com.fhir.NamingSystem_UniqueId... elements) {
    java.util.List<com.fhir.NamingSystem_UniqueId> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        newValue,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link NamingSystem#uniqueId() uniqueId}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of uniqueId elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUniqueId(Iterable<? extends com.fhir.NamingSystem_UniqueId> elements) {
    if (this.uniqueId == elements) return this;
    java.util.List<com.fhir.NamingSystem_UniqueId> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        newValue,
        this.text,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        newValue,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        value,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableNamingSystem(
        this.description,
        this.id,
        this.date,
        this.contact,
        this.usage,
        this.publisher,
        this.status,
        this.responsible,
        this.jurisdiction,
        this.modifierExtension,
        this.implicitRules,
        this.type,
        this.resourceType,
        this.contained,
        this.extension,
        this.useContext,
        this.language,
        this.kind,
        this.meta,
        this.uniqueId,
        this.text,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNamingSystem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNamingSystem
        && equalTo((ImmutableNamingSystem) another);
  }

  private boolean equalTo(ImmutableNamingSystem another) {
    return java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(usage, another.usage)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(responsible, another.responsible)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(type, another.type)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(kind, another.kind)
        && java.util.Objects.equals(meta, another.meta)
        && uniqueId.equals(another.uniqueId)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code id}, {@code date}, {@code contact}, {@code usage}, {@code publisher}, {@code status}, {@code responsible}, {@code jurisdiction}, {@code modifierExtension}, {@code implicitRules}, {@code type}, {@code resourceType}, {@code contained}, {@code extension}, {@code useContext}, {@code language}, {@code kind}, {@code meta}, {@code uniqueId}, {@code text}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(usage);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(responsible);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(kind);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + uniqueId.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code NamingSystem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("NamingSystem{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (date != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (contact != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (usage != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (publisher != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (status != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (responsible != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("responsible=").append(responsible);
    }
    if (jurisdiction != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (modifierExtension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (type != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (kind != null) {
      builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("uniqueId=").append(uniqueId);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "NamingSystem", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.NamingSystem {
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> usage = java.util.Optional.empty();
    boolean usageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.NamingsystemStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> responsible = java.util.Optional.empty();
    boolean responsibleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.NamingsystemKind> kind = java.util.Optional.empty();
    boolean kindIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.NamingSystem_UniqueId> uniqueId = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    public void setUsage(java.util.Optional<java.lang.String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.NamingsystemStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("responsible")
    public void setResponsible(java.util.Optional<java.lang.String> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public void setKind(java.util.Optional<com.fhir.NamingsystemKind> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueId")
    public void setUniqueId(java.util.List<com.fhir.NamingSystem_UniqueId> uniqueId) {
      this.uniqueId = uniqueId;
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
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.NamingsystemStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> responsible() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.NamingsystemKind> kind() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.NamingSystem_UniqueId> uniqueId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableNamingSystem fromJson(Json json) {
    ImmutableNamingSystem.Builder builder = ((ImmutableNamingSystem.Builder) ImmutableNamingSystem.builder());
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.uniqueId != null) {
      builder.addAllUniqueId(json.uniqueId);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    return (ImmutableNamingSystem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NamingSystem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NamingSystem instance
   */
  public static NamingSystem copyOf(NamingSystem instance) {
    if (instance instanceof ImmutableNamingSystem) {
      return (ImmutableNamingSystem) instance;
    }
    return ((ImmutableNamingSystem.Builder) ImmutableNamingSystem.builder())
        .description(instance.description())
        .id(instance.id())
        .date(instance.date())
        .contact(instance.contact())
        .usage(instance.usage())
        .publisher(instance.publisher())
        .status(instance.status())
        .responsible(instance.responsible())
        .jurisdiction(instance.jurisdiction())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .type(instance.type())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .extension(instance.extension())
        .useContext(instance.useContext())
        .language(instance.language())
        .kind(instance.kind())
        .meta(instance.meta())
        .addAllUniqueId(instance.uniqueId())
        .text(instance.text())
        .name(instance.name())
        .build();
  }

  /**
   * Creates a builder for {@link NamingSystem NamingSystem}.
   * <pre>
   * ImmutableNamingSystem.builder()
   *    .description(com.fhir.markdown) // optional {@link NamingSystem#description() description}
   *    .id(com.fhir.id) // optional {@link NamingSystem#id() id}
   *    .date(com.fhir.dateTime) // optional {@link NamingSystem#date() date}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link NamingSystem#contact() contact}
   *    .usage(String) // optional {@link NamingSystem#usage() usage}
   *    .publisher(String) // optional {@link NamingSystem#publisher() publisher}
   *    .status(com.fhir.NamingsystemStatus) // optional {@link NamingSystem#status() status}
   *    .responsible(String) // optional {@link NamingSystem#responsible() responsible}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link NamingSystem#jurisdiction() jurisdiction}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link NamingSystem#modifierExtension() modifierExtension}
   *    .implicitRules(com.fhir.uri) // optional {@link NamingSystem#implicitRules() implicitRules}
   *    .type(com.fhir.CodeableConcept) // optional {@link NamingSystem#type() type}
   *    .resourceType(String) // required {@link NamingSystem#resourceType() resourceType}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link NamingSystem#contained() contained}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link NamingSystem#extension() extension}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link NamingSystem#useContext() useContext}
   *    .language(com.fhir.code) // optional {@link NamingSystem#language() language}
   *    .kind(com.fhir.NamingsystemKind) // optional {@link NamingSystem#kind() kind}
   *    .meta(com.fhir.Meta) // optional {@link NamingSystem#meta() meta}
   *    .addUniqueId|addAllUniqueId(com.fhir.NamingSystem_UniqueId) // {@link NamingSystem#uniqueId() uniqueId} elements
   *    .text(com.fhir.Narrative) // optional {@link NamingSystem#text() text}
   *    .name(String) // optional {@link NamingSystem#name() name}
   *    .build();
   * </pre>
   * @return A new NamingSystem builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableNamingSystem.Builder();
  }

  /**
   * Builds instances of type {@link NamingSystem NamingSystem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "NamingSystem", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_CONTACT = 0x8L;
    private static final long OPT_BIT_USAGE = 0x10L;
    private static final long OPT_BIT_PUBLISHER = 0x20L;
    private static final long OPT_BIT_STATUS = 0x40L;
    private static final long OPT_BIT_RESPONSIBLE = 0x80L;
    private static final long OPT_BIT_JURISDICTION = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400L;
    private static final long OPT_BIT_TYPE = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_KIND = 0x10000L;
    private static final long OPT_BIT_META = 0x20000L;
    private static final long OPT_BIT_TEXT = 0x40000L;
    private static final long OPT_BIT_NAME = 0x80000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.lang.String usage;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.NamingsystemStatus status;
    private @javax.annotation.Nullable java.lang.String responsible;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.NamingsystemKind kind;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private final java.util.List<com.fhir.NamingSystem_UniqueId> uniqueId = new java.util.ArrayList<com.fhir.NamingSystem_UniqueId>();
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String name;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link NamingSystem#description() description} to description.
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
     * Initializes the optional value {@link NamingSystem#description() description} to description.
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
     * Initializes the optional value {@link NamingSystem#id() id} to id.
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
     * Initializes the optional value {@link NamingSystem#id() id} to id.
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
     * Initializes the optional value {@link NamingSystem#date() date} to date.
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
     * Initializes the optional value {@link NamingSystem#date() date} to date.
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
     * Initializes the optional value {@link NamingSystem#contact() contact} to contact.
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
     * Initializes the optional value {@link NamingSystem#contact() contact} to contact.
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
     * Initializes the optional value {@link NamingSystem#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    public final Builder usage(java.lang.String usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = java.util.Objects.requireNonNull(usage, "usage");
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    public final Builder usage(java.util.Optional<java.lang.String> usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = usage.orElse(null);
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link NamingSystem#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link NamingSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.NamingsystemStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.NamingsystemStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    public final Builder responsible(java.lang.String responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = java.util.Objects.requireNonNull(responsible, "responsible");
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responsible")
    public final Builder responsible(java.util.Optional<java.lang.String> responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = responsible.orElse(null);
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link NamingSystem#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link NamingSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NamingSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NamingSystem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link NamingSystem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link NamingSystem#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link NamingSystem#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link NamingSystem#contained() contained} to contained.
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
     * Initializes the optional value {@link NamingSystem#contained() contained} to contained.
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
     * Initializes the optional value {@link NamingSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link NamingSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link NamingSystem#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link NamingSystem#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link NamingSystem#language() language} to language.
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
     * Initializes the optional value {@link NamingSystem#language() language} to language.
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
     * Initializes the optional value {@link NamingSystem#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(com.fhir.NamingsystemKind kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = java.util.Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public final Builder kind(java.util.Optional<? extends com.fhir.NamingsystemKind> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#meta() meta} to meta.
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
     * Initializes the optional value {@link NamingSystem#meta() meta} to meta.
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
     * Adds one element to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param element A uniqueId element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUniqueId(com.fhir.NamingSystem_UniqueId element) {
      this.uniqueId.add(java.util.Objects.requireNonNull(element, "uniqueId element"));
      return this;
    }

    /**
     * Adds elements to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param elements An array of uniqueId elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUniqueId(com.fhir.NamingSystem_UniqueId... elements) {
      for (com.fhir.NamingSystem_UniqueId element : elements) {
        this.uniqueId.add(java.util.Objects.requireNonNull(element, "uniqueId element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param elements An iterable of uniqueId elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllUniqueId(Iterable<? extends com.fhir.NamingSystem_UniqueId> elements) {
      for (com.fhir.NamingSystem_UniqueId element : elements) {
        this.uniqueId.add(java.util.Objects.requireNonNull(element, "uniqueId element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#text() text} to text.
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
     * Initializes the optional value {@link NamingSystem#text() text} to text.
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
     * Initializes the optional value {@link NamingSystem#name() name} to name.
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
     * Initializes the optional value {@link NamingSystem#name() name} to name.
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
     * Builds a new {@link NamingSystem NamingSystem}.
     * @return An immutable instance of NamingSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.NamingSystem build() {
      checkRequiredAttributes();
      return new ImmutableNamingSystem(
          description,
          id,
          date,
          contact,
          usage,
          publisher,
          status,
          responsible,
          jurisdiction,
          modifierExtension,
          implicitRules,
          type,
          resourceType,
          contained,
          extension,
          useContext,
          language,
          kind,
          meta,
          createUnmodifiableList(true, uniqueId),
          text,
          name);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
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

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of NamingSystem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build NamingSystem, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "NamingSystem", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link NamingSystem#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "NamingSystem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link NamingSystem#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link NamingSystem#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link NamingSystem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link NamingSystem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link NamingSystem#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link NamingSystem#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link NamingSystem#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link NamingSystem#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link NamingSystem#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(java.lang.String usage);

    /**
     * Initializes the optional value {@link NamingSystem#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(java.util.Optional<java.lang.String> usage);

    /**
     * Initializes the optional value {@link NamingSystem#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link NamingSystem#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link NamingSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.NamingsystemStatus status);

    /**
     * Initializes the optional value {@link NamingSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.NamingsystemStatus> status);

    /**
     * Initializes the optional value {@link NamingSystem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responsible(java.lang.String responsible);

    /**
     * Initializes the optional value {@link NamingSystem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responsible(java.util.Optional<java.lang.String> responsible);

    /**
     * Initializes the optional value {@link NamingSystem#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link NamingSystem#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link NamingSystem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link NamingSystem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link NamingSystem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link NamingSystem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link NamingSystem#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link NamingSystem#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link NamingSystem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link NamingSystem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link NamingSystem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link NamingSystem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link NamingSystem#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link NamingSystem#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link NamingSystem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link NamingSystem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link NamingSystem#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(com.fhir.NamingsystemKind kind);

    /**
     * Initializes the optional value {@link NamingSystem#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(java.util.Optional<? extends com.fhir.NamingsystemKind> kind);

    /**
     * Initializes the optional value {@link NamingSystem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link NamingSystem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Adds one element to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param element A uniqueId element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addUniqueId(com.fhir.NamingSystem_UniqueId element);

    /**
     * Adds elements to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param elements An array of uniqueId elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addUniqueId(com.fhir.NamingSystem_UniqueId... elements);

    /**
     * Adds elements to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param elements An iterable of uniqueId elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllUniqueId(Iterable<? extends com.fhir.NamingSystem_UniqueId> elements);

    /**
     * Initializes the optional value {@link NamingSystem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link NamingSystem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link NamingSystem#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link NamingSystem#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Builds a new {@link NamingSystem NamingSystem}.
     * @return An immutable instance of NamingSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    NamingSystem build();
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
