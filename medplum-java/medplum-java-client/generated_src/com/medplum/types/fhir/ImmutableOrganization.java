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
 * Immutable implementation of {@link Organization}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrganization.builder()}.
 */
@Generated(from = "Organization", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOrganization implements Organization {
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable Boolean active;
  private final @Nullable List<String> alias;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable List<Reference> endpoint;
  private final @Nullable List<Address> address;
  private final String resourceType;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Code language;
  private final @Nullable Narrative text;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable String name;
  private final @Nullable Reference partOf;
  private final @Nullable List<Organization_Contact> contact;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id id;

  private ImmutableOrganization(
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable List<Identifier> identifier,
      @Nullable List<ContactPoint> telecom,
      @Nullable Boolean active,
      @Nullable List<String> alias,
      @Nullable List<CodeableConcept> type,
      @Nullable List<Reference> endpoint,
      @Nullable List<Address> address,
      String resourceType,
      @Nullable List<Extension> modifierExtension,
      @Nullable Code language,
      @Nullable Narrative text,
      @Nullable List<ResourceList> contained,
      @Nullable String name,
      @Nullable Reference partOf,
      @Nullable List<Organization_Contact> contact,
      @Nullable List<Extension> extension,
      @Nullable Id id) {
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.identifier = identifier;
    this.telecom = telecom;
    this.active = active;
    this.alias = alias;
    this.type = type;
    this.endpoint = endpoint;
    this.address = address;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
    this.language = language;
    this.text = text;
    this.contained = contained;
    this.name = name;
    this.partOf = partOf;
    this.contact = contact;
    this.extension = extension;
    this.id = id;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code telecom} attribute
   */
  @JsonProperty("telecom")
  @Override
  public Optional<List<ContactPoint>> telecom() {
    return Optional.ofNullable(telecom);
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
   * @return The value of the {@code alias} attribute
   */
  @JsonProperty("alias")
  @Override
  public Optional<List<String>> alias() {
    return Optional.ofNullable(alias);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<List<CodeableConcept>> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<List<Reference>> endpoint() {
    return Optional.ofNullable(endpoint);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<Reference> partOf() {
    return Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<Organization_Contact>> contact() {
    return Optional.ofNullable(contact);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableOrganization(
        newValue,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableOrganization(
        value,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        newValue,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableOrganization(
        this.meta,
        value,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        newValue,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        value,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        newValue,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        value,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        newValue,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        value,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withAlias(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "alias");
    if (this.alias == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        newValue,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#alias() alias} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withAlias(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.alias == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        value,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        newValue,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        value,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withEndpoint(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        newValue,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withEndpoint(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        value,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withAddress(List<Address> value) {
    @Nullable List<Address> newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        newValue,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withAddress(Optional<? extends List<Address>> optional) {
    @Nullable List<Address> value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        value,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Organization#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOrganization withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        newValue,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        newValue,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        value,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        newValue,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        value,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        newValue,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        value,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        newValue,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        value,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        newValue,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        value,
        this.partOf,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withPartOf(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        newValue,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withPartOf(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        value,
        this.contact,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withContact(List<Organization_Contact> value) {
    @Nullable List<Organization_Contact> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        newValue,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withContact(Optional<? extends List<Organization_Contact>> optional) {
    @Nullable List<Organization_Contact> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        value,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableOrganization(
        this.meta,
        this.implicitRules,
        this.identifier,
        this.telecom,
        this.active,
        this.alias,
        this.type,
        this.endpoint,
        this.address,
        this.resourceType,
        this.modifierExtension,
        this.language,
        this.text,
        this.contained,
        this.name,
        this.partOf,
        this.contact,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrganization} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrganization
        && equalTo((ImmutableOrganization) another);
  }

  private boolean equalTo(ImmutableOrganization another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(active, another.active)
        && Objects.equals(alias, another.alias)
        && Objects.equals(type, another.type)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(address, another.address)
        && resourceType.equals(another.resourceType)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(language, another.language)
        && Objects.equals(text, another.text)
        && Objects.equals(contained, another.contained)
        && Objects.equals(name, another.name)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(contact, another.contact)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code implicitRules}, {@code identifier}, {@code telecom}, {@code active}, {@code alias}, {@code type}, {@code endpoint}, {@code address}, {@code resourceType}, {@code modifierExtension}, {@code language}, {@code text}, {@code contained}, {@code name}, {@code partOf}, {@code contact}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(alias);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Organization} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Organization{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (identifier != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (telecom != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (active != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (alias != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("alias=").append(alias);
    }
    if (type != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (endpoint != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (address != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("address=").append(address);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Organization", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Organization {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<List<String>> alias = Optional.empty();
    boolean aliasIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Reference>> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<List<Address>> address = Optional.empty();
    boolean addressIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Reference> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Organization_Contact>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("alias")
    public void setAlias(Optional<List<String>> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<List<Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @JsonProperty("address")
    public void setAddress(Optional<List<Address>> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<Reference> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<Organization_Contact>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> alias() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Address>> address() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Organization_Contact>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOrganization fromJson(Json json) {
    ImmutableOrganization.Builder builder = ((ImmutableOrganization.Builder) ImmutableOrganization.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
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
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .identifier(instance.identifier())
        .telecom(instance.telecom())
        .active(instance.active())
        .alias(instance.alias())
        .type(instance.type())
        .endpoint(instance.endpoint())
        .address(instance.address())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .language(instance.language())
        .text(instance.text())
        .contained(instance.contained())
        .name(instance.name())
        .partOf(instance.partOf())
        .contact(instance.contact())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Organization Organization}.
   * <pre>
   * ImmutableOrganization.builder()
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Organization#meta() meta}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Organization#implicitRules() implicitRules}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Organization#identifier() identifier}
   *    .telecom(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link Organization#telecom() telecom}
   *    .active(Boolean) // optional {@link Organization#active() active}
   *    .alias(List&amp;lt;String&amp;gt;) // optional {@link Organization#alias() alias}
   *    .type(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Organization#type() type}
   *    .endpoint(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Organization#endpoint() endpoint}
   *    .address(List&amp;lt;com.medplum.types.fhir.Address&amp;gt;) // optional {@link Organization#address() address}
   *    .resourceType(String) // required {@link Organization#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Organization#modifierExtension() modifierExtension}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Organization#language() language}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Organization#text() text}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Organization#contained() contained}
   *    .name(String) // optional {@link Organization#name() name}
   *    .partOf(com.medplum.types.fhir.Reference) // optional {@link Organization#partOf() partOf}
   *    .contact(List&amp;lt;com.medplum.types.fhir.Organization_Contact&amp;gt;) // optional {@link Organization#contact() contact}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Organization#extension() extension}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Organization#id() id}
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
  @Generated(from = "Organization", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_TELECOM = 0x8L;
    private static final long OPT_BIT_ACTIVE = 0x10L;
    private static final long OPT_BIT_ALIAS = 0x20L;
    private static final long OPT_BIT_TYPE = 0x40L;
    private static final long OPT_BIT_ENDPOINT = 0x80L;
    private static final long OPT_BIT_ADDRESS = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_NAME = 0x2000L;
    private static final long OPT_BIT_PART_OF = 0x4000L;
    private static final long OPT_BIT_CONTACT = 0x8000L;
    private static final long OPT_BIT_EXTENSION = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable Boolean active;
    private @Nullable List<String> alias;
    private @Nullable List<CodeableConcept> type;
    private @Nullable List<Reference> endpoint;
    private @Nullable List<Address> address;
    private @Nullable String resourceType;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Code language;
    private @Nullable Narrative text;
    private @Nullable List<ResourceList> contained;
    private @Nullable String name;
    private @Nullable Reference partOf;
    private @Nullable List<Organization_Contact> contact;
    private @Nullable List<Extension> extension;
    private @Nullable Id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Organization#meta() meta} to meta.
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
     * Initializes the optional value {@link Organization#meta() meta} to meta.
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
     * Initializes the optional value {@link Organization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Organization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Organization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Organization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Organization#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Organization#telecom() telecom} to telecom.
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
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(List<String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alias")
    public final Builder alias(Optional<? extends List<String>> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(List<Reference> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endpoint")
    public final Builder endpoint(Optional<? extends List<Reference>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#address() address} to address.
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
     * Initializes the optional value {@link Organization#address() address} to address.
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
     * Initializes the value for the {@link Organization#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Organization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Organization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Organization#language() language} to language.
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
     * Initializes the optional value {@link Organization#language() language} to language.
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
     * Initializes the optional value {@link Organization#text() text} to text.
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
     * Initializes the optional value {@link Organization#text() text} to text.
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
     * Initializes the optional value {@link Organization#contained() contained} to contained.
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
     * Initializes the optional value {@link Organization#contained() contained} to contained.
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
     * Initializes the optional value {@link Organization#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(Reference partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<Organization_Contact> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<Organization_Contact>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization#extension() extension} to extension.
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
     * Initializes the optional value {@link Organization#extension() extension} to extension.
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
     * Initializes the optional value {@link Organization#id() id} to id.
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
     * Initializes the optional value {@link Organization#id() id} to id.
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
     * Builds a new {@link Organization Organization}.
     * @return An immutable instance of Organization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Organization build() {
      checkRequiredAttributes();
      return new ImmutableOrganization(
          meta,
          implicitRules,
          identifier,
          telecom,
          active,
          alias,
          type,
          endpoint,
          address,
          resourceType,
          modifierExtension,
          language,
          text,
          contained,
          name,
          partOf,
          contact,
          extension,
          id);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
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

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Organization is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Organization, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Organization", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Organization#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Organization", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Organization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Organization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Organization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Organization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Organization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Organization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Organization#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal telecom(List<ContactPoint> telecom);

    /**
     * Initializes the optional value {@link Organization#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal telecom(Optional<? extends List<ContactPoint>> telecom);

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
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link Organization#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(List<String> alias);

    /**
     * Initializes the optional value {@link Organization#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(Optional<? extends List<String>> alias);

    /**
     * Initializes the optional value {@link Organization#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(List<CodeableConcept> type);

    /**
     * Initializes the optional value {@link Organization#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends List<CodeableConcept>> type);

    /**
     * Initializes the optional value {@link Organization#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(List<Reference> endpoint);

    /**
     * Initializes the optional value {@link Organization#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(Optional<? extends List<Reference>> endpoint);

    /**
     * Initializes the optional value {@link Organization#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(List<Address> address);

    /**
     * Initializes the optional value {@link Organization#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(Optional<? extends List<Address>> address);

    /**
     * Initializes the optional value {@link Organization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Organization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Organization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Organization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Organization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Organization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Organization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Organization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Organization#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link Organization#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link Organization#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(Reference partOf);

    /**
     * Initializes the optional value {@link Organization#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends Reference> partOf);

    /**
     * Initializes the optional value {@link Organization#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<Organization_Contact> contact);

    /**
     * Initializes the optional value {@link Organization#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<Organization_Contact>> contact);

    /**
     * Initializes the optional value {@link Organization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Organization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Organization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Organization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Builds a new {@link Organization Organization}.
     * @return An immutable instance of Organization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Organization build();
  }
}
