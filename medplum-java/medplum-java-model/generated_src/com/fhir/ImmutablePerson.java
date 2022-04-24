//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Person}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson.builder()}.
 */
@org.immutables.value.Generated(from = "Person", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePerson implements com.fhir.Person {
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Reference managingOrganization;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.HumanName> name;
  private final @javax.annotation.Nullable com.fhir.PersonGender gender;
  private final @javax.annotation.Nullable com.fhir.date birthDate;
  private final @javax.annotation.Nullable com.fhir.Attachment photo;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Person_Link> link;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Address> address;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

  private ImmutablePerson(
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Reference managingOrganization,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.HumanName> name,
      @javax.annotation.Nullable com.fhir.PersonGender gender,
      @javax.annotation.Nullable com.fhir.date birthDate,
      @javax.annotation.Nullable com.fhir.Attachment photo,
      @javax.annotation.Nullable java.util.List<com.fhir.Person_Link> link,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Address> address,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier) {
    this.text = text;
    this.language = language;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.managingOrganization = managingOrganization;
    this.extension = extension;
    this.name = name;
    this.gender = gender;
    this.birthDate = birthDate;
    this.photo = photo;
    this.link = link;
    this.implicitRules = implicitRules;
    this.address = address;
    this.telecom = telecom;
    this.id = id;
    this.active = active;
    this.meta = meta;
    this.resourceType = resourceType;
    this.identifier = identifier;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code managingOrganization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
  @Override
  public java.util.Optional<com.fhir.Reference> managingOrganization() {
    return java.util.Optional.ofNullable(managingOrganization);
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
  public java.util.Optional<java.util.List<com.fhir.HumanName>> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code gender} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("gender")
  @Override
  public java.util.Optional<com.fhir.PersonGender> gender() {
    return java.util.Optional.ofNullable(gender);
  }

  /**
   * @return The value of the {@code birthDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("birthDate")
  @Override
  public java.util.Optional<com.fhir.date> birthDate() {
    return java.util.Optional.ofNullable(birthDate);
  }

  /**
   * @return The value of the {@code photo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("photo")
  @Override
  public java.util.Optional<com.fhir.Attachment> photo() {
    return java.util.Optional.ofNullable(photo);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("link")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Person_Link>> link() {
    return java.util.Optional.ofNullable(link);
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
   * @return The value of the {@code address} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Address>> address() {
    return java.util.Optional.ofNullable(address);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePerson(
        newValue,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePerson(
        value,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePerson(
        this.text,
        newValue,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePerson(
        this.text,
        value,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        newValue,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        value,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        newValue,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        value,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withManagingOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        newValue,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withManagingOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        value,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        newValue,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        value,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withName(java.util.List<com.fhir.HumanName> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.HumanName> newValue = java.util.Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        newValue,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withName(java.util.Optional<? extends java.util.List<com.fhir.HumanName>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.HumanName> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        value,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withGender(com.fhir.PersonGender value) {
    @javax.annotation.Nullable com.fhir.PersonGender newValue = java.util.Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        newValue,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withGender(java.util.Optional<? extends com.fhir.PersonGender> optional) {
    @javax.annotation.Nullable com.fhir.PersonGender value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        value,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#birthDate() birthDate} attribute.
   * @param value The value for birthDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withBirthDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "birthDate");
    if (this.birthDate == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        newValue,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#birthDate() birthDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for birthDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withBirthDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.birthDate == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        value,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withPhoto(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        newValue,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withPhoto(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        value,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withLink(java.util.List<com.fhir.Person_Link> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Person_Link> newValue = java.util.Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        newValue,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withLink(java.util.Optional<? extends java.util.List<com.fhir.Person_Link>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Person_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        value,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        newValue,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        value,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withAddress(java.util.List<com.fhir.Address> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Address> newValue = java.util.Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        newValue,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withAddress(java.util.Optional<? extends java.util.List<com.fhir.Address>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Address> value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        value,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withTelecom(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        newValue,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withTelecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        value,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        newValue,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        value,
        this.active,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        newValue,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        value,
        this.meta,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        newValue,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        value,
        this.resourceType,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePerson(
        this.text,
        this.language,
        this.contained,
        this.modifierExtension,
        this.managingOrganization,
        this.extension,
        this.name,
        this.gender,
        this.birthDate,
        this.photo,
        this.link,
        this.implicitRules,
        this.address,
        this.telecom,
        this.id,
        this.active,
        this.meta,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson
        && equalTo((ImmutablePerson) another);
  }

  private boolean equalTo(ImmutablePerson another) {
    return java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(managingOrganization, another.managingOrganization)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(gender, another.gender)
        && java.util.Objects.equals(birthDate, another.birthDate)
        && java.util.Objects.equals(photo, another.photo)
        && java.util.Objects.equals(link, another.link)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(address, another.address)
        && java.util.Objects.equals(telecom, another.telecom)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code language}, {@code contained}, {@code modifierExtension}, {@code managingOrganization}, {@code extension}, {@code name}, {@code gender}, {@code birthDate}, {@code photo}, {@code link}, {@code implicitRules}, {@code address}, {@code telecom}, {@code id}, {@code active}, {@code meta}, {@code resourceType}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(managingOrganization);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(gender);
    h += (h << 5) + java.util.Objects.hashCode(birthDate);
    h += (h << 5) + java.util.Objects.hashCode(photo);
    h += (h << 5) + java.util.Objects.hashCode(link);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(address);
    h += (h << 5) + java.util.Objects.hashCode(telecom);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code Person} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Person{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (language != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (managingOrganization != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    if (extension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (name != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (gender != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (birthDate != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("birthDate=").append(birthDate);
    }
    if (photo != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("photo=").append(photo);
    }
    if (link != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("link=").append(link);
    }
    if (implicitRules != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (address != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("address=").append(address);
    }
    if (telecom != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (active != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (meta != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Person", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Person {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> managingOrganization = java.util.Optional.empty();
    boolean managingOrganizationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.HumanName>> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.PersonGender> gender = java.util.Optional.empty();
    boolean genderIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> birthDate = java.util.Optional.empty();
    boolean birthDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> photo = java.util.Optional.empty();
    boolean photoIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Person_Link>> link = java.util.Optional.empty();
    boolean linkIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Address>> address = java.util.Optional.empty();
    boolean addressIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom = java.util.Optional.empty();
    boolean telecomIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
    public void setManagingOrganization(java.util.Optional<com.fhir.Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.util.List<com.fhir.HumanName>> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("gender")
    public void setGender(java.util.Optional<com.fhir.PersonGender> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("birthDate")
    public void setBirthDate(java.util.Optional<com.fhir.date> birthDate) {
      this.birthDate = birthDate;
      this.birthDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("photo")
    public void setPhoto(java.util.Optional<com.fhir.Attachment> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public void setLink(java.util.Optional<java.util.List<com.fhir.Person_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public void setAddress(java.util.Optional<java.util.List<com.fhir.Address>> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public void setTelecom(java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.HumanName>> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.PersonGender> gender() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> birthDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> photo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Person_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Address>> address() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePerson fromJson(Json json) {
    ImmutablePerson.Builder builder = ((ImmutablePerson.Builder) ImmutablePerson.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.birthDateIsSet) {
      builder.birthDate(json.birthDate);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutablePerson) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Person} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person instance
   */
  public static Person copyOf(Person instance) {
    if (instance instanceof ImmutablePerson) {
      return (ImmutablePerson) instance;
    }
    return ((ImmutablePerson.Builder) ImmutablePerson.builder())
        .text(instance.text())
        .language(instance.language())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .managingOrganization(instance.managingOrganization())
        .extension(instance.extension())
        .name(instance.name())
        .gender(instance.gender())
        .birthDate(instance.birthDate())
        .photo(instance.photo())
        .link(instance.link())
        .implicitRules(instance.implicitRules())
        .address(instance.address())
        .telecom(instance.telecom())
        .id(instance.id())
        .active(instance.active())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link Person Person}.
   * <pre>
   * ImmutablePerson.builder()
   *    .text(com.fhir.Narrative) // optional {@link Person#text() text}
   *    .language(com.fhir.code) // optional {@link Person#language() language}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Person#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Person#modifierExtension() modifierExtension}
   *    .managingOrganization(com.fhir.Reference) // optional {@link Person#managingOrganization() managingOrganization}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Person#extension() extension}
   *    .name(List&amp;lt;com.fhir.HumanName&amp;gt;) // optional {@link Person#name() name}
   *    .gender(com.fhir.PersonGender) // optional {@link Person#gender() gender}
   *    .birthDate(com.fhir.date) // optional {@link Person#birthDate() birthDate}
   *    .photo(com.fhir.Attachment) // optional {@link Person#photo() photo}
   *    .link(List&amp;lt;com.fhir.Person_Link&amp;gt;) // optional {@link Person#link() link}
   *    .implicitRules(com.fhir.uri) // optional {@link Person#implicitRules() implicitRules}
   *    .address(List&amp;lt;com.fhir.Address&amp;gt;) // optional {@link Person#address() address}
   *    .telecom(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link Person#telecom() telecom}
   *    .id(com.fhir.id) // optional {@link Person#id() id}
   *    .active(Boolean) // optional {@link Person#active() active}
   *    .meta(com.fhir.Meta) // optional {@link Person#meta() meta}
   *    .resourceType(String) // required {@link Person#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Person#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new Person builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutablePerson.Builder();
  }

  /**
   * Builds instances of type {@link Person Person}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Person", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_NAME = 0x40L;
    private static final long OPT_BIT_GENDER = 0x80L;
    private static final long OPT_BIT_BIRTH_DATE = 0x100L;
    private static final long OPT_BIT_PHOTO = 0x200L;
    private static final long OPT_BIT_LINK = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_ADDRESS = 0x1000L;
    private static final long OPT_BIT_TELECOM = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_ACTIVE = 0x8000L;
    private static final long OPT_BIT_META = 0x10000L;
    private static final long OPT_BIT_IDENTIFIER = 0x20000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference managingOrganization;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.HumanName> name;
    private @javax.annotation.Nullable com.fhir.PersonGender gender;
    private @javax.annotation.Nullable com.fhir.date birthDate;
    private @javax.annotation.Nullable com.fhir.Attachment photo;
    private @javax.annotation.Nullable java.util.List<com.fhir.Person_Link> link;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Address> address;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Person#text() text} to text.
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
     * Initializes the optional value {@link Person#text() text} to text.
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
     * Initializes the optional value {@link Person#language() language} to language.
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
     * Initializes the optional value {@link Person#language() language} to language.
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
     * Initializes the optional value {@link Person#contained() contained} to contained.
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
     * Initializes the optional value {@link Person#contained() contained} to contained.
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
     * Initializes the optional value {@link Person#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Person#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Person#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder managingOrganization(com.fhir.Reference managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = java.util.Objects.requireNonNull(managingOrganization, "managingOrganization");
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
    public final Builder managingOrganization(java.util.Optional<? extends com.fhir.Reference> managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = managingOrganization.orElse(null);
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#extension() extension} to extension.
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
     * Initializes the optional value {@link Person#extension() extension} to extension.
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
     * Initializes the optional value {@link Person#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.util.List<com.fhir.HumanName> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<? extends java.util.List<com.fhir.HumanName>> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(com.fhir.PersonGender gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = java.util.Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gender")
    public final Builder gender(java.util.Optional<? extends com.fhir.PersonGender> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder birthDate(com.fhir.date birthDate) {
      checkNotIsSet(birthDateIsSet(), "birthDate");
      this.birthDate = java.util.Objects.requireNonNull(birthDate, "birthDate");
      optBits |= OPT_BIT_BIRTH_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("birthDate")
    public final Builder birthDate(java.util.Optional<? extends com.fhir.date> birthDate) {
      checkNotIsSet(birthDateIsSet(), "birthDate");
      this.birthDate = birthDate.orElse(null);
      optBits |= OPT_BIT_BIRTH_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    public final Builder photo(com.fhir.Attachment photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = java.util.Objects.requireNonNull(photo, "photo");
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("photo")
    public final Builder photo(java.util.Optional<? extends com.fhir.Attachment> photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = photo.orElse(null);
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(java.util.List<com.fhir.Person_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = java.util.Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public final Builder link(java.util.Optional<? extends java.util.List<com.fhir.Person_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Person#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Person#address() address} to address.
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
     * Initializes the optional value {@link Person#address() address} to address.
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
     * Initializes the optional value {@link Person#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Person#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Person#id() id} to id.
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
     * Initializes the optional value {@link Person#id() id} to id.
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
     * Initializes the optional value {@link Person#active() active} to active.
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
     * Initializes the optional value {@link Person#active() active} to active.
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
     * Initializes the optional value {@link Person#meta() meta} to meta.
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
     * Initializes the optional value {@link Person#meta() meta} to meta.
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
     * Initializes the value for the {@link Person#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Person#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Person#identifier() identifier} to identifier.
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
     * Builds a new {@link Person Person}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Person build() {
      checkRequiredAttributes();
      return new ImmutablePerson(
          text,
          language,
          contained,
          modifierExtension,
          managingOrganization,
          extension,
          name,
          gender,
          birthDate,
          photo,
          link,
          implicitRules,
          address,
          telecom,
          id,
          active,
          meta,
          resourceType,
          identifier);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean birthDateIsSet() {
      return (optBits & OPT_BIT_BIRTH_DATE) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Person is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Person, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Person", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Person#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Person", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Person#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Person#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Person#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Person#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Person#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Person#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Person#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Person#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Person#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(com.fhir.Reference managingOrganization);

    /**
     * Initializes the optional value {@link Person#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(java.util.Optional<? extends com.fhir.Reference> managingOrganization);

    /**
     * Initializes the optional value {@link Person#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Person#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Person#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.util.List<com.fhir.HumanName> name);

    /**
     * Initializes the optional value {@link Person#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<? extends java.util.List<com.fhir.HumanName>> name);

    /**
     * Initializes the optional value {@link Person#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal gender(com.fhir.PersonGender gender);

    /**
     * Initializes the optional value {@link Person#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal gender(java.util.Optional<? extends com.fhir.PersonGender> gender);

    /**
     * Initializes the optional value {@link Person#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal birthDate(com.fhir.date birthDate);

    /**
     * Initializes the optional value {@link Person#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal birthDate(java.util.Optional<? extends com.fhir.date> birthDate);

    /**
     * Initializes the optional value {@link Person#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal photo(com.fhir.Attachment photo);

    /**
     * Initializes the optional value {@link Person#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal photo(java.util.Optional<? extends com.fhir.Attachment> photo);

    /**
     * Initializes the optional value {@link Person#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(java.util.List<com.fhir.Person_Link> link);

    /**
     * Initializes the optional value {@link Person#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(java.util.Optional<? extends java.util.List<com.fhir.Person_Link>> link);

    /**
     * Initializes the optional value {@link Person#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Person#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Person#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(java.util.List<com.fhir.Address> address);

    /**
     * Initializes the optional value {@link Person#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(java.util.Optional<? extends java.util.List<com.fhir.Address>> address);

    /**
     * Initializes the optional value {@link Person#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(java.util.List<com.fhir.ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Person#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link Person#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Person#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Person#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link Person#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link Person#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Person#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Person#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Person#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Builds a new {@link Person Person}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Person build();
  }
}
