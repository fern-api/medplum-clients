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
 * Immutable implementation of {@link CompartmentDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCompartmentDefinition.builder()}.
 */
@Generated(from = "CompartmentDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCompartmentDefinition implements CompartmentDefinition {
  private final @Nullable String publisher;
  private final @Nullable Boolean experimental;
  private final @Nullable DateTime date;
  private final @Nullable Markdown purpose;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Uri url;
  private final @Nullable List<UsageContext> useContext;
  private final String resourceType;
  private final @Nullable Boolean search;
  private final @Nullable Code language;
  private final @Nullable Markdown description;
  private final @Nullable CompartmentdefinitionStatus status;
  private final @Nullable CompartmentdefinitionCode code;
  private final @Nullable Uri implicitRules;
  private final @Nullable Narrative text;
  private final @Nullable String version;
  private final @Nullable Id id;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable String name;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CompartmentDefinition_Resource> resource;

  private ImmutableCompartmentDefinition(
      @Nullable String publisher,
      @Nullable Boolean experimental,
      @Nullable DateTime date,
      @Nullable Markdown purpose,
      @Nullable Meta meta,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ContactDetail> contact,
      @Nullable Uri url,
      @Nullable List<UsageContext> useContext,
      String resourceType,
      @Nullable Boolean search,
      @Nullable Code language,
      @Nullable Markdown description,
      @Nullable CompartmentdefinitionStatus status,
      @Nullable CompartmentdefinitionCode code,
      @Nullable Uri implicitRules,
      @Nullable Narrative text,
      @Nullable String version,
      @Nullable Id id,
      @Nullable List<ResourceList> contained,
      @Nullable String name,
      @Nullable List<Extension> extension,
      @Nullable List<CompartmentDefinition_Resource> resource) {
    this.publisher = publisher;
    this.experimental = experimental;
    this.date = date;
    this.purpose = purpose;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.contact = contact;
    this.url = url;
    this.useContext = useContext;
    this.resourceType = resourceType;
    this.search = search;
    this.language = language;
    this.description = description;
    this.status = status;
    this.code = code;
    this.implicitRules = implicitRules;
    this.text = text;
    this.version = version;
    this.id = id;
    this.contained = contained;
    this.name = name;
    this.extension = extension;
    this.resource = resource;
  }

  /**
   * @return The value of the {@code publisher} attribute
   */
  @JsonProperty("publisher")
  @Override
  public Optional<String> publisher() {
    return Optional.ofNullable(publisher);
  }

  /**
   * @return The value of the {@code experimental} attribute
   */
  @JsonProperty("experimental")
  @Override
  public Optional<Boolean> experimental() {
    return Optional.ofNullable(experimental);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<Markdown> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code useContext} attribute
   */
  @JsonProperty("useContext")
  @Override
  public Optional<List<UsageContext>> useContext() {
    return Optional.ofNullable(useContext);
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
   * @return The value of the {@code search} attribute
   */
  @JsonProperty("search")
  @Override
  public Optional<Boolean> search() {
    return Optional.ofNullable(search);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CompartmentdefinitionStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CompartmentdefinitionCode> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<List<CompartmentDefinition_Resource>> resource() {
    return Optional.ofNullable(resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        newValue,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableCompartmentDefinition(
        value,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        newValue,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        value,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        newValue,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        value,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        newValue,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        value,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        newValue,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        value,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        newValue,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        value,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        newValue,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        value,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        newValue,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        value,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        newValue,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        value,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CompartmentDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCompartmentDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        newValue,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#search() search} attribute.
   * @param value The value for search
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withSearch(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.search, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        newValue,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#search() search} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for search
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withSearch(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.search, value)) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        value,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        newValue,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        value,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        newValue,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        value,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withStatus(CompartmentdefinitionStatus value) {
    @Nullable CompartmentdefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        newValue,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withStatus(Optional<? extends CompartmentdefinitionStatus> optional) {
    @Nullable CompartmentdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        value,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withCode(CompartmentdefinitionCode value) {
    @Nullable CompartmentdefinitionCode newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        newValue,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withCode(Optional<? extends CompartmentdefinitionCode> optional) {
    @Nullable CompartmentdefinitionCode value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        value,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        newValue,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        value,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        newValue,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        value,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        newValue,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        value,
        this.id,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        newValue,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        value,
        this.contained,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        newValue,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        value,
        this.name,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        newValue,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        value,
        this.extension,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        newValue,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        value,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition withResource(List<CompartmentDefinition_Resource> value) {
    @Nullable List<CompartmentDefinition_Resource> newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition withResource(Optional<? extends List<CompartmentDefinition_Resource>> optional) {
    @Nullable List<CompartmentDefinition_Resource> value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableCompartmentDefinition(
        this.publisher,
        this.experimental,
        this.date,
        this.purpose,
        this.meta,
        this.modifierExtension,
        this.contact,
        this.url,
        this.useContext,
        this.resourceType,
        this.search,
        this.language,
        this.description,
        this.status,
        this.code,
        this.implicitRules,
        this.text,
        this.version,
        this.id,
        this.contained,
        this.name,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCompartmentDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCompartmentDefinition
        && equalTo((ImmutableCompartmentDefinition) another);
  }

  private boolean equalTo(ImmutableCompartmentDefinition another) {
    return Objects.equals(publisher, another.publisher)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(date, another.date)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(meta, another.meta)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(contact, another.contact)
        && Objects.equals(url, another.url)
        && Objects.equals(useContext, another.useContext)
        && resourceType.equals(another.resourceType)
        && Objects.equals(search, another.search)
        && Objects.equals(language, another.language)
        && Objects.equals(description, another.description)
        && Objects.equals(status, another.status)
        && Objects.equals(code, another.code)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(text, another.text)
        && Objects.equals(version, another.version)
        && Objects.equals(id, another.id)
        && Objects.equals(contained, another.contained)
        && Objects.equals(name, another.name)
        && Objects.equals(extension, another.extension)
        && Objects.equals(resource, another.resource);
  }

  /**
   * Computes a hash code from attributes: {@code publisher}, {@code experimental}, {@code date}, {@code purpose}, {@code meta}, {@code modifierExtension}, {@code contact}, {@code url}, {@code useContext}, {@code resourceType}, {@code search}, {@code language}, {@code description}, {@code status}, {@code code}, {@code implicitRules}, {@code text}, {@code version}, {@code id}, {@code contained}, {@code name}, {@code extension}, {@code resource}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(search);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(resource);
    return h;
  }

  /**
   * Prints the immutable value {@code CompartmentDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CompartmentDefinition{");
    if (publisher != null) {
      builder.append("publisher=").append(publisher);
    }
    if (experimental != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (date != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (purpose != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (meta != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contact != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (url != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (useContext != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (search != null) {
      builder.append(", ");
      builder.append("search=").append(search);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (resource != null) {
      builder.append(", ");
      builder.append("resource=").append(resource);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CompartmentDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CompartmentDefinition {
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Boolean> search = Optional.empty();
    boolean searchIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<CompartmentdefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<CompartmentdefinitionCode> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CompartmentDefinition_Resource>> resource = Optional.empty();
    boolean resourceIsSet;
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("search")
    public void setSearch(Optional<Boolean> search) {
      this.search = search;
      this.searchIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<CompartmentdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CompartmentdefinitionCode> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<List<CompartmentDefinition_Resource>> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> search() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CompartmentdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CompartmentdefinitionCode> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CompartmentDefinition_Resource>> resource() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCompartmentDefinition fromJson(Json json) {
    ImmutableCompartmentDefinition.Builder builder = ((ImmutableCompartmentDefinition.Builder) ImmutableCompartmentDefinition.builder());
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.searchIsSet) {
      builder.search(json.search);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    return (ImmutableCompartmentDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CompartmentDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CompartmentDefinition instance
   */
  public static CompartmentDefinition copyOf(CompartmentDefinition instance) {
    if (instance instanceof ImmutableCompartmentDefinition) {
      return (ImmutableCompartmentDefinition) instance;
    }
    return ((ImmutableCompartmentDefinition.Builder) ImmutableCompartmentDefinition.builder())
        .publisher(instance.publisher())
        .experimental(instance.experimental())
        .date(instance.date())
        .purpose(instance.purpose())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .contact(instance.contact())
        .url(instance.url())
        .useContext(instance.useContext())
        .resourceType(instance.resourceType())
        .search(instance.search())
        .language(instance.language())
        .description(instance.description())
        .status(instance.status())
        .code(instance.code())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .version(instance.version())
        .id(instance.id())
        .contained(instance.contained())
        .name(instance.name())
        .extension(instance.extension())
        .resource(instance.resource())
        .build();
  }

  /**
   * Creates a builder for {@link CompartmentDefinition CompartmentDefinition}.
   * <pre>
   * ImmutableCompartmentDefinition.builder()
   *    .publisher(String) // optional {@link CompartmentDefinition#publisher() publisher}
   *    .experimental(Boolean) // optional {@link CompartmentDefinition#experimental() experimental}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link CompartmentDefinition#date() date}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link CompartmentDefinition#purpose() purpose}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link CompartmentDefinition#meta() meta}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CompartmentDefinition#modifierExtension() modifierExtension}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link CompartmentDefinition#contact() contact}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link CompartmentDefinition#url() url}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link CompartmentDefinition#useContext() useContext}
   *    .resourceType(String) // required {@link CompartmentDefinition#resourceType() resourceType}
   *    .search(Boolean) // optional {@link CompartmentDefinition#search() search}
   *    .language(com.medplum.types.fhir.Code) // optional {@link CompartmentDefinition#language() language}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link CompartmentDefinition#description() description}
   *    .status(com.medplum.types.fhir.CompartmentdefinitionStatus) // optional {@link CompartmentDefinition#status() status}
   *    .code(com.medplum.types.fhir.CompartmentdefinitionCode) // optional {@link CompartmentDefinition#code() code}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link CompartmentDefinition#implicitRules() implicitRules}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link CompartmentDefinition#text() text}
   *    .version(String) // optional {@link CompartmentDefinition#version() version}
   *    .id(com.medplum.types.fhir.Id) // optional {@link CompartmentDefinition#id() id}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link CompartmentDefinition#contained() contained}
   *    .name(String) // optional {@link CompartmentDefinition#name() name}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CompartmentDefinition#extension() extension}
   *    .resource(List&amp;lt;com.medplum.types.fhir.CompartmentDefinition_Resource&amp;gt;) // optional {@link CompartmentDefinition#resource() resource}
   *    .build();
   * </pre>
   * @return A new CompartmentDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCompartmentDefinition.Builder();
  }

  /**
   * Builds instances of type {@link CompartmentDefinition CompartmentDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CompartmentDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_PUBLISHER = 0x1L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_PURPOSE = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_CONTACT = 0x40L;
    private static final long OPT_BIT_URL = 0x80L;
    private static final long OPT_BIT_USE_CONTEXT = 0x100L;
    private static final long OPT_BIT_SEARCH = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_DESCRIPTION = 0x800L;
    private static final long OPT_BIT_STATUS = 0x1000L;
    private static final long OPT_BIT_CODE = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_VERSION = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private static final long OPT_BIT_NAME = 0x80000L;
    private static final long OPT_BIT_EXTENSION = 0x100000L;
    private static final long OPT_BIT_RESOURCE = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String publisher;
    private @Nullable Boolean experimental;
    private @Nullable DateTime date;
    private @Nullable Markdown purpose;
    private @Nullable Meta meta;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Uri url;
    private @Nullable List<UsageContext> useContext;
    private @Nullable String resourceType;
    private @Nullable Boolean search;
    private @Nullable Code language;
    private @Nullable Markdown description;
    private @Nullable CompartmentdefinitionStatus status;
    private @Nullable CompartmentdefinitionCode code;
    private @Nullable Uri implicitRules;
    private @Nullable Narrative text;
    private @Nullable String version;
    private @Nullable Id id;
    private @Nullable List<ResourceList> contained;
    private @Nullable String name;
    private @Nullable List<Extension> extension;
    private @Nullable List<CompartmentDefinition_Resource> resource;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    public final Builder publisher(String publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = Objects.requireNonNull(publisher, "publisher");
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("publisher")
    public final Builder publisher(Optional<String> publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = publisher.orElse(null);
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    public final Builder experimental(boolean experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental;
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("experimental")
    public final Builder experimental(Optional<Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(Markdown purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("purpose")
    public final Builder purpose(Optional<? extends Markdown> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link CompartmentDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link CompartmentDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CompartmentDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CompartmentDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<ContactDetail> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<ContactDetail>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder useContext(List<UsageContext> useContext) {
      checkNotIsSet(useContextIsSet(), "useContext");
      this.useContext = Objects.requireNonNull(useContext, "useContext");
      optBits |= OPT_BIT_USE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("useContext")
    public final Builder useContext(Optional<? extends List<UsageContext>> useContext) {
      checkNotIsSet(useContextIsSet(), "useContext");
      this.useContext = useContext.orElse(null);
      optBits |= OPT_BIT_USE_CONTEXT;
      return this;
    }

    /**
     * Initializes the value for the {@link CompartmentDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CompartmentDefinition#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for chained invocation
     */
    public final Builder search(boolean search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = search;
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("search")
    public final Builder search(Optional<Boolean> search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = search.orElse(null);
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#language() language} to language.
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
     * Initializes the optional value {@link CompartmentDefinition#language() language} to language.
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
     * Initializes the optional value {@link CompartmentDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(Markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<? extends Markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CompartmentdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CompartmentdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CompartmentdefinitionCode code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CompartmentdefinitionCode> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CompartmentDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CompartmentDefinition#text() text} to text.
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
     * Initializes the optional value {@link CompartmentDefinition#text() text} to text.
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
     * Initializes the optional value {@link CompartmentDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#id() id} to id.
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
     * Initializes the optional value {@link CompartmentDefinition#id() id} to id.
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
     * Initializes the optional value {@link CompartmentDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link CompartmentDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link CompartmentDefinition#name() name} to name.
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
     * Initializes the optional value {@link CompartmentDefinition#name() name} to name.
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
     * Initializes the optional value {@link CompartmentDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link CompartmentDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link CompartmentDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(List<CompartmentDefinition_Resource> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends List<CompartmentDefinition_Resource>> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Builds a new {@link CompartmentDefinition CompartmentDefinition}.
     * @return An immutable instance of CompartmentDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CompartmentDefinition build() {
      checkRequiredAttributes();
      return new ImmutableCompartmentDefinition(
          publisher,
          experimental,
          date,
          purpose,
          meta,
          modifierExtension,
          contact,
          url,
          useContext,
          resourceType,
          search,
          language,
          description,
          status,
          code,
          implicitRules,
          text,
          version,
          id,
          contained,
          name,
          extension,
          resource);
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean searchIsSet() {
      return (optBits & OPT_BIT_SEARCH) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CompartmentDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CompartmentDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CompartmentDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CompartmentDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "CompartmentDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CompartmentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link CompartmentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link CompartmentDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link CompartmentDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link CompartmentDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link CompartmentDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link CompartmentDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link CompartmentDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link CompartmentDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link CompartmentDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link CompartmentDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CompartmentDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CompartmentDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link CompartmentDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link CompartmentDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link CompartmentDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link CompartmentDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link CompartmentDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link CompartmentDefinition#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for chained invocation
     */
    BuildFinal search(boolean search);

    /**
     * Initializes the optional value {@link CompartmentDefinition#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal search(Optional<Boolean> search);

    /**
     * Initializes the optional value {@link CompartmentDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link CompartmentDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link CompartmentDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link CompartmentDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link CompartmentDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(CompartmentdefinitionStatus status);

    /**
     * Initializes the optional value {@link CompartmentDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends CompartmentdefinitionStatus> status);

    /**
     * Initializes the optional value {@link CompartmentDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CompartmentdefinitionCode code);

    /**
     * Initializes the optional value {@link CompartmentDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CompartmentdefinitionCode> code);

    /**
     * Initializes the optional value {@link CompartmentDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link CompartmentDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link CompartmentDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link CompartmentDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link CompartmentDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link CompartmentDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link CompartmentDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link CompartmentDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link CompartmentDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link CompartmentDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link CompartmentDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link CompartmentDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link CompartmentDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CompartmentDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link CompartmentDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resource(List<CompartmentDefinition_Resource> resource);

    /**
     * Initializes the optional value {@link CompartmentDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resource(Optional<? extends List<CompartmentDefinition_Resource>> resource);

    /**
     * Builds a new {@link CompartmentDefinition CompartmentDefinition}.
     * @return An immutable instance of CompartmentDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CompartmentDefinition build();
  }
}
