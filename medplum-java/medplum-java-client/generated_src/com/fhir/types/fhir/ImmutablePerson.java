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
 * Immutable implementation of {@link Person}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson.builder()}.
 */
@Generated(from = "Person", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePerson implements Person {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Meta meta;
  private final @Nullable Boolean active;
  private final @Nullable Reference managingOrganization;
  private final @Nullable Id id;
  private final @Nullable List<Address> address;
  private final @Nullable Attachment photo;
  private final @Nullable List<Person_Link> link;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<HumanName> name;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable Date birthDate;
  private final @Nullable Narrative text;
  private final @Nullable PersonGender gender;
  private final String resourceType;

  private ImmutablePerson(
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable List<ContactPoint> telecom,
      @Nullable List<Extension> modifierExtension,
      @Nullable Meta meta,
      @Nullable Boolean active,
      @Nullable Reference managingOrganization,
      @Nullable Id id,
      @Nullable List<Address> address,
      @Nullable Attachment photo,
      @Nullable List<Person_Link> link,
      @Nullable List<Identifier> identifier,
      @Nullable List<HumanName> name,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable Date birthDate,
      @Nullable Narrative text,
      @Nullable PersonGender gender,
      String resourceType) {
    this.contained = contained;
    this.extension = extension;
    this.telecom = telecom;
    this.modifierExtension = modifierExtension;
    this.meta = meta;
    this.active = active;
    this.managingOrganization = managingOrganization;
    this.id = id;
    this.address = address;
    this.photo = photo;
    this.link = link;
    this.identifier = identifier;
    this.name = name;
    this.implicitRules = implicitRules;
    this.language = language;
    this.birthDate = birthDate;
    this.text = text;
    this.gender = gender;
    this.resourceType = resourceType;
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
   * @return The value of the {@code telecom} attribute
   */
  @JsonProperty("telecom")
  @Override
  public Optional<List<ContactPoint>> telecom() {
    return Optional.ofNullable(telecom);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code managingOrganization} attribute
   */
  @JsonProperty("managingOrganization")
  @Override
  public Optional<Reference> managingOrganization() {
    return Optional.ofNullable(managingOrganization);
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
   * @return The value of the {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public Optional<List<Address>> address() {
    return Optional.ofNullable(address);
  }

  /**
   * @return The value of the {@code photo} attribute
   */
  @JsonProperty("photo")
  @Override
  public Optional<Attachment> photo() {
    return Optional.ofNullable(photo);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Optional<List<Person_Link>> link() {
    return Optional.ofNullable(link);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<List<HumanName>> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
  public Optional<PersonGender> gender() {
    return Optional.ofNullable(gender);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePerson(
        newValue,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePerson(
        value,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        newValue,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePerson(
        this.contained,
        value,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        newValue,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        value,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        newValue,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        value,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        newValue,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        value,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        newValue,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        value,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withManagingOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        newValue,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withManagingOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        value,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        newValue,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        value,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withAddress(List<Address> value) {
    @Nullable List<Address> newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        newValue,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withAddress(Optional<? extends List<Address>> optional) {
    @Nullable List<Address> value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        value,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#photo() photo} attribute.
   * @param value The value for photo
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withPhoto(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "photo");
    if (this.photo == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        newValue,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#photo() photo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for photo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withPhoto(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.photo == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        value,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withLink(List<Person_Link> value) {
    @Nullable List<Person_Link> newValue = Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        newValue,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withLink(Optional<? extends List<Person_Link>> optional) {
    @Nullable List<Person_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        value,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        newValue,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        value,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withName(List<HumanName> value) {
    @Nullable List<HumanName> newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        newValue,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withName(Optional<? extends List<HumanName>> optional) {
    @Nullable List<HumanName> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        value,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        newValue,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        value,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        newValue,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        value,
        this.birthDate,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#birthDate() birthDate} attribute.
   * @param value The value for birthDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withBirthDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "birthDate");
    if (this.birthDate == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        newValue,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#birthDate() birthDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for birthDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withBirthDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.birthDate == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        value,
        this.text,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        newValue,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        value,
        this.gender,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson withGender(PersonGender value) {
    @Nullable PersonGender newValue = Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson withGender(Optional<? extends PersonGender> optional) {
    @Nullable PersonGender value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePerson(
        this.contained,
        this.extension,
        this.telecom,
        this.modifierExtension,
        this.meta,
        this.active,
        this.managingOrganization,
        this.id,
        this.address,
        this.photo,
        this.link,
        this.identifier,
        this.name,
        this.implicitRules,
        this.language,
        this.birthDate,
        this.text,
        this.gender,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson
        && equalTo((ImmutablePerson) another);
  }

  private boolean equalTo(ImmutablePerson another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(meta, another.meta)
        && Objects.equals(active, another.active)
        && Objects.equals(managingOrganization, another.managingOrganization)
        && Objects.equals(id, another.id)
        && Objects.equals(address, another.address)
        && Objects.equals(photo, another.photo)
        && Objects.equals(link, another.link)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(name, another.name)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(birthDate, another.birthDate)
        && Objects.equals(text, another.text)
        && Objects.equals(gender, another.gender)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code extension}, {@code telecom}, {@code modifierExtension}, {@code meta}, {@code active}, {@code managingOrganization}, {@code id}, {@code address}, {@code photo}, {@code link}, {@code identifier}, {@code name}, {@code implicitRules}, {@code language}, {@code birthDate}, {@code text}, {@code gender}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(managingOrganization);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + Objects.hashCode(photo);
    h += (h << 5) + Objects.hashCode(link);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(birthDate);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(gender);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Person} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Person{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (telecom != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (modifierExtension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (meta != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (active != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (managingOrganization != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (address != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("address=").append(address);
    }
    if (photo != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("photo=").append(photo);
    }
    if (link != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("link=").append(link);
    }
    if (identifier != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (name != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (implicitRules != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (birthDate != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("birthDate=").append(birthDate);
    }
    if (text != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (gender != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (builder.length() > 7) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Person", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Person {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<Reference> managingOrganization = Optional.empty();
    boolean managingOrganizationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Address>> address = Optional.empty();
    boolean addressIsSet;
    @Nullable Optional<Attachment> photo = Optional.empty();
    boolean photoIsSet;
    @Nullable Optional<List<Person_Link>> link = Optional.empty();
    boolean linkIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<HumanName>> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Date> birthDate = Optional.empty();
    boolean birthDateIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<PersonGender> gender = Optional.empty();
    boolean genderIsSet;
    @Nullable String resourceType;
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
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(Optional<Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("address")
    public void setAddress(Optional<List<Address>> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("photo")
    public void setPhoto(Optional<Attachment> photo) {
      this.photo = photo;
      this.photoIsSet = true;
    }
    @JsonProperty("link")
    public void setLink(Optional<List<Person_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<List<HumanName>> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("birthDate")
    public void setBirthDate(Optional<Date> birthDate) {
      this.birthDate = birthDate;
      this.birthDateIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("gender")
    public void setGender(Optional<PersonGender> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Address>> address() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> photo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Person_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<HumanName>> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> birthDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PersonGender> gender() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePerson fromJson(Json json) {
    ImmutablePerson.Builder builder = ((ImmutablePerson.Builder) ImmutablePerson.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.photoIsSet) {
      builder.photo(json.photo);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.birthDateIsSet) {
      builder.birthDate(json.birthDate);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
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
        .contained(instance.contained())
        .extension(instance.extension())
        .telecom(instance.telecom())
        .modifierExtension(instance.modifierExtension())
        .meta(instance.meta())
        .active(instance.active())
        .managingOrganization(instance.managingOrganization())
        .id(instance.id())
        .address(instance.address())
        .photo(instance.photo())
        .link(instance.link())
        .identifier(instance.identifier())
        .name(instance.name())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .birthDate(instance.birthDate())
        .text(instance.text())
        .gender(instance.gender())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link Person Person}.
   * <pre>
   * ImmutablePerson.builder()
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Person#contained() contained}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Person#extension() extension}
   *    .telecom(List&amp;lt;com.fhir.types.fhir.ContactPoint&amp;gt;) // optional {@link Person#telecom() telecom}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Person#modifierExtension() modifierExtension}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Person#meta() meta}
   *    .active(Boolean) // optional {@link Person#active() active}
   *    .managingOrganization(com.fhir.types.fhir.Reference) // optional {@link Person#managingOrganization() managingOrganization}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Person#id() id}
   *    .address(List&amp;lt;com.fhir.types.fhir.Address&amp;gt;) // optional {@link Person#address() address}
   *    .photo(com.fhir.types.fhir.Attachment) // optional {@link Person#photo() photo}
   *    .link(List&amp;lt;com.fhir.types.fhir.Person_Link&amp;gt;) // optional {@link Person#link() link}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Person#identifier() identifier}
   *    .name(List&amp;lt;com.fhir.types.fhir.HumanName&amp;gt;) // optional {@link Person#name() name}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Person#implicitRules() implicitRules}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Person#language() language}
   *    .birthDate(com.fhir.types.fhir.Date) // optional {@link Person#birthDate() birthDate}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Person#text() text}
   *    .gender(com.fhir.types.fhir.PersonGender) // optional {@link Person#gender() gender}
   *    .resourceType(String) // required {@link Person#resourceType() resourceType}
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
  @Generated(from = "Person", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_TELECOM = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_ACTIVE = 0x20L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_ADDRESS = 0x100L;
    private static final long OPT_BIT_PHOTO = 0x200L;
    private static final long OPT_BIT_LINK = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_NAME = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_BIRTH_DATE = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_GENDER = 0x20000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Meta meta;
    private @Nullable Boolean active;
    private @Nullable Reference managingOrganization;
    private @Nullable Id id;
    private @Nullable List<Address> address;
    private @Nullable Attachment photo;
    private @Nullable List<Person_Link> link;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<HumanName> name;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable Date birthDate;
    private @Nullable Narrative text;
    private @Nullable PersonGender gender;
    private @Nullable String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Person#contained() contained} to contained.
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
     * Initializes the optional value {@link Person#contained() contained} to contained.
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
     * Initializes the optional value {@link Person#extension() extension} to extension.
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
     * Initializes the optional value {@link Person#extension() extension} to extension.
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
     * Initializes the optional value {@link Person#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Person#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Person#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Person#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Person#meta() meta} to meta.
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
     * Initializes the optional value {@link Person#meta() meta} to meta.
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
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the optional value {@link Person#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the optional value {@link Person#id() id} to id.
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
     * Initializes the optional value {@link Person#id() id} to id.
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
     * Initializes the optional value {@link Person#address() address} to address.
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
     * Initializes the optional value {@link Person#address() address} to address.
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
     * Initializes the optional value {@link Person#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    public final Builder photo(Attachment photo) {
      checkNotIsSet(photoIsSet(), "photo");
      this.photo = Objects.requireNonNull(photo, "photo");
      optBits |= OPT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("photo")
    public final Builder photo(Optional<? extends Attachment> photo) {
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
    public final Builder link(List<Person_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Optional<? extends List<Person_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Person#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Person#name() name} to name.
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
     * Initializes the optional value {@link Person#name() name} to name.
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
     * Initializes the optional value {@link Person#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Person#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Person#language() language} to language.
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
     * Initializes the optional value {@link Person#language() language} to language.
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
     * Initializes the optional value {@link Person#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link Person#birthDate() birthDate} to birthDate.
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
     * Initializes the optional value {@link Person#text() text} to text.
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
     * Initializes the optional value {@link Person#text() text} to text.
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
     * Initializes the optional value {@link Person#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(PersonGender gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Person#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gender")
    public final Builder gender(Optional<? extends PersonGender> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#resourceType() resourceType} attribute.
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
     * Builds a new {@link Person Person}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Person build() {
      checkRequiredAttributes();
      return new ImmutablePerson(
          contained,
          extension,
          telecom,
          modifierExtension,
          meta,
          active,
          managingOrganization,
          id,
          address,
          photo,
          link,
          identifier,
          name,
          implicitRules,
          language,
          birthDate,
          text,
          gender,
          resourceType);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean photoIsSet() {
      return (optBits & OPT_BIT_PHOTO) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean birthDateIsSet() {
      return (optBits & OPT_BIT_BIRTH_DATE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Person is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Person, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Person", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Person#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Person", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Person#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Person#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Person#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Person#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Person#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Person#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

    /**
     * Initializes the optional value {@link Person#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Person#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Person#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Person#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

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
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link Person#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(Reference managingOrganization);

    /**
     * Initializes the optional value {@link Person#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(Optional<? extends Reference> managingOrganization);

    /**
     * Initializes the optional value {@link Person#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Person#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Person#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(List<Address> address);

    /**
     * Initializes the optional value {@link Person#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(Optional<? extends List<Address>> address);

    /**
     * Initializes the optional value {@link Person#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal photo(Attachment photo);

    /**
     * Initializes the optional value {@link Person#photo() photo} to photo.
     * @param photo The value for photo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal photo(Optional<? extends Attachment> photo);

    /**
     * Initializes the optional value {@link Person#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(List<Person_Link> link);

    /**
     * Initializes the optional value {@link Person#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(Optional<? extends List<Person_Link>> link);

    /**
     * Initializes the optional value {@link Person#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Person#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Person#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(List<HumanName> name);

    /**
     * Initializes the optional value {@link Person#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<? extends List<HumanName>> name);

    /**
     * Initializes the optional value {@link Person#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Person#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Person#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Person#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Person#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal birthDate(Date birthDate);

    /**
     * Initializes the optional value {@link Person#birthDate() birthDate} to birthDate.
     * @param birthDate The value for birthDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal birthDate(Optional<? extends Date> birthDate);

    /**
     * Initializes the optional value {@link Person#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Person#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Person#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal gender(PersonGender gender);

    /**
     * Initializes the optional value {@link Person#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal gender(Optional<? extends PersonGender> gender);

    /**
     * Builds a new {@link Person Person}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Person build();
  }
}
