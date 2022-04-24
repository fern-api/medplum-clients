//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Organization}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrganization.builder()}.
 */
@org.immutables.value.Generated(from = "Organization", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOrganization implements com.fhir.Organization {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Reference partOf;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Address> address;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Organization_Contact> contact;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> alias;

  private ImmutableOrganization(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Reference partOf,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable java.util.List<com.fhir.Address> address,
      @javax.annotation.Nullable java.util.List<com.fhir.Organization_Contact> contact,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<java.lang.String> alias) {
    this.language = language;
    this.type = type;
    this.implicitRules = implicitRules;
    this.resourceType = resourceType;
    this.partOf = partOf;
    this.identifier = identifier;
    this.telecom = telecom;
    this.active = active;
    this.address = address;
    this.contact = contact;
    this.meta = meta;
    this.extension = extension;
    this.contained = contained;
    this.id = id;
    this.name = name;
    this.endpoint = endpoint;
    this.modifierExtension = modifierExtension;
    this.text = text;
    this.alias = alias;
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<com.fhir.Reference> partOf() {
    return java.util.Optional.ofNullable(partOf);
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
   * @return The value of the {@code telecom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("telecom")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() {
    return java.util.Optional.ofNullable(telecom);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("active")
  @Override
  public java.util.Optional<java.lang.Boolean> active() {
    return java.util.Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Address>> address() {
    return java.util.Optional.ofNullable(address);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Organization_Contact>> contact() {
    return java.util.Optional.ofNullable(contact);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() {
    return java.util.Optional.ofNullable(endpoint);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code alias} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("alias")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> alias() {
    return java.util.Optional.ofNullable(alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableOrganization(
        newValue,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableOrganization(
        value,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        newValue,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableOrganization(
        this.language,
        value,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        newValue,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        value,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Organization#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrganization withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        newValue,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withPartOf(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        newValue,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withPartOf(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        value,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        newValue,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        value,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withTelecom(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        newValue,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withTelecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        value,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        newValue,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        value,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withAddress(java.util.List<com.fhir.Address> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Address> newValue = java.util.Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        newValue,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withAddress(java.util.Optional<? extends java.util.List<com.fhir.Address>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Address> value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        value,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withContact(java.util.List<com.fhir.Organization_Contact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Organization_Contact> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        newValue,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withContact(java.util.Optional<? extends java.util.List<com.fhir.Organization_Contact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Organization_Contact> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        value,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        newValue,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        value,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        newValue,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        value,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        newValue,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        value,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        newValue,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        value,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        newValue,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        value,
        this.endpoint,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withEndpoint(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        newValue,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withEndpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        value,
        this.modifierExtension,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        newValue,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        value,
        this.text,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        newValue,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        value,
        this.alias);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withAlias(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "alias");
    if (this.alias == newValue) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#alias() alias} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withAlias(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.alias == value) return this;
    return new ImmutableOrganization(
        this.language,
        this.type,
        this.implicitRules,
        this.resourceType,
        this.partOf,
        this.identifier,
        this.telecom,
        this.active,
        this.address,
        this.contact,
        this.meta,
        this.extension,
        this.contained,
        this.id,
        this.name,
        this.endpoint,
        this.modifierExtension,
        this.text,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrganization} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrganization
        && equalTo((ImmutableOrganization) another);
  }

  private boolean equalTo(ImmutableOrganization another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(telecom, another.telecom)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(address, another.address)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(endpoint, another.endpoint)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(alias, another.alias);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code type}, {@code implicitRules}, {@code resourceType}, {@code partOf}, {@code identifier}, {@code telecom}, {@code active}, {@code address}, {@code contact}, {@code meta}, {@code extension}, {@code contained}, {@code id}, {@code name}, {@code endpoint}, {@code modifierExtension}, {@code text}, {@code alias}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(telecom);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(address);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(alias);
    return h;
  }

  /**
   * Prints the immutable value {@code Organization} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Organization{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (type != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (telecom != null) {
      builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    if (address != null) {
      builder.append(", ");
      builder.append("address=").append(address);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (endpoint != null) {
      builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (alias != null) {
      builder.append(", ");
      builder.append("alias=").append(alias);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Organization", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Organization {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom = java.util.Optional.empty();
    boolean telecomIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Address>> address = java.util.Optional.empty();
    boolean addressIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Organization_Contact>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> alias = java.util.Optional.empty();
    boolean aliasIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<com.fhir.Reference> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public void setTelecom(java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public void setAddress(java.util.Optional<java.util.List<com.fhir.Address>> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.Organization_Contact>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<java.util.List<com.fhir.Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public void setAlias(java.util.Optional<java.util.List<java.lang.String>> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Address>> address() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Organization_Contact>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> alias() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableOrganization fromJson(Json json) {
    ImmutableOrganization.Builder builder = ((ImmutableOrganization.Builder) ImmutableOrganization.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    return (ImmutableOrganization) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Organization} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Organization instance
   */
  public static Organization copyOf(Organization instance) {
    if (instance instanceof ImmutableOrganization) {
      return (ImmutableOrganization) instance;
    }
    return ((ImmutableOrganization.Builder) ImmutableOrganization.builder())
        .language(instance.language())
        .type(instance.type())
        .implicitRules(instance.implicitRules())
        .resourceType(instance.resourceType())
        .partOf(instance.partOf())
        .identifier(instance.identifier())
        .telecom(instance.telecom())
        .active(instance.active())
        .address(instance.address())
        .contact(instance.contact())
        .meta(instance.meta())
        .extension(instance.extension())
        .contained(instance.contained())
        .id(instance.id())
        .name(instance.name())
        .endpoint(instance.endpoint())
        .modifierExtension(instance.modifierExtension())
        .text(instance.text())
        .alias(instance.alias())
        .build();
  }

  /**
   * Creates a builder for {@link Organization Organization}.
   * <pre>
   * ImmutableOrganization.builder()
   *    .language(com.fhir.code) // optional {@link Organization#language() language}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Organization#type() type}
   *    .implicitRules(com.fhir.uri) // optional {@link Organization#implicitRules() implicitRules}
   *    .resourceType(String) // required {@link Organization#resourceType() resourceType}
   *    .partOf(com.fhir.Reference) // optional {@link Organization#partOf() partOf}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Organization#identifier() identifier}
   *    .telecom(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link Organization#telecom() telecom}
   *    .active(Boolean) // optional {@link Organization#active() active}
   *    .address(List&amp;lt;com.fhir.Address&amp;gt;) // optional {@link Organization#address() address}
   *    .contact(List&amp;lt;com.fhir.Organization_Contact&amp;gt;) // optional {@link Organization#contact() contact}
   *    .meta(com.fhir.Meta) // optional {@link Organization#meta() meta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Organization#extension() extension}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Organization#contained() contained}
   *    .id(com.fhir.id) // optional {@link Organization#id() id}
   *    .name(String) // optional {@link Organization#name() name}
   *    .endpoint(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Organization#endpoint() endpoint}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Organization#modifierExtension() modifierExtension}
   *    .text(com.fhir.Narrative) // optional {@link Organization#text() text}
   *    .alias(List&amp;lt;String&amp;gt;) // optional {@link Organization#alias() alias}
   *    .build();
   * </pre>
   * @return A new Organization builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableOrganization.Builder();
  }

  /**
   * Builds instances of type {@link Organization Organization}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Organization", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_PART_OF = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_TELECOM = 0x20L;
    private static final long OPT_BIT_ACTIVE = 0x40L;
    private static final long OPT_BIT_ADDRESS = 0x80L;
    private static final long OPT_BIT_CONTACT = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_NAME = 0x2000L;
    private static final long OPT_BIT_ENDPOINT = 0x4000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_ALIAS = 0x20000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference partOf;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable java.util.List<com.fhir.Address> address;
    private @javax.annotation.Nullable java.util.List<com.fhir.Organization_Contact> contact;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<java.lang.String> alias;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Organization#language() language} to language.
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
     * Initializes the optional value {@link Organization#language() language} to language.
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
     * Initializes the optional value {@link Organization#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.util.List<com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Organization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link Organization#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Organization#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(com.fhir.Reference partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Organization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Organization#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    public final Builder telecom(java.util.List<com.fhir.ContactPoint> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = java.util.Objects.requireNonNull(telecom, "telecom");
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public final Builder telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = telecom.orElse(null);
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    public final Builder active(boolean active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active;
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public final Builder active(java.util.Optional<java.lang.Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(java.util.List<com.fhir.Address> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = java.util.Objects.requireNonNull(address, "address");
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public final Builder address(java.util.Optional<? extends java.util.List<com.fhir.Address>> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = address.orElse(null);
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.Organization_Contact> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.Organization_Contact>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#meta() meta} to meta.
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
     * Initializes the optional value {@link Organization#meta() meta} to meta.
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
     * Initializes the optional value {@link Organization#extension() extension} to extension.
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
     * Initializes the optional value {@link Organization#extension() extension} to extension.
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
     * Initializes the optional value {@link Organization#contained() contained} to contained.
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
     * Initializes the optional value {@link Organization#contained() contained} to contained.
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
     * Initializes the optional value {@link Organization#id() id} to id.
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
     * Initializes the optional value {@link Organization#id() id} to id.
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
     * Initializes the optional value {@link Organization#name() name} to name.
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
     * Initializes the optional value {@link Organization#name() name} to name.
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
     * Initializes the optional value {@link Organization#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(java.util.List<com.fhir.Reference> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public final Builder endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Organization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Organization#text() text} to text.
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
     * Initializes the optional value {@link Organization#text() text} to text.
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
     * Initializes the optional value {@link Organization#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(java.util.List<java.lang.String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = java.util.Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public final Builder alias(java.util.Optional<? extends java.util.List<java.lang.String>> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Builds a new {@link Organization Organization}.
     * @return An immutable instance of Organization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Organization build() {
      checkRequiredAttributes();
      return new ImmutableOrganization(
          language,
          type,
          implicitRules,
          resourceType,
          partOf,
          identifier,
          telecom,
          active,
          address,
          contact,
          meta,
          extension,
          contained,
          id,
          name,
          endpoint,
          modifierExtension,
          text,
          alias);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Organization is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Organization, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Organization", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Organization#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Organization", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Organization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Organization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Organization#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(java.util.List<com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Organization#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type);

    /**
     * Initializes the optional value {@link Organization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Organization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Organization#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(com.fhir.Reference partOf);

    /**
     * Initializes the optional value {@link Organization#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link Organization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Organization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Organization#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(java.util.List<com.fhir.ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Organization#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link Organization#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link Organization#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link Organization#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(java.util.List<com.fhir.Address> address);

    /**
     * Initializes the optional value {@link Organization#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(java.util.Optional<? extends java.util.List<com.fhir.Address>> address);

    /**
     * Initializes the optional value {@link Organization#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.Organization_Contact> contact);

    /**
     * Initializes the optional value {@link Organization#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.Organization_Contact>> contact);

    /**
     * Initializes the optional value {@link Organization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Organization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Organization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Organization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Organization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Organization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Organization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Organization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Organization#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Organization#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Organization#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(java.util.List<com.fhir.Reference> endpoint);

    /**
     * Initializes the optional value {@link Organization#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint);

    /**
     * Initializes the optional value {@link Organization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Organization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Organization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Organization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Organization#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(java.util.List<java.lang.String> alias);

    /**
     * Initializes the optional value {@link Organization#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(java.util.Optional<? extends java.util.List<java.lang.String>> alias);

    /**
     * Builds a new {@link Organization Organization}.
     * @return An immutable instance of Organization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Organization build();
  }
}
