package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Patient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePatient.builder()}.
 */
@Generated(from = "Patient", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePatient implements Patient {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> generalPractitioner;
  private final @Nullable Reference managingOrganization;
  private final @Nullable Boolean multipleBirthBoolean;
  private final @Nullable PatientGender gender;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Attachment> photo;
  private final @Nullable Date birthDate;
  private final @Nullable List<Patient_Contact> contact;
  private final @Nullable Double multipleBirthInteger;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean active;
  private final @Nullable Id id;
  private final String resourceType;
  private final @Nullable List<Patient_Communication> communication;
  private final @Nullable List<Patient_Link> link;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable String deceasedDateTime;
  private final @Nullable Code language;
  private final @Nullable Meta meta;
  private final @Nullable List<HumanName> name;
  private final @Nullable CodeableConcept maritalStatus;
  private final @Nullable List<Address> address;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Boolean deceasedBoolean;
  private final @Nullable Narrative text;

  private ImmutablePatient(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> generalPractitioner,
      @Nullable Reference managingOrganization,
      @Nullable Boolean multipleBirthBoolean,
      @Nullable PatientGender gender,
      @Nullable List<ContactPoint> telecom,
      @Nullable Uri implicitRules,
      @Nullable List<Attachment> photo,
      @Nullable Date birthDate,
      @Nullable List<Patient_Contact> contact,
      @Nullable Double multipleBirthInteger,
      @Nullable List<Extension> extension,
      @Nullable Boolean active,
      @Nullable Id id,
      String resourceType,
      @Nullable List<Patient_Communication> communication,
      @Nullable List<Patient_Link> link,
      @Nullable List<ResourceList> contained,
      @Nullable String deceasedDateTime,
      @Nullable Code language,
      @Nullable Meta meta,
      @Nullable List<HumanName> name,
      @Nullable CodeableConcept maritalStatus,
      @Nullable List<Address> address,
      @Nullable List<Identifier> identifier,
      @Nullable Boolean deceasedBoolean,
      @Nullable Narrative text) {
    this.modifierExtension = modifierExtension;
    this.generalPractitioner = generalPractitioner;
    this.managingOrganization = managingOrganization;
    this.multipleBirthBoolean = multipleBirthBoolean;
    this.gender = gender;
    this.telecom = telecom;
    this.implicitRules = implicitRules;
    this.photo = photo;
    this.birthDate = birthDate;
    this.contact = contact;
    this.multipleBirthInteger = multipleBirthInteger;
    this.extension = extension;
    this.active = active;
    this.id = id;
    this.resourceType = resourceType;
    this.communication = communication;
    this.link = link;
    this.contained = contained;
    this.deceasedDateTime = deceasedDateTime;
    this.language = language;
    this.meta = meta;
    this.name = name;
    this.maritalStatus = maritalStatus;
    this.address = address;
    this.identifier = identifier;
    this.deceasedBoolean = deceasedBoolean;
    this.text = text;
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code generalPractitioner} attribute
   */
  @JsonProperty("generalPractitioner")
  @Override
  public Optional<List<Reference>> generalPractitioner() {
    return Optional.ofNullable(generalPractitioner);
  }

  /**
   * @return The value of the {@code managingOrganization} attribute
   */
  @JsonProperty("managingOrganization")
  @Override
  public Optional<Reference> managingOrganization() {
    return Optional.ofNullable(managingOrganization);
  }

  /**
   * @return The value of the {@code multipleBirthBoolean} attribute
   */
  @JsonProperty("multipleBirthBoolean")
  @Override
  public Optional<Boolean> multipleBirthBoolean() {
    return Optional.ofNullable(multipleBirthBoolean);
  }

  /**
   * @return The value of the {@code gender} attribute
   */
  @JsonProperty("gender")
  @Override
  public Optional<PatientGender> gender() {
    return Optional.ofNullable(gender);
  }

  /**
   * @return The value of the {@code telecom} attribute
   */
  @JsonProperty("telecom")
  @Override
  public Optional<List<ContactPoint>> telecom() {
    return Optional.ofNullable(telecom);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code photo} attribute
   */
  @JsonProperty("photo")
  @Override
  public Optional<List<Attachment>> photo() {
    return Optional.ofNullable(photo);
  }

  /**
   * @return The value of the {@code birthDate} attribute
   */
  @JsonProperty("birthDate")
  @Override
  public Optional<Date> birthDate() {
    return Optional.ofNullable(birthDate);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<Patient_Contact>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code multipleBirthInteger} attribute
   */
  @JsonProperty("multipleBirthInteger")
  @Override
  public Optional<Double> multipleBirthInteger() {
    return Optional.ofNullable(multipleBirthInteger);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public Optional<Boolean> active() {
    return Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code communication} attribute
   */
  @JsonProperty("communication")
  @Override
  public Optional<List<Patient_Communication>> communication() {
    return Optional.ofNullable(communication);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Optional<List<Patient_Link>> link() {
    return Optional.ofNullable(link);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code deceasedDateTime} attribute
   */
  @JsonProperty("deceasedDateTime")
  @Override
  public Optional<String> deceasedDateTime() {
    return Optional.ofNullable(deceasedDateTime);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<List<HumanName>> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code maritalStatus} attribute
   */
  @JsonProperty("maritalStatus")
  @Override
  public Optional<CodeableConcept> maritalStatus() {
    return Optional.ofNullable(maritalStatus);
  }

  /**
   * @return The value of the {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public Optional<List<Address>> address() {
    return Optional.ofNullable(address);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code deceasedBoolean} attribute
   */
  @JsonProperty("deceasedBoolean")
  @Override
  public Optional<Boolean> deceasedBoolean() {
    return Optional.ofNullable(deceasedBoolean);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePatient(
        newValue,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePatient(
        value,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#generalPractitioner() generalPractitioner} attribute.
   * @param value The value for generalPractitioner
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withGeneralPractitioner(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "generalPractitioner");
    if (this.generalPractitioner == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        newValue,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#generalPractitioner() generalPractitioner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for generalPractitioner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withGeneralPractitioner(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.generalPractitioner == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        value,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withManagingOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        newValue,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withManagingOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        value,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#multipleBirthBoolean() multipleBirthBoolean} attribute.
   * @param value The value for multipleBirthBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMultipleBirthBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.multipleBirthBoolean, newValue)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        newValue,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#multipleBirthBoolean() multipleBirthBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleBirthBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMultipleBirthBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.multipleBirthBoolean, value)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        value,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withGender(PatientGender value) {
    @Nullable PatientGender newValue = Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        newValue,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withGender(Optional<? extends PatientGender> optional) {
    @Nullable PatientGender value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        value,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        newValue,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        value,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        newValue,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        value,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withPhoto(List<Attachment> value) {
    @Nullable List<Attachment> newValue = Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        newValue,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withPhoto(Optional<? extends List<Attachment>> optional) {
    @Nullable List<Attachment> value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        value,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#birthDate() birthDate} attribute.
   * @param value The value for birthDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withBirthDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "birthDate");
    if (this.birthDate == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        newValue,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#birthDate() birthDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for birthDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withBirthDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.birthDate == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        value,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withContact(List<Patient_Contact> value) {
    @Nullable List<Patient_Contact> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        newValue,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withContact(Optional<? extends List<Patient_Contact>> optional) {
    @Nullable List<Patient_Contact> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        value,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#multipleBirthInteger() multipleBirthInteger} attribute.
   * @param value The value for multipleBirthInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMultipleBirthInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.multipleBirthInteger, newValue)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        newValue,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#multipleBirthInteger() multipleBirthInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleBirthInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMultipleBirthInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.multipleBirthInteger, value)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        value,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        newValue,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        value,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        newValue,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        value,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        newValue,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        value,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Patient#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePatient withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        newValue,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#communication() communication} attribute.
   * @param value The value for communication
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withCommunication(List<Patient_Communication> value) {
    @Nullable List<Patient_Communication> newValue = Objects.requireNonNull(value, "communication");
    if (this.communication == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        newValue,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#communication() communication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withCommunication(Optional<? extends List<Patient_Communication>> optional) {
    @Nullable List<Patient_Communication> value = optional.orElse(null);
    if (this.communication == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        value,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withLink(List<Patient_Link> value) {
    @Nullable List<Patient_Link> newValue = Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        newValue,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withLink(Optional<? extends List<Patient_Link>> optional) {
    @Nullable List<Patient_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        value,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        newValue,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        value,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#deceasedDateTime() deceasedDateTime} attribute.
   * @param value The value for deceasedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withDeceasedDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "deceasedDateTime");
    if (Objects.equals(this.deceasedDateTime, newValue)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        newValue,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#deceasedDateTime() deceasedDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withDeceasedDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.deceasedDateTime, value)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        value,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        newValue,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        value,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        newValue,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        value,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withName(List<HumanName> value) {
    @Nullable List<HumanName> newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        newValue,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withName(Optional<? extends List<HumanName>> optional) {
    @Nullable List<HumanName> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        value,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#maritalStatus() maritalStatus} attribute.
   * @param value The value for maritalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withMaritalStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "maritalStatus");
    if (this.maritalStatus == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        newValue,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#maritalStatus() maritalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maritalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withMaritalStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.maritalStatus == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        value,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withAddress(List<Address> value) {
    @Nullable List<Address> newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        newValue,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withAddress(Optional<? extends List<Address>> optional) {
    @Nullable List<Address> value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        value,
        this.identifier,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        newValue,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        value,
        this.deceasedBoolean,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#deceasedBoolean() deceasedBoolean} attribute.
   * @param value The value for deceasedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withDeceasedBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.deceasedBoolean, newValue)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#deceasedBoolean() deceasedBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deceasedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withDeceasedBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.deceasedBoolean, value)) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePatient(
        this.modifierExtension,
        this.generalPractitioner,
        this.managingOrganization,
        this.multipleBirthBoolean,
        this.gender,
        this.telecom,
        this.implicitRules,
        this.photo,
        this.birthDate,
        this.contact,
        this.multipleBirthInteger,
        this.extension,
        this.active,
        this.id,
        this.resourceType,
        this.communication,
        this.link,
        this.contained,
        this.deceasedDateTime,
        this.language,
        this.meta,
        this.name,
        this.maritalStatus,
        this.address,
        this.identifier,
        this.deceasedBoolean,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePatient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePatient
        && equalTo((ImmutablePatient) another);
  }

  private boolean equalTo(ImmutablePatient another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(generalPractitioner, another.generalPractitioner)
        && Objects.equals(managingOrganization, another.managingOrganization)
        && Objects.equals(multipleBirthBoolean, another.multipleBirthBoolean)
        && Objects.equals(gender, another.gender)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(photo, another.photo)
        && Objects.equals(birthDate, another.birthDate)
        && Objects.equals(contact, another.contact)
        && Objects.equals(multipleBirthInteger, another.multipleBirthInteger)
        && Objects.equals(extension, another.extension)
        && Objects.equals(active, another.active)
        && Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType)
        && Objects.equals(communication, another.communication)
        && Objects.equals(link, another.link)
        && Objects.equals(contained, another.contained)
        && Objects.equals(deceasedDateTime, another.deceasedDateTime)
        && Objects.equals(language, another.language)
        && Objects.equals(meta, another.meta)
        && Objects.equals(name, another.name)
        && Objects.equals(maritalStatus, another.maritalStatus)
        && Objects.equals(address, another.address)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(deceasedBoolean, another.deceasedBoolean)
        && Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code generalPractitioner}, {@code managingOrganization}, {@code multipleBirthBoolean}, {@code gender}, {@code telecom}, {@code implicitRules}, {@code photo}, {@code birthDate}, {@code contact}, {@code multipleBirthInteger}, {@code extension}, {@code active}, {@code id}, {@code resourceType}, {@code communication}, {@code link}, {@code contained}, {@code deceasedDateTime}, {@code language}, {@code meta}, {@code name}, {@code maritalStatus}, {@code address}, {@code identifier}, {@code deceasedBoolean}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(generalPractitioner);
    h += (h << 5) + Objects.hashCode(managingOrganization);
    h += (h << 5) + Objects.hashCode(multipleBirthBoolean);
    h += (h << 5) + Objects.hashCode(gender);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(photo);
    h += (h << 5) + Objects.hashCode(birthDate);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(multipleBirthInteger);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(communication);
    h += (h << 5) + Objects.hashCode(link);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(deceasedDateTime);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(maritalStatus);
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(deceasedBoolean);
    h += (h << 5) + Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code Patient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Patient{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (generalPractitioner != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("generalPractitioner=").append(generalPractitioner);
    }
    if (managingOrganization != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    if (multipleBirthBoolean != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("multipleBirthBoolean=").append(multipleBirthBoolean);
    }
    if (gender != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (telecom != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (implicitRules != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (photo != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("photo=").append(photo);
    }
    if (birthDate != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("birthDate=").append(birthDate);
    }
    if (contact != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (multipleBirthInteger != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("multipleBirthInteger=").append(multipleBirthInteger);
    }
    if (extension != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (active != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (id != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (communication != null) {
      builder.append(", ");
      builder.append("communication=").append(communication);
    }
    if (link != null) {
      builder.append(", ");
      builder.append("link=").append(link);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (deceasedDateTime != null) {
      builder.append(", ");
      builder.append("deceasedDateTime=").append(deceasedDateTime);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (maritalStatus != null) {
      builder.append(", ");
      builder.append("maritalStatus=").append(maritalStatus);
    }
    if (address != null) {
      builder.append(", ");
      builder.append("address=").append(address);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (deceasedBoolean != null) {
      builder.append(", ");
      builder.append("deceasedBoolean=").append(deceasedBoolean);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Patient", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Patient {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> generalPractitioner = Optional.empty();
    boolean generalPractitionerIsSet;
    @Nullable Optional<Reference> managingOrganization = Optional.empty();
    boolean managingOrganizationIsSet;
    @Nullable Optional<Boolean> multipleBirthBoolean = Optional.empty();
    boolean multipleBirthBooleanIsSet;
    @Nullable Optional<PatientGender> gender = Optional.empty();
    boolean genderIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Attachment>> photo = Optional.empty();
    boolean photoIsSet;
    @Nullable Optional<Date> birthDate = Optional.empty();
    boolean birthDateIsSet;
    @Nullable Optional<List<Patient_Contact>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Double> multipleBirthInteger = Optional.empty();
    boolean multipleBirthIntegerIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Patient_Communication>> communication = Optional.empty();
    boolean communicationIsSet;
    @Nullable Optional<List<Patient_Link>> link = Optional.empty();
    boolean linkIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<String> deceasedDateTime = Optional.empty();
    boolean deceasedDateTimeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<HumanName>> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<CodeableConcept> maritalStatus = Optional.empty();
    boolean maritalStatusIsSet;
    @Nullable Optional<List<Address>> address = Optional.empty();
    boolean addressIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Boolean> deceasedBoolean = Optional.empty();
    boolean deceasedBooleanIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("generalPractitioner")
    public void setGeneralPractitioner(Optional<List<Reference>> generalPractitioner) {
      this.generalPractitioner = generalPractitioner;
      this.generalPractitionerIsSet = true;
    }
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(Optional<Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @JsonProperty("multipleBirthBoolean")
    public void setMultipleBirthBoolean(Optional<Boolean> multipleBirthBoolean) {
      this.multipleBirthBoolean = multipleBirthBoolean;
      this.multipleBirthBooleanIsSet = true;
    }
    @JsonProperty("gender")
    public void setGender(Optional<PatientGender> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("photo")
    public void setPhoto(Optional<List<Attachment>> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @JsonProperty("birthDate")
    public void setBirthDate(Optional<Date> birthDate) {
      this.birthDate = birthDate;
      this.birthDateIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<Patient_Contact>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("multipleBirthInteger")
    public void setMultipleBirthInteger(Optional<Double> multipleBirthInteger) {
      this.multipleBirthInteger = multipleBirthInteger;
      this.multipleBirthIntegerIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("communication")
    public void setCommunication(Optional<List<Patient_Communication>> communication) {
      this.communication = communication;
      this.communicationIsSet = true;
    }
    @JsonProperty("link")
    public void setLink(Optional<List<Patient_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("deceasedDateTime")
    public void setDeceasedDateTime(Optional<String> deceasedDateTime) {
      this.deceasedDateTime = deceasedDateTime;
      this.deceasedDateTimeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<List<HumanName>> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("maritalStatus")
    public void setMaritalStatus(Optional<CodeableConcept> maritalStatus) {
      this.maritalStatus = maritalStatus;
      this.maritalStatusIsSet = true;
    }
    @JsonProperty("address")
    public void setAddress(Optional<List<Address>> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("deceasedBoolean")
    public void setDeceasedBoolean(Optional<Boolean> deceasedBoolean) {
      this.deceasedBoolean = deceasedBoolean;
      this.deceasedBooleanIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> generalPractitioner() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> multipleBirthBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PatientGender> gender() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Attachment>> photo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> birthDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Patient_Contact>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> multipleBirthInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Patient_Communication>> communication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Patient_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> deceasedDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<HumanName>> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> maritalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Address>> address() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> deceasedBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePatient fromJson(Json json) {
    ImmutablePatient.Builder builder = ((ImmutablePatient.Builder) ImmutablePatient.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.generalPractitionerIsSet) {
      builder.generalPractitioner(json.generalPractitioner);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.multipleBirthBooleanIsSet) {
      builder.multipleBirthBoolean(json.multipleBirthBoolean);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.birthDateIsSet) {
      builder.birthDate(json.birthDate);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.multipleBirthIntegerIsSet) {
      builder.multipleBirthInteger(json.multipleBirthInteger);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.communicationIsSet) {
      builder.communication(json.communication);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.deceasedDateTimeIsSet) {
      builder.deceasedDateTime(json.deceasedDateTime);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.maritalStatusIsSet) {
      builder.maritalStatus(json.maritalStatus);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.deceasedBooleanIsSet) {
      builder.deceasedBoolean(json.deceasedBoolean);
    }
    if (json.textIsSet) {
      builder.text(json.text);
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
        .modifierExtension(instance.modifierExtension())
        .generalPractitioner(instance.generalPractitioner())
        .managingOrganization(instance.managingOrganization())
        .multipleBirthBoolean(instance.multipleBirthBoolean())
        .gender(instance.gender())
        .telecom(instance.telecom())
        .implicitRules(instance.implicitRules())
        .photo(instance.photo())
        .birthDate(instance.birthDate())
        .contact(instance.contact())
        .multipleBirthInteger(instance.multipleBirthInteger())
        .extension(instance.extension())
        .active(instance.active())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .communication(instance.communication())
        .link(instance.link())
        .contained(instance.contained())
        .deceasedDateTime(instance.deceasedDateTime())
        .language(instance.language())
        .meta(instance.meta())
        .name(instance.name())
        .maritalStatus(instance.maritalStatus())
        .address(instance.address())
        .identifier(instance.identifier())
        .deceasedBoolean(instance.deceasedBoolean())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link Patient Patient}.
   * <pre>
   * ImmutablePatient.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Patient#modifierExtension() modifierExtension}
   *    .generalPractitioner(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Patient#generalPractitioner() generalPractitioner}
   *    .managingOrganization(com.fhir.types.fhir.Reference) // optional {@link Patient#managingOrganization() managingOrganization}
   *    .multipleBirthBoolean(Boolean) // optional {@link Patient#multipleBirthBoolean() multipleBirthBoolean}
   *    .gender(com.fhir.types.fhir.PatientGender) // optional {@link Patient#gender() gender}
   *    .telecom(List&amp;lt;com.fhir.types.fhir.ContactPoint&amp;gt;) // optional {@link Patient#telecom() telecom}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Patient#implicitRules() implicitRules}
   *    .photo(List&amp;lt;com.fhir.types.fhir.Attachment&amp;gt;) // optional {@link Patient#photo() photo}
   *    .birthDate(com.fhir.types.fhir.Date) // optional {@link Patient#birthDate() birthDate}
   *    .contact(List&amp;lt;com.fhir.types.fhir.Patient_Contact&amp;gt;) // optional {@link Patient#contact() contact}
   *    .multipleBirthInteger(Double) // optional {@link Patient#multipleBirthInteger() multipleBirthInteger}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Patient#extension() extension}
   *    .active(Boolean) // optional {@link Patient#active() active}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Patient#id() id}
   *    .resourceType(String) // required {@link Patient#resourceType() resourceType}
   *    .communication(List&amp;lt;com.fhir.types.fhir.Patient_Communication&amp;gt;) // optional {@link Patient#communication() communication}
   *    .link(List&amp;lt;com.fhir.types.fhir.Patient_Link&amp;gt;) // optional {@link Patient#link() link}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Patient#contained() contained}
   *    .deceasedDateTime(String) // optional {@link Patient#deceasedDateTime() deceasedDateTime}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Patient#language() language}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Patient#meta() meta}
   *    .name(List&amp;lt;com.fhir.types.fhir.HumanName&amp;gt;) // optional {@link Patient#name() name}
   *    .maritalStatus(com.fhir.types.fhir.CodeableConcept) // optional {@link Patient#maritalStatus() maritalStatus}
   *    .address(List&amp;lt;com.fhir.types.fhir.Address&amp;gt;) // optional {@link Patient#address() address}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Patient#identifier() identifier}
   *    .deceasedBoolean(Boolean) // optional {@link Patient#deceasedBoolean() deceasedBoolean}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Patient#text() text}
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
  @Generated(from = "Patient", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_GENERAL_PRACTITIONER = 0x2L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x4L;
    private static final long OPT_BIT_MULTIPLE_BIRTH_BOOLEAN = 0x8L;
    private static final long OPT_BIT_GENDER = 0x10L;
    private static final long OPT_BIT_TELECOM = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_PHOTO = 0x80L;
    private static final long OPT_BIT_BIRTH_DATE = 0x100L;
    private static final long OPT_BIT_CONTACT = 0x200L;
    private static final long OPT_BIT_MULTIPLE_BIRTH_INTEGER = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_ACTIVE = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_COMMUNICATION = 0x4000L;
    private static final long OPT_BIT_LINK = 0x8000L;
    private static final long OPT_BIT_CONTAINED = 0x10000L;
    private static final long OPT_BIT_DECEASED_DATE_TIME = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_NAME = 0x100000L;
    private static final long OPT_BIT_MARITAL_STATUS = 0x200000L;
    private static final long OPT_BIT_ADDRESS = 0x400000L;
    private static final long OPT_BIT_IDENTIFIER = 0x800000L;
    private static final long OPT_BIT_DECEASED_BOOLEAN = 0x1000000L;
    private static final long OPT_BIT_TEXT = 0x2000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> generalPractitioner;
    private @Nullable Reference managingOrganization;
    private @Nullable Boolean multipleBirthBoolean;
    private @Nullable PatientGender gender;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable Uri implicitRules;
    private @Nullable List<Attachment> photo;
    private @Nullable Date birthDate;
    private @Nullable List<Patient_Contact> contact;
    private @Nullable Double multipleBirthInteger;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean active;
    private @Nullable Id id;
    private @Nullable String resourceType;
    private @Nullable List<Patient_Communication> communication;
    private @Nullable List<Patient_Link> link;
    private @Nullable List<ResourceList> contained;
    private @Nullable String deceasedDateTime;
    private @Nullable Code language;
    private @Nullable Meta meta;
    private @Nullable List<HumanName> name;
    private @Nullable CodeableConcept maritalStatus;
    private @Nullable List<Address> address;
    private @Nullable List<Identifier> identifier;
    private @Nullable Boolean deceasedBoolean;
    private @Nullable Narrative text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Patient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#generalPractitioner() generalPractitioner} to generalPractitioner.
     * @param generalPractitioner The value for generalPractitioner
     * @return {@code this} builder for chained invocation
     */
    public final Builder generalPractitioner(List<Reference> generalPractitioner) {
      checkNotIsSet(generalPractitionerIsSet(), "generalPractitioner");
      this.generalPractitioner = Objects.requireNonNull(generalPractitioner, "generalPractitioner");
      optBits |= OPT_BIT_GENERAL_PRACTITIONER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#generalPractitioner() generalPractitioner} to generalPractitioner.
     * @param generalPractitioner The value for generalPractitioner
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("generalPractitioner")
    public final Builder generalPractitioner(Optional<? extends List<Reference>> generalPractitioner) {
      checkNotIsSet(generalPractitionerIsSet(), "generalPractitioner");
      this.generalPractitioner = generalPractitioner.orElse(null);
      optBits |= OPT_BIT_GENERAL_PRACTITIONER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder managingOrganization(Reference managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = Objects.requireNonNull(managingOrganization, "managingOrganization");
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("managingOrganization")
    public final Builder managingOrganization(Optional<? extends Reference> managingOrganization) {
      checkNotIsSet(managingOrganizationIsSet(), "managingOrganization");
      this.managingOrganization = managingOrganization.orElse(null);
      optBits |= OPT_BIT_MANAGING_ORGANIZATION;
      return this;
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
    @JsonProperty("multipleBirthBoolean")
    public final Builder multipleBirthBoolean(Optional<Boolean> multipleBirthBoolean) {
      checkNotIsSet(multipleBirthBooleanIsSet(), "multipleBirthBoolean");
      this.multipleBirthBoolean = multipleBirthBoolean.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_BIRTH_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(PatientGender gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gender")
    public final Builder gender(Optional<? extends PatientGender> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    public final Builder telecom(List<ContactPoint> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = Objects.requireNonNull(telecom, "telecom");
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("telecom")
    public final Builder telecom(Optional<? extends List<ContactPoint>> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = telecom.orElse(null);
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    public final Builder photo(List<Attachment> photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = Objects.requireNonNull(photo, "photo");
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("photo")
    public final Builder photo(Optional<? extends List<Attachment>> photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = photo.orElse(null);
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder birthDate(Date birthDate) {
      checkNotIsSet(birthDateIsSet(), "birthDate");
      this.birthDate = Objects.requireNonNull(birthDate, "birthDate");
      optBits |= OPT_BIT_BIRTH_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("birthDate")
    public final Builder birthDate(Optional<? extends Date> birthDate) {
      checkNotIsSet(birthDateIsSet(), "birthDate");
      this.birthDate = birthDate.orElse(null);
      optBits |= OPT_BIT_BIRTH_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<Patient_Contact> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<Patient_Contact>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
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
    @JsonProperty("multipleBirthInteger")
    public final Builder multipleBirthInteger(Optional<Double> multipleBirthInteger) {
      checkNotIsSet(multipleBirthIntegerIsSet(), "multipleBirthInteger");
      this.multipleBirthInteger = multipleBirthInteger.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_BIRTH_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
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
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Patient#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    public final Builder communication(List<Patient_Communication> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = Objects.requireNonNull(communication, "communication");
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("communication")
    public final Builder communication(Optional<? extends List<Patient_Communication>> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = communication.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(List<Patient_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Optional<? extends List<Patient_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#deceasedDateTime() deceasedDateTime} to deceasedDateTime.
     * @param deceasedDateTime The value for deceasedDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder deceasedDateTime(String deceasedDateTime) {
      checkNotIsSet(deceasedDateTimeIsSet(), "deceasedDateTime");
      this.deceasedDateTime = Objects.requireNonNull(deceasedDateTime, "deceasedDateTime");
      optBits |= OPT_BIT_DECEASED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#deceasedDateTime() deceasedDateTime} to deceasedDateTime.
     * @param deceasedDateTime The value for deceasedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deceasedDateTime")
    public final Builder deceasedDateTime(Optional<String> deceasedDateTime) {
      checkNotIsSet(deceasedDateTimeIsSet(), "deceasedDateTime");
      this.deceasedDateTime = deceasedDateTime.orElse(null);
      optBits |= OPT_BIT_DECEASED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(List<HumanName> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends List<HumanName>> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#maritalStatus() maritalStatus} to maritalStatus.
     * @param maritalStatus The value for maritalStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder maritalStatus(CodeableConcept maritalStatus) {
      checkNotIsSet(maritalStatusIsSet(), "maritalStatus");
      this.maritalStatus = Objects.requireNonNull(maritalStatus, "maritalStatus");
      optBits |= OPT_BIT_MARITAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#maritalStatus() maritalStatus} to maritalStatus.
     * @param maritalStatus The value for maritalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maritalStatus")
    public final Builder maritalStatus(Optional<? extends CodeableConcept> maritalStatus) {
      checkNotIsSet(maritalStatusIsSet(), "maritalStatus");
      this.maritalStatus = maritalStatus.orElse(null);
      optBits |= OPT_BIT_MARITAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(List<Address> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = Objects.requireNonNull(address, "address");
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("address")
    public final Builder address(Optional<? extends List<Address>> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = address.orElse(null);
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
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
    @JsonProperty("deceasedBoolean")
    public final Builder deceasedBoolean(Optional<Boolean> deceasedBoolean) {
      checkNotIsSet(deceasedBooleanIsSet(), "deceasedBoolean");
      this.deceasedBoolean = deceasedBoolean.orElse(null);
      optBits |= OPT_BIT_DECEASED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Builds a new {@link Patient Patient}.
     * @return An immutable instance of Patient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Patient build() {
      checkRequiredAttributes();
      return new ImmutablePatient(
          modifierExtension,
          generalPractitioner,
          managingOrganization,
          multipleBirthBoolean,
          gender,
          telecom,
          implicitRules,
          photo,
          birthDate,
          contact,
          multipleBirthInteger,
          extension,
          active,
          id,
          resourceType,
          communication,
          link,
          contained,
          deceasedDateTime,
          language,
          meta,
          name,
          maritalStatus,
          address,
          identifier,
          deceasedBoolean,
          text);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean generalPractitionerIsSet() {
      return (optBits & OPT_BIT_GENERAL_PRACTITIONER) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean multipleBirthBooleanIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_BIRTH_BOOLEAN) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean birthDateIsSet() {
      return (optBits & OPT_BIT_BIRTH_DATE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean multipleBirthIntegerIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_BIRTH_INTEGER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean communicationIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean deceasedDateTimeIsSet() {
      return (optBits & OPT_BIT_DECEASED_DATE_TIME) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean maritalStatusIsSet() {
      return (optBits & OPT_BIT_MARITAL_STATUS) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean deceasedBooleanIsSet() {
      return (optBits & OPT_BIT_DECEASED_BOOLEAN) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Patient is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Patient, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Patient", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Patient#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Patient", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Patient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Patient#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Patient#generalPractitioner() generalPractitioner} to generalPractitioner.
     * @param generalPractitioner The value for generalPractitioner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal generalPractitioner(List<Reference> generalPractitioner);

    /**
     * Initializes the optional value {@link Patient#generalPractitioner() generalPractitioner} to generalPractitioner.
     * @param generalPractitioner The value for generalPractitioner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal generalPractitioner(Optional<? extends List<Reference>> generalPractitioner);

    /**
     * Initializes the optional value {@link Patient#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(Reference managingOrganization);

    /**
     * Initializes the optional value {@link Patient#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(Optional<? extends Reference> managingOrganization);

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
    BuildFinal multipleBirthBoolean(Optional<Boolean> multipleBirthBoolean);

    /**
     * Initializes the optional value {@link Patient#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal gender(PatientGender gender);

    /**
     * Initializes the optional value {@link Patient#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal gender(Optional<? extends PatientGender> gender);

    /**
     * Initializes the optional value {@link Patient#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Patient#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link Patient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Patient#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Patient#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal photo(List<Attachment> photo);

    /**
     * Initializes the optional value {@link Patient#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal photo(Optional<? extends List<Attachment>> photo);

    /**
     * Initializes the optional value {@link Patient#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal birthDate(Date birthDate);

    /**
     * Initializes the optional value {@link Patient#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal birthDate(Optional<? extends Date> birthDate);

    /**
     * Initializes the optional value {@link Patient#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<Patient_Contact> contact);

    /**
     * Initializes the optional value {@link Patient#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<Patient_Contact>> contact);

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
    BuildFinal multipleBirthInteger(Optional<Double> multipleBirthInteger);

    /**
     * Initializes the optional value {@link Patient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Patient#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

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
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link Patient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Patient#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Patient#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal communication(List<Patient_Communication> communication);

    /**
     * Initializes the optional value {@link Patient#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal communication(Optional<? extends List<Patient_Communication>> communication);

    /**
     * Initializes the optional value {@link Patient#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(List<Patient_Link> link);

    /**
     * Initializes the optional value {@link Patient#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(Optional<? extends List<Patient_Link>> link);

    /**
     * Initializes the optional value {@link Patient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Patient#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Patient#deceasedDateTime() deceasedDateTime} to deceasedDateTime.
     * @param deceasedDateTime The value for deceasedDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deceasedDateTime(String deceasedDateTime);

    /**
     * Initializes the optional value {@link Patient#deceasedDateTime() deceasedDateTime} to deceasedDateTime.
     * @param deceasedDateTime The value for deceasedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deceasedDateTime(Optional<String> deceasedDateTime);

    /**
     * Initializes the optional value {@link Patient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Patient#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Patient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Patient#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Patient#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(List<HumanName> name);

    /**
     * Initializes the optional value {@link Patient#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<? extends List<HumanName>> name);

    /**
     * Initializes the optional value {@link Patient#maritalStatus() maritalStatus} to maritalStatus.
     * @param maritalStatus The value for maritalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal maritalStatus(CodeableConcept maritalStatus);

    /**
     * Initializes the optional value {@link Patient#maritalStatus() maritalStatus} to maritalStatus.
     * @param maritalStatus The value for maritalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal maritalStatus(Optional<? extends CodeableConcept> maritalStatus);

    /**
     * Initializes the optional value {@link Patient#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(List<Address> address);

    /**
     * Initializes the optional value {@link Patient#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(Optional<? extends List<Address>> address);

    /**
     * Initializes the optional value {@link Patient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Patient#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

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
    BuildFinal deceasedBoolean(Optional<Boolean> deceasedBoolean);

    /**
     * Initializes the optional value {@link Patient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Patient#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Builds a new {@link Patient Patient}.
     * @return An immutable instance of Patient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Patient build();
  }
}
