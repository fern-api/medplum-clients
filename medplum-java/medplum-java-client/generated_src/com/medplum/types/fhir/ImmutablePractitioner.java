package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Practitioner}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePractitioner.builder()}.
 */
@Generated(from = "Practitioner", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePractitioner implements Practitioner {
  private final @Nullable Meta meta;
  private final @Nullable Code language;
  private final @Nullable List<Attachment> photo;
  private final @Nullable Boolean active;
  private final @Nullable Narrative text;
  private final @Nullable PractitionerGender gender;
  private final @Nullable List<Practitioner_Qualification> qualification;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable Date birthDate;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<CodeableConcept> communication;
  private final String resourceType;
  private final @Nullable List<Address> address;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<HumanName> name;

  private ImmutablePractitioner(
      @Nullable Meta meta,
      @Nullable Code language,
      @Nullable List<Attachment> photo,
      @Nullable Boolean active,
      @Nullable Narrative text,
      @Nullable PractitionerGender gender,
      @Nullable List<Practitioner_Qualification> qualification,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      @Nullable List<ContactPoint> telecom,
      @Nullable Date birthDate,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable List<CodeableConcept> communication,
      String resourceType,
      @Nullable List<Address> address,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<HumanName> name) {
    this.meta = meta;
    this.language = language;
    this.photo = photo;
    this.active = active;
    this.text = text;
    this.gender = gender;
    this.qualification = qualification;
    this.identifier = identifier;
    this.id = id;
    this.telecom = telecom;
    this.birthDate = birthDate;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.communication = communication;
    this.resourceType = resourceType;
    this.address = address;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.name = name;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public Optional<Boolean> active() {
    return Optional.ofNullable(active);
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
   * @return The value of the {@code gender} attribute
   */
  @JsonProperty("gender")
  @Override
  public Optional<PractitionerGender> gender() {
    return Optional.ofNullable(gender);
  }

  /**
   * @return The value of the {@code qualification} attribute
   */
  @JsonProperty("qualification")
  @Override
  public Optional<List<Practitioner_Qualification>> qualification() {
    return Optional.ofNullable(qualification);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code birthDate} attribute
   */
  @JsonProperty("birthDate")
  @Override
  public Optional<Date> birthDate() {
    return Optional.ofNullable(birthDate);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code communication} attribute
   */
  @JsonProperty("communication")
  @Override
  public Optional<List<CodeableConcept>> communication() {
    return Optional.ofNullable(communication);
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
   * @return The value of the {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public Optional<List<Address>> address() {
    return Optional.ofNullable(address);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePractitioner(
        newValue,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePractitioner(
        value,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        newValue,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        value,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withPhoto(List<Attachment> value) {
    @Nullable List<Attachment> newValue = Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        newValue,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withPhoto(Optional<? extends List<Attachment>> optional) {
    @Nullable List<Attachment> value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        value,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        newValue,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        value,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        newValue,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        value,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withGender(PractitionerGender value) {
    @Nullable PractitionerGender newValue = Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        newValue,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withGender(Optional<? extends PractitionerGender> optional) {
    @Nullable PractitionerGender value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        value,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#qualification() qualification} attribute.
   * @param value The value for qualification
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withQualification(List<Practitioner_Qualification> value) {
    @Nullable List<Practitioner_Qualification> newValue = Objects.requireNonNull(value, "qualification");
    if (this.qualification == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        newValue,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#qualification() qualification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withQualification(Optional<? extends List<Practitioner_Qualification>> optional) {
    @Nullable List<Practitioner_Qualification> value = optional.orElse(null);
    if (this.qualification == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        value,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        newValue,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        value,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        newValue,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        value,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        newValue,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        value,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#birthDate() birthDate} attribute.
   * @param value The value for birthDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withBirthDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "birthDate");
    if (this.birthDate == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        newValue,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#birthDate() birthDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for birthDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withBirthDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.birthDate == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        value,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        newValue,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        value,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        newValue,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        value,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#communication() communication} attribute.
   * @param value The value for communication
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withCommunication(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "communication");
    if (this.communication == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        newValue,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#communication() communication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withCommunication(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.communication == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        value,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Practitioner#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePractitioner withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        newValue,
        this.address,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withAddress(List<Address> value) {
    @Nullable List<Address> newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        newValue,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withAddress(Optional<? extends List<Address>> optional) {
    @Nullable List<Address> value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        value,
        this.extension,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        newValue,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        value,
        this.modifierExtension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        newValue,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        value,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Practitioner#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePractitioner withName(List<HumanName> value) {
    @Nullable List<HumanName> newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Practitioner#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePractitioner withName(Optional<? extends List<HumanName>> optional) {
    @Nullable List<HumanName> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutablePractitioner(
        this.meta,
        this.language,
        this.photo,
        this.active,
        this.text,
        this.gender,
        this.qualification,
        this.identifier,
        this.id,
        this.telecom,
        this.birthDate,
        this.implicitRules,
        this.contained,
        this.communication,
        this.resourceType,
        this.address,
        this.extension,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePractitioner} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePractitioner
        && equalTo((ImmutablePractitioner) another);
  }

  private boolean equalTo(ImmutablePractitioner another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(language, another.language)
        && Objects.equals(photo, another.photo)
        && Objects.equals(active, another.active)
        && Objects.equals(text, another.text)
        && Objects.equals(gender, another.gender)
        && Objects.equals(qualification, another.qualification)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(birthDate, another.birthDate)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(communication, another.communication)
        && resourceType.equals(another.resourceType)
        && Objects.equals(address, another.address)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code language}, {@code photo}, {@code active}, {@code text}, {@code gender}, {@code qualification}, {@code identifier}, {@code id}, {@code telecom}, {@code birthDate}, {@code implicitRules}, {@code contained}, {@code communication}, {@code resourceType}, {@code address}, {@code extension}, {@code modifierExtension}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(photo);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(gender);
    h += (h << 5) + Objects.hashCode(qualification);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(birthDate);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(communication);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code Practitioner} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Practitioner{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (photo != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("photo=").append(photo);
    }
    if (active != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (text != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (gender != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (qualification != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("qualification=").append(qualification);
    }
    if (identifier != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (telecom != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (birthDate != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("birthDate=").append(birthDate);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (communication != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("communication=").append(communication);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (address != null) {
      builder.append(", ");
      builder.append("address=").append(address);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
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
  @Generated(from = "Practitioner", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Practitioner {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Attachment>> photo = Optional.empty();
    boolean photoIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<PractitionerGender> gender = Optional.empty();
    boolean genderIsSet;
    @Nullable Optional<List<Practitioner_Qualification>> qualification = Optional.empty();
    boolean qualificationIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<Date> birthDate = Optional.empty();
    boolean birthDateIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<CodeableConcept>> communication = Optional.empty();
    boolean communicationIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Address>> address = Optional.empty();
    boolean addressIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<HumanName>> name = Optional.empty();
    boolean nameIsSet;
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("photo")
    public void setPhoto(Optional<List<Attachment>> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("gender")
    public void setGender(Optional<PractitionerGender> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @JsonProperty("qualification")
    public void setQualification(Optional<List<Practitioner_Qualification>> qualification) {
      this.qualification = qualification;
      this.qualificationIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("birthDate")
    public void setBirthDate(Optional<Date> birthDate) {
      this.birthDate = birthDate;
      this.birthDateIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("communication")
    public void setCommunication(Optional<List<CodeableConcept>> communication) {
      this.communication = communication;
      this.communicationIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("address")
    public void setAddress(Optional<List<Address>> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<List<HumanName>> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Attachment>> photo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PractitionerGender> gender() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Practitioner_Qualification>> qualification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> birthDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> communication() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Address>> address() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<HumanName>> name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePractitioner fromJson(Json json) {
    ImmutablePractitioner.Builder builder = ((ImmutablePractitioner.Builder) ImmutablePractitioner.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.qualificationIsSet) {
      builder.qualification(json.qualification);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.birthDateIsSet) {
      builder.birthDate(json.birthDate);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.communicationIsSet) {
      builder.communication(json.communication);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
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
        .meta(instance.meta())
        .language(instance.language())
        .photo(instance.photo())
        .active(instance.active())
        .text(instance.text())
        .gender(instance.gender())
        .qualification(instance.qualification())
        .identifier(instance.identifier())
        .id(instance.id())
        .telecom(instance.telecom())
        .birthDate(instance.birthDate())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .communication(instance.communication())
        .resourceType(instance.resourceType())
        .address(instance.address())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .build();
  }

  /**
   * Creates a builder for {@link Practitioner Practitioner}.
   * <pre>
   * ImmutablePractitioner.builder()
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Practitioner#meta() meta}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Practitioner#language() language}
   *    .photo(List&amp;lt;com.medplum.types.fhir.Attachment&amp;gt;) // optional {@link Practitioner#photo() photo}
   *    .active(Boolean) // optional {@link Practitioner#active() active}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Practitioner#text() text}
   *    .gender(com.medplum.types.fhir.PractitionerGender) // optional {@link Practitioner#gender() gender}
   *    .qualification(List&amp;lt;com.medplum.types.fhir.Practitioner_Qualification&amp;gt;) // optional {@link Practitioner#qualification() qualification}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Practitioner#identifier() identifier}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Practitioner#id() id}
   *    .telecom(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link Practitioner#telecom() telecom}
   *    .birthDate(com.medplum.types.fhir.Date) // optional {@link Practitioner#birthDate() birthDate}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Practitioner#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Practitioner#contained() contained}
   *    .communication(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Practitioner#communication() communication}
   *    .resourceType(String) // required {@link Practitioner#resourceType() resourceType}
   *    .address(List&amp;lt;com.medplum.types.fhir.Address&amp;gt;) // optional {@link Practitioner#address() address}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Practitioner#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Practitioner#modifierExtension() modifierExtension}
   *    .name(List&amp;lt;com.medplum.types.fhir.HumanName&amp;gt;) // optional {@link Practitioner#name() name}
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
  @Generated(from = "Practitioner", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_PHOTO = 0x4L;
    private static final long OPT_BIT_ACTIVE = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_GENDER = 0x20L;
    private static final long OPT_BIT_QUALIFICATION = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_TELECOM = 0x200L;
    private static final long OPT_BIT_BIRTH_DATE = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_COMMUNICATION = 0x2000L;
    private static final long OPT_BIT_ADDRESS = 0x4000L;
    private static final long OPT_BIT_EXTENSION = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_NAME = 0x20000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable Code language;
    private @Nullable List<Attachment> photo;
    private @Nullable Boolean active;
    private @Nullable Narrative text;
    private @Nullable PractitionerGender gender;
    private @Nullable List<Practitioner_Qualification> qualification;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable Date birthDate;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<CodeableConcept> communication;
    private @Nullable String resourceType;
    private @Nullable List<Address> address;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<HumanName> name;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Practitioner#meta() meta} to meta.
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
     * Initializes the optional value {@link Practitioner#meta() meta} to meta.
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
     * Initializes the optional value {@link Practitioner#language() language} to language.
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
     * Initializes the optional value {@link Practitioner#language() language} to language.
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
     * Initializes the optional value {@link Practitioner#photo() photo} to photo.
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
     * Initializes the optional value {@link Practitioner#photo() photo} to photo.
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
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#text() text} to text.
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
     * Initializes the optional value {@link Practitioner#text() text} to text.
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
     * Initializes the optional value {@link Practitioner#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(PractitionerGender gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gender")
    public final Builder gender(Optional<? extends PractitionerGender> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualification(List<Practitioner_Qualification> qualification) {
      checkNotIsSet(qualificationIsSet(), "qualification");
      this.qualification = Objects.requireNonNull(qualification, "qualification");
      optBits |= OPT_BIT_QUALIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("qualification")
    public final Builder qualification(Optional<? extends List<Practitioner_Qualification>> qualification) {
      checkNotIsSet(qualificationIsSet(), "qualification");
      this.qualification = qualification.orElse(null);
      optBits |= OPT_BIT_QUALIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Practitioner#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Practitioner#id() id} to id.
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
     * Initializes the optional value {@link Practitioner#id() id} to id.
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
     * Initializes the optional value {@link Practitioner#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Practitioner#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Practitioner#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link Practitioner#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link Practitioner#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Practitioner#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Practitioner#contained() contained} to contained.
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
     * Initializes the optional value {@link Practitioner#contained() contained} to contained.
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
     * Initializes the optional value {@link Practitioner#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    public final Builder communication(List<CodeableConcept> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = Objects.requireNonNull(communication, "communication");
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Practitioner#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("communication")
    public final Builder communication(Optional<? extends List<CodeableConcept>> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = communication.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the value for the {@link Practitioner#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Practitioner#address() address} to address.
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
     * Initializes the optional value {@link Practitioner#address() address} to address.
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
     * Initializes the optional value {@link Practitioner#extension() extension} to extension.
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
     * Initializes the optional value {@link Practitioner#extension() extension} to extension.
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
     * Initializes the optional value {@link Practitioner#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Practitioner#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Practitioner#name() name} to name.
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
     * Initializes the optional value {@link Practitioner#name() name} to name.
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
     * Builds a new {@link Practitioner Practitioner}.
     * @return An immutable instance of Practitioner
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Practitioner build() {
      checkRequiredAttributes();
      return new ImmutablePractitioner(
          meta,
          language,
          photo,
          active,
          text,
          gender,
          qualification,
          identifier,
          id,
          telecom,
          birthDate,
          implicitRules,
          contained,
          communication,
          resourceType,
          address,
          extension,
          modifierExtension,
          name);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean qualificationIsSet() {
      return (optBits & OPT_BIT_QUALIFICATION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean birthDateIsSet() {
      return (optBits & OPT_BIT_BIRTH_DATE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean communicationIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Practitioner is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Practitioner, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Practitioner", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Practitioner#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Practitioner", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Practitioner#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Practitioner#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Practitioner#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Practitioner#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Practitioner#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal photo(List<Attachment> photo);

    /**
     * Initializes the optional value {@link Practitioner#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal photo(Optional<? extends List<Attachment>> photo);

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
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link Practitioner#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Practitioner#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Practitioner#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal gender(PractitionerGender gender);

    /**
     * Initializes the optional value {@link Practitioner#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal gender(Optional<? extends PractitionerGender> gender);

    /**
     * Initializes the optional value {@link Practitioner#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal qualification(List<Practitioner_Qualification> qualification);

    /**
     * Initializes the optional value {@link Practitioner#qualification() qualification} to qualification.
     * @param qualification The value for qualification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal qualification(Optional<? extends List<Practitioner_Qualification>> qualification);

    /**
     * Initializes the optional value {@link Practitioner#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Practitioner#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Practitioner#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Practitioner#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Practitioner#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Practitioner#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link Practitioner#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal birthDate(Date birthDate);

    /**
     * Initializes the optional value {@link Practitioner#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal birthDate(Optional<? extends Date> birthDate);

    /**
     * Initializes the optional value {@link Practitioner#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Practitioner#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Practitioner#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Practitioner#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Practitioner#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal communication(List<CodeableConcept> communication);

    /**
     * Initializes the optional value {@link Practitioner#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal communication(Optional<? extends List<CodeableConcept>> communication);

    /**
     * Initializes the optional value {@link Practitioner#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(List<Address> address);

    /**
     * Initializes the optional value {@link Practitioner#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(Optional<? extends List<Address>> address);

    /**
     * Initializes the optional value {@link Practitioner#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Practitioner#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Practitioner#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Practitioner#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Practitioner#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(List<HumanName> name);

    /**
     * Initializes the optional value {@link Practitioner#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<? extends List<HumanName>> name);

    /**
     * Builds a new {@link Practitioner Practitioner}.
     * @return An immutable instance of Practitioner
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Practitioner build();
  }
}
