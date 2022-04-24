//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Practitioner}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePractitioner.builder()}.
 */
@org.immutables.value.Generated(from = "Practitioner", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePractitioner implements com.fhir.Practitioner {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.HumanName> name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Practitioner_Qualification> qualification;
  private final @javax.annotation.Nullable com.fhir.PractitionerGender gender;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Address> address;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> communication;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Attachment> photo;
  private final @javax.annotation.Nullable com.fhir.date birthDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutablePractitioner(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.HumanName> name,
      @javax.annotation.Nullable java.util.List<com.fhir.Practitioner_Qualification> qualification,
      @javax.annotation.Nullable com.fhir.PractitionerGender gender,
      @javax.annotation.Nullable java.util.List<com.fhir.Address> address,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> communication,
      @javax.annotation.Nullable java.util.List<com.fhir.Attachment> photo,
      @javax.annotation.Nullable com.fhir.date birthDate,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom,
      @javax.annotation.Nullable com.fhir.code language,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.name = name;
    this.qualification = qualification;
    this.gender = gender;
    this.address = address;
    this.communication = communication;
    this.photo = photo;
    this.birthDate = birthDate;
    this.telecom = telecom;
    this.language = language;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.identifier = identifier;
    this.text = text;
    this.active = active;
    this.contained = contained;
    this.extension = extension;
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
  public java.util.Optional<java.util.List<com.fhir.HumanName>> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code qualification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("qualification")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Practitioner_Qualification>> qualification() {
    return java.util.Optional.ofNullable(qualification);
  }

  /**
   * @return The value of the {@code gender} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("gender")
  @Override
  public java.util.Optional<com.fhir.PractitionerGender> gender() {
    return java.util.Optional.ofNullable(gender);
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
   * @return The value of the {@code communication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("communication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communication() {
    return java.util.Optional.ofNullable(communication);
  }

  /**
   * @return The value of the {@code photo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("photo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Attachment>> photo() {
    return java.util.Optional.ofNullable(photo);
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
   * @return The value of the {@code telecom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("telecom")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() {
    return java.util.Optional.ofNullable(telecom);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePractitioner(
        newValue,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePractitioner(
        value,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        newValue,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        value,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withName(java.util.List<com.fhir.HumanName> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.HumanName> newValue = java.util.Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        newValue,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withName(java.util.Optional<? extends java.util.List<com.fhir.HumanName>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.HumanName> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        value,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#qualification() qualification} attribute.
   * @param value The value for qualification
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withQualification(java.util.List<com.fhir.Practitioner_Qualification> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Practitioner_Qualification> newValue = java.util.Objects.requireNonNull(value, "qualification");
    if (this.qualification == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        newValue,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#qualification() qualification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withQualification(java.util.Optional<? extends java.util.List<com.fhir.Practitioner_Qualification>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Practitioner_Qualification> value = optional.orElse(null);
    if (this.qualification == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        value,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withGender(com.fhir.PractitionerGender value) {
    @javax.annotation.Nullable com.fhir.PractitionerGender newValue = java.util.Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        newValue,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withGender(java.util.Optional<? extends com.fhir.PractitionerGender> optional) {
    @javax.annotation.Nullable com.fhir.PractitionerGender value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        value,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withAddress(java.util.List<com.fhir.Address> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Address> newValue = java.util.Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        newValue,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withAddress(java.util.Optional<? extends java.util.List<com.fhir.Address>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Address> value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        value,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#communication() communication} attribute.
   * @param value The value for communication
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withCommunication(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "communication");
    if (this.communication == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        newValue,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#communication() communication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withCommunication(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.communication == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        value,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withPhoto(java.util.List<com.fhir.Attachment> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> newValue = java.util.Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        newValue,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withPhoto(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        value,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#birthDate() birthDate} attribute.
   * @param value The value for birthDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withBirthDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "birthDate");
    if (this.birthDate == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        newValue,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#birthDate() birthDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for birthDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withBirthDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.birthDate == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        value,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withTelecom(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        newValue,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withTelecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        value,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        value,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Practitioner#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePractitioner withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        newValue,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        newValue,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        value,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        value,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        newValue,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        value,
        this.text,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        newValue,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        value,
        this.active,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        newValue,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        value,
        this.contained,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePractitioner(
        this.modifierExtension,
        this.id,
        this.name,
        this.qualification,
        this.gender,
        this.address,
        this.communication,
        this.photo,
        this.birthDate,
        this.telecom,
        this.language,
        this.resourceType,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.active,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePractitioner} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePractitioner
        && equalTo((ImmutablePractitioner) another);
  }

  private boolean equalTo(ImmutablePractitioner another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(qualification, another.qualification)
        && java.util.Objects.equals(gender, another.gender)
        && java.util.Objects.equals(address, another.address)
        && java.util.Objects.equals(communication, another.communication)
        && java.util.Objects.equals(photo, another.photo)
        && java.util.Objects.equals(birthDate, another.birthDate)
        && java.util.Objects.equals(telecom, another.telecom)
        && java.util.Objects.equals(language, another.language)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code name}, {@code qualification}, {@code gender}, {@code address}, {@code communication}, {@code photo}, {@code birthDate}, {@code telecom}, {@code language}, {@code resourceType}, {@code implicitRules}, {@code meta}, {@code identifier}, {@code text}, {@code active}, {@code contained}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(qualification);
    h += (h << 5) + java.util.Objects.hashCode(gender);
    h += (h << 5) + java.util.Objects.hashCode(address);
    h += (h << 5) + java.util.Objects.hashCode(communication);
    h += (h << 5) + java.util.Objects.hashCode(photo);
    h += (h << 5) + java.util.Objects.hashCode(birthDate);
    h += (h << 5) + java.util.Objects.hashCode(telecom);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Practitioner} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Practitioner{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (name != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (qualification != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("qualification=").append(qualification);
    }
    if (gender != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (address != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("address=").append(address);
    }
    if (communication != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("communication=").append(communication);
    }
    if (photo != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("photo=").append(photo);
    }
    if (birthDate != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("birthDate=").append(birthDate);
    }
    if (telecom != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (language != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Practitioner", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Practitioner {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.HumanName>> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Practitioner_Qualification>> qualification = java.util.Optional.empty();
    boolean qualificationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.PractitionerGender> gender = java.util.Optional.empty();
    boolean genderIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Address>> address = java.util.Optional.empty();
    boolean addressIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communication = java.util.Optional.empty();
    boolean communicationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Attachment>> photo = java.util.Optional.empty();
    boolean photoIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> birthDate = java.util.Optional.empty();
    boolean birthDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom = java.util.Optional.empty();
    boolean telecomIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.util.List<com.fhir.HumanName>> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("qualification")
    public void setQualification(java.util.Optional<java.util.List<com.fhir.Practitioner_Qualification>> qualification) {
      this.qualification = qualification;
      this.qualificationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("gender")
    public void setGender(java.util.Optional<com.fhir.PractitionerGender> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public void setAddress(java.util.Optional<java.util.List<com.fhir.Address>> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("communication")
    public void setCommunication(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communication) {
      this.communication = communication;
      this.communicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("photo")
    public void setPhoto(java.util.Optional<java.util.List<com.fhir.Attachment>> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("birthDate")
    public void setBirthDate(java.util.Optional<com.fhir.date> birthDate) {
      this.birthDate = birthDate;
      this.birthDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public void setTelecom(java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
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
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.HumanName>> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Practitioner_Qualification>> qualification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.PractitionerGender> gender() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Address>> address() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Attachment>> photo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> birthDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePractitioner fromJson(Json json) {
    ImmutablePractitioner.Builder builder = ((ImmutablePractitioner.Builder) ImmutablePractitioner.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.qualificationIsSet) {
      builder.qualification(json.qualification);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.communicationIsSet) {
      builder.communication(json.communication);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.birthDateIsSet) {
      builder.birthDate(json.birthDate);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutablePractitioner) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Practitioner} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Practitioner instance
   */
  public static Practitioner copyOf(Practitioner instance) {
    if (instance instanceof ImmutablePractitioner) {
      return (ImmutablePractitioner) instance;
    }
    return ((ImmutablePractitioner.Builder) ImmutablePractitioner.builder())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .name(instance.name())
        .qualification(instance.qualification())
        .gender(instance.gender())
        .address(instance.address())
        .communication(instance.communication())
        .photo(instance.photo())
        .birthDate(instance.birthDate())
        .telecom(instance.telecom())
        .language(instance.language())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .text(instance.text())
        .active(instance.active())
        .contained(instance.contained())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Practitioner Practitioner}.
   * <pre>
   * ImmutablePractitioner.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Practitioner#modifierExtension() modifierExtension}
   *    .id(com.fhir.id) // optional {@link Practitioner#id() id}
   *    .name(List&amp;lt;com.fhir.HumanName&amp;gt;) // optional {@link Practitioner#name() name}
   *    .qualification(List&amp;lt;com.fhir.Practitioner_Qualification&amp;gt;) // optional {@link Practitioner#qualification() qualification}
   *    .gender(com.fhir.PractitionerGender) // optional {@link Practitioner#gender() gender}
   *    .address(List&amp;lt;com.fhir.Address&amp;gt;) // optional {@link Practitioner#address() address}
   *    .communication(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Practitioner#communication() communication}
   *    .photo(List&amp;lt;com.fhir.Attachment&amp;gt;) // optional {@link Practitioner#photo() photo}
   *    .birthDate(com.fhir.date) // optional {@link Practitioner#birthDate() birthDate}
   *    .telecom(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link Practitioner#telecom() telecom}
   *    .language(com.fhir.code) // optional {@link Practitioner#language() language}
   *    .resourceType(String) // required {@link Practitioner#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link Practitioner#implicitRules() implicitRules}
   *    .meta(com.fhir.Meta) // optional {@link Practitioner#meta() meta}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Practitioner#identifier() identifier}
   *    .text(com.fhir.Narrative) // optional {@link Practitioner#text() text}
   *    .active(Boolean) // optional {@link Practitioner#active() active}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Practitioner#contained() contained}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Practitioner#extension() extension}
   *    .build();
   * </pre>
   * @return A new Practitioner builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutablePractitioner.Builder();
  }

  /**
   * Builds instances of type {@link Practitioner Practitioner}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Practitioner", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_QUALIFICATION = 0x8L;
    private static final long OPT_BIT_GENDER = 0x10L;
    private static final long OPT_BIT_ADDRESS = 0x20L;
    private static final long OPT_BIT_COMMUNICATION = 0x40L;
    private static final long OPT_BIT_PHOTO = 0x80L;
    private static final long OPT_BIT_BIRTH_DATE = 0x100L;
    private static final long OPT_BIT_TELECOM = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_TEXT = 0x4000L;
    private static final long OPT_BIT_ACTIVE = 0x8000L;
    private static final long OPT_BIT_CONTAINED = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.HumanName> name;
    private @javax.annotation.Nullable java.util.List<com.fhir.Practitioner_Qualification> qualification;
    private @javax.annotation.Nullable com.fhir.PractitionerGender gender;
    private @javax.annotation.Nullable java.util.List<com.fhir.Address> address;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> communication;
    private @javax.annotation.Nullable java.util.List<com.fhir.Attachment> photo;
    private @javax.annotation.Nullable com.fhir.date birthDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Practitioner#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Practitioner#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Practitioner#id() id} to id.
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
     * Initializes the optional value {@link Practitioner#id() id} to id.
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
     * Initializes the optional value {@link Practitioner#name() name} to name.
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
     * Initializes the optional value {@link Practitioner#name() name} to name.
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
     * Initializes the optional value {@link Practitioner#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualification(java.util.List<com.fhir.Practitioner_Qualification> qualification) {
      checkNotIsSet(qualificationIsSet(), "qualification");
      this.qualification = java.util.Objects.requireNonNull(qualification, "qualification");
      optBits |= OPT_BIT_QUALIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("qualification")
    public final Builder qualification(java.util.Optional<? extends java.util.List<com.fhir.Practitioner_Qualification>> qualification) {
      checkNotIsSet(qualificationIsSet(), "qualification");
      this.qualification = qualification.orElse(null);
      optBits |= OPT_BIT_QUALIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(com.fhir.PractitionerGender gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = java.util.Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gender")
    public final Builder gender(java.util.Optional<? extends com.fhir.PractitionerGender> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#address() address} to address.
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
     * Initializes the optional value {@link Practitioner#address() address} to address.
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
     * Initializes the optional value {@link Practitioner#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    public final Builder communication(java.util.List<com.fhir.CodeableConcept> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = java.util.Objects.requireNonNull(communication, "communication");
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("communication")
    public final Builder communication(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = communication.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    public final Builder photo(java.util.List<com.fhir.Attachment> photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = java.util.Objects.requireNonNull(photo, "photo");
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("photo")
    public final Builder photo(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = photo.orElse(null);
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link Practitioner#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link Practitioner#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Practitioner#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Practitioner#language() language} to language.
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
     * Initializes the optional value {@link Practitioner#language() language} to language.
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
     * Initializes the value for the {@link Practitioner#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Practitioner#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Practitioner#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Practitioner#meta() meta} to meta.
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
     * Initializes the optional value {@link Practitioner#meta() meta} to meta.
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
     * Initializes the optional value {@link Practitioner#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Practitioner#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Practitioner#text() text} to text.
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
     * Initializes the optional value {@link Practitioner#text() text} to text.
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
     * Initializes the optional value {@link Practitioner#active() active} to active.
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
     * Initializes the optional value {@link Practitioner#active() active} to active.
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
     * Initializes the optional value {@link Practitioner#contained() contained} to contained.
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
     * Initializes the optional value {@link Practitioner#contained() contained} to contained.
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
     * Initializes the optional value {@link Practitioner#extension() extension} to extension.
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
     * Initializes the optional value {@link Practitioner#extension() extension} to extension.
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
     * Builds a new {@link Practitioner Practitioner}.
     * @return An immutable instance of Practitioner
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Practitioner build() {
      checkRequiredAttributes();
      return new ImmutablePractitioner(
          modifierExtension,
          id,
          name,
          qualification,
          gender,
          address,
          communication,
          photo,
          birthDate,
          telecom,
          language,
          resourceType,
          implicitRules,
          meta,
          identifier,
          text,
          active,
          contained,
          extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean qualificationIsSet() {
      return (optBits & OPT_BIT_QUALIFICATION) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean communicationIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean birthDateIsSet() {
      return (optBits & OPT_BIT_BIRTH_DATE) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Practitioner is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Practitioner, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Practitioner", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Practitioner#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Practitioner", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Practitioner#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Practitioner#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Practitioner#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Practitioner#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Practitioner#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.util.List<com.fhir.HumanName> name);

    /**
     * Initializes the optional value {@link Practitioner#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<? extends java.util.List<com.fhir.HumanName>> name);

    /**
     * Initializes the optional value {@link Practitioner#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal qualification(java.util.List<com.fhir.Practitioner_Qualification> qualification);

    /**
     * Initializes the optional value {@link Practitioner#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal qualification(java.util.Optional<? extends java.util.List<com.fhir.Practitioner_Qualification>> qualification);

    /**
     * Initializes the optional value {@link Practitioner#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal gender(com.fhir.PractitionerGender gender);

    /**
     * Initializes the optional value {@link Practitioner#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal gender(java.util.Optional<? extends com.fhir.PractitionerGender> gender);

    /**
     * Initializes the optional value {@link Practitioner#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(java.util.List<com.fhir.Address> address);

    /**
     * Initializes the optional value {@link Practitioner#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(java.util.Optional<? extends java.util.List<com.fhir.Address>> address);

    /**
     * Initializes the optional value {@link Practitioner#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal communication(java.util.List<com.fhir.CodeableConcept> communication);

    /**
     * Initializes the optional value {@link Practitioner#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal communication(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> communication);

    /**
     * Initializes the optional value {@link Practitioner#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal photo(java.util.List<com.fhir.Attachment> photo);

    /**
     * Initializes the optional value {@link Practitioner#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal photo(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> photo);

    /**
     * Initializes the optional value {@link Practitioner#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal birthDate(com.fhir.date birthDate);

    /**
     * Initializes the optional value {@link Practitioner#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal birthDate(java.util.Optional<? extends com.fhir.date> birthDate);

    /**
     * Initializes the optional value {@link Practitioner#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(java.util.List<com.fhir.ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Practitioner#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link Practitioner#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Practitioner#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Practitioner#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Practitioner#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Practitioner#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Practitioner#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Practitioner#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Practitioner#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Practitioner#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Practitioner#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Practitioner#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link Practitioner#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link Practitioner#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Practitioner#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Practitioner#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Practitioner#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Builds a new {@link Practitioner Practitioner}.
     * @return An immutable instance of Practitioner
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Practitioner build();
  }
}
