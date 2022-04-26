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
 * Immutable implementation of {@link CodeSystem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem.builder()}.
 */
@Generated(from = "CodeSystem", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem implements CodeSystem {
  private final @Nullable Meta meta;
  private final @Nullable String publisher;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable List<CodeSystem_Concept> concept;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final @Nullable String title;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable DateTime date;
  private final @Nullable CodesystemHierarchymeaning hierarchyMeaning;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Canonical valueSet;
  private final @Nullable Uri url;
  private final @Nullable Markdown description;
  private final @Nullable Boolean versionNeeded;
  private final @Nullable List<CodeSystem_Filter> filter;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final @Nullable Canonical supplements;
  private final String resourceType;
  private final @Nullable Markdown purpose;
  private final @Nullable UnsignedInt count;
  private final @Nullable Narrative text;
  private final @Nullable List<CodeSystem_Property> property;
  private final @Nullable CodesystemContent content;
  private final @Nullable Boolean experimental;
  private final @Nullable CodesystemStatus status;
  private final @Nullable Uri implicitRules;
  private final @Nullable String name;
  private final @Nullable String version;
  private final @Nullable Boolean caseSensitive;
  private final @Nullable Boolean compositional;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Markdown copyright;

  private ImmutableCodeSystem(
      @Nullable Meta meta,
      @Nullable String publisher,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable List<CodeSystem_Concept> concept,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      @Nullable String title,
      @Nullable List<UsageContext> useContext,
      @Nullable DateTime date,
      @Nullable CodesystemHierarchymeaning hierarchyMeaning,
      @Nullable List<ResourceList> contained,
      @Nullable Canonical valueSet,
      @Nullable Uri url,
      @Nullable Markdown description,
      @Nullable Boolean versionNeeded,
      @Nullable List<CodeSystem_Filter> filter,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      @Nullable Canonical supplements,
      String resourceType,
      @Nullable Markdown purpose,
      @Nullable UnsignedInt count,
      @Nullable Narrative text,
      @Nullable List<CodeSystem_Property> property,
      @Nullable CodesystemContent content,
      @Nullable Boolean experimental,
      @Nullable CodesystemStatus status,
      @Nullable Uri implicitRules,
      @Nullable String name,
      @Nullable String version,
      @Nullable Boolean caseSensitive,
      @Nullable Boolean compositional,
      @Nullable List<ContactDetail> contact,
      @Nullable Markdown copyright) {
    this.meta = meta;
    this.publisher = publisher;
    this.jurisdiction = jurisdiction;
    this.concept = concept;
    this.identifier = identifier;
    this.id = id;
    this.title = title;
    this.useContext = useContext;
    this.date = date;
    this.hierarchyMeaning = hierarchyMeaning;
    this.contained = contained;
    this.valueSet = valueSet;
    this.url = url;
    this.description = description;
    this.versionNeeded = versionNeeded;
    this.filter = filter;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.language = language;
    this.supplements = supplements;
    this.resourceType = resourceType;
    this.purpose = purpose;
    this.count = count;
    this.text = text;
    this.property = property;
    this.content = content;
    this.experimental = experimental;
    this.status = status;
    this.implicitRules = implicitRules;
    this.name = name;
    this.version = version;
    this.caseSensitive = caseSensitive;
    this.compositional = compositional;
    this.contact = contact;
    this.copyright = copyright;
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
   * @return The value of the {@code publisher} attribute
   */
  @JsonProperty("publisher")
  @Override
  public Optional<String> publisher() {
    return Optional.ofNullable(publisher);
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
   * @return The value of the {@code concept} attribute
   */
  @JsonProperty("concept")
  @Override
  public Optional<List<CodeSystem_Concept>> concept() {
    return Optional.ofNullable(concept);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code hierarchyMeaning} attribute
   */
  @JsonProperty("hierarchyMeaning")
  @Override
  public Optional<CodesystemHierarchymeaning> hierarchyMeaning() {
    return Optional.ofNullable(hierarchyMeaning);
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
   * @return The value of the {@code valueSet} attribute
   */
  @JsonProperty("valueSet")
  @Override
  public Optional<Canonical> valueSet() {
    return Optional.ofNullable(valueSet);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code versionNeeded} attribute
   */
  @JsonProperty("versionNeeded")
  @Override
  public Optional<Boolean> versionNeeded() {
    return Optional.ofNullable(versionNeeded);
  }

  /**
   * @return The value of the {@code filter} attribute
   */
  @JsonProperty("filter")
  @Override
  public Optional<List<CodeSystem_Filter>> filter() {
    return Optional.ofNullable(filter);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code supplements} attribute
   */
  @JsonProperty("supplements")
  @Override
  public Optional<Canonical> supplements() {
    return Optional.ofNullable(supplements);
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
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<Markdown> purpose() {
    return Optional.ofNullable(purpose);
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @JsonProperty("count")
  @Override
  public Optional<UnsignedInt> count() {
    return Optional.ofNullable(count);
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
   * @return The value of the {@code property} attribute
   */
  @JsonProperty("property")
  @Override
  public Optional<List<CodeSystem_Property>> property() {
    return Optional.ofNullable(property);
  }

  /**
   * @return The value of the {@code content} attribute
   */
  @JsonProperty("content")
  @Override
  public Optional<CodesystemContent> content() {
    return Optional.ofNullable(content);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CodesystemStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code caseSensitive} attribute
   */
  @JsonProperty("caseSensitive")
  @Override
  public Optional<Boolean> caseSensitive() {
    return Optional.ofNullable(caseSensitive);
  }

  /**
   * @return The value of the {@code compositional} attribute
   */
  @JsonProperty("compositional")
  @Override
  public Optional<Boolean> compositional() {
    return Optional.ofNullable(compositional);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCodeSystem(
        newValue,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCodeSystem(
        value,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        newValue,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        value,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        newValue,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        value,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#concept() concept} attribute.
   * @param value The value for concept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withConcept(List<CodeSystem_Concept> value) {
    @Nullable List<CodeSystem_Concept> newValue = Objects.requireNonNull(value, "concept");
    if (this.concept == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        newValue,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#concept() concept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for concept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withConcept(Optional<? extends List<CodeSystem_Concept>> optional) {
    @Nullable List<CodeSystem_Concept> value = optional.orElse(null);
    if (this.concept == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        value,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        newValue,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        value,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        newValue,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        value,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        newValue,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        value,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        newValue,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        value,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        newValue,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        value,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} attribute.
   * @param value The value for hierarchyMeaning
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withHierarchyMeaning(CodesystemHierarchymeaning value) {
    @Nullable CodesystemHierarchymeaning newValue = Objects.requireNonNull(value, "hierarchyMeaning");
    if (this.hierarchyMeaning == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        newValue,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hierarchyMeaning
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withHierarchyMeaning(Optional<? extends CodesystemHierarchymeaning> optional) {
    @Nullable CodesystemHierarchymeaning value = optional.orElse(null);
    if (this.hierarchyMeaning == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        value,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        newValue,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        value,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#valueSet() valueSet} attribute.
   * @param value The value for valueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withValueSet(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "valueSet");
    if (this.valueSet == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        newValue,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#valueSet() valueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withValueSet(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.valueSet == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        value,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        newValue,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        value,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        newValue,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        value,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#versionNeeded() versionNeeded} attribute.
   * @param value The value for versionNeeded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withVersionNeeded(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.versionNeeded, newValue)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        newValue,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#versionNeeded() versionNeeded} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versionNeeded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withVersionNeeded(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.versionNeeded, value)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        value,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#filter() filter} attribute.
   * @param value The value for filter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withFilter(List<CodeSystem_Filter> value) {
    @Nullable List<CodeSystem_Filter> newValue = Objects.requireNonNull(value, "filter");
    if (this.filter == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        newValue,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#filter() filter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for filter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withFilter(Optional<? extends List<CodeSystem_Filter>> optional) {
    @Nullable List<CodeSystem_Filter> value = optional.orElse(null);
    if (this.filter == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        value,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        newValue,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        value,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        newValue,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        value,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        newValue,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        value,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#supplements() supplements} attribute.
   * @param value The value for supplements
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withSupplements(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "supplements");
    if (this.supplements == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        newValue,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#supplements() supplements} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supplements
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withSupplements(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.supplements == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        value,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CodeSystem#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCodeSystem withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        newValue,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        newValue,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        value,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#count() count} attribute.
   * @param value The value for count
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCount(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "count");
    if (this.count == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        newValue,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#count() count} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for count
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withCount(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.count == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        value,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        newValue,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        value,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withProperty(List<CodeSystem_Property> value) {
    @Nullable List<CodeSystem_Property> newValue = Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        newValue,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withProperty(Optional<? extends List<CodeSystem_Property>> optional) {
    @Nullable List<CodeSystem_Property> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        value,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#content() content} attribute.
   * @param value The value for content
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withContent(CodesystemContent value) {
    @Nullable CodesystemContent newValue = Objects.requireNonNull(value, "content");
    if (this.content == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        newValue,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#content() content} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for content
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withContent(Optional<? extends CodesystemContent> optional) {
    @Nullable CodesystemContent value = optional.orElse(null);
    if (this.content == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        value,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        newValue,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        value,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withStatus(CodesystemStatus value) {
    @Nullable CodesystemStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        newValue,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withStatus(Optional<? extends CodesystemStatus> optional) {
    @Nullable CodesystemStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        value,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        newValue,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        value,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        newValue,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        value,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        newValue,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        value,
        this.caseSensitive,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#caseSensitive() caseSensitive} attribute.
   * @param value The value for caseSensitive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCaseSensitive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.caseSensitive, newValue)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        newValue,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#caseSensitive() caseSensitive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for caseSensitive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCaseSensitive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.caseSensitive, value)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        value,
        this.compositional,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#compositional() compositional} attribute.
   * @param value The value for compositional
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCompositional(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.compositional, newValue)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        newValue,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#compositional() compositional} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compositional
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCompositional(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.compositional, value)) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        value,
        this.contact,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        newValue,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        value,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableCodeSystem(
        this.meta,
        this.publisher,
        this.jurisdiction,
        this.concept,
        this.identifier,
        this.id,
        this.title,
        this.useContext,
        this.date,
        this.hierarchyMeaning,
        this.contained,
        this.valueSet,
        this.url,
        this.description,
        this.versionNeeded,
        this.filter,
        this.modifierExtension,
        this.extension,
        this.language,
        this.supplements,
        this.resourceType,
        this.purpose,
        this.count,
        this.text,
        this.property,
        this.content,
        this.experimental,
        this.status,
        this.implicitRules,
        this.name,
        this.version,
        this.caseSensitive,
        this.compositional,
        this.contact,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem
        && equalTo((ImmutableCodeSystem) another);
  }

  private boolean equalTo(ImmutableCodeSystem another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(concept, another.concept)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && Objects.equals(title, another.title)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(date, another.date)
        && Objects.equals(hierarchyMeaning, another.hierarchyMeaning)
        && Objects.equals(contained, another.contained)
        && Objects.equals(valueSet, another.valueSet)
        && Objects.equals(url, another.url)
        && Objects.equals(description, another.description)
        && Objects.equals(versionNeeded, another.versionNeeded)
        && Objects.equals(filter, another.filter)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && Objects.equals(supplements, another.supplements)
        && resourceType.equals(another.resourceType)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(count, another.count)
        && Objects.equals(text, another.text)
        && Objects.equals(property, another.property)
        && Objects.equals(content, another.content)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(status, another.status)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(name, another.name)
        && Objects.equals(version, another.version)
        && Objects.equals(caseSensitive, another.caseSensitive)
        && Objects.equals(compositional, another.compositional)
        && Objects.equals(contact, another.contact)
        && Objects.equals(copyright, another.copyright);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code publisher}, {@code jurisdiction}, {@code concept}, {@code identifier}, {@code id}, {@code title}, {@code useContext}, {@code date}, {@code hierarchyMeaning}, {@code contained}, {@code valueSet}, {@code url}, {@code description}, {@code versionNeeded}, {@code filter}, {@code modifierExtension}, {@code extension}, {@code language}, {@code supplements}, {@code resourceType}, {@code purpose}, {@code count}, {@code text}, {@code property}, {@code content}, {@code experimental}, {@code status}, {@code implicitRules}, {@code name}, {@code version}, {@code caseSensitive}, {@code compositional}, {@code contact}, {@code copyright}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(concept);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(hierarchyMeaning);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(valueSet);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(versionNeeded);
    h += (h << 5) + Objects.hashCode(filter);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(supplements);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(count);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(property);
    h += (h << 5) + Objects.hashCode(content);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(caseSensitive);
    h += (h << 5) + Objects.hashCode(compositional);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(copyright);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CodeSystem{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (publisher != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (jurisdiction != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (concept != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("concept=").append(concept);
    }
    if (identifier != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (title != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (useContext != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (date != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (hierarchyMeaning != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("hierarchyMeaning=").append(hierarchyMeaning);
    }
    if (contained != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (valueSet != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("valueSet=").append(valueSet);
    }
    if (url != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (description != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (versionNeeded != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("versionNeeded=").append(versionNeeded);
    }
    if (filter != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("filter=").append(filter);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (supplements != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("supplements=").append(supplements);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (count != null) {
      builder.append(", ");
      builder.append("count=").append(count);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (property != null) {
      builder.append(", ");
      builder.append("property=").append(property);
    }
    if (content != null) {
      builder.append(", ");
      builder.append("content=").append(content);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (caseSensitive != null) {
      builder.append(", ");
      builder.append("caseSensitive=").append(caseSensitive);
    }
    if (compositional != null) {
      builder.append(", ");
      builder.append("compositional=").append(compositional);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CodeSystem", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CodeSystem {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<CodeSystem_Concept>> concept = Optional.empty();
    boolean conceptIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<CodesystemHierarchymeaning> hierarchyMeaning = Optional.empty();
    boolean hierarchyMeaningIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Canonical> valueSet = Optional.empty();
    boolean valueSetIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Boolean> versionNeeded = Optional.empty();
    boolean versionNeededIsSet;
    @Nullable Optional<List<CodeSystem_Filter>> filter = Optional.empty();
    boolean filterIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Canonical> supplements = Optional.empty();
    boolean supplementsIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<UnsignedInt> count = Optional.empty();
    boolean countIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<CodeSystem_Property>> property = Optional.empty();
    boolean propertyIsSet;
    @Nullable Optional<CodesystemContent> content = Optional.empty();
    boolean contentIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<CodesystemStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<Boolean> caseSensitive = Optional.empty();
    boolean caseSensitiveIsSet;
    @Nullable Optional<Boolean> compositional = Optional.empty();
    boolean compositionalIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("concept")
    public void setConcept(Optional<List<CodeSystem_Concept>> concept) {
      this.concept = concept;
      this.conceptIsSet = true;
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
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("hierarchyMeaning")
    public void setHierarchyMeaning(Optional<CodesystemHierarchymeaning> hierarchyMeaning) {
      this.hierarchyMeaning = hierarchyMeaning;
      this.hierarchyMeaningIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("valueSet")
    public void setValueSet(Optional<Canonical> valueSet) {
      this.valueSet = valueSet;
      this.valueSetIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("versionNeeded")
    public void setVersionNeeded(Optional<Boolean> versionNeeded) {
      this.versionNeeded = versionNeeded;
      this.versionNeededIsSet = true;
    }
    @JsonProperty("filter")
    public void setFilter(Optional<List<CodeSystem_Filter>> filter) {
      this.filter = filter;
      this.filterIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("supplements")
    public void setSupplements(Optional<Canonical> supplements) {
      this.supplements = supplements;
      this.supplementsIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("count")
    public void setCount(Optional<UnsignedInt> count) {
      this.count = count;
      this.countIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("property")
    public void setProperty(Optional<List<CodeSystem_Property>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @JsonProperty("content")
    public void setContent(Optional<CodesystemContent> content) {
      this.content = content;
      this.contentIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<CodesystemStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("caseSensitive")
    public void setCaseSensitive(Optional<Boolean> caseSensitive) {
      this.caseSensitive = caseSensitive;
      this.caseSensitiveIsSet = true;
    }
    @JsonProperty("compositional")
    public void setCompositional(Optional<Boolean> compositional) {
      this.compositional = compositional;
      this.compositionalIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeSystem_Concept>> concept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodesystemHierarchymeaning> hierarchyMeaning() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> valueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> versionNeeded() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeSystem_Filter>> filter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> supplements() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> count() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeSystem_Property>> property() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodesystemContent> content() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodesystemStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> caseSensitive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> compositional() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem fromJson(Json json) {
    ImmutableCodeSystem.Builder builder = ((ImmutableCodeSystem.Builder) ImmutableCodeSystem.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.conceptIsSet) {
      builder.concept(json.concept);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.hierarchyMeaningIsSet) {
      builder.hierarchyMeaning(json.hierarchyMeaning);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.valueSetIsSet) {
      builder.valueSet(json.valueSet);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.versionNeededIsSet) {
      builder.versionNeeded(json.versionNeeded);
    }
    if (json.filterIsSet) {
      builder.filter(json.filter);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.supplementsIsSet) {
      builder.supplements(json.supplements);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.contentIsSet) {
      builder.content(json.content);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.caseSensitiveIsSet) {
      builder.caseSensitive(json.caseSensitive);
    }
    if (json.compositionalIsSet) {
      builder.compositional(json.compositional);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    return (ImmutableCodeSystem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeSystem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeSystem instance
   */
  public static CodeSystem copyOf(CodeSystem instance) {
    if (instance instanceof ImmutableCodeSystem) {
      return (ImmutableCodeSystem) instance;
    }
    return ((ImmutableCodeSystem.Builder) ImmutableCodeSystem.builder())
        .meta(instance.meta())
        .publisher(instance.publisher())
        .jurisdiction(instance.jurisdiction())
        .concept(instance.concept())
        .identifier(instance.identifier())
        .id(instance.id())
        .title(instance.title())
        .useContext(instance.useContext())
        .date(instance.date())
        .hierarchyMeaning(instance.hierarchyMeaning())
        .contained(instance.contained())
        .valueSet(instance.valueSet())
        .url(instance.url())
        .description(instance.description())
        .versionNeeded(instance.versionNeeded())
        .filter(instance.filter())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .language(instance.language())
        .supplements(instance.supplements())
        .resourceType(instance.resourceType())
        .purpose(instance.purpose())
        .count(instance.count())
        .text(instance.text())
        .property(instance.property())
        .content(instance.content())
        .experimental(instance.experimental())
        .status(instance.status())
        .implicitRules(instance.implicitRules())
        .name(instance.name())
        .version(instance.version())
        .caseSensitive(instance.caseSensitive())
        .compositional(instance.compositional())
        .contact(instance.contact())
        .copyright(instance.copyright())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem CodeSystem}.
   * <pre>
   * ImmutableCodeSystem.builder()
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link CodeSystem#meta() meta}
   *    .publisher(String) // optional {@link CodeSystem#publisher() publisher}
   *    .jurisdiction(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link CodeSystem#jurisdiction() jurisdiction}
   *    .concept(List&amp;lt;com.fhir.types.fhir.CodeSystem_Concept&amp;gt;) // optional {@link CodeSystem#concept() concept}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link CodeSystem#identifier() identifier}
   *    .id(com.fhir.types.fhir.Id) // optional {@link CodeSystem#id() id}
   *    .title(String) // optional {@link CodeSystem#title() title}
   *    .useContext(List&amp;lt;com.fhir.types.fhir.UsageContext&amp;gt;) // optional {@link CodeSystem#useContext() useContext}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link CodeSystem#date() date}
   *    .hierarchyMeaning(com.fhir.types.fhir.CodesystemHierarchymeaning) // optional {@link CodeSystem#hierarchyMeaning() hierarchyMeaning}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link CodeSystem#contained() contained}
   *    .valueSet(com.fhir.types.fhir.Canonical) // optional {@link CodeSystem#valueSet() valueSet}
   *    .url(com.fhir.types.fhir.Uri) // optional {@link CodeSystem#url() url}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link CodeSystem#description() description}
   *    .versionNeeded(Boolean) // optional {@link CodeSystem#versionNeeded() versionNeeded}
   *    .filter(List&amp;lt;com.fhir.types.fhir.CodeSystem_Filter&amp;gt;) // optional {@link CodeSystem#filter() filter}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem#extension() extension}
   *    .language(com.fhir.types.fhir.Code) // optional {@link CodeSystem#language() language}
   *    .supplements(com.fhir.types.fhir.Canonical) // optional {@link CodeSystem#supplements() supplements}
   *    .resourceType(String) // required {@link CodeSystem#resourceType() resourceType}
   *    .purpose(com.fhir.types.fhir.Markdown) // optional {@link CodeSystem#purpose() purpose}
   *    .count(com.fhir.types.fhir.UnsignedInt) // optional {@link CodeSystem#count() count}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link CodeSystem#text() text}
   *    .property(List&amp;lt;com.fhir.types.fhir.CodeSystem_Property&amp;gt;) // optional {@link CodeSystem#property() property}
   *    .content(com.fhir.types.fhir.CodesystemContent) // optional {@link CodeSystem#content() content}
   *    .experimental(Boolean) // optional {@link CodeSystem#experimental() experimental}
   *    .status(com.fhir.types.fhir.CodesystemStatus) // optional {@link CodeSystem#status() status}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link CodeSystem#implicitRules() implicitRules}
   *    .name(String) // optional {@link CodeSystem#name() name}
   *    .version(String) // optional {@link CodeSystem#version() version}
   *    .caseSensitive(Boolean) // optional {@link CodeSystem#caseSensitive() caseSensitive}
   *    .compositional(Boolean) // optional {@link CodeSystem#compositional() compositional}
   *    .contact(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link CodeSystem#contact() contact}
   *    .copyright(com.fhir.types.fhir.Markdown) // optional {@link CodeSystem#copyright() copyright}
   *    .build();
   * </pre>
   * @return A new CodeSystem builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCodeSystem.Builder();
  }

  /**
   * Builds instances of type {@link CodeSystem CodeSystem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CodeSystem", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_PUBLISHER = 0x2L;
    private static final long OPT_BIT_JURISDICTION = 0x4L;
    private static final long OPT_BIT_CONCEPT = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_TITLE = 0x40L;
    private static final long OPT_BIT_USE_CONTEXT = 0x80L;
    private static final long OPT_BIT_DATE = 0x100L;
    private static final long OPT_BIT_HIERARCHY_MEANING = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_VALUE_SET = 0x800L;
    private static final long OPT_BIT_URL = 0x1000L;
    private static final long OPT_BIT_DESCRIPTION = 0x2000L;
    private static final long OPT_BIT_VERSION_NEEDED = 0x4000L;
    private static final long OPT_BIT_FILTER = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_SUPPLEMENTS = 0x80000L;
    private static final long OPT_BIT_PURPOSE = 0x100000L;
    private static final long OPT_BIT_COUNT = 0x200000L;
    private static final long OPT_BIT_TEXT = 0x400000L;
    private static final long OPT_BIT_PROPERTY = 0x800000L;
    private static final long OPT_BIT_CONTENT = 0x1000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x2000000L;
    private static final long OPT_BIT_STATUS = 0x4000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000000L;
    private static final long OPT_BIT_NAME = 0x10000000L;
    private static final long OPT_BIT_VERSION = 0x20000000L;
    private static final long OPT_BIT_CASE_SENSITIVE = 0x40000000L;
    private static final long OPT_BIT_COMPOSITIONAL = 0x80000000L;
    private static final long OPT_BIT_CONTACT = 0x100000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable String publisher;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable List<CodeSystem_Concept> concept;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private @Nullable String title;
    private @Nullable List<UsageContext> useContext;
    private @Nullable DateTime date;
    private @Nullable CodesystemHierarchymeaning hierarchyMeaning;
    private @Nullable List<ResourceList> contained;
    private @Nullable Canonical valueSet;
    private @Nullable Uri url;
    private @Nullable Markdown description;
    private @Nullable Boolean versionNeeded;
    private @Nullable List<CodeSystem_Filter> filter;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable Canonical supplements;
    private @Nullable String resourceType;
    private @Nullable Markdown purpose;
    private @Nullable UnsignedInt count;
    private @Nullable Narrative text;
    private @Nullable List<CodeSystem_Property> property;
    private @Nullable CodesystemContent content;
    private @Nullable Boolean experimental;
    private @Nullable CodesystemStatus status;
    private @Nullable Uri implicitRules;
    private @Nullable String name;
    private @Nullable String version;
    private @Nullable Boolean caseSensitive;
    private @Nullable Boolean compositional;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Markdown copyright;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem#meta() meta} to meta.
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
     * Initializes the optional value {@link CodeSystem#meta() meta} to meta.
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
     * Initializes the optional value {@link CodeSystem#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link CodeSystem#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link CodeSystem#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link CodeSystem#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link CodeSystem#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for chained invocation
     */
    public final Builder concept(List<CodeSystem_Concept> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = Objects.requireNonNull(concept, "concept");
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("concept")
    public final Builder concept(Optional<? extends List<CodeSystem_Concept>> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = concept.orElse(null);
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CodeSystem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CodeSystem#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem#title() title} to title.
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
     * Initializes the optional value {@link CodeSystem#title() title} to title.
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
     * Initializes the optional value {@link CodeSystem#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link CodeSystem#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link CodeSystem#date() date} to date.
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
     * Initializes the optional value {@link CodeSystem#date() date} to date.
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
     * Initializes the optional value {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} to hierarchyMeaning.
     * @param hierarchyMeaning The value for hierarchyMeaning
     * @return {@code this} builder for chained invocation
     */
    public final Builder hierarchyMeaning(CodesystemHierarchymeaning hierarchyMeaning) {
      checkNotIsSet(hierarchyMeaningIsSet(), "hierarchyMeaning");
      this.hierarchyMeaning = Objects.requireNonNull(hierarchyMeaning, "hierarchyMeaning");
      optBits |= OPT_BIT_HIERARCHY_MEANING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} to hierarchyMeaning.
     * @param hierarchyMeaning The value for hierarchyMeaning
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hierarchyMeaning")
    public final Builder hierarchyMeaning(Optional<? extends CodesystemHierarchymeaning> hierarchyMeaning) {
      checkNotIsSet(hierarchyMeaningIsSet(), "hierarchyMeaning");
      this.hierarchyMeaning = hierarchyMeaning.orElse(null);
      optBits |= OPT_BIT_HIERARCHY_MEANING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#contained() contained} to contained.
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
     * Initializes the optional value {@link CodeSystem#contained() contained} to contained.
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
     * Initializes the optional value {@link CodeSystem#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSet(Canonical valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = Objects.requireNonNull(valueSet, "valueSet");
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueSet")
    public final Builder valueSet(Optional<? extends Canonical> valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = valueSet.orElse(null);
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#url() url} to url.
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
     * Initializes the optional value {@link CodeSystem#url() url} to url.
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
     * Initializes the optional value {@link CodeSystem#description() description} to description.
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
     * Initializes the optional value {@link CodeSystem#description() description} to description.
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
     * Initializes the optional value {@link CodeSystem#versionNeeded() versionNeeded} to versionNeeded.
     * @param versionNeeded The value for versionNeeded
     * @return {@code this} builder for chained invocation
     */
    public final Builder versionNeeded(boolean versionNeeded) {
      checkNotIsSet(versionNeededIsSet(), "versionNeeded");
      this.versionNeeded = versionNeeded;
      optBits |= OPT_BIT_VERSION_NEEDED;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#versionNeeded() versionNeeded} to versionNeeded.
     * @param versionNeeded The value for versionNeeded
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("versionNeeded")
    public final Builder versionNeeded(Optional<Boolean> versionNeeded) {
      checkNotIsSet(versionNeededIsSet(), "versionNeeded");
      this.versionNeeded = versionNeeded.orElse(null);
      optBits |= OPT_BIT_VERSION_NEEDED;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for chained invocation
     */
    public final Builder filter(List<CodeSystem_Filter> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = Objects.requireNonNull(filter, "filter");
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("filter")
    public final Builder filter(Optional<? extends List<CodeSystem_Filter>> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = filter.orElse(null);
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem#language() language} to language.
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
     * Initializes the optional value {@link CodeSystem#language() language} to language.
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
     * Initializes the optional value {@link CodeSystem#supplements() supplements} to supplements.
     * @param supplements The value for supplements
     * @return {@code this} builder for chained invocation
     */
    public final Builder supplements(Canonical supplements) {
      checkNotIsSet(supplementsIsSet(), "supplements");
      this.supplements = Objects.requireNonNull(supplements, "supplements");
      optBits |= OPT_BIT_SUPPLEMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#supplements() supplements} to supplements.
     * @param supplements The value for supplements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supplements")
    public final Builder supplements(Optional<? extends Canonical> supplements) {
      checkNotIsSet(supplementsIsSet(), "supplements");
      this.supplements = supplements.orElse(null);
      optBits |= OPT_BIT_SUPPLEMENTS;
      return this;
    }

    /**
     * Initializes the value for the {@link CodeSystem#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CodeSystem#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link CodeSystem#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link CodeSystem#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for chained invocation
     */
    public final Builder count(UnsignedInt count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = Objects.requireNonNull(count, "count");
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("count")
    public final Builder count(Optional<? extends UnsignedInt> count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = count.orElse(null);
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#text() text} to text.
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
     * Initializes the optional value {@link CodeSystem#text() text} to text.
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
     * Initializes the optional value {@link CodeSystem#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(List<CodeSystem_Property> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("property")
    public final Builder property(Optional<? extends List<CodeSystem_Property>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for chained invocation
     */
    public final Builder content(CodesystemContent content) {
      checkNotIsSet(contentIsSet(), "content");
      this.content = Objects.requireNonNull(content, "content");
      optBits |= OPT_BIT_CONTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("content")
    public final Builder content(Optional<? extends CodesystemContent> content) {
      checkNotIsSet(contentIsSet(), "content");
      this.content = content.orElse(null);
      optBits |= OPT_BIT_CONTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link CodeSystem#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link CodeSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CodesystemStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CodesystemStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CodeSystem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CodeSystem#name() name} to name.
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
     * Initializes the optional value {@link CodeSystem#name() name} to name.
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
     * Initializes the optional value {@link CodeSystem#version() version} to version.
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
     * Initializes the optional value {@link CodeSystem#version() version} to version.
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
     * Initializes the optional value {@link CodeSystem#caseSensitive() caseSensitive} to caseSensitive.
     * @param caseSensitive The value for caseSensitive
     * @return {@code this} builder for chained invocation
     */
    public final Builder caseSensitive(boolean caseSensitive) {
      checkNotIsSet(caseSensitiveIsSet(), "caseSensitive");
      this.caseSensitive = caseSensitive;
      optBits |= OPT_BIT_CASE_SENSITIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#caseSensitive() caseSensitive} to caseSensitive.
     * @param caseSensitive The value for caseSensitive
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("caseSensitive")
    public final Builder caseSensitive(Optional<Boolean> caseSensitive) {
      checkNotIsSet(caseSensitiveIsSet(), "caseSensitive");
      this.caseSensitive = caseSensitive.orElse(null);
      optBits |= OPT_BIT_CASE_SENSITIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for chained invocation
     */
    public final Builder compositional(boolean compositional) {
      checkNotIsSet(compositionalIsSet(), "compositional");
      this.compositional = compositional;
      optBits |= OPT_BIT_COMPOSITIONAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("compositional")
    public final Builder compositional(Optional<Boolean> compositional) {
      checkNotIsSet(compositionalIsSet(), "compositional");
      this.compositional = compositional.orElse(null);
      optBits |= OPT_BIT_COMPOSITIONAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem#contact() contact} to contact.
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
     * Initializes the optional value {@link CodeSystem#contact() contact} to contact.
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
     * Initializes the optional value {@link CodeSystem#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link CodeSystem#copyright() copyright} to copyright.
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
     * Builds a new {@link CodeSystem CodeSystem}.
     * @return An immutable instance of CodeSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CodeSystem build() {
      checkRequiredAttributes();
      return new ImmutableCodeSystem(
          meta,
          publisher,
          jurisdiction,
          concept,
          identifier,
          id,
          title,
          useContext,
          date,
          hierarchyMeaning,
          contained,
          valueSet,
          url,
          description,
          versionNeeded,
          filter,
          modifierExtension,
          extension,
          language,
          supplements,
          resourceType,
          purpose,
          count,
          text,
          property,
          content,
          experimental,
          status,
          implicitRules,
          name,
          version,
          caseSensitive,
          compositional,
          contact,
          copyright);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean conceptIsSet() {
      return (optBits & OPT_BIT_CONCEPT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean hierarchyMeaningIsSet() {
      return (optBits & OPT_BIT_HIERARCHY_MEANING) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean valueSetIsSet() {
      return (optBits & OPT_BIT_VALUE_SET) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean versionNeededIsSet() {
      return (optBits & OPT_BIT_VERSION_NEEDED) != 0;
    }

    private boolean filterIsSet() {
      return (optBits & OPT_BIT_FILTER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean supplementsIsSet() {
      return (optBits & OPT_BIT_SUPPLEMENTS) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean countIsSet() {
      return (optBits & OPT_BIT_COUNT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean contentIsSet() {
      return (optBits & OPT_BIT_CONTENT) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean caseSensitiveIsSet() {
      return (optBits & OPT_BIT_CASE_SENSITIVE) != 0;
    }

    private boolean compositionalIsSet() {
      return (optBits & OPT_BIT_COMPOSITIONAL) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CodeSystem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CodeSystem, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CodeSystem", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CodeSystem#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "CodeSystem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CodeSystem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link CodeSystem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link CodeSystem#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link CodeSystem#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link CodeSystem#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link CodeSystem#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link CodeSystem#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal concept(List<CodeSystem_Concept> concept);

    /**
     * Initializes the optional value {@link CodeSystem#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal concept(Optional<? extends List<CodeSystem_Concept>> concept);

    /**
     * Initializes the optional value {@link CodeSystem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link CodeSystem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link CodeSystem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link CodeSystem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link CodeSystem#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link CodeSystem#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link CodeSystem#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link CodeSystem#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link CodeSystem#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link CodeSystem#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} to hierarchyMeaning.
     * @param hierarchyMeaning The value for hierarchyMeaning
     * @return {@code this} builder for chained invocation
     */
    BuildFinal hierarchyMeaning(CodesystemHierarchymeaning hierarchyMeaning);

    /**
     * Initializes the optional value {@link CodeSystem#hierarchyMeaning() hierarchyMeaning} to hierarchyMeaning.
     * @param hierarchyMeaning The value for hierarchyMeaning
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal hierarchyMeaning(Optional<? extends CodesystemHierarchymeaning> hierarchyMeaning);

    /**
     * Initializes the optional value {@link CodeSystem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link CodeSystem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link CodeSystem#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueSet(Canonical valueSet);

    /**
     * Initializes the optional value {@link CodeSystem#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueSet(Optional<? extends Canonical> valueSet);

    /**
     * Initializes the optional value {@link CodeSystem#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link CodeSystem#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link CodeSystem#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link CodeSystem#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link CodeSystem#versionNeeded() versionNeeded} to versionNeeded.
     * @param versionNeeded The value for versionNeeded
     * @return {@code this} builder for chained invocation
     */
    BuildFinal versionNeeded(boolean versionNeeded);

    /**
     * Initializes the optional value {@link CodeSystem#versionNeeded() versionNeeded} to versionNeeded.
     * @param versionNeeded The value for versionNeeded
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal versionNeeded(Optional<Boolean> versionNeeded);

    /**
     * Initializes the optional value {@link CodeSystem#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal filter(List<CodeSystem_Filter> filter);

    /**
     * Initializes the optional value {@link CodeSystem#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal filter(Optional<? extends List<CodeSystem_Filter>> filter);

    /**
     * Initializes the optional value {@link CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CodeSystem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CodeSystem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CodeSystem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link CodeSystem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link CodeSystem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link CodeSystem#supplements() supplements} to supplements.
     * @param supplements The value for supplements
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supplements(Canonical supplements);

    /**
     * Initializes the optional value {@link CodeSystem#supplements() supplements} to supplements.
     * @param supplements The value for supplements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supplements(Optional<? extends Canonical> supplements);

    /**
     * Initializes the optional value {@link CodeSystem#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link CodeSystem#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link CodeSystem#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for chained invocation
     */
    BuildFinal count(UnsignedInt count);

    /**
     * Initializes the optional value {@link CodeSystem#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal count(Optional<? extends UnsignedInt> count);

    /**
     * Initializes the optional value {@link CodeSystem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link CodeSystem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link CodeSystem#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    BuildFinal property(List<CodeSystem_Property> property);

    /**
     * Initializes the optional value {@link CodeSystem#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal property(Optional<? extends List<CodeSystem_Property>> property);

    /**
     * Initializes the optional value {@link CodeSystem#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for chained invocation
     */
    BuildFinal content(CodesystemContent content);

    /**
     * Initializes the optional value {@link CodeSystem#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal content(Optional<? extends CodesystemContent> content);

    /**
     * Initializes the optional value {@link CodeSystem#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link CodeSystem#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link CodeSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(CodesystemStatus status);

    /**
     * Initializes the optional value {@link CodeSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends CodesystemStatus> status);

    /**
     * Initializes the optional value {@link CodeSystem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link CodeSystem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link CodeSystem#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link CodeSystem#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link CodeSystem#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link CodeSystem#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link CodeSystem#caseSensitive() caseSensitive} to caseSensitive.
     * @param caseSensitive The value for caseSensitive
     * @return {@code this} builder for chained invocation
     */
    BuildFinal caseSensitive(boolean caseSensitive);

    /**
     * Initializes the optional value {@link CodeSystem#caseSensitive() caseSensitive} to caseSensitive.
     * @param caseSensitive The value for caseSensitive
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal caseSensitive(Optional<Boolean> caseSensitive);

    /**
     * Initializes the optional value {@link CodeSystem#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for chained invocation
     */
    BuildFinal compositional(boolean compositional);

    /**
     * Initializes the optional value {@link CodeSystem#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal compositional(Optional<Boolean> compositional);

    /**
     * Initializes the optional value {@link CodeSystem#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link CodeSystem#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link CodeSystem#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link CodeSystem#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Builds a new {@link CodeSystem CodeSystem}.
     * @return An immutable instance of CodeSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CodeSystem build();
  }
}
