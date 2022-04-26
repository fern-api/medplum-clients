package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Endpoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEndpoint.builder()}.
 */
@Generated(from = "Endpoint", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEndpoint implements Endpoint {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<String> header;
  private final String resourceType;
  private final @Nullable Narrative text;
  private final @Nullable Code language;
  private final @Nullable EndpointStatus status;
  private final @Nullable Period period;
  private final @Nullable Url address;
  private final List<CodeableConcept> payloadType;
  private final @Nullable Id id;
  private final @Nullable List<ContactPoint> contact;
  private final Coding connectionType;
  private final @Nullable List<Code> payloadMimeType;
  private final @Nullable Reference managingOrganization;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Meta meta;
  private final @Nullable String name;
  private final @Nullable Uri implicitRules;

  private ImmutableEndpoint(
      @Nullable List<ResourceList> contained,
      @Nullable List<String> header,
      String resourceType,
      @Nullable Narrative text,
      @Nullable Code language,
      @Nullable EndpointStatus status,
      @Nullable Period period,
      @Nullable Url address,
      List<CodeableConcept> payloadType,
      @Nullable Id id,
      @Nullable List<ContactPoint> contact,
      Coding connectionType,
      @Nullable List<Code> payloadMimeType,
      @Nullable Reference managingOrganization,
      @Nullable List<Extension> extension,
      @Nullable List<Identifier> identifier,
      @Nullable List<Extension> modifierExtension,
      @Nullable Meta meta,
      @Nullable String name,
      @Nullable Uri implicitRules) {
    this.contained = contained;
    this.header = header;
    this.resourceType = resourceType;
    this.text = text;
    this.language = language;
    this.status = status;
    this.period = period;
    this.address = address;
    this.payloadType = payloadType;
    this.id = id;
    this.contact = contact;
    this.connectionType = connectionType;
    this.payloadMimeType = payloadMimeType;
    this.managingOrganization = managingOrganization;
    this.extension = extension;
    this.identifier = identifier;
    this.modifierExtension = modifierExtension;
    this.meta = meta;
    this.name = name;
    this.implicitRules = implicitRules;
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
   * @return The value of the {@code header} attribute
   */
  @JsonProperty("header")
  @Override
  public Optional<List<String>> header() {
    return Optional.ofNullable(header);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<EndpointStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public Optional<Url> address() {
    return Optional.ofNullable(address);
  }

  /**
   * @return The value of the {@code payloadType} attribute
   */
  @JsonProperty("payloadType")
  @Override
  public List<CodeableConcept> payloadType() {
    return payloadType;
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactPoint>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code connectionType} attribute
   */
  @JsonProperty("connectionType")
  @Override
  public Coding connectionType() {
    return connectionType;
  }

  /**
   * @return The value of the {@code payloadMimeType} attribute
   */
  @JsonProperty("payloadMimeType")
  @Override
  public Optional<List<Code>> payloadMimeType() {
    return Optional.ofNullable(payloadMimeType);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEndpoint(
        newValue,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEndpoint(
        value,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#header() header} attribute.
   * @param value The value for header
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withHeader(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "header");
    if (this.header == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        newValue,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#header() header} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for header
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withHeader(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.header == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        value,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Endpoint#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndpoint withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        newValue,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        newValue,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        value,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        newValue,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        value,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withStatus(EndpointStatus value) {
    @Nullable EndpointStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        newValue,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withStatus(Optional<? extends EndpointStatus> optional) {
    @Nullable EndpointStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        value,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        newValue,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        value,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withAddress(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        newValue,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withAddress(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        value,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Endpoint#payloadType() payloadType}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withPayloadType(CodeableConcept... elements) {
    List<CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        newValue,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Endpoint#payloadType() payloadType}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of payloadType elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withPayloadType(Iterable<? extends CodeableConcept> elements) {
    if (this.payloadType == elements) return this;
    List<CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        newValue,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        newValue,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        value,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withContact(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        newValue,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withContact(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        value,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Endpoint#connectionType() connectionType} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for connectionType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEndpoint withConnectionType(Coding value) {
    if (this.connectionType == value) return this;
    Coding newValue = Objects.requireNonNull(value, "connectionType");
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        newValue,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#payloadMimeType() payloadMimeType} attribute.
   * @param value The value for payloadMimeType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withPayloadMimeType(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "payloadMimeType");
    if (this.payloadMimeType == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        newValue,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#payloadMimeType() payloadMimeType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payloadMimeType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withPayloadMimeType(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.payloadMimeType == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        value,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#managingOrganization() managingOrganization} attribute.
   * @param value The value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withManagingOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "managingOrganization");
    if (this.managingOrganization == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        newValue,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#managingOrganization() managingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withManagingOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.managingOrganization == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        value,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        newValue,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        value,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        newValue,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        value,
        this.modifierExtension,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        newValue,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        value,
        this.meta,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        newValue,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        value,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        value,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Endpoint#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEndpoint withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Endpoint#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEndpoint withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEndpoint(
        this.contained,
        this.header,
        this.resourceType,
        this.text,
        this.language,
        this.status,
        this.period,
        this.address,
        this.payloadType,
        this.id,
        this.contact,
        this.connectionType,
        this.payloadMimeType,
        this.managingOrganization,
        this.extension,
        this.identifier,
        this.modifierExtension,
        this.meta,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEndpoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEndpoint
        && equalTo((ImmutableEndpoint) another);
  }

  private boolean equalTo(ImmutableEndpoint another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(header, another.header)
        && resourceType.equals(another.resourceType)
        && Objects.equals(text, another.text)
        && Objects.equals(language, another.language)
        && Objects.equals(status, another.status)
        && Objects.equals(period, another.period)
        && Objects.equals(address, another.address)
        && payloadType.equals(another.payloadType)
        && Objects.equals(id, another.id)
        && Objects.equals(contact, another.contact)
        && connectionType.equals(another.connectionType)
        && Objects.equals(payloadMimeType, another.payloadMimeType)
        && Objects.equals(managingOrganization, another.managingOrganization)
        && Objects.equals(extension, another.extension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(meta, another.meta)
        && Objects.equals(name, another.name)
        && Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code header}, {@code resourceType}, {@code text}, {@code language}, {@code status}, {@code period}, {@code address}, {@code payloadType}, {@code id}, {@code contact}, {@code connectionType}, {@code payloadMimeType}, {@code managingOrganization}, {@code extension}, {@code identifier}, {@code modifierExtension}, {@code meta}, {@code name}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(header);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + payloadType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + connectionType.hashCode();
    h += (h << 5) + Objects.hashCode(payloadMimeType);
    h += (h << 5) + Objects.hashCode(managingOrganization);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code Endpoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Endpoint{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (header != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("header=").append(header);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (address != null) {
      builder.append(", ");
      builder.append("address=").append(address);
    }
    builder.append(", ");
    builder.append("payloadType=").append(payloadType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    builder.append(", ");
    builder.append("connectionType=").append(connectionType);
    if (payloadMimeType != null) {
      builder.append(", ");
      builder.append("payloadMimeType=").append(payloadMimeType);
    }
    if (managingOrganization != null) {
      builder.append(", ");
      builder.append("managingOrganization=").append(managingOrganization);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Endpoint", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Endpoint {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<String>> header = Optional.empty();
    boolean headerIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<EndpointStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<Url> address = Optional.empty();
    boolean addressIsSet;
    @Nullable List<CodeableConcept> payloadType = Collections.emptyList();
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ContactPoint>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Coding connectionType;
    @Nullable Optional<List<Code>> payloadMimeType = Optional.empty();
    boolean payloadMimeTypeIsSet;
    @Nullable Optional<Reference> managingOrganization = Optional.empty();
    boolean managingOrganizationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("header")
    public void setHeader(Optional<List<String>> header) {
      this.header = header;
      this.headerIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<EndpointStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("address")
    public void setAddress(Optional<Url> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("payloadType")
    public void setPayloadType(List<CodeableConcept> payloadType) {
      this.payloadType = payloadType;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactPoint>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("connectionType")
    public void setConnectionType(Coding connectionType) {
      this.connectionType = connectionType;
    }
    @JsonProperty("payloadMimeType")
    public void setPayloadMimeType(Optional<List<Code>> payloadMimeType) {
      this.payloadMimeType = payloadMimeType;
      this.payloadMimeTypeIsSet = true;
    }
    @JsonProperty("managingOrganization")
    public void setManagingOrganization(Optional<Reference> managingOrganization) {
      this.managingOrganization = managingOrganization;
      this.managingOrganizationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
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
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> header() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EndpointStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> address() { throw new UnsupportedOperationException(); }
    @Override
    public List<CodeableConcept> payloadType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Coding connectionType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> payloadMimeType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> managingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEndpoint fromJson(Json json) {
    ImmutableEndpoint.Builder builder = ((ImmutableEndpoint.Builder) ImmutableEndpoint.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.headerIsSet) {
      builder.header(json.header);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.payloadType != null) {
      builder.addAllPayloadType(json.payloadType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.connectionType != null) {
      builder.connectionType(json.connectionType);
    }
    if (json.payloadMimeTypeIsSet) {
      builder.payloadMimeType(json.payloadMimeType);
    }
    if (json.managingOrganizationIsSet) {
      builder.managingOrganization(json.managingOrganization);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    return (ImmutableEndpoint) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Endpoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Endpoint instance
   */
  public static Endpoint copyOf(Endpoint instance) {
    if (instance instanceof ImmutableEndpoint) {
      return (ImmutableEndpoint) instance;
    }
    return ((ImmutableEndpoint.Builder) ImmutableEndpoint.builder())
        .contained(instance.contained())
        .header(instance.header())
        .resourceType(instance.resourceType())
        .text(instance.text())
        .language(instance.language())
        .status(instance.status())
        .period(instance.period())
        .address(instance.address())
        .addAllPayloadType(instance.payloadType())
        .id(instance.id())
        .contact(instance.contact())
        .connectionType(instance.connectionType())
        .payloadMimeType(instance.payloadMimeType())
        .managingOrganization(instance.managingOrganization())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .modifierExtension(instance.modifierExtension())
        .meta(instance.meta())
        .name(instance.name())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link Endpoint Endpoint}.
   * <pre>
   * ImmutableEndpoint.builder()
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Endpoint#contained() contained}
   *    .header(List&amp;lt;String&amp;gt;) // optional {@link Endpoint#header() header}
   *    .resourceType(String) // required {@link Endpoint#resourceType() resourceType}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Endpoint#text() text}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Endpoint#language() language}
   *    .status(com.medplum.types.fhir.EndpointStatus) // optional {@link Endpoint#status() status}
   *    .period(com.medplum.types.fhir.Period) // optional {@link Endpoint#period() period}
   *    .address(com.medplum.types.fhir.Url) // optional {@link Endpoint#address() address}
   *    .addPayloadType|addAllPayloadType(com.medplum.types.fhir.CodeableConcept) // {@link Endpoint#payloadType() payloadType} elements
   *    .id(com.medplum.types.fhir.Id) // optional {@link Endpoint#id() id}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link Endpoint#contact() contact}
   *    .connectionType(com.medplum.types.fhir.Coding) // required {@link Endpoint#connectionType() connectionType}
   *    .payloadMimeType(List&amp;lt;com.medplum.types.fhir.Code&amp;gt;) // optional {@link Endpoint#payloadMimeType() payloadMimeType}
   *    .managingOrganization(com.medplum.types.fhir.Reference) // optional {@link Endpoint#managingOrganization() managingOrganization}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Endpoint#extension() extension}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Endpoint#identifier() identifier}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Endpoint#modifierExtension() modifierExtension}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Endpoint#meta() meta}
   *    .name(String) // optional {@link Endpoint#name() name}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Endpoint#implicitRules() implicitRules}
   *    .build();
   * </pre>
   * @return A new Endpoint builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableEndpoint.Builder();
  }

  /**
   * Builds instances of type {@link Endpoint Endpoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Endpoint", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ConnectionTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_CONNECTION_TYPE = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_HEADER = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_PERIOD = 0x20L;
    private static final long OPT_BIT_ADDRESS = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_CONTACT = 0x100L;
    private static final long OPT_BIT_PAYLOAD_MIME_TYPE = 0x200L;
    private static final long OPT_BIT_MANAGING_ORGANIZATION = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_NAME = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable List<String> header;
    private @Nullable String resourceType;
    private @Nullable Narrative text;
    private @Nullable Code language;
    private @Nullable EndpointStatus status;
    private @Nullable Period period;
    private @Nullable Url address;
    private final List<CodeableConcept> payloadType = new ArrayList<CodeableConcept>();
    private @Nullable Id id;
    private @Nullable List<ContactPoint> contact;
    private @Nullable Coding connectionType;
    private @Nullable List<Code> payloadMimeType;
    private @Nullable Reference managingOrganization;
    private @Nullable List<Extension> extension;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Meta meta;
    private @Nullable String name;
    private @Nullable Uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Endpoint#contained() contained} to contained.
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
     * Initializes the optional value {@link Endpoint#contained() contained} to contained.
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
     * Initializes the optional value {@link Endpoint#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for chained invocation
     */
    public final Builder header(List<String> header) {
      checkNotIsSet(headerIsSet(), "header");
      this.header = Objects.requireNonNull(header, "header");
      optBits |= OPT_BIT_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("header")
    public final Builder header(Optional<? extends List<String>> header) {
      checkNotIsSet(headerIsSet(), "header");
      this.header = header.orElse(null);
      optBits |= OPT_BIT_HEADER;
      return this;
    }

    /**
     * Initializes the value for the {@link Endpoint#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Endpoint#text() text} to text.
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
     * Initializes the optional value {@link Endpoint#text() text} to text.
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
     * Initializes the optional value {@link Endpoint#language() language} to language.
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
     * Initializes the optional value {@link Endpoint#language() language} to language.
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
     * Initializes the optional value {@link Endpoint#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(EndpointStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends EndpointStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#period() period} to period.
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
     * Initializes the optional value {@link Endpoint#period() period} to period.
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
     * Initializes the optional value {@link Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(Url address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = Objects.requireNonNull(address, "address");
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("address")
    public final Builder address(Optional<? extends Url> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = address.orElse(null);
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Adds one element to {@link Endpoint#payloadType() payloadType} list.
     * @param element A payloadType element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPayloadType(CodeableConcept element) {
      this.payloadType.add(Objects.requireNonNull(element, "payloadType element"));
      return this;
    }

    /**
     * Adds elements to {@link Endpoint#payloadType() payloadType} list.
     * @param elements An array of payloadType elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPayloadType(CodeableConcept... elements) {
      for (CodeableConcept element : elements) {
        this.payloadType.add(Objects.requireNonNull(element, "payloadType element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Endpoint#payloadType() payloadType} list.
     * @param elements An iterable of payloadType elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPayloadType(Iterable<? extends CodeableConcept> elements) {
      for (CodeableConcept element : elements) {
        this.payloadType.add(Objects.requireNonNull(element, "payloadType element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#id() id} to id.
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
     * Initializes the optional value {@link Endpoint#id() id} to id.
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
     * Initializes the optional value {@link Endpoint#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<ContactPoint> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<ContactPoint>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the value for the {@link Endpoint#connectionType() connectionType} attribute.
     * @param connectionType The value for connectionType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("connectionType")
    public final Builder connectionType(Coding connectionType) {
      checkNotIsSet(connectionTypeIsSet(), "connectionType");
      this.connectionType = Objects.requireNonNull(connectionType, "connectionType");
      initBits &= ~INIT_BIT_CONNECTION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#payloadMimeType() payloadMimeType} to payloadMimeType.
     * @param payloadMimeType The value for payloadMimeType
     * @return {@code this} builder for chained invocation
     */
    public final Builder payloadMimeType(List<Code> payloadMimeType) {
      checkNotIsSet(payloadMimeTypeIsSet(), "payloadMimeType");
      this.payloadMimeType = Objects.requireNonNull(payloadMimeType, "payloadMimeType");
      optBits |= OPT_BIT_PAYLOAD_MIME_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#payloadMimeType() payloadMimeType} to payloadMimeType.
     * @param payloadMimeType The value for payloadMimeType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payloadMimeType")
    public final Builder payloadMimeType(Optional<? extends List<Code>> payloadMimeType) {
      checkNotIsSet(payloadMimeTypeIsSet(), "payloadMimeType");
      this.payloadMimeType = payloadMimeType.orElse(null);
      optBits |= OPT_BIT_PAYLOAD_MIME_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Endpoint#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the optional value {@link Endpoint#managingOrganization() managingOrganization} to managingOrganization.
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
     * Initializes the optional value {@link Endpoint#extension() extension} to extension.
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
     * Initializes the optional value {@link Endpoint#extension() extension} to extension.
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
     * Initializes the optional value {@link Endpoint#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Endpoint#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Endpoint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Endpoint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Endpoint#meta() meta} to meta.
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
     * Initializes the optional value {@link Endpoint#meta() meta} to meta.
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
     * Initializes the optional value {@link Endpoint#name() name} to name.
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
     * Initializes the optional value {@link Endpoint#name() name} to name.
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
     * Initializes the optional value {@link Endpoint#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Endpoint#implicitRules() implicitRules} to implicitRules.
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
     * Builds a new {@link Endpoint Endpoint}.
     * @return An immutable instance of Endpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Endpoint build() {
      checkRequiredAttributes();
      return new ImmutableEndpoint(
          contained,
          header,
          resourceType,
          text,
          language,
          status,
          period,
          address,
          createUnmodifiableList(true, payloadType),
          id,
          contact,
          connectionType,
          payloadMimeType,
          managingOrganization,
          extension,
          identifier,
          modifierExtension,
          meta,
          name,
          implicitRules);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean headerIsSet() {
      return (optBits & OPT_BIT_HEADER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean payloadMimeTypeIsSet() {
      return (optBits & OPT_BIT_PAYLOAD_MIME_TYPE) != 0;
    }

    private boolean managingOrganizationIsSet() {
      return (optBits & OPT_BIT_MANAGING_ORGANIZATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean connectionTypeIsSet() {
      return (initBits & INIT_BIT_CONNECTION_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Endpoint is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!connectionTypeIsSet()) attributes.add("connectionType");
      return "Cannot build Endpoint, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Endpoint", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Endpoint#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ConnectionTypeBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Endpoint", generator = "Immutables")
  public interface ConnectionTypeBuildStage {
    /**
     * Initializes the value for the {@link Endpoint#connectionType() connectionType} attribute.
     * @param connectionType The value for connectionType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal connectionType(Coding connectionType);
  }

  @Generated(from = "Endpoint", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Endpoint#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Endpoint#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Endpoint#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for chained invocation
     */
    BuildFinal header(List<String> header);

    /**
     * Initializes the optional value {@link Endpoint#header() header} to header.
     * @param header The value for header
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal header(Optional<? extends List<String>> header);

    /**
     * Initializes the optional value {@link Endpoint#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Endpoint#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Endpoint#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Endpoint#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Endpoint#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(EndpointStatus status);

    /**
     * Initializes the optional value {@link Endpoint#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends EndpointStatus> status);

    /**
     * Initializes the optional value {@link Endpoint#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link Endpoint#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(Url address);

    /**
     * Initializes the optional value {@link Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(Optional<? extends Url> address);

    /**
     * Adds one element to {@link Endpoint#payloadType() payloadType} list.
     * @param element A payloadType element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPayloadType(CodeableConcept element);

    /**
     * Adds elements to {@link Endpoint#payloadType() payloadType} list.
     * @param elements An array of payloadType elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPayloadType(CodeableConcept... elements);

    /**
     * Adds elements to {@link Endpoint#payloadType() payloadType} list.
     * @param elements An iterable of payloadType elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllPayloadType(Iterable<? extends CodeableConcept> elements);

    /**
     * Initializes the optional value {@link Endpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Endpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Endpoint#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactPoint> contact);

    /**
     * Initializes the optional value {@link Endpoint#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactPoint>> contact);

    /**
     * Initializes the optional value {@link Endpoint#payloadMimeType() payloadMimeType} to payloadMimeType.
     * @param payloadMimeType The value for payloadMimeType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payloadMimeType(List<Code> payloadMimeType);

    /**
     * Initializes the optional value {@link Endpoint#payloadMimeType() payloadMimeType} to payloadMimeType.
     * @param payloadMimeType The value for payloadMimeType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payloadMimeType(Optional<? extends List<Code>> payloadMimeType);

    /**
     * Initializes the optional value {@link Endpoint#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingOrganization(Reference managingOrganization);

    /**
     * Initializes the optional value {@link Endpoint#managingOrganization() managingOrganization} to managingOrganization.
     * @param managingOrganization The value for managingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingOrganization(Optional<? extends Reference> managingOrganization);

    /**
     * Initializes the optional value {@link Endpoint#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Endpoint#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Endpoint#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Endpoint#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Endpoint#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Endpoint#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Endpoint#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Endpoint#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Endpoint#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link Endpoint#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link Endpoint#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Endpoint#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Builds a new {@link Endpoint Endpoint}.
     * @return An immutable instance of Endpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Endpoint build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}