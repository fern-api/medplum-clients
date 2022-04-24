//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Patient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePatient.builder()}.
 */
@org.immutables.value.Generated(from = "Patient", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePatient implements com.fhir.Patient {
  private final @javax.annotation.Nullable java.lang.Boolean multipleBirthBoolean;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Patient_Link> link;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Patient_Contact> contact;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Boolean deceasedBoolean;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Reference managingOrganization;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Address> address;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String deceasedDateTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
  private final @javax.annotation.Nullable java.lang.Double multipleBirthInteger;
  private final @javax.annotation.Nullable java.lang.Boolean active;
  private final @javax.annotation.Nullable com.fhir.PatientGender gender;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> generalPractitioner;
  private final @javax.annotation.Nullable com.fhir.date birthDate;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Patient_Communication> communication;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept maritalStatus;
  private final @javax.annotation.Nullable java.util.List<com.fhir.HumanName> name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Attachment> photo;

  private ImmutablePatient(
      @javax.annotation.Nullable java.lang.Boolean multipleBirthBoolean,
      @javax.annotation.Nullable java.util.List<com.fhir.Patient_Link> link,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Patient_Contact> contact,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Boolean deceasedBoolean,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Reference managingOrganization,
      @javax.annotation.Nullable java.util.List<com.fhir.Address> address,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String deceasedDateTime,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom,
      @javax.annotation.Nullable java.lang.Double multipleBirthInteger,
      @javax.annotation.Nullable java.lang.Boolean active,
      @javax.annotation.Nullable com.fhir.PatientGender gender,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> generalPractitioner,
      @javax.annotation.Nullable com.fhir.date birthDate,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Patient_Communication> communication,
      @javax.annotation.Nullable com.fhir.CodeableConcept maritalStatus,
      @javax.annotation.Nullable java.util.List<com.fhir.HumanName> name,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Attachment> photo) {
    this.multipleBirthBoolean = multipleBirthBoolean;
    this.link = link;
    this.identifier = identifier;
    this.contact = contact;
    this.id = id;
    this.implicitRules = implicitRules;
    this.resourceType = resourceType;
    this.language = language;
    this.extension = extension;
    this.deceasedBoolean = deceasedBoolean;
    this.contained = contained;
    this.managingOrganization = managingOrganization;
    this.address = address;
    this.meta = meta;
    this.deceasedDateTime = deceasedDateTime;
    this.telecom = telecom;
    this.multipleBirthInteger = multipleBirthInteger;
    this.active = active;
    this.gender = gender;
    this.generalPractitioner = generalPractitioner;
    this.birthDate = birthDate;
    this.text = text;
    this.communication = communication;
    this.maritalStatus = maritalStatus;
    this.name = name;
    this.modifierExtension = modifierExtension;
    this.photo = photo;
  }

  /**
   * @return The value of the {@code multipleBirthBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("multipleBirthBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> multipleBirthBoolean() {
    return java.util.Optional.ofNullable(multipleBirthBoolean);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("link")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Patient_Link>> link() {
    return java.util.Optional.ofNullable(link);
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
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Patient_Contact>> contact() {
    return java.util.Optional.ofNullable(contact);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code deceasedBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deceasedBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> deceasedBoolean() {
    return java.util.Optional.ofNullable(deceasedBoolean);
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
   * @return The value of the {@code managingOrganization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
  @Override
  public java.util.Optional<com.fhir.Reference> managingOrganization() {
    return java.util.Optional.ofNullable(managingOrganization);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code deceasedDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deceasedDateTime")
  @Override
  public java.util.Optional<java.lang.String> deceasedDateTime() {
    return java.util.Optional.ofNullable(deceasedDateTime);
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
   * @return The value of the {@code multipleBirthInteger} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("multipleBirthInteger")
  @Override
  public java.util.Optional<java.lang.Double> multipleBirthInteger() {
    return java.util.Optional.ofNullable(multipleBirthInteger);
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
   * @return The value of the {@code gender} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("gender")
  @Override
  public java.util.Optional<com.fhir.PatientGender> gender() {
    return java.util.Optional.ofNullable(gender);
  }

  /**
   * @return The value of the {@code generalPractitioner} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("generalPractitioner")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> generalPractitioner() {
    return java.util.Optional.ofNullable(generalPractitioner);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code communication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("communication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Patient_Communication>> communication() {
    return java.util.Optional.ofNullable(communication);
  }

  /**
   * @return The value of the {@code maritalStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("maritalStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> maritalStatus() {
    return java.util.Optional.ofNullable(maritalStatus);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#multipleBirthBoolean() multipleBirthBoolean} attribute.
   * @param value The value for multipleBirthBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMultipleBirthBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.multipleBirthBoolean, newValue)) return this;
    return new ImmutablePatient(
        newValue,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#multipleBirthBoolean() multipleBirthBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleBirthBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMultipleBirthBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.multipleBirthBoolean, value)) return this;
    return new ImmutablePatient(
        value,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withLink(java.util.List<com.fhir.Patient_Link> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Patient_Link> newValue = java.util.Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        newValue,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withLink(java.util.Optional<? extends java.util.List<com.fhir.Patient_Link>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Patient_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        value,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        newValue,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        value,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withContact(java.util.List<com.fhir.Patient_Contact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Patient_Contact> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        newValue,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withContact(java.util.Optional<? extends java.util.List<com.fhir.Patient_Contact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Patient_Contact> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        value,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        newValue,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        value,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        newValue,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        value,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Patient#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePatient withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        newValue,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        newValue,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        value,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        newValue,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        value,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#deceasedBoolean() deceasedBoolean} attribute.
   * @param value The value for deceasedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withDeceasedBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.deceasedBoolean, newValue)) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        newValue,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#deceasedBoolean() deceasedBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withDeceasedBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.deceasedBoolean, value)) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        value,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        newValue,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        value,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withManagingOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        newValue,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withManagingOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        value,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withAddress(java.util.List<com.fhir.Address> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Address> newValue = java.util.Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        newValue,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withAddress(java.util.Optional<? extends java.util.List<com.fhir.Address>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Address> value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        value,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        newValue,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        value,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#deceasedDateTime() deceasedDateTime} attribute.
   * @param value The value for deceasedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withDeceasedDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "deceasedDateTime");
    if (java.util.Objects.equals(this.deceasedDateTime, newValue)) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        newValue,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#deceasedDateTime() deceasedDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withDeceasedDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.deceasedDateTime, value)) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        value,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withTelecom(java.util.List<com.fhir.ContactPoint> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> newValue = java.util.Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        newValue,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withTelecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        value,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#multipleBirthInteger() multipleBirthInteger} attribute.
   * @param value The value for multipleBirthInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMultipleBirthInteger(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.multipleBirthInteger, newValue)) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        newValue,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#multipleBirthInteger() multipleBirthInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleBirthInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMultipleBirthInteger(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.multipleBirthInteger, value)) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        value,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.active, newValue)) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        newValue,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.active, value)) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        value,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withGender(com.fhir.PatientGender value) {
    @javax.annotation.Nullable com.fhir.PatientGender newValue = java.util.Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        newValue,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withGender(java.util.Optional<? extends com.fhir.PatientGender> optional) {
    @javax.annotation.Nullable com.fhir.PatientGender value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        value,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#generalPractitioner() generalPractitioner} attribute.
   * @param value The value for generalPractitioner
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withGeneralPractitioner(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "generalPractitioner");
    if (this.generalPractitioner == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        newValue,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#generalPractitioner() generalPractitioner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for generalPractitioner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withGeneralPractitioner(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.generalPractitioner == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        value,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#birthDate() birthDate} attribute.
   * @param value The value for birthDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withBirthDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "birthDate");
    if (this.birthDate == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        newValue,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#birthDate() birthDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for birthDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withBirthDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.birthDate == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        value,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        newValue,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        value,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#communication() communication} attribute.
   * @param value The value for communication
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withCommunication(java.util.List<com.fhir.Patient_Communication> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Patient_Communication> newValue = java.util.Objects.requireNonNull(value, "communication");
    if (this.communication == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        newValue,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#communication() communication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withCommunication(java.util.Optional<? extends java.util.List<com.fhir.Patient_Communication>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Patient_Communication> value = optional.orElse(null);
    if (this.communication == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        value,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#maritalStatus() maritalStatus} attribute.
   * @param value The value for maritalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMaritalStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "maritalStatus");
    if (this.maritalStatus == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        newValue,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#maritalStatus() maritalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maritalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withMaritalStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.maritalStatus == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        value,
        this.name,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withName(java.util.List<com.fhir.HumanName> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.HumanName> newValue = java.util.Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        newValue,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withName(java.util.Optional<? extends java.util.List<com.fhir.HumanName>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.HumanName> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        value,
        this.modifierExtension,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        newValue,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        value,
        this.photo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withPhoto(java.util.List<com.fhir.Attachment> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> newValue = java.util.Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withPhoto(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutablePatient(
        this.multipleBirthBoolean,
        this.link,
        this.identifier,
        this.contact,
        this.id,
        this.implicitRules,
        this.resourceType,
        this.language,
        this.extension,
        this.deceasedBoolean,
        this.contained,
        this.managingOrganization,
        this.address,
        this.meta,
        this.deceasedDateTime,
        this.telecom,
        this.multipleBirthInteger,
        this.active,
        this.gender,
        this.generalPractitioner,
        this.birthDate,
        this.text,
        this.communication,
        this.maritalStatus,
        this.name,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePatient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePatient
        && equalTo((ImmutablePatient) another);
  }

  private boolean equalTo(ImmutablePatient another) {
    return java.util.Objects.equals(multipleBirthBoolean, another.multipleBirthBoolean)
        && java.util.Objects.equals(link, another.link)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(deceasedBoolean, another.deceasedBoolean)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(managingOrganization, another.managingOrganization)
        && java.util.Objects.equals(address, another.address)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(deceasedDateTime, another.deceasedDateTime)
        && java.util.Objects.equals(telecom, another.telecom)
        && java.util.Objects.equals(multipleBirthInteger, another.multipleBirthInteger)
        && java.util.Objects.equals(active, another.active)
        && java.util.Objects.equals(gender, another.gender)
        && java.util.Objects.equals(generalPractitioner, another.generalPractitioner)
        && java.util.Objects.equals(birthDate, another.birthDate)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(communication, another.communication)
        && java.util.Objects.equals(maritalStatus, another.maritalStatus)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(photo, another.photo);
  }

  /**
   * Computes a hash code from attributes: {@code multipleBirthBoolean}, {@code link}, {@code identifier}, {@code contact}, {@code id}, {@code implicitRules}, {@code resourceType}, {@code language}, {@code extension}, {@code deceasedBoolean}, {@code contained}, {@code managingOrganization}, {@code address}, {@code meta}, {@code deceasedDateTime}, {@code telecom}, {@code multipleBirthInteger}, {@code active}, {@code gender}, {@code generalPractitioner}, {@code birthDate}, {@code text}, {@code communication}, {@code maritalStatus}, {@code name}, {@code modifierExtension}, {@code photo}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(multipleBirthBoolean);
    h += (h << 5) + java.util.Objects.hashCode(link);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(deceasedBoolean);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(managingOrganization);
    h += (h << 5) + java.util.Objects.hashCode(address);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(deceasedDateTime);
    h += (h << 5) + java.util.Objects.hashCode(telecom);
    h += (h << 5) + java.util.Objects.hashCode(multipleBirthInteger);
    h += (h << 5) + java.util.Objects.hashCode(active);
    h += (h << 5) + java.util.Objects.hashCode(gender);
    h += (h << 5) + java.util.Objects.hashCode(generalPractitioner);
    h += (h << 5) + java.util.Objects.hashCode(birthDate);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(communication);
    h += (h << 5) + java.util.Objects.hashCode(maritalStatus);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(photo);
    return h;
  }

  /**
   * Prints the immutable value {@code Patient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Patient{");
    if (multipleBirthBoolean != null) {
      builder.append("multipleBirthBoolean=").append(multipleBirthBoolean);
    }
    if (link != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("link=").append(link);
    }
    if (identifier != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contact != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (id != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (deceasedBoolean != null) {
      builder.append(", ");
      builder.append("deceasedBoolean=").append(deceasedBoolean);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (managingOrganization != null) {
      builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    if (address != null) {
      builder.append(", ");
      builder.append("address=").append(address);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (deceasedDateTime != null) {
      builder.append(", ");
      builder.append("deceasedDateTime=").append(deceasedDateTime);
    }
    if (telecom != null) {
      builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (multipleBirthInteger != null) {
      builder.append(", ");
      builder.append("multipleBirthInteger=").append(multipleBirthInteger);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    if (gender != null) {
      builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (generalPractitioner != null) {
      builder.append(", ");
      builder.append("generalPractitioner=").append(generalPractitioner);
    }
    if (birthDate != null) {
      builder.append(", ");
      builder.append("birthDate=").append(birthDate);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (communication != null) {
      builder.append(", ");
      builder.append("communication=").append(communication);
    }
    if (maritalStatus != null) {
      builder.append(", ");
      builder.append("maritalStatus=").append(maritalStatus);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (photo != null) {
      builder.append(", ");
      builder.append("photo=").append(photo);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Patient", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Patient {
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> multipleBirthBoolean = java.util.Optional.empty();
    boolean multipleBirthBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Patient_Link>> link = java.util.Optional.empty();
    boolean linkIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Patient_Contact>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> deceasedBoolean = java.util.Optional.empty();
    boolean deceasedBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> managingOrganization = java.util.Optional.empty();
    boolean managingOrganizationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Address>> address = java.util.Optional.empty();
    boolean addressIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> deceasedDateTime = java.util.Optional.empty();
    boolean deceasedDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom = java.util.Optional.empty();
    boolean telecomIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> multipleBirthInteger = java.util.Optional.empty();
    boolean multipleBirthIntegerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> active = java.util.Optional.empty();
    boolean activeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.PatientGender> gender = java.util.Optional.empty();
    boolean genderIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> generalPractitioner = java.util.Optional.empty();
    boolean generalPractitionerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> birthDate = java.util.Optional.empty();
    boolean birthDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Patient_Communication>> communication = java.util.Optional.empty();
    boolean communicationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> maritalStatus = java.util.Optional.empty();
    boolean maritalStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.HumanName>> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Attachment>> photo = java.util.Optional.empty();
    boolean photoIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("multipleBirthBoolean")
    public void setMultipleBirthBoolean(java.util.Optional<java.lang.Boolean> multipleBirthBoolean) {
      this.multipleBirthBoolean = multipleBirthBoolean;
      this.multipleBirthBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public void setLink(java.util.Optional<java.util.List<com.fhir.Patient_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.Patient_Contact>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedBoolean")
    public void setDeceasedBoolean(java.util.Optional<java.lang.Boolean> deceasedBoolean) {
      this.deceasedBoolean = deceasedBoolean;
      this.deceasedBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("managingOrganization")
    public void setManagingOrganization(java.util.Optional<com.fhir.Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    public void setAddress(java.util.Optional<java.util.List<com.fhir.Address>> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedDateTime")
    public void setDeceasedDateTime(java.util.Optional<java.lang.String> deceasedDateTime) {
      this.deceasedDateTime = deceasedDateTime;
      this.deceasedDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("telecom")
    public void setTelecom(java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("multipleBirthInteger")
    public void setMultipleBirthInteger(java.util.Optional<java.lang.Double> multipleBirthInteger) {
      this.multipleBirthInteger = multipleBirthInteger;
      this.multipleBirthIntegerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    public void setActive(java.util.Optional<java.lang.Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("gender")
    public void setGender(java.util.Optional<com.fhir.PatientGender> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("generalPractitioner")
    public void setGeneralPractitioner(java.util.Optional<java.util.List<com.fhir.Reference>> generalPractitioner) {
      this.generalPractitioner = generalPractitioner;
      this.generalPractitionerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("birthDate")
    public void setBirthDate(java.util.Optional<com.fhir.date> birthDate) {
      this.birthDate = birthDate;
      this.birthDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("communication")
    public void setCommunication(java.util.Optional<java.util.List<com.fhir.Patient_Communication>> communication) {
      this.communication = communication;
      this.communicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("maritalStatus")
    public void setMaritalStatus(java.util.Optional<com.fhir.CodeableConcept> maritalStatus) {
      this.maritalStatus = maritalStatus;
      this.maritalStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.util.List<com.fhir.HumanName>> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("photo")
    public void setPhoto(java.util.Optional<java.util.List<com.fhir.Attachment>> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.Boolean> multipleBirthBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Patient_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Patient_Contact>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> deceasedBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Address>> address() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> deceasedDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> multipleBirthInteger() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.PatientGender> gender() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> generalPractitioner() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> birthDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Patient_Communication>> communication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> maritalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.HumanName>> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Attachment>> photo() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePatient fromJson(Json json) {
    ImmutablePatient.Builder builder = ((ImmutablePatient.Builder) ImmutablePatient.builder());
    if (json.multipleBirthBooleanIsSet) {
      builder.multipleBirthBoolean(json.multipleBirthBoolean);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.deceasedBooleanIsSet) {
      builder.deceasedBoolean(json.deceasedBoolean);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.deceasedDateTimeIsSet) {
      builder.deceasedDateTime(json.deceasedDateTime);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.multipleBirthIntegerIsSet) {
      builder.multipleBirthInteger(json.multipleBirthInteger);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.generalPractitionerIsSet) {
      builder.generalPractitioner(json.generalPractitioner);
    }
    if (json.birthDateIsSet) {
      builder.birthDate(json.birthDate);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.communicationIsSet) {
      builder.communication(json.communication);
    }
    if (json.maritalStatusIsSet) {
      builder.maritalStatus(json.maritalStatus);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    return (ImmutablePatient) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Patient} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Patient instance
   */
  public static Patient copyOf(Patient instance) {
    if (instance instanceof ImmutablePatient) {
      return (ImmutablePatient) instance;
    }
    return ((ImmutablePatient.Builder) ImmutablePatient.builder())
        .multipleBirthBoolean(instance.multipleBirthBoolean())
        .link(instance.link())
        .identifier(instance.identifier())
        .contact(instance.contact())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .extension(instance.extension())
        .deceasedBoolean(instance.deceasedBoolean())
        .contained(instance.contained())
        .managingOrganization(instance.managingOrganization())
        .address(instance.address())
        .meta(instance.meta())
        .deceasedDateTime(instance.deceasedDateTime())
        .telecom(instance.telecom())
        .multipleBirthInteger(instance.multipleBirthInteger())
        .active(instance.active())
        .gender(instance.gender())
        .generalPractitioner(instance.generalPractitioner())
        .birthDate(instance.birthDate())
        .text(instance.text())
        .communication(instance.communication())
        .maritalStatus(instance.maritalStatus())
        .name(instance.name())
        .modifierExtension(instance.modifierExtension())
        .photo(instance.photo())
        .build();
  }

  /**
   * Creates a builder for {@link Patient Patient}.
   * <pre>
   * ImmutablePatient.builder()
   *    .multipleBirthBoolean(Boolean) // optional {@link Patient#multipleBirthBoolean() multipleBirthBoolean}
   *    .link(List&amp;lt;com.fhir.Patient_Link&amp;gt;) // optional {@link Patient#link() link}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Patient#identifier() identifier}
   *    .contact(List&amp;lt;com.fhir.Patient_Contact&amp;gt;) // optional {@link Patient#contact() contact}
   *    .id(com.fhir.id) // optional {@link Patient#id() id}
   *    .implicitRules(com.fhir.uri) // optional {@link Patient#implicitRules() implicitRules}
   *    .resourceType(String) // required {@link Patient#resourceType() resourceType}
   *    .language(com.fhir.code) // optional {@link Patient#language() language}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Patient#extension() extension}
   *    .deceasedBoolean(Boolean) // optional {@link Patient#deceasedBoolean() deceasedBoolean}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Patient#contained() contained}
   *    .managingOrganization(com.fhir.Reference) // optional {@link Patient#managingOrganization() managingOrganization}
   *    .address(List&amp;lt;com.fhir.Address&amp;gt;) // optional {@link Patient#address() address}
   *    .meta(com.fhir.Meta) // optional {@link Patient#meta() meta}
   *    .deceasedDateTime(String) // optional {@link Patient#deceasedDateTime() deceasedDateTime}
   *    .telecom(List&amp;lt;com.fhir.ContactPoint&amp;gt;) // optional {@link Patient#telecom() telecom}
   *    .multipleBirthInteger(Double) // optional {@link Patient#multipleBirthInteger() multipleBirthInteger}
   *    .active(Boolean) // optional {@link Patient#active() active}
   *    .gender(com.fhir.PatientGender) // optional {@link Patient#gender() gender}
   *    .generalPractitioner(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Patient#generalPractitioner() generalPractitioner}
   *    .birthDate(com.fhir.date) // optional {@link Patient#birthDate() birthDate}
   *    .text(com.fhir.Narrative) // optional {@link Patient#text() text}
   *    .communication(List&amp;lt;com.fhir.Patient_Communication&amp;gt;) // optional {@link Patient#communication() communication}
   *    .maritalStatus(com.fhir.CodeableConcept) // optional {@link Patient#maritalStatus() maritalStatus}
   *    .name(List&amp;lt;com.fhir.HumanName&amp;gt;) // optional {@link Patient#name() name}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Patient#modifierExtension() modifierExtension}
   *    .photo(List&amp;lt;com.fhir.Attachment&amp;gt;) // optional {@link Patient#photo() photo}
   *    .build();
   * </pre>
   * @return A new Patient builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutablePatient.Builder();
  }

  /**
   * Builds instances of type {@link Patient Patient}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Patient", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MULTIPLE_BIRTH_BOOLEAN = 0x1L;
    private static final long OPT_BIT_LINK = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_CONTACT = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_DECEASED_BOOLEAN = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x400L;
    private static final long OPT_BIT_ADDRESS = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_DECEASED_DATE_TIME = 0x2000L;
    private static final long OPT_BIT_TELECOM = 0x4000L;
    private static final long OPT_BIT_MULTIPLE_BIRTH_INTEGER = 0x8000L;
    private static final long OPT_BIT_ACTIVE = 0x10000L;
    private static final long OPT_BIT_GENDER = 0x20000L;
    private static final long OPT_BIT_GENERAL_PRACTITIONER = 0x40000L;
    private static final long OPT_BIT_BIRTH_DATE = 0x80000L;
    private static final long OPT_BIT_TEXT = 0x100000L;
    private static final long OPT_BIT_COMMUNICATION = 0x200000L;
    private static final long OPT_BIT_MARITAL_STATUS = 0x400000L;
    private static final long OPT_BIT_NAME = 0x800000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000000L;
    private static final long OPT_BIT_PHOTO = 0x2000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.Boolean multipleBirthBoolean;
    private @javax.annotation.Nullable java.util.List<com.fhir.Patient_Link> link;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Patient_Contact> contact;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Boolean deceasedBoolean;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Reference managingOrganization;
    private @javax.annotation.Nullable java.util.List<com.fhir.Address> address;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String deceasedDateTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactPoint> telecom;
    private @javax.annotation.Nullable java.lang.Double multipleBirthInteger;
    private @javax.annotation.Nullable java.lang.Boolean active;
    private @javax.annotation.Nullable com.fhir.PatientGender gender;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> generalPractitioner;
    private @javax.annotation.Nullable com.fhir.date birthDate;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Patient_Communication> communication;
    private @javax.annotation.Nullable com.fhir.CodeableConcept maritalStatus;
    private @javax.annotation.Nullable java.util.List<com.fhir.HumanName> name;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Attachment> photo;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Patient#multipleBirthBoolean() multipleBirthBoolean} to multipleBirthBoolean.
     * @param multipleBirthBoolean The value for multipleBirthBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder multipleBirthBoolean(boolean multipleBirthBoolean) {
      checkNotIsSet(multipleBirthBooleanIsSet(), "multipleBirthBoolean");
      this.multipleBirthBoolean = multipleBirthBoolean;
      optBits |= OPT_BIT_MULTIPLE_BIRTH_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#multipleBirthBoolean() multipleBirthBoolean} to multipleBirthBoolean.
     * @param multipleBirthBoolean The value for multipleBirthBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multipleBirthBoolean")
    public final Builder multipleBirthBoolean(java.util.Optional<java.lang.Boolean> multipleBirthBoolean) {
      checkNotIsSet(multipleBirthBooleanIsSet(), "multipleBirthBoolean");
      this.multipleBirthBoolean = multipleBirthBoolean.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_BIRTH_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(java.util.List<com.fhir.Patient_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = java.util.Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("link")
    public final Builder link(java.util.Optional<? extends java.util.List<com.fhir.Patient_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Patient#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Patient#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.Patient_Contact> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.Patient_Contact>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#id() id} to id.
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
     * Initializes the optional value {@link Patient#id() id} to id.
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
     * Initializes the optional value {@link Patient#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Patient#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link Patient#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Patient#language() language} to language.
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
     * Initializes the optional value {@link Patient#language() language} to language.
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
     * Initializes the optional value {@link Patient#extension() extension} to extension.
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
     * Initializes the optional value {@link Patient#extension() extension} to extension.
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
     * Initializes the optional value {@link Patient#deceasedBoolean() deceasedBoolean} to deceasedBoolean.
     * @param deceasedBoolean The value for deceasedBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedBoolean(boolean deceasedBoolean) {
      checkNotIsSet(deceasedBooleanIsSet(), "deceasedBoolean");
      this.deceasedBoolean = deceasedBoolean;
      optBits |= OPT_BIT_DECEASED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#deceasedBoolean() deceasedBoolean} to deceasedBoolean.
     * @param deceasedBoolean The value for deceasedBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedBoolean")
    public final Builder deceasedBoolean(java.util.Optional<java.lang.Boolean> deceasedBoolean) {
      checkNotIsSet(deceasedBooleanIsSet(), "deceasedBoolean");
      this.deceasedBoolean = deceasedBoolean.orElse(null);
      optBits |= OPT_BIT_DECEASED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#contained() contained} to contained.
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
     * Initializes the optional value {@link Patient#contained() contained} to contained.
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
     * Initializes the optional value {@link Patient#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the optional value {@link Patient#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the optional value {@link Patient#address() address} to address.
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
     * Initializes the optional value {@link Patient#address() address} to address.
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
     * Initializes the optional value {@link Patient#meta() meta} to meta.
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
     * Initializes the optional value {@link Patient#meta() meta} to meta.
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
     * Initializes the optional value {@link Patient#deceasedDateTime() deceasedDateTime} to deceasedDateTime.
     * @param deceasedDateTime The value for deceasedDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedDateTime(java.lang.String deceasedDateTime) {
      checkNotIsSet(deceasedDateTimeIsSet(), "deceasedDateTime");
      this.deceasedDateTime = java.util.Objects.requireNonNull(deceasedDateTime, "deceasedDateTime");
      optBits |= OPT_BIT_DECEASED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#deceasedDateTime() deceasedDateTime} to deceasedDateTime.
     * @param deceasedDateTime The value for deceasedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deceasedDateTime")
    public final Builder deceasedDateTime(java.util.Optional<java.lang.String> deceasedDateTime) {
      checkNotIsSet(deceasedDateTimeIsSet(), "deceasedDateTime");
      this.deceasedDateTime = deceasedDateTime.orElse(null);
      optBits |= OPT_BIT_DECEASED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Patient#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Patient#multipleBirthInteger() multipleBirthInteger} to multipleBirthInteger.
     * @param multipleBirthInteger The value for multipleBirthInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder multipleBirthInteger(double multipleBirthInteger) {
      checkNotIsSet(multipleBirthIntegerIsSet(), "multipleBirthInteger");
      this.multipleBirthInteger = multipleBirthInteger;
      optBits |= OPT_BIT_MULTIPLE_BIRTH_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#multipleBirthInteger() multipleBirthInteger} to multipleBirthInteger.
     * @param multipleBirthInteger The value for multipleBirthInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multipleBirthInteger")
    public final Builder multipleBirthInteger(java.util.Optional<java.lang.Double> multipleBirthInteger) {
      checkNotIsSet(multipleBirthIntegerIsSet(), "multipleBirthInteger");
      this.multipleBirthInteger = multipleBirthInteger.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_BIRTH_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#active() active} to active.
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
     * Initializes the optional value {@link Patient#active() active} to active.
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
     * Initializes the optional value {@link Patient#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(com.fhir.PatientGender gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = java.util.Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gender")
    public final Builder gender(java.util.Optional<? extends com.fhir.PatientGender> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#generalPractitioner() generalPractitioner} to generalPractitioner.
     * @param generalPractitioner The value for generalPractitioner
     * @return {@code this} builder for chained invocation
     */
    public final Builder generalPractitioner(java.util.List<com.fhir.Reference> generalPractitioner) {
      checkNotIsSet(generalPractitionerIsSet(), "generalPractitioner");
      this.generalPractitioner = java.util.Objects.requireNonNull(generalPractitioner, "generalPractitioner");
      optBits |= OPT_BIT_GENERAL_PRACTITIONER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#generalPractitioner() generalPractitioner} to generalPractitioner.
     * @param generalPractitioner The value for generalPractitioner
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("generalPractitioner")
    public final Builder generalPractitioner(java.util.Optional<? extends java.util.List<com.fhir.Reference>> generalPractitioner) {
      checkNotIsSet(generalPractitionerIsSet(), "generalPractitioner");
      this.generalPractitioner = generalPractitioner.orElse(null);
      optBits |= OPT_BIT_GENERAL_PRACTITIONER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link Patient#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link Patient#text() text} to text.
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
     * Initializes the optional value {@link Patient#text() text} to text.
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
     * Initializes the optional value {@link Patient#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    public final Builder communication(java.util.List<com.fhir.Patient_Communication> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = java.util.Objects.requireNonNull(communication, "communication");
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("communication")
    public final Builder communication(java.util.Optional<? extends java.util.List<com.fhir.Patient_Communication>> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = communication.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#maritalStatus() maritalStatus} to maritalStatus.
     * @param maritalStatus The value for maritalStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder maritalStatus(com.fhir.CodeableConcept maritalStatus) {
      checkNotIsSet(maritalStatusIsSet(), "maritalStatus");
      this.maritalStatus = java.util.Objects.requireNonNull(maritalStatus, "maritalStatus");
      optBits |= OPT_BIT_MARITAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#maritalStatus() maritalStatus} to maritalStatus.
     * @param maritalStatus The value for maritalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maritalStatus")
    public final Builder maritalStatus(java.util.Optional<? extends com.fhir.CodeableConcept> maritalStatus) {
      checkNotIsSet(maritalStatusIsSet(), "maritalStatus");
      this.maritalStatus = maritalStatus.orElse(null);
      optBits |= OPT_BIT_MARITAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#name() name} to name.
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
     * Initializes the optional value {@link Patient#name() name} to name.
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
     * Initializes the optional value {@link Patient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Patient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Patient#photo() photo} to photo.
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
     * Initializes the optional value {@link Patient#photo() photo} to photo.
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
     * Builds a new {@link Patient Patient}.
     * @return An immutable instance of Patient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Patient build() {
      checkRequiredAttributes();
      return new ImmutablePatient(
          multipleBirthBoolean,
          link,
          identifier,
          contact,
          id,
          implicitRules,
          resourceType,
          language,
          extension,
          deceasedBoolean,
          contained,
          managingOrganization,
          address,
          meta,
          deceasedDateTime,
          telecom,
          multipleBirthInteger,
          active,
          gender,
          generalPractitioner,
          birthDate,
          text,
          communication,
          maritalStatus,
          name,
          modifierExtension,
          photo);
    }

    private boolean multipleBirthBooleanIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_BIRTH_BOOLEAN) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean deceasedBooleanIsSet() {
      return (optBits & OPT_BIT_DECEASED_BOOLEAN) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean deceasedDateTimeIsSet() {
      return (optBits & OPT_BIT_DECEASED_DATE_TIME) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean multipleBirthIntegerIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_BIRTH_INTEGER) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean generalPractitionerIsSet() {
      return (optBits & OPT_BIT_GENERAL_PRACTITIONER) != 0;
    }

    private boolean birthDateIsSet() {
      return (optBits & OPT_BIT_BIRTH_DATE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean communicationIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION) != 0;
    }

    private boolean maritalStatusIsSet() {
      return (optBits & OPT_BIT_MARITAL_STATUS) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Patient is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Patient, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Patient", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Patient#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Patient", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Patient#multipleBirthBoolean() multipleBirthBoolean} to multipleBirthBoolean.
     * @param multipleBirthBoolean The value for multipleBirthBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal multipleBirthBoolean(boolean multipleBirthBoolean);

    /**
     * Initializes the optional value {@link Patient#multipleBirthBoolean() multipleBirthBoolean} to multipleBirthBoolean.
     * @param multipleBirthBoolean The value for multipleBirthBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal multipleBirthBoolean(java.util.Optional<java.lang.Boolean> multipleBirthBoolean);

    /**
     * Initializes the optional value {@link Patient#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(java.util.List<com.fhir.Patient_Link> link);

    /**
     * Initializes the optional value {@link Patient#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(java.util.Optional<? extends java.util.List<com.fhir.Patient_Link>> link);

    /**
     * Initializes the optional value {@link Patient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Patient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Patient#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.Patient_Contact> contact);

    /**
     * Initializes the optional value {@link Patient#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.Patient_Contact>> contact);

    /**
     * Initializes the optional value {@link Patient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Patient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Patient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Patient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Patient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Patient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Patient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Patient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Patient#deceasedBoolean() deceasedBoolean} to deceasedBoolean.
     * @param deceasedBoolean The value for deceasedBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedBoolean(boolean deceasedBoolean);

    /**
     * Initializes the optional value {@link Patient#deceasedBoolean() deceasedBoolean} to deceasedBoolean.
     * @param deceasedBoolean The value for deceasedBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedBoolean(java.util.Optional<java.lang.Boolean> deceasedBoolean);

    /**
     * Initializes the optional value {@link Patient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Patient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Patient#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(com.fhir.Reference managingOrganization);

    /**
     * Initializes the optional value {@link Patient#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(java.util.Optional<? extends com.fhir.Reference> managingOrganization);

    /**
     * Initializes the optional value {@link Patient#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(java.util.List<com.fhir.Address> address);

    /**
     * Initializes the optional value {@link Patient#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(java.util.Optional<? extends java.util.List<com.fhir.Address>> address);

    /**
     * Initializes the optional value {@link Patient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Patient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Patient#deceasedDateTime() deceasedDateTime} to deceasedDateTime.
     * @param deceasedDateTime The value for deceasedDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedDateTime(java.lang.String deceasedDateTime);

    /**
     * Initializes the optional value {@link Patient#deceasedDateTime() deceasedDateTime} to deceasedDateTime.
     * @param deceasedDateTime The value for deceasedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedDateTime(java.util.Optional<java.lang.String> deceasedDateTime);

    /**
     * Initializes the optional value {@link Patient#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(java.util.List<com.fhir.ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Patient#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(java.util.Optional<? extends java.util.List<com.fhir.ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link Patient#multipleBirthInteger() multipleBirthInteger} to multipleBirthInteger.
     * @param multipleBirthInteger The value for multipleBirthInteger
     * @return {@code this} builder for chained invocation
     */
    BuildFinal multipleBirthInteger(double multipleBirthInteger);

    /**
     * Initializes the optional value {@link Patient#multipleBirthInteger() multipleBirthInteger} to multipleBirthInteger.
     * @param multipleBirthInteger The value for multipleBirthInteger
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal multipleBirthInteger(java.util.Optional<java.lang.Double> multipleBirthInteger);

    /**
     * Initializes the optional value {@link Patient#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link Patient#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(java.util.Optional<java.lang.Boolean> active);

    /**
     * Initializes the optional value {@link Patient#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal gender(com.fhir.PatientGender gender);

    /**
     * Initializes the optional value {@link Patient#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal gender(java.util.Optional<? extends com.fhir.PatientGender> gender);

    /**
     * Initializes the optional value {@link Patient#generalPractitioner() generalPractitioner} to generalPractitioner.
     * @param generalPractitioner The value for generalPractitioner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal generalPractitioner(java.util.List<com.fhir.Reference> generalPractitioner);

    /**
     * Initializes the optional value {@link Patient#generalPractitioner() generalPractitioner} to generalPractitioner.
     * @param generalPractitioner The value for generalPractitioner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal generalPractitioner(java.util.Optional<? extends java.util.List<com.fhir.Reference>> generalPractitioner);

    /**
     * Initializes the optional value {@link Patient#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal birthDate(com.fhir.date birthDate);

    /**
     * Initializes the optional value {@link Patient#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal birthDate(java.util.Optional<? extends com.fhir.date> birthDate);

    /**
     * Initializes the optional value {@link Patient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Patient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Patient#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal communication(java.util.List<com.fhir.Patient_Communication> communication);

    /**
     * Initializes the optional value {@link Patient#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal communication(java.util.Optional<? extends java.util.List<com.fhir.Patient_Communication>> communication);

    /**
     * Initializes the optional value {@link Patient#maritalStatus() maritalStatus} to maritalStatus.
     * @param maritalStatus The value for maritalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal maritalStatus(com.fhir.CodeableConcept maritalStatus);

    /**
     * Initializes the optional value {@link Patient#maritalStatus() maritalStatus} to maritalStatus.
     * @param maritalStatus The value for maritalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal maritalStatus(java.util.Optional<? extends com.fhir.CodeableConcept> maritalStatus);

    /**
     * Initializes the optional value {@link Patient#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.util.List<com.fhir.HumanName> name);

    /**
     * Initializes the optional value {@link Patient#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<? extends java.util.List<com.fhir.HumanName>> name);

    /**
     * Initializes the optional value {@link Patient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Patient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Patient#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal photo(java.util.List<com.fhir.Attachment> photo);

    /**
     * Initializes the optional value {@link Patient#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal photo(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> photo);

    /**
     * Builds a new {@link Patient Patient}.
     * @return An immutable instance of Patient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Patient build();
  }
}
