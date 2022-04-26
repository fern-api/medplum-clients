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
 * Immutable implementation of {@link RelatedPerson}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRelatedPerson.builder()}.
 */
@Generated(from = "RelatedPerson", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRelatedPerson implements RelatedPerson {
  private final String resourceType;
  private final @Nullable Uri implicitRules;
  private final Reference patient;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> relationship;
  private final @Nullable List<RelatedPerson_Communication> communication;
  private final @Nullable List<Address> address;
  private final @Nullable Narrative text;
  private final @Nullable List<Attachment> photo;
  private final @Nullable Boolean active;
  private final @Nullable List<HumanName> name;
  private final @Nullable Period period;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable RelatedpersonGender gender;
  private final @Nullable Code language;
  private final @Nullable Id id;
  private final @Nullable Date birthDate;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Meta meta;

  private ImmutableRelatedPerson(
      String resourceType,
      @Nullable Uri implicitRules,
      Reference patient,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> relationship,
      @Nullable List<RelatedPerson_Communication> communication,
      @Nullable List<Address> address,
      @Nullable Narrative text,
      @Nullable List<Attachment> photo,
      @Nullable Boolean active,
      @Nullable List<HumanName> name,
      @Nullable Period period,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable RelatedpersonGender gender,
      @Nullable Code language,
      @Nullable Id id,
      @Nullable Date birthDate,
      @Nullable List<ContactPoint> telecom,
      @Nullable List<Identifier> identifier,
      @Nullable Meta meta) {
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.patient = patient;
    this.modifierExtension = modifierExtension;
    this.relationship = relationship;
    this.communication = communication;
    this.address = address;
    this.text = text;
    this.photo = photo;
    this.active = active;
    this.name = name;
    this.period = period;
    this.contained = contained;
    this.extension = extension;
    this.gender = gender;
    this.language = language;
    this.id = id;
    this.birthDate = birthDate;
    this.telecom = telecom;
    this.identifier = identifier;
    this.meta = meta;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
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
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public Optional<List<CodeableConcept>> relationship() {
    return Optional.ofNullable(relationship);
  }

  /**
   * @return The value of the {@code communication} attribute
   */
  @JsonProperty("communication")
  @Override
  public Optional<List<RelatedPerson_Communication>> communication() {
    return Optional.ofNullable(communication);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<List<HumanName>> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code gender} attribute
   */
  @JsonProperty("gender")
  @Override
  public Optional<RelatedpersonGender> gender() {
    return Optional.ofNullable(gender);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code telecom} attribute
   */
  @JsonProperty("telecom")
  @Override
  public Optional<List<ContactPoint>> telecom() {
    return Optional.ofNullable(telecom);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RelatedPerson#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRelatedPerson withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableRelatedPerson(
        newValue,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        newValue,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        value,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RelatedPerson#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRelatedPerson withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        newValue,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        value,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withRelationship(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        newValue,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withRelationship(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        value,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#communication() communication} attribute.
   * @param value The value for communication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withCommunication(List<RelatedPerson_Communication> value) {
    @Nullable List<RelatedPerson_Communication> newValue = Objects.requireNonNull(value, "communication");
    if (this.communication == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        newValue,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#communication() communication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withCommunication(Optional<? extends List<RelatedPerson_Communication>> optional) {
    @Nullable List<RelatedPerson_Communication> value = optional.orElse(null);
    if (this.communication == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        value,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withAddress(List<Address> value) {
    @Nullable List<Address> newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        newValue,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withAddress(Optional<? extends List<Address>> optional) {
    @Nullable List<Address> value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        value,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        newValue,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        value,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withPhoto(List<Attachment> value) {
    @Nullable List<Attachment> newValue = Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        newValue,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withPhoto(Optional<? extends List<Attachment>> optional) {
    @Nullable List<Attachment> value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        value,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        newValue,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        value,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withName(List<HumanName> value) {
    @Nullable List<HumanName> newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        newValue,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withName(Optional<? extends List<HumanName>> optional) {
    @Nullable List<HumanName> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        value,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        newValue,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        value,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        newValue,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        value,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        newValue,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        value,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withGender(RelatedpersonGender value) {
    @Nullable RelatedpersonGender newValue = Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        newValue,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withGender(Optional<? extends RelatedpersonGender> optional) {
    @Nullable RelatedpersonGender value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        value,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        newValue,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        value,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        newValue,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        value,
        this.birthDate,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#birthDate() birthDate} attribute.
   * @param value The value for birthDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withBirthDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "birthDate");
    if (this.birthDate == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        newValue,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#birthDate() birthDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for birthDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withBirthDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.birthDate == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        value,
        this.telecom,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        newValue,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        value,
        this.identifier,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        newValue,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        value,
        this.meta);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedPerson#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedPerson withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedPerson#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedPerson withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableRelatedPerson(
        this.resourceType,
        this.implicitRules,
        this.patient,
        this.modifierExtension,
        this.relationship,
        this.communication,
        this.address,
        this.text,
        this.photo,
        this.active,
        this.name,
        this.period,
        this.contained,
        this.extension,
        this.gender,
        this.language,
        this.id,
        this.birthDate,
        this.telecom,
        this.identifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRelatedPerson} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRelatedPerson
        && equalTo((ImmutableRelatedPerson) another);
  }

  private boolean equalTo(ImmutableRelatedPerson another) {
    return resourceType.equals(another.resourceType)
        && Objects.equals(implicitRules, another.implicitRules)
        && patient.equals(another.patient)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(relationship, another.relationship)
        && Objects.equals(communication, another.communication)
        && Objects.equals(address, another.address)
        && Objects.equals(text, another.text)
        && Objects.equals(photo, another.photo)
        && Objects.equals(active, another.active)
        && Objects.equals(name, another.name)
        && Objects.equals(period, another.period)
        && Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(gender, another.gender)
        && Objects.equals(language, another.language)
        && Objects.equals(id, another.id)
        && Objects.equals(birthDate, another.birthDate)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(meta, another.meta);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code implicitRules}, {@code patient}, {@code modifierExtension}, {@code relationship}, {@code communication}, {@code address}, {@code text}, {@code photo}, {@code active}, {@code name}, {@code period}, {@code contained}, {@code extension}, {@code gender}, {@code language}, {@code id}, {@code birthDate}, {@code telecom}, {@code identifier}, {@code meta}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(relationship);
    h += (h << 5) + Objects.hashCode(communication);
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(photo);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(gender);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(birthDate);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(meta);
    return h;
  }

  /**
   * Prints the immutable value {@code RelatedPerson} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RelatedPerson{");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (relationship != null) {
      builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (communication != null) {
      builder.append(", ");
      builder.append("communication=").append(communication);
    }
    if (address != null) {
      builder.append(", ");
      builder.append("address=").append(address);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (photo != null) {
      builder.append(", ");
      builder.append("photo=").append(photo);
    }
    if (active != null) {
      builder.append(", ");
      builder.append("active=").append(active);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (gender != null) {
      builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (birthDate != null) {
      builder.append(", ");
      builder.append("birthDate=").append(birthDate);
    }
    if (telecom != null) {
      builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RelatedPerson", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RelatedPerson {
    @Nullable String resourceType;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Reference patient;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> relationship = Optional.empty();
    boolean relationshipIsSet;
    @Nullable Optional<List<RelatedPerson_Communication>> communication = Optional.empty();
    boolean communicationIsSet;
    @Nullable Optional<List<Address>> address = Optional.empty();
    boolean addressIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Attachment>> photo = Optional.empty();
    boolean photoIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<List<HumanName>> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<RelatedpersonGender> gender = Optional.empty();
    boolean genderIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Date> birthDate = Optional.empty();
    boolean birthDateIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("relationship")
    public void setRelationship(Optional<List<CodeableConcept>> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @JsonProperty("communication")
    public void setCommunication(Optional<List<RelatedPerson_Communication>> communication) {
      this.communication = communication;
      this.communicationIsSet = true;
    }
    @JsonProperty("address")
    public void setAddress(Optional<List<Address>> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
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
    @JsonProperty("name")
    public void setName(Optional<List<HumanName>> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("gender")
    public void setGender(Optional<RelatedpersonGender> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("birthDate")
    public void setBirthDate(Optional<Date> birthDate) {
      this.birthDate = birthDate;
      this.birthDateIsSet = true;
    }
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedPerson_Communication>> communication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Address>> address() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Attachment>> photo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<HumanName>> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<RelatedpersonGender> gender() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> birthDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRelatedPerson fromJson(Json json) {
    ImmutableRelatedPerson.Builder builder = ((ImmutableRelatedPerson.Builder) ImmutableRelatedPerson.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.communicationIsSet) {
      builder.communication(json.communication);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.birthDateIsSet) {
      builder.birthDate(json.birthDate);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    return (ImmutableRelatedPerson) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RelatedPerson} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RelatedPerson instance
   */
  public static RelatedPerson copyOf(RelatedPerson instance) {
    if (instance instanceof ImmutableRelatedPerson) {
      return (ImmutableRelatedPerson) instance;
    }
    return ((ImmutableRelatedPerson.Builder) ImmutableRelatedPerson.builder())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .patient(instance.patient())
        .modifierExtension(instance.modifierExtension())
        .relationship(instance.relationship())
        .communication(instance.communication())
        .address(instance.address())
        .text(instance.text())
        .photo(instance.photo())
        .active(instance.active())
        .name(instance.name())
        .period(instance.period())
        .contained(instance.contained())
        .extension(instance.extension())
        .gender(instance.gender())
        .language(instance.language())
        .id(instance.id())
        .birthDate(instance.birthDate())
        .telecom(instance.telecom())
        .identifier(instance.identifier())
        .meta(instance.meta())
        .build();
  }

  /**
   * Creates a builder for {@link RelatedPerson RelatedPerson}.
   * <pre>
   * ImmutableRelatedPerson.builder()
   *    .resourceType(String) // required {@link RelatedPerson#resourceType() resourceType}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link RelatedPerson#implicitRules() implicitRules}
   *    .patient(com.medplum.types.fhir.Reference) // required {@link RelatedPerson#patient() patient}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RelatedPerson#modifierExtension() modifierExtension}
   *    .relationship(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link RelatedPerson#relationship() relationship}
   *    .communication(List&amp;lt;com.medplum.types.fhir.RelatedPerson_Communication&amp;gt;) // optional {@link RelatedPerson#communication() communication}
   *    .address(List&amp;lt;com.medplum.types.fhir.Address&amp;gt;) // optional {@link RelatedPerson#address() address}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link RelatedPerson#text() text}
   *    .photo(List&amp;lt;com.medplum.types.fhir.Attachment&amp;gt;) // optional {@link RelatedPerson#photo() photo}
   *    .active(Boolean) // optional {@link RelatedPerson#active() active}
   *    .name(List&amp;lt;com.medplum.types.fhir.HumanName&amp;gt;) // optional {@link RelatedPerson#name() name}
   *    .period(com.medplum.types.fhir.Period) // optional {@link RelatedPerson#period() period}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link RelatedPerson#contained() contained}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RelatedPerson#extension() extension}
   *    .gender(com.medplum.types.fhir.RelatedpersonGender) // optional {@link RelatedPerson#gender() gender}
   *    .language(com.medplum.types.fhir.Code) // optional {@link RelatedPerson#language() language}
   *    .id(com.medplum.types.fhir.Id) // optional {@link RelatedPerson#id() id}
   *    .birthDate(com.medplum.types.fhir.Date) // optional {@link RelatedPerson#birthDate() birthDate}
   *    .telecom(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link RelatedPerson#telecom() telecom}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link RelatedPerson#identifier() identifier}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link RelatedPerson#meta() meta}
   *    .build();
   * </pre>
   * @return A new RelatedPerson builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableRelatedPerson.Builder();
  }

  /**
   * Builds instances of type {@link RelatedPerson RelatedPerson}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RelatedPerson", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_RELATIONSHIP = 0x4L;
    private static final long OPT_BIT_COMMUNICATION = 0x8L;
    private static final long OPT_BIT_ADDRESS = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_PHOTO = 0x40L;
    private static final long OPT_BIT_ACTIVE = 0x80L;
    private static final long OPT_BIT_NAME = 0x100L;
    private static final long OPT_BIT_PERIOD = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_GENDER = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_BIRTH_DATE = 0x8000L;
    private static final long OPT_BIT_TELECOM = 0x10000L;
    private static final long OPT_BIT_IDENTIFIER = 0x20000L;
    private static final long OPT_BIT_META = 0x40000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable String resourceType;
    private @Nullable Uri implicitRules;
    private @Nullable Reference patient;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> relationship;
    private @Nullable List<RelatedPerson_Communication> communication;
    private @Nullable List<Address> address;
    private @Nullable Narrative text;
    private @Nullable List<Attachment> photo;
    private @Nullable Boolean active;
    private @Nullable List<HumanName> name;
    private @Nullable Period period;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable RelatedpersonGender gender;
    private @Nullable Code language;
    private @Nullable Id id;
    private @Nullable Date birthDate;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable List<Identifier> identifier;
    private @Nullable Meta meta;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link RelatedPerson#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link RelatedPerson#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RelatedPerson#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link RelatedPerson#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RelatedPerson#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RelatedPerson#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(List<CodeableConcept> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(Optional<? extends List<CodeableConcept>> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    public final Builder communication(List<RelatedPerson_Communication> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = Objects.requireNonNull(communication, "communication");
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("communication")
    public final Builder communication(Optional<? extends List<RelatedPerson_Communication>> communication) {
      checkNotIsSet(communicationIsSet(), "communication");
      this.communication = communication.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson#address() address} to address.
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
     * Initializes the optional value {@link RelatedPerson#address() address} to address.
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
     * Initializes the optional value {@link RelatedPerson#text() text} to text.
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
     * Initializes the optional value {@link RelatedPerson#text() text} to text.
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
     * Initializes the optional value {@link RelatedPerson#photo() photo} to photo.
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
     * Initializes the optional value {@link RelatedPerson#photo() photo} to photo.
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
     * Initializes the optional value {@link RelatedPerson#active() active} to active.
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
     * Initializes the optional value {@link RelatedPerson#active() active} to active.
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
     * Initializes the optional value {@link RelatedPerson#name() name} to name.
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
     * Initializes the optional value {@link RelatedPerson#name() name} to name.
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
     * Initializes the optional value {@link RelatedPerson#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson#contained() contained} to contained.
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
     * Initializes the optional value {@link RelatedPerson#contained() contained} to contained.
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
     * Initializes the optional value {@link RelatedPerson#extension() extension} to extension.
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
     * Initializes the optional value {@link RelatedPerson#extension() extension} to extension.
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
     * Initializes the optional value {@link RelatedPerson#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(RelatedpersonGender gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gender")
    public final Builder gender(Optional<? extends RelatedpersonGender> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedPerson#language() language} to language.
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
     * Initializes the optional value {@link RelatedPerson#language() language} to language.
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
     * Initializes the optional value {@link RelatedPerson#id() id} to id.
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
     * Initializes the optional value {@link RelatedPerson#id() id} to id.
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
     * Initializes the optional value {@link RelatedPerson#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link RelatedPerson#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link RelatedPerson#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link RelatedPerson#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link RelatedPerson#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RelatedPerson#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RelatedPerson#meta() meta} to meta.
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
     * Initializes the optional value {@link RelatedPerson#meta() meta} to meta.
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
     * Builds a new {@link RelatedPerson RelatedPerson}.
     * @return An immutable instance of RelatedPerson
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RelatedPerson build() {
      checkRequiredAttributes();
      return new ImmutableRelatedPerson(
          resourceType,
          implicitRules,
          patient,
          modifierExtension,
          relationship,
          communication,
          address,
          text,
          photo,
          active,
          name,
          period,
          contained,
          extension,
          gender,
          language,
          id,
          birthDate,
          telecom,
          identifier,
          meta);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean communicationIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean birthDateIsSet() {
      return (optBits & OPT_BIT_BIRTH_DATE) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RelatedPerson is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build RelatedPerson, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "RelatedPerson", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link RelatedPerson#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "RelatedPerson", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link RelatedPerson#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Reference patient);
  }

  @Generated(from = "RelatedPerson", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link RelatedPerson#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link RelatedPerson#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link RelatedPerson#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link RelatedPerson#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link RelatedPerson#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relationship(List<CodeableConcept> relationship);

    /**
     * Initializes the optional value {@link RelatedPerson#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relationship(Optional<? extends List<CodeableConcept>> relationship);

    /**
     * Initializes the optional value {@link RelatedPerson#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal communication(List<RelatedPerson_Communication> communication);

    /**
     * Initializes the optional value {@link RelatedPerson#communication() communication} to communication.
     * @param communication The value for communication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal communication(Optional<? extends List<RelatedPerson_Communication>> communication);

    /**
     * Initializes the optional value {@link RelatedPerson#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(List<Address> address);

    /**
     * Initializes the optional value {@link RelatedPerson#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(Optional<? extends List<Address>> address);

    /**
     * Initializes the optional value {@link RelatedPerson#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link RelatedPerson#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link RelatedPerson#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal photo(List<Attachment> photo);

    /**
     * Initializes the optional value {@link RelatedPerson#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal photo(Optional<? extends List<Attachment>> photo);

    /**
     * Initializes the optional value {@link RelatedPerson#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link RelatedPerson#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link RelatedPerson#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(List<HumanName> name);

    /**
     * Initializes the optional value {@link RelatedPerson#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<? extends List<HumanName>> name);

    /**
     * Initializes the optional value {@link RelatedPerson#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link RelatedPerson#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link RelatedPerson#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link RelatedPerson#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link RelatedPerson#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link RelatedPerson#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link RelatedPerson#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal gender(RelatedpersonGender gender);

    /**
     * Initializes the optional value {@link RelatedPerson#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal gender(Optional<? extends RelatedpersonGender> gender);

    /**
     * Initializes the optional value {@link RelatedPerson#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link RelatedPerson#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link RelatedPerson#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link RelatedPerson#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link RelatedPerson#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal birthDate(Date birthDate);

    /**
     * Initializes the optional value {@link RelatedPerson#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal birthDate(Optional<? extends Date> birthDate);

    /**
     * Initializes the optional value {@link RelatedPerson#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link RelatedPerson#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link RelatedPerson#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link RelatedPerson#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link RelatedPerson#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link RelatedPerson#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Builds a new {@link RelatedPerson RelatedPerson}.
     * @return An immutable instance of RelatedPerson
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    RelatedPerson build();
  }
}
