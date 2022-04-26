package com.fhir.types.fhir;

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
 * Immutable implementation of {@link StructureMap}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap.builder()}.
 */
@Generated(from = "StructureMap", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap implements StructureMap {
  private final @Nullable StructuremapStatus status;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable List<Canonical> _import;
  private final @Nullable List<StructureMap_Structure> structure;
  private final List<StructureMap_Group> group;
  private final @Nullable List<Extension> extension;
  private final @Nullable String version;
  private final String resourceType;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable String name;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Id id;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable String publisher;
  private final @Nullable Meta meta;
  private final @Nullable Markdown purpose;
  private final @Nullable Narrative text;
  private final @Nullable Uri implicitRules;
  private final @Nullable Markdown copyright;
  private final @Nullable Code language;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable DateTime date;
  private final @Nullable Uri url;
  private final @Nullable Boolean experimental;
  private final @Nullable Markdown description;
  private final @Nullable String title;

  private ImmutableStructureMap(
      @Nullable StructuremapStatus status,
      @Nullable List<UsageContext> useContext,
      @Nullable List<ContactDetail> contact,
      @Nullable List<Canonical> _import,
      @Nullable List<StructureMap_Structure> structure,
      List<StructureMap_Group> group,
      @Nullable List<Extension> extension,
      @Nullable String version,
      String resourceType,
      @Nullable List<ResourceList> contained,
      @Nullable String name,
      @Nullable List<Extension> modifierExtension,
      @Nullable Id id,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable String publisher,
      @Nullable Meta meta,
      @Nullable Markdown purpose,
      @Nullable Narrative text,
      @Nullable Uri implicitRules,
      @Nullable Markdown copyright,
      @Nullable Code language,
      @Nullable List<Identifier> identifier,
      @Nullable DateTime date,
      @Nullable Uri url,
      @Nullable Boolean experimental,
      @Nullable Markdown description,
      @Nullable String title) {
    this.status = status;
    this.useContext = useContext;
    this.contact = contact;
    this._import = _import;
    this.structure = structure;
    this.group = group;
    this.extension = extension;
    this.version = version;
    this.resourceType = resourceType;
    this.contained = contained;
    this.name = name;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.jurisdiction = jurisdiction;
    this.publisher = publisher;
    this.meta = meta;
    this.purpose = purpose;
    this.text = text;
    this.implicitRules = implicitRules;
    this.copyright = copyright;
    this.language = language;
    this.identifier = identifier;
    this.date = date;
    this.url = url;
    this.experimental = experimental;
    this.description = description;
    this.title = title;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<StructuremapStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code _import} attribute
   */
  @JsonProperty("import")
  @Override
  public Optional<List<Canonical>> _import() {
    return Optional.ofNullable(_import);
  }

  /**
   * @return The value of the {@code structure} attribute
   */
  @JsonProperty("structure")
  @Override
  public Optional<List<StructureMap_Structure>> structure() {
    return Optional.ofNullable(structure);
  }

  /**
   * @return The value of the {@code group} attribute
   */
  @JsonProperty("group")
  @Override
  public List<StructureMap_Group> group() {
    return group;
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
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withStatus(StructuremapStatus value) {
    @Nullable StructuremapStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableStructureMap(
        newValue,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withStatus(Optional<? extends StructuremapStatus> optional) {
    @Nullable StructuremapStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableStructureMap(
        value,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        newValue,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableStructureMap(
        this.status,
        value,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        newValue,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        value,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#_import() _import} attribute.
   * @param value The value for _import
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap with_import(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "_import");
    if (this._import == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        newValue,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#_import() _import} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _import
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap with_import(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this._import == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        value,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#structure() structure} attribute.
   * @param value The value for structure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withStructure(List<StructureMap_Structure> value) {
    @Nullable List<StructureMap_Structure> newValue = Objects.requireNonNull(value, "structure");
    if (this.structure == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        newValue,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#structure() structure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for structure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withStructure(Optional<? extends List<StructureMap_Structure>> optional) {
    @Nullable List<StructureMap_Structure> value = optional.orElse(null);
    if (this.structure == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        value,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap#group() group}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withGroup(StructureMap_Group... elements) {
    List<StructureMap_Group> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        newValue,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap#group() group}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of group elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withGroup(Iterable<? extends StructureMap_Group> elements) {
    if (this.group == elements) return this;
    List<StructureMap_Group> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        newValue,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        newValue,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        value,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        newValue,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        value,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StructureMap#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStructureMap withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        newValue,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        newValue,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        value,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        newValue,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        value,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        newValue,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        value,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        newValue,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        value,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        newValue,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        value,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        newValue,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        value,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        newValue,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        value,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        newValue,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        value,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        newValue,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        value,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        newValue,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        value,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        newValue,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        value,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        newValue,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        value,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        newValue,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        value,
        this.date,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        newValue,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        value,
        this.url,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        newValue,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        value,
        this.experimental,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        newValue,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        value,
        this.description,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        newValue,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        value,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableStructureMap(
        this.status,
        this.useContext,
        this.contact,
        this._import,
        this.structure,
        this.group,
        this.extension,
        this.version,
        this.resourceType,
        this.contained,
        this.name,
        this.modifierExtension,
        this.id,
        this.jurisdiction,
        this.publisher,
        this.meta,
        this.purpose,
        this.text,
        this.implicitRules,
        this.copyright,
        this.language,
        this.identifier,
        this.date,
        this.url,
        this.experimental,
        this.description,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap
        && equalTo((ImmutableStructureMap) another);
  }

  private boolean equalTo(ImmutableStructureMap another) {
    return Objects.equals(status, another.status)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(contact, another.contact)
        && Objects.equals(_import, another._import)
        && Objects.equals(structure, another.structure)
        && group.equals(another.group)
        && Objects.equals(extension, another.extension)
        && Objects.equals(version, another.version)
        && resourceType.equals(another.resourceType)
        && Objects.equals(contained, another.contained)
        && Objects.equals(name, another.name)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(meta, another.meta)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(text, another.text)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(language, another.language)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(date, another.date)
        && Objects.equals(url, another.url)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(description, another.description)
        && Objects.equals(title, another.title);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code useContext}, {@code contact}, {@code _import}, {@code structure}, {@code group}, {@code extension}, {@code version}, {@code resourceType}, {@code contained}, {@code name}, {@code modifierExtension}, {@code id}, {@code jurisdiction}, {@code publisher}, {@code meta}, {@code purpose}, {@code text}, {@code implicitRules}, {@code copyright}, {@code language}, {@code identifier}, {@code date}, {@code url}, {@code experimental}, {@code description}, {@code title}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(_import);
    h += (h << 5) + Objects.hashCode(structure);
    h += (h << 5) + group.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(title);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureMap{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (useContext != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (contact != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (_import != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("_import=").append(_import);
    }
    if (structure != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("structure=").append(structure);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("group=").append(group);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureMap", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureMap {
    @Nullable Optional<StructuremapStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<Canonical>> _import = Optional.empty();
    boolean _importIsSet;
    @Nullable Optional<List<StructureMap_Structure>> structure = Optional.empty();
    boolean structureIsSet;
    @Nullable List<StructureMap_Group> group = Collections.emptyList();
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @JsonProperty("status")
    public void setStatus(Optional<StructuremapStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("import")
    public void set_import(Optional<List<Canonical>> _import) {
      this._import = _import;
      this._importIsSet = true;
    }
    @JsonProperty("structure")
    public void setStructure(Optional<List<StructureMap_Structure>> structure) {
      this.structure = structure;
      this.structureIsSet = true;
    }
    @JsonProperty("group")
    public void setGroup(List<StructureMap_Group> group) {
      this.group = group;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @Override
    public Optional<StructuremapStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> _import() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<StructureMap_Structure>> structure() { throw new UnsupportedOperationException(); }
    @Override
    public List<StructureMap_Group> group() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap fromJson(Json json) {
    ImmutableStructureMap.Builder builder = ((ImmutableStructureMap.Builder) ImmutableStructureMap.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json._importIsSet) {
      builder._import(json._import);
    }
    if (json.structureIsSet) {
      builder.structure(json.structure);
    }
    if (json.group != null) {
      builder.addAllGroup(json.group);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    return (ImmutableStructureMap) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap instance
   */
  public static StructureMap copyOf(StructureMap instance) {
    if (instance instanceof ImmutableStructureMap) {
      return (ImmutableStructureMap) instance;
    }
    return ((ImmutableStructureMap.Builder) ImmutableStructureMap.builder())
        .status(instance.status())
        .useContext(instance.useContext())
        .contact(instance.contact())
        ._import(instance._import())
        .structure(instance.structure())
        .addAllGroup(instance.group())
        .extension(instance.extension())
        .version(instance.version())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .name(instance.name())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .jurisdiction(instance.jurisdiction())
        .publisher(instance.publisher())
        .meta(instance.meta())
        .purpose(instance.purpose())
        .text(instance.text())
        .implicitRules(instance.implicitRules())
        .copyright(instance.copyright())
        .language(instance.language())
        .identifier(instance.identifier())
        .date(instance.date())
        .url(instance.url())
        .experimental(instance.experimental())
        .description(instance.description())
        .title(instance.title())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap StructureMap}.
   * <pre>
   * ImmutableStructureMap.builder()
   *    .status(com.fhir.types.fhir.StructuremapStatus) // optional {@link StructureMap#status() status}
   *    .useContext(List&amp;lt;com.fhir.types.fhir.UsageContext&amp;gt;) // optional {@link StructureMap#useContext() useContext}
   *    .contact(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link StructureMap#contact() contact}
   *    ._import(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link StructureMap#_import() _import}
   *    .structure(List&amp;lt;com.fhir.types.fhir.StructureMap_Structure&amp;gt;) // optional {@link StructureMap#structure() structure}
   *    .addGroup|addAllGroup(com.fhir.types.fhir.StructureMap_Group) // {@link StructureMap#group() group} elements
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap#extension() extension}
   *    .version(String) // optional {@link StructureMap#version() version}
   *    .resourceType(String) // required {@link StructureMap#resourceType() resourceType}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link StructureMap#contained() contained}
   *    .name(String) // optional {@link StructureMap#name() name}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap#modifierExtension() modifierExtension}
   *    .id(com.fhir.types.fhir.Id) // optional {@link StructureMap#id() id}
   *    .jurisdiction(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link StructureMap#jurisdiction() jurisdiction}
   *    .publisher(String) // optional {@link StructureMap#publisher() publisher}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link StructureMap#meta() meta}
   *    .purpose(com.fhir.types.fhir.Markdown) // optional {@link StructureMap#purpose() purpose}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link StructureMap#text() text}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link StructureMap#implicitRules() implicitRules}
   *    .copyright(com.fhir.types.fhir.Markdown) // optional {@link StructureMap#copyright() copyright}
   *    .language(com.fhir.types.fhir.Code) // optional {@link StructureMap#language() language}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link StructureMap#identifier() identifier}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link StructureMap#date() date}
   *    .url(com.fhir.types.fhir.Uri) // optional {@link StructureMap#url() url}
   *    .experimental(Boolean) // optional {@link StructureMap#experimental() experimental}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link StructureMap#description() description}
   *    .title(String) // optional {@link StructureMap#title() title}
   *    .build();
   * </pre>
   * @return A new StructureMap builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableStructureMap.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap StructureMap}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StructureMap", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_USE_CONTEXT = 0x2L;
    private static final long OPT_BIT_CONTACT = 0x4L;
    private static final long OPT_BIT__IMPORT = 0x8L;
    private static final long OPT_BIT_STRUCTURE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_VERSION = 0x40L;
    private static final long OPT_BIT_CONTAINED = 0x80L;
    private static final long OPT_BIT_NAME = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_JURISDICTION = 0x800L;
    private static final long OPT_BIT_PUBLISHER = 0x1000L;
    private static final long OPT_BIT_META = 0x2000L;
    private static final long OPT_BIT_PURPOSE = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private static final long OPT_BIT_COPYRIGHT = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_IDENTIFIER = 0x80000L;
    private static final long OPT_BIT_DATE = 0x100000L;
    private static final long OPT_BIT_URL = 0x200000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x400000L;
    private static final long OPT_BIT_DESCRIPTION = 0x800000L;
    private static final long OPT_BIT_TITLE = 0x1000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable StructuremapStatus status;
    private @Nullable List<UsageContext> useContext;
    private @Nullable List<ContactDetail> contact;
    private @Nullable List<Canonical> _import;
    private @Nullable List<StructureMap_Structure> structure;
    private final List<StructureMap_Group> group = new ArrayList<StructureMap_Group>();
    private @Nullable List<Extension> extension;
    private @Nullable String version;
    private @Nullable String resourceType;
    private @Nullable List<ResourceList> contained;
    private @Nullable String name;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Id id;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable String publisher;
    private @Nullable Meta meta;
    private @Nullable Markdown purpose;
    private @Nullable Narrative text;
    private @Nullable Uri implicitRules;
    private @Nullable Markdown copyright;
    private @Nullable Code language;
    private @Nullable List<Identifier> identifier;
    private @Nullable DateTime date;
    private @Nullable Uri url;
    private @Nullable Boolean experimental;
    private @Nullable Markdown description;
    private @Nullable String title;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(StructuremapStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends StructuremapStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link StructureMap#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link StructureMap#contact() contact} to contact.
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
     * Initializes the optional value {@link StructureMap#contact() contact} to contact.
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
     * Initializes the optional value {@link StructureMap#_import() _import} to _import.
     * @param _import The value for _import
     * @return {@code this} builder for chained invocation
     */
    public final Builder _import(List<Canonical> _import) {
      checkNotIsSet(_importIsSet(), "_import");
      this._import = Objects.requireNonNull(_import, "_import");
      optBits |= OPT_BIT__IMPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#_import() _import} to _import.
     * @param _import The value for _import
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("import")
    public final Builder _import(Optional<? extends List<Canonical>> _import) {
      checkNotIsSet(_importIsSet(), "_import");
      this._import = _import.orElse(null);
      optBits |= OPT_BIT__IMPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for chained invocation
     */
    public final Builder structure(List<StructureMap_Structure> structure) {
      checkNotIsSet(structureIsSet(), "structure");
      this.structure = Objects.requireNonNull(structure, "structure");
      optBits |= OPT_BIT_STRUCTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("structure")
    public final Builder structure(Optional<? extends List<StructureMap_Structure>> structure) {
      checkNotIsSet(structureIsSet(), "structure");
      this.structure = structure.orElse(null);
      optBits |= OPT_BIT_STRUCTURE;
      return this;
    }

    /**
     * Adds one element to {@link StructureMap#group() group} list.
     * @param element A group element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGroup(StructureMap_Group element) {
      this.group.add(Objects.requireNonNull(element, "group element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureMap#group() group} list.
     * @param elements An array of group elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addGroup(StructureMap_Group... elements) {
      for (StructureMap_Group element : elements) {
        this.group.add(Objects.requireNonNull(element, "group element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link StructureMap#group() group} list.
     * @param elements An iterable of group elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllGroup(Iterable<? extends StructureMap_Group> elements) {
      for (StructureMap_Group element : elements) {
        this.group.add(Objects.requireNonNull(element, "group element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap#version() version} to version.
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
     * Initializes the optional value {@link StructureMap#version() version} to version.
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
     * Initializes the value for the {@link StructureMap#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link StructureMap#contained() contained} to contained.
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
     * Initializes the optional value {@link StructureMap#contained() contained} to contained.
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
     * Initializes the optional value {@link StructureMap#name() name} to name.
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
     * Initializes the optional value {@link StructureMap#name() name} to name.
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
     * Initializes the optional value {@link StructureMap#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap#id() id} to id.
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
     * Initializes the optional value {@link StructureMap#id() id} to id.
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
     * Initializes the optional value {@link StructureMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(List<CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdiction")
    public final Builder jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link StructureMap#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link StructureMap#meta() meta} to meta.
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
     * Initializes the optional value {@link StructureMap#meta() meta} to meta.
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
     * Initializes the optional value {@link StructureMap#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link StructureMap#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link StructureMap#text() text} to text.
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
     * Initializes the optional value {@link StructureMap#text() text} to text.
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
     * Initializes the optional value {@link StructureMap#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link StructureMap#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link StructureMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    public final Builder copyright(Markdown copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = Objects.requireNonNull(copyright, "copyright");
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("copyright")
    public final Builder copyright(Optional<? extends Markdown> copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = copyright.orElse(null);
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#language() language} to language.
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
     * Initializes the optional value {@link StructureMap#language() language} to language.
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
     * Initializes the optional value {@link StructureMap#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link StructureMap#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link StructureMap#date() date} to date.
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
     * Initializes the optional value {@link StructureMap#date() date} to date.
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
     * Initializes the optional value {@link StructureMap#url() url} to url.
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
     * Initializes the optional value {@link StructureMap#url() url} to url.
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
     * Initializes the optional value {@link StructureMap#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link StructureMap#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link StructureMap#description() description} to description.
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
     * Initializes the optional value {@link StructureMap#description() description} to description.
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
     * Initializes the optional value {@link StructureMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Builds a new {@link StructureMap StructureMap}.
     * @return An immutable instance of StructureMap
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureMap build() {
      checkRequiredAttributes();
      return new ImmutableStructureMap(
          status,
          useContext,
          contact,
          _import,
          structure,
          createUnmodifiableList(true, group),
          extension,
          version,
          resourceType,
          contained,
          name,
          modifierExtension,
          id,
          jurisdiction,
          publisher,
          meta,
          purpose,
          text,
          implicitRules,
          copyright,
          language,
          identifier,
          date,
          url,
          experimental,
          description,
          title);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean _importIsSet() {
      return (optBits & OPT_BIT__IMPORT) != 0;
    }

    private boolean structureIsSet() {
      return (optBits & OPT_BIT_STRUCTURE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureMap is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build StructureMap, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "StructureMap", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link StructureMap#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "StructureMap", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link StructureMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(StructuremapStatus status);

    /**
     * Initializes the optional value {@link StructureMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends StructuremapStatus> status);

    /**
     * Initializes the optional value {@link StructureMap#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link StructureMap#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link StructureMap#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link StructureMap#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link StructureMap#_import() _import} to _import.
     * @param _import The value for _import
     * @return {@code this} builder for chained invocation
     */
    BuildFinal _import(List<Canonical> _import);

    /**
     * Initializes the optional value {@link StructureMap#_import() _import} to _import.
     * @param _import The value for _import
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _import(Optional<? extends List<Canonical>> _import);

    /**
     * Initializes the optional value {@link StructureMap#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal structure(List<StructureMap_Structure> structure);

    /**
     * Initializes the optional value {@link StructureMap#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal structure(Optional<? extends List<StructureMap_Structure>> structure);

    /**
     * Adds one element to {@link StructureMap#group() group} list.
     * @param element A group element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addGroup(StructureMap_Group element);

    /**
     * Adds elements to {@link StructureMap#group() group} list.
     * @param elements An array of group elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addGroup(StructureMap_Group... elements);

    /**
     * Adds elements to {@link StructureMap#group() group} list.
     * @param elements An iterable of group elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllGroup(Iterable<? extends StructureMap_Group> elements);

    /**
     * Initializes the optional value {@link StructureMap#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link StructureMap#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link StructureMap#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link StructureMap#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link StructureMap#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link StructureMap#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link StructureMap#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link StructureMap#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link StructureMap#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link StructureMap#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link StructureMap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link StructureMap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link StructureMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link StructureMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link StructureMap#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link StructureMap#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link StructureMap#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link StructureMap#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link StructureMap#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link StructureMap#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link StructureMap#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link StructureMap#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link StructureMap#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link StructureMap#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link StructureMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link StructureMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link StructureMap#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link StructureMap#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link StructureMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link StructureMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link StructureMap#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link StructureMap#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link StructureMap#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link StructureMap#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link StructureMap#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link StructureMap#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link StructureMap#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link StructureMap#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link StructureMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link StructureMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Builds a new {@link StructureMap StructureMap}.
     * @return An immutable instance of StructureMap
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    StructureMap build();
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
